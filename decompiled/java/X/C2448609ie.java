package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09ie, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2448609ie extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C2449709ip LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2448609ie(boolean z, C2449709ip c2449709ip) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = c2449709ip;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL) {
            this.LLILLJJLI.LJ(true);
        } else {
            this.LLILLJJLI.LJ(false);
        }
        return Unit.LIZ;
    }
}
