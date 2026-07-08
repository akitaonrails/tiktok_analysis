package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993290bxH {
    public static final EnumC993290bxH HAS_REC_DIALOG;
    public static final /* synthetic */ EnumC993290bxH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993290bxH NO_REC_DIALOG;

    public static InterfaceC2044707zh<EnumC993290bxH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993290bxH enumC993290bxH = new EnumC993290bxH("NO_REC_DIALOG", 0);
        NO_REC_DIALOG = enumC993290bxH;
        EnumC993290bxH enumC993290bxH2 = new EnumC993290bxH("HAS_REC_DIALOG", 1);
        HAS_REC_DIALOG = enumC993290bxH2;
        EnumC993290bxH[] enumC993290bxHArr = {enumC993290bxH, enumC993290bxH2};
        LL = enumC993290bxHArr;
        LLILLJJLI = new C2254308sP(enumC993290bxHArr);
    }

    public static EnumC993290bxH[] values() {
        return (EnumC993290bxH[]) LL.clone();
    }

    public static EnumC993290bxH valueOf(String str) {
        return (EnumC993290bxH) C08FF.LIZ(EnumC993290bxH.class, str);
    }

    public EnumC993290bxH(String str, int i) {
    }
}
