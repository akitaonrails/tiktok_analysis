package X;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Ord, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632630Ord extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C636330Oxb LL;
    public final /* synthetic */ InterfaceC636240OxS<C632560OrW> LLILLJJLI;
    public final /* synthetic */ C1690080u58 LLILLL;
    public final /* synthetic */ C05P1<C631220OpM> LLILZ;
    public final /* synthetic */ Fragment LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ Function1<C632090Oql, Unit> LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C632630Ord(C636330Oxb c636330Oxb, InterfaceC636240OxS<C632560OrW> interfaceC636240OxS, C1690080u58 c1690080u58, C05P1<C631220OpM> c05p1, Fragment fragment, Function0<Unit> function0, Function1<? super C632090Oql, Unit> function1, int i) {
        super(2);
        this.LL = c636330Oxb;
        this.LLILLJJLI = interfaceC636240OxS;
        this.LLILLL = c1690080u58;
        this.LLILZ = c05p1;
        this.LLILZIL = fragment;
        this.LLILZLL = function0;
        this.LLIZ = function1;
        this.LLIZLLLIL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1668890tWx.LIZLLL(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZLLLIL | 1));
        return Unit.LIZ;
    }
}
