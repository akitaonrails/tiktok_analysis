package X;

import com.bytedance.im.core.proto.MessageBody;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Y77, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y77 {
    public final C0YEM LIZ;
    public final C0Y7H LIZIZ;
    public final InterfaceC1631620sYq<String, String, String, Boolean> LIZJ;
    public final InterfaceC1685430txd<MessageBody, Integer, String, Integer, C0Y82, Long, C0Y72> LIZLLL;
    public final InterfaceC1685430txd<MessageBody, Integer, Integer, String, C0Y82, Long, Pair<EnumC868870Y6r, String>> LJ;
    public final InterfaceC1685430txd<MessageBody, Integer, String, Integer, C0Y82, Long, C0Y7K> LJFF;
    public final InterfaceC1685430txd<MessageBody, Integer, Integer, String, C0Y82, Long, C0Y7K> LJI;
    public final C868200Y4c LJII;
    public final InterfaceC866720XzK LJIIIIZZ;
    public final C0Y1U LJIIIZ;

    public C0Y77() {
        throw null;
    }

    public C0Y77(C0YEM c0yem) {
        C0Y7B c0y7b = new C0Y7B(c0yem);
        C863960Xus c863960Xus = new C863960Xus(c0yem);
        C868860Y6q c868860Y6q = new C868860Y6q(c0yem);
        C868840Y6o c868840Y6o = new C868840Y6o(c0yem);
        C868850Y6p c868850Y6p = new C868850Y6p(c0yem);
        C868820Y6m c868820Y6m = new C868820Y6m(c0yem);
        C868200Y4c c868200Y4c = c0yem.LJIIZILJ().getDomain().LIZ;
        C0Y60 c0y60LIZ = c0yem.LJIIZILJ().LIZLLL().LIZ();
        C0Y1U c0y1uLIZLLL = c0yem.LJIIZILJ().LIZLLL().LIZLLL();
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        this.LIZ = c0yem;
        this.LIZIZ = c0y7b;
        this.LIZJ = c863960Xus;
        this.LIZLLL = c868860Y6q;
        this.LJ = c868840Y6o;
        this.LJFF = c868850Y6p;
        this.LJI = c868820Y6m;
        this.LJII = c868200Y4c;
        this.LJIIIIZZ = c0y60LIZ;
        this.LJIIIZ = c0y1uLIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0279  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0Y7T LIZJ(com.bytedance.im.core.proto.MessageBody r25, java.lang.String r26, int r27, java.util.Map<java.lang.String, java.lang.String> r28, int r29) {
        /*
            Method dump skipped, instruction units count: 962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Y77.LIZJ(com.bytedance.im.core.proto.MessageBody, java.lang.String, int, java.util.Map, int):X.0Y7T");
    }

    public static Object LIZIZ(C0Y77 c0y77, MessageBody messageBody, String str, int i, Map map, AbstractC23140094w abstractC23140094w, int i2) {
        int i3;
        Map map2 = map;
        if ((i2 & 8) != 0) {
            map2 = null;
        }
        if ((i2 & 16) != 0) {
            i3 = 5;
        } else {
            i3 = 0;
        }
        return C23250099c.LJI(abstractC23140094w, c0y77.LIZ.LJIIIIZZ().LIZIZ(), new C0Y74(c0y77, messageBody, str, i, map2, i3, null));
    }

    public final void LIZ(MessageBody messageBody, long j, C0Y7K c0y7k, C0Y82 c0y82, int i, long j2, String str) {
        int i2;
        Integer numLIZ;
        String str2;
        Integer num;
        String string;
        C0YCE c0yceLJII = this.LIZ.LJIIZILJ().getMessage().LJII();
        long jLongValue = messageBody.server_message_id.longValue();
        if (c0y7k != null) {
            i2 = c0y7k.LIZ;
        } else {
            i2 = -1;
        }
        int value = c0y82.getValue();
        String str3 = messageBody.conversation_id;
        String string2 = messageBody.server_message_id.toString();
        String string3 = messageBody.message_type.toString();
        if (c0y7k == null || (numLIZ = c0y7k.LIZ()) == null) {
            numLIZ = messageBody.message_type;
        }
        int iIntValue = numLIZ.intValue();
        long jCurrentTimeMillis = System.currentTimeMillis() - j2;
        if (c0y7k != null) {
            str2 = c0y7k.LIZIZ;
        } else {
            str2 = null;
        }
        String str4 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (c0y7k != null && (num = c0y7k.LIZJ) != null && (string = num.toString()) != null) {
            str4 = string;
        }
        C23250099c.LIZLLL(c0yceLJII.LIZIZ.LIZJ(), c0yceLJII.LJ, null, new C0Y7S(c0yceLJII, C0Y7M.LIZ(j, jLongValue, i2, i, value, "", str3, string2, string3, iIntValue, jCurrentTimeMillis, str, str2, 3, str4, System.currentTimeMillis(), System.currentTimeMillis()), null), 2);
    }

    /* JADX WARN: Path cross not found for [B:64:0x0305, B:66:0x030b], limit reached: 119 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03b0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x02b2 -> B:57:0x02e4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.util.List<com.bytedance.im.core.proto.MessageBody> r43, java.lang.String r44, int r45, java.lang.String r46, java.lang.String r47, long r48, int r50, X.C0Y82 r51, java.util.Map<java.lang.String, java.lang.String> r52, X.InterfaceC1364105Vn<? super java.util.List<X.C0Y7T>> r53) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Y77.LIZLLL(java.util.List, java.lang.String, int, java.lang.String, java.lang.String, long, int, X.0Y82, java.util.Map, X.05Vn):java.lang.Object");
    }
}
