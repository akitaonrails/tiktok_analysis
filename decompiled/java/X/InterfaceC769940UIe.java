package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.bpea.basics.Cert;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import java.util.List;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0UIe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC769940UIe {
    void A3(C1333220knY c1333220knY);

    void B3(Bundle bundle, InterfaceC1272960jEM interfaceC1272960jEM);

    void C3(SurfaceView surfaceView);

    void D3(Cert cert);

    AudioDeviceModule E3();

    void F3(Boolean bool);

    void G3(InterfaceC774920UaY interfaceC774920UaY);

    void H3(float f);

    void I3(List<String> list);

    void J3(Cert cert, boolean z);

    int K3();

    void L3(int i, Cert cert);

    boolean LIZ(String str, String str2, JSONObject jSONObject, boolean z);

    long LIZIZ();

    void LJFF(C0UHL c0uhl);

    AbstractC765580U1k LJII();

    void LJIIIIZZ(Cert cert, boolean z);

    void LJIIIZ(float f);

    int LJIIJJI();

    InterfaceC1268640j7O LJIIL();

    void LJIILJJIL(InterfaceC775290Ub9 interfaceC775290Ub9);

    void LJIILL(Cert cert);

    void LJIJ(Bundle bundle, C0UH1 c0uh1);

    void LJIJI(C0UHD c0uhd);

    void M3(InterfaceC1274020jG4 interfaceC1274020jG4);

    int N3(float f);

    void O3(Boolean bool);

    void P3(Cert cert, boolean z);

    void Q3(Cert cert);

    AbstractC1273900jFs getLiveCore();

    C1274030jG5 i3(C1275030jHh c1275030jHh, InterfaceC775310UbB interfaceC775310UbB);

    void j3(int i, int i2, int i3, int i4);

    void k3(List<String> list);

    void l3(Cert cert);

    void m3(Bundle bundle, C1152850g6d c1152850g6d);

    void n3(Bitmap bitmap, Cert cert);

    void o3(AwS591S0100000_12 awS591S0100000_12);

    void p3(Cert cert);

    void q3();

    void r3(Cert cert);

    void release(Cert cert);

    void s3(boolean z);

    void setDisplayView(View view);

    void setEnableFixedSize(boolean z);

    void start(String str);

    void stop();

    void t3(Cert cert);

    void u3(float f);

    void v3(AwS556S0100000_12 awS556S0100000_12);

    void w3(C1333220knY c1333220knY);

    boolean x3(String str, JSONObject jSONObject, int i, boolean z, String str2);

    void y3(C0UHD c0uhd);

    void z3(Cert cert);
}
