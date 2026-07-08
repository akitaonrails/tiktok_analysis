package X;

import Y.ARunnableS19S1100000_14;
import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetConversationInfoV2RequestBody;
import com.bytedance.im.core.proto.GetConversationInfoV2ResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.ParticipantsPage;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0Y1f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867450Y1f extends AbstractC867440Y1e<C0Y8T> {
    public C0Y8T LJ;
    public long LJFF;

    @Override // X.AbstractC867440Y1e
    public final boolean LJ() {
        return true;
    }

    public C867450Y1f(C0YEM c0yem) {
        super(c0yem, C0YMR.GET_CONVERSATION_INFO_V2.getValue(), null);
    }

    @Override // X.AbstractC867440Y1e
    public final boolean LJIIIIZZ(C0YIN c0yin) {
        GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody;
        ResponseBody responseBody = c0yin.LLIZ.body;
        if (responseBody != null && (getConversationInfoV2ResponseBody = responseBody.get_conversation_info_v2_body) != null && getConversationInfoV2ResponseBody.conversation_info != null) {
            return true;
        }
        return false;
    }

    public final void LJIILIIL(String str) {
        if (this.LIZJ.LJIIIZ().LJJLIIIIJ.LJIJJLI) {
            this.LIZJ.LJIIL().LIZIZ().execute(new ARunnableS19S1100000_14(this, str, 4));
        } else {
            LJIILJJIL(str);
        }
    }

    public final void LJIILJJIL(String str) {
        C0Y8T c0y8tLIZ = this.LIZJ.LJIIZILJ().LIZLLL().LIZ().LIZ(str);
        if (c0y8tLIZ == null) {
            c0y8tLIZ = this.LIZJ.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI().LIZ(str, true);
        }
        LJIILLIIL(c0y8tLIZ);
    }

    public final void LJIILL(long j) {
        C0Y8T c0y8tLJIILIIL = this.LIZJ.LJIIZILJ().LIZLLL().LIZ().LJIILIIL(j);
        if (c0y8tLJIILIIL == null) {
            c0y8tLJIILIIL = this.LIZJ.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI().LJIJ(j, true);
        }
        LJIILLIIL(c0y8tLJIILIIL);
    }

    public final void LJIILLIIL(C0Y8T c0y8t) {
        if (c0y8t != null && !c0y8t.isTemp()) {
            String conversationId = c0y8t.getConversationId();
            if (((CopyOnWriteArraySet) this.LIZJ.LJIIZILJ().getDomain().LIZIZ.LIZJ).contains(conversationId)) {
                C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("hasGettingConversation: ");
                sbLIZ.append(conversationId);
                c868780Y6iLIZLLL.LJIILL(C2188811AlT.LIZIZ(sbLIZ));
                LIZ(C0YIN.LJFF(this.LIZJ, -1018));
                return;
            }
            int inboxType = c0y8t.getInboxType();
            long conversationShortId = c0y8t.getConversationShortId();
            int conversationType = c0y8t.getConversationType();
            long updatedTime = c0y8t.getUpdatedTime();
            synchronized (this) {
                LJIIJJI(inboxType, conversationType, conversationShortId, updatedTime, conversationId, false);
            }
            return;
        }
        LIZ(C0YIN.LJFF(this.LIZJ, -1017));
    }

    public C867450Y1f(C0YEM c0yem, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        super(c0yem, C0YMR.GET_CONVERSATION_INFO_V2.getValue(), interfaceC863600XuI);
    }

    @Override // X.AbstractC867440Y1e
    public final void LJII(final C0YIN c0yin, final C0Y1G c0y1g) {
        final String str = (String) c0yin.LLILZIL[0];
        final int iIntValue = c0yin.LLILZLL.inbox_type.intValue();
        final long jUptimeMillis = SystemClock.uptimeMillis();
        ((CopyOnWriteArraySet) this.LIZJ.LJIIZILJ().getDomain().LIZIZ.LIZJ).remove(str);
        C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Get Conversation Info finish: ");
        sbLIZ.append(str);
        c868780Y6iLIZLLL.LJIILL(C2188811AlT.LIZIZ(sbLIZ));
        if (c0yin.LJIIJJI() && LJIIIIZZ(c0yin)) {
            final long jLongValue = ((Long) c0yin.LLILZIL[3]).longValue();
            final ConversationInfoV2 conversationInfoV2 = c0yin.LLIZ.body.get_conversation_info_v2_body.conversation_info;
            this.LIZJ.LJIIJJI().LIZJ(new InterfaceC872410YKh<Pair<C0Y8T, Boolean>>() { // from class: X.0Y1S
                @Override // X.InterfaceC872410YKh
                public final Pair<C0Y8T, Boolean> LIZ() {
                    Integer num = conversationInfoV2.conversation_core_info.inbox_type;
                    Pair<C0Y8T, Boolean> pairLJIJJ = C867450Y1f.LJIJJ(this.LJ.LIZJ, num != null ? num.intValue() : iIntValue, jLongValue, conversationInfoV2, c0yin.LJIIIZ());
                    if (pairLJIJJ != null) {
                        this.LJ.LIZJ.LJIIZILJ().LIZLLL().LIZLLL().LJJL(5, (C0Y8T) pairLJIJJ.first);
                        if (conversationInfoV2.first_page_participants != null) {
                            this.LJ.LIZJ.LJIIZILJ().LIZLLL().LIZLLL().LJII(((C0Y8T) pairLJIJJ.first).getConversationId(), ((C0Y8T) pairLJIJJ.first).getMembers());
                        }
                    }
                    return pairLJIJJ;
                }
            }, new InterfaceC864800XwE<Pair<C0Y8T, Boolean>>() { // from class: X.0Y1M
                @Override // X.InterfaceC864800XwE
                public final void LIZ(Pair<C0Y8T, Boolean> pair) {
                    int iIntValue2;
                    Boolean bool;
                    Pair<C0Y8T, Boolean> pair2 = pair;
                    int i = -3001;
                    if (pair2 != null) {
                        C0Y8T c0y8t = (C0Y8T) pair2.first;
                        ParticipantsPage participantsPage = conversationInfoV2.first_page_participants;
                        if (participantsPage != null && (bool = participantsPage.has_more) != null && bool.booleanValue()) {
                            new C0Y1J(this.LJFF.LIZJ).LJIIL(c0y8t.getConversationId());
                        }
                        this.LJFF.LIZJ(c0y8t);
                        this.LJFF.LIZJ.LJIIZILJ().getDomain().LIZIZ.LJIIJJI(iIntValue, str);
                        i = C0YIF.LIZ;
                    } else {
                        C867450Y1f c867450Y1f = this.LJFF;
                        c867450Y1f.LIZ(C0YIN.LJFF(c867450Y1f.LIZJ, -3001));
                    }
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    C867450Y1f c867450Y1f2 = this.LJFF;
                    String str2 = str;
                    Integer num = conversationInfoV2.conversation_type;
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = -1;
                    }
                    c867450Y1f2.LJIJI(iIntValue2, jUptimeMillis2 - this.LJFF.LJFF, jUptimeMillis2 - jUptimeMillis, i, str2);
                    c0y1g.run();
                }
            }, false, this.LIZJ.LJIIL().LIZJ());
        } else if (C0Y81.LJ(c0yin.LLIZ, this.LIZJ.LJIIIZ().LJJJJJ)) {
            this.LIZJ.LJIIZILJ().LIZLLL().LIZLLL().LJJLIIIJLLLLLLLZ(c0yin.LJI(), new InterfaceC863600XuI<C0Y8T>() { // from class: X.0Y1N
                @Override // X.InterfaceC863600XuI
                public final void LIZIZ(C0YMW c0ymw) {
                    this.LJFF.LJIIZILJ(c0yin, str, c0y1g, jUptimeMillis);
                }

                @Override // X.InterfaceC863600XuI
                public final void onSuccess(C0Y8T c0y8t) {
                    this.LJFF.LIZJ(c0y8t);
                    this.LJFF.LIZJ.LJIIZILJ().getDomain().LIZIZ.LJIIJJI(iIntValue, str);
                }
            }, str);
        } else {
            LJIIZILJ(c0yin, str, c0y1g, jUptimeMillis);
        }
    }

    public static C0Y8T LJIJJLI(C0YEM c0yem, int i, MessageBody messageBody) {
        if (messageBody == null) {
            return null;
        }
        return LJIL(c0yem, i, messageBody.conversation_id, messageBody.conversation_short_id.longValue(), messageBody.conversation_type.intValue(), messageBody.create_time.longValue(), 0, 0L, null);
    }

    public final void LJIIZILJ(C0YIN c0yin, String str, Runnable runnable, long j) {
        LIZ(c0yin);
        runnable.run();
        if (c0yin.LLJ <= -1000 && this.LJ != null) {
            this.LIZJ.LJIIZILJ().LIZLLL().LIZLLL().LJJL(6, this.LJ);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        LJIJI(-1, jUptimeMillis - this.LJFF, jUptimeMillis - j, c0yin.LLJ, str);
    }

    public static void LJIJ(C0YEM c0yem, String str, int i, long j, int i2) {
        C0YJ9 c0yj9 = new C0YJ9(c0yem);
        c0yj9.LIZJ("imsdk_insert_conversation");
        c0yj9.LIZ(str, "conversation_id");
        c0yj9.LIZ(Integer.valueOf(i), "conversation_type");
        c0yj9.LIZ(Long.valueOf(j), "local_cost_time");
        c0yj9.LIZ(Integer.valueOf(i2), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0yj9.LIZLLL();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc A[Catch: Exception -> 0x00f7, TRY_ENTER, TryCatch #4 {Exception -> 0x00f7, blocks: (B:23:0x00c0, B:30:0x00ce, B:29:0x00cc), top: B:67:0x00c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd A[Catch: Exception -> 0x00f5, TryCatch #5 {Exception -> 0x00f5, blocks: (B:31:0x00d4, B:35:0x00e1, B:37:0x00ea, B:34:0x00dd), top: B:69:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea A[Catch: Exception -> 0x00f5, TryCatch #5 {Exception -> 0x00f5, blocks: (B:31:0x00d4, B:35:0x00e1, B:37:0x00ea, B:34:0x00dd), top: B:69:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair LJIJJ(X.C0YEM r25, int r26, long r27, com.bytedance.im.core.proto.ConversationInfoV2 r29, java.lang.String r30) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C867450Y1f.LJIJJ(X.0YEM, int, long, com.bytedance.im.core.proto.ConversationInfoV2, java.lang.String):android.util.Pair");
    }

    public final void LJIJI(int i, long j, long j2, int i2, String str) {
        C0YJ9 c0yj9 = new C0YJ9(this.LIZJ);
        c0yj9.LIZJ("imsdk_pull_conv_info");
        c0yj9.LIZ(str, "conversation_id");
        c0yj9.LIZ(Integer.valueOf(i), "conversation_type");
        c0yj9.LIZ(Long.valueOf(j), "total_cost_time");
        c0yj9.LIZ(Long.valueOf(j2), "local_cost_time");
        c0yj9.LIZ(Integer.valueOf(i2), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0yj9.LIZLLL();
    }

    public final synchronized void LJIIJJI(int i, int i2, long j, long j2, String str, boolean z) {
        LJIIL(i, i2, str, j, j2, z);
    }

    public final synchronized void LJIIL(final int i, final int i2, final String str, final long j, final long j2, boolean z) {
        if (!z) {
            if (((CopyOnWriteArraySet) this.LIZJ.LJIIZILJ().getDomain().LIZIZ.LIZJ).contains(str)) {
                C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("hasGettingConversation: ");
                sbLIZ.append(str);
                c868780Y6iLIZLLL.LJIILL(C2188811AlT.LIZIZ(sbLIZ));
                C0YMW c0ymw = C0YMW.newBuilder().LIZ;
                c0ymw.code = -1020;
                LIZIZ(c0ymw);
                return;
            }
        }
        this.LJFF = SystemClock.uptimeMillis();
        this.LIZJ.LJIIL().LIZIZ().execute(new Runnable() { // from class: X.0Y1c
            public final /* synthetic */ int LLILZLL = 0;

            public final void LIZ() {
                C867450Y1f c867450Y1f = this.LLIZ;
                c867450Y1f.LJ = c867450Y1f.LIZJ.LJIIZILJ().LIZLLL().LIZ().LIZ(str);
                C0Y8T c0y8t = this.LLIZ.LJ;
                if (c0y8t != null && c0y8t.isTemp() && this.LLIZ.LJ.getConversationType() == AbstractC1711506n3.LIZIZ) {
                    C868780Y6i c868780Y6iLIZLLL2 = this.LLIZ.LIZJ.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("conv is group chat and still temp: ");
                    sbLIZ2.append(str);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    c868780Y6iLIZLLL2.getClass();
                    C868780Y6i.LJIILLIIL(c868780Y6iLIZLLL2, "GetConvInfo", strLIZIZ, 4);
                    C867450Y1f c867450Y1f2 = this.LLIZ;
                    c867450Y1f2.LIZ(C0YIN.LJFF(c867450Y1f2.LIZJ, -1017));
                    return;
                }
                C867450Y1f c867450Y1f3 = this.LLIZ;
                if (c867450Y1f3.LJ == null) {
                    c867450Y1f3.LJ = C867450Y1f.LJIL(c867450Y1f3.LIZJ, i, str, j, i2, j2, this.LLILZLL, 0L, null);
                }
                int inboxType = i;
                C0Y8T c0y8t2 = this.LLIZ.LJ;
                if (c0y8t2 != null) {
                    inboxType = c0y8t2.getInboxType();
                }
                C867430Y1d c867430Y1d = new C867430Y1d();
                c867430Y1d.LIZLLL = str;
                c867430Y1d.LJ = Long.valueOf(j);
                c867430Y1d.LJFF = Integer.valueOf(i2);
                GetConversationInfoV2RequestBody getConversationInfoV2RequestBodyBuild = c867430Y1d.build();
                C1ES0 c1es0 = new C1ES0();
                c1es0.LJIJJLI = getConversationInfoV2RequestBodyBuild;
                this.LLIZ.LJIIIZ(inboxType, c1es0.build(), null, str, Long.valueOf(j), Integer.valueOf(i2), Long.valueOf(j2));
                ((CopyOnWriteArraySet) this.LLIZ.LIZJ.LJIIZILJ().getDomain().LIZIZ.LIZJ).add(str);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("GetConversationInfoHandler@b454.get$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("GetConversationInfoHandler@b454.get$1");
            }
        });
    }

    public static C0Y8T LJIL(C0YEM c0yem, int i, String str, long j, int i2, long j2, int i3, long j3, C869590Y9l c869590Y9l) {
        C0Y9J c0y9jLIZIZ = c0yem.LJIIZILJ().LIZIZ().LIZIZ();
        C0Y8T c0y8t = null;
        try {
            if (c0y9jLIZIZ.LJIIJJI().LJJIIZI(str)) {
                C868780Y6i c868780Y6iLIZLLL = c0yem.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("syncBuildLocalConversation: convId=");
                sbLIZ.append(str);
                sbLIZ.append(", already has local");
                c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
            if (c0y9jLIZIZ.LJIIJJI().LJJIJ(j)) {
                C868780Y6i c868780Y6iLIZLLL2 = c0yem.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("syncBuildLocalConversation: convShortId=");
                sbLIZ2.append(j);
                sbLIZ2.append(", already has local");
                c868780Y6iLIZLLL2.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
                return null;
            }
            C868780Y6i c868780Y6iLIZLLL3 = c0yem.LIZLLL();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("syncBuildLocalConversation: convId=");
            sbLIZ3.append(str);
            sbLIZ3.append(", shortId=");
            sbLIZ3.append(j);
            sbLIZ3.append(", type=");
            sbLIZ3.append(i2);
            sbLIZ3.append(", time=");
            sbLIZ3.append(j2);
            sbLIZ3.append(", badge version=");
            sbLIZ3.append(j3);
            sbLIZ3.append(", badge count=");
            sbLIZ3.append(i3);
            c868780Y6iLIZLLL3.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ3));
            C0Y8T c0y8t2 = new C0Y8T();
            try {
                c0y8t2.setInboxType(i);
                c0y8t2.setConversationId(str);
                c0y8t2.setConversationShortId(j);
                c0y8t2.setConversationType(i2);
                c0y8t2.setUpdatedTime(j2);
                if (c0y8t2.isSingleChat()) {
                    ArrayList arrayList = new ArrayList();
                    long uid = c0yem.getUid();
                    arrayList.add(Long.valueOf(uid));
                    arrayList.add(Long.valueOf(C2124408Ty.LIZIZ(uid, str)));
                    c0y8t2.setMemberIds(arrayList);
                    c0y8t2.setMemberCount(2);
                }
                c0y8t2.setIsMember(true);
                if (c869590Y9l != null && C868510Y5h.LJFF(c0yem, c869590Y9l)) {
                    c0y8t2.setLastMessageIndex(c869590Y9l.getIndex());
                    c0y8t2.setLastShowMessage(c869590Y9l);
                    c0y8t2.setMaxIndexV2(c869590Y9l.getIndexInConversationV2());
                } else {
                    c0y8t2.setLastMessageIndex(c0y9jLIZIZ.LJI().LJJIIJ(str));
                    c0y8t2.setLastShowMessage(c0y9jLIZIZ.LJI().LJJIIJZLJL(str));
                    c0y8t2.setMaxIndexV2(0L);
                }
                if (j3 > 0) {
                    c0y8t2.updateBadgeCount(i3, j3);
                }
                C867610Y1v.LIZ(c0yem, c0y8t2, c869590Y9l, false);
                HashMap map = new HashMap();
                map.put("s:conv_wait_info", "1");
                c0y8t2.setLocalExt(map);
                if (!c0y9jLIZIZ.LJIIJJI().LJJIJL(0, c0y8t2)) {
                    return null;
                }
                return c0y8t2;
            } catch (Exception e) {
                e = e;
                c0y8t = c0y8t2;
                TryCatchGuardChecker.doCheck(e);
                c0yem.LIZLLL().LJIIIZ("GetConversationInfoHandler syncBuildLocalConversation", e);
                c0yem.LJIIZILJ().LJFF().getEventTracker().LIZLLL("GetConversationInfoHandler syncBuildLocalConversation", e);
                return c0y8t;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
