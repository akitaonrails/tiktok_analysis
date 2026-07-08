package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Cyo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.bubble.manager.StoryInteractionListManager$fetchStoryBulletList$1$1", f = "StoryInteractionListManager.kt", l = {}, m = "invokeSuspend")
public final class C331320Cyo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C730840Sle LLILLJJLI;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<C331340Cyq>> LLILLL;
    public final /* synthetic */ AbstractC316870CbV<C331340Cyq> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C331320Cyo(String str, C730840Sle c730840Sle, InterfaceC1364105Vn<? super AbstractC316870CbV<C331340Cyq>> interfaceC1364105Vn, AbstractC316870CbV<C331340Cyq> abstractC316870CbV, InterfaceC1364105Vn<? super C331320Cyo> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LL = str;
        this.LLILLJJLI = c730840Sle;
        this.LLILLL = interfaceC1364105Vn;
        this.LLILZ = abstractC316870CbV;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331320Cyo(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryInteractionListManager@8654.fetchStoryBulletList$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!Intrinsics.LJFF(this.LL, this.LLILLJJLI.LLILLJJLI)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StoryInteractionListManager@8654.fetchStoryBulletList$1$1");
            return unit;
        }
        InterfaceC1364105Vn<AbstractC316870CbV<C331340Cyq>> interfaceC1364105Vn = this.LLILLL;
        AbstractC316870CbV<C331340Cyq> abstractC316870CbV = this.LLILZ;
        C189200o6.m2constructorimpl(abstractC316870CbV);
        interfaceC1364105Vn.resumeWith(abstractC316870CbV);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoryInteractionListManager@8654.fetchStoryBulletList$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
