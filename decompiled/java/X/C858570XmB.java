package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0XmB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C858570XmB {
    public CharSequence LIZ;
    public final int LIZIZ;
    public final Map<String, String> LIZJ;

    public C858570XmB() {
        this((CharSequence) null, 0, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C858570XmB(CharSequence charSequence, int i, int i2) {
        Map mapLJ;
        charSequence = (i2 & 1) != 0 ? "" : charSequence;
        i = (i2 & 2) != 0 ? -1 : i;
        if ((i2 & 4) != 0) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = null;
        }
        this(charSequence, i, (Map<String, String>) mapLJ);
    }

    public C858570XmB(CharSequence charSequence, int i, Map<String, String> map) {
        this.LIZ = charSequence;
        this.LIZIZ = i;
        this.LIZJ = map;
    }
}
