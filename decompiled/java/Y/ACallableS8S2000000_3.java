package Y;

import X.C08WC;
import X.C1C7U;
import X.C23250099c;
import X.C23271099x;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public class ACallableS8S2000000_3 implements Callable {
    public final int $t;
    public String s0;
    public String s1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS8S2000000_3 aCallableS8S2000000_3) throws Throwable {
        C1C7U.LIZ("CommentGroupChatLinkHandler@bde9.checkGroupChatLink$1");
        Object objLJ = C23250099c.LJ(C23271099x.INSTANCE, new C08WC(aCallableS8S2000000_3.s0, aCallableS8S2000000_3.s1, null));
        C1C7U.LIZIZ("CommentGroupChatLinkHandler@bde9.checkGroupChatLink$1");
        return objLJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$1(Y.ACallableS8S2000000_3 r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS8S2000000_3.call$1(Y.ACallableS8S2000000_3):java.lang.Object");
    }

    public ACallableS8S2000000_3(String str, String str2, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
