package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHVideoQualityStrategyManagerGameSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0UWt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C773730UWt implements InterfaceC773740UWu {
    public static final C773730UWt LIZ = new C773730UWt();
    public static C776510Ud7 LIZIZ;

    public static InterfaceC773740UWu LJFF() {
        C776510Ud7 c776510Ud7 = LIZIZ;
        if (c776510Ud7 == null) {
            if (TTLHVideoQualityStrategyManagerGameSettings.INSTANCE.enabledStrategyCenter()) {
                C20441214yg.LIZIZ("GameStreamQualityCenterAdapterImpl", "use GameStreamQualityCenterAdapterImpl");
                LIZIZ = new C776510Ud7();
            }
            return LIZIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("use currentAdapter ");
        sbLIZ.append(c776510Ud7);
        C20441214yg.LIZIZ("GameSpeedDetectorAdapterWrapper", C2188811AlT.LIZIZ(sbLIZ));
        return c776510Ud7;
    }

    public static final PushStreamInfo.Quality LIZJ() {
        InterfaceC773740UWu interfaceC773740UWuLJFF = LJFF();
        if (interfaceC773740UWuLJFF != null) {
            return ((C776510Ud7) interfaceC773740UWuLJFF).LIZJ();
        }
        return null;
    }

    public static final String LIZLLL() {
        if (LJFF() != null) {
            return C776510Ud7.LIZLLL();
        }
        return null;
    }

    public static final String LJ() {
        if (LJFF() != null) {
            return C776510Ud7.LJ();
        }
        return null;
    }

    public static final PushStreamInfo.Quality LJI() {
        InterfaceC773740UWu interfaceC773740UWuLJFF = LJFF();
        if (interfaceC773740UWuLJFF != null) {
            return ((C776510Ud7) interfaceC773740UWuLJFF).LJFF();
        }
        return null;
    }

    public static final C1D47 LJII() {
        InterfaceC773740UWu interfaceC773740UWuLJFF = LJFF();
        if (interfaceC773740UWuLJFF != null) {
            return ((C776510Ud7) interfaceC773740UWuLJFF).LJI();
        }
        return null;
    }

    public static final boolean LJIIIZ() {
        InterfaceC773740UWu interfaceC773740UWuLJFF = LJFF();
        if (interfaceC773740UWuLJFF != null) {
            return ((C776510Ud7) interfaceC773740UWuLJFF).LJIIIZ();
        }
        return false;
    }

    public static final void LIZIZ(String str) {
        InterfaceC773740UWu interfaceC773740UWuLJFF = LJFF();
        if (interfaceC773740UWuLJFF != null) {
            ((C776510Ud7) interfaceC773740UWuLJFF).LIZIZ(str);
        }
    }

    public static final void LJIIJJI(PushStreamInfo.Quality quality) {
        InterfaceC773740UWu interfaceC773740UWuLJFF = LJFF();
        if (interfaceC773740UWuLJFF != null) {
            ((C776510Ud7) interfaceC773740UWuLJFF).LJIIJJI(quality);
        }
    }

    public static final void LJIIIIZZ(LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        InterfaceC773740UWu interfaceC773740UWuLJFF = LJFF();
        if (interfaceC773740UWuLJFF != null) {
            ((C776510Ud7) interfaceC773740UWuLJFF).LJIIIIZZ(lifecycleOwner, dataChannel);
        }
    }

    public static final void LJIIJ(String str, boolean z) {
        InterfaceC773740UWu interfaceC773740UWuLJFF = LJFF();
        if (interfaceC773740UWuLJFF != null) {
            ((C776510Ud7) interfaceC773740UWuLJFF).LJIIJ(str, z);
        }
    }

    public static final void LJIILIIL(LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        InterfaceC773740UWu interfaceC773740UWuLJFF = LJFF();
        if (interfaceC773740UWuLJFF != null) {
            ((C776510Ud7) interfaceC773740UWuLJFF).LJIILIIL(lifecycleOwner, dataChannel);
        }
    }

    public static final void LIZ(int i, String str, EnumC779450Uhr enumC779450Uhr) {
        InterfaceC773740UWu interfaceC773740UWuLJFF = LJFF();
        if (interfaceC773740UWuLJFF != null) {
            ((C776510Ud7) interfaceC773740UWuLJFF).LIZ(i, str, enumC779450Uhr);
        }
    }

    public static final void LJIIL(EnumC776480Ud4 enumC776480Ud4, EnumC779450Uhr enumC779450Uhr, InterfaceC776660UdM interfaceC776660UdM) {
        InterfaceC773740UWu interfaceC773740UWuLJFF = LJFF();
        if (interfaceC773740UWuLJFF != null) {
            ((C776510Ud7) interfaceC773740UWuLJFF).LJIIL(enumC776480Ud4, enumC779450Uhr, interfaceC776660UdM);
        }
    }
}
