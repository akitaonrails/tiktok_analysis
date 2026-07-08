package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0VT5, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VT5 {
    public static volatile C0VT5 LJFF;
    public final Context LIZ;
    public C0VT4 LIZIZ;
    public float LIZJ;
    public boolean LIZLLL;
    public final List<C0VT6> LJ = new ArrayList();

    public static C0VT5 LIZ() {
        if (LJFF == null) {
            synchronized (C0VT5.class) {
                try {
                    if (LJFF == null) {
                        C844470XAv.LIZ.getClass();
                        LJFF = new C0VT5(C844470XAv.LIZ());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJFF;
    }

    public C0VT5(Context context) {
        this.LIZ = context;
    }

    public final synchronized void LIZIZ(C0VT6 c0vt6) {
        if (((ArrayList) this.LJ).contains(c0vt6)) {
            return;
        }
        c0vt6.LIZ(this.LIZLLL);
        ((ArrayList) this.LJ).add(c0vt6);
    }

    public final void LIZJ(Intent intent) {
        boolean z;
        this.LIZJ = (intent.getIntExtra("level", -1) / intent.getIntExtra("scale", -1)) * 100.0f;
        int intExtra = intent.getIntExtra(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, -1);
        if (intExtra != 2 && intExtra != 5) {
            z = false;
        } else {
            z = true;
        }
        if (this.LIZLLL != z) {
            Iterator it2 = ((ArrayList) this.LJ).iterator();
            while (it2.hasNext()) {
                ((C0VT6) it2.next()).LIZ(z);
            }
        }
        this.LIZLLL = z;
    }
}
