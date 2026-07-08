package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.10tb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19390510tb extends C194451115t {
    public final C19390610tc LLILZIL;

    @Override // X.C194451115t
    public final void LIZ() {
        Iterator<? extends AbstractC19385210sk> it2 = this.LLILZIL.LIZ.iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((ArrayList) it2.next().LIZ).iterator();
            while (it3.hasNext()) {
                ((AbstractC19390410ta) it3.next()).LJIIJJI();
            }
        }
    }

    @Override // X.C194451115t
    public final void LIZIZ() {
        Iterator<? extends AbstractC19385210sk> it2 = this.LLILZIL.LIZ.iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((ArrayList) it2.next().LIZ).iterator();
            while (it3.hasNext()) {
                it3.next().getClass();
            }
        }
    }

    @Override // X.C194451115t
    public final void LIZJ() {
        Iterator<? extends AbstractC19385210sk> it2 = this.LLILZIL.LIZ.iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((ArrayList) it2.next().LIZ).iterator();
            while (it3.hasNext()) {
                ((AbstractC19390410ta) it3.next()).LJIIL();
            }
        }
    }

    @Override // X.C194451115t
    public final void LIZLLL() {
        Iterator<? extends AbstractC19385210sk> it2 = this.LLILZIL.LIZ.iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((ArrayList) it2.next().LIZ).iterator();
            while (it3.hasNext()) {
                ((AbstractC19390410ta) it3.next()).LJIILIIL();
            }
        }
    }

    public final void LJ() {
        Iterator<? extends AbstractC19385210sk> it2 = this.LLILZIL.LIZ.iterator();
        while (it2.hasNext()) {
            for (AbstractC19390410ta abstractC19390410ta : (ArrayList) it2.next().LIZ) {
                abstractC19390410ta.LLILLL = this;
                abstractC19390410ta.LJIIIZ();
            }
        }
    }

    public final void LJI() {
        C19390610tc c19390610tc = this.LLILZIL;
        Iterator<? extends AbstractC19385210sk> it2 = c19390610tc.LIZ.iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((ArrayList) it2.next().LIZ).iterator();
            while (it3.hasNext()) {
                ((AbstractC19390410ta) it3.next()).LJIIJ();
            }
        }
        c19390610tc.LIZ.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19390510tb(Context context) {
        super(context);
        this.LLILZIL = new C19390610tc(C1697810uHb.LJIILJJIL(new AbstractC19385210sk() { // from class: X.10sj
            {
                ((ArrayList) this.LIZ).add(new C19385310sl());
                ((ArrayList) this.LIZ).add(new C19389810tU());
                ((ArrayList) this.LIZ).add(new C19385010si());
                ((ArrayList) this.LIZ).add(new C19383610sU());
                ((ArrayList) this.LIZ).add(new C19384210sa());
            }
        }));
    }
}
