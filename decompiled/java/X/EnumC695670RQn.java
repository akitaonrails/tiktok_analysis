package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RQn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC695670RQn {
    public static final EnumC695670RQn FIRST_UI_FRAME;
    public static final EnumC695670RQn FIRST_VIDEO_FORBID;
    public static final EnumC695670RQn FIRST_VIDEO_HAS_LEFT;
    public static final EnumC695670RQn FIRST_VIDEO_SHOW;
    public static final /* synthetic */ EnumC695670RQn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC695670RQn NEVER_EXECUTE;
    public static final EnumC695670RQn NEVER_LAZY;
    public static final EnumC695670RQn SECOND_VIDEO_HAS_LEFT;
    public static final EnumC695670RQn SPLIT_TO_FRAME;
    public static final EnumC695670RQn START_UP_END;
    public final int LL;

    public static InterfaceC2044707zh<EnumC695670RQn> getEntries() {
        return LLILLL;
    }

    static {
        EnumC695670RQn enumC695670RQn = new EnumC695670RQn("NEVER_LAZY", 0, 0);
        NEVER_LAZY = enumC695670RQn;
        EnumC695670RQn enumC695670RQn2 = new EnumC695670RQn("NEVER_EXECUTE", 1, 1);
        NEVER_EXECUTE = enumC695670RQn2;
        EnumC695670RQn enumC695670RQn3 = new EnumC695670RQn("FIRST_UI_FRAME", 2, 2);
        FIRST_UI_FRAME = enumC695670RQn3;
        EnumC695670RQn enumC695670RQn4 = new EnumC695670RQn("FIRST_VIDEO_SHOW", 3, 3);
        FIRST_VIDEO_SHOW = enumC695670RQn4;
        EnumC695670RQn enumC695670RQn5 = new EnumC695670RQn("FIRST_VIDEO_FORBID", 4, 4);
        FIRST_VIDEO_FORBID = enumC695670RQn5;
        EnumC695670RQn enumC695670RQn6 = new EnumC695670RQn("SPLIT_TO_FRAME", 5, 5);
        SPLIT_TO_FRAME = enumC695670RQn6;
        EnumC695670RQn enumC695670RQn7 = new EnumC695670RQn("FIRST_VIDEO_HAS_LEFT", 6, 6);
        FIRST_VIDEO_HAS_LEFT = enumC695670RQn7;
        EnumC695670RQn enumC695670RQn8 = new EnumC695670RQn("SECOND_VIDEO_HAS_LEFT", 7, 7);
        SECOND_VIDEO_HAS_LEFT = enumC695670RQn8;
        EnumC695670RQn enumC695670RQn9 = new EnumC695670RQn("START_UP_END", 8, 8);
        START_UP_END = enumC695670RQn9;
        EnumC695670RQn[] enumC695670RQnArr = {enumC695670RQn, enumC695670RQn2, enumC695670RQn3, enumC695670RQn4, enumC695670RQn5, enumC695670RQn6, enumC695670RQn7, enumC695670RQn8, enumC695670RQn9};
        LLILLJJLI = enumC695670RQnArr;
        LLILLL = new C2254308sP(enumC695670RQnArr);
    }

    public static EnumC695670RQn[] values() {
        return (EnumC695670RQn[]) LLILLJJLI.clone();
    }

    public final int getMode() {
        return this.LL;
    }

    public static EnumC695670RQn valueOf(String str) {
        return (EnumC695670RQn) C08FF.LIZ(EnumC695670RQn.class, str);
    }

    public EnumC695670RQn(String str, int i, int i2) {
        this.LL = i2;
    }
}
