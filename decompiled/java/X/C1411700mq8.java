package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.photomode.ImagePublishBackSaveModel;
import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.AIRewriteModel;
import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.RequestContent;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandTextViewModel;
import com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescRequestBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mq8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411700mq8 {
    public VideoPublishEditModel LIZ;
    public RecommendDescRequestBody LIZIZ;
    public List<String> LIZJ;
    public CharSequence LIZLLL;
    public final C11NJ LJ = new C11NJ();
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS566S0100000_22(this, 842));

    public final List<String> LIZ() {
        List<SingleImageData> imageList;
        ImageAlbumData imageAlbumData = this.LIZ.getImageAlbumData();
        if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(imageList, 10));
        Iterator<SingleImageData> it2 = imageList.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getSrcImageInfo().getPath());
        }
        return arrayList;
    }

    public final String LIZIZ() {
        String strLIZ = ((InterfaceC1409370mmN) this.LJFF.getValue()).LIZ();
        return strLIZ.substring(0, Math.min(strLIZ.length(), 400));
    }

    public final void LJFF() {
        RecommendDescRequestBody recommendDescRequestBody = this.LIZIZ;
        RequestContent requestContent = recommendDescRequestBody != null ? new RequestContent(this.LIZJ, this.LIZLLL, recommendDescRequestBody.texts, recommendDescRequestBody.title, recommendDescRequestBody.experimentParams) : null;
        this.LIZ.creativeModel.imagePublishBackSaveModel.aiRewriteModel.lastAIRewriteRequestContent = requestContent;
        if (requestContent != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateRequest ");
            sbLIZ.append(requestContent);
            C1454340nwu.LIZ("AIRewriteRequestHelper", C2188811AlT.LIZIZ(sbLIZ));
            C1406040mh0.LIZ = new RequestContent(requestContent.imagePathList, requestContent.descWithSpan, requestContent.texts, requestContent.title, requestContent.experimentParams);
            C1406040mh0.LIZIZ = C2097608Jq.LJ();
        }
    }

    public final boolean LIZJ() {
        String strLIZIZ = LIZIZ();
        RecommendDescRequestBody recommendDescRequestBody = this.LIZIZ;
        if (!Intrinsics.LJFF(strLIZIZ, recommendDescRequestBody != null ? recommendDescRequestBody.texts : null)) {
            C1454340nwu.LIZ("AIRewriteGenerateManager", "needRequest texts");
            return true;
        }
        List<String> listLIZ = LIZ();
        List<String> list = this.LIZJ;
        if (list == null || listLIZ.size() != list.size()) {
            C1454340nwu.LIZ("AIRewriteGenerateManager", "imageList size");
            return true;
        }
        Set setLLIIJI = C13LP.LLIIJI(listLIZ);
        List<String> list2 = this.LIZJ;
        if (Intrinsics.LJFF(setLLIIJI, list2 != null ? C13LP.LLIIJI(list2) : null)) {
            C1454340nwu.LIZ("AIRewriteGenerateManager", "needRequest false");
            return false;
        }
        C1454340nwu.LIZ("AIRewriteGenerateManager", "imageList change");
        return true;
    }

    public C1411700mq8(Scene scene, VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModel;
        ImagePublishBackSaveModel imagePublishBackSaveModel;
        AIRewriteModel aIRewriteModel;
        RequestContent requestContent;
        this.LIZ = videoPublishEditModel;
        if (!scene.mViewDestroyed) {
            C1659630tI1.LJIIIIZZ(scene, null, null, 6).get(ExpandTextViewModel.class);
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LIZ;
        if (videoPublishEditModel2 != null && (creativeModel = videoPublishEditModel2.creativeModel) != null && (imagePublishBackSaveModel = creativeModel.imagePublishBackSaveModel) != null && (aIRewriteModel = imagePublishBackSaveModel.aiRewriteModel) != null && (requestContent = aIRewriteModel.lastAIRewriteRequestContent) != null) {
            this.LIZIZ = new RecommendDescRequestBody("", String.valueOf(requestContent.descWithSpan), requestContent.texts, requestContent.experimentParams, requestContent.title, true);
            this.LIZJ = requestContent.imagePathList;
            this.LIZLLL = requestContent.descWithSpan;
        }
    }

    public final boolean LIZLLL(String str, String str2) {
        String str3;
        String str4;
        if (!Intrinsics.LJFF(str2, String.valueOf(this.LIZLLL))) {
            C1454340nwu.LIZ("AIRewriteGenerateManager", "needRequest desc");
            return true;
        }
        if (str == null) {
            str = "";
        }
        RecommendDescRequestBody recommendDescRequestBody = this.LIZIZ;
        Set setLLIIJI = null;
        if (recommendDescRequestBody != null) {
            str3 = recommendDescRequestBody.title;
        } else {
            str3 = null;
        }
        if (!Intrinsics.LJFF(str, str3)) {
            C1454340nwu.LIZ("AIRewriteGenerateManager", "needRequest title");
            return true;
        }
        String strLIZIZ = LIZIZ();
        RecommendDescRequestBody recommendDescRequestBody2 = this.LIZIZ;
        if (recommendDescRequestBody2 != null) {
            str4 = recommendDescRequestBody2.texts;
        } else {
            str4 = null;
        }
        if (!Intrinsics.LJFF(strLIZIZ, str4)) {
            C1454340nwu.LIZ("AIRewriteGenerateManager", "needRequest texts");
            return true;
        }
        List<String> listLIZ = LIZ();
        List<String> list = this.LIZJ;
        if (list != null && listLIZ.size() == list.size()) {
            Set setLLIIJI2 = C13LP.LLIIJI(listLIZ);
            List<String> list2 = this.LIZJ;
            if (list2 != null) {
                setLLIIJI = C13LP.LLIIJI(list2);
            }
            if (!Intrinsics.LJFF(setLLIIJI2, setLLIIJI)) {
                C1454340nwu.LIZ("AIRewriteGenerateManager", "imageList change");
                return true;
            }
            C1454340nwu.LIZ("AIRewriteGenerateManager", "needRequest false");
            return false;
        }
        C1454340nwu.LIZ("AIRewriteGenerateManager", "imageList size");
        return true;
    }

    public final void LJ(String str, CharSequence charSequence, int i, Function1 function1, Function1 function12, Function1 function13, Function1 function14) {
        String str2 = str;
        C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("ai_tip", "start request ai_tip requestPowerText (dual: degrade + normal)");
        long jCurrentTimeMillis = System.currentTimeMillis();
        AwS388S0200000_22 awS388S0200000_22 = new AwS388S0200000_22(this, (C1411700mq8) function12, (Function1<? super EnumC1411090mp9, Unit>) 162);
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                this.LJ.LJ();
                List<String> listLIZ = LIZ();
                C1457500o20 c1457500o20 = new C1457500o20(listLIZ, this.LIZ.getCreativeInfo());
                C573430MeL c573430MeL = C573430MeL.LIZ;
                VideoPublishEditModel videoPublishEditModel = this.LIZ;
                Boolean bool = Boolean.FALSE;
                c573430MeL.getClass();
                c1457500o20.LIZ = C573430MeL.LIZ(videoPublishEditModel, bool);
                C11NZ c11nzLIZJ = C1457440o1u.LIZJ(c1457500o20, true, null, 4);
                if (c11nzLIZJ == null) {
                    int length = charSequence.length();
                    C1411660mq4 c1411660mq4 = C1411660mq4.LIZ;
                    VideoPublishEditModel videoPublishEditModel2 = this.LIZ;
                    EnumC1287340jbY enumC1287340jbY = EnumC1287340jbY.FAILURE;
                    EnumC1411640mq2 enumC1411640mq2 = EnumC1411640mq2.UPLOAD_TOS_FAIL;
                    int length2 = length + LIZIZ().length();
                    if (str2 == null) {
                        str2 = "";
                    }
                    int length3 = length2 + str2.length();
                    c1411660mq4.getClass();
                    C1411660mq4.LIZIZ(videoPublishEditModel2, enumC1287340jbY, enumC1411640mq2, "uploadImageTask is null", 0L, 0L, length3, i, false);
                    awS388S0200000_22.invoke(EnumC1411090mp9.NO_RESULT_RETURN);
                    return;
                }
                C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("ai_tip", "ai_tip upload_task start");
                this.LJ.LIZ(C1239300iM4.LJ(c11nzLIZJ.LJLIIL(1L).LJLJI(30L, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()), new C1411650mq3(awS388S0200000_22, this, jCurrentTimeMillis, i), AFwS210S0000000_22.get$arr$(320), new C1411730mqB(jCurrentTimeMillis, this, charSequence, str2, i, listLIZ, function13, function14, function1, function12)));
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        awS388S0200000_22.invoke(EnumC1411090mp9.NETWORK_ERROR);
    }
}
