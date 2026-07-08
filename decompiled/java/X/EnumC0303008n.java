package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0303008n {
    public static final /* synthetic */ EnumC0303008n[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC0303008n STICKER_SET;
    public static final EnumC0303008n VIDEO_STICKER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC0303008n> getEntries() {
        return LLILLL;
    }

    static {
        EnumC0303008n enumC0303008n = new EnumC0303008n("STICKER_SET", 0, 0);
        STICKER_SET = enumC0303008n;
        EnumC0303008n enumC0303008n2 = new EnumC0303008n("VIDEO_STICKER", 1, 1);
        VIDEO_STICKER = enumC0303008n2;
        EnumC0303008n[] enumC0303008nArr = {enumC0303008n, enumC0303008n2};
        LLILLJJLI = enumC0303008nArr;
        LLILLL = new C2254308sP(enumC0303008nArr);
    }

    public static EnumC0303008n[] values() {
        return (EnumC0303008n[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC0303008n valueOf(String str) {
        return (EnumC0303008n) C08FF.LIZ(EnumC0303008n.class, str);
    }

    public EnumC0303008n(String str, int i, int i2) {
        this.LL = i2;
    }
}
