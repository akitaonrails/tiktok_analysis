package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vwn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1761790vwn {
    public static final /* synthetic */ EnumC1761790vwn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1761790vwn PHOTO;
    public static final EnumC1761790vwn PHOTO_INFO;
    public static final EnumC1761790vwn VIDEO;
    public static final EnumC1761790vwn VIDEO_V2;

    public static InterfaceC2044707zh<EnumC1761790vwn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1761790vwn enumC1761790vwn = new EnumC1761790vwn("PHOTO", 0);
        PHOTO = enumC1761790vwn;
        EnumC1761790vwn enumC1761790vwn2 = new EnumC1761790vwn("PHOTO_INFO", 1);
        PHOTO_INFO = enumC1761790vwn2;
        EnumC1761790vwn enumC1761790vwn3 = new EnumC1761790vwn("VIDEO", 2);
        VIDEO = enumC1761790vwn3;
        EnumC1761790vwn enumC1761790vwn4 = new EnumC1761790vwn("VIDEO_V2", 3);
        VIDEO_V2 = enumC1761790vwn4;
        EnumC1761790vwn[] enumC1761790vwnArr = {enumC1761790vwn, enumC1761790vwn2, enumC1761790vwn3, enumC1761790vwn4};
        LL = enumC1761790vwnArr;
        LLILLJJLI = new C2254308sP(enumC1761790vwnArr);
    }

    public static EnumC1761790vwn[] values() {
        return (EnumC1761790vwn[]) LL.clone();
    }

    public static EnumC1761790vwn valueOf(String str) {
        return (EnumC1761790vwn) C08FF.LIZ(EnumC1761790vwn.class, str);
    }

    public EnumC1761790vwn(String str, int i) {
    }
}
