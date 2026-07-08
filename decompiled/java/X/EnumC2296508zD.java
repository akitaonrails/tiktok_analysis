package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08zD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2296508zD {
    public static final /* synthetic */ EnumC2296508zD[] LL;

    static {
        EnumC2296508zD[] enumC2296508zDArr = {new EnumC2296508zD("INIT", 0), new EnumC2296508zD("LOADING", 1), new EnumC2296508zD("SUCCESS", 2), new EnumC2296508zD("FAILED", 3)};
        LL = enumC2296508zDArr;
        new C2254308sP(enumC2296508zDArr);
    }

    public static EnumC2296508zD[] values() {
        return (EnumC2296508zD[]) LL.clone();
    }

    public static EnumC2296508zD valueOf(String str) {
        return (EnumC2296508zD) C08FF.LIZ(EnumC2296508zD.class, str);
    }

    public EnumC2296508zD(String str, int i) {
    }
}
