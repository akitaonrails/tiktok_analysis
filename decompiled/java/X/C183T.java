package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.183T, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C183T extends C09AY implements Function1<C183I, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function1<C183I, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C183T(boolean z, AwS576S0100000_32 awS576S0100000_32, boolean z2, AwS576S0100000_32 awS576S0100000_322, AwS611S0100000_32 awS611S0100000_32) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = awS576S0100000_32;
        this.LLILLL = z2;
        this.LLILZ = awS576S0100000_322;
        this.LLILZIL = awS611S0100000_32;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C183I c183i) {
        Function0<Unit> function0;
        if (this.LL) {
            Function0<Unit> function02 = this.LLILLJJLI;
            if (function02 != null) {
                function02.invoke();
            }
        } else if (this.LLILLL && (function0 = this.LLILZ) != null) {
            function0.invoke();
        }
        Function1<C183I, Unit> function1 = this.LLILZIL;
        if (function1 != null) {
            function1.invoke(c183i);
        }
        return Unit.LIZ;
    }
}
