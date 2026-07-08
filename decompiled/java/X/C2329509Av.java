package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.09Av, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2329509Av {
    public static final C2329509Av LIZ = new C2329509Av();
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("Building sandcastles", "Exploring new cities", "Playing with kids", "Dancing in clubs", "Going on a camping trip");
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(302));

    public static List LIZIZ(String str) throws Throwable {
        String strLJI;
        List listLIZJ;
        String strLIZIZ = C08F1.LIZIZ(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) LIZJ.getValue());
        sbLIZ.append('/');
        sbLIZ.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        try {
            strLJI = C09BH.LJI(new C0VSJ(strLIZIZ2), Charsets.UTF_8);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            strLJI = "";
        }
        try {
            listLIZJ = JsonParseUtils.LIZJ(String.class, strLJI);
        } catch (C2329809Ay e2) {
            TryCatchGuardChecker.doCheck(e2);
            listLIZJ = C13BV.INSTANCE;
        } catch (RuntimeException e3) {
            TryCatchGuardChecker.doCheck(e3);
            listLIZJ = C13BV.INSTANCE;
        }
        if (listLIZJ.isEmpty()) {
            try {
                new C0VSJ(strLIZIZ2).delete();
            } catch (IOException e4) {
                TryCatchGuardChecker.doCheck(e4);
            } catch (IllegalArgumentException e5) {
                TryCatchGuardChecker.doCheck(e5);
            } catch (NullPointerException e6) {
                TryCatchGuardChecker.doCheck(e6);
            } catch (SecurityException e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            return LIZIZ;
        }
        return listLIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.AwS617S0100000_3] */
    /* JADX WARN: Type inference failed for: r10v1, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r10v2, types: [kotlin.jvm.functions.Function2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(android.content.Context r8, java.lang.String r9, kotlin.jvm.internal.AwS617S0100000_3 r10, X.InterfaceC1364105Vn r11) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2329509Av.LIZ(android.content.Context, java.lang.String, kotlin.jvm.internal.AwS617S0100000_3, X.05Vn):java.lang.Object");
    }
}
