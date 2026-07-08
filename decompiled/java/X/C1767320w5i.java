package X;

import com.bytedance.speech.speechengine.SpeechEngine;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.aiuikit.impl.voicebox.speech.SpeechErrorResponse;
import com.ss.android.ugc.aweme.aiuikit.impl.voicebox.speech.SpeechResult;
import com.ss.android.ugc.aweme.aiuikit.impl.voicebox.speech.SpeechResultResponse;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.List;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0w5i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1767320w5i implements SpeechEngine.SpeechListener, C18SM {
    public final C1851870yI5 LIZ;
    public final InterfaceC1767330w5j LIZIZ;
    public SpeechEngine LIZJ;
    public final C054G LIZLLL = C2296808zG.LIZ(C0PEM.LIZJ);

    @Override // X.C18SM
    public final void LIZ() {
        C23250099c.LIZLLL(this.LIZLLL, null, null, new C1702750uPZ(this, null), 3);
    }

    @Override // X.C18SM
    public final void LJJIJIIJIL() {
        C23250099c.LIZLLL(this.LIZLLL, null, null, new C1702740uPY(this, null), 3);
    }

    @Override // X.C18SM
    public final void zf() {
        C23250099c.LIZLLL(this.LIZLLL, null, null, new C1702730uPX(this, null), 3);
    }

    public final SpeechResultResponse LIZIZ(byte[] bArr) {
        SpeechResultResponse speechResultResponse;
        if (bArr == null) {
            return null;
        }
        try {
            speechResultResponse = (SpeechResultResponse) C7740030o.LIZ().getGson().LJII(new String(bArr, Charsets.UTF_8), SpeechResultResponse.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC1767330w5j interfaceC1767330w5j = this.LIZIZ;
            if (interfaceC1767330w5j != null) {
                interfaceC1767330w5j.J(-1, e);
            }
        }
        if (!(!speechResultResponse.result.isEmpty())) {
            return null;
        }
        return speechResultResponse;
    }

    public C1767320w5i(C1851870yI5 c1851870yI5, C18SJ c18sj) {
        this.LIZ = c1851870yI5;
        this.LIZIZ = c18sj;
        try {
            TTNetInit.forceInitCronetKernel();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ALog.w("VoiceBoxASRSpeechProcessor", "forceInitCronetKernel failed", e);
        }
        C23250099c.LIZLLL(this.LIZLLL, null, null, new C1851840yI2(this, false, null), 3);
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine.SpeechListener
    public final void onSpeechMessage(int i, byte[] bArr, int i2) {
        SpeechErrorResponse speechErrorResponse;
        String str;
        Integer num;
        List<SpeechResult> list;
        SpeechResult speechResult;
        String str2;
        InterfaceC1767330w5j interfaceC1767330w5j;
        Float fLJIIIIZZ;
        SpeechResultResponse speechResultResponseLIZIZ;
        List<SpeechResult> list2;
        SpeechResult speechResult2;
        String str3;
        InterfaceC1767330w5j interfaceC1767330w5j2;
        if (i != 1003) {
            if (i != 1204) {
                if (i != 1600) {
                    if (i != 1200) {
                        if (i == 1201 && (speechResultResponseLIZIZ = LIZIZ(bArr)) != null && (list2 = speechResultResponseLIZIZ.result) != null && (speechResult2 = (SpeechResult) C13LP.LJJJLL(list2)) != null && (str3 = speechResult2.text) != null && (interfaceC1767330w5j2 = this.LIZIZ) != null) {
                            interfaceC1767330w5j2.LIZJ(str3);
                            return;
                        }
                        return;
                    }
                    if (bArr != null && bArr.length != 0) {
                        ShortBuffer shortBufferAsShortBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer();
                        int iRemaining = shortBufferAsShortBuffer.remaining();
                        double d = 0.0d;
                        while (shortBufferAsShortBuffer.hasRemaining()) {
                            double d2 = shortBufferAsShortBuffer.get();
                            d += d2 * d2;
                        }
                        double dSqrt = Math.sqrt(d / ((double) iRemaining)) / 32768.0d;
                        if (dSqrt >= 1.0E-6d) {
                            double d3 = -60;
                            C13LZ.LIZJ(((((double) 20) * Math.log10(dSqrt)) - d3) / (0.0d - d3), 0.0d, 1.0d);
                        }
                    }
                    InterfaceC1767330w5j interfaceC1767330w5j3 = this.LIZIZ;
                    if (interfaceC1767330w5j3 == null) {
                        return;
                    }
                    interfaceC1767330w5j3.LIZIZ();
                    return;
                }
                if (bArr == null || (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(new String(bArr, Charsets.UTF_8))) == null) {
                    return;
                }
                float fFloatValue = fLJIIIIZZ.floatValue();
                InterfaceC1767330w5j interfaceC1767330w5j4 = this.LIZIZ;
                if (interfaceC1767330w5j4 == null) {
                    return;
                }
                interfaceC1767330w5j4.h8(fFloatValue);
                return;
            }
            SpeechResultResponse speechResultResponseLIZIZ2 = LIZIZ(bArr);
            if (speechResultResponseLIZIZ2 == null || (list = speechResultResponseLIZIZ2.result) == null || (speechResult = (SpeechResult) C13LP.LJJJLL(list)) == null || (str2 = speechResult.text) == null || (interfaceC1767330w5j = this.LIZIZ) == null) {
                return;
            }
            interfaceC1767330w5j.LIZ(str2);
            return;
        }
        int iIntValue = -1;
        if (bArr != null) {
            try {
                speechErrorResponse = (SpeechErrorResponse) C7740030o.LIZ().getGson().LJII(new String(bArr, Charsets.UTF_8), SpeechErrorResponse.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                InterfaceC1767330w5j interfaceC1767330w5j5 = this.LIZIZ;
                if (interfaceC1767330w5j5 != null) {
                    interfaceC1767330w5j5.J(-1, e);
                }
                speechErrorResponse = null;
            }
        } else {
            speechErrorResponse = null;
        }
        InterfaceC1767330w5j interfaceC1767330w5j6 = this.LIZIZ;
        if (interfaceC1767330w5j6 == null) {
            return;
        }
        if (speechErrorResponse != null && (num = speechErrorResponse.errorCode) != null) {
            iIntValue = num.intValue();
        }
        if (speechErrorResponse == null || (str = speechErrorResponse.errorMsg) == null) {
            str = "";
        }
        interfaceC1767330w5j6.J(iIntValue, new Exception(str));
    }
}
