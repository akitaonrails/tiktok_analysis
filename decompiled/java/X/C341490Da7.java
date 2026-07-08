package X;

import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Da7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C341490Da7 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Function1<String, Unit> LLILLL;
    public final /* synthetic */ Function2<ImageView, String, Unit> LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C341490Da7(String str, boolean z, Function1<? super String, Unit> function1, Function2<? super ImageView, ? super String, Unit> function2, int i) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = function1;
        this.LLILZ = function2;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1675730thz.LJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZIL | 1));
        return Unit.LIZ;
    }
}
