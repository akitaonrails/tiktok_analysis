package X;

import java.io.File;

/* JADX INFO: renamed from: X.0kgn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329030kgn {
    public final int LIZ;
    public final String LIZIZ;
    public final InterfaceC1320070kSL<File> LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final float LJI;
    public final C1335620krQ LJII;
    public final C1330900kjo LJIIIIZZ;
    public final InterfaceC1335510krF LJIIIZ;
    public final String LJIIJ;
    public final InterfaceC1320070kSL<File> LJIIJJI;

    public C1329030kgn(C1329020kgm c1329020kgm) {
        C1330900kjo c1330900kjo;
        c1329020kgm.getClass();
        this.LIZ = 1;
        String str = c1329020kgm.LIZ;
        str.getClass();
        this.LIZIZ = str;
        InterfaceC1320070kSL<File> interfaceC1320070kSL = c1329020kgm.LIZIZ;
        interfaceC1320070kSL.getClass();
        this.LIZJ = interfaceC1320070kSL;
        this.LIZLLL = c1329020kgm.LIZJ;
        this.LJ = 10485760L;
        this.LJFF = 2097152L;
        this.LJI = 0.1f;
        C1335620krQ c1335620krQ = c1329020kgm.LIZLLL;
        c1335620krQ.getClass();
        this.LJII = c1335620krQ;
        synchronized (C1330900kjo.class) {
            if (C1330900kjo.LIZ == null) {
                C1330900kjo.LIZ = new C1330900kjo();
            }
            c1330900kjo = C1330900kjo.LIZ;
        }
        this.LJIIIIZZ = c1330900kjo;
        InterfaceC1335510krF interfaceC1335510krF = c1329020kgm.LJ;
        this.LJIIIZ = interfaceC1335510krF == null ? C1330820kjg.LJII() : interfaceC1335510krF;
        if (c1329020kgm.LJFF == null) {
            C1330830kjh.LIZ();
        }
        this.LJIIJ = "image_config";
        this.LJIIJJI = c1329020kgm.LJI;
    }
}
