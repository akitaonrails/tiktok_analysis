package X;

import com.ss.android.ugc.aweme.im.feature.animation.AnimationQueueManagerAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Wx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.feature.animation.AnimationQueueManagerAssem$enqueue$1", f = "AnimationQueueManagerAssem.kt", l = {}, m = "invokeSuspend")
public final class C1622506Wx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AnimationQueueManagerAssem LL;
    public final /* synthetic */ Function1<Function1<? super Boolean, Unit>, Unit> LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ C06XH LLILZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ AbstractC1751306tT LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1622506Wx(AnimationQueueManagerAssem animationQueueManagerAssem, Function1<? super Function1<? super Boolean, Unit>, Unit> function1, Function0<Unit> function0, C06XH c06xh, Function1<? super Boolean, Unit> function12, boolean z, boolean z2, long j, AbstractC1751306tT abstractC1751306tT, InterfaceC1364105Vn<? super C1622506Wx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = animationQueueManagerAssem;
        this.LLILLJJLI = function1;
        this.LLILLL = function0;
        this.LLILZ = c06xh;
        this.LLILZIL = function12;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = j;
        this.LLJ = abstractC1751306tT;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1622506Wx(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AnimationQueueManagerAssem@5e87.enqueue$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.enqueueInternal(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AnimationQueueManagerAssem@5e87.enqueue$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
