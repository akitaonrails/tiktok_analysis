package X;

import Y.AAListenerS335S0100000_25;
import Y.AObjectS246S0100000_25;
import android.animation.AnimatorSet;
import android.view.View;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS75S1000000_25;
import kotlin.jvm.internal.Intrinsics;
import lth.o;
import nv7.c0;

/* JADX INFO: renamed from: X.0t15, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1649130t15 extends C1649170t19 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFFI;
    public static final int LLLFZ;
    public final InterfaceC1731706qJ LLL;
    public String LLLF;
    public final InterfaceC1731706qJ LLLFF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1649130t15.class, "shootModeSwitchApiComponent", "getShootModeSwitchApiComponent()Lcom/ss/android/ugc/aweme/social/creation/record/bottom/ShootModeSwitchApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1649130t15.class, "revealFakeDualCameraApi", "getRevealFakeDualCameraApi()Lcom/ss/android/ugc/aweme/social/creation/record/biz/reveal/camera/RevealFakeDualCameraShootApi;", 0);
        c09r3.getClass();
        LLLFFI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLLFZ = 8;
    }

    @Override // X.C1649170t19
    public boolean D5(String str) {
        return false;
    }

    @Override // X.C1649170t19
    public String t5(String str) {
        return str;
    }

    private final InterfaceC1648820t0a T6() {
        return (InterfaceC1648820t0a) this.LLLFF.getValue(this, LLLFFI[1]);
    }

    private final InterfaceC1653800t8c W6() {
        return (InterfaceC1653800t8c) this.LLL.getValue(this, LLLFFI[0]);
    }

    @Override // X.C1649170t19, ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        W6().getBottomTabIndexChangeEvent().LIZ(this, new AObjectS246S0100000_25(this, 251));
    }

    @Override // X.C1649170t19
    public AnimatorSet H5(C1649150t17 c1649150t17) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new InterpolatorC420870Ger(0.25d, 0.1d, 0.1d));
        animatorSet.addListener(new AAListenerS335S0100000_25(c1649150t17, 2));
        return animatorSet;
    }

    @Override // X.C1649170t19
    public boolean K6(String str) {
        if (!C13LP.LJJJJ(str, C13LQ.LJLIIL(new String[]{EnumC1647570syZ.LIVE.getTag(), EnumC1647570syZ.AI_SELF.getTag()})) || !D5(str)) {
            return false;
        }
        return true;
    }

    public final float P6(float f) {
        C844470XAv.LIZ.getClass();
        return (C844470XAv.LIZ().getResources().getDisplayMetrics().density * f) + 0.5f;
    }

    public final float S6(int i) {
        return P6(i);
    }

    public C1649130t15(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1653800t8c.class, null);
        this.LLLFF = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648820t0a.class, null);
    }

    @Override // X.C1649170t19
    public boolean C5(String str, String str2) {
        EnumC1285050jXr enumC1285050jXrLIZ;
        EnumC1285050jXr enumC1285050jXrLIZ2 = null;
        if (str != null) {
            C1653070t7R.Companion.getClass();
            enumC1285050jXrLIZ = C1649140t16.LIZ(str);
        } else {
            enumC1285050jXrLIZ = null;
        }
        if (str2 != null) {
            C1653070t7R.Companion.getClass();
            enumC1285050jXrLIZ2 = C1649140t16.LIZ(str2);
        }
        if (enumC1285050jXrLIZ != enumC1285050jXrLIZ2) {
            return true;
        }
        return false;
    }

    @Override // X.C1649170t19
    public boolean F4(String str, String str2) {
        List listLJIIJJI = C1697810uHb.LJIIJJI(str, str2);
        C1660390tJF.LLJLIL.getClass();
        return true ^ C13LP.LJJL(listLJIIJJI, Collections.singleton(C1660390tJF.LLJZIJLIL)).isEmpty();
    }

    @Override // X.C1649170t19
    public float M5(View view, C1649150t17 c1649150t17) {
        int i;
        String str = c1649150t17.LIZLLL;
        C1660390tJF.LLJLIL.getClass();
        if (Intrinsics.LJFF(str, C1660390tJF.LLJZIJLIL)) {
            InterfaceC1648820t0a interfaceC1648820t0aT6 = T6();
            if (interfaceC1648820t0aT6 != null) {
                interfaceC1648820t0aT6.yI0(view);
            }
            return P6(40.0f);
        }
        if (c1649150t17.LIZIZ == EnumC1448590nnd.RATIO_9_16) {
            c0 c0Var = c0.LIZ;
            C1443590nfZ c1443590nfZ = o.LJIIJJI;
            c1443590nfZ.LIZ();
            int i2 = c1443590nfZ.LIZ;
            C1443590nfZ c1443590nfZ2 = o.LJIIJJI;
            c1443590nfZ2.LIZ();
            c0Var.q2(i2, c1443590nfZ2.LIZIZ, view);
            return C418440Gaw.LIZIZ(Float.valueOf(20.0f));
        }
        C1646160swI c1646160swI = EnumC1647570syZ.Companion;
        String str2 = c1649150t17.LIZLLL;
        c1646160swI.getClass();
        if (C1646160swI.LIZIZ(str2)) {
            C578880Mn8.LIZ(view);
            i = view.getLayoutParams().width;
        } else if (Intrinsics.LJFF(c1649150t17.LIZLLL, EnumC1647570syZ.PHOTO_SWAP.getTag())) {
            C1461700o8m.LIZIZ(view);
            i = view.getLayoutParams().width;
        } else {
            return 0.0f;
        }
        return i * 0.08f;
    }

    @Override // X.C1649170t19
    public float N5(View view, C1649150t17 c1649150t17) {
        int i;
        String str = c1649150t17.LJ;
        C1660390tJF.LLJLIL.getClass();
        if (Intrinsics.LJFF(str, C1660390tJF.LLJZIJLIL)) {
            InterfaceC1648820t0a interfaceC1648820t0aT6 = T6();
            if (interfaceC1648820t0aT6 != null) {
                interfaceC1648820t0aT6.yI0(view);
            }
            return P6(40.0f);
        }
        if (c1649150t17.LIZJ == EnumC1448590nnd.RATIO_9_16) {
            c0 c0Var = c0.LIZ;
            C1443590nfZ c1443590nfZ = o.LJIIJJI;
            c1443590nfZ.LIZ();
            int i2 = c1443590nfZ.LIZ;
            C1443590nfZ c1443590nfZ2 = o.LJIIJJI;
            c1443590nfZ2.LIZ();
            c0Var.q2(i2, c1443590nfZ2.LIZIZ, view);
            if (!Intrinsics.LJFF(c1649150t17.LJ, EnumC1647570syZ.LIVE.getTag())) {
                return C418440Gaw.LIZIZ(Float.valueOf(20.0f));
            }
            return 0.0f;
        }
        C1646160swI c1646160swI = EnumC1647570syZ.Companion;
        String str2 = c1649150t17.LJ;
        c1646160swI.getClass();
        if (C1646160swI.LIZIZ(str2)) {
            C578880Mn8.LIZ(view);
            i = view.getLayoutParams().width;
        } else if (Intrinsics.LJFF(c1649150t17.LJ, EnumC1647570syZ.PHOTO_SWAP.getTag())) {
            C1461700o8m.LIZIZ(view);
            i = view.getLayoutParams().width;
        } else {
            return 0.0f;
        }
        return i * 0.08f;
    }

    @Override // X.C1649170t19
    public boolean E5(EnumC1448590nnd enumC1448590nnd, EnumC1448590nnd enumC1448590nnd2, String str, String str2) {
        return super.E5(enumC1448590nnd, enumC1448590nnd2, str, str2);
    }

    @Override // X.C1649170t19
    public Object U5(String str, EnumC1448590nnd enumC1448590nnd, boolean z, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        if (T6() != null) {
            C1660390tJF.LLJLIL.getClass();
            if (Intrinsics.LJFF(str, C1660390tJF.LLJZIJLIL)) {
                InterfaceC1648820t0a interfaceC1648820t0aT6 = T6();
                if (interfaceC1648820t0aT6 != null) {
                    interfaceC1648820t0aT6.yI0(getCameraApiComponent().fF2());
                }
                return true;
            }
        }
        return super.U5(str, enumC1448590nnd, z, interfaceC1364105Vn);
    }

    @Override // X.C1649170t19, X.InterfaceC1646220swO
    public boolean uF2(int i, String str, String str2, EnumC2008807tu enumC2008807tu) {
        boolean zUF2 = super.uF2(i, str, str2, enumC2008807tu);
        if (getDiContainer().LIZJ(InterfaceC1653800t8c.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1653800t8c.class, new AwS75S1000000_25(str2, 5));
        }
        return zUF2;
    }
}
