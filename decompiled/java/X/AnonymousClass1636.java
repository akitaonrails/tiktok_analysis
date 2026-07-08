package X;

import X.C163A;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.1636, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AnonymousClass1636<ITEM, T extends C163A<ITEM, ? extends C164B, ? extends AbstractC1361510lXB<ITEM, ? extends C164B>>> {
    public abstract T LIZIZ();

    public abstract EnumC207101162h LIZJ();

    public abstract void LIZLLL(ITEM item, C162U c162u, boolean z, boolean z2);

    public abstract void LJFF(Aweme aweme, AnonymousClass1648 anonymousClass1648);

    public abstract void LJI(C207134163o c207134163o, C207131163l c207131163l);

    public abstract void LJII(Aweme aweme, C207127163h c207127163h);

    public abstract void LJIIIIZZ(C207134163o c207134163o, AnonymousClass1643 anonymousClass1643);

    public abstract boolean LJIIIZ(ITEM item);

    public abstract boolean LJIIJ(ITEM item, EnumC715680S5m enumC715680S5m);

    public final boolean LIZ(ITEM item) {
        if (LIZIZ().LJI(item, C161N.LIZIZ.LLIIZ()) != null) {
            return true;
        }
        return false;
    }

    public Boolean LJ(ITEM item, String str, C162U c162u) {
        boolean zLJIIIZ = LJIIIZ(item);
        boolean zLJIIJ = LJIIJ(item, EnumC715680S5m.NOT_OVERWRITTEN);
        LIZLLL(item, c162u, zLJIIIZ, zLJIIJ);
        if (!zLJIIJ) {
            return null;
        }
        C163A c163aLIZIZ = LIZIZ();
        return Boolean.valueOf(c163aLIZIZ.LIZIZ(item, str, c162u, c163aLIZIZ.LIZLLL(item)));
    }
}
