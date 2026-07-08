package X;

import com.bytedance.android.live.broadcast.model.CreateInfoPerceptionMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;

/* JADX INFO: renamed from: X.0UPd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C771750UPd {
    public static C771740UPc LIZ(CreateInfoPerceptionMessage createInfoPerceptionMessage) {
        String str;
        String str2;
        Long lValueOf;
        String str3 = createInfoPerceptionMessage.title;
        String str4 = createInfoPerceptionMessage.subTitle;
        String str5 = createInfoPerceptionMessage.detailUrl;
        PunishEventInfo punishEventInfo = createInfoPerceptionMessage.punishInfo;
        String str6 = null;
        if (punishEventInfo != null) {
            str6 = punishEventInfo.punishId;
            str = punishEventInfo.punishType;
            str2 = punishEventInfo.punishReason;
            lValueOf = Long.valueOf(punishEventInfo.violationUid);
        } else {
            str = null;
            str2 = null;
            lValueOf = null;
        }
        return new C771740UPc(str3, str4, str5, str6, str, str2, lValueOf);
    }
}
