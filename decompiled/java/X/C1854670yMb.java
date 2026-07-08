package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yMb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1854670yMb extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ C1854650yMZ LLILLL;
    public final /* synthetic */ C1854660yMa LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1854670yMb(String str, Function0<Unit> function0, C1854650yMZ c1854650yMZ, C1854660yMa c1854660yMa) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = function0;
        this.LLILLL = c1854650yMZ;
        this.LLILZ = c1854660yMa;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (Intrinsics.LJFF(this.LL, "ai_create_menu_edit_image")) {
            Function0<Unit> function0 = this.LLILLJJLI;
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            this.LLILLL.LIZJ(this.LLILZ);
            Function1<? super String, Unit> function1 = this.LLILLL.LLJ.LIZIZ;
            if (function1 != null) {
                function1.invoke(this.LL);
            }
        }
        return Unit.LIZ;
    }
}
