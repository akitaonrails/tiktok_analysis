package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0wMa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777780wMa extends C09AY implements Function0<Object> {
    public final /* synthetic */ float LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1777780wMa(float f) {
        super(0);
        this.LL = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[tryInvalidateAdaptionWithProgress] end with progress ");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
