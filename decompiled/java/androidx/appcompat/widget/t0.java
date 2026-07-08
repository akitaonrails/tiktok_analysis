package androidx.appcompat.widget;

import X.C20144113rr;
import X.C2188811AlT;
import X.C817700W5w;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.util.Log;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes31.dex */
public class t0 extends ContextWrapper {
    public static final Object LIZ = new Object();

    public t0() {
        throw null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        return super.getTheme();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        throw null;
    }

    public static void LIZ(Context context) {
        if (!(context instanceof t0) && !(context.getResources() instanceof C20144113rr)) {
            context.getResources();
        }
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
    public final void setTheme(int i) {
        super.setTheme(i);
    }
}
