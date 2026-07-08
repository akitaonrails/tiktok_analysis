package X;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.08Fg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2086208Fg extends C09AY implements Function1<Map.Entry<String, String>, CharSequence> {
    public C2086208Fg() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Map.Entry<String, String> entry) {
        Map.Entry<String, String> entry2 = entry;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(entry2.getKey());
        sbLIZ.append('=');
        sbLIZ.append(entry2.getValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
