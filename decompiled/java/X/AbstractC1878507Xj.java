package X;

import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07Xj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1878507Xj extends AbstractC1878107Xf {
    @Override // X.AbstractC1878107Xf
    public final List<EnumC1980607pM> LIZJ() {
        return C1697810uHb.LJIIJJI(EnumC1980607pM.IN, EnumC1980607pM.NOT_IN);
    }

    public abstract String LIZLLL();

    @Override // X.AbstractC1878107Xf
    public final boolean LIZIZ(EnumC1980607pM enumC1980607pM, String str) {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
        if (enumC1980607pM == EnumC1980607pM.IN) {
            return listLJJLIIIJILLIZJL.contains(LIZLLL());
        }
        if (enumC1980607pM != EnumC1980607pM.NOT_IN) {
            return false;
        }
        return !listLJJLIIIJILLIZJL.contains(LIZLLL());
    }
}
