package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EAk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC360240EAk {
    public static final /* synthetic */ EnumC360240EAk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC360240EAk PRIMARY;
    public static final EnumC360240EAk SECONDARY;

    public static InterfaceC2044707zh<EnumC360240EAk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC360240EAk enumC360240EAk = new EnumC360240EAk("PRIMARY", 0);
        PRIMARY = enumC360240EAk;
        EnumC360240EAk enumC360240EAk2 = new EnumC360240EAk("SECONDARY", 1);
        SECONDARY = enumC360240EAk2;
        EnumC360240EAk[] enumC360240EAkArr = {enumC360240EAk, enumC360240EAk2};
        LL = enumC360240EAkArr;
        LLILLJJLI = new C2254308sP(enumC360240EAkArr);
    }

    public static EnumC360240EAk[] values() {
        return (EnumC360240EAk[]) LL.clone();
    }

    public static EnumC360240EAk valueOf(String str) {
        return (EnumC360240EAk) C08FF.LIZ(EnumC360240EAk.class, str);
    }

    public EnumC360240EAk(String str, int i) {
    }
}
