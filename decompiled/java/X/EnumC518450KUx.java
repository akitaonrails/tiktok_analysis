package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KUx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC518450KUx {
    public static final /* synthetic */ EnumC518450KUx[] LL;

    static {
        EnumC518450KUx[] enumC518450KUxArr = {new EnumC518450KUx("LIKE", 0), new EnumC518450KUx("COMMENT", 1)};
        LL = enumC518450KUxArr;
        new C2254308sP(enumC518450KUxArr);
    }

    public static EnumC518450KUx[] values() {
        return (EnumC518450KUx[]) LL.clone();
    }

    public static EnumC518450KUx valueOf(String str) {
        return (EnumC518450KUx) C08FF.LIZ(EnumC518450KUx.class, str);
    }

    public EnumC518450KUx(String str, int i) {
    }
}
