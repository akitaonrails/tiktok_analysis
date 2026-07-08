package X;

import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.NLEInfoModel;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0L75, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L75 extends AbstractC2255721DQs<InterfaceC1417660mzk> implements InterfaceC1417660mzk, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final int LLIZ;
    public final C1DRG LL;
    public final InterfaceC1417660mzk LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
    public boolean LLILZIL = true;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0L75.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0L75.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLIZ = 8;
    }

    private final Intent W1() {
        ArrayList parcelableArrayList;
        Intent intent = new Intent();
        intent.putExtra("extra_start_enter_edit_page", System.currentTimeMillis());
        ShortVideoContext shortVideoContext = C0L77.LIZ;
        C0L77.LIZ = null;
        if (shortVideoContext == null) {
            C201955140j.LJIJI(C1662160tM6.LIZIZ, "AutoCutCancellationContextHolder.pop() return null, build ShortVideoContext manually");
            shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
            shortVideoContext.creativeInfo = Z1().getCreativeInfo();
            shortVideoContext.shootWay = Z1().mShootWay;
            shortVideoContext.mShootFrom = Z1().getShootFrom();
            shortVideoContext.enterFrom = Z1().getEnterFrom();
            shortVideoContext.shootMode = Z1().getShootMode();
            shortVideoContext.enterMethod = Z1().creativeModel.eventData.shootEnterMethod;
            shortVideoContext.uploadMethod = Z1().getUploadMethod();
            shortVideoContext.creativeFlowData = Z1().getCreativeFlowData();
            shortVideoContext.cameraComponentModel.mVideoWidth = Z1().videoWidth();
            shortVideoContext.cameraComponentModel.mVideoHeight = Z1().videoHeight();
            Workspace workspaceLIZ = C14D2.LIZ(Z1().getCreativeInfo());
            shortVideoContext.cameraComponentModel.mWorkspace = workspaceLIZ;
            workspaceLIZ.MC(Z1().getMMusicPath());
            shortVideoContext.cameraComponentModel.mMusicPath = Z1().getMMusicPath();
            shortVideoContext.creativeModel = Z1().creativeModel;
        }
        CreativeModel creativeModel = shortVideoContext.creativeModel;
        creativeModel.editModel.isFromEditAutoCut = true;
        creativeModel.nleInfoModel = new NLEInfoModel("", "", 0, null, true, null);
        shortVideoContext.creativeModel.autoCutModel = new AutoCutModel(null, null, null, null, 0, 0, false, false, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, 0, null, false, null, 0, 0, null, false, false, null, null, -1, 7, null);
        intent.putExtra("key_short_video_context", shortVideoContext);
        Bundle bundle = o2().mArguments;
        if (bundle != null && (parcelableArrayList = bundle.getParcelableArrayList("extra_image_model_media_list")) != null) {
            intent.putExtra("key_choose_media_data", parcelableArrayList);
        }
        intent.putExtra("key_is_reuse_pre_download_music_in_stack", true);
        intent.putExtra("key_skip_c2pa_read_task", true);
        return intent;
    }

    private final VideoPublishEditModel Z1() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLILZLL[0]);
    }

    private final AbstractC214814194y o2() {
        return (AbstractC214814194y) this.LLILZ.getValue(this, LLILZLL[1]);
    }

    @Override // X.InterfaceC1417660mzk
    public void KH0() {
        if (this.LLILZIL) {
            C0CHQ.LIZ().LJJJJIZL().LIZIZ((C19EG) getDiContainer().LJII(C19EG.class, null), getDiContainer(), W1());
        }
    }

    @Override // X.InterfaceC1417660mzk
    public void PE1() {
        if (this.LLILZIL) {
            C1402610mbT.LJJIJLIJ(C778450UgF.LIZ(C545820Lau.LIZIZ(o2())), o2().mArguments, Z1(), Boolean.FALSE, "", true, false);
        }
        this.LLILZIL = false;
    }

    @Override // X.InterfaceC1417660mzk
    public boolean DH0() {
        return this.LLILZIL;
    }

    public InterfaceC1417660mzk X1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C0L75(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
