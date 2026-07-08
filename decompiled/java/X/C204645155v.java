package X;

import Y.ACListenerS165S0100000_31;
import Y.AObjectS248S0100000_31;
import Y.AObserverS233S0100000_31;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEPreviewMusicParams;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS82S0210000_31;

/* JADX INFO: renamed from: X.155v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204645155v extends AbstractC204637155n implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final C1DRG LL;
    public final C1664750tQH LLILLJJLI;
    public final C1664750tQH LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664750tQH LLILZIL;
    public final C1664740tQG LLILZLL;
    public final C01GW LLIZ;
    public View LLIZLLLIL;
    public RelativeLayout LLJ;
    public FrameLayout LLJI;
    public ImageView LLJIJIL;
    public ViewGroup LLJILJIL;
    public ViewGroup LLJILJILJ;
    public TuxIconView LLJILLL;
    public final C01GW LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C204645155v.class, "params", "getParams()Lcom/ss/android/ugc/aweme/port/in/music/InitParams;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C204645155v.class, "musicPanelContext", "getMusicPanelContext()Lcom/ss/android/ugc/aweme/tools/music/music/vertical/common/MusicPanelContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C204645155v.class, "verticalMusicView", "getVerticalMusicView()Lcom/ss/android/ugc/aweme/tools/music/music/vertical/VerticalMusicView;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C204645155v.class, "musicLogicPresenter", "getMusicLogicPresenter()Lcom/ss/android/ugc/aweme/port/in/IAnotherMusicService$IMusicLogicPresenter;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C204645155v.class, "lyricsApi", "getLyricsApi()Lcom/ss/android/ugc/gamora/lyrics/ILyricStickerEffectDataLogicComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C204645155v.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
    }

    @Override // X.AbstractC204637155n
    public final void LIZJ() {
        boolean zHasMusic;
        LiveData<MusicBuzModel> liveDataB7;
        ((AbstractC204625155b) this.LLJJ.getValue()).LIZLLL();
        C204646155w c204646155wLJ = LJ();
        C1664740tQG c1664740tQG = c204646155wLJ.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C204646155w.LLJJ;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) c1664740tQG.getValue(c204646155wLJ, interfaceC2217461BqaArr[2]);
        if (videoPublishEditModel != null) {
            if (videoPublishEditModel.creativeModel.onThisDayData.isInOnThisDayPreviewPage()) {
                InterfaceC568180MQe interfaceC568180MQe = (InterfaceC568180MQe) c204646155wLJ.LLJ.getValue(c204646155wLJ, interfaceC2217461BqaArr[3]);
                zHasMusic = C204646155w.LIZJ((interfaceC568180MQe == null || (liveDataB7 = interfaceC568180MQe.b7()) == null) ? null : liveDataB7.getValue());
            } else {
                zHasMusic = videoPublishEditModel.hasMusic();
            }
            c204646155wLJ.LLJIJIL.LIZLLL(new AwS82S0210000_31(videoPublishEditModel, c204646155wLJ, zHasMusic, 3), true);
        }
        if (LJFF().LJIILL) {
            LJII();
        }
    }

    public final C155W LIZLLL() {
        return (C155W) this.LLILZIL.getValue(this, LLJJI[3]);
    }

    public final C204646155w LJ() {
        return (C204646155w) this.LLIZ.getValue();
    }

    public final C155H LJFF() {
        return (C155H) this.LLILLJJLI.getValue(this, LLJJI[0]);
    }

    public final AbstractC204621154x LJI() {
        return (AbstractC204621154x) this.LLILZ.getValue(this, LLJJI[2]);
    }

    public final void LJII() {
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(LIZLLL().zt().LIZIZ());
        if ((!LIZLLL().J5() && !LIZLLL().Kt()) || LIZLLL().Ct() || aVMusicExtractAVMusic == null) {
            return;
        }
        LJFF().LJIIL.LJIIZILJ(true);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C204645155v(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZ(c1drg, C155H.class, null);
        this.LLILLL = C1664770tQJ.LIZ(c1drg, C204639155p.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, AbstractC204621154x.class, null);
        this.LLILZIL = C1664770tQJ.LIZ(c1drg, C155W.class, null);
        this.LLILZLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC366450EYh.class, null);
        C1664770tQJ.LIZIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLIZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1457));
        this.LLJJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1458));
    }

    @Override // X.AbstractC204637155n
    public final void LIZ(View view) {
        ImageView imageView;
        this.LLJ = (RelativeLayout) view.findViewById(R.id.oww);
        C337180DJs.LIZ(view.findViewById(R.id.cel));
        View viewLJLLLL = C786410Ut5.LJLLLL((ViewStub) view.findViewById(R.id.vs_bottom_bar_v2));
        FrameLayout frameLayout = (FrameLayout) viewLJLLLL.findViewById(R.id.cbm);
        C786410Ut5.LJZ(LJFF().LJIILLIIL, frameLayout);
        this.LLJI = frameLayout;
        this.LLJIJIL = (ImageView) viewLJLLLL.findViewById(R.id.lus);
        this.LLJILJIL = (ViewGroup) viewLJLLLL.findViewById(R.id.ni1);
        this.LLJILJILJ = (ViewGroup) viewLJLLLL.findViewById(R.id.f761njp);
        this.LLJILLL = (TuxIconView) viewLJLLLL.findViewById(R.id.jwu);
        ((AbstractC204625155b) this.LLJJ.getValue()).LIZ(viewLJLLLL);
        if (!LJFF().LJJII.LIZ && (imageView = this.LLJIJIL) != null) {
            C19659111vp c19659111vp = new C19659111vp();
            c19659111vp.LIZIZ(0);
            imageView.setBackground(c19659111vp.LIZ(LJFF().LJJIIJZLJL));
        }
        this.LLIZLLLIL = viewLJLLLL;
        if (LJFF().LJJII.LIZ) {
            if (C12DP.LIZ()) {
                new C156L(LJFF(), LJI(), LJ(), view, new AwS575S0100000_31(this, 1459), new AwS575S0100000_31(this, 1460));
            } else {
                new C156I(LJFF(), LJI(), view, this.LLIZLLLIL, new AwS575S0100000_31(this, 1461));
            }
        }
        if (LJFF().LJIILL) {
            LJII();
        }
        View viewFindViewById = view.findViewById(R.id.volume_click_view);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS165S0100000_31(this, 176), viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.vqb);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS165S0100000_31(this, 177), viewFindViewById2);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(44.0f))));
        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(14.0f)));
        RelativeLayout relativeLayout = this.LLJ;
        if (relativeLayout != null) {
            C786410Ut5.e6(relativeLayout, layoutParams);
        }
    }

    @Override // X.AbstractC204637155n
    public final void LIZIZ(LifecycleOwner lifecycleOwner) {
        LiveData<MusicBuzModel> liveDataB7;
        LiveEvent<VEPreviewMusicParams> liveEventYr0;
        C1664680tQA c1664680tQA = LJ().LLJILJIL;
        ((AbstractC204625155b) this.LLJJ.getValue()).LIZIZ(lifecycleOwner);
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.1560
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((AnonymousClass1562) obj).LJ);
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS610S0100000_31(this, 415));
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.155z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((AnonymousClass1562) obj).LIZLLL);
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS585S0100000_6(this, 316));
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.1561
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AnonymousClass1562) obj).LJI;
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS388S0200000_22(lifecycleOwner, this, 236));
        LJI().LLILLJJLI.LJII(lifecycleOwner, Lifecycle.State.RESUMED, new AObjectS248S0100000_31(this, 13));
        C204646155w c204646155wLJ = LJ();
        C1664740tQG c1664740tQG = c204646155wLJ.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C204646155w.LLJJ;
        InterfaceC1455860nzM interfaceC1455860nzM = (InterfaceC1455860nzM) c1664740tQG.getValue(c204646155wLJ, interfaceC2217461BqaArr[1]);
        if (interfaceC1455860nzM != null && (liveEventYr0 = interfaceC1455860nzM.yr0()) != null) {
            liveEventYr0.LIZ(lifecycleOwner, new AObjectS248S0100000_31(c204646155wLJ, 12));
        }
        InterfaceC568180MQe interfaceC568180MQe = (InterfaceC568180MQe) c204646155wLJ.LLJ.getValue(c204646155wLJ, interfaceC2217461BqaArr[3]);
        if (interfaceC568180MQe != null && (liveDataB7 = interfaceC568180MQe.b7()) != null) {
            liveDataB7.observe(lifecycleOwner, new AObserverS233S0100000_31(c204646155wLJ, 38));
        }
    }
}
