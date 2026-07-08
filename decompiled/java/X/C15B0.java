package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.15B0, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15B0 extends C09AY implements Function2<Boolean, String, Unit> {
    public final /* synthetic */ C20476915Ap LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC2329309At<Boolean> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15B0(C20476915Ap c20476915Ap, int i, String str, C11KT c11kt) {
        super(2);
        this.LL = c20476915Ap;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = c11kt;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, String str) {
        boolean zBooleanValue = bool.booleanValue();
        String str2 = str;
        C20476915Ap c20476915Ap = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animations success indexOf:");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" geniusId:");
        sbLIZ.append(this.LLILLL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int i = C20476915Ap.LJIIJJI;
        c20476915Ap.LJIIJ(strLIZIZ, true);
        if (!this.LLILZ.isDisposed()) {
            if (zBooleanValue) {
                this.LLILZ.onSuccess(Boolean.TRUE);
            } else {
                this.LLILZ.onError(new Exception(str2));
            }
        }
        return Unit.LIZ;
    }
}
