package X;

import com.bytedance.im.core.internal.link.handler.statusupdater.CommandMessage;
import com.bytedance.im.core.proto.AckMessage;
import com.bytedance.im.core.proto.BatchAckMessageRequestBody;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.scene.Scene;
import java.util.List;

/* JADX INFO: renamed from: X.0YKU, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YKU {
    public final InterfaceC864330XvT LIZ;
    public final InterfaceC497601wk LIZIZ;
    public final C0YEM LIZJ;

    public C0YKU(InterfaceC864330XvT interfaceC864330XvT, InterfaceC497601wk interfaceC497601wk, C0YEM c0yem) {
        this.LIZ = interfaceC864330XvT;
        this.LIZIZ = interfaceC497601wk;
        this.LIZJ = c0yem;
    }

    public final void LIZLLL(long j, BatchAckMessageRequestBody batchAckMessageRequestBody, String str) {
        int iIntValue;
        for (AckMessage ackMessage : batchAckMessageRequestBody.ack_msgs) {
            if (this.LIZJ.LJIIZILJ().LJFF().getEventTracker().LIZJ(0.01f)) {
                C0YJ9 c0yj9 = new C0YJ9(this.LIZJ);
                c0yj9.LIZJ("imsdk_message_batch_ack");
                c0yj9.LIZ(ackMessage.server_msg_id, "server_msg_id");
                Integer num = ackMessage.inbox_type;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                c0yj9.LIZ(Integer.valueOf(iIntValue), "inbox_type");
                c0yj9.LIZ(Integer.valueOf(ackMessage.msg_type.getValue()), "msg_type");
                c0yj9.LIZ(Long.valueOf(j), "client_ack_cost");
                c0yj9.LIZ(ackMessage.scene, Scene.SCENE_SERVICE);
                c0yj9.LIZ(ackMessage.is_ws.toString(), "is_ws");
                c0yj9.LIZ(str, "log_id");
                c0yj9.LIZ(Integer.valueOf(ackMessage.cmd_type.getValue()), "cmd_type");
                c0yj9.LIZ(ackMessage.first_save_to_db.toString(), "first_save_to_db");
                c0yj9.LIZLLL();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(int r15, java.util.List r16, X.InterfaceC1364105Vn r17) {
        /*
            r14 = this;
            r4 = r17
            boolean r0 = r4 instanceof X.C0YKY
            if (r0 == 0) goto L26
            r3 = r4
            X.0YKY r3 = (X.C0YKY) r3
            int r2 = r3.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r3.LLILZIL = r2
        L14:
            java.lang.Object r6 = r3.LLILLL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r3.LLILZIL
            r4 = 1
            if (r0 == 0) goto L34
            if (r0 != r4) goto L2c
            long r0 = r3.LLILLJJLI
            com.bytedance.im.core.proto.BatchAckMessageRequestBody r2 = r3.LL
            goto L88
        L26:
            X.0YKY r3 = new X.0YKY
            r3.<init>(r14, r4)
            goto L14
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r6)
            X.0YKZ r0 = new X.0YKZ
            r0.<init>()
            r1 = r16
            X.C1516540pZE.LIZ(r1)
            r0.LIZLLL = r1
            com.bytedance.im.core.proto.BatchAckMessageRequestBody r2 = r0.build()
            X.1ES0 r0 = new X.1ES0
            r0.<init>()
            r0.LJJJ = r2
            com.bytedance.im.core.proto.RequestBody r8 = r0.build()
            X.0YMR r0 = X.C0YMR.BATCH_ACK_MESSAGE
            int r7 = r0.getValue()
            X.0YEM r0 = r14.LIZJ
            X.0YDx r9 = r0.LJ()
            X.0YEM r0 = r14.LIZJ
            X.0YEf r10 = r0.LJIIIZ()
            r11 = 0
            r6 = r15
            com.bytedance.im.core.proto.Request r8 = X.C0YLX.LIZ(r6, r7, r8, r9, r10, r11)
            long r0 = android.os.SystemClock.uptimeMillis()
            X.0XvT r6 = r14.LIZ     // Catch: X.C0Y8K -> Laf
            X.0YCX r7 = new X.0YCX     // Catch: X.C0Y8K -> Laf
            r9 = 0
            r11 = 0
            r13 = 506(0x1fa, float:7.09E-43)
            r10 = r9
            r7.<init>(r8, r9, r10, r11, r13)     // Catch: X.C0Y8K -> Laf
            r3.LL = r2     // Catch: X.C0Y8K -> Laf
            r3.LLILLJJLI = r0     // Catch: X.C0Y8K -> Laf
            r3.LLILZIL = r4     // Catch: X.C0Y8K -> Laf
            java.lang.Object r6 = r6.LLLIILIL(r7, r4, r3)     // Catch: X.C0Y8K -> Laf
            if (r6 != r5) goto L8b
            return r5
        L88:
            X.C155000ia.LIZIZ(r6)     // Catch: X.C0Y8K -> Laf
        L8b:
            X.0XwA r6 = (X.C864760XwA) r6     // Catch: X.C0Y8K -> Laf
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch: X.C0Y8K -> Laf
            long r3 = r3 - r0
            com.bytedance.im.core.proto.Response r0 = r6.LIZ     // Catch: X.C0Y8K -> Laf
            java.lang.Long r0 = r0.server_execution_end_time     // Catch: X.C0Y8K -> Laf
            long r7 = r0.longValue()     // Catch: X.C0Y8K -> Laf
            com.bytedance.im.core.proto.Response r0 = r6.LIZ     // Catch: X.C0Y8K -> Laf
            java.lang.Long r0 = r0.request_arrived_time     // Catch: X.C0Y8K -> Laf
            long r0 = r0.longValue()     // Catch: X.C0Y8K -> Laf
            long r7 = r7 - r0
            long r3 = r3 - r7
            r0 = 2
            long r0 = (long) r0     // Catch: X.C0Y8K -> Laf
            long r3 = r3 / r0
            com.bytedance.im.core.proto.Response r0 = r6.LIZ     // Catch: X.C0Y8K -> Laf
            java.lang.String r0 = r0.log_id     // Catch: X.C0Y8K -> Laf
            r14.LIZLLL(r3, r2, r0)     // Catch: X.C0Y8K -> Laf
            goto Lc0
        Laf:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.0YEM r0 = r14.LIZJ
            X.0Y6i r2 = r0.LIZLLL()
            java.lang.String r1 = "MessageBatchAckUseCase"
            java.lang.String r0 = "send batch ack error: "
            r2.LJIIIIZZ(r1, r0, r3)
        Lc0:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YKU.LJFF(int, java.util.List, X.05Vn):java.lang.Object");
    }

    public static void LIZIZ(C0YKU c0yku, List list, int i, boolean z) {
        C1DFH c1dfh = C0PEM.LIZ;
        c0yku.getClass();
        if ((!list.isEmpty()) && c0yku.LIZJ.LJIIIZ().LJJJJI) {
            C23250099c.LIZLLL(c0yku.LIZIZ, c1dfh, null, new C0YKT(list, c0yku, i, z, null), 2);
        }
    }

    public final AckMessage LIZ(MessageBody messageBody, int i, boolean z, boolean z2) {
        int i2;
        List<Integer> list = this.LIZJ.LJIIIZ().LJJJJJL.normalMessageTypes;
        List<Integer> list2 = this.LIZJ.LJIIIZ().LJJJJJL.cmdMessageTypes;
        List<Integer> list3 = this.LIZJ.LJIIIZ().LJJJJJL.commonCmdTypes;
        int iIntValue = messageBody.message_type.intValue();
        EnumC868450Y5b enumC868450Y5b = EnumC868450Y5b.MESSAGE_TYPE_STATUS;
        if (iIntValue < enumC868450Y5b.getValue()) {
            if (list.contains(messageBody.message_type)) {
                return LJ(messageBody, i, z, z2, EnumC872340YKa.CmdTypeUnknown);
            }
            return LIZJ(messageBody, i, z, z2, EnumC872340YKa.CmdTypeUnknown);
        }
        Integer num = messageBody.message_type;
        int value = enumC868450Y5b.getValue();
        if (num != null && num.intValue() == value) {
            return LJ(messageBody, i, z, z2, EnumC872340YKa.CmdTypeUnknown);
        }
        Integer num2 = messageBody.message_type;
        EnumC868450Y5b enumC868450Y5b2 = EnumC868450Y5b.MESSAGE_TYPE_COMMAND;
        int value2 = enumC868450Y5b2.getValue();
        Object obj = null;
        if (num2 != null && num2.intValue() == value2) {
            Object objLIZ = C0Y5X.LIZ(this.LIZJ, messageBody);
            if (!C189200o6.m7isFailureimpl(objLIZ)) {
                obj = objLIZ;
            }
            CommandMessage commandMessage = (CommandMessage) obj;
            if (commandMessage != null) {
                i2 = commandMessage.type;
            } else {
                i2 = -1;
            }
            EnumC872340YKa enumC872340YKaFromValue = EnumC872340YKa.fromValue(i2);
            if (list3.contains(Integer.valueOf(i2))) {
                if (enumC872340YKaFromValue == null) {
                    enumC872340YKaFromValue = EnumC872340YKa.CmdTypeUnknown;
                }
                return LIZJ(messageBody, i, z, z2, enumC872340YKaFromValue);
            }
            if (enumC872340YKaFromValue == null) {
                enumC872340YKaFromValue = EnumC872340YKa.CmdTypeUnknown;
            }
            return LJ(messageBody, i, z, z2, enumC872340YKaFromValue);
        }
        if (messageBody.message_type.intValue() <= enumC868450Y5b2.getValue()) {
            return null;
        }
        if (list2.contains(messageBody.message_type)) {
            return LIZJ(messageBody, i, z, z2, EnumC872340YKa.CmdTypeUnknown);
        }
        return LJ(messageBody, i, z, z2, EnumC872340YKa.CmdTypeUnknown);
    }

    public static AckMessage LIZJ(MessageBody messageBody, int i, boolean z, boolean z2, EnumC872340YKa enumC872340YKa) {
        EnumC869400Y8s enumC869400Y8sFromValue = EnumC869400Y8s.fromValue(messageBody.conversation_type.intValue());
        EnumC868450Y5b enumC868450Y5bFromValue = EnumC868450Y5b.fromValue(messageBody.message_type.intValue());
        C0YKW c0ykw = new C0YKW();
        c0ykw.LJFF = enumC868450Y5bFromValue;
        c0ykw.LJIIIIZZ = enumC869400Y8sFromValue;
        c0ykw.LJII = Integer.valueOf(i);
        c0ykw.LJ = Boolean.valueOf(z);
        c0ykw.LIZLLL = messageBody.server_message_id.toString();
        String str = messageBody.scene;
        if (str == null) {
            str = "";
        }
        c0ykw.LJI = str;
        c0ykw.LJIIIZ = enumC872340YKa;
        c0ykw.LJIIJ = Boolean.valueOf(z2);
        return c0ykw.build();
    }

    public final AckMessage LJ(MessageBody messageBody, int i, boolean z, boolean z2, EnumC872340YKa enumC872340YKa) {
        if (messageBody.server_message_id.longValue() % ((long) this.LIZJ.LJIIIZ().LJJJJJL.divisor) == 0) {
            return LIZJ(messageBody, i, z, z2, enumC872340YKa);
        }
        return null;
    }
}
