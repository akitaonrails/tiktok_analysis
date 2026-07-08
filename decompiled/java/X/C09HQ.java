package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URL;

/* JADX INFO: renamed from: X.09HQ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09HQ extends RuntimeException {
    public final int LL;
    public final String LLILLJJLI;
    public final transient C0X52<?> LLILLL;

    public int code() {
        return this.LL;
    }

    public String message() {
        return this.LLILLJJLI;
    }

    public C0X52<?> response() {
        return this.LLILLL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C09HQ(C0X52<?> c0x52) {
        String path;
        URL url;
        C2396109aB.LIZ(c0x52, "response == null");
        C1494570ozn c1494570ozn = c0x52.LIZLLL;
        if (c1494570ozn == null || (url = c1494570ozn.LIZ) == null) {
            path = "";
        } else {
            path = url.getPath();
        }
        if ("".equals(path) && c0x52.LIZ != null) {
            try {
                path = new URL(c0x52.LIZ.LIZ).getPath();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Path is ");
        sbLIZ.append(path);
        sbLIZ.append(" HTTP ");
        sbLIZ.append(c0x52.LIZ.LIZIZ);
        sbLIZ.append(" ");
        sbLIZ.append(c0x52.LIZ.LJI);
        super(C2188811AlT.LIZIZ(sbLIZ));
        C2175508fh c2175508fh = c0x52.LIZ;
        this.LL = c2175508fh.LIZIZ;
        this.LLILLJJLI = c2175508fh.LJI;
        this.LLILLL = c0x52;
    }
}
