package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0EgZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370970EgZ extends C09AY implements Function2<Boolean, Float, Unit> {
    public final /* synthetic */ C817403Hg LL;
    public final /* synthetic */ C118300cf LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C370970EgZ(int i, C817403Hg c817403Hg, C118300cf c118300cf) {
        super(2);
        this.LL = c817403Hg;
        this.LLILLJJLI = c118300cf;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Float f) {
        boolean zBooleanValue = bool.booleanValue();
        this.LL.element += f.floatValue();
        if (this.LLILLJJLI.element >= this.LLILLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isRough: ");
            sbLIZ.append(zBooleanValue);
            sbLIZ.append(", total average cost: ");
            sbLIZ.append(this.LL.element / this.LLILLJJLI.element);
            C355090Dw3.LJ("VideoFrameCache", C2188811AlT.LIZIZ(sbLIZ));
            this.LLILLJJLI.element = 0;
        }
        return Unit.LIZ;
    }
}
