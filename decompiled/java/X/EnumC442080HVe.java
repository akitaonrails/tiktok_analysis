package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HVe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC442080HVe {
    public static final /* synthetic */ EnumC442080HVe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC442080HVe PHOTO;
    public static final EnumC442080HVe TAKE_PHOTO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC442080HVe> getEntries() {
        return LLILLL;
    }

    static {
        EnumC442080HVe enumC442080HVe = new EnumC442080HVe("TAKE_PHOTO", 0, "take_photo");
        TAKE_PHOTO = enumC442080HVe;
        EnumC442080HVe enumC442080HVe2 = new EnumC442080HVe("PHOTO", 1, "photo");
        PHOTO = enumC442080HVe2;
        EnumC442080HVe[] enumC442080HVeArr = {enumC442080HVe, enumC442080HVe2};
        LLILLJJLI = enumC442080HVeArr;
        LLILLL = new C2254308sP(enumC442080HVeArr);
    }

    public static EnumC442080HVe[] values() {
        return (EnumC442080HVe[]) LLILLJJLI.clone();
    }

    public final String getItemName() {
        return this.LL;
    }

    public static EnumC442080HVe valueOf(String str) {
        return (EnumC442080HVe) C08FF.LIZ(EnumC442080HVe.class, str);
    }

    public EnumC442080HVe(String str, int i, String str2) {
        this.LL = str2;
    }
}
