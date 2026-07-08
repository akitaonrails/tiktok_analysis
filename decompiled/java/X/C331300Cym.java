package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Cym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.bubble.manager.StoryInteractionListManager$refreshCurrentBubbleWithoutReset$1$1", f = "StoryInteractionListManager.kt", l = {}, m = "invokeSuspend")
public final class C331300Cym extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C730840Sle LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331300Cym(String str, C730840Sle c730840Sle, InterfaceC1364105Vn<? super C331300Cym> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c730840Sle;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331300Cym(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryInteractionListManager@8654.refreshCurrentBubbleWithoutReset$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!Intrinsics.LJFF(this.LL, this.LLILLJJLI.LLILLJJLI)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StoryInteractionListManager@8654.refreshCurrentBubbleWithoutReset$1$1");
            return unit;
        }
        this.LLILLJJLI.LL.LJJIJLIJ(C13BV.INSTANCE);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoryInteractionListManager@8654.refreshCurrentBubbleWithoutReset$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
