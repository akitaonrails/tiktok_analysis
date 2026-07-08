package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.04kB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1184104kB extends C09AY implements Function2<String, Map<String, ? extends String>, Unit> {
    public C1184104kB() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Map<String, ? extends String> map) {
        String str2 = str;
        Map<String, ? extends String> map2 = map;
        if (((Boolean) C1184204kC.LIZ.getValue()).booleanValue()) {
            if (str2.length() == 0) {
                C20684815ws.LJIILLIIL("btm_page_start", map2);
            } else {
                C20684815ws.LJIILLIIL(str2, map2);
            }
        }
        return Unit.LIZ;
    }
}
