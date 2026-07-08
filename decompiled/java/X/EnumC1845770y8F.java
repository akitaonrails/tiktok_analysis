package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0y8F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1845770y8F {
    public static final EnumC1845770y8F BACK;
    public static final EnumC1845770y8F DONE;
    public static final /* synthetic */ EnumC1845770y8F[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1845770y8F UNLINK;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1845770y8F> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1845770y8F enumC1845770y8F = new EnumC1845770y8F("BACK", 0, "back");
        BACK = enumC1845770y8F;
        EnumC1845770y8F enumC1845770y8F2 = new EnumC1845770y8F("DONE", 1, "done");
        DONE = enumC1845770y8F2;
        EnumC1845770y8F enumC1845770y8F3 = new EnumC1845770y8F("UNLINK", 2, "unlink");
        UNLINK = enumC1845770y8F3;
        EnumC1845770y8F[] enumC1845770y8FArr = {enumC1845770y8F, enumC1845770y8F2, enumC1845770y8F3};
        LLILLJJLI = enumC1845770y8FArr;
        LLILLL = new C2254308sP(enumC1845770y8FArr);
    }

    public static EnumC1845770y8F[] values() {
        return (EnumC1845770y8F[]) LLILLJJLI.clone();
    }

    public final String getReason() {
        return this.LL;
    }

    public static EnumC1845770y8F valueOf(String str) {
        return (EnumC1845770y8F) C08FF.LIZ(EnumC1845770y8F.class, str);
    }

    public EnumC1845770y8F(String str, int i, String str2) {
        this.LL = str2;
    }
}
