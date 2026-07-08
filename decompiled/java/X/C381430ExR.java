package X;

import com.bef.effectsdk.message.MessageCenter;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.io.File;

/* JADX INFO: renamed from: X.0ExR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381430ExR implements InterfaceC381510ExZ<C381480ExW, C381330ExH> {
    public static long LJFF;
    public PthreadTimer LIZ;
    public C381490ExX LIZIZ;
    public InterfaceC381500ExY<C381330ExH> LIZJ;
    public long LIZLLL;
    public final long LJ;

    public final long LJJIIJZLJL() {
        if (this.LIZLLL <= 0) {
            return 0L;
        }
        return System.currentTimeMillis() - this.LIZLLL;
    }

    public C381430ExR() {
        long j = LJFF + 1;
        LJFF = j;
        this.LJ = j;
    }

    public final void LJJIIZI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(this.LJ);
        sbLIZ.append("] reset: effectMessageListener=");
        C381490ExX c381490ExX = this.LIZIZ;
        sbLIZ.append(c381490ExX != null ? Integer.valueOf(c381490ExX.hashCode()) : null);
        sbLIZ.append(", timer=");
        PthreadTimer pthreadTimer = this.LIZ;
        sbLIZ.append(pthreadTimer != null ? Integer.valueOf(pthreadTimer.hashCode()) : null);
        C381530Exb.LIZJ(this, C2188811AlT.LIZIZ(sbLIZ));
        MessageCenter.removeListener(this.LIZIZ);
        this.LIZIZ = null;
        this.LIZJ = null;
        PthreadTimer pthreadTimer2 = this.LIZ;
        if (pthreadTimer2 != null) {
            pthreadTimer2.cancel();
        }
        this.LIZ = null;
    }

    @Override // X.InterfaceC354490Dv5
    public final void cancel() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(this.LJ);
        sbLIZ.append("] cancel called, listener=");
        InterfaceC381500ExY<C381330ExH> interfaceC381500ExY = this.LIZJ;
        sbLIZ.append(interfaceC381500ExY != null ? Integer.valueOf(interfaceC381500ExY.hashCode()) : null);
        sbLIZ.append(", effectMessageListener=");
        C381490ExX c381490ExX = this.LIZIZ;
        sbLIZ.append(c381490ExX != null ? Integer.valueOf(c381490ExX.hashCode()) : null);
        C381530Exb.LIZJ(this, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC381500ExY<C381330ExH> interfaceC381500ExY2 = this.LIZJ;
        if (interfaceC381500ExY2 != null) {
            interfaceC381500ExY2.onCancel();
        }
        LJJIIZI();
    }

    public static boolean LJJIIZ(String str) {
        File[] fileArrListFiles;
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists() || !c0vsj.isDirectory() || (fileArrListFiles = c0vsj.listFiles()) == null || fileArrListFiles.length == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a1, code lost:
    
        if (r3.length() > 0) goto L22;
     */
    @Override // X.InterfaceC381510ExZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C381480ExW r14, X.InterfaceC381500ExY r15) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C381430ExR.LIZIZ(X.0ExW, X.0ExY):void");
    }
}
