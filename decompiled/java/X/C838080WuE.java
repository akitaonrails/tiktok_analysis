package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0WuE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838080WuE {
    public static Object LIZ(C825940Wae c825940Wae, Function1 function1) {
        C838040WuA c838040WuACheck;
        C837750Wth c837750Wth = new C837750Wth(c825940Wae, function1);
        InterfaceC838120WuI interfaceC838120WuI = C838100WuG.LIZ;
        InterfaceC838160WuM interfaceC838160WuM = C837980Wu4.LIZ;
        if (interfaceC838160WuM != null) {
            interfaceC838160WuM.LIZ(c825940Wae);
        }
        InterfaceC838120WuI interfaceC838120WuI2 = C838100WuG.LIZ;
        if (interfaceC838120WuI2 != null) {
            c838040WuACheck = interfaceC838120WuI2.check(c825940Wae, c837750Wth);
            if (c838040WuACheck != null) {
                return c838040WuACheck.LIZJ;
            }
        } else {
            c838040WuACheck = null;
        }
        return c837750Wth.invoke(c838040WuACheck);
    }
}
