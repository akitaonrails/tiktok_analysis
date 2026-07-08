package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00IM, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00IM extends C09AY implements Function0<Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C00IM(boolean z, String str, long j) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("forceShowShopTab_end: success[");
        sbLIZ.append(this.LL);
        sbLIZ.append("], msg[");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append("], duration[");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
