package X;

import java.util.List;

/* JADX INFO: renamed from: X.1E3b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2275051E3b implements InterfaceC548890Lfr {
    public static final InterfaceC548900Lfs<? extends Object>[] LIZJ;
    public static final InterfaceC548900Lfs<? extends Object>[] LIZLLL;
    public static final AbstractC2275041E3a<? extends Object>[] LJ;
    public static final InterfaceC548900Lfs<? extends Object>[] LJFF;
    public static final AbstractC2275041E3a<? extends Object>[] LJI;
    public static final InterfaceC548900Lfs<? extends Object>[] LJII;
    public static final AbstractC2275041E3a<Integer>[] LJIIIIZZ;
    public static final C2275091E3f<Integer>[] LJIIIZ;
    public final String LIZ;
    public final List<InterfaceC548900Lfs<?>> LIZIZ;

    static {
        C1E4L c1e4l = C1E4L.LIZIZ;
        C1E52 c1e52 = C1E52.LIZIZ;
        C1E51 c1e51 = C1E51.LIZIZ;
        C2275231E3t c2275231E3t = new C2275091E3f<String>() { // from class: X.1E3t
        };
        C1E3L c1e3l = new AbstractC2275041E3a<String>() { // from class: X.1E3L
        };
        C1E44 c1e44 = new C2275091E3f<Boolean>() { // from class: X.1E44
        };
        C2275261E3w c2275261E3w = new C2275091E3f<String>() { // from class: X.1E3w
        };
        C2275251E3v c2275251E3v = new C2275091E3f<String>() { // from class: X.1E3v
        };
        C2275271E3x c2275271E3x = new C2275091E3f<String>() { // from class: X.1E3x
        };
        LIZJ = new InterfaceC548900Lfs[]{c1e4l, c1e52, c1e51, c2275231E3t, C1E4K.LIZIZ, c1e3l, c1e44, c2275261E3w, c2275251E3v, c2275271E3x};
        LIZLLL = new InterfaceC548900Lfs[]{c1e4l, c1e52, c1e51, c2275231E3t, c1e3l, c1e44, c2275261E3w, c2275251E3v, c2275271E3x};
        LJ = new AbstractC2275041E3a[]{C1E50.LIZIZ, C2275551E4z.LIZIZ, C2275521E4w.LIZIZ, C2275471E4r.LIZIZ, C2275461E4q.LIZIZ, C2275501E4u.LIZIZ, C2275511E4v.LIZIZ, C2275541E4y.LIZIZ};
        LJFF = new InterfaceC548900Lfs[]{new AbstractC2275041E3a<String>() { // from class: X.1E4d
        }, new C2275091E3f<Integer>() { // from class: X.1E41
        }, new C2275091E3f<Integer>() { // from class: X.1E40
        }};
        LJI = new AbstractC2275041E3a[]{C1E4C.LIZIZ, C1E4E.LIZIZ, C1E4H.LIZIZ, C1E3I.LIZIZ};
        LJII = new InterfaceC548900Lfs[]{C1E3W.LIZIZ, new AbstractC2275041E3a<String>() { // from class: X.1E4i
        }, new AbstractC2275041E3a<Integer>() { // from class: X.1E4g
        }, new C2275091E3f<Integer>() { // from class: X.1E3z
        }, new AbstractC2275041E3a<Integer>() { // from class: X.1E4j
        }, C2275371E4h.LIZIZ, new AbstractC2275041E3a<String>() { // from class: X.1E3N
        }, new AbstractC2275041E3a<Integer>() { // from class: X.1E4t
        }, new AbstractC2275041E3a<Integer>() { // from class: X.1E3P
        }, new C2275091E3f<String>() { // from class: X.1E45
        }};
        LJIIIIZZ = new AbstractC2275041E3a[]{new AbstractC2275041E3a<Integer>() { // from class: X.1E46
        }, new AbstractC2275041E3a<Integer>() { // from class: X.1E4p
        }};
        LJIIIZ = new C2275091E3f[]{new C2275091E3f<Integer>() { // from class: X.1E43
        }, new C2275091E3f<Integer>() { // from class: X.1E3y
        }};
    }

    @Override // X.InterfaceC548890Lfr
    public final List<InterfaceC548900Lfs<?>> getKeys() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC548890Lfr
    public final String getName() {
        return this.LIZ;
    }

    public C2275051E3b(String str, InterfaceC548900Lfs<?>... interfaceC548900LfsArr) {
        this.LIZ = str;
        this.LIZIZ = C13LQ.LJJLL(interfaceC548900LfsArr);
    }
}
