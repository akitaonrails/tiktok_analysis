package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Cce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234301Cce extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ C2234651CdD LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL = false;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234301Cce(C2234651CdD c2234651CdD, String str) {
        super(0);
        this.LL = c2234651CdD;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.LL.LIZ.LJLZ(this.LLILLJJLI, this.LLILLL));
    }
}
