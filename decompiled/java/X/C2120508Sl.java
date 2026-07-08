package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: X.08Sl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2120508Sl {
    public final int LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.LIZIZ), Long.valueOf(this.LIZJ), Integer.valueOf(this.LIZ), Long.valueOf(this.LIZLLL));
    }

    public static C2120508Sl LIZ(C0VSJ c0vsj) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new C0VSP(c0vsj));
        try {
            C2120508Sl c2120508Sl = new C2120508Sl(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c2120508Sl;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                dataInputStream.close();
                throw th;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void LIZIZ(C0VSJ c0vsj) throws IOException {
        c0vsj.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new C0VSV(c0vsj));
        try {
            dataOutputStream.writeInt(this.LIZ);
            dataOutputStream.writeInt(this.LIZIZ);
            dataOutputStream.writeLong(this.LIZJ);
            dataOutputStream.writeLong(this.LIZLLL);
            dataOutputStream.close();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                dataOutputStream.close();
                throw th;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2120508Sl)) {
            return false;
        }
        C2120508Sl c2120508Sl = (C2120508Sl) obj;
        if (this.LIZIZ == c2120508Sl.LIZIZ && this.LIZJ == c2120508Sl.LIZJ && this.LIZ == c2120508Sl.LIZ && this.LIZLLL == c2120508Sl.LIZLLL) {
            return true;
        }
        return false;
    }

    public C2120508Sl(int i, int i2, long j, long j2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = j;
        this.LIZLLL = j2;
    }
}
