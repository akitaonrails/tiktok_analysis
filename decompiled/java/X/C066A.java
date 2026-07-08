package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.066A, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.inline.StreakInlineMsgInsertHelper$tryInsertPetHatchingRemindInlineMsg$1", f = "StreakInlineMsgInsertHelper.kt", l = {}, m = "invokeSuspend")
public final class C066A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C066A(String str, InterfaceC1364105Vn<? super C066A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C066A(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C869590Y9l lastShowMessage;
        Activity activityLIZIZ;
        Activity activityLIZ;
        Long lLJIILIIL;
        List listLJJLIIIJILLIZJL;
        long jLongValue;
        Long lLJIILIIL2;
        C1C7U.LIZ("StreakInlineMsgInsertHelper@52a0.tryInsertPetHatchingRemindInlineMsg$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C06C6 c06c6 = C06C6.LIZIZ;
        String str = this.LL;
        c06c6.getClass();
        StreakPetData streakPetDataLIZIZ = C06C6.LIZIZ(str);
        if (streakPetDataLIZIZ == null) {
            C1590906Kt.LIZIZ("InlineMsgHelper: triggerPetRemind: streakPetData == null");
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StreakInlineMsgInsertHelper@52a0.tryInsertPetHatchingRemindInlineMsg$1");
            return unit;
        }
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJ = C069P.LIZ().LJ().LJ(String.valueOf(C0YNP.LJII(this.LL)), null);
        if (iMUserLJ != null && iMUserLJ.getFollowStatus() == 2) {
            long jLongValue2 = -1;
            long jLongValue3 = 0;
            if (C1571306Df.LJI(streakPetDataLIZIZ)) {
                long j = streakPetDataLIZIZ.hatchingTimestampInSeconds;
                if (j > 0) {
                    long jLIZJ = C1571306Df.LIZJ(C1205004nY.LIZJ, C1205004nY.LIZIZ, j);
                    if (jLIZJ > 0 && C1567806Bw.LJI() >= jLIZJ) {
                        C0Y8T c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(this.LL);
                        if (c0y8tLJIL == null) {
                            C1590906Kt.LIZIZ("InlineMsgHelper: insertStreakPetHatchingRemindInlineMsgInner: conversation == null");
                            Unit unit2 = Unit.LIZ;
                            C1C7U.LIZIZ("StreakInlineMsgInsertHelper@52a0.tryInsertPetHatchingRemindInlineMsg$1");
                            return unit2;
                        }
                        if (c0y8tLJIL.isGroupChat()) {
                            C1590906Kt.LIZIZ("InlineMsgHelper: insertStreakPetHatchingRemindInlineMsgInner: conversation type is group chat");
                            Unit unit3 = Unit.LIZ;
                            C1C7U.LIZIZ("StreakInlineMsgInsertHelper@52a0.tryInsertPetHatchingRemindInlineMsg$1");
                            return unit3;
                        }
                        C1564306An c1564306An = C1564306An.LIZ;
                        String str2 = this.LL;
                        c1564306An.getClass();
                        String strLJFF = C0YNP.LJFF(str2, "streak_pet_hatching_insert_remind_inline_msg_info");
                        if (strLJFF != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLJFF, new String[]{":"}, 0, 6)) != null) {
                            String str3 = (String) C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL);
                            if (str3 != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(str3)) != null) {
                                jLongValue = lLJIILIIL2.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            Object objLJJJLZIJ = C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL);
                            if (objLJJJLZIJ == null) {
                                objLJJJLZIJ = "";
                            }
                            jLongValue2 = ((Number) new Pair(Long.valueOf(jLongValue), objLJJJLZIJ).getFirst()).longValue();
                        }
                        if (jLongValue2 >= jLIZJ) {
                            C1590906Kt.LIZ("InlineMsgHelper: insertPetHatchingInlineMsgInner, has inserted pet hatching remind inline msg already");
                            Unit unit4 = Unit.LIZ;
                            C1C7U.LIZIZ("StreakInlineMsgInsertHelper@52a0.tryInsertPetHatchingRemindInlineMsg$1");
                            return unit4;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        C066B c066b = new C066B(jCurrentTimeMillis);
                        List listLJJJJLI = ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZ.LJIILIIL().LJJJJLI(c0y8tLJIL.getConversationId(), jCurrentTimeMillis);
                        if (listLJJJJLI == null || (lastShowMessage = (C869590Y9l) C13LP.LJJJLZIJ(0, listLJJJJLI)) == null) {
                            lastShowMessage = c0y8tLJIL.getLastShowMessage();
                        }
                        String string = UUID.randomUUID().toString();
                        C1684506ih c1684506ih = new C1684506ih();
                        c1684506ih.LIZLLL(30);
                        C0I0B c0i0b = C0I0B.LJFF;
                        String curUserId = ((C1400340mXo) c0i0b.LIZ()).getCurUserId();
                        if (curUserId != null && (lLJIILIIL = C2095008Iq.LJIILIIL(curUserId)) != null) {
                            jLongValue3 = lLJIILIIL.longValue();
                        }
                        c1684506ih.LIZLLL = Long.valueOf(jLongValue3);
                        c1684506ih.LJFF = c066b;
                        c1684506ih.LIZJ = string;
                        if (lastShowMessage != null) {
                            c1684506ih.LJ = lastShowMessage;
                        }
                        FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpiForReal(FakeMsgOperatorService.class);
                        if (fakeMsgOperatorService != null && fakeMsgOperatorService.LIZIZ(c0y8tLJIL.getConversationId(), c1684506ih, null, null, null) != null && string != null) {
                            String str4 = this.LL;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(jLIZJ);
                            sbLIZ.append(':');
                            sbLIZ.append(string);
                            C0YNP.LJIIIIZZ(str4, "streak_pet_hatching_insert_remind_inline_msg_info", C2188811AlT.LIZIZ(sbLIZ));
                        }
                        c0i0b.LIZJ();
                        if (C894660Z7w.LIZLLL()) {
                            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                            if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                                c1389890mGx.LJIIJ("insert fake hatch egg remind");
                                c1389890mGx.LJIIJJI();
                            } else {
                                Unit unit5 = Unit.LIZ;
                                C1C7U.LIZIZ("StreakInlineMsgInsertHelper@52a0.tryInsertPetHatchingRemindInlineMsg$1");
                                return unit5;
                            }
                        }
                        Unit unit6 = Unit.LIZ;
                        C1C7U.LIZIZ("StreakInlineMsgInsertHelper@52a0.tryInsertPetHatchingRemindInlineMsg$1");
                        return unit6;
                    }
                }
            }
            C1590906Kt.LIZ("InlineMsgHelper: insertStreakPetHatchingRemindInlineMsgInner, it's not the time to remind");
            Unit unit7 = Unit.LIZ;
            C1C7U.LIZIZ("StreakInlineMsgInsertHelper@52a0.tryInsertPetHatchingRemindInlineMsg$1");
            return unit7;
        }
        Unit unit8 = Unit.LIZ;
        C1C7U.LIZIZ("StreakInlineMsgInsertHelper@52a0.tryInsertPetHatchingRemindInlineMsg$1");
        return unit8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
