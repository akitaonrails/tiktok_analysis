package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0gLE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161900gLE extends C09AY implements Function1<C20248814Kw, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Function2<View, String, Unit> LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1161900gLE(String str, int i, Function2 function2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = function2;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C20248814Kw c20248814Kw) {
        C20248814Kw c20248814Kw2 = c20248814Kw;
        c20248814Kw2.LIZ = new C1161910gLF(this.LL);
        c20248814Kw2.LIZIZ(new C1268404xm(this.LLILLJJLI));
        C20248814Kw.LIZJ(c20248814Kw2, true, false, 0.0f, 0, EnumC2211841BhW.CUSTOMIZE, new C389070FNh(this.LLILLL), null, 78);
        return Unit.LIZ;
    }
}
