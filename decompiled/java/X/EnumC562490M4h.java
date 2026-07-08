package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M4h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC562490M4h {
    public static final EnumC562490M4h GIF2STICKER;
    public static final EnumC562490M4h LIVE_PHOTO;
    public static final /* synthetic */ EnumC562490M4h[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC562490M4h LOCAL_VIDEO;
    public static final EnumC562490M4h PHOTO2STICKER;
    public static final EnumC562490M4h VIDEO2STICKER;

    public static InterfaceC2044707zh<EnumC562490M4h> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC562490M4h enumC562490M4h = new EnumC562490M4h("PHOTO2STICKER", 0);
        PHOTO2STICKER = enumC562490M4h;
        EnumC562490M4h enumC562490M4h2 = new EnumC562490M4h("GIF2STICKER", 1);
        GIF2STICKER = enumC562490M4h2;
        EnumC562490M4h enumC562490M4h3 = new EnumC562490M4h("VIDEO2STICKER", 2);
        VIDEO2STICKER = enumC562490M4h3;
        EnumC562490M4h enumC562490M4h4 = new EnumC562490M4h("LIVE_PHOTO", 3);
        LIVE_PHOTO = enumC562490M4h4;
        EnumC562490M4h enumC562490M4h5 = new EnumC562490M4h("LOCAL_VIDEO", 4);
        LOCAL_VIDEO = enumC562490M4h5;
        EnumC562490M4h[] enumC562490M4hArr = {enumC562490M4h, enumC562490M4h2, enumC562490M4h3, enumC562490M4h4, enumC562490M4h5};
        LL = enumC562490M4hArr;
        LLILLJJLI = new C2254308sP(enumC562490M4hArr);
    }

    public static EnumC562490M4h[] values() {
        return (EnumC562490M4h[]) LL.clone();
    }

    public static EnumC562490M4h valueOf(String str) {
        return (EnumC562490M4h) C08FF.LIZ(EnumC562490M4h.class, str);
    }

    public EnumC562490M4h(String str, int i) {
    }
}
