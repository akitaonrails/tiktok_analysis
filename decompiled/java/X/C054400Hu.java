package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00Hu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C054400Hu extends C09AY implements Function0<Object> {
    public final /* synthetic */ boolean LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C054400Hu(boolean z) {
        super(0);
        this.LL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("topActivities.size=1 isFinishing=");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
