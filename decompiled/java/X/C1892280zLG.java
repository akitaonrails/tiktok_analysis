package X;

import android.widget.ImageView;
import com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0zLG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem$setGiftOnlyText$1", f = "MatchCountDownAssem.kt", l = {785}, m = "invokeSuspend")
public final class C1892280zLG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MatchCountDownAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1892280zLG(MatchCountDownAssem matchCountDownAssem, InterfaceC1364105Vn<? super C1892280zLG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = matchCountDownAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1892280zLG(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CharSequence text;
        MatchCountDownAssem matchCountDownAssem;
        C16F5 c16f5;
        C1C7U.LIZ("MatchCountDownAssem@1efb.setGiftOnlyText$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C20488215Ey<C981160bdi> c20488215Ey = this.LLILLJJLI.LLLIL;
            this.LL = 1;
            obj = c20488215Ey.LIZIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MatchCountDownAssem@1efb.setGiftOnlyText$1");
                return objLJFF;
            }
        }
        C981160bdi c981160bdi = (C981160bdi) obj;
        if (c981160bdi == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MatchCountDownAssem@1efb.setGiftOnlyText$1");
            return unit;
        }
        MatchCountDownAssem matchCountDownAssem2 = this.LLILLJJLI;
        String str = c981160bdi.LIZ;
        matchCountDownAssem2.LLLIIIIL = str;
        if (str != null && !a0.LJJJIL(str)) {
            this.LLILLJJLI.kp(0);
            C16F5 c16f52 = this.LLILLJJLI.LLJILJILJ;
            if (c16f52 != null) {
                text = c16f52.getText();
            } else {
                text = null;
            }
            if (!Intrinsics.LJFF(text, this.LLILLJJLI.LLLIIIIL) && (c16f5 = (matchCountDownAssem = this.LLILLJJLI).LLJILJILJ) != null) {
                c16f5.setText(matchCountDownAssem.LLLIIIIL);
            }
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(c981160bdi.LIZIZ);
            c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
            c1324610kZfLJIIIZ.LJJI(this.LLILLJJLI.LLJILLL);
        } else {
            this.LLILLJJLI.kp(8);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MatchCountDownAssem@1efb.setGiftOnlyText$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
