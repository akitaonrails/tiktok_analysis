package X;

import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QfG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM$handleRequestFailed$3", f = "PhotoSearchBaseVM.kt", l = {}, m = "invokeSuspend")
public final class C675920QfG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PhotoSearchBaseVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C675920QfG(PhotoSearchBaseVM photoSearchBaseVM, InterfaceC1364105Vn<? super C675920QfG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = photoSearchBaseVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C675920QfG(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PhotoSearchBaseVM@68d3.handleRequestFailed$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LL.setValue(new C676090QfX<>(null, EnumC675990QfN.FAILED));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoSearchBaseVM@68d3.handleRequestFailed$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
