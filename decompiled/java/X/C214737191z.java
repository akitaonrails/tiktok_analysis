package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.191z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214737191z extends C193N<InterfaceC214735191x, C190T, C10J1> implements InterfaceC214735191x {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final Function0<C190T> LLJIJIL;
    public final C10J1 LLJILJIL;
    public final InterfaceC1738600vLO LLJILJILJ;
    public final C10J3 LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C214737191z.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C214737191z.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C214737191z.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/publish/OnAddAnchorListenerReceiver;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C214737191z.class, "moreOptionApiComponent", "getMoreOptionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/option/more/MoreOptionApiComponent;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    private final InterfaceC855180Xgi T4() {
        return (InterfaceC855180Xgi) this.LLJI.getValue(this, LLJJ[3]);
    }

    private final C190Y Z4() {
        return (C190Y) this.LLJ.getValue(this, LLJJ[2]);
    }

    @Override // X.InterfaceC214735191x
    public void O1() {
        i3(new AwS611S0100000_32(this, 63));
    }

    public final C19EG O4() {
        return (C19EG) this.LLIZ.getValue(this, LLJJ[0]);
    }

    public final VideoPublishEditModel P4() {
        return (VideoPublishEditModel) this.LLIZLLLIL.getValue(this, LLJJ[1]);
    }

    public final void n5() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", P4().getEnterFrom());
        c0lab.LJ("content_type", C1428470nHB.LJIILL(P4()));
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(P4()));
        C20684815ws.LJIILLIIL("click_ai_dubbing_entrance", c0lab.LIZ);
        C19EG c19egO4 = O4();
        C127R c127r = new C127R(c19egO4, P4());
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIII = c127r;
        c1390920mIc.LJIIIIZZ(0);
        C1390920mIc.LJII(c1390920mIc, false);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        c127r.setSheet(tuxSheet);
        tuxSheet.show(c19egO4.getSupportFragmentManager(), "AIDubbingSheet");
    }

    private final void t5() {
        Z4().registerOnAddAnchorListener(new AwS576S0100000_32(this, 165));
    }

    public final void d5() {
        String strLJI = C1420670n4b.LJI(O4(), P4());
        if (strLJI != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(O4());
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJ(strLJI);
            c1389890mGx.LJIIJJI();
        }
    }

    private final void k5() {
        t5();
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJILJIL;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJILJILJ;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJILLL;
    }

    public C10J1 K4() {
        return this.LLJILJIL;
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
        t5();
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190T> o2() {
        return this.LLJIJIL;
    }

    public C214737191z(C1DRG c1drg) {
        super(c1drg);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), C190Y.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC855180Xgi.class, null);
        this.LLJIJIL = new AwS576S0100000_32(this, 164);
        this.LLJILJIL = new C10J1(new AwS611S0100000_32(this, 61), new AwS611S0100000_32(this, 62));
        this.LLJILJILJ = new InterfaceC1738600vLO() { // from class: X.1921
            @Override // X.InterfaceC1738600vLO
            public final String getKey() {
                return "ai_dubbing_disclosure";
            }
        };
        this.LLJILLL = AnonymousClass1937.LIZ;
    }
}
