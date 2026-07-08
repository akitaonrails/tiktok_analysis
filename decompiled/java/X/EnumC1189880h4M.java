package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0h4M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1189880h4M {
    public static final EnumC1189880h4M AUTO;
    public static final EnumC1189880h4M DOUBLE;
    public static final /* synthetic */ EnumC1189880h4M[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1189880h4M SINGLE;

    public static InterfaceC2044707zh<EnumC1189880h4M> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1189880h4M enumC1189880h4M = new EnumC1189880h4M("AUTO", 0);
        AUTO = enumC1189880h4M;
        EnumC1189880h4M enumC1189880h4M2 = new EnumC1189880h4M("SINGLE", 1);
        SINGLE = enumC1189880h4M2;
        EnumC1189880h4M enumC1189880h4M3 = new EnumC1189880h4M("DOUBLE", 2);
        DOUBLE = enumC1189880h4M3;
        EnumC1189880h4M[] enumC1189880h4MArr = {enumC1189880h4M, enumC1189880h4M2, enumC1189880h4M3};
        LL = enumC1189880h4MArr;
        LLILLJJLI = new C2254308sP(enumC1189880h4MArr);
    }

    public static EnumC1189880h4M[] values() {
        return (EnumC1189880h4M[]) LL.clone();
    }

    public static EnumC1189880h4M valueOf(String str) {
        return (EnumC1189880h4M) C08FF.LIZ(EnumC1189880h4M.class, str);
    }

    public EnumC1189880h4M(String str, int i) {
    }
}
