package X;

import X.C2436109gd;
import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: X.09gl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2436909gl<T extends C2436109gd> extends AbstractC2437009gm<T> {
    public abstract List<String> LIZLLL();

    @Override // X.AbstractC2437009gm
    public final List<String> LIZIZ() {
        return LIZLLL();
    }

    @Override // X.AbstractC2437009gm
    public final boolean LIZ(Uri uri) {
        return C13LP.LJJJJ(uri.getHost(), LIZLLL());
    }
}
