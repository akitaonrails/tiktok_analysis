package X;

import android.content.Context;
import android.graphics.Point;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import zoo.b;

/* JADX INFO: renamed from: X.122Q, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public interface C122Q extends C05YF {
    LiveEvent<Unit> AC1();

    C560530Lyd<Boolean> AZ();

    LiveEvent<Unit> Aa();

    InterfaceC196933123f Aa0();

    void BG1(String str);

    LiveEvent<TextWatcher> Br1();

    LiveData<Pair<String, String>> Bz();

    void CU1(float f, boolean z);

    Pair<Float, Float> Cc(Context context);

    void Cf2(boolean z, C196925122x c196925122x);

    void Ct(TextStickerData textStickerData, boolean z);

    LiveData<TextStickerData> D9();

    void DJ2(long j);

    LiveEvent<C196925122x> DT();

    void DU0();

    void Dg(boolean z);

    C385670FAf<C196925122x> Dj0();

    LiveEvent<TextStickerData> Dp1();

    LiveEvent<Boolean> Dz2();

    boolean E2(C21645419nQ c21645419nQ);

    LiveEvent<C196925122x> Es1();

    void Eu(boolean z);

    void Fb2(boolean z);

    void Fo();

    void Fw0(C196925122x c196925122x);

    LiveEvent<Function1<C196925122x, Unit>> GV1();

    boolean Gb();

    LiveEvent<InterfaceC196910122i> Gh2();

    C560530Lyd<Unit> H1();

    LiveEvent<InterfaceC196928123a> Hf1();

    void IH1(C196925122x c196925122x);

    void IQ1(C196925122x c196925122x);

    int Ir0();

    LiveEvent<Unit> JO0();

    void JR1(boolean z);

    void Jl(InterfaceC196910122i interfaceC196910122i);

    InterfaceC1444160ngU LJJIFFI();

    void LJJJJJ(int i);

    boolean LJJJLZIJ();

    boolean LJJLIIIJLJLI(float f);

    boolean LJLL();

    Point LLFZ();

    void LLJJIJIL();

    void LLLLJ();

    boolean LLLLJI(float f);

    boolean LLLLLLLLL(b bVar, float f, float f2);

    List<C196925122x> LLLLLLZZ();

    boolean LLLLZLLIL();

    boolean LLLZLZ(b bVar);

    LiveEvent<String> Li0();

    void Mj0();

    C196925122x Mw0();

    LiveEvent<Unit> N62();

    LiveEvent<Boolean> N80();

    void NB0(C196925122x c196925122x);

    void NZ();

    void Nr1(boolean z);

    TextStickerData Nw2();

    Iterator<C196925122x> OV1();

    LiveEvent<View.OnClickListener> Ob0();

    void PJ1(C196925122x c196925122x);

    void Pb(boolean z);

    LiveEvent<Unit> QA2();

    void Qg0(String str, String str2);

    void R02();

    void R3(boolean z);

    void Ss(InterfaceC196915122n interfaceC196915122n);

    void Sy1(int i);

    void T1();

    int T10();

    void T3(Function1<? super C196925122x, Unit> function1);

    LiveEvent<Integer> Tv0();

    void U4();

    LiveEvent<Boolean> Uf2();

    void V1(Function2<? super C196925122x, ? super C196925122x, Unit> function2);

    LiveEvent<Unit> Vo();

    C15O7<List<TextStickerCompileResult>> Vz2(C196932123e c196932123e, ViewGroup viewGroup);

    LiveEvent<TextStickerData> W41();

    void WY(List<TextStickerTextWrap> list);

    LiveData<Pair<Float, Boolean>> WZ();

    void Wf();

    void X3(TextWatcher textWatcher);

    LiveEvent<InterfaceC196915122n> X40();

    void X61(TextStickerData textStickerData);

    void XD(InterfaceC196929123b interfaceC196929123b);

    LiveEvent<Unit> XG0();

    LiveEvent<Boolean> XI();

    TextWatcher XI1();

    LiveEvent<C196925122x> Xs0();

    void YH(TextStickerData textStickerData, String str);

    ArrayList<TextStickerData> Yn2();

    void Yo(C196925122x c196925122x);

    void Yr();

    void Z3(MutableLiveData<Boolean> mutableLiveData);

    LiveEvent<InfoStickerModel> ZV0();

    void Ze(C196925122x c196925122x);

    C196925122x Zn0();

    void Zn1(C196925122x c196925122x);

    LiveEvent<Boolean> Zp2();

    void Zs1();

    LiveEvent<InterfaceC196929123b> Zy2();

    void a2(boolean z);

    LiveEvent<Unit> aX0();

    LiveEvent<Integer> aY0();

    void aa(boolean z);

    boolean ab1();

    void ag2();

    void at(TextStickerData textStickerData);

    void b(Pair<Integer, Integer> pair);

    boolean b8();

    void bP(TextStickerData textStickerData);

    void bf();

    boolean c0();

    C560530Lyd<Boolean> c2();

    LiveEvent<Integer> c6();

    void cK1(TextStickerData textStickerData);

    void cO(C196925122x c196925122x);

    void co2(C196925122x c196925122x, Integer num);

    void d3();

    void dQ2(boolean z);

    void eC1(AnonymousClass1243 anonymousClass1243);

    void eY0(Pair<String, Integer> pair);

    void f8(Function1<? super C196925122x, Unit> function1);

    boolean fl2();

    LiveEvent<Integer> ft1();

    void fv0(boolean z);

    LiveEvent<Unit> gb1();

    LiveEvent<C196925122x> gc1();

    String getTextContent();

    void gp2(String str);

    void hL2(int i);

    InteractStickerStruct hN1(Context context, List<? extends StickerItemModel> list, Gson gson);

    void ha1(EnumC390580FTc enumC390580FTc);

    boolean ha2();

    void hide();

    LiveEvent<Pair<TextStickerData, Boolean>> hq2();

    List<C196925122x> ht();

    void i();

    void i7(InfoStickerModel infoStickerModel);

    LiveEvent<Pair<C196925122x, Integer>> i92();

    void iJ2(float f, boolean z);

    LiveEvent<Function2<C196925122x, C196925122x, Unit>> iy2();

    C15O7<List<TextStickerCompileResult>> jI0(C196932123e c196932123e, ViewGroup viewGroup, boolean z);

    void ja(boolean z);

    void kN1(C560530Lyd<Unit> c560530Lyd);

    C560530Lyd<Unit> kP2();

    void lT(C196925122x c196925122x, Context context);

    LiveEvent<Boolean> lm2();

    LiveEvent<Pair<TextStickerData, String>> m41();

    C385670FAf<Boolean> mo();

    List<InteractStickerStruct> nt(Context context, List<? extends StickerItemModel> list, Gson gson);

    LiveEvent<Unit> nx0();

    C560530Lyd<Boolean> o00();

    LiveEvent<C196925122x> o61();

    void oF2(C196925122x c196925122x);

    List<C196925122x> ol1();

    List<TextStickerData> on();

    boolean onDown(MotionEvent motionEvent);

    boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

    boolean onScale(ScaleGestureDetector scaleGestureDetector);

    boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector);

    boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

    boolean onSingleTapConfirmed(MotionEvent motionEvent);

    boolean onUp(MotionEvent motionEvent);

    LiveEvent<Unit> ou2();

    void ov(TextWatcher textWatcher);

    LiveEvent<List<TextStickerTextWrap>> pA();

    void pM(boolean z);

    LiveEvent<Function1<C196925122x, Unit>> pM1();

    List<TextStickerData> ps2();

    void qs(View.OnClickListener onClickListener);

    void qw0(TextStickerData textStickerData);

    C560530Lyd<Unit> qz1();

    LiveEvent<Pair<Integer, Integer>> rW1();

    C385670FAf<Boolean> rb();

    LiveEvent<C196925122x> sC0();

    void sE1(boolean z);

    void setEnable(boolean z);

    void show();

    void t01();

    void t80(int i);

    void tm(boolean z);

    C560530Lyd<Pair<Boolean, Boolean>> u2();

    LiveEvent<TextStickerData> vC2();

    LiveEvent<Unit> wy0();

    LiveEvent<Pair<String, Integer>> xL();

    void xg0(InterfaceC196933123f interfaceC196933123f);

    void y92(TextStickerData textStickerData);

    LiveEvent<String> yE2();

    LiveEvent<Unit> yP2();

    boolean ym1();

    void yr(boolean z);

    LiveEvent<C196925122x> yx();

    LiveEvent<Boolean> ze0();

    void zl(InterfaceC196928123a interfaceC196928123a);
}
