package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DHa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2253201DHa extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1DHY LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2253201DHa(C1DHY c1dhy, long j, String str, String str2, String str3) {
        super(0);
        this.LL = c1dhy;
        this.LLILLJJLI = j;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1DHZ c1dhz = this.LL.LIZIZ;
        if (c1dhz != null) {
            c1dhz.LJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
        }
        return Unit.LIZ;
    }
}
