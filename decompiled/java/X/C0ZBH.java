package X;

import Y.ARunnableS6S0210000_3;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCellUIInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZBH, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZBH {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public static final void LIZ(InboxEntranceResponse inboxEntranceResponse, List<InboxEntranceCell> list, EnumC1902760zcA enumC1902760zcA, boolean z) {
        ?? LJ;
        ?? LJ2;
        String str;
        String str2;
        String str3;
        C1600120rk2 c1600120rk2LIZJ;
        List<InboxEntranceCell> entranceCells;
        int i = 16;
        if (list != null) {
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LJ = new LinkedHashMap(iLIZIZ);
            for (InboxEntranceCell inboxEntranceCell : list) {
                InboxEntranceCell inboxEntranceCell2 = inboxEntranceCell;
                LJ.put(new Pair(Integer.valueOf(inboxEntranceCell2.cellId), inboxEntranceCell2.entranceKey), inboxEntranceCell);
            }
        } else {
            LJ = C2097608Jq.LJ();
        }
        if (inboxEntranceResponse != null && (entranceCells = inboxEntranceResponse.getEntranceCells()) != null) {
            int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(entranceCells, 10));
            if (iLIZIZ2 >= 16) {
                i = iLIZIZ2;
            }
            LJ2 = new LinkedHashMap(i);
            for (InboxEntranceCell inboxEntranceCell3 : entranceCells) {
                InboxEntranceCell inboxEntranceCell4 = inboxEntranceCell3;
                LJ2.put(new Pair(Integer.valueOf(inboxEntranceCell4.cellId), inboxEntranceCell4.entranceKey), inboxEntranceCell3);
            }
        } else {
            LJ2 = C2097608Jq.LJ();
        }
        Set setLLIIJLIL = C13LP.LLIIJLIL(LJ.keySet(), LJ2.keySet());
        ArrayList arrayList = new ArrayList();
        for (Object obj : setLLIIJLIL) {
            InboxEntranceCell inboxEntranceCell5 = (InboxEntranceCell) LJ.get(obj);
            InboxEntranceCell inboxEntranceCell6 = (InboxEntranceCell) LJ2.get(obj);
            if (inboxEntranceCell5 != null && inboxEntranceCell6 != null) {
                InboxEntranceCellUIInfo inboxEntranceCellUIInfo = inboxEntranceCell5.uiInfo;
                String str4 = null;
                if (inboxEntranceCellUIInfo != null) {
                    str = inboxEntranceCellUIInfo.title;
                } else {
                    str = null;
                }
                InboxEntranceCellUIInfo inboxEntranceCellUIInfo2 = inboxEntranceCell6.uiInfo;
                if (inboxEntranceCellUIInfo2 != null) {
                    str2 = inboxEntranceCellUIInfo2.title;
                } else {
                    str2 = null;
                }
                if (!TextUtils.equals(str, str2)) {
                    c1600120rk2LIZJ = C1600110rk1.LIZ("title");
                } else {
                    InboxEntranceCellUIInfo inboxEntranceCellUIInfo3 = inboxEntranceCell5.uiInfo;
                    if (inboxEntranceCellUIInfo3 != null) {
                        str3 = inboxEntranceCellUIInfo3.content;
                    } else {
                        str3 = null;
                    }
                    InboxEntranceCellUIInfo inboxEntranceCellUIInfo4 = inboxEntranceCell6.uiInfo;
                    if (inboxEntranceCellUIInfo4 != null) {
                        str4 = inboxEntranceCellUIInfo4.content;
                    }
                    if (!TextUtils.equals(str3, str4)) {
                        c1600120rk2LIZJ = C1600110rk1.LIZ("content");
                    } else if (inboxEntranceCell5.unreadCount != inboxEntranceCell6.unreadCount) {
                        c1600120rk2LIZJ = C1600110rk1.LIZ("unread_count");
                    } else if (inboxEntranceCell5.getMuteStatus() != inboxEntranceCell6.getMuteStatus()) {
                        c1600120rk2LIZJ = C1600110rk1.LIZ("mute_status");
                    } else if (!Intrinsics.LJFF(inboxEntranceCell5.getPinStatus(), inboxEntranceCell6.getPinStatus())) {
                        c1600120rk2LIZJ = C1600110rk1.LIZ("pin_status");
                    } else if (!Intrinsics.LJFF(inboxEntranceCell5.getArchiveStatus(), inboxEntranceCell6.getArchiveStatus())) {
                        c1600120rk2LIZJ = C1600110rk1.LIZ("archive_status");
                    } else {
                        c1600120rk2LIZJ = C1600110rk1.LIZJ();
                    }
                }
                if (c1600120rk2LIZJ.LIZ) {
                }
            }
            arrayList.add(obj);
        }
        C20684815ws.LJFF().execute(new ARunnableS6S0210000_3(enumC1902760zcA, arrayList, z, 1));
    }
}
