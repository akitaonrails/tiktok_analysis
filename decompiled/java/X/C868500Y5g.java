package X;

import android.text.TextUtils;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.status_message.RecallMessageEntity;
import com.bytedance.im.core.proto.status_message.RecallMessageValue;
import com.bytedance.im.core.proto.status_message.StatusMessage;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS6S0201100_14;

/* JADX INFO: renamed from: X.0Y5g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868500Y5g implements InterfaceC868830Y6n, InterfaceC868920Y6w {
    public final C0YEM LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final C0Y82 LJ;
    public final long LJFF;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0025 A[PHI: r2
      0x0025: PHI (r2v2 java.lang.String) = (r2v1 java.lang.String), (r2v5 java.lang.String) binds: [B:3:0x0011, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC868920Y6w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0Y7K LIZ(com.bytedance.im.core.proto.MessageBody r5) {
        /*
            r4 = this;
            X.0YEM r0 = r4.LIZ
            X.0Y6i r3 = r0.LIZLLL()
            java.lang.String r2 = "recall message"
            r1 = 4
            java.lang.String r0 = "RecallMessageUpdater"
            X.C868780Y6i.LJIILJJIL(r3, r0, r2, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r5.ext
            r2 = 0
            if (r1 == 0) goto L25
            java.lang.String r0 = "s:server_message_id"
            java.lang.Object r2 = r1.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "s:recall_uid"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L27
        L25:
            java.lang.String r0 = ""
        L27:
            java.lang.Integer r1 = r5.message_type
            int r1 = r1.intValue()
            X.0Y7K r0 = r4.LIZJ(r2, r0, r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C868500Y5g.LIZ(com.bytedance.im.core.proto.MessageBody):X.0Y7K");
    }

    @Override // X.InterfaceC868830Y6n
    public final C0Y7K LIZIZ(MessageBody messageBody, StatusMessage statusMessage, int i) {
        String string;
        String string2;
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "RecallMessageUpdater", "recall message from statusMessage", 4);
        try {
            Long l = RecallMessageEntity.ADAPTER.decode(statusMessage.entity).server_message_id;
            if (l != null) {
                string = l.toString();
            } else {
                string = null;
            }
            Long l2 = RecallMessageValue.ADAPTER.decode(statusMessage.value).recall_message_uid;
            if (l2 == null || (string2 = l2.toString()) == null) {
                string2 = "";
            }
            return LIZJ(string, string2, messageBody, statusMessage.type.intValue());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIIZZ("RecallMessageUpdater", "decode RecallMessage StatusMessage", e);
            return new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, e.getMessage(), (Integer) null, 12);
        }
    }

    /* JADX WARN: Not initialized variable reg: 7, insn: 0x009f: IGET (r0 I:X.0YEM) = (r7 I:X.0Y5g) (LINE:67109023) X.0Y5g.LIZ X.0YEM, block:B:23:0x009c */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0Y5g] */
    public final C0Y7K LIZJ(String str, String str2, MessageBody messageBody, int i) throws Throwable {
        ?? r7;
        long j;
        AwS6S0201100_14 awS6S0201100_14;
        try {
            if (TextUtils.isEmpty(str)) {
                C868780Y6i.LJ(this.LIZ.LIZLLL(), "RecallMessageUpdater", "No server message id is found.", 4);
                return new C867580Y1s(null);
            }
            C869580Y9k c869580Y9kLJI = this.LIZ.LJIIZILJ().LIZIZ().LIZIZ().LJI();
            if (str != null) {
                j = CastLongProtector.parseLong(str);
            } else {
                j = 0;
            }
            C869590Y9l c869590Y9lLJJJ = c869580Y9kLJI.LJJJ(j);
            if (c869590Y9lLJJJ == null) {
                C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("msg to recalled is not found: ");
                sbLIZ.append(str);
                C868780Y6i.LJ(c868780Y6iLIZLLL, "RecallMessageUpdater", C2188811AlT.LIZIZ(sbLIZ), 4);
                return new C0Y3A(EnumC868890Y6t.ENTITY_MISSING, "Message not found", (Integer) null, 12);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            InterfaceC868170Y3z interfaceC868170Y3zLIZJ = this.LIZ.LJIIZILJ().getDomain().LIZJ();
            if (this.LIZ.LJIIIZ().LJJLIIIIJ.LJIILIIL.isEnabled()) {
                awS6S0201100_14 = new AwS6S0201100_14(this, messageBody, jCurrentTimeMillis, i, 2);
            } else {
                awS6S0201100_14 = null;
            }
            interfaceC868170Y3zLIZJ.LLIIII(c869590Y9lLJJJ, str2, awS6S0201100_14);
            return new C867630Y1x(null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            r7.LIZ.LIZLLL().LJIIIIZZ("RecallMessageUpdater", e.getMessage(), null);
            return new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, e.getMessage(), (Integer) null, 12);
        }
    }

    public C868500Y5g(int i, int i2, long j, C0YEM c0yem, C0Y82 c0y82, String str) {
        this.LIZ = c0yem;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = i2;
        this.LJ = c0y82;
        this.LJFF = j;
    }
}
