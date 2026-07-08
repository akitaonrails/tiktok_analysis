package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.12Db, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19718912Db extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C19719212De LL;
    public final /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Object LLILLL;
    public final /* synthetic */ Object LLILZ;
    public final /* synthetic */ Object LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19718912Db(C19719212De c19719212De, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(2);
        this.LL = c19719212De;
        this.LLILLJJLI = obj;
        this.LLILLL = obj2;
        this.LLILZ = obj3;
        this.LLILZIL = obj4;
        this.LLILZLL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        this.LL.LJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZLL) | 1);
        return Unit.LIZ;
    }
}
