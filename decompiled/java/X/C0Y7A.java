package X;

import com.bytedance.im.core.proto.MessageBody;

/* JADX INFO: renamed from: X.0Y7A, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y7A {
    public final C0YEM LIZ;

    public C0Y7A(C0YEM c0yem) {
        this.LIZ = c0yem;
    }

    public final void LIZ(C0Y7K c0y7k, C0Y7D c0y7d, MessageBody messageBody) {
        String string;
        String string2;
        String string3;
        C0YCE c0yceLJII = this.LIZ.LJIIZILJ().getMessage().LJII();
        c0yceLJII.getClass();
        long j = c0y7d.LJI;
        long jLongValue = messageBody.server_message_id.longValue();
        int i = c0y7k.LIZ;
        Integer num = c0y7k.LIZJ;
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        String strValueOf = "";
        if (string == null) {
            string = "";
        }
        String str = c0y7k.LIZIZ;
        if (str == null) {
            str = "";
        }
        int i2 = c0y7d.LIZLLL;
        long j2 = c0y7d.LIZ;
        int i3 = c0y7d.LIZIZ;
        String str2 = c0y7d.LIZJ;
        Long l = messageBody.server_message_id;
        if (l == null || (string2 = l.toString()) == null) {
            string2 = "";
        }
        String str3 = messageBody.conversation_id;
        if (str3 == null) {
            str3 = "";
        }
        int i4 = c0y7d.LJ;
        int i5 = c0y7d.LJFF;
        Integer num2 = messageBody.message_type;
        if (num2 == null || (string3 = num2.toString()) == null) {
            string3 = "";
        }
        if (c0y7k instanceof C0Y3A) {
            strValueOf = String.valueOf(EnumC868890Y6t.CUSTOM.getCode());
        }
        C23250099c.LIZLLL(c0yceLJII.LIZIZ.LIZJ(), c0yceLJII.LJ, null, new C0Y7S(c0yceLJII, C0Y7M.LIZ(j, jLongValue, i, i4, i5, string, str3, string2, string3, i2, j2, str2, str, i3, strValueOf, c0yceLJII.LIZLLL.now(), c0yceLJII.LIZLLL.now()), null), 2);
    }
}
