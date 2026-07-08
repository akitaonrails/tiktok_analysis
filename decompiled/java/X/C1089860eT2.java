package X;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0eT2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1089860eT2<T> {
    public final InterfaceC1936307iD<T> LIZ;
    public final C0KY6 LIZIZ;

    public C1089860eT2(InterfaceC1936307iD<T> interfaceC1936307iD, C0KY6 c0ky6) {
        this.LIZ = interfaceC1936307iD;
        this.LIZIZ = c0ky6;
    }

    public final T LIZ(String str, String str2) {
        if (u.LJJIIJZLJL(str, e3.c, false)) {
            String strSubstring = str.substring(1);
            if (Intrinsics.LJFF(strSubstring, "none") || !Intrinsics.LJFF(strSubstring, "server") || str2 == null) {
                return null;
            }
            return this.LIZ.parse(String.valueOf(this.LIZIZ.LIZ(str2, EnumC467180ITs.SERVER_DECISION_GROUP.getGroupName(), "default")));
        }
        return this.LIZ.parse(str);
    }
}
