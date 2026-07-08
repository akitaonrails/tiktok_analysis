package X;

import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS423S0200000_22;

/* JADX INFO: renamed from: X.0o7E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1460740o7E extends C1462970oAp implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIL;
    public final C1DRG LLLFF;
    public final C19A3 LLLFFI;
    public final int LLLFZ;
    public final boolean LLLI;
    public final Function1<Boolean, Unit> LLLII;
    public final C01GW LLLIIII;
    public final InterfaceC1731706qJ LLLIIIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1460740o7E.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        C13LE.LIZ.getClass();
        LLLIIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    private final void X1() {
        C19A3 c19a3 = this.LLLFFI;
        int i = this.LLLFZ;
        C1460730o7D c1460730o7DW2 = w2();
        c1460730o7DW2.LLJJJJLIIL = (InterfaceC1461390o8H) getDiContainer().LJII(InterfaceC1461390o8H.class, null);
        c1460730o7DW2.LLJJL = (C121O) getDiContainer().LJII(C121O.class, null);
        c1460730o7DW2.LLLIIL = (InterfaceC384890F7f) getDiContainer().LJII(InterfaceC384890F7f.class, null);
        c19a3.add(i, c1460730o7DW2, "EditStickerScene");
    }

    private final InterfaceC1455850nzL Z1() {
        return (InterfaceC1455850nzL) this.LLLIIIIL.getValue(this, LLLIIIL[0]);
    }

    private final C1460730o7D w2() {
        return (C1460730o7D) this.LLLIIII.getValue();
    }

    private final C1460730o7D o2() {
        return w2();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            X1();
        }
        W1();
        mF1(w2());
        Z1().nl2(this);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        Z1().nl2(null);
    }

    @Override // X.C1462970oAp, X.InterfaceC1455010nxz
    public void vi1() {
        w2().LJJJJIZL(null);
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLLFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1460740o7E(C1DRG c1drg, C19A3 c19a3, int i, boolean z, InterfaceC1462140o9U interfaceC1462140o9U, Function1<? super Boolean, Unit> function1) {
        super(c1drg);
        this.LLLFF = c1drg;
        this.LLLFFI = c19a3;
        this.LLLFZ = i;
        this.LLLI = z;
        this.LLLII = function1;
        this.LLLIIII = C452501pT.LIZIZ(new AwS423S0200000_22(this, interfaceC1462140o9U, 63));
        this.LLLIIIIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
        if (!LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            X1();
        }
    }
}
