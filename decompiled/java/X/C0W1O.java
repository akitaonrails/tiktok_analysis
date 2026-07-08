package X;

import android.util.Pair;
import com.bytedance.crash.upload.network.RetrofitCrashService;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0W1O, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W1O implements TypedOutput {
    public final String LIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public C0W1L LJ;
    public final LinkedList<C0W1P> LJFF = new LinkedList<>();
    public final String LIZIZ = "UTF-8";

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String fileName() {
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final long length() {
        return -1L;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String md5Stub() {
        return null;
    }

    public final Pair<Integer, String> LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("multipart/form-data; boundary=");
        sbLIZ.append(this.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String str = this.LIZLLL;
        String str2 = this.LIZJ ? "gzip" : "";
        C080U c080u = new C080U("Content-Type", strLIZIZ);
        int statusCode = 0;
        byte[] bArrLIZLLL = null;
        try {
            C0X52<TypedInput> c0x52Execute = ((RetrofitCrashService) C1515120pWw.LJIIIZ(RetrofitCrashService.class, str)).report(str, this, Arrays.asList(c080u, new C080U("Content-Encoding", str2), new C080U("Accept-Encoding", "gzip")), false).execute();
            bArrLIZLLL = C0W1Q.LIZLLL(c0x52Execute.LIZIZ.in());
            statusCode = c0x52Execute.LIZ.LIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                if (th instanceof C1494430ozZ) {
                    statusCode = ((C1494430ozZ) th).getStatusCode();
                }
                if (th instanceof C1494690ozz) {
                    statusCode = ((C1494690ozz) th).getStatusCode();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        Pair pair = new Pair(Integer.valueOf(statusCode), bArrLIZLLL);
        return new Pair<>(pair.first, new String((byte[]) pair.second));
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String mimeType() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("multipart/form-data; boundary=");
        sbLIZ.append(this.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final void writeTo(OutputStream outputStream) throws IOException {
        this.LJ = new C0W1L(outputStream, this.LIZJ);
        Iterator<C0W1P> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().LIZ(this.LJ);
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\r\n--");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("--");
        sbLIZ.append("\r\n");
        this.LJ.LIZ(C2188811AlT.LIZIZ(sbLIZ).getBytes());
        C0W1L c0w1l = this.LJ;
        if (c0w1l.LIZJ) {
            c0w1l.LIZIZ.LIZ();
        } else {
            c0w1l.LIZ.flush();
        }
    }

    public C0W1O(String str, boolean z) {
        this.LIZJ = z;
        this.LIZLLL = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AAA");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append("AAA");
        this.LIZ = C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(String str, String str2) {
        this.LJFF.add(new C0W1K(this.LIZ, str, str2, this.LIZIZ));
    }
}
