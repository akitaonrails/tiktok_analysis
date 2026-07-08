package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.service.risky.IDMRiskyKeywordsService;

/* JADX INFO: renamed from: X.0I6u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C461220I6u {
    public static final boolean LIZIZ(C869590Y9l c869590Y9l) {
        IDMRiskyKeywordsService iDMRiskyKeywordsService;
        TextContent textContent;
        if (C0ZDX.LJJJJZ(c869590Y9l) || (((iDMRiskyKeywordsService = (IDMRiskyKeywordsService) PluggableExtentionKt.pluggableSpiForReal(IDMRiskyKeywordsService.class)) != null && iDMRiskyKeywordsService.LIZ(c869590Y9l, false)) || c869590Y9l.getMsgType() != 7 || (textContent = (TextContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, TextContent.class)) == null || C432100Gwy.LIZ(textContent.getText()))) {
            return false;
        }
        return true;
    }

    public static final boolean LIZ(C869590Y9l c869590Y9l, SessionInfo sessionInfo, C0IBF c0ibf) {
        boolean z;
        int i;
        int msgType;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "im_live_reaction_mvp", true) != 1 || !C1865360ydq.LIZ() || C0ZDX.LJJJJIZL(c869590Y9l) || sessionInfo.isBotChat()) {
            return false;
        }
        boolean zIsSingleChat = sessionInfo.isSingleChat();
        if (C0ZNY.LIZ.LIZLLL(sessionInfo.getConversationId(), true) && sessionInfo.isGroupChat()) {
            z = true;
        } else {
            z = false;
        }
        if ((!zIsSingleChat && !z) || (i = C461230I6v.LIZ[c0ibf.ordinal()]) == 1 || i == 2 || (((msgType = c869590Y9l.getMsgType()) != 1802 && msgType != 1803 && msgType != 1809) || C0ZDX.LJJJJIZL(c869590Y9l))) {
            return false;
        }
        return true;
    }
}
