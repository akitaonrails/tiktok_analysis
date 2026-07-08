package X;

import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0DbA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C342140DbA extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Function1<String, Unit> LLILLJJLI;
    public final /* synthetic */ Function1<String, Unit> LLILLL;
    public final /* synthetic */ Function2<ImageView, String, Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C342140DbA(boolean z, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, Function2<? super ImageView, ? super String, Unit> function2, Function0<Unit> function0, int i) {
        super(2);
        this.LL = z;
        this.LLILLJJLI = function1;
        this.LLILLL = function12;
        this.LLILZ = function2;
        this.LLILZIL = function0;
        this.LLILZLL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1675730thz.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZLL | 1));
        return Unit.LIZ;
    }
}
