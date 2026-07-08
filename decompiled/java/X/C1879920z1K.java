package X;

import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z1K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1879920z1K extends C09AY implements Function0<String> {
    public C1879920z1K() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append('-');
        sbLIZ.append(UUID.randomUUID());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
