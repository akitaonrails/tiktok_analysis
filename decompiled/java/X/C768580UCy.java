package X;

import Y.ARunnableS112S0100000_12;
import android.view.SurfaceView;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UCy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.LiveEffectPreviewHelper$startPreview$2$1", f = "LiveEffectPreviewHelper.kt", l = {}, m = "invokeSuspend")
public final class C768580UCy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C768560UCw LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C768580UCy(C768560UCw c768560UCw, Function0<Unit> function0, InterfaceC1364105Vn<? super C768580UCy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c768560UCw;
        this.LLILLJJLI = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C768580UCy(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        C1C7U.LIZ("LiveEffectPreviewHelper@7d76.startPreview$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AnonymousClass0956 anonymousClass0956 = this.LL.LIZLLL;
        boolean z = true;
        if (anonymousClass0956 == null || !anonymousClass0956.isCancelled()) {
            final C768560UCw c768560UCw = this.LL;
            if (c768560UCw.LIZLLL != null) {
                C0UD1 c0ud1 = c768560UCw.LIZJ;
                if (c0ud1 != null) {
                    this.LLILLJJLI.invoke();
                    c0ud1.LIZJ(new C0UD3() { // from class: X.0UD0
                        @Override // X.C0UD3
                        public final void onEvent() {
                            C768560UCw c768560UCw2 = c768560UCw;
                            ViewGroup viewGroup = c768560UCw2.LIZ;
                            if (viewGroup != null) {
                                HandlerHook.viewPost(viewGroup, new ARunnableS112S0100000_12(c768560UCw2, 31));
                            }
                            C20441214yg.LJ("LiveEffectPreviewHelper", "startPreview");
                        }
                    });
                    SurfaceView surfaceView = c768560UCw.LIZIZ;
                    if (surfaceView != null && (layoutParams2 = surfaceView.getLayoutParams()) != null) {
                        i = layoutParams2.width;
                    } else {
                        i = 0;
                    }
                    SurfaceView surfaceView2 = c768560UCw.LIZIZ;
                    if (surfaceView2 != null && (layoutParams = surfaceView2.getLayoutParams()) != null) {
                        i2 = layoutParams.height;
                    } else {
                        i2 = 0;
                    }
                    Pair pairLJ = C768560UCw.LJ(i, i2);
                    int iIntValue = ((Number) pairLJ.getFirst()).intValue();
                    int iIntValue2 = ((Number) pairLJ.getSecond()).intValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    if (c768560UCw.LIZIZ == null) {
                        z = false;
                    }
                    sbLIZ.append(z);
                    sbLIZ.append(", width: ");
                    sbLIZ.append(iIntValue);
                    sbLIZ.append(", height: ");
                    sbLIZ.append(iIntValue2);
                    C20441214yg.LJ("LiveEffectPreviewHelper", C2188811AlT.LIZIZ(sbLIZ));
                    c0ud1.LIZIZ(c768560UCw.LIZIZ, iIntValue, iIntValue2);
                    C0UD1 c0ud12 = c768560UCw.LIZJ;
                    if (c0ud12 != null) {
                        C2286608xc.LJ(c0ud12.start());
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("LiveEffectPreviewHelper@7d76.startPreview$2$1");
                return unit;
            }
        }
        this.LL.LIZ();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LiveEffectPreviewHelper@7d76.startPreview$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
