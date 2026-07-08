package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS43S0010000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.155w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204646155w implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final C155H LL;
    public final C155W LLILLJJLI;
    public final Function0<C204628155e> LLILLL;
    public final Function0<Boolean> LLILZ;
    public final C1DRG LLILZIL;
    public final AbstractC204621154x LLILZLL;
    public final C1664740tQG LLIZ;
    public final C1664740tQG LLIZLLLIL;
    public final C1664740tQG LLJ;
    public final C1664740tQG LLJI;
    public final C1664680tQA<AnonymousClass1562> LLJIJIL;
    public final C1664680tQA LLJILJIL;
    public int LLJILJILJ;
    public MusicModel LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C204646155w.class, "editVolumeApi", "getEditVolumeApi()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C204646155w.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C204646155w.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C204646155w.class, "onThisDayMusicApi", "getOnThisDayMusicApi()Lcom/ss/android/ugc/gamora/editor/lightening/canvas/forward/onthisday/component/OnThisDayMusicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C204646155w.class, "rememberLastSelectMusicApi", "getRememberLastSelectMusicApi()Lcom/ss/android/ugc/gamora/editor/music/RememberLastSelectMusicApi;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public final C204628155e LIZIZ() {
        return this.LLILLL.invoke();
    }

    public final void LIZLLL() {
        if (this.LLILZ.invoke().booleanValue()) {
            this.LLJIJIL.LIZLLL(AFwS276S0000000_31.get$arr$(282), true);
            return;
        }
        boolean z = LIZIZ().LIZIZ && LIZIZ().LIZLLL != 0.0f;
        this.LLJIJIL.LIZLLL(new AwS43S0010000_31(z, 10), true);
        if (!z) {
            this.LL.LJIIL.LJJ(0.0f);
            return;
        }
        C155Z c155z = this.LL.LJIIL;
        if (LIZIZ().LIZLLL == 0.0f) {
            LIZIZ().LIZLLL = 1.0f;
        }
        float f = LIZIZ().LIZLLL;
        LIZIZ();
        c155z.LJJ(f);
        if (this.LLILLJJLI.K5()) {
            c155z.LJII();
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILZIL;
    }

    public static boolean LIZJ(MusicBuzModel musicBuzModel) {
        String str;
        UrlModel urlModel;
        String uri = null;
        if (musicBuzModel != null) {
            str = musicBuzModel.musicPath;
            MusicObject musicObject = musicBuzModel.music;
            if (musicObject != null && (urlModel = musicObject.playUrl) != null) {
                uri = urlModel.getUri();
            }
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            if (uri == null || uri.length() == 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean LIZ(boolean z) {
        boolean zBooleanValue = ((Boolean) this.LLJIJIL.LIZ(new C2217381BqS() { // from class: X.155x
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((AnonymousClass1562) obj).LIZLLL);
            }
        }).LIZJ()).booleanValue();
        if (zBooleanValue == z) {
            return false;
        }
        MusicModel musicModel = this.LLJILLL;
        if (!zBooleanValue) {
            if (musicModel == null) {
                return false;
            }
            this.LLILZLL.LJJIJIIJIL(this.LLJILJILJ, musicModel, null, false, null, false, null, null);
            this.LLJIJIL.LIZLLL(new AwS43S0010000_31(z, 8), true);
            this.LLJILLL = null;
            this.LLJILJILJ = -1;
            return true;
        }
        MusicModel musicModelLJIL = this.LLILZLL.LJIL();
        if (musicModelLJIL != null) {
            this.LLJILLL = musicModelLJIL;
            this.LLJILJILJ = C154M.LIZIZ;
        }
        InterfaceC1459480o5C interfaceC1459480o5C = (InterfaceC1459480o5C) this.LLJI.getValue(this, LLJJ[4]);
        if (interfaceC1459480o5C != null) {
            interfaceC1459480o5C.i21();
        }
        this.LLILZLL.mi();
        this.LLJIJIL.LIZLLL(new AwS43S0010000_31(z, 9), true);
        this.LLJIJIL.LIZLLL(new AwS610S0100000_31(this, 399), true);
        return true;
    }

    public C204646155w(C155H c155h, C155W c155w, AwS575S0100000_31 awS575S0100000_31, AwS575S0100000_31 awS575S0100000_312, C1DRG c1drg, AbstractC204621154x abstractC204621154x) {
        this.LL = c155h;
        this.LLILLJJLI = c155w;
        this.LLILLL = awS575S0100000_31;
        this.LLILZ = awS575S0100000_312;
        this.LLILZIL = c1drg;
        this.LLILZLL = abstractC204621154x;
        C1664770tQJ.LIZIZ(c1drg, InterfaceC1418580n1E.class, null);
        this.LLIZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1455860nzM.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC568180MQe.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(c1drg, InterfaceC1459480o5C.class, null);
        C1664680tQA<AnonymousClass1562> c1664680tQA = new C1664680tQA<>(new AnonymousClass1562(0));
        this.LLJIJIL = c1664680tQA;
        this.LLJILJIL = c1664680tQA;
        this.LLJILJILJ = -1;
    }
}
