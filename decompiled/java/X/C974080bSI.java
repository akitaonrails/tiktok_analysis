package X;

import com.bytedance.android.livesdk.livesetting.linkmic.cohost.InteractionSourceTypeMatchStatusMap;

/* JADX INFO: renamed from: X.0bSI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974080bSI {
    public static final /* synthetic */ int LIZ = 0;

    public static EnumC975850bV9 LIZ(Integer num) {
        if (num == null) {
            return EnumC975850bV9.UNKNOWN;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("convert sourceType:");
        sbLIZ.append(num);
        C20441214yg.LIZIZ("SourceTypeMatchStatusConverter", C2188811AlT.LIZIZ(sbLIZ));
        InteractionSourceTypeMatchStatusMap interactionSourceTypeMatchStatusMap = InteractionSourceTypeMatchStatusMap.INSTANCE;
        if (interactionSourceTypeMatchStatusMap.isAutoMatchInviterFromJsb(num.intValue())) {
            return EnumC975850bV9.AUTO_MATCH_INVITER_FROM_JSB;
        }
        if (interactionSourceTypeMatchStatusMap.isInviterFromProfile(num.intValue())) {
            return EnumC975850bV9.INVITER_FROM_PROFILE;
        }
        if (interactionSourceTypeMatchStatusMap.isSoloInviterFromJSB(num.intValue())) {
            return EnumC975850bV9.SOLO_INVITER_FROM_JSB;
        }
        if (interactionSourceTypeMatchStatusMap.isInviterFromFriendRank(num.intValue())) {
            return EnumC975850bV9.INVITER_FROM_FRIEND_RANK;
        }
        return EnumC975850bV9.UNKNOWN;
    }
}
