package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0VCA, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VCA {
    public final int LIZ;
    public final int LIZIZ;
    public File LIZJ;
    public final List<C0VCP> LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LogFile{totalCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", totalBytes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", logList=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C0VCA LIZ(ByteBuffer byteBuffer) {
        try {
            if (byteBuffer.getInt() != 1095781686) {
                return null;
            }
            byteBuffer.getInt();
            int i = byteBuffer.getInt();
            int i2 = byteBuffer.getInt();
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = byteBuffer.getInt();
                i3 += i5;
                if (i3 > i2) {
                    C0VCY.LIZ("APM-SDK", "construct LogFile failed.");
                    return null;
                }
                long j = byteBuffer.getLong();
                long j2 = byteBuffer.getLong();
                byte[] bArr = new byte[i5];
                byteBuffer.get(bArr);
                arrayList.add(new C0VCP(bArr, j, j2));
            }
            return new C0VCA(i, i2, arrayList);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0VCY.LIZIZ("construct LogFile failed.", th);
            return null;
        }
    }

    public C0VCA(int i, int i2, List<C0VCP> list) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZLLL = list;
    }
}
