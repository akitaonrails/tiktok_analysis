package X;

import com.bytedance.ies.cutsame.cut_android.TemplateExtra;
import com.bytedance.ies.cutsame.cut_android.VideoSlot;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.cut_ui.ItemCrop;
import com.ss.android.ugc.cut_ui.MediaItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L8G, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L8G {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C2169008ee.LIZ.LIZ();
    }

    public static ArrayList LIZ(String str) {
        Gson gson = new Gson();
        ArrayList arrayList = new ArrayList();
        TemplateExtra templateExtra = (TemplateExtra) GsonProtectorUtils.fromJson(gson, str, TemplateExtra.class);
        if (templateExtra != null) {
            for (VideoSlot videoSlot : (List) GsonProtectorUtils.fromJson(gson, templateExtra.slots, new TypeToken<List<? extends VideoSlot>>() { // from class: X.0L7y
            }.getType())) {
                if (Intrinsics.LJFF(videoSlot.type, "video") || Intrinsics.LJFF(videoSlot.type, "photo")) {
                    String str2 = videoSlot.uuid;
                    double d = videoSlot.startTime;
                    double d2 = LSPassThroughRecordSizeConfig.DEFAULT;
                    arrayList.add(new MediaItem(str2, (long) (d * d2), (long) (videoSlot.endTime * d2), true, templateExtra.alignMode, false, false, 0, "", videoSlot.volume, 0, 0, (long) ((videoSlot.clipEnd - videoSlot.clipStart) * d2), videoSlot.source, 0L, 1.0f, new ItemCrop(0.0f, 0.0f, 1.0f, 1.0f), videoSlot.type, videoSlot.source, 0.0f, 524288));
                }
            }
        }
        return arrayList;
    }
}
