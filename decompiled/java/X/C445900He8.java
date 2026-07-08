package X;

import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0He8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragmentV2$setupAvatarDelegate$2$1", f = "EndIncentiveSettlementFragmentV2.kt", l = {}, m = "invokeSuspend")
public final class C445900He8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AtomicReference<Bitmap> LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ C1295960jpS LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C445900He8(AtomicReference<Bitmap> atomicReference, Bitmap bitmap, C1295960jpS c1295960jpS, InterfaceC1364105Vn<? super C445900He8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = atomicReference;
        this.LLILLJJLI = bitmap;
        this.LLILLL = c1295960jpS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C445900He8(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EndIncentiveSettlementFragmentV2@f702.setupAvatarDelegate$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.set(this.LLILLJJLI);
        this.LLILLL.updateBitmap("Avatar.png", this.LL.get());
        this.LLILLL.invalidate();
        this.LLILLL.requestLayout();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EndIncentiveSettlementFragmentV2@f702.setupAvatarDelegate$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
