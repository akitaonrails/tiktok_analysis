package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tb0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671400tb0 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1671400tb0(int i, int i2, String str, String str2, Function0 function0, boolean z) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = str2;
        this.LLILZIL = function0;
        this.LLILZLL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        String str = this.LL;
        boolean z = this.LLILLJJLI;
        int i = this.LLILLL;
        String str2 = this.LLILZ;
        Function0<Unit> function0 = this.LLILZIL;
        C1671390taz.LJIILL(i, C341440Da2.LIZ(this.LLILZLL | 1), interfaceC1680500tpg, str, str2, function0, z);
        return Unit.LIZ;
    }
}
