package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0b8j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC961950b8j {
    public static final EnumC961950b8j INVITE_LIST_NORMAL;
    public static final EnumC961950b8j INVITE_LIST_SCROLL_DOWN_STATE;
    public static final EnumC961950b8j INVITE_LIST_SCROLL_UP_STATE_COMPRESS;
    public static final EnumC961950b8j INVITE_LIST_SCROLL_UP_STATE_EXTEND;
    public static final /* synthetic */ EnumC961950b8j[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public int LL;

    public static InterfaceC2044707zh<EnumC961950b8j> getEntries() {
        return LLILLL;
    }

    static {
        EnumC961950b8j enumC961950b8j = new EnumC961950b8j("INVITE_LIST_NORMAL", 0, 0);
        INVITE_LIST_NORMAL = enumC961950b8j;
        EnumC961950b8j enumC961950b8j2 = new EnumC961950b8j("INVITE_LIST_SCROLL_UP_STATE_EXTEND", 1, 1);
        INVITE_LIST_SCROLL_UP_STATE_EXTEND = enumC961950b8j2;
        EnumC961950b8j enumC961950b8j3 = new EnumC961950b8j("INVITE_LIST_SCROLL_UP_STATE_COMPRESS", 2, 2);
        INVITE_LIST_SCROLL_UP_STATE_COMPRESS = enumC961950b8j3;
        EnumC961950b8j enumC961950b8j4 = new EnumC961950b8j("INVITE_LIST_SCROLL_DOWN_STATE", 3, 3);
        INVITE_LIST_SCROLL_DOWN_STATE = enumC961950b8j4;
        EnumC961950b8j[] enumC961950b8jArr = {enumC961950b8j, enumC961950b8j2, enumC961950b8j3, enumC961950b8j4};
        LLILLJJLI = enumC961950b8jArr;
        LLILLL = new C2254308sP(enumC961950b8jArr);
    }

    public static EnumC961950b8j[] values() {
        return (EnumC961950b8j[]) LLILLJJLI.clone();
    }

    public final int getState() {
        return this.LL;
    }

    public static EnumC961950b8j valueOf(String str) {
        return (EnumC961950b8j) C08FF.LIZ(EnumC961950b8j.class, str);
    }

    public final void setState(int i) {
        this.LL = i;
    }

    public EnumC961950b8j(String str, int i, int i2) {
        this.LL = i2;
    }
}
