package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Qki, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679300Qki extends C09AY implements Function0<Object> {
    public final /* synthetic */ int LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C679300Qki(int i) {
        super(0);
        this.LL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixFloatingLayer: onScrollStateChanged-state=");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
