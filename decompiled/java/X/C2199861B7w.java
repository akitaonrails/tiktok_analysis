package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1B7w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199861B7w {
    public final String LIZ;
    public final InterfaceC2199921B8c LIZIZ;
    public final int LIZJ;
    public long LIZLLL;
    public long LJ;

    public final boolean LIZ() {
        int i = this.LIZJ;
        String strLIZIZ = this.LIZIZ.LIZIZ("Accept-Ranges");
        String str = C2199661B7c.LIZ;
        if (i < 400) {
            return i == 206 || i == 1 || "bytes".equals(strLIZIZ);
        }
        return false;
    }

    public final String LIZIZ() {
        return this.LIZIZ.LIZIZ("Content-Type");
    }

    public final String LIZJ() {
        String strLJIILJJIL = C2199671B7d.LJIILJJIL(this.LIZIZ, "last-modified");
        return TextUtils.isEmpty(strLJIILJJIL) ? C2199671B7d.LJIILJJIL(this.LIZIZ, "Last-Modified") : strLJIILJJIL;
    }

    public final long LIZLLL() {
        if (this.LJ <= 0) {
            if (LJFF()) {
                this.LJ = -1L;
            } else {
                String strLJIILJJIL = C2199671B7d.LJIILJJIL(this.LIZIZ, "Content-Range");
                if (!TextUtils.isEmpty(strLJIILJJIL)) {
                    this.LJ = C2199661B7c.LJIJI(strLJIILJJIL);
                }
            }
        }
        return this.LJ;
    }

    public final long LJ() {
        String strLJIILJJIL = C2199671B7d.LJIILJJIL(this.LIZIZ, "X-Content-Length");
        if (TextUtils.isEmpty(strLJIILJJIL)) {
            return -1L;
        }
        try {
            return CastLongProtector.parseLong(strLJIILJJIL);
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return -1L;
        }
    }

    public final boolean LJFF() {
        InterfaceC2199921B8c interfaceC2199921B8c = this.LIZIZ;
        String str = C2199661B7c.LIZ;
        if (interfaceC2199921B8c != null) {
            return "chunked".equals(interfaceC2199921B8c.LIZIZ("Transfer-Encoding")) || C2199671B7d.LJIIIZ(interfaceC2199921B8c) == -1;
        }
        return false;
    }

    public C2199861B7w(InterfaceC2199921B8c interfaceC2199921B8c, String str) {
        this.LIZ = str;
        this.LIZJ = interfaceC2199921B8c.LIZ();
        this.LIZIZ = interfaceC2199921B8c;
    }
}
