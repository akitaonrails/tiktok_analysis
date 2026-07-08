package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sc8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724940Sc8 extends C09AY implements Function0<C07XA> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C723800SaI LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C724940Sc8(int i, int i2, C723800SaI c723800SaI) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = c723800SaI;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C07XA invoke() {
        return new C07XA(this.LLILLL.LIZ, this.LL / (r1 + this.LLILLJJLI));
    }
}
