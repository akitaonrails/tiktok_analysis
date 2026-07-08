package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.creative.model.CelebrationData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.NLEInfoModel;
import com.ss.android.ugc.aweme.creative.model.OnThisDayData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.io.Serializable;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MHK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MHK extends AbstractC2255721DQs<C0MQP> implements InterfaceC379610EuV, C0MQP {
    public static final C0MHL LLIZLLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final int LLJI;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), C0LHY.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C0MHM.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), C0MHP.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), Integer.class, "celebration_type");
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0MHL] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MHK.class, "normalPublishApi", "getNormalPublishApi()Lcom/ss/android/ugc/gamora/editor/lightening/publish/LighteningQuickPostApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C0MHK.class, "storyPublishApi", "getStoryPublishApi()Lcom/ss/android/ugc/gamora/editor/lightening/publish/LighteningPublishApiComponent;", 0), new C2217381BqS(C0MHK.class, "templateApi", "getTemplateApi()Lcom/ss/android/ugc/gamora/editor/lightening/canvas/forward/onthisday/celebration/component/OnThisDayTemplateApi;", 0), new C2217381BqS(C0MHK.class, "publishModel", "getPublishModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C0MHK.class, "celebrationType", "getCelebrationType()I", 0), new C2217381BqS(C0MHK.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0)};
        LLIZLLLIL = new Object() { // from class: X.0MHL
        };
        LLJI = 8;
    }

    public C0MQP Z1() {
        return this;
    }

    private final C0MHM H2() {
        return (C0MHM) this.LLILLL.getValue(this, LLJ[1]);
    }

    private final C0MHP T2() {
        return (C0MHP) this.LLILZ.getValue(this, LLJ[2]);
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLIZ.getValue(this, LLJ[5]);
    }

    private final int o2() {
        return ((Number) this.LLILZLL.getValue(this, LLJ[4])).intValue();
    }

    @Override // X.C0MQP
    public void Cv() {
        C201955140j.LIZJ(C554890LpX.LIZIZ, "CelePublish, publishNormal");
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0LHX(this, null), 3);
    }

    public final VideoPublishEditModel G2() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLJ[3]);
    }

    @Override // X.C0MQP
    public void IE2() {
        C201955140j.LIZJ(C554890LpX.LIZIZ, "CelePublish, publishStory");
        c3(true);
        X1();
        H2().iX(null);
    }

    public final C0LHY w2() {
        return (C0LHY) this.LLILLJJLI.getValue(this, LLJ[0]);
    }

    public final void X1() {
        G2().generateVideoCoverPath();
        MultiEditVideoStatusRecordData multiEditVideoRecordData = G2().getMultiEditVideoRecordData();
        if (multiEditVideoRecordData != null) {
            multiEditVideoRecordData.coverImagePath = null;
        }
        G2().setVideoCoverStartTm(0.5f);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C0MHK(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public static Bundle W1(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void W2(final Function0<Unit> function0) {
        int i;
        int i2;
        C443120HZe<EditVideoSegment, Long, long[]> c443120HZeLJIIIZ;
        if (C2354709Kn.LIZIZ(C0MH8.LJIIIZ(G2(), C0MH8.LIZ, G2().getVideoCoverPath()))) {
            C201955140j.LIZJ(C554890LpX.LIZIZ, "CelePublish, setCover: cover exist");
            function0.invoke();
            return;
        }
        EditVideoSegment editVideoSegment = (EditVideoSegment) C13LP.LJJJLL(T2().ZU1());
        if (editVideoSegment == null) {
            C201955140j.LIZJ(C554890LpX.LIZIZ, "CelePublish, setCover: segment is null");
            function0.invoke();
            return;
        }
        if (editVideoSegment.isImage()) {
            C201955140j.LIZJ(C554890LpX.LIZIZ, "CelePublish, setCover: segment is image");
            if (C493401w4.LIZ()) {
                C0MH8.LIZLLL(G2(), editVideoSegment.getVideoPath(), G2().getVideoCoverPath());
            } else {
                C2354709Kn.LIZLLL(editVideoSegment.getVideoPath(), G2().getVideoCoverPath());
            }
            function0.invoke();
            return;
        }
        if (editVideoSegment.getVideoFileInfo().getWidth() < editVideoSegment.getVideoFileInfo().getHeight()) {
            i2 = 0;
            i = 236;
        } else {
            i = 0;
            i2 = 236;
        }
        EditPreviewInfo editPreviewInfo = G2().getEditPreviewInfo();
        if (editPreviewInfo != null && (c443120HZeLJIIIZ = C571500MbE.LJIIIZ(editPreviewInfo, false, 0L)) != null) {
            VEUtils.getVideoFrames(editVideoSegment.getVideoPath(), new int[]{(int) c443120HZeLJIIIZ.getSecond().longValue()}, i, i2, false, new InterfaceC1286300jZs() { // from class: X.0LHW
                @Override // X.InterfaceC1286300jZs
                public final boolean processFrame(ByteBuffer byteBuffer, int i3, int i4, int i5) {
                    int i6;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                    if (C493401w4.LIZ()) {
                        C201955140j.LIZJ(C554890LpX.LIZIZ, "CelePublish, setCover: bitmap");
                        C0MH8 c0mh8 = C0MH8.LIZ;
                        VideoPublishEditModel videoPublishEditModelG2 = this.LIZ.G2();
                        String videoCoverPath = this.LIZ.G2().getVideoCoverPath();
                        if (C1428470nHB.LJJZZI(videoPublishEditModelG2)) {
                            i6 = 1001;
                        } else {
                            i6 = LSPassThroughRecordSizeConfig.DEFAULT;
                        }
                        c0mh8.getClass();
                        C0MH8.LJIJ(videoPublishEditModelG2, bitmapCreateBitmap, i6, -1, videoCoverPath, 100);
                    } else {
                        String videoCoverPath2 = this.LIZ.G2().getVideoCoverPath();
                        if (videoCoverPath2 != null) {
                            C201955140j.LIZJ(C554890LpX.LIZIZ, "CelePublish, setCover: bitmap");
                            C2243308qd.LIZ(bitmapCreateBitmap, videoCoverPath2);
                        }
                    }
                    bitmapCreateBitmap.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                    function0.invoke();
                    return true;
                }
            });
        } else {
            C201955140j.LIZJ(C554890LpX.LIZIZ, "CelePublish, setCover: config is null");
            function0.invoke();
        }
    }

    public final void c3(boolean z) {
        String nleData;
        String path;
        File fileLJFF;
        OnThisDayData onThisDayData = G2().creativeModel.onThisDayData;
        if (z) {
            onThisDayData.setPublishStoryFromOnThisDayPage(true);
        } else {
            onThisDayData.setPublishNormalFromOnThisDayPage(true);
        }
        C0MLE c0mle = C0MLE.LIZ;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        VideoPublishEditModel videoPublishEditModelG2 = G2();
        int iO2 = o2();
        C0MHP c0mhpT2 = T2();
        c0mle.getClass();
        MusicObject musicObjectUE1 = c0mhpT2.uE1();
        if (musicObjectUE1 != null) {
            videoPublishEditModelG2.creativeModel.musicBuzModel.music = musicObjectUE1;
        }
        C0MLE.LIZJ(videoPublishEditModelG2, c0mhpT2);
        Intent intent = new Intent();
        CreativeModel creativeModelLJIIIIZZ = videoPublishEditModelG2.creativeModel;
        if (creativeModelLJIIIIZZ == null) {
            creativeModelLJIIIIZZ = C0MUK.LJIIIIZZ();
        }
        C0MUK.LJIIIZ(intent, creativeModelLJIIIIZZ);
        CreativeModel creativeModelLIZIZ = C0MUK.LIZIZ(intent);
        NLEInfoModel nLEInfoModel = creativeModelLIZIZ.nleInfoModel;
        NLEModel nleModel = videoPublishEditModelG2.getNleModel();
        String str = null;
        if (nleModel == null || (nleData = C375260EnU.LIZJ(nleModel)) == null) {
            CelebrationData celebrationData = videoPublishEditModelG2.creativeModel.celebrationData;
            if (celebrationData != null) {
                nleData = celebrationData.getNleData();
            } else {
                nleData = null;
            }
        }
        nLEInfoModel.nleData = nleData;
        creativeModelLIZIZ.editModel.editPreviewInfo = videoPublishEditModelG2.getPreviewInfo();
        creativeModelLIZIZ.onThisDayData.setCelebrationType(iO2);
        creativeModelLIZIZ.onThisDayData.setLeftWay("on_this_day_slider_post");
        creativeModelLIZIZ.importModel.isFastImport = true;
        intent.putExtra("on_this_day_day", (Serializable) C0MUK.LIZIZ(intent).onThisDayData);
        if (videoPublishEditModelG2.getWorkspace() == null) {
            videoPublishEditModelG2.setWorkspace(C14D2.LIZ(videoPublishEditModelG2.getCreativeInfo()));
        }
        Workspace workspace = videoPublishEditModelG2.getWorkspace();
        if (workspace != null && (fileLJFF = workspace.LJFF()) != null) {
            path = fileLJFF.getPath();
        } else {
            path = null;
        }
        videoPublishEditModelG2.setOutputFile(path);
        intent.putExtra("workspace", videoPublishEditModelG2.getWorkspace());
        if (shortVideoContext != null) {
            str = shortVideoContext.shootWay;
        }
        intent.putExtra("shoot_way", str);
        C537520L6g.LIZLLL(intent, videoPublishEditModelG2.getCreativeInfo());
        C0MLE.LIZ(intent, shortVideoContext, videoPublishEditModelG2, c0mhpT2);
        new C1438570nXT("forward");
        C1438570nXT.LJII(W1(intent), G2());
    }
}
