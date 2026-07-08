package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gCw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156760gCw extends C09AY implements Function1<C1549320qQ6, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1156760gCw(long j, int i) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1549320qQ6 c1549320qQ6) {
        int iIntValue;
        c1549320qQ6.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isValidClick:");
        long j = this.LL - C1156770gCx.LIZIZ;
        Integer num = C1156770gCx.LIZ;
        boolean z = false;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (j >= iIntValue) {
            z = true;
        }
        sbLIZ.append(z);
        sbLIZ.append(",currentTime-lastTime:");
        sbLIZ.append(this.LL - C1156770gCx.LIZIZ);
        sbLIZ.append(",currentTime:");
        sbLIZ.append(this.LL);
        sbLIZ.append(",lastTime:");
        sbLIZ.append(C1156770gCx.LIZIZ);
        sbLIZ.append(",clickInterval:");
        sbLIZ.append(this.LLILLJJLI);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }
}
