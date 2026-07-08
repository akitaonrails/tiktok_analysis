package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mbX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402650mbX {
    public static final C1402650mbX LIZ = new C1402650mbX();

    public static String LIZ(VideoPublishEditModel videoPublishEditModel) {
        Map<String, String> map;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "enable_canvas_conditions_tracker", true, false) || (map = videoPublishEditModel.creativeModel.imagePublishModel.reasonToPostAsVideo) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (EnumC1439240nYY enumC1439240nYY : EnumC1439240nYY.values()) {
            if (Intrinsics.LJFF("1", map.getOrDefault(enumC1439240nYY.getStr(), CardStruct.IStatusCode.DEFAULT))) {
                arrayList.add(Integer.valueOf(enumC1439240nYY.getId()));
            }
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        Map<String, String> map = videoPublishEditModel.creativeModel.imagePublishModel.reasonToPostAsVideo;
        if (map != null) {
            C2341909Fp.LIZ("single_canvas_post_video", map);
        }
    }
}
