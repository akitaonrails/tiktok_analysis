package X;

import android.content.ComponentName;
import java.util.List;

/* JADX INFO: renamed from: X.14z9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20444114z9 {
    public static final /* synthetic */ int LJFF = 0;
    public final List<AbstractC836950WsP> LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final ComponentName LIZLLL;
    public final boolean LJ;

    public C20444114z9() {
        throw null;
    }

    public C20444114z9(List list, boolean z, int i) {
        z = (i & 16) != 0 ? false : z;
        this.LIZ = list;
        this.LIZIZ = null;
        this.LIZJ = false;
        this.LIZLLL = null;
        this.LJ = z;
        if (!list.isEmpty()) {
            return;
        }
        "credentialOptions should not be empty".toString();
        throw new IllegalArgumentException("credentialOptions should not be empty");
    }
}
