package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import com.ss.android.ugc.tiktok.ConvertHelper;

/* JADX INFO: renamed from: X.1DrJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2268871DrJ {
    public static final C2268871DrJ LIZ = new C2268871DrJ();

    public static PaidVideoItem LIZ(C2268861DrI c2268861DrI) {
        long jLongValue;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        boolean zBooleanValue3;
        long jLongValue2;
        long jLongValue3;
        long jLongValue4;
        long jLongValue5;
        boolean zBooleanValue4;
        long jLongValue6;
        boolean zBooleanValue5;
        Long l = c2268861DrI.paid_video_id;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Boolean bool = c2268861DrI.is_intro;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Boolean bool2 = c2268861DrI.is_reported;
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        Aweme awemeCom$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme = null;
        Aweme awemeCom$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme2 = ConvertHelper.com$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme(c2268861DrI.aweme, null);
        C5186020i c5186020i = c2268861DrI.full_paid_videos_for_partial_preview;
        if (c5186020i != null) {
            awemeCom$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme = ConvertHelper.com$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme(c5186020i, null);
        }
        Boolean bool3 = c2268861DrI.is_completed_bool;
        if (bool3 != null) {
            zBooleanValue3 = bool3.booleanValue();
        } else {
            zBooleanValue3 = false;
        }
        Long l2 = c2268861DrI.max_timestamp;
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = 0;
        }
        Long l3 = c2268861DrI.last_watch_time;
        if (l3 != null) {
            jLongValue3 = l3.longValue();
        } else {
            jLongValue3 = 0;
        }
        Long l4 = c2268861DrI.video_duration;
        if (l4 != null) {
            jLongValue4 = l4.longValue();
        } else {
            jLongValue4 = 0;
        }
        Long l5 = c2268861DrI.seq_id;
        if (l5 != null) {
            jLongValue5 = l5.longValue();
        } else {
            jLongValue5 = 0;
        }
        int i = (int) jLongValue5;
        Boolean bool4 = c2268861DrI.is_last_watched;
        if (bool4 != null) {
            zBooleanValue4 = bool4.booleanValue();
        } else {
            zBooleanValue4 = false;
        }
        Long l6 = c2268861DrI.video_views;
        if (l6 != null) {
            jLongValue6 = l6.longValue();
        } else {
            jLongValue6 = 0;
        }
        int i2 = (int) jLongValue6;
        Boolean bool5 = c2268861DrI.is_safety_selected;
        if (bool5 != null) {
            zBooleanValue5 = bool5.booleanValue();
        } else {
            zBooleanValue5 = true;
        }
        return new PaidVideoItem(jLongValue, zBooleanValue, zBooleanValue2, awemeCom$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme2, awemeCom$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme, zBooleanValue3, jLongValue2, jLongValue3, jLongValue4, i, zBooleanValue4, i2, zBooleanValue5);
    }
}
