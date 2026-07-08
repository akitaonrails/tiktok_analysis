package X;

import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.10Uw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC19255610Uw extends C10VA {
    @Override // X.C10VA
    public final List<EnumC19255510Uv> LIZJ() {
        return C1697810uHb.LJIIJJI(EnumC19255510Uv.IN, EnumC19255510Uv.NOT_IN);
    }

    public abstract String LIZLLL();

    @Override // X.C10VA
    public final boolean LIZIZ(EnumC19255510Uv enumC19255510Uv, String str) {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
        if (enumC19255510Uv == EnumC19255510Uv.IN) {
            return listLJJLIIIJILLIZJL.contains(LIZLLL());
        }
        if (enumC19255510Uv != EnumC19255510Uv.NOT_IN) {
            return false;
        }
        return !listLJJLIIIJILLIZJL.contains(LIZLLL());
    }
}
