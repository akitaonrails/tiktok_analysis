package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03qg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C969603qg {
    public static EnumC969503qf LIZ(int i, String str) {
        for (EnumC969503qf enumC969503qf : EnumC969503qf.values()) {
            if (Intrinsics.LJFF(enumC969503qf.getPage(), str) && enumC969503qf.getTemplate() == i) {
                return enumC969503qf;
            }
        }
        return EnumC969503qf.DEFAULT;
    }

    public static C987903td LIZIZ(int i, String str, String str2) {
        return new C987903td(str2, LIZ(i, str).getEcMarket());
    }
}
