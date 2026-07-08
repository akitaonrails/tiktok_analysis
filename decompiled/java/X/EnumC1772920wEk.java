package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wEk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1772920wEk {
    public static final EnumC1772920wEk ADD_NEW;
    public static final /* synthetic */ EnumC1772920wEk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1772920wEk REMOVE_AND_ADD_LAST;
    public static final EnumC1772920wEk REPLACE_IN_PLACE;

    public static InterfaceC2044707zh<EnumC1772920wEk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1772920wEk enumC1772920wEk = new EnumC1772920wEk("REMOVE_AND_ADD_LAST", 0);
        REMOVE_AND_ADD_LAST = enumC1772920wEk;
        EnumC1772920wEk enumC1772920wEk2 = new EnumC1772920wEk("REPLACE_IN_PLACE", 1);
        REPLACE_IN_PLACE = enumC1772920wEk2;
        EnumC1772920wEk enumC1772920wEk3 = new EnumC1772920wEk("ADD_NEW", 2);
        ADD_NEW = enumC1772920wEk3;
        EnumC1772920wEk[] enumC1772920wEkArr = {enumC1772920wEk, enumC1772920wEk2, enumC1772920wEk3};
        LL = enumC1772920wEkArr;
        LLILLJJLI = new C2254308sP(enumC1772920wEkArr);
    }

    public static EnumC1772920wEk[] values() {
        return (EnumC1772920wEk[]) LL.clone();
    }

    public static EnumC1772920wEk valueOf(String str) {
        return (EnumC1772920wEk) C08FF.LIZ(EnumC1772920wEk.class, str);
    }

    public EnumC1772920wEk(String str, int i) {
    }
}
