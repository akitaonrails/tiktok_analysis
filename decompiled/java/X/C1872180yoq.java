package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0yoq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1872180yoq {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    public final Map<String, Object> LIZ() {
        return C2097608Jq.LJIIIIZZ(new Pair("networkEndTime", Long.valueOf(this.LIZ)), new Pair("rawDataParseDuration", Long.valueOf(this.LIZIZ - this.LIZ)), new Pair("parseToCallbackStartDuration", Long.valueOf(this.LIZJ - this.LIZIZ)), new Pair("callbackDuration", Long.valueOf(this.LIZLLL - this.LIZJ)), new Pair("allClientCallbackTime", Long.valueOf(this.LIZLLL - this.LIZ)), new Pair("usePiperData", Boolean.valueOf(this.LJ)), new Pair("piperDataSuccess", Boolean.valueOf(this.LJFF)));
    }
}
