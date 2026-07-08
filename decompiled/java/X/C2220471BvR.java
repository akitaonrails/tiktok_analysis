package X;

import Y.AObjectS89S0101000_34;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BvR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220471BvR extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220471BvR(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "writeFile", "writeFile(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        Object c098200Yq;
        byte[] bArrLJIIJ;
        JSONObject jSONObject2 = jSONObject;
        int iIntValue = num.intValue();
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        Pair pairLJIILL = C2220331BvD.LJIILL(c2220331BvD, jSONObject2);
        boolean zBooleanValue = ((Boolean) pairLJIILL.getFirst()).booleanValue();
        String str = (String) pairLJIILL.getSecond();
        if (!zBooleanValue) {
            return c2220331BvD.LJIIJJI(EnumC2221121BwU.INVALID_ARG, iIntValue);
        }
        if (u.LJIIZILJ(a0.LJLIIIL(str).toString(), "/", false)) {
            return c2220331BvD.LJIIJJI(EnumC2221121BwU.IS_DIR, iIntValue);
        }
        if (!jSONObject2.has("data")) {
            return c2220331BvD.LJIIJJI(EnumC2221121BwU.INVALID_ARG, iIntValue);
        }
        String strOptString = jSONObject2.optString("encoding", "utf8");
        if (!c2220331BvD.LJIJI(strOptString)) {
            return c2220331BvD.LJIIJJI(EnumC2221121BwU.INVALID_ARG, iIntValue);
        }
        String strLJIJJ = C2220331BvD.LJIJJ(strOptString);
        Object objOpt = jSONObject2.opt("data");
        if (Intrinsics.LJFF(jSONObject2.optString("dataType", "string").toLowerCase(Locale.ROOT), "arraybuffer")) {
            String strLJ = C2220331BvD.LJ(objOpt);
            if (strLJ == null) {
                return c2220331BvD.LJIIJJI(EnumC2221121BwU.ARRAYBUFFER_NOT_EXIST, iIntValue);
            }
            bArrLJIIJ = C2220331BvD.LJIIJ(strLJ);
            if (bArrLJIIJ == null) {
                return c2220331BvD.LJIIJJI(EnumC2221121BwU.ARRAYBUFFER_NOT_EXIST, iIntValue);
            }
        } else {
            String strLJ2 = C2220331BvD.LJ(objOpt);
            if (strLJ2 == null) {
                return c2220331BvD.LJIIJJI(EnumC2221121BwU.INVALID_ARG, iIntValue);
            }
            if (Intrinsics.LJFF(strLJIJJ, "base64")) {
                bArrLJIIJ = C2220331BvD.LJIIJ(strLJ2);
                if (bArrLJIIJ == null) {
                    return c2220331BvD.LJIIJJI(EnumC2221121BwU.ARRAYBUFFER_NOT_EXIST, iIntValue);
                }
            } else {
                try {
                    c098200Yq = C2220331BvD.LJIIIIZZ(strLJ2, strLJIJJ);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
                    bArrLJIIJ = (byte[]) c098200Yq;
                } else {
                    return c2220331BvD.LJIIJJI(EnumC2221121BwU.ARRAYBUFFER_NOT_EXIST, iIntValue);
                }
            }
        }
        if (bArrLJIIJ.length == 0) {
            return c2220331BvD.LJIIJJI(EnumC2221121BwU.DATA_EMPTY, iIntValue);
        }
        c2220331BvD.LIZ.LIZ.LJJJJL(str, bArrLJIIJ, jSONObject2.optBoolean("append", false), new AObjectS89S0101000_34(c2220331BvD, iIntValue, 0));
        return C2220181Buy.LJ;
    }
}
