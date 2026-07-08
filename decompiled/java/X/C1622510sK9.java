package X;

import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.sticker.presenter.handler.StickerVideoStatusHandler;
import com.ss.android.ugc.aweme.sticker.presenter.handler.VoiceRecognizeStickerHandler;
import kotlin.jvm.internal.AFwS266S0000000_25;
import lnn.q;

/* JADX INFO: renamed from: X.0sK9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1622510sK9 {
    public static final void LIZ(q qVar, boolean z) {
        InterfaceC1622080sJS interfaceC1622080sJSI2 = qVar.I2(AFwS266S0000000_25.get$arr$(235));
        if (!(interfaceC1622080sJSI2 instanceof StickerVideoStatusHandler)) {
            interfaceC1622080sJSI2 = null;
        }
        StickerVideoStatusHandler stickerVideoStatusHandler = (StickerVideoStatusHandler) interfaceC1622080sJSI2;
        if (stickerVideoStatusHandler != null) {
            if (z) {
                if (stickerVideoStatusHandler.LLILZIL == 1) {
                    stickerVideoStatusHandler.LLILLJJLI.start();
                    return;
                }
                return;
            }
            stickerVideoStatusHandler.LLILLJJLI.pause();
        }
    }

    public static final void LIZIZ(q qVar, Cert cert) {
        InterfaceC1622080sJS interfaceC1622080sJSI2 = qVar.I2(AFwS266S0000000_25.get$arr$(237));
        if (!(interfaceC1622080sJSI2 instanceof VoiceRecognizeStickerHandler)) {
            interfaceC1622080sJSI2 = null;
        }
        VoiceRecognizeStickerHandler voiceRecognizeStickerHandler = (VoiceRecognizeStickerHandler) interfaceC1622080sJSI2;
        if (voiceRecognizeStickerHandler != null) {
            C1622730sKV c1622730sKV = new C1622730sKV(cert);
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(voiceRecognizeStickerHandler.LLJIJIL);
            sbLIZ.append(" reopenAudioRecorder lifecycleOwner isActive: currentSticker ");
            sbLIZ.append(voiceRecognizeStickerHandler.LLJ);
            interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
            if (voiceRecognizeStickerHandler.LLJ != null) {
                if (voiceRecognizeStickerHandler.LLIZ.invoke().booleanValue()) {
                    voiceRecognizeStickerHandler.LJJIIJ(c1622730sKV);
                } else {
                    voiceRecognizeStickerHandler.LLILLL.LIZ(c1622730sKV);
                }
            }
        }
    }
}
