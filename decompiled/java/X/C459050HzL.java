package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HzL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C459050HzL extends C09AY implements Function1<C20248814Kw, Unit> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ EnumC2211841BhW LLILLJJLI;
    public final /* synthetic */ Function0<String> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Function2<View, String, Unit> LLILZIL;
    public final /* synthetic */ Function0<Boolean> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C459050HzL(float f, EnumC2211841BhW enumC2211841BhW, Function0<String> function0, boolean z, Function2<? super View, ? super String, Unit> function2, Function0<Boolean> function02) {
        super(1);
        this.LL = f;
        this.LLILLJJLI = enumC2211841BhW;
        this.LLILLL = function0;
        this.LLILZ = z;
        this.LLILZIL = function2;
        this.LLILZLL = function02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C20248814Kw c20248814Kw) {
        C20248814Kw c20248814Kw2 = c20248814Kw;
        c20248814Kw2.LIZ = new AwS550S0100000_6(this.LLILLL, 1416);
        final boolean z = this.LLILZ;
        final Function2<View, String, Unit> function2 = this.LLILZIL;
        c20248814Kw2.LIZIZ(new Function2<View, String, Unit>() { // from class: X.00Rd
            public String LL;

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(View view, String str) {
                String str2 = str;
                if (z || !Intrinsics.LJFF(this.LL, str2)) {
                    function2.invoke(view, str2);
                    this.LL = str2;
                }
                return Unit.LIZ;
            }
        });
        C20248814Kw.LIZJ(c20248814Kw2, true, false, this.LL, 0, this.LLILLJJLI, new AwS582S0100000_3(this.LLILZLL, (Function0<Unit>) 143), null, 64);
        return Unit.LIZ;
    }
}
