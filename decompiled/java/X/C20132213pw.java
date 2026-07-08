package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.13pw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20132213pw implements Comparable<C20132213pw> {
    public final C20131713pr LL;
    public final Bundle LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final int LLILZIL;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C20132213pw c20132213pw) {
        int size;
        boolean z = this.LLILLL;
        if (z && !c20132213pw.LLILLL) {
            return 1;
        }
        if (!z && c20132213pw.LLILLL) {
            return -1;
        }
        Bundle bundle = this.LLILLJJLI;
        if (bundle != null) {
            if (c20132213pw.LLILLJJLI == null || (size = bundle.size() - c20132213pw.LLILLJJLI.size()) > 0) {
                return 1;
            }
            if (size < 0) {
                return -1;
            }
        } else if (c20132213pw.LLILLJJLI != null) {
            return -1;
        }
        if (this.LLILZ) {
            if (!c20132213pw.LLILZ) {
                return 1;
            }
        } else if (c20132213pw.LLILZ) {
            return -1;
        }
        return this.LLILZIL - c20132213pw.LLILZIL;
    }

    public C20132213pw(C20131713pr c20131713pr, Bundle bundle, boolean z, boolean z2, int i) {
        this.LL = c20131713pr;
        this.LLILLJJLI = bundle;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = i;
    }
}
