package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0VBZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VBZ {
    public final long LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public File LIZLLL;
    public final List<C0VBW> LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LogFile{startID=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", totalCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", totalBytes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", logList=");
        sbLIZ.append(this.LJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C0VBZ LIZ(ByteBuffer byteBuffer) {
        try {
            if (byteBuffer.getShort() != 2082) {
                return null;
            }
            long j = byteBuffer.getLong();
            int i = byteBuffer.getInt();
            int i2 = byteBuffer.getInt();
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = byteBuffer.getInt();
                i3 += i5;
                if (i3 > i2) {
                    return null;
                }
                byte[] bArr = new byte[i5];
                byteBuffer.get(bArr);
                arrayList.add(new C0VBW(bArr));
            }
            return new C0VBZ(i, arrayList, i2, j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public C0VBZ(int i, List list, int i2, long j) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LJ = list;
    }
}
