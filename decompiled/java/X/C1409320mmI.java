package X;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mmI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.inspiration.data.ImageInspirationDataComponent$getInspirationListData$7", f = "ImageInspirationDataComponent.kt", l = {}, m = "invokeSuspend")
public final class C1409320mmI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1409290mmF LL;
    public final /* synthetic */ C1409340mmK LLILLJJLI;
    public final /* synthetic */ CancellationException LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409320mmI(InterfaceC1409290mmF interfaceC1409290mmF, C1409340mmK c1409340mmK, CancellationException cancellationException, InterfaceC1364105Vn<? super C1409320mmI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1409290mmF;
        this.LLILLJJLI = c1409340mmK;
        this.LLILLL = cancellationException;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1409320mmI(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageInspirationDataComponent@4ae1.getInspirationListData$7");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1409290mmF interfaceC1409290mmF = this.LL;
        new C1409410mmR(-1, "Cancelled");
        interfaceC1409290mmF.onLoading();
        List<InterfaceC1409290mmF> list = this.LLILLJJLI.LLJJI;
        CancellationException cancellationException = this.LLILLL;
        for (InterfaceC1409290mmF interfaceC1409290mmF2 : list) {
            String message = cancellationException.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            interfaceC1409290mmF2.onError(message);
        }
        this.LLILLJJLI.LLJJI.clear();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageInspirationDataComponent@4ae1.getInspirationListData$7");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
