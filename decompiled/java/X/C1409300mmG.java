package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mmG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.inspiration.data.ImageInspirationDataComponent$getInspirationListData$8", f = "ImageInspirationDataComponent.kt", l = {}, m = "invokeSuspend")
public final class C1409300mmG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1409290mmF LL;
    public final /* synthetic */ Exception LLILLJJLI;
    public final /* synthetic */ C1409340mmK LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409300mmG(InterfaceC1409290mmF interfaceC1409290mmF, Exception exc, C1409340mmK c1409340mmK, InterfaceC1364105Vn<? super C1409300mmG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1409290mmF;
        this.LLILLJJLI = exc;
        this.LLILLL = c1409340mmK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1409300mmG(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageInspirationDataComponent@4ae1.getInspirationListData$8");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1409290mmF interfaceC1409290mmF = this.LL;
        String message = this.LLILLJJLI.getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        interfaceC1409290mmF.onError(message);
        List<InterfaceC1409290mmF> list = this.LLILLL.LLJJI;
        Exception exc = this.LLILLJJLI;
        for (InterfaceC1409290mmF interfaceC1409290mmF2 : list) {
            String message2 = exc.getMessage();
            if (message2 == null) {
                message2 = "Unknown error";
            }
            interfaceC1409290mmF2.onError(message2);
        }
        this.LLILLL.LLJJI.clear();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageInspirationDataComponent@4ae1.getInspirationListData$8");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
