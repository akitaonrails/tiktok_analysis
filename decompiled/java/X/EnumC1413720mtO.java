package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mtO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1413720mtO {
    public static final EnumC1413720mtO EXPANDED_SELECT_FIRST;
    public static final EnumC1413720mtO EXPANDED_SELECT_NONE;
    public static final /* synthetic */ EnumC1413720mtO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1413720mtO NOT_EXPANDED;

    public static InterfaceC2044707zh<EnumC1413720mtO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1413720mtO enumC1413720mtO = new EnumC1413720mtO("NOT_EXPANDED", 0);
        NOT_EXPANDED = enumC1413720mtO;
        EnumC1413720mtO enumC1413720mtO2 = new EnumC1413720mtO("EXPANDED_SELECT_FIRST", 1);
        EXPANDED_SELECT_FIRST = enumC1413720mtO2;
        EnumC1413720mtO enumC1413720mtO3 = new EnumC1413720mtO("EXPANDED_SELECT_NONE", 2);
        EXPANDED_SELECT_NONE = enumC1413720mtO3;
        EnumC1413720mtO[] enumC1413720mtOArr = {enumC1413720mtO, enumC1413720mtO2, enumC1413720mtO3};
        LL = enumC1413720mtOArr;
        LLILLJJLI = new C2254308sP(enumC1413720mtOArr);
    }

    public static EnumC1413720mtO[] values() {
        return (EnumC1413720mtO[]) LL.clone();
    }

    public static EnumC1413720mtO valueOf(String str) {
        return (EnumC1413720mtO) C08FF.LIZ(EnumC1413720mtO.class, str);
    }

    public EnumC1413720mtO(String str, int i) {
    }
}
