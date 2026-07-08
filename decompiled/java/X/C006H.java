package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.006H, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C006H extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C006H(String str) {
        super(0);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unregisterRule ");
        sbLIZ.append(this.LL);
        sbLIZ.append(' ');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
