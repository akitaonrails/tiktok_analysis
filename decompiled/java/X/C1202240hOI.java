package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.trigger.PdpTriggerModel;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: X.0hOI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1202240hOI {
    public static final List<PdpTriggerModel> LIZ(Object obj) {
        Object c098200Yq;
        Type type;
        Type type2;
        Type type3;
        Object obj2 = null;
        try {
            boolean z = true;
            if (obj instanceof String) {
                String str = (String) obj;
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) {
                        z = false;
                    }
                    if (!z) {
                        type3 = new TypeToken<List<? extends PdpTriggerModel>>() { // from class: X.0hOK
                        }.getType();
                    } else {
                        C13JX c13jx = KTypeProjection.LIZJ;
                        C13JW c13jwLJII = C13LE.LJII(PdpTriggerModel.class);
                        c13jx.getClass();
                        type3 = C2371409Qy.LIZJ(C13LE.LJIIIIZZ(List.class, C13JX.LIZ(c13jwLJII)));
                    }
                    Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(str, type3);
                    if (!(objLJIIIIZZ instanceof List)) {
                        objLJIIIIZZ = null;
                    }
                    c098200Yq = (List) objLJIIIIZZ;
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } else if (obj instanceof k) {
                k kVar = (k) obj;
                try {
                    Gson gsonLJFF2 = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ2 == null || !c1121904a9LIZIZ2.LJII) {
                        z = false;
                    }
                    if (!z) {
                        type2 = new TypeToken<List<? extends PdpTriggerModel>>() { // from class: X.0hOJ
                        }.getType();
                    } else {
                        C13JX c13jx2 = KTypeProjection.LIZJ;
                        C13JW c13jwLJII2 = C13LE.LJII(PdpTriggerModel.class);
                        c13jx2.getClass();
                        type2 = C2371409Qy.LIZJ(C13LE.LJIIIIZZ(List.class, C13JX.LIZ(c13jwLJII2)));
                    }
                    Object objLIZLLL = gsonLJFF2.LIZLLL(kVar, type2);
                    if (!(objLIZLLL instanceof List)) {
                        objLIZLLL = null;
                    }
                    c098200Yq = (List) objLIZLLL;
                } catch (s e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } else {
                String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(obj);
                try {
                    Gson gsonLJFF3 = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ3 = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ3 == null || !c1121904a9LIZIZ3.LJII) {
                        z = false;
                    }
                    if (!z) {
                        type = new TypeToken<List<? extends PdpTriggerModel>>() { // from class: X.0hOL
                        }.getType();
                    } else {
                        C13JX c13jx3 = KTypeProjection.LIZJ;
                        C13JW c13jwLJII3 = C13LE.LJII(PdpTriggerModel.class);
                        c13jx3.getClass();
                        type = C2371409Qy.LIZJ(C13LE.LJIIIIZZ(List.class, C13JX.LIZ(c13jwLJII3)));
                    }
                    Object objLJIIIIZZ2 = gsonLJFF3.LJIIIIZZ(strLJIIIIZZ, type);
                    if (!(objLJIIIIZZ2 instanceof List)) {
                        objLJIIIIZZ2 = null;
                    }
                    c098200Yq = (List) objLJIIIIZZ2;
                } catch (s e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        return (List) obj2;
    }
}
