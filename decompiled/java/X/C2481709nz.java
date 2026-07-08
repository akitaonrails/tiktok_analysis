package X;

import android.content.Context;
import android.util.Log;
import android.view.ContextThemeWrapper;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09nz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2481709nz extends ContextThemeWrapper {
    public final Context LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C2481709nz(Context context) {
        super(context, R.style.hk);
        this.LIZ = context;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper
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

    public final boolean equals(Object obj) {
        C2481709nz c2481709nz;
        if (this == obj) {
            return true;
        }
        Class<?> cls = null;
        if (obj != null) {
            cls = obj.getClass();
        }
        if (!Intrinsics.LJFF(C2481709nz.class, cls) || !(obj instanceof C2481709nz) || (c2481709nz = (C2481709nz) obj) == null) {
            return false;
        }
        return Intrinsics.LJFF(this.LIZ, c2481709nz.LIZ);
    }
}
