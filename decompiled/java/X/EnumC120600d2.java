package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00d2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC120600d2 {
    public static final EnumC120600d2 FAVORITE;
    public static final /* synthetic */ EnumC120600d2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC120600d2 NOT_FAVORITE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC120600d2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC120600d2 enumC120600d2 = new EnumC120600d2("FAVORITE", 0, 1);
        FAVORITE = enumC120600d2;
        EnumC120600d2 enumC120600d22 = new EnumC120600d2("NOT_FAVORITE", 1, 2);
        NOT_FAVORITE = enumC120600d22;
        EnumC120600d2[] enumC120600d2Arr = {enumC120600d2, enumC120600d22};
        LLILLJJLI = enumC120600d2Arr;
        LLILLL = new C2254308sP(enumC120600d2Arr);
    }

    public static EnumC120600d2[] values() {
        return (EnumC120600d2[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static EnumC120600d2 valueOf(String str) {
        return (EnumC120600d2) C08FF.LIZ(EnumC120600d2.class, str);
    }

    public EnumC120600d2(String str, int i, int i2) {
        this.LL = i2;
    }
}
