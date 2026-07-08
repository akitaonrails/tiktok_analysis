package X;

import android.graphics.RectF;
import android.view.View;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FVq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC391240FVq extends C05YF {
    public static final C391270FVt LJJJJZ = C391270FVt.LIZ;

    void Gk(int i, C0FUG c0fug);

    LiveEvent<Boolean> Gm1();

    void HL2(Function0<Unit> function0);

    void JF2(Pair<Integer, Integer> pair, EnumC1466150oFx enumC1466150oFx);

    void KN2();

    InterfaceC1444160ngU LJJIFFI();

    void LJJZZI(C0FTB c0ftb);

    void LJLLLL(C0FTB c0ftb);

    <T> T LLIIIZ(EnumC1466150oFx enumC1466150oFx);

    void LLILII(boolean z, String str, int i, C0FSX c0fsx, Integer num, Integer num2, Integer num3, Integer num4, C0FSZ c0fsz);

    StickerModel LLJJIJI(int i);

    List<StickerModel> LLLILZLLLI(EnumC1466150oFx enumC1466150oFx);

    @InterfaceC1294060jmO
    List<C0FTJ<StickerModel>> LLLLLZ(EnumC1466150oFx enumC1466150oFx);

    void M3(List<Integer> list, String str, EnumC356070Dxd enumC356070Dxd);

    void Ne(EnumC1466150oFx enumC1466150oFx, List<? extends StickerModel> list, String str, Function0<Unit> function0, Function0<Unit> function02);

    void Ps0();

    void RG1();

    void T(List<? extends StickerModel> list, EnumC356070Dxd enumC356070Dxd);

    void Tn0(EnumC1466150oFx enumC1466150oFx, C0FTJ<? extends StickerModel> c0ftj, String str, Function1<? super StickerModel, Unit> function1);

    void Vv();

    void XJ(int i, String str, EnumC356070Dxd enumC356070Dxd);

    void aR(float f);

    View aS();

    void ab(boolean z);

    Pair<Integer, Integer> al();

    void cj2(int i, C0FSX c0fsx);

    boolean ck();

    InterfaceC390990FUr dC2();

    StickerModel f3(StickerModel stickerModel, EnumC356070Dxd enumC356070Dxd);

    void h12(StickerModel stickerModel);

    void hide();

    void k3(StickerModel stickerModel, EnumC356070Dxd enumC356070Dxd);

    void kT1(int i, int i2);

    void lm(int i, List<? extends Function1<? super StickerModel, Unit>> list);

    void mx2(boolean z);

    void pm(C390500FSu c390500FSu);

    void ql(int i, C0FUD c0fud);

    void rd(int i, EnumC1466150oFx enumC1466150oFx);

    List<StickerModel> s32();

    void sS(StickerModel stickerModel);

    InterfaceC19530911b9 sd2();

    void show();

    C0FTJ<StickerModel> tq(int i);

    C390640FTi uM0();

    void ud();

    InterfaceC19657911vd up0();

    boolean vs0();

    List<StickerModel> w3(List<? extends StickerModel> list, EnumC356070Dxd enumC356070Dxd);

    void xm2(boolean z);

    Pair<Float, Float> y42(RectF rectF);
}
