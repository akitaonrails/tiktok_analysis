package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS10S0410000_21;

/* JADX INFO: renamed from: X.0mJO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1391400mJO extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C013C LLILZ;
    public final /* synthetic */ C1391380mJM LLILZIL;
    public final /* synthetic */ Number LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ C259800zU<C0I7D> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1391400mJO(boolean z, String str, String str2, C013C c013c, C1391380mJM c1391380mJM, Number number, boolean z2, C259800zU<C0I7D> c259800zU) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = c013c;
        this.LLILZIL = c1391380mJM;
        this.LLILZLL = number;
        this.LLIZ = z2;
        this.LLIZLLLIL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        if (this.LL) {
            c1397620mTQ2.LIZJ(1, this.LLILLJJLI, new AwS10S0410000_21(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, 0));
        }
        c1397620mTQ2.LIZJ(0, this.LLILLL, new AwS10S0410000_21(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, 1));
        return Unit.LIZ;
    }
}
