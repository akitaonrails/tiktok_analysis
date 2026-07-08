package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.forestx.RequestParamsX;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS602S0100000_23;

/* JADX INFO: renamed from: X.0pzo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533020pzo extends C1540860qCS implements InterfaceC1532260pya {
    public static final /* synthetic */ int LJIIL = 0;
    public C1532950pzh LJIIIIZZ;
    public String LJIIIZ;
    public final Map<String, C0VSZ> LJIIJ;
    public final C1541070qCn<C1532900pzc, C1532310pyf> LJIIJJI;

    @Override // X.InterfaceC1532260pya
    public final C1532970pzj LIZIZ(String str, RequestParamsX requestParamsX) {
        String str2 = this.LJIIIZ;
        if (str2 != null) {
            String str3 = requestParamsX.accessKey;
            if (str3 != null) {
                str2 = str3;
            }
            requestParamsX.accessKey = str2;
        }
        C1532970pzj c1532970pzj = new C1532970pzj();
        C1541080qCo<C1532310pyf> c1541080qCoLIZLLL = LIZLLL(new C1532900pzc(this.LJIIIIZZ, str, requestParamsX, false), this.LJIIJJI, requestParamsX.source, null, null, new AwS602S0100000_23(c1532970pzj, 90));
        if (c1541080qCoLIZLLL == null) {
            return null;
        }
        c1532970pzj.LIZ = c1541080qCoLIZLLL;
        return c1532970pzj;
    }

    @Override // X.C1540860qCS
    public final Map<C1541070qCn<?, ?>, C1541020qCi> LJFF(String str, boolean z) {
        Map<C1541070qCn<?, ?>, C1541020qCi> mapLJFF = super.LJFF(str, z);
        loop0: while (true) {
            try {
                Iterator it2 = ((LinkedHashMap) this.LJIIJ).entrySet().iterator();
                while (it2.hasNext()) {
                    try {
                        ((C0VSZ) ((Map.Entry) it2.next()).getValue()).LIZJ();
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
                break loop0;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        C1533030pzp.LIZ.getClass();
        try {
            Iterator<InterfaceC1533010pzn> it3 = C1533030pzp.LIZJ.iterator();
            while (it3.hasNext()) {
                try {
                    it3.next().LIZIZ();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    C189200o6.m2constructorimpl(new C098200Yq(th3));
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return mapLJFF;
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            C189200o6.m2constructorimpl(new C098200Yq(th4));
            return mapLJFF;
        }
    }

    @Override // X.InterfaceC1532260pya
    public final C1541080qCo<C1532310pyf> LIZ(String str, RequestParamsX requestParamsX, Function1<? super C1532310pyf, Unit> function1) {
        String str2 = this.LJIIIZ;
        if (str2 != null) {
            String str3 = requestParamsX.accessKey;
            if (str3 != null) {
                str2 = str3;
            }
            requestParamsX.accessKey = str2;
        }
        if (!C1532960pzi.LIZ()) {
            C1541080qCo<C1532310pyf> c1541080qCoLIZLLL = LIZLLL(new C1532900pzc(this.LJIIIIZZ, str, requestParamsX, true), this.LJIIJJI, requestParamsX.source, null, null, function1);
            if (c1541080qCoLIZLLL != null) {
                c1541080qCoLIZLLL.execute();
                return c1541080qCoLIZLLL;
            }
        } else {
            C1541080qCo<C1532310pyf> c1541080qCoLIZLLL2 = LIZLLL(new C1532900pzc(this.LJIIIIZZ, str, requestParamsX, true), this.LJIIJJI, requestParamsX.source, null, null, new AwS602S0100000_23(function1, (Function1<? super InterfaceC1540940qCa, Unit>) 91));
            if (c1541080qCoLIZLLL2 != null) {
                c1541080qCoLIZLLL2.execute();
                return c1541080qCoLIZLLL2;
            }
        }
        function1.invoke(C1532950pzh.LJFF.getValue());
        return null;
    }

    @Override // X.InterfaceC1532260pya
    public final InterfaceC1166350gSP LIZJ(String str, RequestParamsX requestParamsX, Function1<? super C1532310pyf, Unit> function1) {
        String str2 = this.LJIIIZ;
        if (str2 != null) {
            String str3 = requestParamsX.accessKey;
            if (str3 != null) {
                str2 = str3;
            }
            requestParamsX.accessKey = str2;
        }
        C1532900pzc c1532900pzc = new C1532900pzc(this.LJIIIIZZ, str, requestParamsX, true);
        C1541070qCn<C1532900pzc, C1532310pyf> c1541070qCn = this.LJIIJJI;
        String str4 = requestParamsX.source;
        C1535940q4W c1535940q4WLJ = c1541070qCn.LJ();
        c1535940q4WLJ.LIZJ = 300000L;
        if (str4 == null) {
            str4 = this.LIZ;
        }
        C1541080qCo c1541080qCoLJ = LJ(c1532900pzc, c1541070qCn, str4, c1535940q4WLJ, function1);
        if (c1541080qCoLJ == null) {
            return null;
        }
        c1541080qCoLJ.execute();
        return c1541080qCoLJ;
    }

    public final void LJI(C1533140q00 c1533140q00, EnumC1533980q1M enumC1533980q1M, String str, String str2, String str3) {
        boolean z;
        String str4 = c1533140q00.LIZ;
        RequestParamsX requestParamsX = new RequestParamsX(enumC1533980q1M, null, 2, null);
        boolean z2 = c1533140q00.LIZIZ;
        if (z2 && enumC1533980q1M != EnumC1533980q1M.LYNX_IMAGE) {
            requestParamsX.consumeType = byte[].class;
        }
        requestParamsX.enableMemoryCache = z2;
        if (!c1533140q00.LIZJ && enumC1533980q1M != EnumC1533980q1M.LYNX_IMAGE) {
            z = false;
        } else {
            z = true;
        }
        requestParamsX.disableCdn = z;
        if (str != null) {
            requestParamsX.groupId = str;
        }
        Map<String, ? extends Object> map = c1533140q00.LIZLLL;
        if (map != null) {
            Map<String, Object> linkedHashMap = requestParamsX.customParams;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            linkedHashMap.putAll(map);
            requestParamsX.customParams = linkedHashMap;
        }
        requestParamsX.sessionId = str2;
        requestParamsX.source = str3;
        LIZJ(str4, requestParamsX, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1533020pzo(C1532950pzh c1532950pzh, String str, String str2, String str3, boolean z, int i) {
        boolean z2;
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        str3 = (i & 16) != 0 ? null : str3;
        z = (i & 32) != 0 ? false : z;
        if (str == null) {
            if (str2 == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1532950pzh.LIZ.LIZ);
                sbLIZ.append("-group");
                str = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                str = str2;
            }
        }
        super(str, z2, z, str3);
        this.LJIIIIZZ = c1532950pzh;
        this.LJIIIZ = str2;
        this.LJIIJ = new LinkedHashMap();
        this.LJIIJJI = C1532950pzh.LJII;
        C1533030pzp.LIZ.getClass();
        try {
            Iterator<InterfaceC1533010pzn> it2 = C1533030pzp.LIZJ.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().LIZ();
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
}
