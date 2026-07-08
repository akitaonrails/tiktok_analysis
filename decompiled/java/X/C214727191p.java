package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: renamed from: X.191p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214727191p extends C193N<C05YF, C190Z, C19224710Iz> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final InterfaceC1731706qJ LLIZ;
    public final Function0<C190Z> LLIZLLLIL;
    public final C19224710Iz LLJ;
    public final InterfaceC1738600vLO LLJI;
    public final C10J3 LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C214727191p.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILJILJ = 8;
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
    }

    public final VideoPublishEditModel O4() {
        return (VideoPublishEditModel) this.LLIZ.getValue(this, LLJILJIL[0]);
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJ;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJI;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJIJIL;
    }

    public C19224710Iz K4() {
        return this.LLJ;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190Z> o2() {
        return this.LLIZLLLIL;
    }

    public C214727191p(C1DRG c1drg) {
        super(c1drg);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLIZLLLIL = AFwS223S0000000_32.get$arr$(101);
        this.LLJ = new C19224710Iz(null, null, new C19LY(this, 8), null, 11);
        this.LLJI = EnumC214771193h.SAVE_WITH_WATERMARK;
        this.LLJIJIL = new AnonymousClass1936(AFwS223S0000000_32.get$arr$(102));
    }
}
