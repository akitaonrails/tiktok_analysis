package X;

import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.vision.RDPhotoSearchTraceLogParams;
import com.ss.android.ugc.aweme.vision.RDPhotoSearchTraceTime;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qfd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM$sendRequest$3$2", f = "PhotoSearchBaseVM.kt", l = {}, m = "invokeSuspend")
public final class C676150Qfd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PhotoSearchBaseVM LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ Function1<C676050QfT, Unit> LLILLL;
    public final /* synthetic */ C676050QfT LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C676150Qfd(PhotoSearchBaseVM photoSearchBaseVM, long j, Function1<? super C676050QfT, Unit> function1, C676050QfT c676050QfT, InterfaceC1364105Vn<? super C676150Qfd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = photoSearchBaseVM;
        this.LLILLJJLI = j;
        this.LLILLL = function1;
        this.LLILZ = c676050QfT;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C676150Qfd(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        RDPhotoSearchTraceLogParams rDPhotoSearchTraceLogParams;
        C1C7U.LIZ("PhotoSearchBaseVM@68d3.sendRequest$3$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        RDPhotoSearchTraceTime rDPhotoSearchTraceTime = this.LL.LLJI;
        if (rDPhotoSearchTraceTime != null && (rDPhotoSearchTraceLogParams = rDPhotoSearchTraceTime.logParams) != null) {
            rDPhotoSearchTraceLogParams.setImageLoadCost(C2286608xc.LJFF(System.currentTimeMillis() - this.LLILLJJLI));
        }
        this.LLILLL.invoke(this.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoSearchBaseVM@68d3.sendRequest$3$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
