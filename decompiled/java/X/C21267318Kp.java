package X;

import android.animation.Animator;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.18Kp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21267318Kp {
    public static final /* synthetic */ int LJ = 0;
    public final ArrayList<Animator> LIZ = new ArrayList<>();
    public List<? extends View> LIZIZ;
    public EnumC21519819Js LIZJ;
    public float LIZLLL;

    public final void LIZ(boolean z) {
        if (!this.LIZ.isEmpty()) {
            ArrayList<Animator> arrayList = new ArrayList(this.LIZ);
            this.LIZ.clear();
            for (Animator animator : arrayList) {
                animator.removeAllListeners();
                try {
                    animator.cancel();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        List<? extends View> list = this.LIZIZ;
        EnumC21519819Js enumC21519819Js = this.LIZJ;
        if (z && list != null && enumC21519819Js != null) {
            Iterator<? extends View> it2 = list.iterator();
            while (it2.hasNext()) {
                enumC21519819Js.set(it2.next(), this.LIZLLL);
            }
        }
        this.LIZIZ = null;
    }
}
