package X;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0woy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.channel.google.IAPGoogleChannel$launchPurchaseFlow$2$result$1", f = "IAPGoogleChannel.kt", l = {}, m = "invokeSuspend")
public final class C1795380woy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C19885612rG>, Object> {
    public final /* synthetic */ AbstractC1795460wp6 LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ C1795840wpi LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1795380woy(AbstractC1795460wp6 abstractC1795460wp6, Activity activity, C1795840wpi c1795840wpi, InterfaceC1364105Vn<? super C1795380woy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1795460wp6;
        this.LLILLJJLI = activity;
        this.LLILLL = c1795840wpi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1795380woy(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IAPGoogleChannel@ef9a.launchPurchaseFlow$2$result$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19885612rG c19885612rGLJIIIZ = this.LL.LJIIIZ(this.LLILLJJLI, this.LLILLL);
        C1C7U.LIZIZ("IAPGoogleChannel@ef9a.launchPurchaseFlow$2$result$1");
        return c19885612rGLJIIIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C19885612rG> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
