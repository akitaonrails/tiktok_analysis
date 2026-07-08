package X;

import java.util.List;

/* JADX INFO: renamed from: X.1E3c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2275061E3c implements InterfaceC548890Lfr {
    public static final InterfaceC548900Lfs<?>[] LIZJ = {C2275241E3u.LIZIZ, C2275341E4e.LIZIZ, C1E47.LIZIZ, C1E4P.LIZIZ, C1E3X.LIZIZ, C1E4K.LIZIZ, C1E3K.LIZIZ, new AbstractC2275081E3e<String>() { // from class: X.1E4T
    }, new AbstractC2275081E3e<String>() { // from class: X.1E4V
    }};
    public static final InterfaceC548900Lfs<?>[] LIZLLL = {C2275211E3r.LIZIZ, C1E3T.LIZIZ, C2275221E3s.LIZIZ, C1E3J.LIZIZ, C1E50.LIZIZ, C2275531E4x.LIZIZ, C2275541E4y.LIZIZ, C2275521E4w.LIZIZ};
    public static final InterfaceC548900Lfs<?>[] LJ;
    public static final InterfaceC548900Lfs<?>[] LJFF;
    public static final InterfaceC548900Lfs<?>[] LJI;
    public final String LIZ;
    public final List<InterfaceC548900Lfs<?>> LIZIZ;

    static {
        C1E4W c1e4w = new AbstractC2275081E3e<String>() { // from class: X.1E4W
        };
        C2275371E4h c2275371E4h = C2275371E4h.LIZIZ;
        C2275351E4f c2275351E4f = C2275351E4f.LIZIZ;
        C1E4L c1e4l = C1E4L.LIZIZ;
        LJ = new InterfaceC548900Lfs[]{new AbstractC2275081E3e<String>() { // from class: X.1E4a
        }, new AbstractC2275081E3e<Integer>() { // from class: X.1E4Z
        }, c1e4w, c2275371E4h, c2275351E4f, c1e4l};
        LJFF = new InterfaceC548900Lfs[]{new AbstractC2275081E3e<String>() { // from class: X.1E4U
        }, c1e4w, c2275371E4h, c2275351E4f, C1E51.LIZIZ, C1E4D.LIZIZ, C1E52.LIZIZ, c1e4l, C1E3V.LIZIZ, new AbstractC2275081E3e<String>() { // from class: X.1E4R
        }, new AbstractC2275081E3e<String>() { // from class: X.1E4Y
        }, C1E3G.LIZIZ, C1E3I.LIZIZ};
        LJI = new InterfaceC548900Lfs[]{new AbstractC2275081E3e<String>() { // from class: X.1E4S
        }, new AbstractC2275081E3e<String>() { // from class: X.1E4X
        }, new AbstractC2275081E3e<String>() { // from class: X.1E4c
        }, new AbstractC2275081E3e<String>() { // from class: X.1E4b
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

    public AbstractC2275061E3c(String str, InterfaceC548900Lfs[] interfaceC548900LfsArr) {
        this.LIZ = str;
        this.LIZIZ = C13LQ.LJJLL(interfaceC548900LfsArr);
    }
}
