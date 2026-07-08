package X;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.1BQp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2204731BQp {
    public final Set<String> LIZ;
    public final Set<String> LIZIZ;
    public final C2204701BQm LIZJ = C2204711BQn.LJ.LIZ();
    public final C2204651BQh LIZLLL;

    public C2204731BQp(C2204651BQh c2204651BQh, Set<String> set, Set<String> set2) {
        this.LIZLLL = c2204651BQh;
        this.LIZ = new LinkedHashSet(set);
        this.LIZIZ = new LinkedHashSet(set2);
    }

    public final synchronized EnumC1062390dkj LIZ(C1BRD c1brd, C1543850qHH c1543850qHH, String str, List list) {
        if (this.LIZLLL == null) {
            C2204811BQx c2204811BQx = new C2204811BQx();
            c2204811BQx.LIZJ("null", "call_permission_group");
            c2204811BQx.LIZJ("null", "config");
            c2204811BQx.LIZ("label_permission_checker_null_config", list);
            if (c1543850qHH != null) {
                c1543850qHH.LIZLLL(2);
            }
            return null;
        }
        C2204701BQm c2204701BQm = this.LIZJ;
        if (c2204701BQm != null) {
            C1BR8 c1br8 = C2204711BQn.LJIIIIZZ;
            if ((c1br8.LIZ() == null || !c1br8.LIZ().LIZ(C1BR4.PERMISSION_CONFIG_DEFAULT_FETCHED)) && !c2204701BQm.LJII) {
                C2204811BQx c2204811BQx2 = new C2204811BQx();
                c2204811BQx2.LIZJ("false", "config_repository_fetched");
                c2204811BQx2.LIZ("label_permission_checker_fetch", list);
                throw new C2204681BQk("Permission configuration has not been fetched");
            }
        }
        C2204661BQi c2204661BQiLIZIZ = this.LIZLLL.LIZIZ(str, list, c1543850qHH);
        if (((HashSet) c2204661BQiLIZIZ.LIZJ).contains(c1brd.LL)) {
            if (c1543850qHH != null) {
                c1543850qHH.LIZLLL(1);
            }
            return null;
        }
        if (((HashSet) c2204661BQiLIZIZ.LIZIZ).contains(c1brd.LL)) {
            return EnumC1062390dkj.PRIVATE;
        }
        if (c2204661BQiLIZIZ.LIZ.compareTo(c1brd.LIZJ()) < 0) {
            return null;
        }
        return c2204661BQiLIZIZ.LIZ;
    }
}
