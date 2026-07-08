package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18Y5, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18Y5 extends C09AY implements Function1<C0LAB, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18Y5(boolean z, String str, int i) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0LAB c0lab) {
        C0LAB c0lab2 = c0lab;
        c0lab2.LJFF("submit_success", this.LL);
        if (this.LLILLJJLI.length() > 0) {
            c0lab2.LJ("client_task_id", this.LLILLJJLI);
        }
        int i = this.LLILLL;
        if (i != 0) {
            c0lab2.LIZ(i, "submit_error_code");
        }
        return Unit.LIZ;
    }
}
