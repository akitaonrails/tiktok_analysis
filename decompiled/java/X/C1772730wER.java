package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0wER, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1772730wER {
    public final EnumC1772960wEo LIZ;
    public final List<AbstractC1773210wFD> LIZIZ;
    public final List<AbstractC1773210wFD> LIZJ;
    public final String LIZLLL;
    public final Long LJ;

    public /* synthetic */ C1772730wER(EnumC1772960wEo enumC1772960wEo, List list, List list2, int i) {
        this(enumC1772960wEo, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? new ArrayList() : list2, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1772730wER(EnumC1772960wEo enumC1772960wEo, List<? extends AbstractC1773210wFD> list, List<? extends AbstractC1773210wFD> list2, String str, Long l) {
        this.LIZ = enumC1772960wEo;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = str;
        this.LJ = l;
    }
}
