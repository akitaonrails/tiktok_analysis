package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00Hv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C054500Hv extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL = false;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C054500Hv(String str, boolean z) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fragment:");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isVisibleToUser:");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", aop:");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
