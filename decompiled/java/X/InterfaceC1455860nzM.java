package X;

import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import dmt.av.video.ReplayLiveData;
import dmt.av.video.StoredLiveData;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import dmt.av.video.VEPreviewMusicParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0nzM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1455860nzM extends C05YF {
    LiveData<Unit> Ac0();

    void Ae1(boolean z, int i);

    FilterBean Bi2();

    LiveData<Unit> Cq0();

    void DV1(boolean z, int i);

    void E4();

    void EH2(boolean z);

    @InterfaceC1294060jmO
    void EY0(VEVolumeChangeOp vEVolumeChangeOp);

    void F32(boolean z);

    void FJ(boolean z);

    LiveData<C1452720nuI> G9();

    boolean GF();

    LiveData<Boolean> Gt0();

    void HV(boolean z);

    MutableLiveData<Integer> Hn0();

    void J00(float f, float f2);

    boolean JA2(VEPreviewMusicParams vEPreviewMusicParams, List<? extends VEPreviewMusicParams> list);

    void LH1(VEPreviewMusicParams vEPreviewMusicParams, long j, long j2, long j3, long j4);

    LiveData<VEVolumeChangeOp> Lb2();

    LiveData<Unit> Lv2();

    MutableLiveData<C1453160nv0> MW1();

    void MZ(int i);

    LiveData<Pair<Unit, String>> NC1();

    LiveData<Pair<Unit, String>> NZ0();

    C352350Drd OC0();

    boolean OO2();

    void Oe(int i, int i2, VEBaseFilterParam vEBaseFilterParam);

    LiveData<Void> Ov0();

    void PI0();

    void PO2();

    MutableLiveData<Boolean> Ps();

    InterfaceC574340Mfo QD1();

    int RB0();

    void SQ0(boolean z);

    void SX(C1450120nq6 c1450120nq6);

    void UD2(boolean z, int i);

    LiveData<Boolean> UL0();

    FrameLayout UZ();

    LiveData<Pair<Boolean, C1456940o16>> Up();

    int VF0();

    LiveData<C1450150nq9> VG1();

    void Wb1(C1450150nq9 c1450150nq9);

    MutableLiveData<C348470DlN> X21();

    void XN(int i);

    LiveData<Pair<Boolean, Integer>> XO0();

    LiveData<C1456890o11> Yh();

    LiveData<Pair<Boolean, Integer>> Yx1();

    MutableLiveData<Boolean> Z90();

    StoredLiveData<C1452720nuI> ZB2();

    MutableLiveData<C1403050mcB> Zu1();

    LiveData<Pair<Boolean, Integer>> a80();

    void aI0(List<? extends C1450120nq6> list);

    void aM0(C1453160nv0 c1453160nv0);

    boolean aN1();

    void ad2();

    LiveData<VEEditorAutoStartStopArbiter> b10();

    LiveData<C1450120nq6> b22();

    void bk2();

    void cF2(List<? extends VEPreviewMusicParams> list);

    void cL(MutableLiveData<Integer> mutableLiveData);

    void cv0(C346940Diu c346940Diu, boolean z);

    LiveData<IAudioEffectParam> d02();

    ReplayLiveData<C0EYM> dS1();

    void dh1(C348470DlN c348470DlN);

    ArrayList<EffectPointModel> dt();

    LiveData<Boolean> eC2();

    void eL(boolean z);

    void eT(boolean z, C1456940o16 c1456940o16);

    ViewGroup.MarginLayoutParams ej();

    void fA1();

    void finish();

    void fu1(C346940Diu c346940Diu);

    LiveData<InterfaceC1452170ntP> g();

    void gI2();

    void gM(String str);

    LiveData<Pair<Boolean, Integer>> gS0();

    AbstractC1452680nuE gc();

    LiveData<SurfaceView> ge();

    LiveData<Integer> getBottomTabHeight();

    LiveData<C1453000nuk> gq1();

    void gx2();

    void hi0(int i);

    MutableLiveData<Integer> iM0();

    LiveData<String> im1(int i);

    void iw0(boolean z);

    int k52();

    LiveData<Boolean> kF0();

    LiveData<C1404120mdu> kJ2();

    void kw0(C346940Diu c346940Diu);

    void l4(boolean z);

    MutableLiveData<Bitmap> lk();

    LiveData<VEPreviewMusicParams> mL();

    void ml1();

    void mw0(boolean z);

    void nC1(int i);

    LiveData<Void> nK2();

    void nM0(boolean z);

    void ne1(String str);

    LiveData<Boolean> oC0();

    LiveData<Unit> oG2();

    void oH2(boolean z);

    MutableLiveData<Boolean> oP();

    LiveData<Unit> op();

    void pn2(C1453000nuk c1453000nuk);

    void rG2(boolean z, boolean z2, Function0<Unit> function0);

    LiveData<Boolean> rV();

    void rt1(FilterBean filterBean, FilterBean filterBean2, float f);

    LiveData<Unit> s20();

    LiveData<Boolean> sc1();

    void sendEffectMsg(int i, long j, long j2, String str);

    void setPreviewFps(int i, boolean z);

    void sn1(String str);

    void tH1(C364400EQk c364400EQk);

    void tU0();

    LiveData<Integer> tg0();

    void u();

    LiveData<Pair<Unit, String>> uA2();

    void uG0(boolean z);

    void uM1();

    LiveData<Unit> ub0();

    void updateTrackFilterParam(int i, VEBaseFilterParam vEBaseFilterParam);

    void vA(boolean z, int i);

    void vK2();

    MutableLiveData<C1452730nuJ> vW1();

    void w80(String str);

    void wi0();

    LiveData<Void> ww2();

    void x7(boolean z, boolean z2, boolean z3, boolean z4);

    LiveData<InterfaceC358220E2q> xq1();

    LiveData<Pair<Unit, String>> yJ1();

    LiveEvent<VEPreviewMusicParams> yr0();

    void zI2();

    LiveData<InterfaceC1453220nv6> zj2();
}
