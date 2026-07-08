package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1CdU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234821CdU extends C09AY implements Function0<Integer> {
    public final /* synthetic */ C2234651CdD LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234821CdU(C2234651CdD c2234651CdD, String str) {
        super(0);
        this.LL = c2234651CdD;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf((int) this.LL.LIZ.LLILZ(this.LLILLJJLI));
    }
}
