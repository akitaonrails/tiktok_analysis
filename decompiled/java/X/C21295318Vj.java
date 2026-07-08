package X;

import android.text.TextWatcher;
import java.util.List;

/* JADX INFO: renamed from: X.18Vj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21295318Vj {
    public final EnumC21294918Vf LIZ;
    public final List<C21295818Vo> LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;
    public final EnumC212366188u LJ;
    public final C375830EoP<String> LJFF;
    public final C375830EoP<TextWatcher> LJI;

    public C21295318Vj(EnumC21294918Vf enumC21294918Vf, List<C21295818Vo> list, Integer num, String str, EnumC212366188u enumC212366188u, C375830EoP<String> c375830EoP, C375830EoP<TextWatcher> c375830EoP2) {
        this.LIZ = enumC21294918Vf;
        this.LIZIZ = list;
        this.LIZJ = num;
        this.LIZLLL = str;
        this.LJ = enumC212366188u;
        this.LJFF = c375830EoP;
        this.LJI = c375830EoP2;
    }

    public static C21295318Vj LIZ(C21295318Vj c21295318Vj, EnumC21294918Vf enumC21294918Vf, List list, String str, EnumC212366188u enumC212366188u, C375830EoP c375830EoP, C375830EoP c375830EoP2, int i) {
        Integer num;
        C375830EoP c375830EoP3 = c375830EoP2;
        C375830EoP c375830EoP4 = c375830EoP;
        EnumC212366188u enumC212366188u2 = enumC212366188u;
        String str2 = str;
        List list2 = list;
        EnumC21294918Vf enumC21294918Vf2 = enumC21294918Vf;
        if ((i & 1) != 0) {
            enumC21294918Vf2 = c21295318Vj.LIZ;
        }
        if ((i & 2) != 0) {
            list2 = c21295318Vj.LIZIZ;
        }
        if ((i & 4) != 0) {
            num = c21295318Vj.LIZJ;
        } else {
            num = null;
        }
        if ((i & 8) != 0) {
            str2 = c21295318Vj.LIZLLL;
        }
        if ((i & 16) != 0) {
            enumC212366188u2 = c21295318Vj.LJ;
        }
        if ((i & 32) != 0) {
            c375830EoP4 = c21295318Vj.LJFF;
        }
        if ((i & 64) != 0) {
            c375830EoP3 = c21295318Vj.LJI;
        }
        c21295318Vj.getClass();
        return new C21295318Vj(enumC21294918Vf2, list2, num, str2, enumC212366188u2, c375830EoP4, c375830EoP3);
    }
}
