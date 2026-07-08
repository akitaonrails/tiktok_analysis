package X;

import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07Xi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1878407Xi extends AbstractC1878107Xf {
    @Override // X.AbstractC1878107Xf
    public final List<EnumC1980607pM> LIZJ() {
        return C1697810uHb.LJIIJJI(EnumC1980607pM.IN, EnumC1980607pM.NOT_IN);
    }

    public abstract List<String> LIZLLL();

    @Override // X.AbstractC1878107Xf
    public final boolean LIZIZ(EnumC1980607pM enumC1980607pM, String str) {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
        if (enumC1980607pM == EnumC1980607pM.IN) {
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (it2.hasNext()) {
                if (!LIZLLL().contains(it2.next())) {
                    return false;
                }
            }
            return true;
        }
        if (enumC1980607pM != EnumC1980607pM.NOT_IN) {
            return false;
        }
        Iterator it3 = listLJJLIIIJILLIZJL.iterator();
        while (it3.hasNext()) {
            if (LIZLLL().contains(it3.next())) {
                return false;
            }
        }
        return true;
    }
}
