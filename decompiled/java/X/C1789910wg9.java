package X;

import com.bytedance.iap.core.model.IAPProductDetail;
import com.bytedance.iap.core.model.IAPQueryRequest;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0wg9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.iap.service.IapServiceClass$getIapProductDetailsV2$1", f = "IapServiceClass.kt", l = {240}, m = "invokeSuspend")
public final class C1789910wg9 extends C09AX implements Function1<InterfaceC1364105Vn<? super AbstractC1157840gEg<List<? extends IAPProductDetail>>>, Object> {
    public int LL;
    public final /* synthetic */ C1617170sBX LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1789910wg9(C1617170sBX c1617170sBX, InterfaceC1364105Vn<? super C1789910wg9> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c1617170sBX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1789910wg9(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super AbstractC1157840gEg<List<? extends IAPProductDetail>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1780720wRK enumC1780720wRK;
        C1C7U.LIZ("IapServiceClass@66cd.getIapProductDetailsV2$1");
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
            C1789140weu c1789140weuLIZIZ = InterfaceC1789300wfA.LIZ.LIZIZ();
            C1617170sBX c1617170sBX = this.LLILLJJLI;
            String str = c1617170sBX.LIZ;
            List<String> list = c1617170sBX.LIZIZ;
            if (Intrinsics.LJFF(c1617170sBX.LIZJ, "inapp")) {
                enumC1780720wRK = EnumC1780720wRK.INAPP;
            } else {
                enumC1780720wRK = EnumC1780720wRK.SUBSCRIPTION;
            }
            IAPQueryRequest iAPQueryRequest = new IAPQueryRequest(str, list, enumC1780720wRK);
            this.LL = 1;
            obj = c1789140weuLIZIZ.LJI(iAPQueryRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IapServiceClass@66cd.getIapProductDetailsV2$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("IapServiceClass@66cd.getIapProductDetailsV2$1");
        return obj;
    }
}
