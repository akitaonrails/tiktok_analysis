package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupJoinRequestV2;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupJoinResponseV2;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i79, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.invitation.newdesign.utils.JoinGroupHelper$realJoin$1", f = "JoinGroupHelper.kt", l = {256}, m = "invokeSuspend")
public final class C1230050i79 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1230060i7A LLILLJJLI;
    public final /* synthetic */ AbstractC1230100i7E LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1230050i79(C1230060i7A c1230060i7A, AbstractC1230100i7E abstractC1230100i7E, InterfaceC1364105Vn<? super C1230050i79> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1230060i7A;
        this.LLILLL = abstractC1230100i7E;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1230050i79(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C23112093u c23112093u;
        int errorCode;
        long jLongValue;
        GroupJoinResponseV2 groupJoinResponseV2;
        int i;
        Object objLJI = obj;
        C1C7U.LIZ("JoinGroupHelper@86ca.realJoin$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        C0YMW c0ymw = null;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLJI);
            } else {
                C155000ia.LIZIZ(objLJI);
                C1229320i5y.LIZ(EnumC995320c0Y.READY_TO_ACCEPT);
                C913630Zsn.LJIIJJI.LJJIIZI();
                C900550ZUn c900550ZUn = C1230440i7m.LJ;
                C1230060i7A c1230060i7A = this.LLILLJJLI;
                C1229500i6G c1229500i6G = c1230060i7A.LJFF;
                LinkedHashMap linkedHashMap = new LinkedHashMap(c900550ZUn.LIZJ(c1229500i6G.LIZ, c1229500i6G.LIZIZ, c1230060i7A.LJIILIIL, null));
                C1230060i7A c1230060i7A2 = this.LLILLJJLI;
                String str = c1230060i7A2.LJII.get("comment_id");
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                linkedHashMap.put("comment_id", str);
                if (c1230060i7A2.LJIILIIL == null) {
                    String str3 = c1230060i7A2.LJII.get("invite_enter_from");
                    if (str3 == null) {
                        str3 = "";
                    }
                    linkedHashMap.put("invite_enter_from", str3);
                    String str4 = c1230060i7A2.LJII.get("invite_enter_method");
                    if (str4 == null) {
                        str4 = "";
                    }
                    linkedHashMap.put("invite_enter_method", str4);
                    String str5 = c1230060i7A2.LJII.get("invite_event");
                    if (str5 == null) {
                        str5 = "";
                    }
                    linkedHashMap.put("invite_event", str5);
                }
                String str6 = c1230060i7A2.LJII.get("a:et_chat_type");
                if (str6 == null) {
                    str6 = "";
                }
                linkedHashMap.put("join_chat_type", str6);
                String str7 = c1230060i7A2.LJII.get("a:et_group_type");
                if (str7 != null) {
                    str2 = str7;
                }
                linkedHashMap.put("join_group_type", str2);
                C1230060i7A c1230060i7A3 = this.LLILLJJLI;
                String str8 = c1230060i7A3.LJIIL;
                Long lLJIILIIL = C2095008Iq.LJIILIIL(c1230060i7A3.LJI);
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
                int value = this.LLILLJJLI.LIZJ.getValue();
                C1230060i7A c1230060i7A4 = this.LLILLJJLI;
                GroupJoinRequestV2 groupJoinRequestV2 = new GroupJoinRequestV2(str8, jLongValue, value, c1230060i7A4.LJIILJJIL, c1230060i7A4.LIZLLL.getValue(), linkedHashMap);
                C1DFB c1dfb = C0PEM.LIZJ;
                C1230070i7B c1230070i7B = new C1230070i7B(groupJoinRequestV2, null);
                this.LL = 1;
                objLJI = C23250099c.LJI(this, c1dfb, c1230070i7B);
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("JoinGroupHelper@86ca.realJoin$1");
                    return objLJFF;
                }
            }
            groupJoinResponseV2 = (GroupJoinResponseV2) objLJI;
            C1229320i5y.LIZ(EnumC995320c0Y.FINISH_ACCEPT);
            if (groupJoinResponseV2.popupMeta.userGroupStatus == EnumC1229960i70.IN_GROUP.getValue()) {
                C1230060i7A c1230060i7A5 = this.LLILLJJLI;
                C1229500i6G c1229500i6G2 = c1230060i7A5.LJFF;
                C1230370i7f.LIZIZ(c1229500i6G2.LIZ, c1229500i6G2.LIZIZ, c1230060i7A5.LJI, groupJoinResponseV2.status_code, groupJoinResponseV2.popupMeta.userGroupStatus, c1230060i7A5.LJII);
            }
            i = (int) groupJoinResponseV2.toastMeta.statusCode;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1229320i5y.LIZ(EnumC995320c0Y.FINISH_ACCEPT);
            boolean z = e instanceof C0XIR;
            if (z) {
                c23112093u = (C23112093u) e;
            } else {
                c23112093u = null;
            }
            if (c23112093u != null) {
                errorCode = c23112093u.getErrorCode();
            } else {
                errorCode = -1;
            }
            C1229320i5y.LJFF(new C1229340i60(errorCode, 0, C0ZBV.ABNORMAL_FAIL, 2));
            if (z) {
                C0YMX c0ymxNewBuilder = C0YMW.newBuilder();
                C0XIR c0xir = (C0XIR) e;
                c0ymxNewBuilder.LIZ.status = c0xir.getErrorCode();
                String errorMsg = c0xir.getErrorMsg();
                c0ymw = c0ymxNewBuilder.LIZ;
                c0ymw.statusMsg = errorMsg;
            }
            this.LLILLL.LIZ(this.LLILLJJLI.LIZ.getString(2131835079), c0ymw);
        }
        if (i != 0) {
            C1229320i5y.LJFF(new C1229340i60(i, 0, C0ZBV.BUSINESS_FAIL, 2));
            this.LLILLL.LIZ(groupJoinResponseV2.toastMeta.text, null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("JoinGroupHelper@86ca.realJoin$1");
            return unit;
        }
        C1229970i71 c1229970i71 = EnumC1229960i70.Companion;
        int i3 = groupJoinResponseV2.popupMeta.userGroupStatus;
        c1229970i71.getClass();
        EnumC1229960i70 enumC1229960i70LIZ = C1229970i71.LIZ(i3);
        C1229320i5y.LJFF(new C1229340i60(0, groupJoinResponseV2.popupMeta.userGroupStatus, C0ZBV.SUCCESS, 1));
        AbstractC1230100i7E abstractC1230100i7E = this.LLILLL;
        InterfaceC1229620i6S interfaceC1229620i6S = abstractC1230100i7E.LIZ;
        if (interfaceC1229620i6S != null) {
            interfaceC1229620i6S.LIZJ(enumC1229960i70LIZ, groupJoinResponseV2.popupMeta);
        }
        abstractC1230100i7E.LIZIZ(enumC1229960i70LIZ, groupJoinResponseV2);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("JoinGroupHelper@86ca.realJoin$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
