package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import tikcast.linkmic.common.AnchorPanelLayoutTypeSetting;

/* JADX INFO: renamed from: X.0arr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C951490arr extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C948130amR LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function1<AbstractC948200amY, Unit> LLILLL;
    public final /* synthetic */ Function1<AbstractC948180amW, Unit> LLILZ;
    public final /* synthetic */ Function1<Integer, AnchorPanelLayoutTypeSetting> LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C951490arr(C948130amR c948130amR, String str, Function1<? super AbstractC948200amY, Unit> function1, Function1<? super AbstractC948180amW, Unit> function12, Function1<? super Integer, AnchorPanelLayoutTypeSetting> function13, int i) {
        super(2);
        this.LL = c948130amR;
        this.LLILLJJLI = str;
        this.LLILLL = function1;
        this.LLILZ = function12;
        this.LLILZIL = function13;
        this.LLILZLL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1666110tST.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZLL | 1));
        return Unit.LIZ;
    }
}
