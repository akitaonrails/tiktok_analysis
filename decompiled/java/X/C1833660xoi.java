package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xoi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1833660xoi extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1833660xoi(String str, Function0 function0, boolean z) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL) {
            C1833640xog c1833640xog = C1833640xog.LIZ;
            String str = this.LLILLJJLI;
            c1833640xog.getClass();
            C1833640xog.LIZIZ("click", "cancel", str);
        }
        this.LLILLL.invoke();
        return Unit.LIZ;
    }
}
