package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0a2G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C919500a2G extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C921440a5O LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C919500a2G(int i, long j, C921440a5O c921440a5O, String str) {
        super(0);
        this.LL = c921440a5O;
        this.LLILLJJLI = j;
        this.LLILLL = str;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJJLIIIJL(this.LLILZ, this.LLILLJJLI, this.LLILLL, Boolean.TRUE);
        return Unit.LIZ;
    }
}
