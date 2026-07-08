package X;

import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0zpH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1910890zpH {
    public static final C1910880zpG LIZLLL = new C1910880zpG();
    public static final Map<EnumC1910860zpE, C1910890zpH> LJ = new LinkedHashMap();
    public static final ConcurrentHashMap<EnumC1910860zpE, C1910890zpH> LJFF = new ConcurrentHashMap<>();
    public final EnumC1910860zpE LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1910900zpI());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1910870zpF(this));

    public C1910890zpH(EnumC1910860zpE enumC1910860zpE) {
        this.LIZ = enumC1910860zpE;
    }

    public final void LJ(Throwable th) {
        if (((Boolean) this.LIZIZ.getValue()).booleanValue()) {
            IMALogApi.LIZ.getClass();
            IMALogApi iMALogApiLIZ = C0Z53.LIZ();
            if (iMALogApiLIZ != null) {
                iMALogApiLIZ.logException(th);
                return;
            }
            return;
        }
        if (!C2213981Bky.LIZIZ.isDebug()) {
            IMALogApi.LIZ.getClass();
            if (C0Z53.LIZ() != null) {
                IMALogApi.LIZ.getClass();
                IMALogApi iMALogApiLIZ2 = C0Z53.LIZ();
                if (iMALogApiLIZ2 != null) {
                    iMALogApiLIZ2.logException(th);
                }
            }
        }
    }

    public final String LJFF(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) this.LIZJ.getValue());
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(String str, String str2) {
        LJFF(str);
        C1110304Vx.LIZ().d();
    }

    public final void LIZIZ(String str, String str2) {
        C1110304Vx.LIZ().e(LJFF(str), str2);
    }

    public final void LIZLLL(String str, Throwable th) {
        C1110304Vx.LIZ().e(LJFF(str), th);
    }

    public final void LJI(String str, String str2) {
        C1110304Vx.LIZ().i(LJFF(str), str2);
    }

    public final void LJII(String str, String str2) {
        String strLJFF = LJFF(str);
        if (((Boolean) this.LIZIZ.getValue()).booleanValue()) {
            IMALogApi.LIZ.getClass();
            IMALogApi iMALogApiLIZ = C0Z53.LIZ();
            if (iMALogApiLIZ != null) {
                iMALogApiLIZ.LIZ(5, strLJFF, str2);
                return;
            }
            return;
        }
        if (!C2213981Bky.LIZIZ.isDebug()) {
            IMALogApi.LIZ.getClass();
            if (C0Z53.LIZ() != null) {
                IMALogApi.LIZ.getClass();
                IMALogApi iMALogApiLIZ2 = C0Z53.LIZ();
                if (iMALogApiLIZ2 != null) {
                    iMALogApiLIZ2.LIZ(5, strLJFF, str2);
                }
            }
        }
    }

    public final void LIZJ(String str, String str2, Throwable th) {
        C1110304Vx.LIZ().e(LJFF(str), str2, th);
    }
}
