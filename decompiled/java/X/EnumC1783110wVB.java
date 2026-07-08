package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wVB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1783110wVB {
    public static final EnumC1783110wVB CREATOR_OTHERS_ONLY;
    public static final EnumC1783110wVB CREATOR_REVAMP;
    public static final EnumC1783110wVB FRIENDS_REVAMP;
    public static final /* synthetic */ EnumC1783110wVB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1783110wVB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1783110wVB enumC1783110wVB = new EnumC1783110wVB("FRIENDS_REVAMP", 0);
        FRIENDS_REVAMP = enumC1783110wVB;
        EnumC1783110wVB enumC1783110wVB2 = new EnumC1783110wVB("CREATOR_REVAMP", 1);
        CREATOR_REVAMP = enumC1783110wVB2;
        EnumC1783110wVB enumC1783110wVB3 = new EnumC1783110wVB("CREATOR_OTHERS_ONLY", 2);
        CREATOR_OTHERS_ONLY = enumC1783110wVB3;
        EnumC1783110wVB[] enumC1783110wVBArr = {enumC1783110wVB, enumC1783110wVB2, enumC1783110wVB3};
        LL = enumC1783110wVBArr;
        LLILLJJLI = new C2254308sP(enumC1783110wVBArr);
    }

    public static EnumC1783110wVB[] values() {
        return (EnumC1783110wVB[]) LL.clone();
    }

    public static EnumC1783110wVB valueOf(String str) {
        return (EnumC1783110wVB) C08FF.LIZ(EnumC1783110wVB.class, str);
    }

    public EnumC1783110wVB(String str, int i) {
    }
}
