package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0E6A, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E6A extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C0E48 LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E6A(boolean z, boolean z2, C0E48 c0e48, long j, Function0 function0) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = c0e48;
        this.LLILZ = j;
        this.LLILZIL = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0E48 c0e48 = this.LLILLL;
        if (c0e48 != null) {
            c0e48.S7().LIZIZ(Boolean.valueOf(this.LL), "full_bg_view_visibility", this.LLILLJJLI);
        }
        C354270Duj.LIZJ(this.LLILZ, new AwS549S0100000_5(this.LLILZIL, (Function0<Unit>) 1128));
        return Unit.LIZ;
    }
}
