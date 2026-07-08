package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04kF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1184504kF extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Function1<Integer, Unit> LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1184504kF(int i, Function0 function0, Function0 function02, Function1 function1, boolean z) {
        super(0);
        this.LL = function0;
        this.LLILLJJLI = z;
        this.LLILLL = function1;
        this.LLILZ = i;
        this.LLILZIL = function02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.invoke();
        if (!this.LLILLJJLI) {
            this.LLILLL.invoke(Integer.valueOf(this.LLILZ));
        }
        this.LLILZIL.invoke();
        return Unit.LIZ;
    }
}
