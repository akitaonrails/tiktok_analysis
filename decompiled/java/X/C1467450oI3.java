package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0oI3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1467450oI3 extends C1467410oHz {
    public final String[] LJ;
    public String LJFF;

    @Override // X.C1467410oHz, X.InterfaceC1467290oHn
    public final boolean LIZ() {
        return true;
    }

    @Override // X.C1467410oHz, X.InterfaceC1467290oHn
    public final String getUrl() {
        return this.LJFF;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1467450oI3) {
            C1467450oI3 c1467450oI3 = (C1467450oI3) obj;
            if (c1467450oI3.LJFF.equals(this.LJFF) && Arrays.equals(c1467450oI3.LJ, this.LJ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C1467410oHz, X.InterfaceC1467290oHn
    public final void setUrl(String str) {
        this.LJFF = str;
    }

    public C1467450oI3(String str, String[] strArr) {
        this.LJ = strArr;
        this.LJFF = str;
    }
}
