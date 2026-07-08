package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LIC, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.exit.TextToImageExitController$realSaveDraftWithNewCreationId$draftCopyResult$1", f = "TextToImageExitController.kt", l = {358, 361}, m = "invokeSuspend")
public final class C0LIC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends AwemeDraft, ? extends AwemeDraft>>, Object> {
    public AwemeDraft LL;
    public int LLILLJJLI;
    public final /* synthetic */ VideoPublishEditModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LIC(VideoPublishEditModel videoPublishEditModel, String str, String str2, String str3, InterfaceC1364105Vn<? super C0LIC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = videoPublishEditModel;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LIC(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String asyncTaskId;
        String path;
        List<SingleImageData> imageList;
        SingleImageData singleImageData;
        SrcImageInfo srcImageInfo;
        List<SingleImageData> imageList2;
        SingleImageData singleImageData2;
        SrcImageInfo srcImageInfo2;
        AwemeDraft awemeDraftLJ;
        C1C7U.LIZ("TextToImageExitController@5a6.realSaveDraftWithNewCreationId$draftCopyResult$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    awemeDraftLJ = this.LL;
                    C155000ia.LIZIZ(obj);
                    Pair pair = new Pair(obj, awemeDraftLJ);
                    C1C7U.LIZIZ("TextToImageExitController@5a6.realSaveDraftWithNewCreationId$draftCopyResult$1");
                    return pair;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            TextImageTaskInfo textImageTaskInfoLIZJ = C572250McR.LIZJ(this.LLILLL.creativeModel.text2ImageModel);
            String path2 = null;
            if (textImageTaskInfoLIZJ != null) {
                asyncTaskId = textImageTaskInfoLIZJ.getAsyncTaskId();
            } else {
                asyncTaskId = null;
            }
            String str = this.LLILZLL;
            C562670M4z c562670M4z = C562670M4z.LIZ;
            String str2 = "";
            if (asyncTaskId == null) {
                asyncTaskId = "";
            }
            c562670M4z.getClass();
            C562670M4z.LIZIZ.storeString(str, asyncTaskId);
            ImageAlbumData imageAlbumData = this.LLILLL.getImageAlbumData();
            if (imageAlbumData != null && (imageList2 = imageAlbumData.getImageList()) != null && (singleImageData2 = (SingleImageData) C13LP.LJJJLL(imageList2)) != null && (srcImageInfo2 = singleImageData2.getSrcImageInfo()) != null) {
                path = srcImageInfo2.getPath();
            } else {
                path = null;
            }
            if (C1533950q1J.LJ(path)) {
                ImageAlbumData imageAlbumData2 = this.LLILLL.getImageAlbumData();
                if (imageAlbumData2 != null && (imageList = imageAlbumData2.getImageList()) != null && (singleImageData = (SingleImageData) C13LP.LJJJJZI(imageList)) != null && (srcImageInfo = singleImageData.getSrcImageInfo()) != null) {
                    path2 = srcImageInfo.getPath();
                }
            } else {
                path2 = this.LLILLL.creativeModel.text2ImageModel.coverPath;
            }
            C0MZB c0mzbLJIILLIIL = C0CHQ.LIZ().LJIILLIIL();
            VideoPublishEditModel videoPublishEditModel = this.LLILLL;
            if (path2 != null) {
                str2 = path2;
            }
            this.LLILLJJLI = 1;
            if (c0mzbLJIILLIIL.LIZIZ(str2, videoPublishEditModel, this) == objLJFF) {
                C1C7U.LIZIZ("TextToImageExitController@5a6.realSaveDraftWithNewCreationId$draftCopyResult$1");
                return objLJFF;
            }
        }
        new C1438570nXT(this.LLILZ);
        awemeDraftLJ = C1438570nXT.LJ(this.LLILLL, "save_draft");
        awemeDraftLJ.lastEditTime = System.currentTimeMillis();
        C0M6F c0m6fLJI = C0CHQ.LIZ().LJI();
        VideoPublishEditModel videoPublishEditModel2 = this.LLILLL;
        String str3 = this.LLILZIL;
        String str4 = this.LLILZ;
        this.LL = awemeDraftLJ;
        this.LLILLJJLI = 2;
        obj = c0m6fLJI.LJII(videoPublishEditModel2, awemeDraftLJ, str3, str4, this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("TextToImageExitController@5a6.realSaveDraftWithNewCreationId$draftCopyResult$1");
            return objLJFF;
        }
        Pair pair2 = new Pair(obj, awemeDraftLJ);
        C1C7U.LIZIZ("TextToImageExitController@5a6.realSaveDraftWithNewCreationId$draftCopyResult$1");
        return pair2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends AwemeDraft, ? extends AwemeDraft>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
