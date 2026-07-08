package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Uji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C780600Uji {
    public final C780620Ujk LIZ;
    public final EnumC780830Uk5 LIZIZ;
    public final EnumC2011707uN LIZJ;

    public static void LIZ(C780600Uji c780600Uji, Function0 function0) {
        EnumC780830Uk5 enumC780830Uk5 = c780600Uji.LIZIZ;
        C780620Ujk c780620Ujk = c780600Uji.LIZ;
        if (enumC780830Uk5 == null) {
            c780620Ujk.getClass();
            enumC780830Uk5 = EnumC780830Uk5.P2;
        }
        List<Function0<Unit>> list = c780620Ujk.LIZIZ.get(enumC780830Uk5);
        if (list != null) {
            list.add(function0);
        } else {
            c780620Ujk.LIZIZ.put(enumC780830Uk5, C1697810uHb.LJIILJJIL(function0));
        }
    }

    public C780600Uji(C780620Ujk c780620Ujk, EnumC780830Uk5 enumC780830Uk5, EnumC2011707uN enumC2011707uN) {
        this.LIZ = c780620Ujk;
        this.LIZIZ = enumC780830Uk5;
        this.LIZJ = enumC2011707uN;
    }
}
