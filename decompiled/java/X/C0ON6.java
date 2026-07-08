package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: renamed from: X.0ON6, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0ON6 extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C0ON7 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ON6(C19EG c19eg, int i, int i2, C0ON7 c0on7) {
        super(1);
        this.LL = c19eg;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = c0on7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        c1397620mTQ2.LIZJ(0, this.LL.getString(this.LLILLJJLI), new AwS588S0100000_9(this.LLILZ, 359));
        c1397620mTQ2.LIZJ(1, this.LL.getString(this.LLILLL), new AwS588S0100000_9(this.LLILZ, 360));
        return Unit.LIZ;
    }
}
