package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0GsA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429120GsA {
    public static final /* synthetic */ EnumC429120GsA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC429120GsA PERMISSION_REQUEST;
    public static final EnumC429120GsA TURN_ON_REQUEST;

    public static InterfaceC2044707zh<EnumC429120GsA> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429120GsA enumC429120GsA = new EnumC429120GsA("PERMISSION_REQUEST", 0);
        PERMISSION_REQUEST = enumC429120GsA;
        EnumC429120GsA enumC429120GsA2 = new EnumC429120GsA("TURN_ON_REQUEST", 1);
        TURN_ON_REQUEST = enumC429120GsA2;
        EnumC429120GsA[] enumC429120GsAArr = {enumC429120GsA, enumC429120GsA2};
        LL = enumC429120GsAArr;
        LLILLJJLI = new C2254308sP(enumC429120GsAArr);
    }

    public static EnumC429120GsA[] values() {
        return (EnumC429120GsA[]) LL.clone();
    }

    public static EnumC429120GsA valueOf(String str) {
        return (EnumC429120GsA) C08FF.LIZ(EnumC429120GsA.class, str);
    }

    public EnumC429120GsA(String str, int i) {
    }
}
