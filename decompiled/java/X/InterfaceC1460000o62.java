package X;

import android.animation.LayoutTransition;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import iyl.i3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0o62, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1460000o62 extends InterfaceC1455610nyx, InterfaceC564950MDt {
    public static final C1460170o6J LJJJJZI = new Object() { // from class: X.0o6J
    };

    void A2(int i);

    C1464760oDi AY();

    boolean Dq();

    void EF1(LifecycleOwner lifecycleOwner, Function1<? super LivePhotoPreviewMode, Unit> function1);

    LiveData<String> EH0();

    void EJ2(int i, ImageUrlModel imageUrlModel);

    void FA1(int i);

    void GE0(LifecycleOwner lifecycleOwner, Function1<? super C1464760oDi, Unit> function1);

    void Ga0(int i, C1662100tM0 c1662100tM0);

    void Gz2(int i, Function1<? super View, Unit> function1);

    void HG(LifecycleOwner lifecycleOwner, Function1<? super C375830EoP<EnumC1651790t5N>, Unit> function1);

    LiveData<C1460070o69> JG0();

    void Jj0(int i, boolean z);

    void Jo2(boolean z);

    void KK0(int i, String str);

    void Kb0(String str);

    /* synthetic */ void Kv2();

    void L31(LifecycleOwner lifecycleOwner, Function1<? super C1644450stX<Integer, Function1<View, Unit>>, Unit> function1);

    void NI1(int i, int i2);

    void Nn2(int i, Function1<? super i3, i3> function1);

    C1459620o5Q OO();

    void OU(LifecycleOwner lifecycleOwner, Function1<? super String, Unit> function1);

    void Ob(boolean z);

    LiveData<C1460160o6I> Ov();

    boolean Oz1();

    LiveData<Boolean> QM1();

    void Rc0(int i, Function2<? super Integer, ? super Integer, Unit> function2);

    LiveData<C1460180o6K> T80(int i);

    void TA2(EnumC1651790t5N enumC1651790t5N);

    void TL2(LifecycleOwner lifecycleOwner, Function1<? super C1644450stX<Integer, LayoutTransition>, Unit> function1);

    void Tx(boolean z);

    void UH2(LivePhotoPreviewMode livePhotoPreviewMode);

    void Ux(int i, boolean z);

    void WM1(LifecycleOwner lifecycleOwner, Function1<? super C1644450stX<Integer, C1662100tM0>, Unit> function1);

    LiveData<Boolean> Wc1();

    LiveData<Boolean> Wr();

    MutableLiveData<LivePhotoPreviewMode> X72();

    void YB2(LifecycleOwner lifecycleOwner, Function1<? super C529150Kp7, Unit> function1);

    void YF2(LifecycleOwner lifecycleOwner, Function1<? super C1644450stX<Integer, Function2<Integer, Integer, Unit>>, Unit> function1);

    String Ye();

    void Yq2();

    void cT0(boolean z);

    void ci1(LifecycleOwner lifecycleOwner, Function1<? super C529150Kp7, Unit> function1);

    LiveData<ImageUrlModel> cs0(int i);

    LiveData<Boolean> dD2(int i);

    LiveData<Boolean> ev0();

    boolean fi1();

    void fl(C1460160o6I c1460160o6I);

    void gK0(LifecycleOwner lifecycleOwner, Function1<? super C1644450stX<Integer, Integer>, Unit> function1);

    LiveData<Integer> getCurrentState();

    void gr1(LifecycleOwner lifecycleOwner, Function1<? super C1644450stX<Integer, String>, Unit> function1);

    void k50(boolean z);

    void lC0(C1453050nup c1453050nup);

    void mT0(int i, int i2);

    void oz(boolean z);

    void p5(boolean z);

    void rm(int i, boolean z);

    void rt();

    void sF0(boolean z);

    void tA(LifecycleOwner lifecycleOwner, Function1<? super C1453050nup, Unit> function1);

    void tL2(LifecycleOwner lifecycleOwner, Function1<? super Integer, Unit> function1);

    LiveData<Unit> ug0();

    LiveData<Boolean> v82();

    void wv(int i, boolean z);

    void xD2(int i, LayoutTransition layoutTransition);

    LiveData<Boolean> yB2();

    /* synthetic */ void yY();

    void zD2(LifecycleOwner lifecycleOwner, Function1<? super C1644450stX<Integer, Integer>, Unit> function1);
}
