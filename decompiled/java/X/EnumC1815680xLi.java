package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0xLi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1815680xLi {
    public static final EnumC1815680xLi GENERAL;
    public static final /* synthetic */ EnumC1815680xLi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1815680xLi MULTI_GUEST;

    public static InterfaceC2044707zh<EnumC1815680xLi> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1815680xLi enumC1815680xLi = new EnumC1815680xLi("GENERAL", 0);
        GENERAL = enumC1815680xLi;
        EnumC1815680xLi enumC1815680xLi2 = new EnumC1815680xLi("MULTI_GUEST", 1);
        MULTI_GUEST = enumC1815680xLi2;
        EnumC1815680xLi[] enumC1815680xLiArr = {enumC1815680xLi, enumC1815680xLi2};
        LL = enumC1815680xLiArr;
        LLILLJJLI = new C2254308sP(enumC1815680xLiArr);
    }

    public static EnumC1815680xLi[] values() {
        return (EnumC1815680xLi[]) LL.clone();
    }

    public static EnumC1815680xLi valueOf(String str) {
        return (EnumC1815680xLi) C08FF.LIZ(EnumC1815680xLi.class, str);
    }

    public EnumC1815680xLi(String str, int i) {
    }
}
