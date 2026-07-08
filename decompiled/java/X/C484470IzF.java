package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import webcast.api.feed.NoticeItem;
import webcast.api.feed.NoticeUIInfo;
import webcast.api.feed.NoticeUserStruct;

/* JADX INFO: renamed from: X.0IzF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C484470IzF {
    public static final C484470IzF LIZ = new C484470IzF();

    public static long LIZ(NoticeItem noticeItem, boolean z) {
        List<NoticeUserStruct> list;
        NoticeUserStruct noticeUserStruct;
        if (z) {
            NoticeUIInfo noticeUIInfo = noticeItem.showUiInfo;
            if (noticeUIInfo != null && (list = noticeUIInfo.fromUserList) != null && (!list.isEmpty()) && (noticeUserStruct = (NoticeUserStruct) ListProtector.get(list, 0)) != null) {
                return noticeUserStruct.userRoomId;
            }
            return 0L;
        }
        return noticeItem.roomId;
    }

    public static long LIZIZ(NoticeItem noticeItem, boolean z) {
        List<NoticeUserStruct> list;
        NoticeUserStruct noticeUserStruct;
        if (z) {
            NoticeUIInfo noticeUIInfo = noticeItem.showUiInfo;
            if (noticeUIInfo != null && (list = noticeUIInfo.fromUserList) != null && (!list.isEmpty()) && (noticeUserStruct = (NoticeUserStruct) ListProtector.get(list, 0)) != null) {
                return noticeUserStruct.userId;
            }
            return 0L;
        }
        return noticeItem.anchorId;
    }

    public static void LIZLLL(NoticeUserStruct noticeUserStruct, boolean z) {
        if (noticeUserStruct == null) {
            return;
        }
        long j = noticeUserStruct.followStatus;
        long j2 = 3;
        if (z) {
            if (j != 0 && j == 3) {
                j2 = 2;
            } else {
                j2 = 1;
            }
        } else if (j == 1 || j != 2) {
            j2 = 0;
        }
        noticeUserStruct.followStatus = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(int r19, webcast.api.feed.NoticeItem r20, android.content.Context r21, java.lang.String r22, int r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C484470IzF.LIZJ(int, webcast.api.feed.NoticeItem, android.content.Context, java.lang.String, int, boolean):void");
    }
}
