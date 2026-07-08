package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CwM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC329800CwM {
    public static final /* synthetic */ EnumC329800CwM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC329800CwM NEXT;
    public static final EnumC329800CwM PREV;
    public static final EnumC329800CwM REFRESH;

    public static InterfaceC2044707zh<EnumC329800CwM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC329800CwM enumC329800CwM = new EnumC329800CwM("REFRESH", 0);
        REFRESH = enumC329800CwM;
        EnumC329800CwM enumC329800CwM2 = new EnumC329800CwM("NEXT", 1);
        NEXT = enumC329800CwM2;
        EnumC329800CwM enumC329800CwM3 = new EnumC329800CwM("PREV", 2);
        PREV = enumC329800CwM3;
        EnumC329800CwM[] enumC329800CwMArr = {enumC329800CwM, enumC329800CwM2, enumC329800CwM3};
        LL = enumC329800CwMArr;
        LLILLJJLI = new C2254308sP(enumC329800CwMArr);
    }

    public static EnumC329800CwM[] values() {
        return (EnumC329800CwM[]) LL.clone();
    }

    public static EnumC329800CwM valueOf(String str) {
        return (EnumC329800CwM) C08FF.LIZ(EnumC329800CwM.class, str);
    }

    public EnumC329800CwM(String str, int i) {
    }
}
