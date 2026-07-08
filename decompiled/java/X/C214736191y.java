package X;

import com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.191y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214736191y extends C193N<InterfaceC19354510nn, C190T, C10J1> implements InterfaceC19354510nn {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final int LLJILLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final Function0<C190T> LLJ;
    public final C10J1 LLJI;
    public final InterfaceC1738600vLO LLJIJIL;
    public final C10J3 LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C214736191y.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C214736191y.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJILLL = 8;
    }

    private final C19EG O4() {
        return (C19EG) this.LLIZ.getValue(this, LLJILJILJ[0]);
    }

    private final VideoPublishEditModel P4() {
        return (VideoPublishEditModel) this.LLIZLLLIL.getValue(this, LLJILJILJ[1]);
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
        C20684815ws.onEventV3("tcm_bctoggle_show");
    }

    public final void T4() {
        AVMusic aVMusicExtractAVMusic;
        boolean zLIZIZ = C856100XiC.LIZIZ(P4());
        VideoPublishEditModel videoPublishEditModelP4 = P4();
        boolean z = false;
        if (videoPublishEditModelP4 != null && (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModelP4.creativeModel.musicBuzModel)) != null && aVMusicExtractAVMusic.isCommerceMusic()) {
            z = true;
        }
        ((ICommerceToolsTcmService) ServiceManager.get().getService(ICommerceToolsTcmService.class)).LJIIIIZZ(O4(), zLIZIZ, P4().creativeModel.commerceModel.getTcmModel(), z, C1428470nHB.LJIIJJI(P4()));
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

    public C214736191y(C1DRG c1drg) {
        super(c1drg);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJ = AFwS223S0000000_32.get$arr$(87);
        this.LLJI = new C10J1(new AwS611S0100000_32(this, 92), null);
        this.LLJIJIL = EnumC214771193h.BC;
        this.LLJILJIL = AnonymousClass1937.LIZ;
    }

    @Override // X.InterfaceC19354510nn
    public void setSubtitle(CharSequence charSequence) {
        i3(new AwS611S0100000_32(charSequence, 93));
    }
}
