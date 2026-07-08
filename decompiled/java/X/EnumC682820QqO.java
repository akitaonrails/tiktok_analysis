package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QqO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC682820QqO {
    public static final EnumC682820QqO HIDDEN;
    public static final /* synthetic */ EnumC682820QqO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC682820QqO NOT_SHOWED;
    public static final EnumC682820QqO SHOWING;

    public static InterfaceC2044707zh<EnumC682820QqO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC682820QqO enumC682820QqO = new EnumC682820QqO("NOT_SHOWED", 0);
        NOT_SHOWED = enumC682820QqO;
        EnumC682820QqO enumC682820QqO2 = new EnumC682820QqO("SHOWING", 1);
        SHOWING = enumC682820QqO2;
        EnumC682820QqO enumC682820QqO3 = new EnumC682820QqO("HIDDEN", 2);
        HIDDEN = enumC682820QqO3;
        EnumC682820QqO[] enumC682820QqOArr = {enumC682820QqO, enumC682820QqO2, enumC682820QqO3};
        LL = enumC682820QqOArr;
        LLILLJJLI = new C2254308sP(enumC682820QqOArr);
    }

    public static EnumC682820QqO[] values() {
        return (EnumC682820QqO[]) LL.clone();
    }

    public static EnumC682820QqO valueOf(String str) {
        return (EnumC682820QqO) C08FF.LIZ(EnumC682820QqO.class, str);
    }

    public EnumC682820QqO(String str, int i) {
    }
}
