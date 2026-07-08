package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0OvK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C634920OvK extends C09AY implements Function0<String> {
    public final /* synthetic */ AbstractC634910OvJ<Object> LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C634920OvK(AbstractC634910OvJ<Object> abstractC634910OvJ, boolean z) {
        super(0);
        this.LL = abstractC634910OvJ;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(this.LL.getClass()).LJI());
        sbLIZ.append(" doModifyActive: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append('.');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
