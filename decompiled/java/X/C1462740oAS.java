package X;

import androidx.lifecycle.LiveData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS72S1000000_22;

/* JADX INFO: renamed from: X.0oAS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462740oAS implements C11YW {
    public final /* synthetic */ Function0<InterfaceC1455860nzM> LIZ;

    @Override // X.C11YW
    public final void pauseVideo() {
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        InterfaceC1455860nzM interfaceC1455860nzMInvoke = this.LIZ.invoke();
        if (interfaceC1455860nzMInvoke == null || (liveDataG = interfaceC1455860nzMInvoke.g()) == null || (value = liveDataG.getValue()) == null) {
            return;
        }
        value.stop();
    }

    @Override // X.C11YW
    public final void Gn() {
        InterfaceC1455860nzM interfaceC1455860nzMInvoke;
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        C0CHQ.LIZ().getApplicationService().getClass();
        if (C2214201BlK.LJIIJJI || (interfaceC1455860nzMInvoke = this.LIZ.invoke()) == null || (liveDataG = interfaceC1455860nzMInvoke.g()) == null || (value = liveDataG.getValue()) == null) {
            return;
        }
        value.setLoopPlay(true);
        value.play();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1462740oAS(Function0<? extends InterfaceC1455860nzM> function0) {
        this.LIZ = function0;
    }

    @Override // X.C11YW
    public final void Hn(C347650Dk3 c347650Dk3) {
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        InterfaceC1455860nzM interfaceC1455860nzMInvoke = this.LIZ.invoke();
        if (interfaceC1455860nzMInvoke != null && (liveDataG = interfaceC1455860nzMInvoke.g()) != null && (value = liveDataG.getValue()) != null) {
            C391360FWc.LIZLLL("EditStickerScene#setupAudioTrack_TextStickerData", value, new AwS601S0100000_22(c347650Dk3, 494));
        }
    }

    @Override // X.C11YW
    public final void In(String str) {
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        InterfaceC1455860nzM interfaceC1455860nzMInvoke = this.LIZ.invoke();
        if (interfaceC1455860nzMInvoke != null && (liveDataG = interfaceC1455860nzMInvoke.g()) != null && (value = liveDataG.getValue()) != null) {
            C391360FWc.LIZLLL("sub_textStickerDataV2", value, new AwS72S1000000_22(str, 10));
        }
    }
}
