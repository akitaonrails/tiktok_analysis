package X;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Y7m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869080Y7m {
    public static final /* synthetic */ int LJ = 0;
    public final InterfaceC864330XvT LIZ;
    public final C0YEM LIZIZ;
    public final C0Y77 LIZJ;
    public final int LIZLLL = C0YMR.GET_MESSAGES_BY_CONVERSATION.getValue();

    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r23, X.InterfaceC1364105Vn<? super X.C0Y6Q<kotlin.Unit>> r24) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C869080Y7m.LIZIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    public C869080Y7m(InterfaceC864330XvT interfaceC864330XvT, C0YEM c0yem, C0Y77 c0y77) {
        this.LIZ = interfaceC864330XvT;
        this.LIZIZ = c0yem;
        this.LIZJ = c0y77;
    }

    public static EnumC869180Y7w LIZ(long j, List list, boolean z) {
        if (!list.isEmpty()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it2 = list.iterator();
            boolean z2 = false;
            boolean z3 = false;
            while (it2.hasNext()) {
                C869590Y9l c869590Y9l = (C869590Y9l) it2.next();
                if (!z3 && c869590Y9l.getCreatedAt() >= j) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z2 && jCurrentTimeMillis - c869590Y9l.getCreatedAt() >= 15552000000L) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
            if (!z2) {
                return EnumC869180Y7w.SUCCESS_WITH_SAVED_MSG_TOO_OLD;
            }
            if (z3) {
                return EnumC869180Y7w.SUCCESS_WITH_SAVED_MSG;
            }
            return EnumC869180Y7w.SUCCESS_WITH_SAVED_MSG_TOO_NEW;
        }
        if (z) {
            return EnumC869180Y7w.FAIL_WITH_DB_INSERT;
        }
        return EnumC869180Y7w.SUCCESS_WITHOUT_SAVED_MSG;
    }

    /* JADX WARN: Path cross not found for [B:74:0x0241, B:75:0x0243], limit reached: 153 */
    /* JADX WARN: Path cross not found for [B:78:0x0258, B:80:0x025e], limit reached: 153 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01f2 -> B:67:0x022a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(int r48, long r49, com.bytedance.im.core.proto.MessagesInConversationRequestBody r51, long r52, int r54, X.InterfaceC1364105Vn<? super X.EnumC869180Y7w> r55) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1131
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C869080Y7m.LIZJ(int, long, com.bytedance.im.core.proto.MessagesInConversationRequestBody, long, int, X.05Vn):java.lang.Object");
    }

    public final Object LIZLLL(int i, long j, String str, long j2, int i2, long j3, long j4, int i3, int i4, AbstractC23140094w abstractC23140094w) {
        if (i >= 0 && str.length() != 0 && j2 > 0) {
            C868980Y7c c868980Y7c = new C868980Y7c();
            c868980Y7c.LIZLLL = str;
            c868980Y7c.LJFF = C2286608xc.LJFF(j2);
            c868980Y7c.LJ = C2286608xc.LJ(i2);
            c868980Y7c.LJI = EnumC873090YMx.FROM_NEW_TO_OLD;
            c868980Y7c.LJII = C2286608xc.LJFF(j4);
            c868980Y7c.LJIIIIZZ = C2286608xc.LJ(i3);
            return LIZJ(i, j, c868980Y7c.build(), j3, i4, abstractC23140094w);
        }
        return EnumC869180Y7w.FAIL_WITH_INVALID_INPUT;
    }
}
