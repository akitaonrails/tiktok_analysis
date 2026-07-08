package X;

import android.os.Message;
import com.bytedance.ies.im.core.send.MessageQueue;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YTh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.send.MessageTaskQueue$enqueue$1$2", f = "MessageTaskQueue.kt", l = {}, m = "invokeSuspend")
public final class C874750YTh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C874740YTg LL;
    public final /* synthetic */ InterfaceC874870YTt LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C874750YTh(InterfaceC874870YTt interfaceC874870YTt, C874740YTg c874740YTg, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c874740YTg;
        this.LLILLJJLI = interfaceC874870YTt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C874750YTh(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Boolean boolValueOf;
        C1C7U.LIZ("MessageTaskQueue@6ce8.enqueue$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C874740YTg c874740YTg = this.LL;
        C0YTZ c0ytz = (C0YTZ) this.LLILLJJLI;
        C0Y8T c0y8tLIZ = c874740YTg.LIZJ.LIZ(c0ytz.LJFF);
        if (c0y8tLIZ != null && !c0y8tLIZ.isTemp()) {
            c0ytz.LJIIIIZZ(true);
            c0ytz.LJFF(new C0Y3I("enqueue new message in message task queue"), c0y8tLIZ);
        } else {
            c0ytz.LJIIIIZZ(false);
            if (C0YNP.LJII(c0ytz.LJFF) <= 0) {
                z = true;
            } else {
                z = false;
            }
            MessageQueue messageQueue = (MessageQueue) c874740YTg.LIZLLL.getValue();
            messageQueue.getClass();
            C882400YjW.LIZ.getClass();
            C882400YjW.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("enqueue[");
            sbLIZ.append(c0ytz.LJFF);
            sbLIZ.append("]: ");
            sbLIZ.append(c0ytz);
            sbLIZ.append(", ");
            Integer numValueOf = null;
            if (c0y8tLIZ != null) {
                boolValueOf = Boolean.valueOf(c0y8tLIZ.isTemp());
            } else {
                boolValueOf = null;
            }
            sbLIZ.append(boolValueOf);
            C882690Yjz.LJIIIZ("MsgSender_MQ", C2188811AlT.LIZIZ(sbLIZ));
            Map map = (Map) messageQueue.LLILLJJLI.getValue();
            String str = c0ytz.LJFF;
            synchronized (messageQueue) {
                Set set = (Set) map.get(str);
                C0YUF c0yufLIZLLL = C882400YjW.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("putPayload[");
                sbLIZ2.append(str);
                sbLIZ2.append("]: ");
                if (set != null) {
                    numValueOf = Integer.valueOf(set.size());
                }
                sbLIZ2.append(numValueOf);
                C2188811AlT.LIZIZ(sbLIZ2);
                C882690Yjz.LJ("MsgSender_MQ");
                if (set == null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    linkedHashSet.add(c0ytz);
                    map.put(str, linkedHashSet);
                } else {
                    set.add(c0ytz);
                }
            }
            if (c0y8tLIZ != null && c0y8tLIZ.isTemp()) {
                c0ytz.LJI(c0y8tLIZ);
            }
            C882400YjW.LIZLLL();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("bookTimeOut[");
            sbLIZ3.append(c0ytz.LJFF);
            sbLIZ3.append(']');
            C2188811AlT.LIZIZ(sbLIZ3);
            C882690Yjz.LJ("MsgSender_MQ");
            Message message = new Message();
            message.what = c0ytz.LIZ;
            message.obj = c0ytz.LJFF;
            messageQueue.sendMessageDelayed(message, 10000L);
            ((C874760YTi) c874740YTg.LJ.getValue()).LIZJ(c0ytz.LJFF, z);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageTaskQueue@6ce8.enqueue$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
