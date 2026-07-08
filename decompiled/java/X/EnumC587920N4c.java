package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N4c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC587920N4c {
    public static final EnumC587920N4c DIRECTLY_AUTH;
    public static final /* synthetic */ EnumC587920N4c[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC587920N4c ONLY_AUTH;
    public static final EnumC587920N4c PRE_SAVE_ALBUM_H5;
    public static final EnumC587920N4c SELECT_DSP_SHEET;

    public static InterfaceC2044707zh<EnumC587920N4c> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC587920N4c enumC587920N4c = new EnumC587920N4c("SELECT_DSP_SHEET", 0);
        SELECT_DSP_SHEET = enumC587920N4c;
        EnumC587920N4c enumC587920N4c2 = new EnumC587920N4c("DIRECTLY_AUTH", 1);
        DIRECTLY_AUTH = enumC587920N4c2;
        EnumC587920N4c enumC587920N4c3 = new EnumC587920N4c("ONLY_AUTH", 2);
        ONLY_AUTH = enumC587920N4c3;
        EnumC587920N4c enumC587920N4c4 = new EnumC587920N4c("PRE_SAVE_ALBUM_H5", 3);
        PRE_SAVE_ALBUM_H5 = enumC587920N4c4;
        EnumC587920N4c[] enumC587920N4cArr = {enumC587920N4c, enumC587920N4c2, enumC587920N4c3, enumC587920N4c4};
        LL = enumC587920N4cArr;
        LLILLJJLI = new C2254308sP(enumC587920N4cArr);
    }

    public static EnumC587920N4c[] values() {
        return (EnumC587920N4c[]) LL.clone();
    }

    public static EnumC587920N4c valueOf(String str) {
        return (EnumC587920N4c) C08FF.LIZ(EnumC587920N4c.class, str);
    }

    public EnumC587920N4c(String str, int i) {
    }
}
