package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RdO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700240RdO extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C700240RdO(String str, boolean z, boolean z2, boolean z3) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KmpChecker[");
        sbLIZ.append(this.LL);
        sbLIZ.append("] signal check: timingIntersect=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", custom=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LLILZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
