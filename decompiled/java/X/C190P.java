package X;

import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.190P, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C190P extends C193N<C05YF, C190T, C10J1> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final int LLJILLL;
    public final C19A3 LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final Function0<C190T> LLJ;
    public final C10J1 LLJI;
    public final InterfaceC1738600vLO LLJIJIL;
    public final C10J3 LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C190P.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILLL = 8;
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
    }

    private final VideoPublishEditModel O4() {
        return (VideoPublishEditModel) this.LLIZLLLIL.getValue(this, LLJILJILJ[0]);
    }

    public final void LIZIZ() {
        C19656511vP c19656511vP = new C19656511vP();
        c19656511vP.LLJI = O4();
        c19656511vP.LLJILJIL = "create_post";
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this.LLIZ);
        if (navigationSceneLIZ != null) {
            C569760MWg c569760MWg = new C569760MWg();
            c569760MWg.LIZJ = new C190U();
            navigationSceneLIZ.LLLLLLLLLL(c19656511vP, c569760MWg.LIZ());
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("entry_method", "create_post");
        c0lab.LIZ(C1568130quR.LIZ() ? 1 : 0, "screen_reader_enabled");
        C20684815ws.LJIILLIIL("click_add_alternative_text", c0lab.LIZ);
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJI;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJIJIL;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJILJIL;
    }

    public C10J1 K4() {
        return this.LLJI;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190T> o2() {
        return this.LLJ;
    }

    public C190P(C1DRG c1drg, C19A3 c19a3) {
        super(c1drg);
        this.LLIZ = c19a3;
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJ = AFwS223S0000000_32.get$arr$(85);
        this.LLJI = new C10J1(new AwS611S0100000_32(this, 89), null);
        this.LLJIJIL = EnumC214771193h.ALT_TEXT;
        this.LLJILJIL = AnonymousClass1937.LIZ;
    }
}
