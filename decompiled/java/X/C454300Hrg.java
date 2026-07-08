package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Hrg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454300Hrg {
    public final String LIZ;
    public final int LIZIZ;
    public final Integer LIZJ;
    public final Integer LIZLLL;
    public final C343950De5 LJ;
    public final EnumC454290Hrf LJFF;
    public final Function0<Unit> LJI;

    public C454300Hrg(String str, int i, C343950De5 c343950De5, EnumC454290Hrf enumC454290Hrf, Function0 function0, int i2) {
        enumC454290Hrf = (i2 & 32) != 0 ? EnumC454290Hrf.SAVE : enumC454290Hrf;
        function0 = (i2 & 64) != 0 ? null : function0;
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = c343950De5;
        this.LJFF = enumC454290Hrf;
        this.LJI = function0;
    }
}
