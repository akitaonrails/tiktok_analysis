package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import tikcast.linkmic.common.AnchorPanelLayoutTypeSetting;

/* JADX INFO: renamed from: X.0aro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C951460aro extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C948300ami LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Function2<C948400ams, Integer, Unit> LLILLL;
    public final /* synthetic */ Function2<Integer, Integer, Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ Function1<Integer, AnchorPanelLayoutTypeSetting> LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ InterfaceC1685750ty9 LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C951460aro(C948300ami c948300ami, boolean z, Function2<? super C948400ams, ? super Integer, Unit> function2, Function2<? super Integer, ? super Integer, Unit> function22, Function0<Unit> function0, Function1<? super Integer, AnchorPanelLayoutTypeSetting> function1, String str, InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2) {
        super(2);
        this.LL = c948300ami;
        this.LLILLJJLI = z;
        this.LLILLL = function2;
        this.LLILZ = function22;
        this.LLILZIL = function0;
        this.LLILZLL = function1;
        this.LLIZ = str;
        this.LLIZLLLIL = interfaceC1685750ty9;
        this.LLJ = i;
        this.LLJI = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1666070tSP.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJ | 1), this.LLJI);
        return Unit.LIZ;
    }
}
