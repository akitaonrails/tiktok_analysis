package X;

import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bduploader.BDMediaDataReader;
import java.io.BufferedInputStream;
import java.io.InputStream;
import kotlin.Unit;

/* JADX INFO: renamed from: X.08yA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2290008yA implements BDMediaDataReader {
    public Uri LIZ;
    public long LIZIZ = 0;
    public InputStream LIZJ;
    public BufferedInputStream LIZLLL;

    public C2290008yA(Uri uri) {
        this.LIZ = uri;
    }

    @Override // com.ss.bduploader.BDMediaDataReader
    public final int close(int i) {
        Unit unit;
        try {
            BufferedInputStream bufferedInputStream = this.LIZLLL;
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
            return 0;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return 0;
        }
    }

    @Override // com.ss.bduploader.BDMediaDataReader
    public final int open(int i) {
        Object c098200Yq;
        try {
            C844470XAv.LIZ.getClass();
            c098200Yq = C09N1.LJFF(C844470XAv.LIZ(), this.LIZ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        InputStream inputStream = (InputStream) c098200Yq;
        this.LIZJ = inputStream;
        if (inputStream != null) {
            return 1;
        }
        return -1;
    }

    @Override // com.ss.bduploader.BDMediaDataReader
    public final long getValue(int i, int i2) {
        if (i2 == 0) {
            return this.LIZIZ;
        }
        return 0L;
    }

    @Override // com.ss.bduploader.BDMediaDataReader
    public final int read(int i, long j, byte[] bArr, int i2) {
        if (this.LIZJ == null) {
            return -1;
        }
        if (j > this.LIZIZ) {
            return 0;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.LIZJ);
            this.LIZLLL = bufferedInputStream;
            return bufferedInputStream.read(bArr);
        } catch (C564610MCl e) {
            TryCatchGuardChecker.doCheck(e);
            return -1;
        }
    }
}
