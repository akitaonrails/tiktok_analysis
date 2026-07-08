package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0uhC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713680uhC implements InterfaceC1713650uh9 {
    public final C1713570uh1 LIZ;
    public final InterfaceC1713650uh9 LIZIZ;
    public final Function1<String, Unit> LIZJ;
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);

    @Override // X.InterfaceC1713650uh9
    public final void LIZ(C1713690uhD c1713690uhD) {
        if (this.LIZLLL.compareAndSet(false, true)) {
            try {
                LIZIZ(c1713690uhD);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZIZ.LIZ(C1713490ugt.LIZ("GLOBAL_CATCH", th, 4));
                C1713600uh4.LIZIZ(th);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012b A[Catch: all -> 0x0195, TryCatch #1 {all -> 0x0195, blocks: (B:53:0x00df, B:56:0x00f7, B:58:0x00fb, B:59:0x0102, B:65:0x0110, B:67:0x0118, B:70:0x0122, B:71:0x0127, B:73:0x012b, B:75:0x0131, B:80:0x013b, B:82:0x0145, B:76:0x0134, B:85:0x015f, B:86:0x0161, B:88:0x0178, B:90:0x017b, B:92:0x0181, B:95:0x018b, B:96:0x018c, B:87:0x0162), top: B:138:0x00df, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C1713690uhD r30) {
        /*
            Method dump skipped, instruction units count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1713680uhC.LIZIZ(X.0uhD):void");
    }

    public C1713680uhC(C1713570uh1 c1713570uh1, InterfaceC1713650uh9 interfaceC1713650uh9, AwS605S0100000_26 awS605S0100000_26) {
        this.LIZ = c1713570uh1;
        this.LIZIZ = interfaceC1713650uh9;
        this.LIZJ = awS605S0100000_26;
    }
}
