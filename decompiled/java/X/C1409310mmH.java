package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mmH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.inspiration.data.ImageInspirationDataComponent$getInspirationData$result$4", f = "ImageInspirationDataComponent.kt", l = {}, m = "invokeSuspend")
public final class C1409310mmH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1409340mmK LL;
    public final /* synthetic */ Exception LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409310mmH(C1409340mmK c1409340mmK, Exception exc, InterfaceC1364105Vn<? super C1409310mmH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1409340mmK;
        this.LLILLJJLI = exc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1409310mmH(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageInspirationDataComponent@4ae1.getInspirationData$result$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<InterfaceC1409290mmF> list = this.LL.LLJJI;
        Exception exc = this.LLILLJJLI;
        for (InterfaceC1409290mmF interfaceC1409290mmF : list) {
            String message = exc.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            interfaceC1409290mmF.onError(message);
        }
        this.LL.LLJJI.clear();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageInspirationDataComponent@4ae1.getInspirationData$result$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
