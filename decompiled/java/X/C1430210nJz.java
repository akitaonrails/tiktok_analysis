package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0nJz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1430210nJz {
    public static final /* synthetic */ int LIZ = 0;

    public static C0XPV LIZ(VideoPublishEditModel videoPublishEditModel) {
        Iterator<Float> it2 = videoPublishEditModel.getCurMultiEditVideoDurations().iterator();
        float fFloatValue = 0.0f;
        while (it2.hasNext()) {
            fFloatValue += it2.next().floatValue();
        }
        C0XPX c0xpx = new C0XPX();
        c0xpx.LIZ.put("origin", String.valueOf(C1428470nHB.LJJIII(videoPublishEditModel)));
        String str = videoPublishEditModel.mShootWay;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c0xpx.LIZ.put("shoot_way", str);
        c0xpx.LIZ.put("video_duration", String.valueOf((int) (fFloatValue * LSPassThroughRecordSizeConfig.DEFAULT)));
        String enterFrom = videoPublishEditModel.getEnterFrom();
        if (enterFrom != null) {
            str2 = enterFrom;
        }
        c0xpx.LIZ.put("enter_from", str2);
        c0xpx.LIZ.put("enter_way", C1403540mcy.LJ(videoPublishEditModel));
        return new C0XPV(c0xpx.LIZ);
    }
}
