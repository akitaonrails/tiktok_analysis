package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D1q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC332480D1q implements Serializable {
    public static final EnumC332480D1q API;
    public static final EnumC332480D1q ENTRY;
    public static final /* synthetic */ EnumC332480D1q[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC332480D1q> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC332480D1q enumC332480D1q = new EnumC332480D1q("ENTRY", 0);
        ENTRY = enumC332480D1q;
        EnumC332480D1q enumC332480D1q2 = new EnumC332480D1q("API", 1);
        API = enumC332480D1q2;
        EnumC332480D1q[] enumC332480D1qArr = {enumC332480D1q, enumC332480D1q2};
        LL = enumC332480D1qArr;
        LLILLJJLI = new C2254308sP(enumC332480D1qArr);
    }

    public static EnumC332480D1q[] values() {
        return (EnumC332480D1q[]) LL.clone();
    }

    public static EnumC332480D1q valueOf(String str) {
        return (EnumC332480D1q) C08FF.LIZ(EnumC332480D1q.class, str);
    }

    public EnumC332480D1q(String str, int i) {
    }
}
