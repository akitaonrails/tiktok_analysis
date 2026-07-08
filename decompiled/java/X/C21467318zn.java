package X;

import android.transition.Transition;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.18zn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21467318zn extends C21467518zp {
    public final Object LIZIZ;
    public final boolean LIZJ;
    public final Object LIZLLL;

    public final AbstractC21466418ze LIZIZ() {
        AbstractC21466418ze abstractC21466418zeLIZJ = LIZJ(this.LIZIZ);
        AbstractC21466418ze abstractC21466418zeLIZJ2 = LIZJ(this.LIZLLL);
        if (abstractC21466418zeLIZJ == null) {
            return abstractC21466418zeLIZJ2;
        }
        if (abstractC21466418zeLIZJ2 == null || abstractC21466418zeLIZJ == abstractC21466418zeLIZJ2) {
            return abstractC21466418zeLIZJ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
        sbLIZ.append(this.LIZ.LIZJ);
        sbLIZ.append(" returned Transition ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" which uses a different Transition  type than its shared element transition ");
        sbLIZ.append(this.LIZLLL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public final AbstractC21466418ze LIZJ(Object obj) {
        if (obj == null) {
            return null;
        }
        AnonymousClass1904 anonymousClass1904 = C20302914cN.LIZ;
        if (anonymousClass1904 != null && (obj instanceof Transition)) {
            return anonymousClass1904;
        }
        AbstractC21466418ze abstractC21466418ze = C20302914cN.LIZIZ;
        if (abstractC21466418ze != null && abstractC21466418ze.canHandle(obj)) {
            return abstractC21466418ze;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Transition ");
        sbLIZ.append(obj);
        sbLIZ.append(" for fragment ");
        sbLIZ.append(this.LIZ.LIZJ);
        sbLIZ.append(" is not a valid framework Transition or AndroidX Transition");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C21467318zn(C21468018zu c21468018zu, boolean z, boolean z2) {
        Object exitTransition;
        boolean allowEnterTransitionOverlap;
        Object sharedElementEnterTransition;
        super(c21468018zu);
        EnumC21467818zs enumC21467818zs = c21468018zu.LIZ;
        EnumC21467818zs enumC21467818zs2 = EnumC21467818zs.VISIBLE;
        if (enumC21467818zs == enumC21467818zs2) {
            Fragment fragment = c21468018zu.LIZJ;
            if (z) {
                exitTransition = fragment.getReenterTransition();
            } else {
                exitTransition = fragment.getEnterTransition();
            }
        } else {
            Fragment fragment2 = c21468018zu.LIZJ;
            if (z) {
                exitTransition = fragment2.getReturnTransition();
            } else {
                exitTransition = fragment2.getExitTransition();
            }
        }
        this.LIZIZ = exitTransition;
        if (c21468018zu.LIZ == enumC21467818zs2) {
            if (z) {
                allowEnterTransitionOverlap = c21468018zu.LIZJ.getAllowReturnTransitionOverlap();
            } else {
                allowEnterTransitionOverlap = c21468018zu.LIZJ.getAllowEnterTransitionOverlap();
            }
        } else {
            allowEnterTransitionOverlap = true;
        }
        this.LIZJ = allowEnterTransitionOverlap;
        if (z2) {
            if (z) {
                sharedElementEnterTransition = c21468018zu.LIZJ.getSharedElementReturnTransition();
            } else {
                sharedElementEnterTransition = c21468018zu.LIZJ.getSharedElementEnterTransition();
            }
        } else {
            sharedElementEnterTransition = null;
        }
        this.LIZLLL = sharedElementEnterTransition;
    }
}
