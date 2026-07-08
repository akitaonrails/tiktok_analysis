package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tcw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1672600tcw {
    public static final EnumC1672600tcw LL;
    public static final EnumC1672600tcw LLILLJJLI;
    public static final EnumC1672600tcw LLILLL;
    public static final /* synthetic */ EnumC1672600tcw[] LLILZ;

    static {
        EnumC1672600tcw enumC1672600tcw = new EnumC1672600tcw("TEXT", 0);
        LL = enumC1672600tcw;
        EnumC1672600tcw enumC1672600tcw2 = new EnumC1672600tcw("TEXT_RESERVED", 1);
        LLILLJJLI = enumC1672600tcw2;
        EnumC1672600tcw enumC1672600tcw3 = new EnumC1672600tcw("ICON", 2);
        LLILLL = enumC1672600tcw3;
        EnumC1672600tcw[] enumC1672600tcwArr = {enumC1672600tcw, enumC1672600tcw2, enumC1672600tcw3};
        LLILZ = enumC1672600tcwArr;
        new C2254308sP(enumC1672600tcwArr);
    }

    public static EnumC1672600tcw[] values() {
        return (EnumC1672600tcw[]) LLILZ.clone();
    }

    public static EnumC1672600tcw valueOf(String str) {
        return (EnumC1672600tcw) C08FF.LIZ(EnumC1672600tcw.class, str);
    }

    public EnumC1672600tcw(String str, int i) {
    }
}
