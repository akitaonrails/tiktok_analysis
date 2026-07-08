package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RWV, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RWV extends C09AY implements Function1<C697100RWa, C697100RWa> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RWV(String str, boolean z) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C697100RWa invoke(C697100RWa c697100RWa) {
        String str = this.LL;
        C291001Au c291001Au = new C291001Au(Boolean.valueOf(this.LLILLJJLI));
        c697100RWa.getClass();
        return new C697100RWa(c291001Au, str);
    }
}
