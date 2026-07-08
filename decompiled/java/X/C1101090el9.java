package X;

import com.bytedance.android.livesdk.performance.PerfItemConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0el9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1101090el9 {
    public final String LIZ;
    public final Function0<Number> LIZIZ;
    public final PerfItemConfig LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fetcher=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", config=");
        sbLIZ.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1101090el9(String str, Function0<? extends Number> function0, PerfItemConfig perfItemConfig) {
        this.LIZ = str;
        this.LIZIZ = function0;
        this.LIZJ = perfItemConfig;
    }
}
