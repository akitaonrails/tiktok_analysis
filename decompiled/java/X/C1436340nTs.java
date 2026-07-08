package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nTs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editpageprepublish.EditPageSaveLocalController$saveLocal$1", f = "EditPageSaveLocalController.kt", l = {305, 312, 397}, m = "invokeSuspend")
public final class C1436340nTs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C013C LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ VideoPublishEditModel LLILZ;
    public final /* synthetic */ NLEModel LLILZIL;
    public final /* synthetic */ InterfaceC1452170ntP LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1436340nTs(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, InterfaceC1452170ntP interfaceC1452170ntP, boolean z, boolean z2, InterfaceC1364105Vn<? super C1436340nTs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = videoPublishEditModel;
        this.LLILZIL = nLEModel;
        this.LLILZLL = interfaceC1452170ntP;
        this.LLIZ = z;
        this.LLIZLLLIL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1436340nTs(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0462  */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [X.013C, com.ss.android.ugc.aweme.canvas.CanvasVideoData, java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v5, types: [com.ss.android.ugc.aweme.creative.model.edit.ImageBufferData] */
    /* JADX WARN: Type inference failed for: r17v5, types: [com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo] */
    /* JADX WARN: Type inference failed for: r18v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v6, types: [com.ss.android.ugc.aweme.creative.model.edit.ImageFilterInfo] */
    /* JADX WARN: Type inference failed for: r19v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v4, types: [com.ss.android.ugc.aweme.creative.model.edit.ImageAdjustInfo] */
    /* JADX WARN: Type inference failed for: r20v3, types: [com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfo] */
    /* JADX WARN: Type inference failed for: r21v2, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r21v3, types: [com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine] */
    /* JADX WARN: Type inference failed for: r23v3, types: [com.ss.android.ugc.aweme.creative.model.edit.ImageQualityInfo] */
    /* JADX WARN: Type inference failed for: r24v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r25v3, types: [com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo] */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r26v2, types: [com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r27v1, types: [com.ss.android.ugc.aweme.creative.model.edit.ImageSurfaceData] */
    /* JADX WARN: Type inference failed for: r27v2, types: [com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateInfo] */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r28v2, types: [com.ss.android.ugc.aweme.creative.model.edit.ReuseEffectTemplateInfo] */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult] */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v1, types: [com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine] */
    /* JADX WARN: Type inference failed for: r30v2, types: [com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo] */
    /* JADX WARN: Type inference failed for: r31v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r31v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r31v2, types: [com.ss.android.ugc.aweme.creative.model.edit.CameraPhotoInfo] */
    /* JADX WARN: Type inference failed for: r32v1, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r32v2, types: [com.ss.android.ugc.aweme.creative.model.ImageVideoSharedModel] */
    /* JADX WARN: Type inference failed for: r33v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r33v1, types: [com.ss.android.ugc.aweme.creative.model.edit.ImageUiBusinessData] */
    /* JADX WARN: Type inference failed for: r33v2, types: [com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageInfo] */
    /* JADX WARN: Type inference failed for: r34v1, types: [com.ss.android.ugc.aweme.creative.model.edit.SubOnlyPhotoPreviewInfo] */
    /* JADX WARN: Type inference failed for: r37v1, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r42v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r44v0, types: [com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverInfo] */
    /* JADX WARN: Type inference failed for: r46v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r4v18, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1436340nTs.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
