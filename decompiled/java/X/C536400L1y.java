package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0L1y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel$onSingleMediaClicked$1$clickedMediaModel$1", f = "SocialMediaPickerViewModel.kt", l = {}, m = "invokeSuspend")
public final class C536400L1y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super MediaModel>, Object> {
    public final /* synthetic */ SocMediaResource LL;
    public final /* synthetic */ SocialMediaPickerViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C536400L1y(SocMediaResource socMediaResource, SocialMediaPickerViewModel socialMediaPickerViewModel, InterfaceC1364105Vn<? super C536400L1y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = socMediaResource;
        this.LLILLJJLI = socialMediaPickerViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C536400L1y(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CreativeInfo creativeInfo;
        String videoPath;
        Object c098200Yq;
        String strLJFF;
        C1C7U.LIZ("SocialMediaPickerViewModel@4194.onSingleMediaClicked$1$clickedMediaModel$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TikTokMediaModel tikTokMediaModel = this.LL.tiktokMediaModel;
        SocialMediaPickerViewModel socialMediaPickerViewModel = this.LLILLJJLI;
        C536350L1t c536350L1t = socialMediaPickerViewModel.LLL;
        if (c536350L1t == null || (creativeInfo = c536350L1t.LJIIIIZZ) == null) {
            creativeInfo = (CreativeInfo) socialMediaPickerViewModel.LLLFFI.getValue();
        }
        if (tikTokMediaModel.LJIIJJI()) {
            LivePhotoInfo livePhotoInfo = tikTokMediaModel.livePhotoInfo;
            Object obj2 = null;
            if (livePhotoInfo != null) {
                videoPath = livePhotoInfo.getVideoPath();
            } else {
                videoPath = null;
            }
            if (videoPath == null || a0.LJJJIL(videoPath)) {
                try {
                    C527420KmK.LIZ.getClass();
                    c098200Yq = C527420KmK.LIZIZ(creativeInfo, tikTokMediaModel);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj2 = c098200Yq;
                }
                MediaModel mediaModel = (MediaModel) obj2;
                if (mediaModel != null && (strLJFF = mediaModel.LJFF()) != null && !a0.LJJJIL(strLJFF)) {
                    tikTokMediaModel.livePhotoInfo = new LivePhotoInfo(strLJFF, mediaModel.duration, "LIVE_PHOTO", false);
                }
            }
        }
        C1C7U.LIZIZ("SocialMediaPickerViewModel@4194.onSingleMediaClicked$1$clickedMediaModel$1");
        return tikTokMediaModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super MediaModel> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
