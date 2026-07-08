package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.00qr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C206300qr {
    public static final /* synthetic */ int LIZ = 0;

    public static C443120HZe LIZ(String str) {
        int i = 0;
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
        try {
            String str2 = (String) C13LP.LJJJLL(listLJJLIIIJILLIZJL);
            if (str2 != null) {
                i = CastIntegerProtector.parseInt(str2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL);
        Object obj = "";
        if (objLJJJLZIJ == null) {
            objLJJJLZIJ = "";
        }
        Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(2, listLJJLIIIJILLIZJL);
        if (objLJJJLZIJ2 != null) {
            obj = objLJJJLZIJ2;
        }
        return new C443120HZe(Integer.valueOf(i), objLJJJLZIJ, obj);
    }
}
