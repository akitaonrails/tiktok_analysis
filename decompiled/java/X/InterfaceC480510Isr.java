package X;

import android.graphics.Bitmap;
import android.view.Surface;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Isr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC480510Isr extends InterfaceC480520Iss {
    void A0(String str);

    void B0(JSONObject jSONObject, boolean z);

    void C0(long j);

    void D0();

    void E0(String str, Surface surface);

    void F0(C0IIX c0iix);

    void G0(String str);

    void H0(long j);

    void I0();

    void J0(String str, InterfaceC463820IGu interfaceC463820IGu, int i, C480590Isz c480590Isz, InterfaceC480650It5 interfaceC480650It5, String str2, String str3, C0IMA c0ima);

    void K0(String str);

    void L0();

    void LIZ(boolean z);

    void LIZIZ(String str);

    int LIZJ();

    int LJ();

    JSONObject LJI();

    String LJIIIIZZ();

    void LJIIJ(int i);

    void LJIIZILJ(boolean z);

    void LJIJ(String str);

    Bitmap LJIJI(boolean z);

    String LJIL(int i);

    boolean b0();

    long c0();

    void changeLowLatencyMode(boolean z);

    void changeSRSupportScene(boolean z);

    String d0();

    void dynamicOpenTextureRender();

    void e0(Boolean bool);

    void f0(C0IIZ c0iiz, boolean z);

    void g0(C480620It2 c480620It2);

    boolean getAndClearResumeFromAbovePage();

    int getAudioDuckingDurationForLive(int i);

    String getCurrentResolution();

    C1281010jRL getLiveNetworkState();

    String getPlayerTag();

    C1699430uKD getPlayerThreadBlockStatus();

    boolean h0();

    boolean i0();

    boolean isHadGamePreviewLiveVideoRotated();

    boolean isVideoHorizontal();

    boolean j0(EnumC1700470uLt enumC1700470uLt);

    int k0();

    void l0(boolean z);

    void m0(C0IIX c0iix);

    void n0();

    void o0(int i, InterfaceC480650It5 interfaceC480650It5, C480590Isz c480590Isz, C0IMA c0ima, InterfaceC463820IGu interfaceC463820IGu, Long l, String str, String str2, String str3, boolean z);

    int p0();

    void q0(String str);

    void r0();

    void registerMuteFilter(C1APY c1apy);

    String s0();

    void setAnchorInteractMode(boolean z);

    void setHadGamePreviewLiveVideoRotated(boolean z);

    void setScreenOrientation(boolean z);

    void setSeiOpen(boolean z);

    int startAuxAudioDucking(C1300320jwU c1300320jwU, InterfaceC1699390uK9 interfaceC1699390uK9);

    void stop(String str);

    int stopAuxAudioDucking(int i);

    void stopUseTextureRender();

    void switchNextPullStream(String str);

    void t0(String str, String str2, boolean z);

    long u0();

    void unRegisterMuteFilter(C1APY c1apy);

    void v0(boolean z);

    void w0(boolean z);

    int writeAuxAudioDuckingPCM(byte[] bArr, int i);

    void x0(long j);

    void y0(InterfaceC463820IGu interfaceC463820IGu, String str);

    void z0();
}
