package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS462S0200000_27;

/* JADX INFO: renamed from: X.0bsl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C990490bsl extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function2<Integer, String, Unit> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C990490bsl(int i, int i2, AwS462S0200000_27 awS462S0200000_27) {
        super(0);
        this.LL = awS462S0200000_27;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.invoke(Integer.valueOf((this.LLILLJJLI * 2) + this.LLILLL), "play");
        return Unit.LIZ;
    }
}
