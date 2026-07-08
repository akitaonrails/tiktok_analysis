package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0DUP, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DUP {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str, boolean z) {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(a0.LJJZ(str, e3.d, str), new String[]{"/"}, 0, 6);
        if (!listLJJLIIIJILLIZJL.isEmpty()) {
            if (z) {
                Object it2 = new C13EL(listLJJLIIIJILLIZJL).iterator();
                while (true) {
                    C13EM c13em = (C13EM) it2;
                    if (!c13em.hasNext()) {
                        break;
                    }
                    String str2 = (String) c13em.next();
                    if (!Intrinsics.LJFF(str2, "index") && !Intrinsics.LJFF(str2, "template")) {
                        return str2;
                    }
                }
            } else {
                return (String) C13LP.LJJLIIIJJI(listLJJLIIIJILLIZJL);
            }
        }
        return null;
    }
}
