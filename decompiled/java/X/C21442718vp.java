package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.18vp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21442718vp {
    public StringBuilder LIZLLL;
    public String LJ;
    public String LJFF;
    public char LJI;
    public StringBuilder LJII;
    public EnumC21443318vv LIZ = EnumC21443318vv.START_DEFINITION;
    public final StringBuilder LIZIZ = new StringBuilder();
    public final List<C21440518vT> LIZJ = new ArrayList();
    public boolean LJIIIIZZ = false;

    public final void LIZ() {
        if (this.LJIIIIZZ) {
            String strLIZ = C21443018vs.LIZ(this.LJFF);
            StringBuilder sb = this.LJII;
            ((ArrayList) this.LIZJ).add(new C21440518vT(this.LJ, strLIZ, sb != null ? C21443018vs.LIZ(sb.toString()) : null));
            this.LIZLLL = null;
            this.LJIIIIZZ = false;
            this.LJ = null;
            this.LJFF = null;
            this.LJII = null;
        }
    }
}
