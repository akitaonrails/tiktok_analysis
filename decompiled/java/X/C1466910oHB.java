package X;

import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewScene;
import com.ss.android.ugc.aweme.social.creation.edit.SocialVideoEditContainerScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0oHB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466910oHB implements InterfaceC1737690vJv {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ boolean onBackPressed$6(C1466910oHB c1466910oHB) {
        return ((Boolean) ((Function0) c1466910oHB.l0).invoke()).booleanValue();
    }

    @Override // X.InterfaceC1737690vJv
    public final boolean onBackPressed() {
        switch (this.$t) {
            case 0:
                return onBackPressed$0(this);
            case 1:
                return onBackPressed$1(this);
            case 2:
                return onBackPressed$2(this);
            case 3:
                return onBackPressed$3(this);
            case 4:
                return onBackPressed$4(this);
            case 5:
                return onBackPressed$5(this);
            case 6:
                return onBackPressed$6(this);
            default:
                return false;
        }
    }

    public static final boolean onBackPressed$0(C1466910oHB c1466910oHB) {
        ((C1427290nFH) c1466910oHB.l0).LLLLIL().LIZ.invoke();
        return true;
    }

    public static final boolean onBackPressed$1(C1466910oHB c1466910oHB) {
        boolean z = false;
        if (!((C1409900mnE) c1466910oHB.l0).isVisible()) {
            return false;
        }
        Function1<Boolean, Unit> function1 = ((C1409900mnE) c1466910oHB.l0).LLLLIL().LIZLLL;
        C1415620mwS c1415620mwS = ((C1409900mnE) c1466910oHB.l0).LLJJJJ;
        if (c1415620mwS != null && c1415620mwS.getSelectState()) {
            z = true;
        }
        function1.invoke(Boolean.valueOf(z));
        return true;
    }

    public static final boolean onBackPressed$2(C1466910oHB c1466910oHB) {
        ((VEVideoPublishPreviewScene) c1466910oHB.l0).LLLLLLZ(true);
        return false;
    }

    public static final boolean onBackPressed$3(C1466910oHB c1466910oHB) {
        ((SocialVideoEditContainerScene) c1466910oHB.l0).onBackPressed();
        return true;
    }

    public static final boolean onBackPressed$4(C1466910oHB c1466910oHB) {
        if (!((C1465200oEQ) c1466910oHB.l0).LLLIL().LJIIIZ()) {
            C1462460oA0.LIZ(((C1465200oEQ) c1466910oHB.l0).LLLIILIL(), false, 0L, 6);
            return true;
        }
        return true;
    }

    public static final boolean onBackPressed$5(C1466910oHB c1466910oHB) {
        boolean z;
        boolean z2 = false;
        if (!((C1421180n5Q) c1466910oHB.l0).isVisible()) {
            return false;
        }
        C1421180n5Q c1421180n5Q = (C1421180n5Q) c1466910oHB.l0;
        C1421110n5J c1421110n5J = c1421180n5Q.LLJJJJ;
        if (c1421110n5J != null && c1421110n5J.getSelectState()) {
            z = true;
        } else {
            z = false;
        }
        c1421180n5Q.LLLLLL(z);
        Function1<Boolean, Unit> function1 = ((C1421180n5Q) c1466910oHB.l0).LLLLIL().LJ;
        C1421110n5J c1421110n5J2 = ((C1421180n5Q) c1466910oHB.l0).LLJJJJ;
        if (c1421110n5J2 != null && c1421110n5J2.getSelectState()) {
            z2 = true;
        }
        function1.invoke(Boolean.valueOf(z2));
        return true;
    }

    public C1466910oHB(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
