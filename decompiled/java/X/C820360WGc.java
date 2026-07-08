package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0WGc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820360WGc {
    public String LIZ = "";
    public String LIZIZ = "";
    public Map<String, ? extends Object> LIZJ;
    public Map<String, ? extends Object> LIZLLL;

    public final void LIZ(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            Map<String, ? extends Object> map = this.LIZLLL;
            if (map == null) {
                this.LIZLLL = C2097908Jt.LIZJ(new Pair("x-tt-dataflow-id", String.valueOf(iIntValue)));
            } else {
                this.LIZLLL = C2097608Jq.LJIILIIL(map, new Pair("x-tt-dataflow-id", String.valueOf(iIntValue)));
            }
        }
    }
}
