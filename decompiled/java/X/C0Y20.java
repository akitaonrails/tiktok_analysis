package X;

import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Y20, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.sendmsg.SendMsgUseCase$send$dbUpdate$1", f = "SendMsgUseCase.kt", l = {}, m = "invokeSuspend")
public final class C0Y20 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C0YC5 LLILZ;
    public final /* synthetic */ C0Y8T LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y20(boolean z, C869590Y9l c869590Y9l, String str, C0YC5 c0yc5, C0Y8T c0y8t, InterfaceC1364105Vn<? super C0Y20> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = c869590Y9l;
        this.LLILLL = str;
        this.LLILZ = c0yc5;
        this.LLILZIL = c0y8t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Y20(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C07ZY c07zy;
        C1C7U.LIZ("SendMsgUseCase@4b94.send$dbUpdate$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            String str = this.LLILLJJLI.getLocalExt().get("s:sdk_ref_msg_id");
            if (Intrinsics.LJFF(str, this.LLILLL)) {
                c07zy = C07ZY.LIZJ;
            } else if (str == null) {
                String[] strArr = {"s:sdk_ref_msg_id"};
                if (strArr.length == 0) {
                    c07zy = C07ZY.LIZJ;
                } else {
                    c07zy = new C07ZY(C2097608Jq.LJ(), C13LQ.LJJLIIIJLJLI(strArr));
                }
            } else {
                Map mapLIZJ = C2097908Jt.LIZJ(new Pair("s:sdk_ref_msg_id", str));
                if (mapLIZJ.isEmpty()) {
                    c07zy = C07ZY.LIZJ;
                } else {
                    c07zy = new C07ZY(new HashMap(mapLIZJ), C08CX.INSTANCE);
                }
            }
            C867960Y3e.LIZIZ(this.LLILZ.LIZJ.LJI(), this.LLILLJJLI, c07zy, false, true);
        } else {
            this.LLILZ.LIZJ.LJI().LJLIIL(this.LLILLJJLI, false, true);
        }
        C0YC5 c0yc5 = this.LLILZ;
        C869590Y9l c869590Y9l = this.LLILLJJLI;
        C0Y8T c0y8tLIZ = c0yc5.LIZIZ.LJIIZILJ().LIZLLL().LIZ().LIZ(c869590Y9l.getConversationId());
        if ((c0y8tLIZ != null || (c0y8tLIZ = c0yc5.LIZJ.LJIIJJI().LIZ(c869590Y9l.getConversationId(), false)) != null) && c0y8tLIZ.getLastMessageIndex() < c869590Y9l.getIndex()) {
            c0yc5.LIZJ.LJIIJJI().LJJJLZIJ(c869590Y9l);
        }
        C0YC5 c0yc52 = this.LLILZ;
        C0Y8T c0y8t = this.LLILZIL;
        C869590Y9l c869590Y9l2 = this.LLILLJJLI;
        c0yc52.getClass();
        C869590Y9l lastShowMessage = c0y8t.getLastShowMessage();
        if (lastShowMessage == null || lastShowMessage.getIndex() < c869590Y9l2.getIndex()) {
            c0y8t.setLastShowMessage(c869590Y9l2);
            c0y8t.setLastMessageIndex(c869590Y9l2.getIndex());
            C0Y2U.LJ(c0y8t, c0yc52.LIZIZ, c869590Y9l2.getCreatedAt(), c869590Y9l2);
            c0y8t.setUpdatedTime(c869590Y9l2.getCreatedAt());
            c0yc52.LIZIZ.LJIIZILJ().LIZLLL().LIZLLL().LJJL(2, c0y8t);
        }
        C0YC5 c0yc53 = this.LLILZ;
        C869590Y9l c869590Y9l3 = this.LLILLJJLI;
        c0yc53.getClass();
        ReferenceInfo referenceInfo = c869590Y9l3.getReferenceInfo();
        if (referenceInfo != null) {
            try {
                String strLJIILL = C09EF.LIZ.LJIILL(referenceInfo);
                C869620Y9o c869620Y9oLIZJ = c0yc53.LIZJ.LIZJ();
                String uuid = c869590Y9l3.getUuid();
                String conversationId = c869590Y9l3.getConversationId();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ref_");
                sbLIZ.append(referenceInfo.referenced_message_id);
                c869620Y9oLIZJ.LLII(uuid, conversationId, C2188811AlT.LIZIZ(sbLIZ), strLJIILL);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c0yc53.LIZIZ.LJIIZILJ().LJFF().getEventTracker().LIZLLL("SendMsgUseCase", e);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SendMsgUseCase@4b94.send$dbUpdate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
