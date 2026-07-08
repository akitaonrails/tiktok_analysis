package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dR3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1050190dR3 {
    public static final EnumC1050190dR3 DONE;
    public static final /* synthetic */ EnumC1050190dR3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1050190dR3 NOT_FOUND;
    public static final EnumC1050190dR3 PROCEED;

    public static InterfaceC2044707zh<EnumC1050190dR3> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1050190dR3 enumC1050190dR3 = new EnumC1050190dR3("DONE", 0);
        DONE = enumC1050190dR3;
        EnumC1050190dR3 enumC1050190dR32 = new EnumC1050190dR3("NOT_FOUND", 1);
        NOT_FOUND = enumC1050190dR32;
        EnumC1050190dR3 enumC1050190dR33 = new EnumC1050190dR3("PROCEED", 2);
        PROCEED = enumC1050190dR33;
        EnumC1050190dR3[] enumC1050190dR3Arr = {enumC1050190dR3, enumC1050190dR32, enumC1050190dR33};
        LL = enumC1050190dR3Arr;
        LLILLJJLI = new C2254308sP(enumC1050190dR3Arr);
    }

    public static EnumC1050190dR3[] values() {
        return (EnumC1050190dR3[]) LL.clone();
    }

    public static EnumC1050190dR3 valueOf(String str) {
        return (EnumC1050190dR3) C08FF.LIZ(EnumC1050190dR3.class, str);
    }

    public EnumC1050190dR3(String str, int i) {
    }
}
