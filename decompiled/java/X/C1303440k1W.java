package X;

import com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectItem;
import java.util.List;

/* JADX INFO: renamed from: X.0k1W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1303440k1W {
    public final List<RecommendEffectItem> LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final boolean LJ;

    public C1303440k1W() {
        this(null, 0, false, false, 0, 63);
    }

    public C1303440k1W(List list, int i, boolean z, boolean z2, int i2, int i3) {
        list = (i3 & 1) != 0 ? C13BV.INSTANCE : list;
        i = (i3 & 2) != 0 ? 0 : i;
        z = (i3 & 8) != 0 ? true : z;
        i2 = (i3 & 16) != 0 ? 0 : i2;
        z2 = (i3 & 32) != 0 ? false : z2;
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = i2;
        this.LJ = z2;
    }
}
