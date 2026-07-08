package X;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.bpea.basics.Cert;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0UJY, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public interface C0UJY extends InterfaceC21656819pG {
    void LIZ();

    void LIZIZ();

    void LIZJ(int i, int i2, String str, String str2);

    String LIZLLL();

    void LJ(String str);

    void LJFF();

    void LJI(String[] strArr, String[] strArr2, float[] fArr);

    void LJII(String[] strArr);

    void LJIIIIZZ(String[] strArr, String[] strArr2, boolean z, boolean z2, boolean z3);

    void LJIIIZ(C0UHE c0uhe);

    String[] LJIIJ();

    void LJIIJJI(String str);

    void LJIIL(C0UHE c0uhe);

    void LJIILIIL(String[] strArr, String[] strArr2);

    void LJIILJJIL(InterfaceC770080UIs interfaceC770080UIs);

    void LJIILL(JSONObject jSONObject);

    void LJIILLIIL(LiveEffect liveEffect, String str);

    void LJIIZILJ(String[] strArr, String[] strArr2, String[] strArr3);

    float LJIJ();

    void LJIJI(String[] strArr);

    void LJIJJ(String[] strArr, String[] strArr2);

    boolean LJIJJLI();

    void LJIL(InterfaceC770090UIt interfaceC770090UIt);

    void LJJ(LiveEffect liveEffect, String str);

    void LJJI(InterfaceC770070UIr interfaceC770070UIr);

    void LJJIFFI();

    void LJJII();

    int LJJIII(int i, int i2, int i3, int i4, String str, int i5, int i6);

    void LJJIIJ(C0UJ0 c0uj0);

    void LJJIIJZLJL();

    void LJJIIZ(int i, Cert cert);

    void LJJIIZI(Boolean bool);

    InterfaceC1268640j7O LJJIJ();

    String LJJIJIIJI(int i);

    void LJJIJIIJIL(int i, int i2, MotionEvent motionEvent);

    void LJJIJIL(boolean z);

    void LJJIJL(boolean z);

    void LJJIJLIJ(String[] strArr, String[] strArr2);

    void LJJLIIIJJI();

    int LJJZ(String str, String str2);

    void Pn(boolean z, boolean z2, boolean z3);

    void closeCamera(Cert cert);

    int composerCheckNodeExclusion(String str, String str2, int[] iArr);

    int composerUpdateNode(String str, String str2, float f);

    long getAvgExpTime();

    int getCameraInfo();

    JSONObject getCameraParams();

    void hideBottomTab();

    void l();

    void openCamera(Cert cert, boolean z);

    Boolean scaleCamera(ScaleGestureDetector scaleGestureDetector);

    void sendEffectMsg(int i, long j, long j2, String str);

    void setExposureCompensation(int i);

    void setRenderCacheString(String str, String str2);

    void showBottomTab();
}
