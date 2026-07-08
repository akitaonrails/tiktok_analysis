package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0QmI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C680280QmI {
    public static final void LIZ(TemplateData templateData, List<String> list) {
        String strLJJLIIIJ;
        Object aBParamsValue;
        if (list != null && (strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62)) != null) {
            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
            C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
            if (c1538050q7v != null) {
                aBParamsValue = c1538050q7v.getABParamsValue(strLJJLIIIJ);
            } else {
                aBParamsValue = null;
            }
            templateData.LJIILIIL("abParams", aBParamsValue);
        }
    }

    public static final void LIZIZ(TemplateData templateData, List<String> list, InterfaceC665370Q7z interfaceC665370Q7z) {
        Map<String, Object> mapG5;
        if (list != null) {
            for (String str : list) {
                try {
                    Object obj = null;
                    ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null);
                    if (iTakoContextAbility != null && (mapG5 = iTakoContextAbility.G5()) != null) {
                        obj = mapG5.get(str);
                    }
                    templateData.LJIILIIL(str, obj);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
    }
}
