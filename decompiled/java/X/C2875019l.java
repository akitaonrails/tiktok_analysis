package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.019l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2875019l extends C09AY implements Function1<C2880019q, C2880019q> {
    public final /* synthetic */ C229200uY LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Function0<C419910GdJ> LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2875019l(C229200uY c229200uY, int i, Function0<C419910GdJ> function0, int i2, int i3) {
        super(1);
        this.LL = c229200uY;
        this.LLILLJJLI = i;
        this.LLILLL = function0;
        this.LLILZ = i2;
        this.LLILZIL = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C2880019q invoke(C2880019q c2880019q) {
        C229200uY c229200uY = this.LL;
        C291001Au c291001Au = new C291001Au(c229200uY);
        C291001Au c291001Au2 = new C291001Au(c229200uY);
        int i = this.LLILLJJLI;
        Function0<C419910GdJ> function0 = this.LLILLL;
        C291001Au c291001Au3 = new C291001Au(Boolean.TRUE);
        Pair pair = new Pair(Integer.valueOf(this.LLILZ), Integer.valueOf(this.LLILZIL));
        c2880019q.getClass();
        return new C2880019q(c291001Au, c291001Au2, i, function0, c291001Au3, pair);
    }
}
