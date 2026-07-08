package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1E8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2276421E8i extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Throwable LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2276421E8i(String str, Throwable th) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = th;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str = this.LL;
        C2276441E8k.LIZIZ.LIZ(new C807250Vlb(C207083161p.LIZIZ.LIZ(), str), "UBTraceLogger", "", this.LLILLJJLI);
        return Unit.LIZ;
    }
}
