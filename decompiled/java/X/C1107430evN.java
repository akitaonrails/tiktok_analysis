package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0evN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1107430evN extends C09AY implements Function1<C2284301Eb6, Unit> {
    public final /* synthetic */ AbstractC1107400evK LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1107430evN(AbstractC1107400evK abstractC1107400evK) {
        super(1);
        this.LL = abstractC1107400evK;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C2284301Eb6 c2284301Eb6) throws JSONException {
        int iLJ = this.LL.LJ();
        c2284301Eb6.getClass();
        if (iLJ == 0) {
            this.LL.LJIIJ(null, null);
        }
        return Unit.LIZ;
    }
}
