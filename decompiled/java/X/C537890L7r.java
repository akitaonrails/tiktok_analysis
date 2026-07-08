package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0L7r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C537890L7r extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C537860L7o LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C537890L7r(C537860L7o c537860L7o, int i, String str) {
        super(0);
        this.LL = c537860L7o;
        this.LLILLJJLI = i;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJJIIZ(new C381350ExJ(this.LLILLJJLI, this.LLILLL, 4));
        return Unit.LIZ;
    }
}
