package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04b0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1127204b0 extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1127204b0(String str) {
        super(0);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("failed, instance of ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" not find");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
