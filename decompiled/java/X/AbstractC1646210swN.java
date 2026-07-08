package X;

import Y.AObjectS246S0100000_25;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;

/* JADX INFO: renamed from: X.0swN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1646210swN extends AbstractC1646250swR {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1664740tQG LLILZ;
    public final AObjectS246S0100000_25 LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractC1646210swN.class, "changeCameraSpecApiComponent", "getChangeCameraSpecApiComponent()Lcom/ss/android/ugc/aweme/changemode/ChangeCameraSpecApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public abstract int LIZ();

    public final InterfaceC1646220swO LIZIZ() {
        return (InterfaceC1646220swO) this.LLILZ.getValue(this, LLILZLL[0]);
    }

    @Override // X.InterfaceC1646450swl
    public void m5(C1646490swp c1646490swp) {
        LiveEvent<C1646150swH> liveEventMr1;
        InterfaceC1646220swO interfaceC1646220swOLIZIZ = LIZIZ();
        if (interfaceC1646220swOLIZIZ != null && (liveEventMr1 = interfaceC1646220swOLIZIZ.Mr1()) != null) {
            liveEventMr1.LIZIZ(this.LLILZIL);
        }
    }

    @Override // X.InterfaceC1646450swl
    public void yf(C1646490swp c1646490swp) {
        EnumC1448590nnd enumC1448590nndLIZJ;
        C385670FAf<EnumC1448590nnd> c385670FAfDk;
        Object obj;
        LiveEvent<C1646150swH> liveEventMr1;
        InterfaceC1646220swO interfaceC1646220swOLIZIZ = LIZIZ();
        if (interfaceC1646220swOLIZIZ != null && (liveEventMr1 = interfaceC1646220swOLIZIZ.Mr1()) != null) {
            liveEventMr1.LIZ(this, this.LLILZIL);
        }
        InterfaceC1646220swO interfaceC1646220swOLIZIZ2 = LIZIZ();
        if (interfaceC1646220swOLIZIZ2 != null) {
            int iLIZ = LIZ();
            C1647390syH c1647390syH = c1646490swp.LIZJ;
            String str = null;
            if (c1647390syH != null) {
                obj = c1647390syH.LIZ;
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            }
            if (interfaceC1646220swOLIZIZ2.uF2(iLIZ, str, c1646490swp.LJ, EnumC2008807tu.TAB_CHANGED)) {
                return;
            }
        }
        InterfaceC1646220swO interfaceC1646220swOLIZIZ3 = LIZIZ();
        if (interfaceC1646220swOLIZIZ3 == null || (c385670FAfDk = interfaceC1646220swOLIZIZ3.dk()) == null || (enumC1448590nndLIZJ = c385670FAfDk.LIZJ()) == null) {
            enumC1448590nndLIZJ = EnumC1448590nnd.RATIO_9_16;
        }
        LIZJ(false, enumC1448590nndLIZJ);
    }

    public void LIZJ(boolean z, EnumC1448590nnd enumC1448590nnd) {
        LiveEvent<C1646150swH> liveEventMr1;
        InterfaceC1646220swO interfaceC1646220swOLIZIZ = LIZIZ();
        if (interfaceC1646220swOLIZIZ != null && (liveEventMr1 = interfaceC1646220swOLIZIZ.Mr1()) != null) {
            liveEventMr1.LIZIZ(this.LLILZIL);
        }
    }

    public AbstractC1646210swN(C1646620sx2 c1646620sx2, LifecycleOwner lifecycleOwner, C1DRG c1drg) {
        super(c1646620sx2, lifecycleOwner, c1drg);
        this.LLILZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1646220swO.class, null);
        this.LLILZIL = new AObjectS246S0100000_25(this, 721);
    }
}
