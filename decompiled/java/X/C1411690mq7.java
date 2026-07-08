package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.photomode.RecommendDescRequestContent;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescRequestBody;
import com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescResponse;
import com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RequestLabelResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS13S0300100_22;
import kotlin.jvm.internal.AwS231S0300000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mq7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411690mq7 {
    public RecommendDescRequestBody LIZ;
    public List<String> LIZIZ;
    public final C11NJ LIZJ = new C11NJ();
    public final C11NJ LIZLLL = new C11NJ();

    public static List LIZJ(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(imageList, 10));
            Iterator<SingleImageData> it2 = imageList.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getSrcImageInfo().getPath());
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public final void LJI(VideoPublishEditModel videoPublishEditModel) {
        RecommendDescRequestContent recommendDescRequestContent;
        RecommendDescRequestBody recommendDescRequestBody = this.LIZ;
        if (recommendDescRequestBody != null) {
            recommendDescRequestContent = new RecommendDescRequestContent(this.LIZIZ, recommendDescRequestBody.description, recommendDescRequestBody.texts);
        } else {
            recommendDescRequestContent = null;
        }
        videoPublishEditModel.creativeModel.imagePublishBackSaveModel.lastRequestContent = recommendDescRequestContent;
    }

    public static AbstractC1457480o1y LIZ(VideoPublishEditModel videoPublishEditModel, EnumC1411760mqE enumC1411760mqE) {
        AbstractC1457480o1y c1457500o20;
        List listLIZJ = LIZJ(videoPublishEditModel);
        int i = C1411750mqD.LIZ[enumC1411760mqE.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C1457430o1t c1457430o1t = C1457430o1t.LIZ;
                C2256608sm c2256608sm = new C2256608sm(0);
                c1457430o1t.getClass();
                c1457500o20 = C1457430o1t.LIZJ(videoPublishEditModel, 0, c2256608sm);
                if (c1457500o20 == null) {
                    c1457500o20 = new C1457500o20(listLIZJ, videoPublishEditModel.getCreativeInfo());
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            c1457500o20 = new C1457500o20(listLIZJ, videoPublishEditModel.getCreativeInfo());
        }
        C573430MeL c573430MeL = C573430MeL.LIZ;
        Boolean bool = Boolean.FALSE;
        c573430MeL.getClass();
        C2288408xu c2288408xuLIZ = C573430MeL.LIZ(videoPublishEditModel, bool);
        c2288408xuLIZ.LJFF = new AwS566S0100000_22(enumC1411760mqE, 27);
        c1457500o20.LIZ = c2288408xuLIZ;
        return c1457500o20;
    }

    public static String LIZIZ(String str, String str2) {
        if (str != null && str.length() != 0) {
            if (str2 != null && str2.length() != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(" | ");
                sbLIZ.append(str2);
                str = C2188811AlT.LIZIZ(sbLIZ);
            }
        } else if (str2 == null) {
            str = "";
        } else {
            str = str2;
        }
        return str.substring(0, Math.min(str.length(), 400));
    }

    public final boolean LIZLLL(VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        String str3;
        String str4;
        String strLIZIZ = LIZIZ(str, str2);
        RecommendDescRequestBody recommendDescRequestBody = this.LIZ;
        Set setLLIIJI = null;
        if (recommendDescRequestBody != null) {
            str3 = recommendDescRequestBody.description;
        } else {
            str3 = null;
        }
        if (!Intrinsics.LJFF(strLIZIZ, str3)) {
            return true;
        }
        C0F7L.LIZ.getClass();
        String strLIZ = C0F7L.LIZ(videoPublishEditModel).LIZ();
        String strSubstring = strLIZ.substring(0, Math.min(strLIZ.length(), 400));
        RecommendDescRequestBody recommendDescRequestBody2 = this.LIZ;
        if (recommendDescRequestBody2 != null) {
            str4 = recommendDescRequestBody2.texts;
        } else {
            str4 = null;
        }
        if (!Intrinsics.LJFF(strSubstring, str4)) {
            return true;
        }
        List listLIZJ = LIZJ(videoPublishEditModel);
        List<String> list = this.LIZIZ;
        if (list == null || listLIZJ.size() != list.size()) {
            return true;
        }
        Set setLLIIJI2 = C13LP.LLIIJI(listLIZJ);
        List<String> list2 = this.LIZIZ;
        if (list2 != null) {
            setLLIIJI = C13LP.LLIIJI(list2);
        }
        if (!Intrinsics.LJFF(setLLIIJI2, setLLIIJI)) {
            return true;
        }
        return false;
    }

    public final void LJ(VideoPublishEditModel videoPublishEditModel, EnumC1411760mqE enumC1411760mqE, Function1<? super RequestLabelResponse, Unit> function1, Function1<? super EnumC1411090mp9, Unit> function12) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        AwS231S0300000_22 awS231S0300000_22 = new AwS231S0300000_22(this, (C1411690mq7) videoPublishEditModel, (VideoPublishEditModel) function12, (Function1<? super EnumC1411090mp9, Unit>) 2);
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                this.LIZLLL.LJ();
                C11NZ c11nzLIZJ = C1457440o1u.LIZJ(LIZ(videoPublishEditModel, enumC1411760mqE), true, null, 4);
                if (c11nzLIZJ == null) {
                    awS231S0300000_22.invoke(EnumC1411090mp9.NO_RESULT_RETURN);
                    return;
                }
                C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("ai_tip label", "ai_tip upload_task start");
                this.LIZLLL.LIZ(C1239300iM4.LJ(c11nzLIZJ.LJLIIL(1L).LJLJI(30L, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()), new AwS601S0100000_22(awS231S0300000_22, 26), AFwS210S0000000_22.get$arr$(19), new AwS13S0300100_22(awS231S0300000_22, jCurrentTimeMillis, videoPublishEditModel, function1, this, 0)));
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        awS231S0300000_22.invoke(EnumC1411090mp9.NETWORK_ERROR);
    }

    public final void LJFF(VideoPublishEditModel videoPublishEditModel, String str, String str2, String str3, EnumC1411760mqE enumC1411760mqE, Function1<? super RecommendDescResponse, Unit> function1, Function1<? super EnumC1411090mp9, Unit> function12) {
        C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("ai_tip", "start request ai_tip recommendDesc");
        long jCurrentTimeMillis = System.currentTimeMillis();
        AwS231S0300000_22 awS231S0300000_22 = new AwS231S0300000_22(this, (C1411690mq7) videoPublishEditModel, (VideoPublishEditModel) function12, (Function1<? super EnumC1411090mp9, Unit>) 3);
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                this.LIZJ.LJ();
                List listLIZJ = LIZJ(videoPublishEditModel);
                C11NZ c11nzLIZJ = C1457440o1u.LIZJ(LIZ(videoPublishEditModel, enumC1411760mqE), true, null, 4);
                if (c11nzLIZJ == null) {
                    C1411660mq4 c1411660mq4 = C1411660mq4.LIZ;
                    EnumC1287340jbY enumC1287340jbY = EnumC1287340jbY.FAILURE;
                    EnumC1411640mq2 enumC1411640mq2 = EnumC1411640mq2.UPLOAD_TOS_FAIL;
                    int length = LIZIZ(str, str2).length();
                    C0F7L.LIZ.getClass();
                    String strLIZ = C0F7L.LIZ(videoPublishEditModel).LIZ();
                    int length2 = strLIZ.substring(0, Math.min(strLIZ.length(), 400)).length() + length;
                    c1411660mq4.getClass();
                    C1411660mq4.LIZ(videoPublishEditModel, enumC1287340jbY, enumC1411640mq2, "uploadImageTask is null", 0L, 0L, length2);
                    awS231S0300000_22.invoke(EnumC1411090mp9.NO_RESULT_RETURN);
                    return;
                }
                C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("ai_tip", "ai_tip upload_task start");
                this.LIZJ.LIZ(C1239300iM4.LJ(c11nzLIZJ.LJLIIL(1L).LJLJI(30L, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()), new AwS13S0300100_22(awS231S0300000_22, this, videoPublishEditModel, jCurrentTimeMillis, 1), AFwS210S0000000_22.get$arr$(20), new C1411710mq9(awS231S0300000_22, jCurrentTimeMillis, this, str, str2, videoPublishEditModel, str3, listLIZJ, function1)));
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        awS231S0300000_22.invoke(EnumC1411090mp9.NETWORK_ERROR);
    }
}
