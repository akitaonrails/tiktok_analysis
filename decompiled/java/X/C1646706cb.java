package X;

/* JADX INFO: renamed from: X.06cb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1646706cb {
    public static final C1646706cb LIZ = new C1646706cb();

    public static final String LIZIZ() {
        return C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI(Integer.valueOf(EnumC1646906cd.REPOSTED.getType()), Integer.valueOf(EnumC1646906cd.LIKED.getType()), Integer.valueOf(EnumC1646906cd.YOURS.getType())), ",", null, null, 0, null, null, 62);
    }

    public static final boolean LIZ(C0Y8T c0y8t) {
        if (!C369001c0.LIZ() || c0y8t == null || !c0y8t.isGroupChat() || c0y8t.getMemberCount() < 2 || !C0ZFW.LIZ.LJIIIZ(c0y8t) || C12858051k.LIZ(c0y8t.getConversationId(), "send_msg") || C12858051k.LIZ(c0y8t.getConversationId(), "get_msg") || C12858051k.LIZ(c0y8t.getConversationId(), "click_close") || C12858051k.LIZ(c0y8t.getConversationId(), "send_msg_recently") || !C1727806pg.LIZ.LIZ("group_chat_show_share_post_banner", c0y8t.getConversationId(), C461720I8s.LIZIZ(), false)) {
            return false;
        }
        return true;
    }

    public static final String LIZJ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://im/open_share_video_panel?&conversation_id=");
        sbLIZ.append(str);
        sbLIZ.append("&panel_type=");
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
