package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Ju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.thumbnail.ImageEditThumbnailScene$onResume$1", f = "ImageEditThumbnailScene.kt", l = {}, m = "invokeSuspend")
public final class C2352809Ju extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;
    public final /* synthetic */ C12G1 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2352809Ju(int i, VideoPublishEditModel videoPublishEditModel, C12G1 c12g1, InterfaceC1364105Vn<? super C2352809Ju> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = c12g1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2352809Ju(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageEditThumbnailScene@6a71.onResume$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
        C1402610mbT.LJJIJIL(i, videoPublishEditModel, this.LLILLL.mArguments, VEUtils.getVideoFileInfo(videoPublishEditModel.videoPath()), "click_back_button", Boolean.FALSE, "", true, false, null, false, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageEditThumbnailScene@6a71.onResume$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
