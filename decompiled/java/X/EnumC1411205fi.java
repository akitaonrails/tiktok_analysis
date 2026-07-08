package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05fi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1411205fi {
    public static final /* synthetic */ EnumC1411205fi[] LL;

    static {
        EnumC1411205fi[] enumC1411205fiArr = {new EnumC1411205fi("INIT", 0), new EnumC1411205fi("LOADING", 1), new EnumC1411205fi("FAIL", 2), new EnumC1411205fi("SUCCESS", 3)};
        LL = enumC1411205fiArr;
        new C2254308sP(enumC1411205fiArr);
    }

    public static EnumC1411205fi[] values() {
        return (EnumC1411205fi[]) LL.clone();
    }

    public static EnumC1411205fi valueOf(String str) {
        return (EnumC1411205fi) C08FF.LIZ(EnumC1411205fi.class, str);
    }

    public EnumC1411205fi(String str, int i) {
    }
}
