package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00Kb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C060300Kb extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Function1<Integer, Unit> LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Function1<Integer, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C060300Kb(Function0<Unit> function0, boolean z, Function1<? super Integer, Unit> function1, int i, Function1<? super Integer, Unit> function12) {
        super(0);
        this.LL = function0;
        this.LLILLJJLI = z;
        this.LLILLL = function1;
        this.LLILZ = i;
        this.LLILZIL = function12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.invoke();
        if (!this.LLILLJJLI) {
            this.LLILLL.invoke(Integer.valueOf(this.LLILZ));
        }
        this.LLILZIL.invoke(Integer.valueOf(this.LLILZ));
        return Unit.LIZ;
    }
}
