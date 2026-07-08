package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yjn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869050yjn extends C09AY implements Function0<Object> {
    public final /* synthetic */ Object LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1869050yjn(Object obj) {
        super(0);
        this.LL = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Object obj = this.LL;
        sbLIZ.append(obj != null ? obj.getClass().getName() : null);
        sbLIZ.append(" is not BtmPage");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
