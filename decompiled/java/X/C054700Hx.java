package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00Hx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C054700Hx extends C09AY implements Function0<String> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C054700Hx(boolean z, boolean z2) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("remove invalid tab inconsistency removedProtocol");
        sbLIZ.append(this.LL);
        sbLIZ.append(", removedResult ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
