package X;

import Y.AObjectS241S0100000_8;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS409S0200000_8;

/* JADX INFO: renamed from: X.0MF9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MF9 extends AbstractC2255721DQs<InterfaceC564970MDv> implements InterfaceC564970MDv, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C0MEI.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1451050nrb.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455610nyx.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), C0MEH.class, null);
    public final h0<Boolean> LLIZ = new h0<>(Boolean.valueOf(T2(getEditModel())));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MF9.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0MF9.class, "imageAILiveCoreApi", "getImageAILiveCoreApi()Lcom/ss/android/ugc/gamora/editor/ailive/ImageAILiveCoreApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0MF9.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0MF9.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/BaseEditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0MF9.class, "aiLiveQuotaApi", "getAiLiveQuotaApi()Lcom/ss/android/ugc/gamora/editor/ailive/quota/AILiveQuotaLogicApi;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJ = 8;
    }

    public InterfaceC564970MDv X1() {
        return this;
    }

    private final void H2() {
        this.LLIZ.LIZ(this, new AObjectS241S0100000_8(this, 41));
    }

    private final C0MEH W1() {
        return (C0MEH) this.LLILZLL.getValue(this, LLIZLLLIL[4]);
    }

    private final InterfaceC1451050nrb Z1() {
        return (InterfaceC1451050nrb) this.LLILZ.getValue(this, LLIZLLLIL[2]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLIZLLLIL[0]);
    }

    public final InterfaceC1455610nyx o2() {
        return (InterfaceC1455610nyx) this.LLILZIL.getValue(this, LLIZLLLIL[3]);
    }

    public final C0MEI w2() {
        return (C0MEI) this.LLILLL.getValue(this, LLIZLLLIL[1]);
    }

    private final void G2() {
        Z1().yd1().LJII(this, Lifecycle.State.CREATED, new AObjectS241S0100000_8(this, 40));
    }

    public final void W2() {
        List<SingleImageData> imageList;
        Integer numValueOf;
        ImageAlbumData imageAlbumData = getEditModel().creativeModel.imageAlbumModel;
        if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null || (numValueOf = Integer.valueOf(imageList.size())) == null || numValueOf.intValue() <= 1) {
            return;
        }
        Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(C1664590tQ1.LJIIIZ(this).getString(2131825311));
        creativeToastBuilder.isCenterToast(false);
        creativeToastBuilder.duration(Mp4ScreenVideoLoadTimeout.CONTROL);
        C1390380mHk.LIZJ(contextLJIIIZ, 8005, creativeToastBuilder);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        H2();
        G2();
    }

    @Override // X.InterfaceC564970MDv
    public C385670FAf<Boolean> Sf() {
        return this.LLIZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C0MF9(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final boolean T2(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        C0MEH c0mehW1;
        ImageAlbumData imageAlbumData = videoPublishEditModel.creativeModel.imageAlbumModel;
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null && imageList.size() == 1 && ((c0mehW1 = W1()) == null || !c0mehW1.bS0())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC564970MDv
    public void hM(AbstractC564980MDw abstractC564980MDw) {
        c3(new AwS409S0200000_8(this, abstractC564980MDw, 75), new C0MFA(this));
    }

    private final void c3(Function0<Unit> function0, Function0<Unit> function02) {
        if (T2(getEditModel())) {
            function0.invoke();
        } else {
            function02.invoke();
        }
    }
}
