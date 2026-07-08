package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.191m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214724191m extends C193N<C05YF, C190Z, C19224710Iz> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static final int LLJJI;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public boolean LLJ;
    public final String LLJI;
    public final Function0<C190Z> LLJIJIL;
    public final C19224710Iz LLJILJIL;
    public final InterfaceC1738600vLO LLJILJILJ;
    public final C10J3 LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C214724191m.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C214724191m.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJI = 8;
    }

    public final C19EG O4() {
        return (C19EG) this.LLIZLLLIL.getValue(this, LLJJ[1]);
    }

    public final VideoPublishEditModel P4() {
        return (VideoPublishEditModel) this.LLIZ.getValue(this, LLJJ[0]);
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
        this.LLJ = !T2().LJII;
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

    public final void T4(String str) {
        String str2 = this.LLJI;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", P4().getCreationId());
        c0lab.LJ("event_type", str);
        c0lab.LIZ(T2().LJII ? 1 : 0, "action_type");
        c0lab.LJ("enter_from", P4().getEnterFrom());
        c0lab.LIZ(C1428470nHB.LJJZZI(P4()) ? 1 : 0, "is_photo");
        C20684815ws.LJIILLIIL(str2, c0lab.LIZ);
    }

    public C214724191m(C1DRG c1drg, C10J3 c10j3) {
        super(c1drg);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJ = true;
        this.LLJI = "creator_panel_visual_button";
        this.LLJIJIL = new AwS576S0100000_32(this, 291);
        this.LLJILJIL = new C19224710Iz(null, null, new C19LY(this, 2), new AwS611S0100000_32(this, 124), 3);
        this.LLJILJILJ = EnumC214771193h.ALLOW_VISUAL_SEARCH;
        this.LLJILLL = c10j3;
    }
}
