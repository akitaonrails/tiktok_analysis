package X;

import Y.AfS197S0100000_28;
import android.view.View;
import com.ss.android.ugc.aweme.inbox.api.MultiApiManager;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceFunction;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.0zc8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1902740zc8 {
    public static final C1902740zc8 LIZ = new C1902740zc8();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(630));

    public static void LIZ(int i, View view) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("action ");
        sbLIZ.append(i);
        sbLIZ.append(" error ");
        C1720106oR.LJI("InboxEntranceActionSheet", C2188811AlT.LIZIZ(sbLIZ));
        C1389890mGx c1389890mGx = new C1389890mGx(view);
        c1389890mGx.LJIIIZ(2131836093);
        c1389890mGx.LJIIJJI();
    }

    public static InboxEntranceCell LIZJ(int i, InboxEntrancePod inboxEntrancePod) {
        InboxEntranceFunction next;
        InboxEntranceCell inboxEntranceCell = inboxEntrancePod.entranceCell;
        InboxEntranceCell inboxEntranceCellCopy = inboxEntranceCell.copy(inboxEntranceCell.cellId, inboxEntranceCell.priority, inboxEntranceCell.unreadCount, inboxEntranceCell.uiInfo, inboxEntranceCell.bizParams, inboxEntranceCell.lastNoticeCreateTime, inboxEntranceCell.canHide, inboxEntranceCell.canPin, inboxEntranceCell.filterType, inboxEntranceCell.group, inboxEntranceCell.systemNoticeType, inboxEntranceCell.exposedInfo, inboxEntranceCell.eventTrackingExtra, inboxEntranceCell.beforeMarkUnreadCount, inboxEntranceCell.beforeMarkUiInfo, inboxEntranceCell.noticePreloadItem, inboxEntranceCell.latestUnreadNoticeTime, inboxEntranceCell.entranceKey, inboxEntranceCell.functionList);
        List<InboxEntranceFunction> list = inboxEntranceCellCopy.functionList;
        InboxEntranceFunction inboxEntranceFunction = null;
        if (list != null) {
            Iterator<InboxEntranceFunction> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.functionType == C0ORP.ARCHIVE.getType()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InboxEntranceFunction inboxEntranceFunction2 = next;
            if (inboxEntranceFunction2 != null) {
                inboxEntranceFunction2.setActionStatus(i);
            }
        }
        inboxEntranceCellCopy.setPriority(0);
        inboxEntranceCellCopy.setPinStatus(Boolean.FALSE);
        List<InboxEntranceFunction> list2 = inboxEntranceCellCopy.functionList;
        if (list2 != null) {
            Iterator<InboxEntranceFunction> it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                InboxEntranceFunction next2 = it3.next();
                if (next2.functionType == C0ORP.PIN.getType()) {
                    inboxEntranceFunction = next2;
                    break;
                }
            }
            InboxEntranceFunction inboxEntranceFunction3 = inboxEntranceFunction;
            if (inboxEntranceFunction3 != null) {
                inboxEntranceFunction3.setActionStatus(0);
            }
        }
        return inboxEntranceCellCopy;
    }

    public static InboxEntranceCell LIZLLL(int i, InboxEntrancePod inboxEntrancePod) {
        InboxEntranceFunction next;
        InboxEntranceCell inboxEntranceCell = inboxEntrancePod.entranceCell;
        InboxEntranceCell inboxEntranceCellCopy = inboxEntranceCell.copy(inboxEntranceCell.cellId, inboxEntranceCell.priority, inboxEntranceCell.unreadCount, inboxEntranceCell.uiInfo, inboxEntranceCell.bizParams, inboxEntranceCell.lastNoticeCreateTime, inboxEntranceCell.canHide, inboxEntranceCell.canPin, inboxEntranceCell.filterType, inboxEntranceCell.group, inboxEntranceCell.systemNoticeType, inboxEntranceCell.exposedInfo, inboxEntranceCell.eventTrackingExtra, inboxEntranceCell.beforeMarkUnreadCount, inboxEntranceCell.beforeMarkUiInfo, inboxEntranceCell.noticePreloadItem, inboxEntranceCell.latestUnreadNoticeTime, inboxEntranceCell.entranceKey, inboxEntranceCell.functionList);
        inboxEntranceCellCopy.setMuteStatus(C0ZBG.LIZ(Integer.valueOf(i)));
        List<InboxEntranceFunction> list = inboxEntranceCellCopy.functionList;
        if (list != null) {
            Iterator<InboxEntranceFunction> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.functionType == C0ORP.MUTE.getType()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InboxEntranceFunction inboxEntranceFunction = next;
            if (inboxEntranceFunction != null) {
                inboxEntranceFunction.setActionStatus(i);
            }
        }
        return inboxEntranceCellCopy;
    }

    public static void LIZIZ(InboxEntranceCell inboxEntranceCell, int i, Function0 function0, Function0 function02) {
        ((C11NJ) LIZIZ.getValue()).LIZ(MultiApiManager.LIZ().updateInboxEntrance(inboxEntranceCell.cellId, i, inboxEntranceCell.group, inboxEntranceCell.systemNoticeType, inboxEntranceCell.entranceKey).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS197S0100000_28(function0, 84), new AfS197S0100000_28(function02, 85)));
    }
}
