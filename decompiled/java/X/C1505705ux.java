package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel$markAction$1", f = "SmartReplySuggestedReplyViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1505705ux extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SmartReplySuggestedReplyViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1505705ux(SmartReplySuggestedReplyViewModel smartReplySuggestedReplyViewModel, InterfaceC1364105Vn<? super C1505705ux> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = smartReplySuggestedReplyViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1505705ux(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        C0Y8T c0y8tYQ2;
        Long lLJIILIIL;
        InterfaceC1411705fn interfaceC1411705fn;
        long jCurrentTimeMillis2;
        long jCurrentTimeMillis3;
        long jCurrentTimeMillis4;
        long jCurrentTimeMillis5;
        long jCurrentTimeMillis6;
        C1C7U.LIZ("SmartReplySuggestedReplyViewModel@aef2.markAction$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.LLJILLL) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SmartReplySuggestedReplyViewModel@aef2.markAction$1");
            return unit;
        }
        this.LL.LLJILLL = true;
        C054L.LIZ.getClass();
        C01GW c01gw = C054L.LIZJ;
        InterfaceC1411705fn interfaceC1411705fn2 = (InterfaceC1411705fn) c01gw.getValue();
        if (interfaceC1411705fn2 != null) {
            IMHostApi iMHostApi = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
            if (iMHostApi != null) {
                jCurrentTimeMillis6 = iMHostApi.LIZIZ();
            } else {
                jCurrentTimeMillis6 = System.currentTimeMillis();
            }
            if (interfaceC1411705fn2.LIZIZ(jCurrentTimeMillis6, "")) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("SmartReplySuggestedReplyViewModel@aef2.markAction$1");
                return unit2;
            }
        }
        C01GW c01gw2 = C054L.LIZIZ;
        InterfaceC1411705fn interfaceC1411705fn3 = (InterfaceC1411705fn) c01gw2.getValue();
        if (interfaceC1411705fn3 != null) {
            IMHostApi iMHostApi2 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
            if (iMHostApi2 != null) {
                jCurrentTimeMillis4 = iMHostApi2.LIZIZ();
            } else {
                jCurrentTimeMillis4 = System.currentTimeMillis();
            }
            IMHostApi iMHostApi3 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
            if (iMHostApi3 != null) {
                jCurrentTimeMillis5 = iMHostApi3.LIZIZ();
            } else {
                jCurrentTimeMillis5 = System.currentTimeMillis();
            }
            interfaceC1411705fn3.LIZLLL(jCurrentTimeMillis4, jCurrentTimeMillis5, "");
        }
        InterfaceC1411705fn interfaceC1411705fn4 = (InterfaceC1411705fn) c01gw2.getValue();
        if (interfaceC1411705fn4 != null) {
            IMHostApi iMHostApi4 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
            if (iMHostApi4 != null) {
                jCurrentTimeMillis = iMHostApi4.LIZIZ();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            if (interfaceC1411705fn4.LIZIZ(jCurrentTimeMillis, "") && (c0y8tYQ2 = this.LL.yQ2()) != null) {
                String string = UUID.randomUUID().toString();
                String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                if (curUserId != null && (lLJIILIIL = C2095008Iq.LJIILIIL(curUserId)) != null) {
                    long jLongValue = lLJIILIIL.longValue();
                    C1684506ih c1684506ih = new C1684506ih();
                    c1684506ih.LIZLLL(49);
                    c1684506ih.LIZLLL = Long.valueOf(jLongValue);
                    c1684506ih.LIZJ = string;
                    C869590Y9l lastShowMessage = c0y8tYQ2.getLastShowMessage();
                    if (lastShowMessage != null) {
                        c1684506ih.LJ = lastShowMessage;
                    }
                    FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpiForReal(FakeMsgOperatorService.class);
                    if (fakeMsgOperatorService != null && fakeMsgOperatorService.LIZIZ(c0y8tYQ2.getConversationId(), c1684506ih, null, null, null) != null && (interfaceC1411705fn = (InterfaceC1411705fn) c01gw.getValue()) != null) {
                        IMHostApi iMHostApi5 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                        if (iMHostApi5 != null) {
                            jCurrentTimeMillis2 = iMHostApi5.LIZIZ();
                        } else {
                            jCurrentTimeMillis2 = System.currentTimeMillis();
                        }
                        IMHostApi iMHostApi6 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                        if (iMHostApi6 != null) {
                            jCurrentTimeMillis3 = iMHostApi6.LIZIZ();
                        } else {
                            jCurrentTimeMillis3 = System.currentTimeMillis();
                        }
                        interfaceC1411705fn.LIZLLL(jCurrentTimeMillis2, jCurrentTimeMillis3, "");
                    }
                }
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("SmartReplySuggestedReplyViewModel@aef2.markAction$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
