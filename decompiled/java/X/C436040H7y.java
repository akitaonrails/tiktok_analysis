package X;

import Y.ACListenerS20S0301000_6;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H7y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.utils.SearchConcatFrameUtils$SearchConcatFrameHelper$bindFramesAtTitle$1", f = "SearchConcatFrameUtils.kt", l = {245}, m = "invokeSuspend")
public final class C436040H7y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0H86 LLILLJJLI;
    public final /* synthetic */ C436050H7z LLILLL;
    public final /* synthetic */ Function2<Float, Map<String, String>, Unit> LLILZ;
    public final /* synthetic */ Float LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C436040H7y(C0H86 c0h86, C436050H7z c436050H7z, Function2<? super Float, ? super Map<String, String>, Unit> function2, Float f, InterfaceC1364105Vn<? super C436040H7y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0h86;
        this.LLILLL = c436050H7z;
        this.LLILZ = function2;
        this.LLILZIL = f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C436040H7y(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchConcatFrameUtils$SearchConcatFrameHelper@26cc.bindFramesAtTitle$1");
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
            C0H86 c0h86 = this.LLILLJJLI;
            this.LL = 1;
            if (c0h86.LIZIZ(this) == objLJFF) {
                C1C7U.LIZIZ("SearchConcatFrameUtils$SearchConcatFrameHelper@26cc.bindFramesAtTitle$1");
                return objLJFF;
            }
        }
        LinearLayout linearLayout = this.LLILLJJLI.LIZLLL;
        if (linearLayout != null) {
            C09RD c09rd = new C09RD(linearLayout);
            C436050H7z c436050H7z = this.LLILLL;
            Function2<Float, Map<String, String>, Unit> function2 = this.LLILZ;
            Float f = this.LLILZIL;
            int i2 = 0;
            for (View view : c09rd) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    View view2 = view;
                    if (view2 instanceof SmartImageView) {
                        C1322090kVb c1322090kVb = (C1322090kVb) view2;
                        c1322090kVb.setController(null);
                        C0H80 c0h80 = (C0H80) C13LP.LJJJLZIJ(i2, c436050H7z.LIZ);
                        if (c0h80 != null) {
                            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c0h80.LIZ));
                            int width = c1322090kVb.getWidth();
                            int height = c1322090kVb.getHeight();
                            c1331670kl3LJIIIIZZ.LJIIIIZZ = width;
                            c1331670kl3LJIIIIZZ.LJIIIZ = height;
                            c1331670kl3LJIIIIZZ.LJJ((InterfaceC1334290kpH) view2);
                            c1331670kl3LJIIIIZZ.LJIIJJI();
                            C786410Ut5.I7(new ACListenerS20S0301000_6(function2, f, i2, c0h80, 1), view2);
                        }
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        LinearLayout linearLayout2 = this.LLILLJJLI.LIZLLL;
        if (linearLayout2 != null) {
            C786410Ut5.LJZL(0, linearLayout2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchConcatFrameUtils$SearchConcatFrameHelper@26cc.bindFramesAtTitle$1");
        return unit;
    }
}
