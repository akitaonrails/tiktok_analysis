package X;

import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HeA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.end.weakcontainer.components.RankingWeakContainerComponent$setupAvatarDelegate$2$1", f = "RankingWeakContainerComponent.kt", l = {}, m = "invokeSuspend")
public final class C445920HeA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AtomicReference<Bitmap> LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ C1295960jpS LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C445920HeA(AtomicReference<Bitmap> atomicReference, Bitmap bitmap, C1295960jpS c1295960jpS, InterfaceC1364105Vn<? super C445920HeA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = atomicReference;
        this.LLILLJJLI = bitmap;
        this.LLILLL = c1295960jpS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C445920HeA(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RankingWeakContainerComponent@3a78.setupAvatarDelegate$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.set(this.LLILLJJLI);
        this.LLILLL.updateBitmap("Avatar.png", this.LL.get());
        this.LLILLL.invalidate();
        this.LLILLL.requestLayout();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RankingWeakContainerComponent@3a78.setupAvatarDelegate$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
