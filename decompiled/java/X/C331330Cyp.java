package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cyp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.bubble.manager.StoryInteractionListManager$fetchStoryBulletList$1$pageValue$1", f = "StoryInteractionListManager.kt", l = {}, m = "invokeSuspend")
public final class C331330Cyp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C730840Sle LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331330Cyp(C730840Sle c730840Sle, InterfaceC1364105Vn<? super C331330Cyp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c730840Sle;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331330Cyp(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryInteractionListManager@8654.fetchStoryBulletList$1$pageValue$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LL.setBubbleDataReady(true);
        this.LL.LL.LJJIJIIJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryInteractionListManager@8654.fetchStoryBulletList$1$pageValue$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
