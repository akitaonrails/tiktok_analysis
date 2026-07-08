package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08zB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2296308zB {
    public static final /* synthetic */ EnumC2296308zB[] LL;

    static {
        EnumC2296308zB[] enumC2296308zBArr = {new EnumC2296308zB("INIT", 0), new EnumC2296308zB("SUCCESS", 1), new EnumC2296308zB("FAILED", 2), new EnumC2296308zB("ERROR", 3)};
        LL = enumC2296308zBArr;
        new C2254308sP(enumC2296308zBArr);
    }

    public static EnumC2296308zB[] values() {
        return (EnumC2296308zB[]) LL.clone();
    }

    public static EnumC2296308zB valueOf(String str) {
        return (EnumC2296308zB) C08FF.LIZ(EnumC2296308zB.class, str);
    }

    public EnumC2296308zB(String str, int i) {
    }
}
