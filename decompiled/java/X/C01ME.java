package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ME, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.util.PcsCourseVideoPlayerUtilsKt$tryUpdatePlayer$1", f = "PcsCourseVideoPlayerUtils.kt", l = {61}, m = "invokeSuspend")
public final class C01ME extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function2<C0N0Y, InterfaceC1364105Vn<? super Unit>, Object> LLILLJJLI;
    public final /* synthetic */ C0N0Y LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01ME(Function2<? super C0N0Y, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, C0N0Y c0n0y, InterfaceC1364105Vn<? super C01ME> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function2;
        this.LLILLL = c0n0y;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01ME(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsCourseVideoPlayerUtilsKt@bf2d.tryUpdatePlayer$1");
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
            Function2<C0N0Y, InterfaceC1364105Vn<? super Unit>, Object> function2 = this.LLILLJJLI;
            C0N0Y c0n0y = this.LLILLL;
            this.LL = 1;
            if (function2.invoke(c0n0y, this) == objLJFF) {
                C1C7U.LIZIZ("PcsCourseVideoPlayerUtilsKt@bf2d.tryUpdatePlayer$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsCourseVideoPlayerUtilsKt@bf2d.tryUpdatePlayer$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
