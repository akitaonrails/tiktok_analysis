package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.unavailable.IUnavailableMessageCheck;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0ZU2, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZU2 {
    public static volatile C0ZU2 LJFF;
    public final InterfaceC497601wk LIZ;
    public final IUnavailableMessageCheck LIZIZ;
    public final ConcurrentHashMap<String, C0ZU9> LIZJ;
    public final ConcurrentHashMap<String, AtomicInteger> LIZLLL;
    public static final C0ZU3 LJ = new Object() { // from class: X.0ZU3
    };
    public static final int[] LJI = {1809};
    public static final int[] LJII = {1802, 1803, 1812};

    public C0ZU2() {
        this(0);
    }

    public C0ZU2(int i) {
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LIZ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
        this.LIZIZ = (IUnavailableMessageCheck) PluggableExtentionKt.pluggableSpiForReal(IUnavailableMessageCheck.class);
        this.LIZJ = new ConcurrentHashMap<>();
        this.LIZLLL = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C869590Y9l> LIZ(java.util.List<? extends X.C869590Y9l> r11) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ZU2.LIZ(java.util.List):java.util.List");
    }

    public final boolean LIZIZ(String str, EnumC904370Zdr enumC904370Zdr) {
        C0ZU9 c0zu9 = this.LIZJ.get(str);
        if (c0zu9 == null) {
            return false;
        }
        int i = C0ZUA.LIZ[enumC904370Zdr.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            return c0zu9.LIZJ.LLJILLL;
        }
        return c0zu9.LIZIZ.LLJILLL;
    }

    public final void LIZJ(String str, EnumC904370Zdr enumC904370Zdr) {
        C0ZU9 c0zu9 = this.LIZJ.get(str);
        if (c0zu9 == null) {
            return;
        }
        int i = C0ZUA.LIZ[enumC904370Zdr.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C900410ZTz c900410ZTz = c0zu9.LIZJ;
                if (!c900410ZTz.LLJ) {
                    c900410ZTz.LLJ = true;
                    c900410ZTz.LLILZIL.LIZ().LJJIII();
                    return;
                }
                return;
            }
            return;
        }
        C900410ZTz c900410ZTz2 = c0zu9.LIZIZ;
        if (c900410ZTz2.LLJ) {
            return;
        }
        c900410ZTz2.LLJ = true;
        c900410ZTz2.LLILZIL.LIZ().LJJIII();
    }
}
