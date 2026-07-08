package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScaleGestureDetector;
import android.view.Surface;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
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
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import pyl.q;
import pyl.s;

/* JADX INFO: renamed from: X.0t2o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1650200t2o implements InterfaceC1650230t2r {
    public final C1DKV LL;
    public s LLILLL;
    public final CameraComponentModel LLILLJJLI = new CameraComponentModel(0);
    public final Point LLILZ = new Point(0, 0);
    public final C385670FAf<Boolean> LLILZIL = new C385670FAf<>();
    public final C385670FAf<Boolean> LLILZLL = new C385670FAf<>();
    public final C385670FAf<Boolean> LLIZ = new C385670FAf<>();
    public final C385670FAf<Long> LLIZLLLIL = new C385670FAf<>();
    public final C385670FAf<Boolean> LLJ = new C385670FAf<>();
    public final LiveData<Float> LLJI = new MutableLiveData();
    public final LiveData<C1DLP> LLJIJIL = new MutableLiveData();
    public final LiveData<Boolean> LLJILJIL = new MutableLiveData();
    public final LiveData<C1448140nmu> LLJILJILJ = new MutableLiveData();
    public final LiveEvent<Boolean> LLJILLL = new C560530Lyd();
    public final LiveEvent<Unit> LLJJ = new C560530Lyd();
    public final LiveEvent<Unit> LLJJI = new C560530Lyd();
    public final LiveEvent<Integer> LLJJIII = new C560530Lyd();
    public final LiveEvent<C1403440mco> LLJJIJI = new C560530Lyd();
    public final LiveEvent<Boolean> LLJJIJIIJIL = new C560530Lyd();
    public final LiveEvent<Boolean> LLJJIJIL = new C560530Lyd();
    public final LiveEvent<Boolean> LLJJJ = new C560530Lyd();
    public final LiveEvent<Unit> LLJJJIL = new C560530Lyd();
    public final LiveEvent<Long> LLJJJJ = new C560530Lyd();
    public final LiveEvent<Long> LLJJJJJIL = new C560530Lyd();
    public final LiveEvent<Long> LLJJJJLIIL = new C560530Lyd();
    public final LiveEvent<Long> LLJJL = new C560530Lyd();
    public final LiveEvent<Pair<Integer, Float>> LLJJLIIIJLLLLLLLZ = new C560530Lyd();
    public final LiveEvent<Integer> LLJL = new C560530Lyd();
    public final LiveEvent<Integer> LLJLIL = new C560530Lyd();
    public final LiveEvent<Integer> LLJLILLLLZIIL = new C560530Lyd();
    public final LiveEvent<C1648160szW> LLJLL = new C560530Lyd();
    public final LiveEvent<Boolean> LLJLLIL = new C560530Lyd();
    public final LiveEvent<q> LLJLLL = new C560530Lyd();
    public final LiveEvent<C1634100scq<Integer, Integer, String>> LLJZ = new C560530Lyd();
    public final LiveEvent<Unit> LLJZIJLIL = new C560530Lyd();
    public final LiveEvent<Pair<Integer, Integer>> LLL = new C560530Lyd();
    public final LiveEvent<Unit> LLLF = new C560530Lyd();
    public final LiveEvent<Pair<Integer, Boolean>> LLLFF = new C560530Lyd();
    public final LiveEvent<Unit> LLLFFI = new C560530Lyd();
    public final LiveEvent<Unit> LLLFZ = new C560530Lyd();
    public final LiveEvent<C1653280t7m> LLLI = new C560530Lyd();
    public final LiveEvent<C1652620t6i> LLLII = new C560530Lyd();

    @Override // X.InterfaceC1650190t2n
    public int A91(q qVar, Cert cert, String str, boolean z) {
        return -1;
    }

    @Override // X.InterfaceC1650190t2n
    public void AF2(boolean z) {
    }

    @Override // X.InterfaceC1650190t2n
    public void AJ(String str, String str2, boolean z) {
    }

    @Override // X.InterfaceC1650190t2n
    public boolean Af() {
        return false;
    }

    @Override // X.InterfaceC1650230t2r
    public void Al2(boolean z, Cert cert) {
    }

    @Override // X.InterfaceC1650230t2r
    public void Bg1() {
    }

    @Override // X.InterfaceC1650190t2n
    public void Bh(String str, Map<Integer, Float> map) {
    }

    @Override // X.InterfaceC1650190t2n
    public void CK2(int i) {
    }

    @Override // X.InterfaceC1650230t2r
    public int Cd(boolean z, Cert cert, String str) {
        return -1;
    }

    @Override // X.InterfaceC1650190t2n
    public void E0() {
    }

    @Override // X.InterfaceC1650190t2n
    public void EV1(int i) {
    }

    @Override // X.InterfaceC1650190t2n
    public void GK(float f, float f2) {
    }

    @Override // X.InterfaceC1650190t2n
    public void H31(boolean z, C560530Lyd<C1656320tCg> c560530Lyd) {
    }

    @Override // X.InterfaceC1650190t2n
    public void HT1(boolean z) {
    }

    @Override // X.InterfaceC1650190t2n
    public void Ja0(boolean z) {
    }

    @Override // X.InterfaceC1650190t2n
    public void Jd1() {
    }

    @Override // X.InterfaceC1650190t2n
    public boolean K(boolean z) {
        return false;
    }

    @Override // X.InterfaceC1650190t2n
    public boolean K3(float f, float f2) {
        return false;
    }

    @Override // X.InterfaceC1650190t2n
    public boolean KY() {
        return false;
    }

    @Override // X.InterfaceC1650190t2n
    public void Kg1(float f, float f2) {
    }

    @Override // X.InterfaceC1650230t2r
    public void Kr1(Cert cert, String str) {
    }

    @Override // X.InterfaceC1650190t2n
    public void LE(boolean z) {
    }

    @Override // X.InterfaceC1650190t2n
    public int LJLJJLL() {
        return -1;
    }

    @Override // X.InterfaceC1650190t2n
    public void LJLJLLL(Surface surface) {
    }

    @Override // X.InterfaceC1650190t2n
    public List<String> Lg2() {
        return null;
    }

    @Override // X.InterfaceC1650230t2r
    public void Lo() {
    }

    @Override // X.InterfaceC1650190t2n
    public void Ls1() {
    }

    @Override // X.InterfaceC1650190t2n
    public void M2(boolean z) {
    }

    @Override // X.InterfaceC1650190t2n
    public void NF(s sVar) {
    }

    @Override // X.InterfaceC1650190t2n
    public boolean NS0() {
        return false;
    }

    @Override // X.InterfaceC1650190t2n
    public void Nn(int i, String str) {
    }

    @Override // X.InterfaceC1650190t2n
    public boolean PZ0() {
        return false;
    }

    @Override // X.InterfaceC1650190t2n
    public void Pa(float f, float f2) {
    }

    @Override // X.InterfaceC1650190t2n
    public InterfaceC2253331DHn Pk() {
        return null;
    }

    @Override // X.InterfaceC1650190t2n
    public int Q7(String str, float f) {
        return -1;
    }

    @Override // X.InterfaceC1650190t2n
    public boolean Tc2(boolean z) {
        return false;
    }

    @Override // X.InterfaceC1650230t2r
    public UUID Th(int[] iArr) {
        return null;
    }

    @Override // X.InterfaceC1650190t2n
    public String Th2() {
        return "";
    }

    @Override // X.InterfaceC1650190t2n
    public void U00(Cert cert, boolean z) {
    }

    @Override // X.InterfaceC1650190t2n
    public boolean Ue() {
        return false;
    }

    @Override // X.InterfaceC1650190t2n
    public void Uj(boolean z) {
    }

    @Override // X.InterfaceC1650230t2r
    public boolean Uq() {
        return false;
    }

    @Override // X.InterfaceC1650190t2n
    public boolean Vy2(VESize vESize) {
        return false;
    }

    @Override // X.InterfaceC1650190t2n
    public boolean WE1(boolean z, boolean z2) {
        return false;
    }

    @Override // X.InterfaceC1650190t2n
    public void Wl1(int i) {
    }

    @Override // X.InterfaceC1650190t2n
    public void X8(boolean z) {
    }

    @Override // X.InterfaceC1650190t2n
    public void Y9(String[] strArr, int i, String[] strArr2, int i2) {
    }

    @Override // X.InterfaceC1650190t2n
    public long YG1() {
        return -1L;
    }

    @Override // X.InterfaceC1650230t2r
    public void YM2(boolean z) {
    }

    @Override // X.InterfaceC1650190t2n
    public void Yi2(float f) {
    }

    @Override // X.InterfaceC1650190t2n
    public void ZF(boolean z) {
    }

    @Override // X.InterfaceC1650190t2n
    public InterfaceC2254021DKe ZT() {
        return null;
    }

    @Override // X.InterfaceC1650190t2n
    public void Zi1() {
    }

    @Override // X.InterfaceC1650190t2n
    public void aD1() {
    }

    @Override // X.InterfaceC1650230t2r
    public void aJ0(boolean z, Cert cert) {
    }

    @Override // X.InterfaceC1650190t2n
    public void aJ1(boolean z, C1AIY c1aiy, Cert cert) {
    }

    @Override // X.InterfaceC1650190t2n
    public void bp2(String[] strArr, int i) {
    }

    @Override // X.InterfaceC1650190t2n
    public void br1(boolean z) {
    }

    @Override // X.InterfaceC1650190t2n
    public void c11(InterfaceC2183551Acz interfaceC2183551Acz) {
    }

    @Override // X.InterfaceC1650190t2n
    public void cB0(String str) {
    }

    @Override // X.InterfaceC1650190t2n
    public boolean cC0() {
        return false;
    }

    @Override // X.InterfaceC1650190t2n
    public Effect cP1() {
        return null;
    }

    @Override // X.InterfaceC1650190t2n
    public boolean db() {
        return false;
    }

    @Override // X.InterfaceC1650190t2n
    public void detectDirtyLens(Function2<? super Float, ? super Integer, Unit> function2) {
    }

    @Override // X.InterfaceC1650190t2n
    public void eY1() {
    }

    @Override // X.InterfaceC1650190t2n
    public void ei1(q qVar) {
    }

    @Override // X.InterfaceC1650190t2n
    public boolean fh() {
        return false;
    }

    @Override // X.InterfaceC1650190t2n
    public boolean fp1() {
        return false;
    }

    @Override // X.InterfaceC1650190t2n
    public int getCameraType() {
        return -1;
    }

    @Override // X.InterfaceC1650190t2n
    public int getFlashMode() {
        return -1;
    }

    @Override // X.InterfaceC1650190t2n
    public int getNextFlashMode() {
        return -1;
    }

    @Override // X.InterfaceC1650190t2n
    public void h0() {
    }

    @Override // X.InterfaceC1650190t2n
    public void iO1(String[] strArr, int i) {
    }

    @Override // X.InterfaceC1650190t2n
    public boolean isReuseSurfaceView() {
        return false;
    }

    @Override // X.InterfaceC1650190t2n
    public void j8() {
    }

    @Override // X.InterfaceC1650190t2n
    public void jK(boolean z, Rect[] rectArr) {
    }

    @Override // X.InterfaceC1650190t2n
    public boolean jk() {
        return false;
    }

    @Override // X.InterfaceC1650190t2n
    public void js2() {
    }

    @Override // X.InterfaceC1650190t2n
    public C1650220t2q jx2() {
        return null;
    }

    @Override // X.InterfaceC1650190t2n
    public boolean k80() {
        return false;
    }

    @Override // X.InterfaceC1650190t2n
    public void kH1(boolean z) {
    }

    @Override // X.InterfaceC1650190t2n
    public int kk(float f) {
        return -1;
    }

    @Override // X.InterfaceC1650190t2n
    public SavePhotoStickerInfo kq2() {
        return null;
    }

    @Override // X.InterfaceC1650190t2n
    public void lb1(int i) {
    }

    @Override // X.InterfaceC1650190t2n
    public boolean le0() {
        return false;
    }

    @Override // X.InterfaceC1650190t2n
    public void ls() {
    }

    @Override // X.InterfaceC1650190t2n
    public boolean n() {
        return false;
    }

    @Override // X.InterfaceC1650230t2r
    public void openCamera(Cert cert) {
    }

    @Override // X.InterfaceC1650230t2r
    public void openCamera(Cert cert, boolean z) {
    }

    @Override // X.InterfaceC1650230t2r
    public void ow1(boolean z, Cert cert, boolean z2) {
    }

    @Override // X.InterfaceC1650190t2n
    public int pg(String str, float f, float f2) {
        return -1;
    }

    @Override // X.InterfaceC1650190t2n
    public void pv0(boolean z) {
    }

    @Override // X.InterfaceC1650190t2n
    public void qM(Pair<String, Float> pair, Pair<String, Float> pair2, float f) {
    }

    @Override // X.InterfaceC1650230t2r
    public void qf0(int i, int i2, boolean z, boolean z2, InterfaceC2173471A4j interfaceC2173471A4j, boolean z3) {
    }

    @Override // X.InterfaceC1650190t2n
    public void qh(int i) {
    }

    @Override // X.InterfaceC1650190t2n
    public int re1() {
        return -1;
    }

    @Override // X.InterfaceC1650230t2r
    public void sC2() {
    }

    @Override // X.InterfaceC1650190t2n
    public boolean scaleCamera(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    @Override // X.InterfaceC1650230t2r
    public void sd0(boolean z, Cert cert) {
    }

    @Override // X.InterfaceC1650190t2n
    public void setBodyBeautyLevel(int i) {
    }

    @Override // X.InterfaceC1650190t2n
    public void setExposureSeekBarProgress(float f) {
    }

    @Override // X.InterfaceC1650190t2n
    public void setFilter(String str) {
    }

    @Override // X.InterfaceC1650190t2n
    public void setFilter(String str, float f) {
    }

    @Override // X.InterfaceC1650190t2n
    public void tQ(boolean z) {
    }

    @Override // X.InterfaceC1650190t2n
    public void vo0(boolean z) {
    }

    @Override // X.InterfaceC1650230t2r
    public void vw2(boolean z, Cert cert, boolean z2, boolean z3) {
    }

    @Override // X.InterfaceC1650230t2r
    public C2185991Agv wr(int[] iArr) {
        return null;
    }

    @Override // X.InterfaceC1650190t2n
    public void wr1(C1645090suZ c1645090suZ, C1645090suZ c1645090suZ2, float f) {
    }

    @Override // X.InterfaceC1650190t2n
    public long xV1() {
        return -1L;
    }

    @Override // X.InterfaceC1650190t2n
    public boolean xs1() {
        return false;
    }

    @Override // X.InterfaceC1650190t2n
    public void yN1(C1DLQ c1dlq) {
    }

    @Override // X.InterfaceC1650190t2n
    public void yZ0() {
    }

    @Override // X.InterfaceC1650190t2n
    public int ya(String str, float f, float f2) {
        return -1;
    }

    @Override // X.InterfaceC1650190t2n
    public void zm2(float f) {
    }

    @Override // X.InterfaceC1650190t2n
    public void zo(boolean z) {
    }

    @Override // X.InterfaceC1650190t2n
    public C385670FAf<Double> BP2() {
        return new C385670FAf<>();
    }

    @Override // X.InterfaceC1650230t2r
    public C2253081DGo IU1() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Unit> O71() {
        return new LiveEvent<>();
    }

    @Override // X.InterfaceC1650190t2n
    public AudioRecordModule OA2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650190t2n
    public InterfaceC2254081DKk St2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650230t2r
    public InterfaceC2208871Bcj Tl() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650190t2n
    public C2177931ALn V21() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650230t2r
    public C2253191DGz Zd1() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650190t2n
    public C1DHU ep() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650190t2n
    public View fF2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650190t2n
    public InterfaceC1645720sva getEffectController() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("EffectController requires real implementation");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650190t2n
    public View getPreviewView() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650190t2n
    public C1DHV qa() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650190t2n
    public VEDisplaySettings s1() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650190t2n
    public InterfaceC2253831DJl u92() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650190t2n
    public boolean yC() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650190t2n
    public InterfaceC576950Mk1 yP() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650190t2n
    public C385670FAf<Boolean> A31() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Unit> AQ0() {
        return this.LLLFZ;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Unit> Br2() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Long> DB1() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Unit> DS1() {
        return this.LLLF;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<C1653280t7m> Dm2() {
        return this.LLLI;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Long> Fs0() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Unit> HE2() {
        return this.LLLFFI;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Pair<Integer, Integer>> JO1() {
        return this.LLL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Long> Kg0() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Boolean> Or0() {
        return this.LLJLLIL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Pair<Integer, Boolean>> Q30() {
        return this.LLLFF;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveData<Float> Tz1() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Unit> Wt0() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveData<C1DLP> bX1() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<C1652620t6i> bu2() {
        return this.LLLII;
    }

    @Override // X.InterfaceC1650190t2n
    public Point cn() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Pair<Integer, Float>> f72() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Integer> fT0() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC1650190t2n
    public C1DKV getRecordContext() {
        return this.LL;
    }

    @Override // X.InterfaceC1650190t2n
    public s getSpeed() {
        return s.NORMAL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<C1403440mco> h92() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC1650190t2n
    public C385670FAf<Long> hE2() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveData<Boolean> lq0() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<C1634100scq<Integer, Integer, String>> o62() {
        return this.LLJZ;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Integer> oN() {
        return this.LLJL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Boolean> ok0() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<q> p92() {
        return this.LLJLLL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Unit> ph0() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1650190t2n
    public CameraComponentModel pw0() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Integer> qB() {
        return this.LLJLIL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveData<C1448140nmu> qF1() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Integer> qG2() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Unit> r12() {
        return this.LLJZIJLIL;
    }

    @Override // X.InterfaceC1650230t2r
    public LiveEvent<Boolean> tR1() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1650190t2n
    public C385670FAf<Boolean> tS1() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Boolean> vB1() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<C1648160szW> vC1() {
        return this.LLJLL;
    }

    @Override // X.InterfaceC1650190t2n
    public s wD() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Long> xF1() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC1650190t2n
    public C385670FAf<Boolean> xl0() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Boolean> y82() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1650190t2n
    public C385670FAf<Boolean> yj1() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1650190t2n
    public int D4(VEDisplaySettings vEDisplaySettings) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650190t2n
    public void I70(s sVar) {
        this.LLILLL = sVar;
    }

    @Override // X.InterfaceC1650230t2r
    public void Ot1(List<String> list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650230t2r
    public void PB(InterfaceC1659000tH0 interfaceC1659000tH0) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650230t2r
    public void QK(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650190t2n
    public void Zl0(C1663770tOh c1663770tOh) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650230t2r
    public void vQ1(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650190t2n
    public void w61(C1648160szW c1648160szW) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650190t2n
    public void zj1(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650230t2r
    public void DS0(Cert cert, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650230t2r
    public void PR(Cert cert, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650230t2r
    public void bc1(boolean z, Cert cert) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650190t2n
    public int cd0(q qVar, Cert cert, String str) {
        return A91(qVar, cert, str, false);
    }
}
