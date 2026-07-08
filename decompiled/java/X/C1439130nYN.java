package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.editpost.EditDiffMessage;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nYN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editpost.EditPostPublishScene$updateLocalDraft$1$1", f = "EditPostPublishScene.kt", l = {}, m = "invokeSuspend")
public final class C1439130nYN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CreativeInfo LL;
    public final /* synthetic */ C1445410niV LLILLJJLI;
    public final /* synthetic */ C492380JSq LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1439130nYN(CreativeInfo creativeInfo, C1445410niV c1445410niV, C492380JSq c492380JSq, InterfaceC1364105Vn<? super C1439130nYN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = creativeInfo;
        this.LLILLJJLI = c1445410niV;
        this.LLILLL = c492380JSq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1439130nYN(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String heading;
        String str;
        List<AVTextExtraStruct> list;
        String str2;
        CreativeModel creativeModel;
        EditPostModel editPostModel;
        CreativeModel creativeModel2;
        PostPageModel postPageModel;
        CaptionModel captionModel;
        CreativeModel creativeModel3;
        PostPageModel postPageModel2;
        CreativeModel creativeModel4;
        PostPageModel postPageModel3;
        C1C7U.LIZ("EditPostPublishScene@f667.updateLocalDraft$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0M6F c0m6fLJI = C0CHQ.LIZ().LJI();
        AwemeDraft awemeDraftLJI = c0m6fLJI.LJIILJJIL().LJI(new C558570LvT(this.LL, false, false, false, 14));
        if (awemeDraftLJI != null) {
            new C1438570nXT("EditPostPublishScene");
            VideoPublishEditModel videoPublishEditModelLIZJ = C1438570nXT.LIZJ(awemeDraftLJI, false);
            C1445410niV c1445410niV = this.LLILLJJLI;
            VideoPublishEditModel videoPublishEditModel = c1445410niV.LLJLLL;
            C492380JSq c492380JSq = this.LLILLL;
            boolean z = c1445410niV.LLJZIJLIL;
            PoiData poiData = null;
            if (videoPublishEditModel != null) {
                heading = videoPublishEditModel.getHeading();
            } else {
                heading = null;
            }
            videoPublishEditModelLIZJ.setHeading(heading);
            PostPageModel postPageModel4 = videoPublishEditModelLIZJ.creativeModel.postPageModel;
            if (videoPublishEditModel != null && (creativeModel4 = videoPublishEditModel.creativeModel) != null && (postPageModel3 = creativeModel4.postPageModel) != null) {
                str = postPageModel3.markupCaption;
            } else {
                str = null;
            }
            postPageModel4.markupCaption = str;
            if (videoPublishEditModel == null || (creativeModel3 = videoPublishEditModel.creativeModel) == null || (postPageModel2 = creativeModel3.postPageModel) == null || (list = postPageModel2.markupExtra) == null) {
                list = C13BV.INSTANCE;
            }
            postPageModel4.markupExtra = list;
            if (videoPublishEditModel != null && (creativeModel2 = videoPublishEditModel.creativeModel) != null && (postPageModel = creativeModel2.postPageModel) != null && (captionModel = postPageModel.captionModel) != null) {
                postPageModel4.captionModel = captionModel;
            }
            if (z && videoPublishEditModel != null && videoPublishEditModel.getVideoCoverPath() != null) {
                videoPublishEditModelLIZJ.setVideoCoverStartTm(videoPublishEditModel.getVideoCoverStartTm());
                videoPublishEditModelLIZJ.setVideoCoverPath(videoPublishEditModel.getVideoCoverPath());
                videoPublishEditModelLIZJ.setCoverPublishModel(videoPublishEditModel.getCoverPublishModel());
            }
            PublishExtensionModel publishExtensionModelFromString = PublishExtensionModel.fromString(videoPublishEditModelLIZJ.commerceData);
            if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (editPostModel = creativeModel.editPostModel) != null) {
                poiData = editPostModel.getPoiData();
            }
            publishExtensionModelFromString.poiData = poiData;
            videoPublishEditModelLIZJ.commerceData = PublishExtensionModel.toString(publishExtensionModelFromString);
            EditDiffMessage editDiffMessage = c492380JSq.LIZ.editDiffMessage;
            if (editDiffMessage != null && (str2 = editDiffMessage.aid) != null) {
                videoPublishEditModelLIZJ.creativeModel.draftInfoModel.publishedAwemeId = str2;
            }
            c0m6fLJI.LIZIZ().LJFF(new C545640Lac(C1438570nXT.LJ(videoPublishEditModelLIZJ, "EditPostPublishScene"), new C0M2T(false, "EditPostPublishScene", null, 24, false, 28)));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditPostPublishScene@f667.updateLocalDraft$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
