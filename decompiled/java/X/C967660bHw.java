package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bHw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967660bHw extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ C966020bFI LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C967660bHw(C966020bFI c966020bFI) {
        super(0);
        this.LL = c966020bFI;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(!this.LL.LJJIIJZLJL().isFloat());
    }
}
