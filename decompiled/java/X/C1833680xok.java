package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1833680xok extends C09AY implements Function1<C1397660mTU, Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1833680xok(String str, Function0 function0, boolean z) {
        super(1);
        this.LL = function0;
        this.LLILLJJLI = z;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) {
        this.LL.invoke();
        if (this.LLILLJJLI) {
            C1833640xog c1833640xog = C1833640xog.LIZ;
            String str = this.LLILLL;
            c1833640xog.getClass();
            C1833640xog.LIZIZ("click", "confirm", str);
        }
        return Unit.LIZ;
    }
}
