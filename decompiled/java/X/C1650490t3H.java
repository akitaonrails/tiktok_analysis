package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import iyl.i3;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0t3H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1650490t3H extends AbstractC1651430t4n {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C1664750tQH LLILZLL;
    public final C1664750tQH LLIZ;
    public final C1664740tQG LLIZLLLIL;
    public final EnumC1651770t5L LLJ;
    public final AwS569S0100000_25 LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1650490t3H.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1650490t3H.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1650490t3H.class, "changeCameraSpecApiComponent", "getChangeCameraSpecApiComponent()Lcom/ss/android/ugc/aweme/changemode/ChangeCameraSpecApiComponent;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public final C19EG LJIJJLI() {
        return (C19EG) this.LLILZLL.getValue(this, LLJIJIL[0]);
    }

    @Override // X.AbstractC1651450t4p
    public final Function0<i3> LJI() {
        return this.LLJI;
    }

    @Override // X.AbstractC1651450t4p
    public final EnumC1651770t5L LJIIIZ() {
        return this.LLJ;
    }

    public C1650490t3H(C1DRG c1drg) {
        super(c1drg);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, C19EG.class, null);
        this.LLIZ = C1664770tQJ.LIZ(c1drg, InterfaceC1650230t2r.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1646220swO.class, null);
        this.LLJ = EnumC1651770t5L.CHANGE_RATIO;
        this.LLJI = new AwS569S0100000_25(this, 799);
    }

    @Override // X.AbstractC1651430t4n, X.InterfaceC1659130tHD
    public final /* bridge */ /* synthetic */ void LIZ(C1654400t9a c1654400t9a, Object obj) {
        LIZ(c1654400t9a, (i3) obj);
    }

    @Override // X.AbstractC1651430t4n
    /* JADX INFO: renamed from: LJIJ */
    public final void LIZ(C1654400t9a c1654400t9a, i3 i3Var) {
        Pair<Boolean, EnumC1448590nnd> pair;
        EnumC1448590nnd enumC1448590nndLIZJ;
        C385670FAf<EnumC1448590nnd> c385670FAfDk;
        super.LIZ(c1654400t9a, i3Var);
        C1664740tQG c1664740tQG = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        int i = 2;
        InterfaceC1646220swO interfaceC1646220swO = (InterfaceC1646220swO) c1664740tQG.getValue(this, interfaceC2217461BqaArr[2]);
        if (interfaceC1646220swO == null || (pair = interfaceC1646220swO.l52()) == null) {
            pair = new Pair<>(Boolean.FALSE, EnumC1448590nnd.RATIO_9_16);
        }
        boolean zBooleanValue = pair.getFirst().booleanValue();
        EnumC1448590nnd second = pair.getSecond();
        if (zBooleanValue) {
            C1650550t3N c1650550t3N = C1650550t3N.LIZ;
            ShortVideoContext shortVideoContextLJIIL = LJIIL();
            InterfaceC1646220swO interfaceC1646220swO2 = (InterfaceC1646220swO) this.LLIZLLLIL.getValue(this, interfaceC2217461BqaArr[2]);
            if (interfaceC1646220swO2 == null || (c385670FAfDk = interfaceC1646220swO2.dk()) == null || (enumC1448590nndLIZJ = c385670FAfDk.LIZJ()) == null) {
                enumC1448590nndLIZJ = EnumC1448590nnd.RATIO_9_16;
            }
            boolean zUe = ((InterfaceC1650190t2n) this.LLIZ.getValue(this, interfaceC2217461BqaArr[1])).Ue();
            c1650550t3N.getClass();
            C1650550t3N.LIZIZ(shortVideoContextLJIIL, enumC1448590nndLIZJ, second, zUe);
            int i2 = C1448600nne.LIZ[second.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    i = -1;
                } else {
                    i = 1;
                }
            }
            ((Keva) C1650480t3G.LIZ.getValue()).storeInt("default_camera_type", i);
            LJIIJJI(new AwS391S0200000_25(second, this, 202));
            C0T6J.LIZ(c1654400t9a.LIZ, AFwS214S0000000_25.get$arr$(418));
        }
    }
}
