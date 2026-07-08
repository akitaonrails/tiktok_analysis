package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18ZX, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18ZX extends C09AY implements Function1<C0LAB, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18ZX(int i, long j, String str, boolean z) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = j;
        this.LLILLL = i;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0LAB c0lab) {
        C0LAB c0lab2 = c0lab;
        c0lab2.LIZ(this.LL ? 1 : 0, "save_result");
        c0lab2.LIZIZ(this.LLILLJJLI, "cost_time");
        if (!this.LL) {
            c0lab2.LIZ(this.LLILLL, "error_code");
            c0lab2.LJ("error_stage", this.LLILZ);
        }
        return Unit.LIZ;
    }
}
