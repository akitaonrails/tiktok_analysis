package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.wheeexclusive.WheeExclusiveBubbleMessageListViewModel;
import java.util.Set;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ZHh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897110ZHh implements InterfaceC897100ZHg {
    public final Context LIZ;
    public final SessionInfo LIZIZ;
    public final WheeExclusiveBubbleMessageListViewModel LIZJ;
    public final ChatroomEventAbility LIZLLL;
    public final EnumC897070ZHd LJ = EnumC897070ZHd.WHEE_EXCLUSIVE_BUBBLE;
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(398));

    @Override // X.InterfaceC897100ZHg
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC897100ZHg
    public final EnumC897070ZHd getType() {
        return this.LJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x0313, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r10) < r2) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if (r2 != null) goto L27;
     */
    @Override // X.InterfaceC897100ZHg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.InterfaceC1233004s4> LIZIZ(java.util.List<? extends X.C869590Y9l> r19) {
        /*
            Method dump skipped, instruction units count: 845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C897110ZHh.LIZIZ(java.util.List):java.util.List");
    }

    public static String LIZLLL(C869590Y9l c869590Y9l, Set set) {
        String string;
        if (!C1226304qz.LIZ.contains(Integer.valueOf(c869590Y9l.getMsgType()))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("last_unread_unsupported_msg_type(msgType=");
            sbLIZ.append(c869590Y9l.getMsgType());
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        String strLIZ = C1628506Zf.LIZ(c869590Y9l);
        if (strLIZ == null || (string = a0.LJLIIIL(strLIZ).toString()) == null) {
            string = "";
        }
        if (string.length() == 0) {
            return "no_msg_bubble_resource_id";
        }
        C06IM.LIZ.getClass();
        if (C06IM.LIZIZ(string) == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("bubble_rid_not_in_experiment_config rid=");
            sbLIZ2.append(string);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (!set.contains(string)) {
            return null;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("bubble_rid_unlocked_in_profile rid=");
        sbLIZ3.append(string);
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public C897110ZHh(Context context, SessionInfo sessionInfo, WheeExclusiveBubbleMessageListViewModel wheeExclusiveBubbleMessageListViewModel, ChatroomEventAbility chatroomEventAbility) {
        this.LIZ = context;
        this.LIZIZ = sessionInfo;
        this.LIZJ = wheeExclusiveBubbleMessageListViewModel;
        this.LIZLLL = chatroomEventAbility;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence LIZJ(final com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r17, final java.lang.String r18, final android.content.Context r19, final com.ss.android.ugc.aweme.experiment.IndependentAppBubbleItem r20) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C897110ZHh.LIZJ(com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo, java.lang.String, android.content.Context, com.ss.android.ugc.aweme.experiment.IndependentAppBubbleItem):java.lang.CharSequence");
    }
}
