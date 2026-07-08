package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZqV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC912210ZqV implements InterfaceC1673306gt {
    public static final EnumC912210ZqV EMOJI_VIEW_TO_SELF_MESSAGE;
    public static final EnumC912210ZqV LAST_IN_SEQ_TO_SELF;
    public static final /* synthetic */ EnumC912210ZqV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC912210ZqV NEW_INLINE_TO_NORMAL;
    public static final EnumC912210ZqV NEW_LAST_IN_SEQ_TO_NORMAL;
    public static final EnumC912210ZqV NEW_NORMAL_TO_QUOTED;
    public static final EnumC912210ZqV NORMAL_TO_INLINE;
    public static final EnumC912210ZqV NORMAL_TO_NORMAL;
    public static final EnumC912210ZqV NO_PADDING;
    public static final EnumC912210ZqV SPACING_DIFFERENT_USER;
    public static final EnumC912210ZqV SPACING_INLINE_NORMAL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC912210ZqV> getEntries() {
        return LLILLL;
    }

    static {
        EnumC912210ZqV enumC912210ZqV = new EnumC912210ZqV("NORMAL_TO_INLINE", 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        NORMAL_TO_INLINE = enumC912210ZqV;
        EnumC912210ZqV enumC912210ZqV2 = new EnumC912210ZqV("NORMAL_TO_NORMAL", 1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        NORMAL_TO_NORMAL = enumC912210ZqV2;
        EnumC912210ZqV enumC912210ZqV3 = new EnumC912210ZqV("LAST_IN_SEQ_TO_SELF", 2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        LAST_IN_SEQ_TO_SELF = enumC912210ZqV3;
        EnumC912210ZqV enumC912210ZqV4 = new EnumC912210ZqV("EMOJI_VIEW_TO_SELF_MESSAGE", 3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        EMOJI_VIEW_TO_SELF_MESSAGE = enumC912210ZqV4;
        EnumC912210ZqV enumC912210ZqV5 = new EnumC912210ZqV("NO_PADDING", 4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        NO_PADDING = enumC912210ZqV5;
        EnumC912210ZqV enumC912210ZqV6 = new EnumC912210ZqV("NEW_INLINE_TO_NORMAL", 5, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        NEW_INLINE_TO_NORMAL = enumC912210ZqV6;
        EnumC912210ZqV enumC912210ZqV7 = new EnumC912210ZqV("NEW_NORMAL_TO_QUOTED", 6, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        NEW_NORMAL_TO_QUOTED = enumC912210ZqV7;
        EnumC912210ZqV enumC912210ZqV8 = new EnumC912210ZqV("NEW_LAST_IN_SEQ_TO_NORMAL", 7, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        NEW_LAST_IN_SEQ_TO_NORMAL = enumC912210ZqV8;
        EnumC912210ZqV enumC912210ZqV9 = new EnumC912210ZqV("SPACING_DIFFERENT_USER", 8, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        SPACING_DIFFERENT_USER = enumC912210ZqV9;
        EnumC912210ZqV enumC912210ZqV10 = new EnumC912210ZqV("SPACING_INLINE_NORMAL", 9, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        SPACING_INLINE_NORMAL = enumC912210ZqV10;
        EnumC912210ZqV[] enumC912210ZqVArr = {enumC912210ZqV, enumC912210ZqV2, enumC912210ZqV3, enumC912210ZqV4, enumC912210ZqV5, enumC912210ZqV6, enumC912210ZqV7, enumC912210ZqV8, enumC912210ZqV9, enumC912210ZqV10};
        LLILLJJLI = enumC912210ZqVArr;
        LLILLL = new C2254308sP(enumC912210ZqVArr);
    }

    public static EnumC912210ZqV[] values() {
        return (EnumC912210ZqV[]) LLILLJJLI.clone();
    }

    @Override // X.InterfaceC1673306gt
    public int getPaddingDp() {
        return this.LL;
    }

    public static EnumC912210ZqV valueOf(String str) {
        return (EnumC912210ZqV) C08FF.LIZ(EnumC912210ZqV.class, str);
    }

    public EnumC912210ZqV(String str, int i, int i2) {
        this.LL = i2;
    }
}
