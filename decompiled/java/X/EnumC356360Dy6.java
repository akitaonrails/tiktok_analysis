package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dy6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356360Dy6 {
    public static final EnumC356360Dy6 COLLECTION_EFFECT;
    public static final EnumC356360Dy6 COMPOSER;
    public static final EnumC356360Dy6 H5;
    public static final /* synthetic */ EnumC356360Dy6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC356360Dy6 NORMAL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC356360Dy6> getEntries() {
        return LLILLL;
    }

    static {
        EnumC356360Dy6 enumC356360Dy6 = new EnumC356360Dy6("NORMAL", 0, 0);
        NORMAL = enumC356360Dy6;
        EnumC356360Dy6 enumC356360Dy62 = new EnumC356360Dy6("COLLECTION_EFFECT", 1, 1);
        COLLECTION_EFFECT = enumC356360Dy62;
        EnumC356360Dy6 enumC356360Dy63 = new EnumC356360Dy6("H5", 2, 2);
        H5 = enumC356360Dy63;
        EnumC356360Dy6 enumC356360Dy64 = new EnumC356360Dy6("COMPOSER", 3, 3);
        COMPOSER = enumC356360Dy64;
        EnumC356360Dy6[] enumC356360Dy6Arr = {enumC356360Dy6, enumC356360Dy62, enumC356360Dy63, enumC356360Dy64};
        LLILLJJLI = enumC356360Dy6Arr;
        LLILLL = new C2254308sP(enumC356360Dy6Arr);
    }

    public static EnumC356360Dy6[] values() {
        return (EnumC356360Dy6[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC356360Dy6 valueOf(String str) {
        return (EnumC356360Dy6) C08FF.LIZ(EnumC356360Dy6.class, str);
    }

    public EnumC356360Dy6(String str, int i, int i2) {
        this.LL = i2;
    }
}
