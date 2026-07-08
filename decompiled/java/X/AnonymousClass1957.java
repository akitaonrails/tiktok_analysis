package X;

import android.animation.Animator;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.1957, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1957 {
    public static final void LIZ(C195F... c195fArr) {
        ArrayList<C195F> arrayList = (ArrayList) C13LQ.LJIJI(c195fArr);
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Long lValueOf = Long.valueOf(((C195F) it2.next()).LIZLLL());
            while (it2.hasNext()) {
                Long lValueOf2 = Long.valueOf(((C195F) it2.next()).LIZLLL());
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            if (lValueOf != null) {
                for (C195F c195f : arrayList) {
                    if (c195f.LIZLLL() != lValueOf.longValue()) {
                        long jLongValue = lValueOf.longValue();
                        Animation animation = c195f.LIZ;
                        if (animation != null) {
                            animation.setDuration(jLongValue);
                        } else {
                            Animator animator = c195f.LIZIZ;
                            if (animator != null) {
                                animator.setDuration(jLongValue);
                            } else {
                                throw new IllegalStateException("Animation or Animator not found");
                            }
                        }
                    }
                }
            }
        }
    }
}
