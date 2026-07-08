package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.forestx.RequestParamsX;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS602S0100000_23;

/* JADX INFO: renamed from: X.0pzh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532950pzh implements InterfaceC1532260pya {
    public static final C01GW<C1532710pzJ> LJ;
    public static final C01GW<C1532310pyf> LJFF;
    public static final HashMap<String, Class<?>> LJI;
    public static final C1541070qCn<C1532900pzc, C1532310pyf> LJII;
    public final C1533300q0G LIZ;
    public final String LIZIZ;
    public final Map<String, Function0<InterfaceC1530870pwL>> LIZJ = new LinkedHashMap();
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(269));

    static {
        int i;
        int i2;
        EnumC452301pR enumC452301pR = EnumC452301pR.PUBLICATION;
        LJ = C452501pT.LIZ(enumC452301pR, AFwS212S0000000_23.get$arr$(267));
        LJFF = C452501pT.LIZ(enumC452301pR, AFwS212S0000000_23.get$arr$(268));
        LJI = new HashMap<>();
        String str = "resource";
        boolean z = true;
        long j = 300000;
        long j2 = Long.MAX_VALUE;
        EnumC1533170q03 enumC1533170q03 = EnumC1533170q03.REMOVE_ON_CONSUME;
        InterfaceC1532860pzY.LIZ.getClass();
        InterfaceC1532860pzY interfaceC1532860pzY = C1532910pzd.LIZJ;
        if (interfaceC1532860pzY == null || !interfaceC1532860pzY.LJFF()) {
            InterfaceC1532860pzY interfaceC1532860pzY2 = C1532910pzd.LIZJ;
            i = (interfaceC1532860pzY2 == null || !interfaceC1532860pzY2.LJIIL()) ? 35 : 60;
        } else {
            i = 15;
        }
        InterfaceC1532860pzY interfaceC1532860pzY3 = C1532910pzd.LIZJ;
        if (interfaceC1532860pzY3 == null || !interfaceC1532860pzY3.LJFF()) {
            InterfaceC1532860pzY interfaceC1532860pzY4 = C1532910pzd.LIZJ;
            i2 = (interfaceC1532860pzY4 == null || !interfaceC1532860pzY4.LJIIL()) ? 50 : 80;
        } else {
            i2 = 20;
        }
        C1541070qCn<C1532900pzc, C1532310pyf> c1541070qCn = new C1541070qCn<>(str, z, j, j2, enumC1533170q03, i, i2, new C1532840pzW(), 64);
        LJII = c1541070qCn;
        C1535890q4R.LIZ.getClass();
        C1535890q4R.LIZJ.put("resource".toLowerCase(Locale.ROOT), c1541070qCn);
    }

    public C1532950pzh(C1533300q0G c1533300q0G) {
        this.LIZ = c1533300q0G;
        this.LIZIZ = c1533300q0G.LIZ;
        C1533030pzp.LIZ.getClass();
        try {
            Iterator<InterfaceC1533010pzn> it2 = C1533030pzp.LIZJ.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().LIZJ();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    @Override // X.InterfaceC1532260pya
    public final C1532970pzj LIZIZ(String str, RequestParamsX requestParamsX) {
        C1532970pzj c1532970pzj = new C1532970pzj();
        C1541070qCn<C1532900pzc, C1532310pyf> c1541070qCn = LJII;
        C1532900pzc c1532900pzc = new C1532900pzc(this, str, requestParamsX, false);
        String str2 = requestParamsX.source;
        if (str2 == null) {
            str2 = this.LIZ.LIZ;
        }
        C1541080qCo c1541080qCoLIZ = c1541070qCn.LIZ(c1532900pzc, str2, null, null, new AwS602S0100000_23(c1532970pzj, 88));
        if (c1541080qCoLIZ == null) {
            return null;
        }
        c1532970pzj.LIZ = c1541080qCoLIZ;
        return c1532970pzj;
    }

    @Override // X.InterfaceC1532260pya
    public final C1541080qCo<C1532310pyf> LIZ(String str, RequestParamsX requestParamsX, Function1<? super C1532310pyf, Unit> function1) {
        if (!C1532960pzi.LIZ()) {
            C1541070qCn<C1532900pzc, C1532310pyf> c1541070qCn = LJII;
            C1532900pzc c1532900pzc = new C1532900pzc(this, str, requestParamsX, true);
            String str2 = requestParamsX.source;
            if (str2 == null) {
                str2 = this.LIZ.LIZ;
            }
            C1541080qCo c1541080qCoLIZ = c1541070qCn.LIZ(c1532900pzc, str2, null, null, function1);
            if (c1541080qCoLIZ != null) {
                c1541080qCoLIZ.execute();
                return c1541080qCoLIZ;
            }
        } else {
            C1541070qCn<C1532900pzc, C1532310pyf> c1541070qCn2 = LJII;
            C1532900pzc c1532900pzc2 = new C1532900pzc(this, str, requestParamsX, true);
            String str3 = requestParamsX.source;
            if (str3 == null) {
                str3 = this.LIZ.LIZ;
            }
            C1541080qCo c1541080qCoLIZ2 = c1541070qCn2.LIZ(c1532900pzc2, str3, null, null, new AwS602S0100000_23(function1, (Function1<? super InterfaceC1540940qCa, Unit>) 89));
            if (c1541080qCoLIZ2 != null) {
                c1541080qCoLIZ2.execute();
                return c1541080qCoLIZ2;
            }
        }
        function1.invoke(LJFF.getValue());
        return null;
    }

    @Override // X.InterfaceC1532260pya
    public final InterfaceC1166350gSP LIZJ(String str, RequestParamsX requestParamsX, Function1<? super C1532310pyf, Unit> function1) {
        C1541070qCn<C1532900pzc, C1532310pyf> c1541070qCn = LJII;
        C1532900pzc c1532900pzc = new C1532900pzc(this, str, requestParamsX, true);
        String str2 = requestParamsX.source;
        if (str2 == null) {
            str2 = this.LIZ.LIZ;
        }
        return c1541070qCn.LJFF(c1532900pzc, str2, c1541070qCn.LJ(), function1);
    }
}
