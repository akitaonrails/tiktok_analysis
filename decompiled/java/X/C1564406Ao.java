package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.StreakInlineMsgInfo;
import com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS32S1101000_2;
import njp.a;

/* JADX INFO: renamed from: X.06Ao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.inline.StreakInlineMsgInsertHelper$tryInsertRemindInlineMsg$1", f = "StreakInlineMsgInsertHelper.kt", l = {}, m = "invokeSuspend")
public final class C1564406Ao extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<String> LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1564406Ao(int i, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1564406Ao(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakInlineMsgInsertHelper@52a0.tryInsertRemindInlineMsg$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<String> list = this.LL;
        int i = this.LLILLJJLI;
        for (String str : list) {
            InterfaceC1564806As.LIZIZ.getClass();
            C1575806Ey.LIZJ.getClass();
            StreakData streakDataLJIIIIZZ = C1575806Ey.LJIIIIZZ(str);
            if (streakDataLJIIIIZZ == null) {
                C1590906Kt.LIZIZ("InlineMsgHelper: triggerRemind: streakData == null");
            } else {
                EnumC1579606Gk enumC1579606GkLJIIIIZZ = C1567806Bw.LJIIIIZZ(streakDataLJIIIIZZ, false);
                if (enumC1579606GkLJIIIIZZ != EnumC1579606Gk.SECONDARY_ACTIVE) {
                    boolean z = C1590906Kt.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("InlineMsgHelper: triggerRemind: streak status invalid, status=");
                    sbLIZ.append(enumC1579606GkLJIIIIZZ);
                    C1590906Kt.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    C0Y8T c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(str);
                    if (c0y8tLJIL == null) {
                        C1590906Kt.LIZIZ("InlineMsgHelper: triggerRemind: conversation == null");
                    } else if (c0y8tLJIL.getConversationType() == AbstractC1711506n3.LIZIZ) {
                        C06FO c06fo = C06FO.LIZ;
                        c06fo.getClass();
                        long j = streakDataLJIIIIZZ.remindAt;
                        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
                        long j3 = j * j2;
                        if (System.currentTimeMillis() < j3) {
                            C1590906Kt.LIZ("InlineMsgHelper: tryInsertRemindInlineMsgForGroupChat, it's not the time to remind");
                        } else {
                            C1564306An.LIZ.getClass();
                            String conversationId = c0y8tLJIL.getConversationId();
                            if (c0y8tLJIL.isDissolved()) {
                                C1590906Kt.LIZ("InlineMsgHelper: tryInsertRemindInlineMsgForGroupChat, conv is dissolved");
                            } else if (!c0y8tLJIL.isMember()) {
                                C1590906Kt.LIZ("InlineMsgHelper: tryInsertRemindInlineMsgForGroupChat, is not member already");
                            } else if (c0y8tLJIL.getMemberCount() <= 1) {
                                C1590906Kt.LIZ("InlineMsgHelper: tryInsertRemindInlineMsgForGroupChat, member count <= 1");
                            } else {
                                c06fo.getClass();
                                long j4 = streakDataLJIIIIZZ.activeBefore * j2;
                                String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                                if (curUserId == null) {
                                    curUserId = "";
                                }
                                if (C866950Xzh.LIZIZ(((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZ.LJIILIIL().LJLILLLLZI(c0y8tLJIL.getConversationId(), j4, curUserId))) {
                                    C1590906Kt.LIZ("InlineMsgHelper: tryInsertRemindInlineMsgForGroupChat, has sent message already");
                                } else {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(curUserId);
                                    sbLIZ2.append('-');
                                    sbLIZ2.append(conversationId);
                                    sbLIZ2.append("-streak_insert_remind_inline_msg_time");
                                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                    C01GW c01gw = C1564306An.LIZIZ;
                                    if (((Keva) c01gw.getValue()).getLong(strLIZIZ, 0L) >= j3) {
                                        C1590906Kt.LIZ("InlineMsgHelper: tryInsertRemindInlineMsgForGroupChat, has inserted remind inline msg already");
                                    } else {
                                        long lastMessageOrderIndex = c0y8tLJIL.getLastMessageOrderIndex();
                                        boolean z2 = C1590906Kt.LIZ;
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append("InlineMsgHelper: tryInsertRemindInlineMsgForGroupChat, insert remind inline msg, orderIndex=");
                                        sbLIZ3.append(lastMessageOrderIndex);
                                        C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                                        c06fo.getClass();
                                        StreakInlineMsgInfo streakInlineMsgInfo = new StreakInlineMsgInfo(1, C06FO.LIZ(streakDataLJIIIIZZ) * j2, lastMessageOrderIndex);
                                        StreakLocalExtHelper.LIZ.getClass();
                                        StreakLocalExtHelper.LIZ(new AwS32S1101000_2(conversationId, 1, streakInlineMsgInfo, 1));
                                        ((Keva) c01gw.getValue()).storeLong(strLIZIZ, j3);
                                    }
                                }
                            }
                        }
                    } else {
                        C1564306An.LIZ.getClass();
                        if (i == 2) {
                            long lastMessageOrderIndex2 = c0y8tLJIL.getLastMessageOrderIndex();
                            String conversationId2 = c0y8tLJIL.getConversationId();
                            C06FO.LIZ.getClass();
                            StreakInlineMsgInfo streakInlineMsgInfo2 = new StreakInlineMsgInfo(1, C06FO.LIZ(streakDataLJIIIIZZ) * ((long) LSPassThroughRecordSizeConfig.DEFAULT), lastMessageOrderIndex2);
                            StreakLocalExtHelper.LIZ.getClass();
                            StreakLocalExtHelper.LIZ(new AwS32S1101000_2(conversationId2, 1, streakInlineMsgInfo2, 1));
                        }
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakInlineMsgInsertHelper@52a0.tryInsertRemindInlineMsg$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
