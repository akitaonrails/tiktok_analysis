package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.12bf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19788912bf implements InterfaceC19789012bg {
    public final /* synthetic */ C19779612aA LIZ;

    public C19788912bf(C19779612aA c19779612aA) {
        this.LIZ = c19779612aA;
    }

    public final void LIZ(EnumC19789812bo enumC19789812bo, String str, List<String> list, boolean z, boolean z2) {
        C19811612fK c19811612fK;
        int i = C19789512bl.LIZ[enumC19789812bo.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        c19811612fK = this.LIZ.LJIILJJIL().LJIIJJI;
                    } else {
                        c19811612fK = this.LIZ.LJIILJJIL().LJIILIIL;
                    }
                } else if (z) {
                    c19811612fK = this.LIZ.LJIILJJIL().LJIIIZ;
                } else if (!z2) {
                    c19811612fK = this.LIZ.LJIILJJIL().LJIIJ;
                } else {
                    c19811612fK = this.LIZ.LJIILJJIL().LJIIIIZZ;
                }
            } else if (z) {
                c19811612fK = this.LIZ.LJIILJJIL().LJI;
            } else if (!z2) {
                c19811612fK = this.LIZ.LJIILJJIL().LJII;
            } else {
                c19811612fK = this.LIZ.LJIILJJIL().LJFF;
            }
        } else {
            c19811612fK = this.LIZ.LJIILJJIL().LJIIL;
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    c19811612fK.LIZJ(str);
                    return;
                } else {
                    c19811612fK.LIZLLL(str, ListProtector.get(list, 0), ListProtector.get(list, 1), ListProtector.get(list, 2));
                    return;
                }
            }
            c19811612fK.LIZIZ(ListProtector.get(list, 0), str, ListProtector.get(list, 1));
            return;
        }
        c19811612fK.LIZ(ListProtector.get(list, 0), str);
    }
}
