package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00jb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C161300jb {
    public static final String LIZ(InterfaceC211600ri interfaceC211600ri) {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(interfaceC211600ri.getSessionIdStr(), new String[]{"/"}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() > 2 && ((CharSequence) ListProtector.get(listLJJLIIIJILLIZJL, 2)).length() > 0) {
            return (String) ListProtector.get(listLJJLIIIJILLIZJL, 2);
        }
        return "";
    }

    public static final int LIZIZ(InterfaceC211600ri interfaceC211600ri) {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(interfaceC211600ri.getSessionIdStr(), new String[]{"/"}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() > 3 && ((CharSequence) ListProtector.get(listLJJLIIIJILLIZJL, 3)).length() > 0) {
            try {
                int i = CastIntegerProtector.parseInt((String) listLJJLIIIJILLIZJL.get(3));
                if (i < 0) {
                    return Integer.MAX_VALUE;
                }
                return i;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return Integer.MAX_VALUE;
    }

    public static final boolean LIZJ(InterfaceC211600ri interfaceC211600ri) {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(interfaceC211600ri.getSessionIdStr(), new String[]{"/"}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() > 1) {
            try {
                return C00RM.LIZ.contains(Integer.valueOf(CastIntegerProtector.parseInt((String) listLJJLIIIJILLIZJL.get(1))));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return false;
    }
}
