package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08zE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2296608zE {
    public static final /* synthetic */ EnumC2296608zE[] LL;

    static {
        EnumC2296608zE[] enumC2296608zEArr = {new EnumC2296608zE("INIT", 0), new EnumC2296608zE("LOADING", 1), new EnumC2296608zE("SUCCESS", 2), new EnumC2296608zE("FAILED", 3)};
        LL = enumC2296608zEArr;
        new C2254308sP(enumC2296608zEArr);
    }

    public static EnumC2296608zE[] values() {
        return (EnumC2296608zE[]) LL.clone();
    }

    public static EnumC2296608zE valueOf(String str) {
        return (EnumC2296608zE) C08FF.LIZ(EnumC2296608zE.class, str);
    }

    public EnumC2296608zE(String str, int i) {
    }
}
