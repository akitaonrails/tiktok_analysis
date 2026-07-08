package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CJX, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CJX extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CJX(String str, long j) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0CJW c0cjw = C0CJW.LIZLLL;
        C0CJW.LJFF(c0cjw, this.LL, this.LLILLJJLI);
        c0cjw.LIZ(new C0CJA(c0cjw));
        return Unit.LIZ;
    }
}
