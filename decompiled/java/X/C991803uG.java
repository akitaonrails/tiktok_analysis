package X;

import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.header.SeaSkuHeaderTopWidget;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AwS109S0101000_1;
import njp.a;

/* JADX INFO: renamed from: X.03uG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.header.SeaSkuHeaderTopWidget$updateHeaderTopLabels$2$2$1", f = "SeaSkuHeaderTopWidget.kt", l = {}, m = "invokeSuspend")
public final class C991803uG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SeaSkuHeaderTopWidget LL;
    public final /* synthetic */ Map<String, Object> LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Map<String, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C991803uG(SeaSkuHeaderTopWidget seaSkuHeaderTopWidget, Map<String, ? extends Object> map, int i, Map<String, ? extends Object> map2, InterfaceC1364105Vn<? super C991803uG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = seaSkuHeaderTopWidget;
        this.LLILLJJLI = map;
        this.LLILLL = i;
        this.LLILZ = map2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C991803uG(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaSkuHeaderTopWidget@b8b3.updateHeaderTopLabels$2$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJII().er0().LIZIZ(this.LLILLJJLI);
        C10412045i c10412045i = this.LL.LLJI;
        if (c10412045i != null) {
            C1748720vbi.LJI(c10412045i, new C10515049h(), AFwS185S0000000_1.get$arr$(519), "c66700.d0", PageFinder.via((View) this.LL.LLJI), new AwS109S0101000_1(this.LLILLL, (int) this.LLILZ, (Map<String, ? extends Object>) 10));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaSkuHeaderTopWidget@b8b3.updateHeaderTopLabels$2$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
