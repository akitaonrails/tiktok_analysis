package X;

import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cis, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022800cis extends C09AY implements Function0<String> {
    public final /* synthetic */ Long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1022800cis(Long l) {
        super(0);
        this.LL = l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(UUID.randomUUID());
        sbLIZ.append('-');
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
