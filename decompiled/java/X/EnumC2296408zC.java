package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08zC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2296408zC {
    public static final /* synthetic */ EnumC2296408zC[] LL;

    static {
        EnumC2296408zC[] enumC2296408zCArr = {new EnumC2296408zC("INIT", 0), new EnumC2296408zC("LOADING", 1), new EnumC2296408zC("SUCCESS", 2), new EnumC2296408zC("FAILED", 3)};
        LL = enumC2296408zCArr;
        new C2254308sP(enumC2296408zCArr);
    }

    public static EnumC2296408zC[] values() {
        return (EnumC2296408zC[]) LL.clone();
    }

    public static EnumC2296408zC valueOf(String str) {
        return (EnumC2296408zC) C08FF.LIZ(EnumC2296408zC.class, str);
    }

    public EnumC2296408zC(String str, int i) {
    }
}
