package X;

import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.085L, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C085L {
    public final String LIZ;
    public final long LIZIZ;
    public final InterfaceC1548390qOb LIZJ;
    public final WebView LIZLLL;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C085L)) {
            return false;
        }
        C085L c085l = (C085L) obj;
        if (Intrinsics.LJFF(this.LIZ, c085l.LIZ) && this.LIZ.length() > 0) {
            return true;
        }
        if (!Intrinsics.LJFF(this.LIZ, c085l.LIZ) || !Intrinsics.LJFF(this.LIZLLL, c085l.LIZLLL) || this.LIZLLL == null) {
            return false;
        }
        return true;
    }

    public C085L(String str, long j, InterfaceC1548390qOb interfaceC1548390qOb, WebView webView) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = interfaceC1548390qOb;
        this.LIZLLL = webView;
    }
}
