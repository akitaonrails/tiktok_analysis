package X;

import java.util.List;

/* JADX INFO: renamed from: X.0XlE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC857980XlE<METADATA> {
    public final C13E8<AbstractC858320Xlm<METADATA>> LIZ = new C13E8<>();

    public abstract C858450Xlz LIZIZ(CharSequence charSequence, Iterable iterable);

    public abstract List<AbstractC858320Xlm<METADATA>> LIZJ(CharSequence charSequence, List<? extends METADATA> list);

    public final C13E8 LIZ() {
        C13E8<AbstractC858320Xlm<METADATA>> c13e8 = this.LIZ;
        int i = 0;
        for (AbstractC858320Xlm<METADATA> abstractC858320Xlm : c13e8) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            AbstractC858320Xlm<METADATA> abstractC858320Xlm2 = abstractC858320Xlm;
            if (abstractC858320Xlm2.LJIIJJI()) {
                abstractC858320Xlm2.LJIILIIL(String.valueOf(i));
            }
            i = i2;
        }
        return c13e8;
    }
}
