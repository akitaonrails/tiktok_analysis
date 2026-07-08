package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0YWa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C875460YWa extends C09AY implements Function1<C0YXB, Unit> {
    public final /* synthetic */ List<C869590Y9l> LL;
    public final /* synthetic */ int LLILLJJLI = 1;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C875460YWa(String str, List list, Long l) {
        super(1);
        this.LL = list;
        this.LLILLL = str;
        this.LLILZ = l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0YXB c0yxb) {
        c0yxb.LJJIIJZLJL(this.LLILLJJLI, this.LLILLL, this.LL, this.LLILZ);
        return Unit.LIZ;
    }
}
