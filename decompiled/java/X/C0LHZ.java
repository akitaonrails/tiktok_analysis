package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LHZ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.cover.ImageCoverHelperKt$getCoverForImageDraft$2", f = "ImageCoverHelper.kt", l = {}, m = "invokeSuspend")
public final class C0LHZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ VideoPublishEditModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LHZ(VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C0LHZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LHZ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Boolean boolValueOf;
        boolean zLJFF;
        int i;
        int i2;
        C1C7U.LIZ("ImageCoverHelperKt@2181.getCoverForImageDraft$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair<Bitmap, Boolean> pairLIZ = C1444180ngW.LIZ(this.LL);
        Bitmap first = pairLIZ.getFirst();
        boolean zBooleanValue = pairLIZ.getSecond().booleanValue();
        if (first != null) {
            VideoPublishEditModel videoPublishEditModel = this.LL;
            if (C493401w4.LIZ()) {
                videoPublishEditModel.generateVideoCoverPath(true, -2);
                C0MH8 c0mh8 = C0MH8.LIZ;
                String videoCoverPath = videoPublishEditModel.getVideoCoverPath();
                if (zBooleanValue) {
                    i = 5;
                } else {
                    i = 3;
                }
                if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
                    i2 = 1001;
                } else {
                    i2 = LSPassThroughRecordSizeConfig.DEFAULT;
                }
                c0mh8.getClass();
                zLJFF = C0MH8.LJIJ(videoPublishEditModel, first, i2, i, videoCoverPath, 100);
            } else {
                videoPublishEditModel.generateVideoCoverPath();
                zLJFF = C2475309mx.LJFF(100, Bitmap.CompressFormat.PNG, first, new C0VSJ(videoPublishEditModel.getVideoCoverPath()));
            }
            boolValueOf = Boolean.valueOf(zLJFF);
        } else {
            boolValueOf = null;
        }
        C1C7U.LIZIZ("ImageCoverHelperKt@2181.getCoverForImageDraft$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
