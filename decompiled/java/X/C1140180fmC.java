package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fmC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1140180fmC extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1139900flk LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ AbstractC1140580fmq LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1140180fmC(C1139900flk c1139900flk, long j, String str, AbstractC1140580fmq abstractC1140580fmq) {
        super(0);
        this.LL = c1139900flk;
        this.LLILLJJLI = j;
        this.LLILLL = str;
        this.LLILZ = abstractC1140580fmq;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1139900flk c1139900flk = this.LL;
        if (c1139900flk != null) {
            c1139900flk.LJI = true;
            c1139900flk.LJIIJ = this.LLILLJJLI;
            c1139900flk.LJIIIIZZ = EnumC1140010flv.DONE;
            String str = this.LLILLL;
            if (str == null) {
                str = "";
            }
            c1139900flk.LJIIIZ = str;
        }
        AbstractC1140580fmq abstractC1140580fmq = this.LLILZ;
        if (abstractC1140580fmq != null) {
            abstractC1140580fmq.LIZ(c1139900flk);
        }
        return Unit.LIZ;
    }
}
