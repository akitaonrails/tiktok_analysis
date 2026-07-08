package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10pJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19363910pJ {
    public static final /* synthetic */ EnumC19363910pJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19363910pJ MULTI_PHOTO;
    public static final EnumC19363910pJ SINGLE_PHOTO;

    public static InterfaceC2044707zh<EnumC19363910pJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19363910pJ enumC19363910pJ = new EnumC19363910pJ("SINGLE_PHOTO", 0);
        SINGLE_PHOTO = enumC19363910pJ;
        EnumC19363910pJ enumC19363910pJ2 = new EnumC19363910pJ("MULTI_PHOTO", 1);
        MULTI_PHOTO = enumC19363910pJ2;
        EnumC19363910pJ[] enumC19363910pJArr = {enumC19363910pJ, enumC19363910pJ2};
        LL = enumC19363910pJArr;
        LLILLJJLI = new C2254308sP(enumC19363910pJArr);
    }

    public static EnumC19363910pJ[] values() {
        return (EnumC19363910pJ[]) LL.clone();
    }

    public static EnumC19363910pJ valueOf(String str) {
        return (EnumC19363910pJ) C08FF.LIZ(EnumC19363910pJ.class, str);
    }

    public EnumC19363910pJ(String str, int i) {
    }
}
