package X;

import android.os.SystemClock;
import com.bytedance.ies.cutsame.effectfetcher.TemplateSourceConfig;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0LE8, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LE8 {
    public static final C0LE8 LIZ = new C0LE8();
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;
    public static final C01GW LJ;
    public static final C389400FOo LJFF;
    public static final C01GW LJI;

    static {
        NLE.loadNLELibrary$default(NLE.INSTANCE, true, C293550Bez.LIZ(), false, 4, null);
        LoadSoLancet.LIZJ("NLEResourcesDAVJni");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("NLEResourcesDAVJni");
        LoadSoLancet.LJ(jUptimeMillis, "NLEResourcesDAVJni");
        LoadSoLancet.LIZLLL(jUptimeMillis, "NLEResourcesDAVJni");
        LoadSoLancet.LIZIZ("NLEResourcesDAVJni");
        LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(24));
        LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(26));
        LIZLLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(25));
        LJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(82));
        LJFF = C389400FOo.LJFF.getValue();
        LJI = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(13));
    }

    public static TemplateSourceConfig LIZ() {
        return (TemplateSourceConfig) LJ.getValue();
    }

    public static final void LIZJ() {
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        LIZ.getClass();
        C559870LxZ.LIZ = (C0LE7) LIZIZ.getValue();
        C559870LxZ.LIZLLL();
        C2491509pZ.LIZ = (C539430LDp) LIZJ.getValue();
    }

    public static final void LIZIZ(TemplateSourceConfig templateSourceConfig) {
        C2268941DrQ.LIZ.LIZIZ(new AwS566S0100000_22(templateSourceConfig, 24));
        LIZJ();
    }
}
