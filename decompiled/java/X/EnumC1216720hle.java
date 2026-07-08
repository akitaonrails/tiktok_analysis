package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hle, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1216720hle {
    public static final EnumC1216720hle ALLOW;
    public static final EnumC1216720hle BLOCK;
    public static final /* synthetic */ EnumC1216720hle[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1216720hle> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1216720hle enumC1216720hle = new EnumC1216720hle("ALLOW", 0);
        ALLOW = enumC1216720hle;
        EnumC1216720hle enumC1216720hle2 = new EnumC1216720hle("BLOCK", 1);
        BLOCK = enumC1216720hle2;
        EnumC1216720hle[] enumC1216720hleArr = {enumC1216720hle, enumC1216720hle2};
        LL = enumC1216720hleArr;
        LLILLJJLI = new C2254308sP(enumC1216720hleArr);
    }

    public static EnumC1216720hle[] values() {
        return (EnumC1216720hle[]) LL.clone();
    }

    public static EnumC1216720hle valueOf(String str) {
        return (EnumC1216720hle) C08FF.LIZ(EnumC1216720hle.class, str);
    }

    public EnumC1216720hle(String str, int i) {
    }
}
