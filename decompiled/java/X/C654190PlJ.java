package X;

import java.util.List;

/* JADX INFO: renamed from: X.0PlJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C654190PlJ {
    public final String LIZ;
    public final List<C654130PlD> LIZIZ;
    public final C654120PlC LIZJ;

    public C654190PlJ(String str, List list, C654120PlC c654120PlC, int i) {
        str = (i & 1) != 0 ? "" : str;
        list = (i & 8) != 0 ? null : list;
        c654120PlC = (i & 16) != 0 ? null : c654120PlC;
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = c654120PlC;
    }
}
