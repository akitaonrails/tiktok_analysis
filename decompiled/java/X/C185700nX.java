package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00nX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C185700nX extends C09AY implements Function0<String> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ EnumC325100Com LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C185700nX(boolean z, boolean z2, boolean z3, EnumC325100Com enumC325100Com) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
        this.LLILZ = enumC325100Com;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[S3] instant network mismatch poorNet=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" dataSensitive=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" mobile=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" status=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", skip fire");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
