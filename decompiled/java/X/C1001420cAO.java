package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cAO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1001420cAO {
    public final String LIZ;
    public final EnumC599900Nfw LIZIZ;
    public Function0<Unit> LIZJ;
    public EnumC1001380cAK LIZLLL;
    public EnumC1001450cAR LJ;
    public EnumC1001490cAV LJFF;
    public C0NO3 LJI;

    public C1001420cAO() {
        this("", EnumC599900Nfw.FEED);
    }

    public final boolean LIZ() {
        return this.LJFF == EnumC1001490cAV.COMPLETED;
    }

    public final boolean LIZIZ() {
        if (this.LJ != EnumC1001450cAR.DISCARD_AND_STOP_STYLE_SHOW) {
            return false;
        }
        EnumC1001490cAV enumC1001490cAV = this.LJFF;
        return enumC1001490cAV == EnumC1001490cAV.FAILED || enumC1001490cAV == EnumC1001490cAV.CANCELLED;
    }

    public C1001420cAO(String str, EnumC599900Nfw enumC599900Nfw) {
        this.LIZ = str;
        this.LIZIZ = enumC599900Nfw;
        this.LIZLLL = EnumC1001380cAK.OTHER;
        this.LJ = EnumC1001450cAR.DIRECT_DISCARD;
        this.LJFF = EnumC1001490cAV.PENDING;
        this.LJI = C0NO3.DEFAULT;
    }
}
