package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xMr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816390xMr extends C09AY implements Function1<C1397660mTU, Unit> {
    public final /* synthetic */ C1816270xMf LL;
    public final /* synthetic */ C1816400xMs LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ List<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1816390xMr(C1816270xMf c1816270xMf, C1816400xMs c1816400xMs, String str, List<String> list) {
        super(1);
        this.LL = c1816270xMf;
        this.LLILLJJLI = c1816400xMs;
        this.LLILLL = str;
        this.LLILZ = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) {
        this.LL.LIZJ.qD1(false);
        C1816400xMs c1816400xMs = this.LLILLJJLI;
        String str = this.LLILLL;
        String string = this.LLILZ.toString();
        c1816400xMs.getClass();
        C1816400xMs.LIZJ(str, "edit", string);
        return Unit.LIZ;
    }
}
