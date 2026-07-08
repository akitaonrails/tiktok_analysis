package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01F2, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01F2 extends C09AY implements Function0<String> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01F2(boolean z, boolean z2) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL ? "init" : "update");
        sbLIZ.append(": (onlyUpdateData: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
