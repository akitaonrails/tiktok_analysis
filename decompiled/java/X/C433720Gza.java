package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.poi.detail.lynx.PoiDetailLynxAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Gza, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.lynx.PoiDetailLynxAssem$genLynxView$1", f = "PoiDetailLynxAssem.kt", l = {411}, m = "invokeSuspend")
public final class C433720Gza extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PoiDetailLynxAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433720Gza(PoiDetailLynxAssem poiDetailLynxAssem, InterfaceC1364105Vn<? super C433720Gza> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = poiDetailLynxAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433720Gza(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ViewGroup viewGroup;
        C1C7U.LIZ("PoiDetailLynxAssem@b7a6.genLynxView$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(4400L, this) == objLJFF) {
                C1C7U.LIZIZ("PoiDetailLynxAssem@b7a6.genLynxView$1");
                return objLJFF;
            }
        }
        PoiDetailLynxAssem poiDetailLynxAssem = this.LLILLJJLI;
        View view = poiDetailLynxAssem.LLJJJJJIL;
        ViewParent parent = null;
        if (view != null) {
            parent = view.getParent();
        }
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(poiDetailLynxAssem.LLJJJJJIL, viewGroup);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiDetailLynxAssem@b7a6.genLynxView$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
