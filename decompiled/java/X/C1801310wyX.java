package X;

import com.bytedance.speech.speechengine.SpeechEngine;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.speech.SpeechResultResponse;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.speech.SpeechResultResponseV2;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0wyX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1801310wyX implements SpeechEngine.SpeechListener, InterfaceC1855430yNp {
    public SpeechEngine LIZ;
    public InterfaceC1801320wyY LIZIZ;
    public final C054G LIZJ = C2296808zG.LIZ(C0PEM.LIZJ.plus(new C639060P4u(CoroutineExceptionHandler.LJJLIL, 5)));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(65));

    @Override // X.InterfaceC1855430yNp
    public final void LIZ() {
        C23250099c.LIZLLL(this.LIZJ, null, null, new C1801240wyQ(this, null), 3);
    }

    public final C1801280wyU LJ() {
        return (C1801280wyU) this.LIZLLL.getValue();
    }

    @Override // X.InterfaceC1855430yNp
    public final void onDestroy() {
        C23250099c.LIZLLL(this.LIZJ, null, null, new C1801230wyP(this, null), 3);
    }

    public C1801310wyX() {
        try {
            TTNetInit.forceInitCronetKernel();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (C07IC.LIZ()) {
                C1930207hE.LIZ();
            }
        }
        C23250099c.LIZLLL(this.LIZJ, null, null, new C1851820yI0(this, false, null), 3);
        if (C07IC.LIZ()) {
            C1930207hE.LIZ();
        }
    }

    @Override // X.InterfaceC1855430yNp
    public final void LIZIZ(InterfaceC1801320wyY interfaceC1801320wyY) {
        this.LIZIZ = interfaceC1801320wyY;
    }

    public final InterfaceC0189004d LJFF(byte[] bArr) {
        Object c098200Yq;
        if (bArr == null) {
            return null;
        }
        try {
            String str = new String(bArr, Charsets.UTF_8);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("processResult raw json: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            try {
                c098200Yq = (SpeechResultResponse) C7740030o.LIZ().getGson().LJII(str, SpeechResultResponse.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                c098200Yq = (InterfaceC0189004d) C7740030o.LIZ().getGson().LJII(str, SpeechResultResponseV2.class);
            }
            return (InterfaceC0189004d) c098200Yq;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC1801320wyY interfaceC1801320wyY = this.LIZIZ;
            if (interfaceC1801320wyY != null) {
                interfaceC1801320wyY.J(-1, e);
            }
            if (C07IC.LIZ()) {
                C1930207hE.LIZ();
            }
            return null;
        }
    }

    @Override // X.InterfaceC1855430yNp
    public final void LIZJ(EnumC1801380wye enumC1801380wye, long j) {
        C23250099c.LIZLLL(this.LIZJ, null, null, new C1801260wyS(this, enumC1801380wye, j, null), 3);
    }

    @Override // X.InterfaceC1855430yNp
    public final void LIZLLL(EnumC1801380wye enumC1801380wye, long j) {
        C23250099c.LIZLLL(this.LIZJ, null, null, new C1801250wyR(this, enumC1801380wye, j, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b5 A[PHI: r2
      0x01b5: PHI (r2v5 int) = (r2v1 int), (r2v6 int) binds: [B:118:0x01f1, B:100:0x01b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a  */
    @Override // com.bytedance.speech.speechengine.SpeechEngine.SpeechListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSpeechMessage(int r14, byte[] r15, int r16) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1801310wyX.onSpeechMessage(int, byte[], int):void");
    }
}
