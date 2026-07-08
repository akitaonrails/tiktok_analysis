package X;

/* JADX INFO: renamed from: X.0IsO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C480220IsO {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EnumC480200IsM LIZ(String str) {
        switch (str.hashCode()) {
            case -1807275733:
                if (str.equals("inner_flow_leave_room")) {
                    return EnumC480200IsM.INNER_FLOW_LEAVE_ROOM;
                }
                break;
            case -1651609601:
                if (str.equals("leave_inner_flow")) {
                    return EnumC480200IsM.LEAVE_INNER_FLOW;
                }
                break;
            case -1504202962:
                if (str.equals("enter_preview_card")) {
                    return EnumC480200IsM.ENTER_PREVIEW_CARD;
                }
                break;
            case -1035425812:
                if (str.equals("feed_slide_end")) {
                    return EnumC480200IsM.FEED_SLIDE_END;
                }
                break;
            case -389396676:
                if (str.equals("enter_inner_flow_room")) {
                    return EnumC480200IsM.ENTER_INNER_FLOW_ROOM;
                }
                break;
            case -237540945:
                if (str.equals("leave_preview_card")) {
                    return EnumC480200IsM.LEAVE_PREVIEW_CARD;
                }
                break;
            case -115318039:
                if (str.equals("leave_tab_inner_flow")) {
                    return EnumC480200IsM.LEAVE_TAB_INNER_FLOW;
                }
                break;
            case -31220206:
                if (str.equals("enter_tab_inner_flow_room")) {
                    return EnumC480200IsM.ENTER_TAB_INNER_FLOW_ROOM;
                }
                break;
            case 155152780:
                if (str.equals("inner_flow_slide_start")) {
                    return EnumC480200IsM.INNER_FLOW_SLIDE_START;
                }
                break;
            case 393443461:
                if (str.equals("inner_flow_slide_end")) {
                    return EnumC480200IsM.INNER_FLOW_SLIDE_END;
                }
                break;
            case 589773112:
                if (str.equals("inner_room_show")) {
                    return EnumC480200IsM.INNER_ROOM_SHOW;
                }
                break;
            case 1401316147:
                if (str.equals("feed_slide_start")) {
                    return EnumC480200IsM.FEED_SLIDE_START;
                }
                break;
        }
        return EnumC480200IsM.NONE;
    }
}
