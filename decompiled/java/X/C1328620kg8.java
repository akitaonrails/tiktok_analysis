package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0kg8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328620kg8 {
    public static C1328620kg8 LIZLLL;
    public int LIZ;
    public List<InterfaceC1330220kii> LIZIZ;
    public final C1328630kg9 LIZJ = new C1328630kg9();

    public static synchronized C1328620kg8 LIZJ() {
        if (LIZLLL == null) {
            LIZLLL = new C1328620kg8();
        }
        return LIZLLL;
    }

    public final void LIZLLL() {
        this.LIZ = this.LIZJ.LIZ;
        List<InterfaceC1330220kii> list = this.LIZIZ;
        if (list != null) {
            Iterator<InterfaceC1330220kii> it2 = list.iterator();
            while (it2.hasNext()) {
                this.LIZ = Math.max(this.LIZ, it2.next().getHeaderSize());
            }
        }
    }

    public C1328620kg8() {
        LIZLLL();
    }

    public static C1330000kiM LIZ(InputStream inputStream) throws IOException {
        int iLIZIZ;
        C1328620kg8 c1328620kg8LIZJ = LIZJ();
        c1328620kg8LIZJ.getClass();
        inputStream.getClass();
        int i = c1328620kg8LIZJ.LIZ;
        byte[] bArr = new byte[i];
        if (inputStream.markSupported()) {
            try {
                inputStream.mark(i);
                iLIZIZ = C842030X1l.LIZIZ(inputStream, bArr, i);
                inputStream.reset();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                inputStream.reset();
                throw th;
            }
        } else {
            iLIZIZ = C842030X1l.LIZIZ(inputStream, bArr, i);
        }
        List<InterfaceC1330220kii> list = c1328620kg8LIZJ.LIZIZ;
        if (list != null) {
            Iterator<InterfaceC1330220kii> it2 = list.iterator();
            while (it2.hasNext()) {
                C1330000kiM c1330000kiMLIZ = it2.next().LIZ(iLIZIZ, bArr);
                if (c1330000kiMLIZ != null && c1330000kiMLIZ != C1330000kiM.LIZJ) {
                    return c1330000kiMLIZ;
                }
            }
        }
        C1330000kiM c1330000kiMLIZ2 = c1328620kg8LIZJ.LIZJ.LIZ(iLIZIZ, bArr);
        if (c1330000kiMLIZ2 != null && c1330000kiMLIZ2 != C1330000kiM.LIZJ) {
            return c1330000kiMLIZ2;
        }
        return C1330000kiM.LIZJ;
    }

    public static C1330000kiM LIZIZ(InputStream inputStream) {
        try {
            return LIZ(inputStream);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            C1331420kke.LIZIZ(e);
            throw null;
        }
    }
}
