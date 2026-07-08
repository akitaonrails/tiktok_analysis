package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0EOK, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public interface C0EOK extends C05YF {
    void AL0(MutableLiveData<Boolean> mutableLiveData);

    void Ca(int i, Function1<? super StickerModel, Unit> function1);

    MutableLiveData<Boolean> Ea1();

    void He(int i, C0FUG c0fug);

    void IB0(MutableLiveData<Boolean> mutableLiveData);

    C0EOH Ja();

    void Jp(C0FUD c0fud);

    List<C0FEO> Kd2();

    void LJJZZI(C0FTB c0ftb);

    void LJLLLL(C0FTB c0ftb);

    StickerModel LLJJIJI(int i);

    int[] LLJLLIL();

    List<StickerModel> LLLILZLLLI(EnumC1466150oFx enumC1466150oFx);

    List<StickerModel> Lm();

    void M3(List<Integer> list, String str, EnumC356070Dxd enumC356070Dxd);

    void O2(boolean z);

    void PF0(boolean z);

    void T(List<? extends StickerModel> list, EnumC356070Dxd enumC356070Dxd);

    C0EOM Y00();

    void Y62(InterfaceC363790EOb interfaceC363790EOb);

    GestureLayout$OnGestureListener ac();

    List<C0FFC> c1();

    void ch1(FrameLayout frameLayout, FrameLayout frameLayout2, CreativeInfo creativeInfo, C358780E4u c358780E4u, boolean z);

    void d71(EnumC1466150oFx enumC1466150oFx, boolean z);

    void dp1(InterfaceC363790EOb interfaceC363790EOb);

    void eb(StickerModel stickerModel);

    StickerModel f3(StickerModel stickerModel, EnumC356070Dxd enumC356070Dxd);

    void fO2(EnumC1466150oFx enumC1466150oFx, String str, Function1<? super StickerModel, Unit> function1);

    void fm(C0FUG c0fug);

    void gN1(int i, boolean z, EnumC356070Dxd enumC356070Dxd);

    void k2(EnumC1466150oFx enumC1466150oFx, C0FUG c0fug);

    void k3(StickerModel stickerModel, EnumC356070Dxd enumC356070Dxd);

    MutableLiveData<Boolean> m81();

    void oW1(EnumC1466150oFx enumC1466150oFx);

    boolean onBackPressed();

    void qt1();

    void setDisplayPos(int i, int i2, int i3, int i4);

    void setVisibility(int i);

    void sq(Integer num, Float f, Float f2);

    StickerModel tP0(String str);

    void w3(List<? extends StickerModel> list, EnumC356070Dxd enumC356070Dxd);

    View wh();
}
