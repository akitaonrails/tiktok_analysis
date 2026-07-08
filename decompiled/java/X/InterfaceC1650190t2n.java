package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScaleGestureDetector;
import android.view.Surface;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.record.AudioRecordModule;
import com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VESize;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import pyl.q;
import pyl.s;

/* JADX INFO: renamed from: X.0t2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public interface InterfaceC1650190t2n extends C05YF {
    public static final C1650210t2p LJJZZIII = new Object() { // from class: X.0t2p
    };

    C385670FAf<Boolean> A31();

    int A91(q qVar, Cert cert, String str, boolean z);

    void AF2(boolean z);

    void AJ(String str, String str2, boolean z);

    LiveEvent<Unit> AQ0();

    boolean Af();

    C385670FAf<Double> BP2();

    void Bh(String str, Map<Integer, Float> map);

    LiveEvent<Unit> Br2();

    void CK2(int i);

    int D4(VEDisplaySettings vEDisplaySettings);

    LiveEvent<Long> DB1();

    LiveEvent<Unit> DS1();

    LiveEvent<C1653280t7m> Dm2();

    void E0();

    void EV1(int i);

    LiveEvent<Long> Fs0();

    void GK(float f, float f2);

    void H31(boolean z, C560530Lyd<C1656320tCg> c560530Lyd);

    LiveEvent<Unit> HE2();

    void HT1(boolean z);

    void I70(s sVar);

    LiveEvent<Pair<Integer, Integer>> JO1();

    void Ja0(boolean z);

    void Jd1();

    boolean K(boolean z);

    boolean K3(float f, float f2);

    boolean KY();

    LiveEvent<Long> Kg0();

    void Kg1(float f, float f2);

    void LE(boolean z);

    int LJLJJLL();

    void LJLJLLL(Surface surface);

    List<String> Lg2();

    void Ls1();

    void M2(boolean z);

    void NF(s sVar);

    boolean NS0();

    void Nn(int i, String str);

    LiveEvent<Unit> O71();

    AudioRecordModule OA2();

    LiveEvent<Boolean> Or0();

    boolean PZ0();

    void Pa(float f, float f2);

    InterfaceC2253331DHn Pk();

    LiveEvent<Pair<Integer, Boolean>> Q30();

    int Q7(String str, float f);

    InterfaceC2254081DKk St2();

    boolean Tc2(boolean z);

    String Th2();

    LiveData<Float> Tz1();

    void U00(Cert cert, boolean z);

    boolean Ue();

    void Uj(boolean z);

    C2177931ALn V21();

    boolean Vy2(VESize vESize);

    boolean WE1(boolean z, boolean z2);

    void Wl1(int i);

    LiveEvent<Unit> Wt0();

    void X8(boolean z);

    void Y9(String[] strArr, int i, String[] strArr2, int i2);

    long YG1();

    void Yi2(float f);

    void ZF(boolean z);

    InterfaceC2254021DKe ZT();

    void Zi1();

    void Zl0(C1663770tOh c1663770tOh);

    void aD1();

    void aJ1(boolean z, C1AIY c1aiy, Cert cert);

    LiveData<C1DLP> bX1();

    void bp2(String[] strArr, int i);

    void br1(boolean z);

    LiveEvent<C1652620t6i> bu2();

    void c11(InterfaceC2183551Acz interfaceC2183551Acz);

    void cB0(String str);

    boolean cC0();

    Effect cP1();

    int cd0(q qVar, Cert cert, String str);

    Point cn();

    boolean db();

    void detectDirtyLens(Function2<? super Float, ? super Integer, Unit> function2);

    void eY1();

    void ei1(q qVar);

    C1DHU ep();

    LiveEvent<Pair<Integer, Float>> f72();

    View fF2();

    LiveEvent<Integer> fT0();

    boolean fh();

    boolean fp1();

    int getCameraType();

    InterfaceC1645720sva getEffectController();

    int getFlashMode();

    int getNextFlashMode();

    View getPreviewView();

    C1DKV getRecordContext();

    s getSpeed();

    void h0();

    LiveEvent<C1403440mco> h92();

    C385670FAf<Long> hE2();

    void iO1(String[] strArr, int i);

    boolean isReuseSurfaceView();

    void j8();

    void jK(boolean z, Rect[] rectArr);

    boolean jk();

    void js2();

    C1650220t2q jx2();

    boolean k80();

    @InterfaceC1294060jmO
    void kH1(boolean z);

    int kk(float f);

    SavePhotoStickerInfo kq2();

    void lb1(int i);

    boolean le0();

    LiveData<Boolean> lq0();

    void ls();

    boolean n();

    LiveEvent<C1634100scq<Integer, Integer, String>> o62();

    LiveEvent<Integer> oN();

    LiveEvent<Boolean> ok0();

    LiveEvent<q> p92();

    int pg(String str, float f, float f2);

    LiveEvent<Unit> ph0();

    void pv0(boolean z);

    CameraComponentModel pw0();

    LiveEvent<Integer> qB();

    LiveData<C1448140nmu> qF1();

    LiveEvent<Integer> qG2();

    void qM(Pair<String, Float> pair, Pair<String, Float> pair2, float f);

    C1DHV qa();

    void qh(int i);

    LiveEvent<Unit> r12();

    int re1();

    VEDisplaySettings s1();

    boolean scaleCamera(ScaleGestureDetector scaleGestureDetector);

    void setBodyBeautyLevel(int i);

    void setExposureSeekBarProgress(float f);

    void setFilter(String str);

    void setFilter(String str, float f);

    void tQ(boolean z);

    C385670FAf<Boolean> tS1();

    InterfaceC2253831DJl u92();

    LiveEvent<Boolean> vB1();

    LiveEvent<C1648160szW> vC1();

    void vo0(boolean z);

    void w61(C1648160szW c1648160szW);

    s wD();

    void wr1(C1645090suZ c1645090suZ, C1645090suZ c1645090suZ2, float f);

    LiveEvent<Long> xF1();

    long xV1();

    C385670FAf<Boolean> xl0();

    boolean xs1();

    LiveEvent<Boolean> y82();

    boolean yC();

    void yN1(C1DLQ c1dlq);

    InterfaceC576950Mk1 yP();

    void yZ0();

    int ya(String str, float f, float f2);

    C385670FAf<Boolean> yj1();

    void zj1(boolean z);

    void zm2(float f);

    void zo(boolean z);
}
