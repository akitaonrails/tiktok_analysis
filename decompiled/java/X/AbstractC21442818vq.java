package X;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.18vq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21442818vq {
    public InterfaceC21449118wr LIZ;
    public AbstractC21430218to LIZIZ;
    public String LIZJ;
    public int LIZLLL;

    public abstract AbstractC21430218to LIZIZ();

    public abstract char LIZLLL();

    public final char LIZJ() {
        InterfaceC21449118wr interfaceC21449118wr = this.LIZ;
        ((C21442318vl) interfaceC21449118wr).LJII = this.LIZLLL;
        return ((C21442318vl) interfaceC21449118wr).LIZLLL();
    }

    public final void LJ() {
        InterfaceC21449118wr interfaceC21449118wr = this.LIZ;
        ((C21442318vl) interfaceC21449118wr).LJII = this.LIZLLL;
        ((C21442318vl) interfaceC21449118wr).LIZJ(C21442318vl.LJIIJJI);
        this.LIZLLL = ((C21442318vl) this.LIZ).LJII;
    }

    public final String LIZ(Pattern pattern) {
        InterfaceC21449118wr interfaceC21449118wr = this.LIZ;
        ((C21442318vl) interfaceC21449118wr).LJII = this.LIZLLL;
        String strLIZJ = ((C21442318vl) interfaceC21449118wr).LIZJ(pattern);
        this.LIZLLL = ((C21442318vl) this.LIZ).LJII;
        return strLIZJ;
    }

    public final C21437418uy LJFF(String str) {
        this.LIZ.getClass();
        return new C21437418uy(str);
    }
}
