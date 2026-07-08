package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0ZfI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905260ZfI extends C193N<InterfaceC905280ZfK, C190Z, C19224710Iz> implements InterfaceC905280ZfK {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static final int LLJJI;
    public final Scene LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final Function0<C190Z> LLJIJIL;
    public final C19224710Iz LLJILJIL;
    public final InterfaceC1738600vLO LLJILJILJ;
    public final C10J3 LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C905260ZfI.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C905260ZfI.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C905260ZfI.class, "publishVisibilityRadioApi", "getPublishVisibilityRadioApi()Lcom/ss/android/ugc/aweme/shortvideo/component/privacy/v2/PublishVisibilityRadioOptionApi;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJJI = 8;
    }

    private final InterfaceC905270ZfJ T4() {
        return (InterfaceC905270ZfJ) this.LLJI.getValue(this, LLJJ[2]);
    }

    public final C19EG O4() {
        return (C19EG) this.LLJ.getValue(this, LLJJ[1]);
    }

    public final VideoPublishEditModel P4() {
        return (VideoPublishEditModel) this.LLIZLLLIL.getValue(this, LLJJ[0]);
    }

    public final void Z4() {
        i3(new AwS593S0100000_14(this, 144));
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
        if (!z4()) {
            i3(AFwS248S0000000_14.get$arr$(324));
            return;
        }
        InterfaceC905270ZfJ interfaceC905270ZfJT4 = T4();
        if (interfaceC905270ZfJT4 != null) {
            interfaceC905270ZfJT4.Zz0(O4(), new AwS593S0100000_14(this, 143));
        }
        Z4();
    }

    @Override // X.C193O
    public boolean z4() {
        return C857660Xki.LJII(P4()) && !C1428470nHB.LJZL(P4());
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

    public C19224710Iz K4() {
        return this.LLJILJIL;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190Z> o2() {
        return this.LLJIJIL;
    }

    public C905260ZfI(C1DRG c1drg, Scene scene) {
        super(c1drg);
        this.LLIZ = scene;
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC905270ZfJ.class, null);
        this.LLJIJIL = new AwS558S0100000_14(this, 1103);
        this.LLJILJIL = new C19224710Iz(null, null, new C913870ZtB(this, 2), null, 11);
        this.LLJILJILJ = EnumC214771193h.EDIT_PAGE_CONTENT_CHECK;
        this.LLJILLL = AnonymousClass1937.LIZ;
    }
}
