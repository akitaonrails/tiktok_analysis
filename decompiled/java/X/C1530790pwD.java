package X;

import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0pwD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530790pwD extends C1536330q59 {
    public final C1537480q70 LLILLJJLI;
    public final HybridSchemaParam LLILLL;
    public volatile C1530750pw9 LLILZ;
    public String LLILZIL;
    public final AtomicBoolean LLILZLL = new AtomicBoolean(false);
    public String LLIZ;
    public C1530840pwI LLIZLLLIL;
    public C1530780pwC LLJ;
    public C1530520pvm LLJI;

    @Override // X.AbstractC1537870q7d
    public final void onDestroy() {
        C1530780pwC c1530780pwC = this.LLJ;
        if (c1530780pwC != null) {
            C1534490q2B.LIZ.remove(c1530780pwC);
        }
        C1530750pw9 c1530750pw9 = this.LLILZ;
        if (c1530750pw9 != null) {
            c1530750pw9.LJLJLLL(false);
        }
        this.LLILZ = null;
        this.LLJI = null;
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroy. url: ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", timestamp:");
        sbLIZ.append(System.currentTimeMillis());
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "SspLifeCycle_", 2);
    }

    public static boolean LJLJLLL(String str) {
        if (str != null && str.length() != 0 && !Intrinsics.LJFF(str, "hybridkit_default_bid")) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load finish. url: ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", timestamp:");
        sbLIZ.append(System.currentTimeMillis());
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "SspLifeCycle_", 2);
        C1530750pw9 c1530750pw9 = this.LLILZ;
        if (c1530750pw9 != null) {
            c1530750pw9.LJLIIIL(interfaceC1541990qEH);
        }
    }

    public final C1530750pw9 LJLJLJ(String str) {
        C1530840pwI c1530840pwI;
        if (this.LLILZIL == null || str.length() == 0 || (c1530840pwI = this.LLIZLLLIL) == null || c1530840pwI.LIZ <= 0 || !LJLJLLL(this.LLIZ) || this.LLJI == null) {
            return null;
        }
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create SSP Context successfully. url: ");
        sbLIZ.append(str);
        sbLIZ.append(", timestamp:");
        sbLIZ.append(System.currentTimeMillis());
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "SspLifeCycle_", 2);
        C1530840pwI c1530840pwI2 = this.LLIZLLLIL;
        C1530520pvm c1530520pvm = this.LLJI;
        C1530760pwA c1530760pwA = new C1530760pwA(str, Long.valueOf(c1530840pwI2.LIZ), this.LLIZ);
        String str2 = this.LLIZ;
        if (str2 == null) {
            str2 = "";
        }
        return new C1530750pw9(str, c1530840pwI2, c1530520pvm, c1530760pwA, str2);
    }

    public C1530790pwD(C1537480q70 c1537480q70, HybridSchemaParam hybridSchemaParam) {
        this.LLILLJJLI = c1537480q70;
        this.LLILLL = hybridSchemaParam;
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        C1530750pw9 c1530750pw9;
        if (this.LLILZLL.get() && (c1530750pw9 = this.LLILZ) != null) {
            c1530750pw9.LJLIIL(interfaceC1541990qEH, str);
        }
    }

    @Override // X.C1536330q59
    public final void LJLJL(final String str, boolean z) {
        C1530750pw9 c1530750pw9;
        C1530760pwA c1530760pwA;
        if ((!u.LJJIIJZLJL(str, "http://", false) && !u.LJJIIJZLJL(str, "https://", false)) || !this.LLILZLL.get()) {
            return;
        }
        C1530750pw9 c1530750pw92 = this.LLILZ;
        if (c1530750pw92 != null) {
            c1530750pw92.LJLJLLL(z);
        }
        this.LLILZ = null;
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on redirect, boot ssp again. url: ");
        sbLIZ.append(str);
        sbLIZ.append(", timestamp:");
        sbLIZ.append(System.currentTimeMillis());
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "SspLifeCycle_", 2);
        this.LLILZ = LJLJLJ(str);
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ = this.LLILLJJLI.LJIJJ();
        if (interfaceC1541990qEHLJIJJ != null && (c1530750pw9 = this.LLILZ) != null && (c1530760pwA = c1530750pw9.LLILZIL) != null) {
            c1530760pwA.LJLIIL(interfaceC1541990qEHLJIJJ, str);
        }
        C2283708x9.LIZ(new Runnable() { // from class: X.0pwG
            public final void LIZ() {
                C1530760pwA c1530760pwA2;
                try {
                    C1530750pw9 c1530750pw93 = this.LL.LLILZ;
                    if (c1530750pw93 != null) {
                        c1530750pw93.LJLJLJ(str);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1490740otc c1490740otc2 = C1490740otc.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("exception happened, e:");
                    sbLIZ2.append(th.getMessage());
                    sbLIZ2.append(", url: ");
                    sbLIZ2.append(str);
                    c1490740otc2.LIZ(C2188811AlT.LIZIZ(sbLIZ2), EnumC1490770otf.E, "SspLifeCycle_");
                    C1530750pw9 c1530750pw94 = this.LL.LLILZ;
                    if (c1530750pw94 == null || (c1530760pwA2 = c1530750pw94.LLILZIL) == null) {
                        return;
                    }
                    c1530760pwA2.LLJJ = th.getMessage();
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SspLifeCycle@efc1.onRedirect$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SspLifeCycle@efc1.onRedirect$2");
            }
        });
    }
}
