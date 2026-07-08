package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0l1B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1341670l1B {
    public static final EnumC1341670l1B LIKE_COMMENT;
    public static final /* synthetic */ EnumC1341670l1B[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1341670l1B LONG_PRESS_COMMENT;
    public static final EnumC1341670l1B SCROLL;
    public static final EnumC1341670l1B SHOW_KEYBOARD;
    public static final EnumC1341670l1B VIEW_MORE;

    public static InterfaceC2044707zh<EnumC1341670l1B> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1341670l1B enumC1341670l1B = new EnumC1341670l1B("SCROLL", 0);
        SCROLL = enumC1341670l1B;
        EnumC1341670l1B enumC1341670l1B2 = new EnumC1341670l1B("VIEW_MORE", 1);
        VIEW_MORE = enumC1341670l1B2;
        EnumC1341670l1B enumC1341670l1B3 = new EnumC1341670l1B("LIKE_COMMENT", 2);
        LIKE_COMMENT = enumC1341670l1B3;
        EnumC1341670l1B enumC1341670l1B4 = new EnumC1341670l1B("LONG_PRESS_COMMENT", 3);
        LONG_PRESS_COMMENT = enumC1341670l1B4;
        EnumC1341670l1B enumC1341670l1B5 = new EnumC1341670l1B("SHOW_KEYBOARD", 4);
        SHOW_KEYBOARD = enumC1341670l1B5;
        EnumC1341670l1B[] enumC1341670l1BArr = {enumC1341670l1B, enumC1341670l1B2, enumC1341670l1B3, enumC1341670l1B4, enumC1341670l1B5};
        LL = enumC1341670l1BArr;
        LLILLJJLI = new C2254308sP(enumC1341670l1BArr);
    }

    public static EnumC1341670l1B[] values() {
        return (EnumC1341670l1B[]) LL.clone();
    }

    public static EnumC1341670l1B valueOf(String str) {
        return (EnumC1341670l1B) C08FF.LIZ(EnumC1341670l1B.class, str);
    }

    public EnumC1341670l1B(String str, int i) {
    }
}
