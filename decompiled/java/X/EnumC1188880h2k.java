package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0h2k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1188880h2k {
    public static final EnumC1188880h2k COMMENT_ANCHOR;
    public static final /* synthetic */ EnumC1188880h2k[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1188880h2k VIDEO_ANCHOR;

    public static InterfaceC2044707zh<EnumC1188880h2k> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1188880h2k enumC1188880h2k = new EnumC1188880h2k("VIDEO_ANCHOR", 0);
        VIDEO_ANCHOR = enumC1188880h2k;
        EnumC1188880h2k enumC1188880h2k2 = new EnumC1188880h2k("COMMENT_ANCHOR", 1);
        COMMENT_ANCHOR = enumC1188880h2k2;
        EnumC1188880h2k[] enumC1188880h2kArr = {enumC1188880h2k, enumC1188880h2k2};
        LL = enumC1188880h2kArr;
        LLILLJJLI = new C2254308sP(enumC1188880h2kArr);
    }

    public static EnumC1188880h2k[] values() {
        return (EnumC1188880h2k[]) LL.clone();
    }

    public static EnumC1188880h2k valueOf(String str) {
        return (EnumC1188880h2k) C08FF.LIZ(EnumC1188880h2k.class, str);
    }

    public EnumC1188880h2k(String str, int i) {
    }
}
