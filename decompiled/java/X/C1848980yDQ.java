package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yDQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1848980yDQ extends C2217421BqW implements Function0<Unit> {
    public C1848980yDQ(C1849040yDW c1849040yDW) {
        super(0, c1849040yDW, C1849040yDW.class, "migrateKevaToFs", "migrateKevaToFs()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object c098200Yq;
        String strLJFF;
        C1849040yDW c1849040yDW = (C1849040yDW) this.receiver;
        c1849040yDW.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : c1849040yDW.LJ.getAll().keySet()) {
            if (!u.LJJIIJZLJL(str, "\u0001__amg_storage__:", false)) {
                String string = c1849040yDW.LJ.getString(str, null);
                if (string != null) {
                    try {
                        c098200Yq = new JSONObject(string);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    JSONObject jSONObject = (JSONObject) c098200Yq;
                    if (jSONObject != null) {
                        int iOptInt = jSONObject.optInt("t", -1);
                        String strOptString = jSONObject.isNull("v") ? null : jSONObject.optString("v", null);
                        switch (iOptInt) {
                            case 0:
                                strLJFF = C1849040yDW.LJFF(1, "");
                                break;
                            case 1:
                                if (strOptString == null) {
                                    strOptString = "";
                                }
                                strLJFF = C1849040yDW.LJFF(2, strOptString);
                                break;
                            case 2:
                                if (strOptString == null) {
                                    strOptString = CardStruct.IStatusCode.DEFAULT;
                                }
                                strLJFF = C1849040yDW.LJFF(3, strOptString);
                                break;
                            case 3:
                                strLJFF = C1849040yDW.LJFF(4, Intrinsics.LJFF(strOptString, "1") ? "true" : "false");
                                break;
                            case 4:
                                if (strOptString == null) {
                                    strOptString = "{}";
                                }
                                strLJFF = C1849040yDW.LJFF(5, strOptString);
                                break;
                            case 5:
                                if (strOptString == null) {
                                    strOptString = "[]";
                                }
                                strLJFF = C1849040yDW.LJFF(6, strOptString);
                                break;
                            case 6:
                                if (strOptString == null) {
                                    strOptString = CardStruct.IStatusCode.DEFAULT;
                                }
                                strLJFF = C1849040yDW.LJFF(3, strOptString);
                                break;
                            case 7:
                                if (strOptString == null) {
                                    strOptString = "NaN";
                                }
                                strLJFF = C1849040yDW.LJFF(3, strOptString);
                                break;
                            default:
                                C1849000yDS.LIZ.getClass();
                                strLJFF = (String) C1849000yDS.LIZIZ(string).getFirst();
                                break;
                        }
                    } else {
                        C1849000yDS.LIZ.getClass();
                        strLJFF = (String) C1849000yDS.LIZIZ(string).getFirst();
                    }
                    linkedHashMap.put(str, new Pair(strLJFF, C1849040yDW.LJIIIZ(strLJFF)));
                }
            }
        }
        String str2 = c1849040yDW.LIZJ;
        c1849040yDW.LIZIZ.LJIJJ(a0.LJJZZIII('/', str2, str2), true);
        c1849040yDW.LIZIZ.LJIL(c1849040yDW.LIZJ, GsonProtectorUtils.toJson(C1848990yDR.LIZ, linkedHashMap));
        return Unit.LIZ;
    }
}
