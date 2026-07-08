package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fhb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1137330fhb {
    public static final EnumC1137330fhb COMBO;
    public static final EnumC1137330fhb ENTER;
    public static final EnumC1137330fhb EXIT;
    public static final EnumC1137330fhb FIRST;
    public static final /* synthetic */ EnumC1137330fhb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1137330fhb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1137330fhb enumC1137330fhb = new EnumC1137330fhb("ENTER", 0);
        ENTER = enumC1137330fhb;
        EnumC1137330fhb enumC1137330fhb2 = new EnumC1137330fhb("COMBO", 1);
        COMBO = enumC1137330fhb2;
        EnumC1137330fhb enumC1137330fhb3 = new EnumC1137330fhb("EXIT", 2);
        EXIT = enumC1137330fhb3;
        EnumC1137330fhb enumC1137330fhb4 = new EnumC1137330fhb("FIRST", 3);
        FIRST = enumC1137330fhb4;
        EnumC1137330fhb[] enumC1137330fhbArr = {enumC1137330fhb, enumC1137330fhb2, enumC1137330fhb3, enumC1137330fhb4};
        LL = enumC1137330fhbArr;
        LLILLJJLI = new C2254308sP(enumC1137330fhbArr);
    }

    public static EnumC1137330fhb[] values() {
        return (EnumC1137330fhb[]) LL.clone();
    }

    public static EnumC1137330fhb valueOf(String str) {
        return (EnumC1137330fhb) C08FF.LIZ(EnumC1137330fhb.class, str);
    }

    public EnumC1137330fhb(String str, int i) {
    }
}
