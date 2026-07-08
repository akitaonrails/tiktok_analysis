package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZrJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC912710ZrJ {
    public static final EnumC912710ZrJ HIDDEN;
    public static final /* synthetic */ EnumC912710ZrJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC912710ZrJ VISIBLE;

    public static InterfaceC2044707zh<EnumC912710ZrJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC912710ZrJ enumC912710ZrJ = new EnumC912710ZrJ("VISIBLE", 0);
        VISIBLE = enumC912710ZrJ;
        EnumC912710ZrJ enumC912710ZrJ2 = new EnumC912710ZrJ("HIDDEN", 1);
        HIDDEN = enumC912710ZrJ2;
        EnumC912710ZrJ[] enumC912710ZrJArr = {enumC912710ZrJ, enumC912710ZrJ2};
        LL = enumC912710ZrJArr;
        LLILLJJLI = new C2254308sP(enumC912710ZrJArr);
    }

    public static EnumC912710ZrJ[] values() {
        return (EnumC912710ZrJ[]) LL.clone();
    }

    public static EnumC912710ZrJ valueOf(String str) {
        return (EnumC912710ZrJ) C08FF.LIZ(EnumC912710ZrJ.class, str);
    }

    public EnumC912710ZrJ(String str, int i) {
    }
}
