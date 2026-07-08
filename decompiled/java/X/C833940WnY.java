package X;

import android.accounts.Account;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0WnY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C833940WnY implements InterfaceC831600Wjm {
    public final int LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;

    @Override // X.InterfaceC831600Wjm
    public final Account LJJ() {
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.LL), Integer.valueOf(this.LLILLJJLI), null, Boolean.valueOf(this.LLILLL)});
    }

    public C833940WnY() {
        this(new C834050Wnj());
    }

    public C833940WnY(C834050Wnj c834050Wnj) {
        this.LL = c834050Wnj.LIZ;
        this.LLILLJJLI = 1;
        this.LLILLL = true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C833940WnY) {
            C833940WnY c833940WnY = (C833940WnY) obj;
            if (C0W0T.LIZIZ(Integer.valueOf(this.LL), Integer.valueOf(c833940WnY.LL)) && C0W0T.LIZIZ(Integer.valueOf(this.LLILLJJLI), Integer.valueOf(c833940WnY.LLILLJJLI)) && C0W0T.LIZIZ(null, null) && C0W0T.LIZIZ(Boolean.valueOf(this.LLILLL), Boolean.valueOf(c833940WnY.LLILLL))) {
                return true;
            }
        }
        return false;
    }
}
