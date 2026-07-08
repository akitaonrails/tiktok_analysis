package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0fq2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142560fq2 {
    public static final HashMap<String, C1142280fpa> LIZ = new HashMap<>();
    public static final Object LIZIZ = new Object();

    public static String LIZJ(String str) {
        if (str == null || a0.LJJJIL(str) || Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT) || Intrinsics.LJFF(str, "-1")) {
            return "";
        }
        return str;
    }

    public static C1142280fpa LIZIZ(EnumC1142580fq4 enumC1142580fq4, String str) {
        C1142280fpa c1142280fpa;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC1142580fq4.name());
        sbLIZ.append(':');
        sbLIZ.append(LIZJ(str));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        synchronized (LIZIZ) {
            try {
                c1142280fpa = LIZ.get(strLIZIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c1142280fpa;
    }

    public static C1142280fpa LIZ(EnumC1142580fq4 enumC1142580fq4, InterfaceC497601wk interfaceC497601wk, PcsApi pcsApi, String str, String str2) {
        C1142280fpa c1142280fpa;
        C1122180fJA c1122180fJA;
        String strLIZJ = LIZJ(str2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC1142580fq4.name());
        sbLIZ.append(':');
        sbLIZ.append(LIZJ(strLIZJ));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        synchronized (LIZIZ) {
            try {
                HashMap<String, C1142280fpa> map = LIZ;
                c1142280fpa = map.get(strLIZIZ);
                if (c1142280fpa == null) {
                    C1122170fJ9 c1122170fJ9 = null;
                    if (enumC1142580fq4 != EnumC1142580fq4.GO_LIVE && enumC1142580fq4 != EnumC1142580fq4.ANCHOR_LIVE) {
                        c1122180fJA = null;
                    } else {
                        c1122180fJA = new C1122180fJA(pcsApi, null);
                    }
                    if (enumC1142580fq4 == EnumC1142580fq4.AUDIENCE_LIVE) {
                        c1122170fJ9 = new C1122170fJ9(pcsApi, str, strLIZJ, null);
                    }
                    c1142280fpa = new C1142280fpa(interfaceC497601wk, c1122180fJA, c1122170fJ9);
                    map.put(strLIZIZ, c1142280fpa);
                    C09AE c09ae = (C09AE) interfaceC497601wk.getCoroutineContext().get(C09AE.LJJLJ);
                    if (c09ae != null) {
                        c09ae.LJII(new C1142600fq6(strLIZIZ));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c1142280fpa;
    }
}
