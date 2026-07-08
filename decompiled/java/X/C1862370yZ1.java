package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageExt;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageSender;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoEditInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoReferenceInfo;

/* JADX INFO: renamed from: X.0yZ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862370yZ1 {
    public static C1862400yZ4 LIZ(Message message) {
        String json;
        String json2;
        try {
            if (!C07IB.LIZ() && message.isMultiAnswer) {
                TakoMixFeed takoMixFeedLJI = message.LJI();
                if (takoMixFeedLJI != null) {
                    message.msgContent = C1860390yVp.LIZJ(takoMixFeedLJI);
                }
                TakoMixFeed takoMixFeedLJII = message.LJII();
                if (takoMixFeedLJII != null) {
                    message.multiMsgContent = C1860390yVp.LIZJ(takoMixFeedLJII);
                }
            } else {
                TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
                if (takoMixFeedLJIIIZ != null) {
                    message.msgContent = C1860390yVp.LIZJ(takoMixFeedLJIIIZ);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String str = message.msgId;
        String str2 = message.uuid;
        String str3 = message.conversationId;
        String str4 = message.subConversationId;
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        String str6 = message.subSessionId;
        long j = message.actionId;
        long j2 = message.botId;
        int i = message.LIZIZ;
        int i2 = message.msgType;
        MessageSender messageSender = message.sender;
        int i3 = messageSender.senderType;
        long j3 = messageSender.botId;
        long j4 = messageSender.userId;
        boolean z = messageSender.isSelf;
        MessageExt messageExt = message.ext;
        long j5 = messageExt.log;
        int i4 = messageExt.activeActionBar;
        Integer num = messageExt.activeTemplateType;
        String str7 = messageExt.hashTags;
        int i5 = messageExt.activeAiImageSubBar;
        String str8 = messageExt.imageShortcutKey;
        String str9 = message.sessionId;
        long j6 = message.serverTime;
        int i6 = message.version;
        String str10 = message.msgContent;
        String str11 = message.multiMsgContent;
        boolean z2 = message.isMultiAnswer;
        int i7 = message.selectedAnswerIndex;
        boolean z3 = message.isDegraded;
        long j7 = message.LIZLLL;
        int i8 = message.LJ;
        long j8 = message.serverSeq;
        long j9 = message.subServerSeq;
        int i9 = message.serverStatus;
        String str12 = message.replyMsgId;
        String str13 = message.replyUuid;
        boolean z4 = message.LIZ;
        int i10 = message.channel;
        String json3 = GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), message.LIZJ);
        String json4 = GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), message.LJI);
        long j10 = message.LJII;
        Boolean bool = message.LJIIIIZZ;
        int i11 = message.genStyle;
        String str14 = message.versionId;
        long j11 = message.versionSeq;
        boolean z5 = message.isHidden;
        int i12 = message.retried;
        int i13 = message.hidePushMessageImageButton;
        MessageExt messageExt2 = message.ext;
        String str15 = messageExt2.modeSource;
        Integer num2 = messageExt2.aigcStandardRatio;
        String str16 = messageExt2.inputSkillMode;
        String str17 = messageExt2.imageTemplateId;
        String str18 = messageExt2.imageTabId;
        String str19 = messageExt2.imageTemplateTab;
        String str20 = messageExt2.imageStyleName;
        TakoEditInfo takoEditInfo = message.editInfo;
        if (takoEditInfo == null || (json = GsonProtectorUtils.toJson(C597040NbK.LIZ(), takoEditInfo)) == null) {
            json = "";
        }
        TakoReferenceInfo takoReferenceInfo = message.referenceInfo;
        if (takoReferenceInfo != null && (json2 = GsonProtectorUtils.toJson(C597040NbK.LIZ(), takoReferenceInfo)) != null) {
            str5 = json2;
        }
        return new C1862400yZ4(str2, str, j8, j9, str3, str4, str6, j2, j, i, i2, i3, j3, j4, z, j6, j7, str9, i6, str10, str11, z2, i7, z3, i9, j5, i4, num, str7, i5, str8, i8, str13, str12, z4, i10, json3, json4, j10, bool, i11, str14, j11, z5, i12, i13, str15, num2, str16, str17, str18, str19, str20, json, str5, message.isPush, message.ext.isUnchangedTakoTemplate, message.isRegenDeprecated, C1855920yOc.LIZLLL(message));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0159 A[Catch: Exception -> 0x01db, TRY_ENTER, TryCatch #0 {Exception -> 0x01db, blocks: (B:7:0x0163, B:9:0x0167, B:10:0x0177, B:6:0x0159), top: B:17:0x0163 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.tako.ccl.model.api.Message LIZIZ(X.C1862400yZ4 r90) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1862370yZ1.LIZIZ(X.0yZ4):com.ss.android.ugc.aweme.tako.ccl.model.api.Message");
    }
}
