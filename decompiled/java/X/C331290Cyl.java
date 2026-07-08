package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Cyl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.bubble.manager.StoryInteractionListManager$refreshCurrentBubbleWithoutReset$1$2", f = "StoryInteractionListManager.kt", l = {}, m = "invokeSuspend")
public final class C331290Cyl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C730840Sle LLILLJJLI;
    public final /* synthetic */ List<InterfaceC1891350zJl> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C331290Cyl(String str, C730840Sle c730840Sle, List<? extends InterfaceC1891350zJl> list, InterfaceC1364105Vn<? super C331290Cyl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c730840Sle;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331290Cyl(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryInteractionListManager@8654.refreshCurrentBubbleWithoutReset$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!Intrinsics.LJFF(this.LL, this.LLILLJJLI.LLILLJJLI)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StoryInteractionListManager@8654.refreshCurrentBubbleWithoutReset$1$2");
            return unit;
        }
        this.LLILLJJLI.LL.LJJIJLIJ(this.LLILLL);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoryInteractionListManager@8654.refreshCurrentBubbleWithoutReset$1$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
