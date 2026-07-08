package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00z9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C257700z9 extends C09AY implements Function0<Object> {
    public final /* synthetic */ C259800zU<String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C257700z9(C259800zU<String> c259800zU) {
        super(0);
        this.LL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("topPage is null, pausedInfo.pageInfo is not null, token=");
        sbLIZ.append(this.LL.element);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
