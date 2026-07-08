package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Svf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737050Svf extends C09AY implements Function2<Boolean, Exception, Unit> {
    public final /* synthetic */ C737040Sve LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C737050Svf(C737040Sve c737040Sve, int i) {
        super(2);
        this.LL = c737040Sve;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Exception exc) {
        boolean zBooleanValue = bool.booleanValue();
        C737040Sve c737040Sve = this.LL;
        if (c737040Sve.LL.LJIIIIZZ) {
            Function2<? super Boolean, ? super Exception, Unit> function2 = c737040Sve.LLILLL;
            if (function2 != null) {
                function2.invoke(Boolean.valueOf(zBooleanValue), exc);
            }
        } else {
            boolean z = true;
            if (this.LLILLJJLI != 1) {
                z = false;
            }
            C737030Svd c737030Svd = new C737030Svd(98, new C737060Svg(z, zBooleanValue, null));
            C0HTT<C737030Svd> c0htt = this.LL.LLILLJJLI.get();
            if (c0htt != null) {
                c0htt.LLIIL(c737030Svd);
            }
        }
        return Unit.LIZ;
    }
}
