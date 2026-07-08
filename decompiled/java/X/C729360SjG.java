package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS243S0000000_11;
import njp.a;

/* JADX INFO: renamed from: X.0SjG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.publish.ClassicStoryPublishManager$restoreStoryPublishSchedule$1$1$1", f = "ClassicStoryPublishManager.kt", l = {}, m = "invokeSuspend")
public final class C729360SjG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C729440SjO LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C729360SjG(C729440SjO c729440SjO, InterfaceC1364105Vn<? super C729360SjG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c729440SjO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C729360SjG(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ClassicStoryPublishManager@844a.restoreStoryPublishSchedule$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLILLJJLI.LIZ(AFwS243S0000000_11.get$arr$(656));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ClassicStoryPublishManager@844a.restoreStoryPublishSchedule$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
