package X;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04zi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1280404zi extends C09AY implements Function1<Map.Entry<Long, Long>, CharSequence> {
    public C1280404zi() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Map.Entry<Long, Long> entry) {
        Map.Entry<Long, Long> entry2 = entry;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('{');
        sbLIZ.append(entry2.getKey().longValue());
        sbLIZ.append(':');
        sbLIZ.append(entry2.getValue().longValue());
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
