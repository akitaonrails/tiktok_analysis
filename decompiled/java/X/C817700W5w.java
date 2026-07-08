package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0W5w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C817700W5w extends ContextWrapper {
    public final C817670W5t LIZ;

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return this.LIZ;
    }

    public final Context LIZ(Configuration configuration) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(", superCreateConfigurationContext resource: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", assert:");
        sbLIZ.append(this.LIZ.getAssets());
        C2188811AlT.LIZIZ(sbLIZ);
        Context contextCreateConfigurationContext = super.createConfigurationContext(configuration);
        Function1<? super Context, Unit> function1 = NxRewordManager.LJIILJJIL;
        if (function1 != null) {
            function1.invoke(contextCreateConfigurationContext);
        }
        return contextCreateConfigurationContext;
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createConfigurationContext(Configuration configuration) {
        return new C817700W5w(super.createConfigurationContext(configuration), false);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (Intrinsics.LJFF(str, "layout_inflater")) {
            Object systemService = super.getSystemService(str);
            if (systemService != null) {
                return new C0J4J(this, (LayoutInflater) systemService);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
        }
        return super.getSystemService(str);
    }

    public C817700W5w(Context context, boolean z) {
        super(context);
        C817670W5t c817670W5t = new C817670W5t(context.getResources(), NxRewordManager.LIZIZ(), new WeakReference(this), z);
        this.LIZ = c817670W5t;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NxContext init start ");
        sbLIZ.append(this);
        sbLIZ.append(", install aab, resource: ");
        sbLIZ.append(c817670W5t);
        sbLIZ.append(", asset:");
        sbLIZ.append(c817670W5t.getAssets());
        C2188811AlT.LIZIZ(sbLIZ);
        Function1<? super Context, Unit> function1 = NxRewordManager.LJIILJJIL;
        if (function1 != null) {
            function1.invoke(this);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("NxContext init finish ");
        sbLIZ2.append(this);
        sbLIZ2.append(", install aab, resource: ");
        sbLIZ2.append(c817670W5t);
        sbLIZ2.append(", asset:");
        sbLIZ2.append(c817670W5t.getAssets());
        C2188811AlT.LIZIZ(sbLIZ2);
    }
}
