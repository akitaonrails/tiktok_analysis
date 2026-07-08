package X;

import kotlin.jvm.internal.AwS423S0200000_22;

/* JADX INFO: renamed from: X.0o7F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1460750o7F extends C1462970oAp implements InterfaceC379610EuV {
    public static final C1444320ngk LLLIIIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIL;
    public final C1DRG LLLFF;
    public final C19A3 LLLFFI;
    public final int LLLFZ;
    public final boolean LLLI;
    public final C01GW LLLII;
    public final InterfaceC1731706qJ LLLIIII;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0ngk] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1460750o7F.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        C13LE.LIZ.getClass();
        LLLIIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLIIIIL = new Object() { // from class: X.0ngk
        };
        C1446930nkx.LIZIZ("tiktok_tts_audio", new C1403800mdO());
        C1446930nkx.LIZIZ("tts_instant_clone", new C1402580mbQ());
    }

    private final InterfaceC1455850nzL X1() {
        return (InterfaceC1455850nzL) this.LLLIIII.getValue(this, LLLIIIL[0]);
    }

    private final C1462090o9P Z1() {
        return (C1462090o9P) this.LLLII.getValue();
    }

    @Override // X.C1462970oAp, X.InterfaceC1455010nxz
    public void hide() {
        super.hide();
        if (this.LLLFFI.isShowing(Z1())) {
            this.LLLFFI.hide(Z1());
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C19A3 c19a3 = this.LLLFFI;
        int i = this.LLLFZ;
        C1462090o9P c1462090o9PZ1 = Z1();
        c1462090o9PZ1.LLJJJJLIIL = (InterfaceC1461390o8H) getDiContainer().LJII(InterfaceC1461390o8H.class, null);
        c1462090o9PZ1.LLJJL = (C121O) getDiContainer().LJII(C121O.class, null);
        c1462090o9PZ1.LLLIIL = (InterfaceC384890F7f) getDiContainer().LJII(InterfaceC384890F7f.class, null);
        c19a3.add(i, c1462090o9PZ1, "EditStickerScene");
        W1();
        mF1(Z1());
        X1().nl2(this);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        X1().nl2(null);
    }

    @Override // X.C1462970oAp, X.InterfaceC1455010nxz
    public void show() {
        super.show();
        if (this.LLLFFI.isShowing(Z1())) {
            return;
        }
        this.LLLFFI.show(Z1());
    }

    @Override // X.C1462970oAp, X.InterfaceC1455010nxz
    public void vi1() {
        C1462090o9P c1462090o9PZ1 = Z1();
        c1462090o9PZ1.getClass();
        c1462090o9PZ1.LLLLJ(C1697810uHb.LJIIJJI(EnumC1466150oFx.POLL, EnumC1466150oFx.DONATION, EnumC1466150oFx.MENTION, EnumC1466150oFx.HASH_TAG, EnumC1466150oFx.LIVE_COUNTDOWN, EnumC1466150oFx.LOCATION));
        c1462090o9PZ1.LLLLLLLLL().Yr();
        c1462090o9PZ1.LJLI();
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLLFF;
    }

    public C1460750o7F(C1DRG c1drg, C19A3 c19a3, int i, boolean z, InterfaceC1462140o9U interfaceC1462140o9U) {
        super(c1drg);
        this.LLLFF = c1drg;
        this.LLLFFI = c19a3;
        this.LLLFZ = i;
        this.LLLI = z;
        this.LLLII = C452501pT.LIZIZ(new AwS423S0200000_22(this, interfaceC1462140o9U, 64));
        this.LLLIIII = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
    }
}
