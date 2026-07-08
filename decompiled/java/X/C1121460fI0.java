package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.FastGiftMetaData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fI0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.touchpoint.TouchPointCommonUtilsKt$preloadImages$4", f = "TouchPointCommonUtils.kt", l = {}, m = "invokeSuspend")
public final class C1121460fI0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FastGiftMetaData LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1121460fI0(FastGiftMetaData fastGiftMetaData, InterfaceC1364105Vn<? super C1121460fI0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = fastGiftMetaData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1121460fI0(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TouchPointCommonUtilsKt@d5f2.preloadImages$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ImageModel imageModel = this.LL.icon;
        if (imageModel != null) {
            C1121540fI8.LIZ(imageModel);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TouchPointCommonUtilsKt@d5f2.preloadImages$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
