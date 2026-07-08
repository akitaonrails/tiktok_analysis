package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.06An, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1564306An {
    public static final C1564306An LIZ = new C1564306An();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1465));

    public static Pair LIZ(String str) {
        List listLJJLIIIJILLIZJL;
        long jLongValue;
        Long lLJIILIIL;
        String strLJFF = C0YNP.LJFF(str, "streak_insert_end_inline_msg_info");
        if (strLJFF != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLJFF, new String[]{":"}, 0, 6)) != null) {
            String str2 = (String) C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL);
            if (str2 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            Object objLJJJLZIJ = C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL);
            if (objLJJJLZIJ == null) {
                objLJJJLZIJ = "";
            }
            return new Pair(Long.valueOf(jLongValue), objLJJJLZIJ);
        }
        return null;
    }

    public static void LIZLLL(int i, List list) {
        if (!C06FS.LIZ().enableInlineMsg) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1564406Ao(i, list, null), 3);
    }

    public static void LIZIZ(long j, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append(':');
        sbLIZ.append(str2);
        C0YNP.LJIIIIZZ(str, "streak_insert_end_inline_msg_info", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZJ(List list, int i, Function1 function1) {
        long jLongValue;
        boolean z;
        int iIntValue;
        C869590Y9l lastShowMessage;
        long jLongValue2;
        C1736806r8 c1736806r8LIZIZ;
        String str;
        Long lLJIILIIL;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (C1567806Bw.LIZIZ(str2) == AbstractC1711506n3.LIZIZ) {
                InterfaceC1564806As.LIZIZ.getClass();
                C1575806Ey.LIZJ.getClass();
                StreakData streakDataLJIIIIZZ = C1575806Ey.LJIIIIZZ(str2);
                if (streakDataLJIIIIZZ == null) {
                    boolean z2 = C1590906Kt.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("InlineMsgHelper: tryInsertEndInlineMsg, streak data is null, triggerReason=");
                    sbLIZ.append(i);
                    C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                } else if (C1567806Bw.LJIIIIZZ(streakDataLJIIIIZZ, false) != EnumC1579606Gk.EXPIRED) {
                    boolean z3 = C1590906Kt.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("InlineMsgHelper: tryInsertEndInlineMsg, streak status is not expired, triggerReason=");
                    sbLIZ2.append(i);
                    C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                } else {
                    LIZ.getClass();
                    Pair pairLIZ = LIZ(str2);
                    if (pairLIZ != null) {
                        jLongValue = ((Number) pairLIZ.getFirst()).longValue();
                    } else {
                        jLongValue = 0;
                    }
                    long jLIZ = C1567806Bw.LIZ(streakDataLJIIIIZZ);
                    if (jLongValue >= jLIZ) {
                        C1590906Kt.LIZ("InlineMsgHelper: insertEndInlineMsgInner, has inserted end inline msg already");
                    } else {
                        C0Y8T c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(str2);
                        if (c0y8tLJIL == null) {
                            C1577606Fq.LIZIZ.getClass();
                            C1577606Fq.LIZJ("conv_is_null", str2, jLIZ, streakDataLJIIIIZZ);
                            boolean z4 = C1590906Kt.LIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("InlineMsgHelper: insertEndInlineMsgInner, conv is null, triggerReason=");
                            sbLIZ3.append(i);
                            C1590906Kt.LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
                        } else if (c0y8tLJIL.isDissolved()) {
                            C1577606Fq.LIZIZ.getClass();
                            C1577606Fq.LIZJ("dissolved", str2, jLIZ, streakDataLJIIIIZZ);
                            C1590906Kt.LIZ("InlineMsgHelper: insertEndInlineMsgInner, conv is dissolved");
                        } else if (!c0y8tLJIL.isMember()) {
                            C1577606Fq.LIZIZ.getClass();
                            C1577606Fq.LIZJ("is_not_member", str2, jLIZ, streakDataLJIIIIZZ);
                            LIZIZ(jLIZ, str2, "");
                            C1590906Kt.LIZ("InlineMsgHelper: insertEndInlineMsgInner, is not member already");
                        } else {
                            if (c0y8tLJIL.getMemberCount() >= 2 && streakDataLJIIIIZZ.remainRestoreCnt > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            long j = streakDataLJIIIIZZ.restoreAvailableTime;
                            int i2 = streakDataLJIIIIZZ.streak;
                            Integer num = streakDataLJIIIIZZ.level;
                            if (num != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            C06N2 c06n2 = new C06N2(i2, iIntValue, j, z, jLIZ);
                            if (i == 1) {
                                lastShowMessage = c0y8tLJIL.getLastShowMessage();
                            } else {
                                List listLJJJJLI = ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZ.LJIILIIL().LJJJJLI(c0y8tLJIL.getConversationId(), jLIZ);
                                if (listLJJJJLI == null || (lastShowMessage = (C869590Y9l) C13LP.LJJJLZIJ(0, listLJJJJLI)) == null) {
                                    lastShowMessage = c0y8tLJIL.getLastShowMessage();
                                }
                            }
                            String conversationId = c0y8tLJIL.getConversationId();
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("end_");
                            sbLIZ4.append(conversationId);
                            sbLIZ4.append('_');
                            sbLIZ4.append(streakDataLJIIIIZZ.activeBefore);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                            C1684506ih c1684506ih = new C1684506ih();
                            c1684506ih.LIZLLL(21);
                            String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                            if (curUserId != null && (lLJIILIIL = C2095008Iq.LJIILIIL(curUserId)) != null) {
                                jLongValue2 = lLJIILIIL.longValue();
                            } else {
                                jLongValue2 = 0;
                            }
                            c1684506ih.LIZLLL = Long.valueOf(jLongValue2);
                            c1684506ih.LJFF = c06n2;
                            c1684506ih.LIZJ = strLIZIZ;
                            if (lastShowMessage != null) {
                                c1684506ih.LJ = lastShowMessage;
                            }
                            FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpiForReal(FakeMsgOperatorService.class);
                            C869590Y9l c869590Y9l = null;
                            if (fakeMsgOperatorService != null) {
                                c1736806r8LIZIZ = fakeMsgOperatorService.LIZIZ(c0y8tLJIL.getConversationId(), c1684506ih, null, null, null);
                            } else {
                                c1736806r8LIZIZ = null;
                            }
                            boolean z5 = C1590906Kt.LIZ;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("InlineMsgHelper: insertEndInlineMsgInner, ");
                            sbLIZ5.append(c0y8tLJIL.getConversationId());
                            sbLIZ5.append(" msgUuid=");
                            sbLIZ5.append(strLIZIZ);
                            sbLIZ5.append(", result=");
                            sbLIZ5.append(c1736806r8LIZIZ);
                            sbLIZ5.append(' ');
                            if (c1736806r8LIZIZ != null) {
                                c869590Y9l = c1736806r8LIZIZ.LIZJ;
                            }
                            sbLIZ5.append(c869590Y9l);
                            C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
                            if (c1736806r8LIZIZ != null && strLIZIZ != null) {
                                C1577606Fq c1577606Fq = C1577606Fq.LIZIZ;
                                if (z) {
                                    str = "success_restore";
                                } else {
                                    str = "success_end";
                                }
                                c1577606Fq.getClass();
                                C1577606Fq.LIZJ(str, str2, jLIZ, streakDataLJIIIIZZ);
                                function1.invoke(str2);
                                LIZIZ(jLIZ, str2, strLIZIZ);
                            }
                        }
                    }
                }
            }
        }
    }
}
