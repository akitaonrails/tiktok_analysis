package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07gE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1924007gE {
    public static C1924107gF LIZ(String str) {
        if (str == null) {
            return null;
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"|"}, 0, 6);
        C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS547S0100000_3(listLJJLIIIJILLIZJL, (List<? extends Effect>) 125));
        try {
            int size = listLJJLIIIJILLIZJL.size();
            if (size == 0) {
                return null;
            }
            if (size != 1) {
                if (size != 2) {
                    List list = (List) c01gwLIZ.getValue();
                    return new C1924107gF(CastIntegerProtector.parseInt((String) listLJJLIIIJILLIZJL.get(2)), CastLongProtector.parseLong((String) listLJJLIIIJILLIZJL.get(1)), list);
                }
                return new C1924107gF(0, CastLongProtector.parseLong((String) listLJJLIIIJILLIZJL.get(1)), (List) c01gwLIZ.getValue());
            }
            return new C1924107gF(0, 0L, (List) c01gwLIZ.getValue());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
