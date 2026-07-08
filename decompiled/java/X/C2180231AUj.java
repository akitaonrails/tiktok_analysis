package X;

import Y.AObjectS250S0100000_33;
import androidx.fragment.app.FragmentManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.1AUj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2180231AUj extends AbstractC2255721DQs<InterfaceC1454720nxW> implements InterfaceC1454720nxW, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final int LLILZLL;
    public final C1DRG LL;
    public final InterfaceC1454720nxW LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC2180241AUk.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C2180231AUj.class, "editNavApi", "getEditNavApi()Lcom/ss/android/ugc/gamora/editor/nav/EditNavigationApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C2180231AUj.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLILZLL = 8;
    }

    private final C19EG getActivity() {
        return (C19EG) this.LLILZ.getValue(this, LLILZIL[1]);
    }

    public final void G2() {
        C21566919al c21566919al = new C21566919al(getActivity());
        c21566919al.LJFF(2131827246);
        c21566919al.LIZ(2131827245);
        c21566919al.LJII(R.string.f1_, new DialogInterfaceOnClickListenerC2189611Aml(this, 6), false);
        c21566919al.LJIIJ(R.string.e8n, new DialogInterfaceOnClickListenerC2189611Aml(this, 7), false);
        new C21566519ah(c21566919al).LIZLLL();
    }

    public final void H2() {
        C21566919al c21566919al = new C21566919al(getActivity());
        c21566919al.LIZ(2131849123);
        c21566919al.LJFF(2131849124);
        c21566919al.LJII(R.string.f1_, null, false);
        c21566919al.LJIIJ(R.string.fte, new DialogInterfaceOnClickListenerC2189611Aml(this, 8), false);
        new C21566519ah(c21566919al).LIZLLL();
    }

    public final void T2() {
        C21566919al c21566919al = new C21566919al(getActivity());
        c21566919al.LIZ(2131826987);
        c21566919al.LJIIIIZZ(new DialogInterfaceOnClickListenerC2189611Aml(this, 9), getActivity().getString(R.string.f1_), false);
        c21566919al.LJIIJJI(new DialogInterfaceOnClickListenerC2189611Aml(this, 10), getActivity().getString(2131836386), false);
        new C21566519ah(c21566919al).LIZLLL();
    }

    public final InterfaceC2180241AUk X1() {
        return (InterfaceC2180241AUk) this.LLILLL.getValue(this, LLILZIL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        X1().Yc0().LIZ(this, new AObjectS250S0100000_33(this, 6));
        X1().An0().LIZ(this, new AObjectS250S0100000_33(this, 7));
        X1().lE2().LIZ(this, new AObjectS250S0100000_33(this, 8));
        X1().YM1().LIZ(this, new AObjectS250S0100000_33(this, 9));
        X1().wp1().LIZ(this, new AObjectS250S0100000_33(this, 10));
        X1().BY().LIZ(this, new AObjectS250S0100000_33(this, 11));
    }

    public InterfaceC1454720nxW W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C2180231AUj(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void o2(boolean z) {
        C21566919al c21566919al = new C21566919al(getActivity());
        c21566919al.LJII(R.string.f1_, null, false);
        c21566919al.LJIIJ(2131829526, new DialogInterfaceOnClickListenerC2189611Aml(this, 4), false);
        if (z) {
            c21566919al.LJFF(2131846548);
            c21566919al.LIZ(2131846547);
        } else {
            c21566919al.LIZ(2131858176);
        }
        new C21566519ah(c21566919al).LIZLLL();
    }

    public final void w2(int i, int i2, int i3) {
        C21566919al c21566919al = new C21566919al(getActivity());
        c21566919al.LIZ(i);
        c21566919al.LJII(i2, null, false);
        c21566919al.LJIIJ(i3, new DialogInterfaceOnClickListenerC2189611Aml(this, 5), false);
        new C21566519ah(c21566919al).LIZLLL();
    }

    public final void Z1(int i, int i2, boolean z, boolean z2) {
        C1453460nvU c1453460nvU = C1453460nvU.LIZ;
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(this, 3666);
        AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33(this, 3667);
        AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33(this, 3668);
        AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(this, 3669);
        FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
        c1453460nvU.getClass();
        ArrayList arrayList = new ArrayList();
        if (!z) {
            C1247510iZJ c1247510iZJ = new C1247510iZJ();
            c1247510iZJ.LIZIZ(2131832458);
            c1247510iZJ.LIZJ = 0;
            c1247510iZJ.LIZ(new AwS612S0100000_33(awS577S0100000_332, 91));
            arrayList.add(c1247510iZJ);
            C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
            c1247510iZJ2.LIZIZ(2131832455);
            c1247510iZJ2.LIZJ = 0;
            c1247510iZJ2.LIZ(new AwS612S0100000_33(awS577S0100000_333, 92));
            arrayList.add(c1247510iZJ2);
        }
        if (z2) {
            C1247510iZJ c1247510iZJ3 = new C1247510iZJ();
            c1247510iZJ3.LIZIZ(i);
            c1247510iZJ3.LIZJ = 0;
            c1247510iZJ3.LIZ(new AwS612S0100000_33(awS577S0100000_33, 90));
            if (i2 != -1) {
                c1247510iZJ3.LJI = Integer.valueOf(i2);
            }
            arrayList.add(c1247510iZJ3);
        }
        C1390850mIV c1390850mIV = new C1390850mIV();
        C1247510iZJ[] c1247510iZJArr = (C1247510iZJ[]) arrayList.toArray(new C1247510iZJ[0]);
        c1390850mIV.LIZIZ((C1247510iZJ[]) Arrays.copyOf(c1247510iZJArr, c1247510iZJArr.length));
        c1390850mIV.LIZLLL(2131832454);
        c1390850mIV.LIZ.LL = new DialogInterfaceOnCancelListenerC2189601Amk(awS577S0100000_334, 0);
        if (supportFragmentManager != null) {
            c1390850mIV.LIZJ().show(supportFragmentManager, "test");
        }
    }
}
