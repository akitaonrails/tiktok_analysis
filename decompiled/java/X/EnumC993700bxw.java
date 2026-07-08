package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993700bxw {
    public static final EnumC993700bxw CATEGORY;
    public static final /* synthetic */ EnumC993700bxw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993700bxw REGION;

    public static InterfaceC2044707zh<EnumC993700bxw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993700bxw enumC993700bxw = new EnumC993700bxw("REGION", 0);
        REGION = enumC993700bxw;
        EnumC993700bxw enumC993700bxw2 = new EnumC993700bxw("CATEGORY", 1);
        CATEGORY = enumC993700bxw2;
        EnumC993700bxw[] enumC993700bxwArr = {enumC993700bxw, enumC993700bxw2};
        LL = enumC993700bxwArr;
        LLILLJJLI = new C2254308sP(enumC993700bxwArr);
    }

    public static EnumC993700bxw[] values() {
        return (EnumC993700bxw[]) LL.clone();
    }

    public static EnumC993700bxw valueOf(String str) {
        return (EnumC993700bxw) C08FF.LIZ(EnumC993700bxw.class, str);
    }

    public EnumC993700bxw(String str, int i) {
    }
}
