package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* JADX INFO: renamed from: X.13NQ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13NQ {
    public final Effect LIZ;
    public final List<String> LIZIZ;
    public final String LIZJ;
    public C13NJ LIZLLL;
    public Boolean LJ;
    public InterfaceExecutorC740550T3d LJFF;
    public final int LJI;
    public final boolean LJII;
    public boolean LJIIIIZZ;

    public C13NQ(Effect effect, List list, String str, int i, boolean z, int i2) {
        Boolean bool;
        if ((i2 & 16) != 0) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        i = (i2 & 64) != 0 ? -1 : i;
        z = (i2 & 128) != 0 ? false : z;
        this.LIZ = effect;
        this.LIZIZ = list;
        this.LIZJ = str;
        this.LIZLLL = null;
        this.LJ = bool;
        this.LJFF = null;
        this.LJI = i;
        this.LJII = z;
        this.LJIIIIZZ = false;
    }
}
