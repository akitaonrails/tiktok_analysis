package X;

import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eWU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092000eWU extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C1092100eWe LL;
    public final /* synthetic */ C1092090eWd LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1092000eWU(C1092100eWe c1092100eWe, C1092090eWd c1092090eWd) {
        super(1);
        this.LL = c1092100eWe;
        this.LLILLJJLI = c1092090eWd;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        Function1<Boolean, Unit> function1 = this.LL.LJIILLIIL;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(zBooleanValue));
        }
        if (!zBooleanValue) {
            final C1092090eWd c1092090eWd = this.LLILLJJLI;
            HandlerHook.viewPost(c1092090eWd, new Runnable() { // from class: X.0eWT
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiveBoardsTipView@1523.assembleView$3$1");
                    try {
                        c1092090eWd.LJFF();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveBoardsTipView@1523.assembleView$3$1");
                }
            });
        }
        return Unit.LIZ;
    }
}
