package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0xKy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1815220xKy {
    public static final /* synthetic */ EnumC1815220xKy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1815220xKy LOAD_LATEST_RESULT;
    public static final EnumC1815220xKy LOAD_MORE_RESULT;
    public static final EnumC1815220xKy REFRESH_RESULT;

    public static InterfaceC2044707zh<EnumC1815220xKy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1815220xKy enumC1815220xKy = new EnumC1815220xKy("REFRESH_RESULT", 0);
        REFRESH_RESULT = enumC1815220xKy;
        EnumC1815220xKy enumC1815220xKy2 = new EnumC1815220xKy("LOAD_MORE_RESULT", 1);
        LOAD_MORE_RESULT = enumC1815220xKy2;
        EnumC1815220xKy enumC1815220xKy3 = new EnumC1815220xKy("LOAD_LATEST_RESULT", 2);
        LOAD_LATEST_RESULT = enumC1815220xKy3;
        EnumC1815220xKy[] enumC1815220xKyArr = {enumC1815220xKy, enumC1815220xKy2, enumC1815220xKy3};
        LL = enumC1815220xKyArr;
        LLILLJJLI = new C2254308sP(enumC1815220xKyArr);
    }

    public static EnumC1815220xKy[] values() {
        return (EnumC1815220xKy[]) LL.clone();
    }

    public static EnumC1815220xKy valueOf(String str) {
        return (EnumC1815220xKy) C08FF.LIZ(EnumC1815220xKy.class, str);
    }

    public EnumC1815220xKy(String str, int i) {
    }
}
