package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xol, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1833690xol extends C09AY implements Function1<C1397660mTU, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1833690xol(boolean z, String str) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) {
        if (this.LL) {
            C1833640xog c1833640xog = C1833640xog.LIZ;
            String str = this.LLILLJJLI;
            c1833640xog.getClass();
            C1833640xog.LIZIZ("click", "cancel", str);
        }
        return Unit.LIZ;
    }
}
