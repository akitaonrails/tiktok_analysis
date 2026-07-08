package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import tikcast.linkmic.common.AnchorPanelLayoutTypeSetting;

/* JADX INFO: renamed from: X.0arn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C951450arn extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C948300ami LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function1<AbstractC948140amS, Unit> LLILLL;
    public final /* synthetic */ Function1<AbstractC948190amX, Unit> LLILZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;
    public final /* synthetic */ Function1<Integer, AnchorPanelLayoutTypeSetting> LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C951450arn(C948300ami c948300ami, String str, Function1<? super AbstractC948140amS, Unit> function1, Function1<? super AbstractC948190amX, Unit> function12, Function1<? super Boolean, Unit> function13, Function1<? super Integer, AnchorPanelLayoutTypeSetting> function14, int i) {
        super(2);
        this.LL = c948300ami;
        this.LLILLJJLI = str;
        this.LLILLL = function1;
        this.LLILZ = function12;
        this.LLILZIL = function13;
        this.LLILZLL = function14;
        this.LLIZ = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) throws Throwable {
        num.intValue();
        C1666080tSQ.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZ | 1));
        return Unit.LIZ;
    }
}
