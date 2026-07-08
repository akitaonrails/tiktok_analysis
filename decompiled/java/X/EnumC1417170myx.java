package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0myx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1417170myx {
    public static final /* synthetic */ EnumC1417170myx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1417170myx NOT_APPLYING_TEMPLATE;
    public static final EnumC1417170myx PHOTO_MODE_NONE;
    public static final EnumC1417170myx SLIDE_SHOW;
    public static final EnumC1417170myx VIDEO_TEMPLATE;

    @C040H
    public final int LL;

    public static InterfaceC2044707zh<EnumC1417170myx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1417170myx enumC1417170myx = new EnumC1417170myx("PHOTO_MODE_NONE", 0, -2);
        PHOTO_MODE_NONE = enumC1417170myx;
        EnumC1417170myx enumC1417170myx2 = new EnumC1417170myx("SLIDE_SHOW", 1, -3);
        SLIDE_SHOW = enumC1417170myx2;
        EnumC1417170myx enumC1417170myx3 = new EnumC1417170myx("NOT_APPLYING_TEMPLATE", 2, -1);
        NOT_APPLYING_TEMPLATE = enumC1417170myx3;
        EnumC1417170myx enumC1417170myx4 = new EnumC1417170myx("VIDEO_TEMPLATE", 3, 0);
        VIDEO_TEMPLATE = enumC1417170myx4;
        EnumC1417170myx[] enumC1417170myxArr = {enumC1417170myx, enumC1417170myx2, enumC1417170myx3, enumC1417170myx4};
        LLILLJJLI = enumC1417170myxArr;
        LLILLL = new C2254308sP(enumC1417170myxArr);
    }

    public static EnumC1417170myx[] values() {
        return (EnumC1417170myx[]) LLILLJJLI.clone();
    }

    public final int getIndex() {
        return this.LL;
    }

    public static EnumC1417170myx valueOf(String str) {
        return (EnumC1417170myx) C08FF.LIZ(EnumC1417170myx.class, str);
    }

    public EnumC1417170myx(String str, int i, int i2) {
        this.LL = i2;
    }
}
