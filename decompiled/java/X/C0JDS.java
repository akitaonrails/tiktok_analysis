package X;

import com.bytedance.android.livesdk.chatroom.api.ContentAuditStatus;
import com.bytedance.android.livesdk.chatroom.api.SMBCourse;
import webcast.api.smb.GetSMBCourseDetailResponse;

/* JADX INFO: renamed from: X.0JDS, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JDS {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(C488550JDx c488550JDx) {
        SMBCourse sMBCourse;
        ContentAuditStatus contentAuditStatus;
        String str;
        String str2 = c488550JDx.LLJI.LIZ;
        if (str2.length() <= 0 && 0 == 0) {
            GetSMBCourseDetailResponse.Data data = c488550JDx.LLILLJJLI;
            if (data == null || (sMBCourse = data.course) == null || (contentAuditStatus = sMBCourse.pinText) == null || (str = contentAuditStatus.content) == null) {
                return "";
            }
            return str;
        }
        return str2;
    }
}
