package X;

import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.Intrinsics;
import mn3.e0;

/* JADX INFO: renamed from: X.0sHl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1621030sHl implements InterfaceC1622520sKA {
    public final InterfaceC1650230t2r LIZ;

    public C1621030sHl(e0 e0Var) {
        this.LIZ = e0Var;
    }

    @Override // X.InterfaceC1622520sKA
    public final void LIZ(AbstractC1622690sKR abstractC1622690sKR) {
        Cert certLIZ;
        if (abstractC1622690sKR != null && (certLIZ = C1622740sKW.LIZ(abstractC1622690sKR)) != null) {
            this.LIZ.Zd1().LJI(certLIZ);
        }
        if (C1622150sJZ.LIZ()) {
            this.LIZ.Zd1().LIZLLL(C1DPV.LIZIZ.LIZJ(C1DPX.STOP_AUDIO_VOICE_RECOGNIZE, EnumC1641610sox.USER_OPERATION));
        }
    }

    @Override // X.InterfaceC1622520sKA
    public final void LIZIZ(AbstractC1622690sKR abstractC1622690sKR, Runnable runnable) {
        Cert certLIZ;
        if (C1622150sJZ.LIZ()) {
            InterfaceC1660820tJw audioController = this.LIZ.St2().getAudioController();
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "reuse_audio_capture_on_sticker_switch", true, false) || !audioController.LJFF() || !Intrinsics.LJFF(audioController.LJIIIIZZ(), "record")) {
                this.LIZ.Zd1().LIZJ();
            }
        }
        if (abstractC1622690sKR != null && (certLIZ = C1622740sKW.LIZ(abstractC1622690sKR)) != null) {
            this.LIZ.Zd1().LJ(certLIZ, runnable);
        }
    }
}
