package X;

/* JADX INFO: renamed from: X.0Yt9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C888370Yt9 {
    public static final C888370Yt9 LIZ = new C888370Yt9();

    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Context r7, com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo r8, boolean r9, java.lang.String r10, java.lang.String r11) {
        /*
            X.061m r0 = X.C15408061m.LIZ
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r4 = r0.LJI(r8)
            long r0 = r8.id
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 5
            java.lang.String r2 = X.C0YNP.LIZJ(r0, r1)
            r5 = -1
            r4.setType(r5)
            X.0YSQ r0 = X.InterfaceC876950Yaj.LIZ
            X.0Yaj r0 = X.C0YSQ.LIZIZ(r0)
            X.0Y8T r6 = r0.LIZ(r2)
            com.ss.android.ugc.aweme.im.service.model.IMChatExt r1 = new com.ss.android.ugc.aweme.im.service.model.IMChatExt
            r1.<init>()
            java.lang.String r0 = "msg_list"
            r1.commerceScene = r0
            com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams r3 = new com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams
            r3.<init>(r7, r4)
            r0 = 3
            r3.setEnterFrom(r0)
            X.15mM r0 = X.C20619615mM.LIZ
            r0.getClass()
            java.lang.String r0 = X.C20619615mM.LIZ()
            r3.setMobEnterMethodForEditShare(r0)
            r3.setSessionId(r2)
            r3.setChatExt(r1)
            r4 = 0
            r3.setHasCameraIcon(r4)
            if (r6 == 0) goto L9d
            long r1 = r6.getUnreadCount()
            int r0 = (int) r1
        L4e:
            r3.setUnreadCount(r0)
            r3.setRecommendedChat(r4)
            if (r6 == 0) goto L9b
            boolean r1 = r6.isStickTop()
            r0 = 1
            if (r1 != r0) goto L9b
        L5d:
            r3.setStickyTop(r0)
            if (r6 == 0) goto L6c
            X.0Y9l r0 = r6.getLastShowMessage()
            if (r0 == 0) goto L6c
            int r5 = r0.getMsgType()
        L6c:
            r3.setLastMessageMsgType(r5)
            if (r6 == 0) goto L7d
            X.0Y9l r0 = r6.getLastShowMessage()
            if (r0 == 0) goto L7d
            java.lang.String r0 = r0.getUuid()
            if (r0 != 0) goto L7f
        L7d:
            java.lang.String r0 = ""
        L7f:
            r3.setLastMsgUUId(r0)
            r3.setHighRiskConversation(r4)
            r3.setQuickChat(r9)
            r3.setEnterMethodForMob(r10)
            r3.setEnterFromForMob(r11)
            com.ss.android.ugc.aweme.im.service.IIMService r0 = X.C1336205Ku.LIZ(r4)
            com.ss.android.ugc.aweme.im.service.service.IIMChatService r1 = r0.getImChatService()
            r0 = 0
            r1.LJIILLIIL(r3, r0)
            return
        L9b:
            r0 = 0
            goto L5d
        L9d:
            r0 = 0
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C888370Yt9.LIZ(android.content.Context, com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo, boolean, java.lang.String, java.lang.String):void");
    }
}
