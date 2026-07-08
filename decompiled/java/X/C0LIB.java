package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LIB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.choose.Text2ImageListScene$saveUpdateInfo$1", f = "Text2ImageListScene.kt", l = {688}, m = "invokeSuspend")
public final class C0LIB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LIB(VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C0LIB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LIB(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String path;
        List<SingleImageData> imageList;
        SingleImageData singleImageData;
        SrcImageInfo srcImageInfo;
        C1C7U.LIZ("Text2ImageListScene@1b50.saveUpdateInfo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                ImageAlbumData imageAlbumData = this.LLILLJJLI.getImageAlbumData();
                String str = null;
                if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null && (singleImageData = (SingleImageData) C13LP.LJJJLL(imageList)) != null && (srcImageInfo = singleImageData.getSrcImageInfo()) != null) {
                    path = srcImageInfo.getPath();
                } else {
                    path = null;
                }
                if (C1533950q1J.LJ(path)) {
                    str = path;
                }
                if (str == null) {
                    str = this.LLILLJJLI.creativeModel.text2ImageModel.coverPath;
                }
                C0MZB c0mzbLJIILLIIL = C0CHQ.LIZ().LJIILLIIL();
                VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
                this.LL = 1;
                if (c0mzbLJIILLIIL.LIZIZ(str, videoPublishEditModel, this) == objLJFF) {
                    C1C7U.LIZIZ("Text2ImageListScene@1b50.saveUpdateInfo$1");
                    return objLJFF;
                }
            }
            InterfaceC573980MfE interfaceC573980MfELJIIJ = C0CHQ.LIZ().LJIIJ();
            VideoPublishEditModel videoPublishEditModel2 = this.LLILLJJLI;
            C573960MfC.LIZ(interfaceC573980MfELJIIJ, videoPublishEditModel2, videoPublishEditModel2.getCreationId(), 5, null, 24);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("text2image error ");
            sbLIZ.append(e);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Text2ImageListScene@1b50.saveUpdateInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
