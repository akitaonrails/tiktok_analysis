package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.OnThisDayData;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MLM, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MLM extends AbstractC2255721DQs<InterfaceC568260MQm> implements InterfaceC379610EuV, InterfaceC568260MQm {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final int LLJI;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), C0MMK.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), C0LHY.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), C0MHM.class, null);
    public volatile boolean LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MLM.class, "forwardConfig", "getForwardConfig()Lcom/ss/android/ugc/aweme/creative/model/forward/ForwardConfig;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0MLM.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0MLM.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0MLM.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0MLM.class, "normalPublishApi", "getNormalPublishApi()Lcom/ss/android/ugc/gamora/editor/lightening/publish/LighteningQuickPostApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0MLM.class, "storyPublishApi", "getStoryPublishApi()Lcom/ss/android/ugc/gamora/editor/lightening/publish/LighteningPublishApiComponent;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLJI = 8;
    }

    public InterfaceC568260MQm w2() {
        return this;
    }

    public final C0MMK G2() {
        return (C0MMK) this.LLILLJJLI.getValue(this, LLJ[0]);
    }

    public final VideoPublishEditModel H2() {
        return (VideoPublishEditModel) this.LLILZ.getValue(this, LLJ[2]);
    }

    public final C0LHY T2() {
        return (C0LHY) this.LLILZLL.getValue(this, LLJ[4]);
    }

    public final AbstractC214814194y W2() {
        return (AbstractC214814194y) this.LLILLL.getValue(this, LLJ[1]);
    }

    public final C0MHM c3() {
        return (C0MHM) this.LLIZ.getValue(this, LLJ[5]);
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLILZIL.getValue(this, LLJ[3]);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        w2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C0MLM(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC568260MQm
    public void Ql2(ForwardMedia forwardMedia) {
        i3(forwardMedia, true);
    }

    @Override // X.InterfaceC568260MQm
    public void UD0(ForwardMedia forwardMedia) {
        i3(forwardMedia, false);
    }

    public final long X1(long j) {
        return System.currentTimeMillis() - j;
    }

    public final void o2(ForwardMedia forwardMedia) {
        long jLongValue;
        String musicId;
        Long lLJIILIIL;
        if (C0CHL.LIZ()) {
            return;
        }
        MusicBuzModel musicBuzModel = H2().creativeModel.musicBuzModel;
        ForwardMusic forwardMusic = forwardMedia.forwardMusic;
        if (forwardMusic != null && (musicId = forwardMusic.getMusicId()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(musicId)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        musicBuzModel.music = new MusicObject(jLongValue, null, null, 0, 0, 0, null, null, null, false, null, null, false, false, null, false, false, null, null, null, 0L, 0, null, null, 0, null, false, false, null, 0, 0, null, 0, false, false, null, null, false, 0.0f, null, null, 0, null, 0, 0, false, false, null, null, null, 0, false, false, null, null, null, false, 0, false, null, 0L, 0L, null, -2, Integer.MAX_VALUE, null);
        musicBuzModel.musicType = 1;
    }

    private final void i3(ForwardMedia forwardMedia, boolean z) {
        Context contextRequireSceneContext = W2().requireSceneContext();
        H2().creativeModel.onThisDayData.setLeftWay("on_this_day_slider_post");
        this.LLIZLLLIL = false;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2108108Nr.LIZ), null, null, new C0MLO(this, contextRequireSceneContext, forwardMedia, z, null), 3);
    }

    public final void W1(boolean z, ForwardMedia forwardMedia) {
        int sourceDuration;
        if (!Intrinsics.LJFF(H2().getEnterFrom(), "story_archive")) {
            H2().setEnterFrom("on_this_day_page");
        }
        OnThisDayData onThisDayData = H2().creativeModel.onThisDayData;
        if (z) {
            onThisDayData.setPublishStoryFromOnThisDayPage(true);
        } else {
            onThisDayData.setPublishNormalFromOnThisDayPage(true);
        }
        VideoPublishEditModel videoPublishEditModelH2 = H2();
        if (forwardMedia.video.getSourceDuration() > 0) {
            sourceDuration = forwardMedia.video.getSourceDuration();
        } else {
            sourceDuration = 15000;
        }
        videoPublishEditModelH2.setVideoLength(sourceDuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z1(android.content.Context r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C0MLN
            if (r0 == 0) goto La2
            r3 = r8
            X.0MLN r3 = (X.C0MLN) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La2
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r1 = r3.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto La9
            X.C155000ia.LIZIZ(r1)
        L22:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            java.lang.Boolean.valueOf(r0)
        L2b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2e:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = X.C0CHL.LIZ()
            if (r0 != 0) goto L3a
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3a:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.H2()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r5 = r0.musicBuzModel
            boolean r0 = X.C0MRM.LIZ(r5)
            if (r0 != 0) goto L4b
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4b:
            java.lang.String r0 = r5.path
            if (r0 == 0) goto L55
            int r0 = r0.length()
            if (r0 != 0) goto L6f
        L55:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.H2()
            java.lang.String r0 = r0.getMMusicPath()
            if (r0 == 0) goto L6f
            int r0 = r0.length()
            if (r0 == 0) goto L6f
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.H2()
            java.lang.String r0 = r0.getMMusicPath()
            r5.path = r0
        L6f:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.H2()
            java.lang.String r1 = r0.getMMusicPath()
            X.01GW r0 = X.C279500AxQ.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L8b
            boolean r0 = X.C2286708xd.LIZJ(r1)
            if (r0 != 0) goto L2b
        L8b:
            com.ss.android.ugc.aweme.creative.model.music.MusicObject r0 = r5.music
            if (r0 == 0) goto L2b
            long r0 = r0.id
            java.lang.String r1 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.H2()
            r3.LLILLL = r2
            java.lang.Object r1 = X.C537620L6q.LIZ(r7, r1, r0, r3)
            if (r1 != r4) goto L22
            return r4
        La2:
            X.0MLN r3 = new X.0MLN
            r3.<init>(r6, r8)
            goto L12
        La9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MLM.Z1(android.content.Context, X.05Vn):java.lang.Object");
    }
}
