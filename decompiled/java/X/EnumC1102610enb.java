package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0enb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1102610enb {
    public static final EnumC1102610enb LL;
    public static final EnumC1102610enb LLILLJJLI;
    public static final /* synthetic */ EnumC1102610enb[] LLILLL;

    static {
        EnumC1102610enb enumC1102610enb = new EnumC1102610enb("ATTACH", 0);
        LL = enumC1102610enb;
        EnumC1102610enb enumC1102610enb2 = new EnumC1102610enb("DETACH", 1);
        LLILLJJLI = enumC1102610enb2;
        EnumC1102610enb[] enumC1102610enbArr = {enumC1102610enb, enumC1102610enb2};
        LLILLL = enumC1102610enbArr;
        new C2254308sP(enumC1102610enbArr);
    }

    public static EnumC1102610enb[] values() {
        return (EnumC1102610enb[]) LLILLL.clone();
    }

    public static EnumC1102610enb valueOf(String str) {
        return (EnumC1102610enb) C08FF.LIZ(EnumC1102610enb.class, str);
    }

    public EnumC1102610enb(String str, int i) {
    }
}
