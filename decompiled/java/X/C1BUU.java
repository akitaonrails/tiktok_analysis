package X;

import java.util.Date;
import java.util.Iterator;

/* JADX INFO: renamed from: X.1BUU, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BUU implements InterfaceC2205761BUo {
    public static final C1BUU LJFF = new C1BUU(new C2205671BUf());
    public final C2205781BUq LIZ = new Object() { // from class: X.1BUq
    };
    public Date LIZIZ;
    public boolean LIZJ;
    public final C2205671BUf LIZLLL;
    public boolean LJ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1BUq] */
    public C1BUU(C2205671BUf c2205671BUf) {
        this.LIZLLL = c2205671BUf;
    }

    @Override // X.InterfaceC2205761BUo
    public final void a(boolean z) {
        if (!this.LJ && z) {
            LIZ();
        }
        this.LJ = z;
    }

    public final void LIZ() {
        getClass();
        Date date = new Date();
        Date date2 = this.LIZIZ;
        if (date2 == null || date.after(date2)) {
            this.LIZIZ = date;
            if (this.LIZJ) {
                Iterator<C1BUP> it2 = C21690119ud.LIZJ.LIZ().iterator();
                while (it2.hasNext()) {
                    C1BUI c1bui = it2.next().LJ;
                    Date date3 = this.LIZIZ;
                    c1bui.LIZIZ(date3 != null ? (Date) date3.clone() : null);
                }
            }
        }
    }
}
