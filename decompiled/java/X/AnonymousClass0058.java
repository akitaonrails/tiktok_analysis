package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0058, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0058 extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0058(String str) {
        super(0);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryon native prefetch canceled, requestUrl=");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
