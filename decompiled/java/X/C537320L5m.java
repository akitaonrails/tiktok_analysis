package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS48S1300000_8;

/* JADX INFO: renamed from: X.0L5m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C537320L5m extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ String[] LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C537320L5m(String[] strArr, C19EG c19eg, String str, Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.LL = strArr;
        this.LLILLJJLI = c19eg;
        this.LLILLL = str;
        this.LLILZ = function0;
        this.LLILZIL = function02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        c1397620mTQ2.LJFF(2131849194, new AwS48S1300000_8(this.LL, (String[]) this.LLILLJJLI, (C19EG) this.LLILLL, (String) this.LLILZ, (Function0<Unit>) 4));
        c1397620mTQ2.LJII(2131849193, new AwS48S1300000_8(this.LL, (String[]) this.LLILLJJLI, (C19EG) this.LLILLL, (String) this.LLILZIL, (Function0<Unit>) 5));
        return Unit.LIZ;
    }
}
