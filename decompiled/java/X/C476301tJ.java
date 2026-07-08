package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01tJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.StoryGestureTransitionComponent$bypassExit$2$1", f = "StoryGestureTransitionComponent.kt", l = {}, m = "invokeSuspend")
public final class C476301tJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Bitmap LL;
    public final /* synthetic */ C1656570tD5 LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C476301tJ(Bitmap bitmap, C1656570tD5 c1656570tD5, long j, Function0<Unit> function0, InterfaceC1364105Vn<? super C476301tJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bitmap;
        this.LLILLJJLI = c1656570tD5;
        this.LLILLL = j;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C476301tJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryGestureTransitionComponent@9bdd.bypassExit$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1656570tD5.W1(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryGestureTransitionComponent@9bdd.bypassExit$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
