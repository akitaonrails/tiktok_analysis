package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01dW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.performance.preload.PostModeABPreloadHelper$preloadForPhotoModeLaunch$1$jobs$1$1", f = "PostModeABPreloadHelper.kt", l = {}, m = "invokeSuspend")
public final class C378401dW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C378401dW(int i, int i2, int i3, InterfaceC1364105Vn<? super C378401dW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C378401dW(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PostModeABPreloadHelper@e2f4.preloadForPhotoModeLaunch$1$jobs$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        int i2 = this.LLILLJJLI;
        int i3 = i * i2;
        int i4 = i2 + i3;
        while (i3 < i4 && i3 < this.LLILLL) {
            ((Function0) ListProtector.get((List) C505101xx.LIZLLL.getValue(), i3)).invoke();
            i3++;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PostModeABPreloadHelper@e2f4.preloadForPhotoModeLaunch$1$jobs$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
