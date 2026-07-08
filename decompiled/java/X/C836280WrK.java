package X;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: renamed from: X.0WrK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C836280WrK extends C836320WrO {
    public final String LJFF;
    public final String LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;
    public final List LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;

    /* JADX WARN: Illegal instructions before constructor call */
    public C836280WrK(String str, String str2, boolean z, final boolean z2) {
        final Bundle bundleLIZ = C836290WrL.LIZ(str, str2, z, z2);
        final Bundle bundleLIZ2 = C836290WrL.LIZ(str, str2, z, z2);
        new AbstractC836950WsP(bundleLIZ, bundleLIZ2, z2) { // from class: X.0WrO
            {
                C08CX c08cx = C08CX.INSTANCE;
            }
        };
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = z;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJIIJ = false;
        this.LJIIJJI = z2;
        if (str.length() > 0) {
        } else {
            throw new IllegalArgumentException("serverClientId should not be empty");
        }
    }
}
