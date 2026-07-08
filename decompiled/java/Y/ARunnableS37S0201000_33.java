package Y;

import X.C19P4;
import X.C19P5;
import X.C19P8;
import X.C1A6K;
import X.C1C7U;
import X.C21644419nG;
import X.C21663019qG;
import X.C21663119qH;
import X.C21694119vH;
import X.C2179971ATj;
import X.C786410Ut5;
import android.view.View;
import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.behavior.TopSheetBehavior;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ttvecamera.b0;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes34.dex */
public class ARunnableS37S0201000_33 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZ$0() {
        if (((C1A6K) this.l1).LJIILIIL()) {
            return;
        }
        if (((C1A6K) this.l1).LLJJ.LJ()) {
            ((C1A6K) this.l1).LJFF();
        } else {
            C1A6K c1a6k = (C1A6K) this.l1;
            c1a6k.LLJJ.LJII(this.i2, c1a6k.LLILZ.LIZ, c1a6k.LL, c1a6k.LLJJIJIL);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZ$1() {
        if (((C1A6K) this.l1).LJIILIIL()) {
            return;
        }
        if (((C1A6K) this.l1).LLJJ.LJ()) {
            ((C1A6K) this.l1).LJFF();
        } else {
            C1A6K c1a6k = (C1A6K) this.l1;
            c1a6k.LLJJ.LJI(this.i2, c1a6k.LLILZ.LIZ, c1a6k.LL, c1a6k.LLJJIJIL);
        }
    }

    public final void LIZ$2() {
        C21663119qH c21663119qH = (C21663119qH) this.l0;
        if (c21663119qH.LLJJ) {
            return;
        }
        int size = c21663119qH.LLJ.size();
        int i = this.i2;
        if (size > i) {
            C21694119vH c21694119vH = (C21694119vH) this.l1;
            PhotoModeImageUrlModel photoModeImageUrlModel = (PhotoModeImageUrlModel) ListProtector.get(((C21663119qH) this.l0).LLJ, i);
            C21663119qH c21663119qH2 = (C21663119qH) this.l0;
            c21694119vH.LJIILLIIL(photoModeImageUrlModel, c21663119qH2.LLJI, c21663119qH2.LLJIJIL, c21663119qH2.LLJILLL, this.i2, c21663119qH2.LLILZ);
        }
    }

    public final void LIZ$3() {
        C21663019qG c21663019qG = (C21663019qG) this.l0;
        if (c21663019qG.LLJJ) {
            return;
        }
        int size = c21663019qG.LLJ.size();
        int i = this.i2;
        if (size > i) {
            C21694119vH c21694119vH = (C21694119vH) this.l1;
            PhotoModeImageUrlModel photoModeImageUrlModel = (PhotoModeImageUrlModel) ListProtector.get(((C21663019qG) this.l0).LLJ, i);
            C21663019qG c21663019qG2 = (C21663019qG) this.l0;
            c21694119vH.LJIILLIIL(photoModeImageUrlModel, c21663019qG2.LLJI, c21663019qG2.LLJIJIL, c21663019qG2.LLJILLL, this.i2, c21663019qG2.LLILZ);
        }
    }

    public static final void run$0(ARunnableS37S0201000_33 aRunnableS37S0201000_33) {
        try {
            BiometricViewModel biometricViewModel = (BiometricViewModel) aRunnableS37S0201000_33.l0;
            if (biometricViewModel.LLILLJJLI == null) {
                biometricViewModel.LLILLJJLI = new C21644419nG();
            }
            biometricViewModel.LLILLJJLI.LIZ(aRunnableS37S0201000_33.i2, (CharSequence) aRunnableS37S0201000_33.l1);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$1(ARunnableS37S0201000_33 aRunnableS37S0201000_33) {
        ((BiometricFragment) aRunnableS37S0201000_33.l0).UR(aRunnableS37S0201000_33.i2, (CharSequence) aRunnableS37S0201000_33.l1);
    }

    public static final void run$2(ARunnableS37S0201000_33 aRunnableS37S0201000_33) {
        boolean zLIZ;
        C1C7U.LIZ("TopSheetBehavior@52f8.settleToStatePendingLayout$1");
        try {
            ((TopSheetBehavior) aRunnableS37S0201000_33.l0).settleToState((View) aRunnableS37S0201000_33.l1, aRunnableS37S0201000_33.i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TopSheetBehavior@52f8.settleToStatePendingLayout$1");
    }

    public static final void run$3(ARunnableS37S0201000_33 aRunnableS37S0201000_33) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.changeRecorderState$1");
        try {
            ((b0) aRunnableS37S0201000_33.l1).changeRecorderState((TECameraCapture) aRunnableS37S0201000_33.l0, aRunnableS37S0201000_33.i2, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.changeRecorderState$1");
    }

    public static final void run$4(ARunnableS37S0201000_33 aRunnableS37S0201000_33) {
        C19P5 c19p5 = (C19P5) aRunnableS37S0201000_33.l0;
        int i = aRunnableS37S0201000_33.i2;
        C19P8 c19p8 = (C19P8) aRunnableS37S0201000_33.l1;
        c19p5.getClass();
        C1C7U.LIZ("AdjustPercentBar@3327.setOnLevelChangeListener$1$onChanged$1L");
        C19P4 c19p4 = c19p5.LIZIZ;
        c19p4.LLLLILI.removeCallbacks(c19p4.LLLLJ);
        C19P4 c19p42 = c19p5.LIZIZ;
        if (c19p42.LLLLIILL != null && i == c19p42.LLLIZZ) {
            C786410Ut5.LJLIIL(100L, c19p42.LLLLILI, c19p42.LLLLJ);
        }
        c19p8.LIZJ(i);
        C1C7U.LIZIZ("AdjustPercentBar@3327.setOnLevelChangeListener$1$onChanged$1L");
    }

    public static final void run$5(ARunnableS37S0201000_33 aRunnableS37S0201000_33) {
        try {
            aRunnableS37S0201000_33.LIZ$0();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$6(ARunnableS37S0201000_33 aRunnableS37S0201000_33) {
        try {
            aRunnableS37S0201000_33.LIZ$1();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$7(ARunnableS37S0201000_33 aRunnableS37S0201000_33) {
        VerticalViewPager verticalViewPager = (VerticalViewPager) aRunnableS37S0201000_33.l0;
        int i = aRunnableS37S0201000_33.i2;
        Object obj = aRunnableS37S0201000_33.l1;
        int[] iArr = VerticalViewPager.a;
        verticalViewPager.getClass();
        C1C7U.LIZ("VerticalViewPager@894f.populate$1L");
        verticalViewPager.LLJJI.LJIIZILJ(verticalViewPager, i, obj);
        C1C7U.LIZIZ("VerticalViewPager@894f.populate$1L");
    }

    public static final void run$8(ARunnableS37S0201000_33 aRunnableS37S0201000_33) {
        boolean zLIZ;
        C1C7U.LIZ("LoopPhotoSlidesAdapter@57f.getView$1");
        try {
            aRunnableS37S0201000_33.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LoopPhotoSlidesAdapter@57f.getView$1");
    }

    public static final void run$9(ARunnableS37S0201000_33 aRunnableS37S0201000_33) {
        boolean zLIZ;
        C1C7U.LIZ("PhotoSlidesAdapter@3529.getView$2");
        try {
            aRunnableS37S0201000_33.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhotoSlidesAdapter@3529.getView$2");
    }

    public ARunnableS37S0201000_33(Object obj, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
    }
}
