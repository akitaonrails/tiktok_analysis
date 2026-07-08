package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CGj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC310830CGj {
    public static final /* synthetic */ EnumC310830CGj[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC310830CGj MESSAGE_CLOSE_IMAGE;
    public static final EnumC310830CGj MESSAGE_OPEN_IMAGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC310830CGj> getEntries() {
        return LLILLL;
    }

    static {
        EnumC310830CGj enumC310830CGj = new EnumC310830CGj("MESSAGE_CLOSE_IMAGE", 0, "/others/message_close_image");
        MESSAGE_CLOSE_IMAGE = enumC310830CGj;
        EnumC310830CGj enumC310830CGj2 = new EnumC310830CGj("MESSAGE_OPEN_IMAGE", 1, "/others/message_open_image");
        MESSAGE_OPEN_IMAGE = enumC310830CGj2;
        EnumC310830CGj[] enumC310830CGjArr = {enumC310830CGj, enumC310830CGj2};
        LLILLJJLI = enumC310830CGjArr;
        LLILLL = new C2254308sP(enumC310830CGjArr);
    }

    public static EnumC310830CGj[] values() {
        return (EnumC310830CGj[]) LLILLJJLI.clone();
    }

    public final String getPath() {
        return this.LL;
    }

    public static EnumC310830CGj valueOf(String str) {
        return (EnumC310830CGj) C08FF.LIZ(EnumC310830CGj.class, str);
    }

    public EnumC310830CGj(String str, int i, String str2) {
        this.LL = str2;
    }
}
