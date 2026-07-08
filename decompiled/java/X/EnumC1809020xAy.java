package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0xAy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1809020xAy {
    public static final /* synthetic */ EnumC1809020xAy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1809020xAy PAGE_HISTORY;
    public static final EnumC1809020xAy PAGE_INIT;
    public static final EnumC1809020xAy PAGE_SUG;

    public static InterfaceC2044707zh<EnumC1809020xAy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1809020xAy enumC1809020xAy = new EnumC1809020xAy("PAGE_INIT", 0);
        PAGE_INIT = enumC1809020xAy;
        EnumC1809020xAy enumC1809020xAy2 = new EnumC1809020xAy("PAGE_SUG", 1);
        PAGE_SUG = enumC1809020xAy2;
        EnumC1809020xAy enumC1809020xAy3 = new EnumC1809020xAy("PAGE_HISTORY", 2);
        PAGE_HISTORY = enumC1809020xAy3;
        EnumC1809020xAy[] enumC1809020xAyArr = {enumC1809020xAy, enumC1809020xAy2, enumC1809020xAy3};
        LL = enumC1809020xAyArr;
        LLILLJJLI = new C2254308sP(enumC1809020xAyArr);
    }

    public static EnumC1809020xAy[] values() {
        return (EnumC1809020xAy[]) LL.clone();
    }

    public static EnumC1809020xAy valueOf(String str) {
        return (EnumC1809020xAy) C08FF.LIZ(EnumC1809020xAy.class, str);
    }

    public EnumC1809020xAy(String str, int i) {
    }
}
