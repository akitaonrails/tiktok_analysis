package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YjG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C882240YjG implements InterfaceC882230YjF {
    public final String LL;

    public C882240YjG() {
        this(null);
    }

    public final C882240YjG copy(String str) {
        return new C882240YjG(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C882240YjG) && Intrinsics.LJFF(this.LL, ((C882240YjG) obj).LL);
    }

    public int hashCode() {
        String str = this.LL;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UrlStringAvatar(urlString=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getUrlString() {
        return this.LL;
    }

    public C882240YjG(String str) {
        this.LL = str;
    }
}
