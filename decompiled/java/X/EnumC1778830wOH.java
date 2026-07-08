package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wOH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778830wOH {
    public static final EnumC1778830wOH ALBUM;
    public static final EnumC1778830wOH IMAGE_COLLECTION;
    public static final /* synthetic */ EnumC1778830wOH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1778830wOH VIDEO_COVER;

    public static InterfaceC2044707zh<EnumC1778830wOH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778830wOH enumC1778830wOH = new EnumC1778830wOH("ALBUM", 0);
        ALBUM = enumC1778830wOH;
        EnumC1778830wOH enumC1778830wOH2 = new EnumC1778830wOH("IMAGE_COLLECTION", 1);
        IMAGE_COLLECTION = enumC1778830wOH2;
        EnumC1778830wOH enumC1778830wOH3 = new EnumC1778830wOH("VIDEO_COVER", 2);
        VIDEO_COVER = enumC1778830wOH3;
        EnumC1778830wOH[] enumC1778830wOHArr = {enumC1778830wOH, enumC1778830wOH2, enumC1778830wOH3};
        LL = enumC1778830wOHArr;
        LLILLJJLI = new C2254308sP(enumC1778830wOHArr);
    }

    public static EnumC1778830wOH[] values() {
        return (EnumC1778830wOH[]) LL.clone();
    }

    public static EnumC1778830wOH valueOf(String str) {
        return (EnumC1778830wOH) C08FF.LIZ(EnumC1778830wOH.class, str);
    }

    public EnumC1778830wOH(String str, int i) {
    }
}
