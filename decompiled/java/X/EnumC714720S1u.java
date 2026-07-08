package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0S1u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC714720S1u {
    public static final EnumC714720S1u CLICK_INNER_EMOJI;
    public static final EnumC714720S1u CLICK_INPUT_BOX;
    public static final EnumC714720S1u CLICK_OUTER_EMOJI;
    public static final EnumC714720S1u CLICK_REPLY_BOX;
    public static final EnumC714720S1u CLICK_SEND_BUTTON;
    public static final /* synthetic */ EnumC714720S1u[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC714720S1u> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC714720S1u enumC714720S1u = new EnumC714720S1u("CLICK_OUTER_EMOJI", 0);
        CLICK_OUTER_EMOJI = enumC714720S1u;
        EnumC714720S1u enumC714720S1u2 = new EnumC714720S1u("CLICK_INPUT_BOX", 1);
        CLICK_INPUT_BOX = enumC714720S1u2;
        EnumC714720S1u enumC714720S1u3 = new EnumC714720S1u("CLICK_REPLY_BOX", 2);
        CLICK_REPLY_BOX = enumC714720S1u3;
        EnumC714720S1u enumC714720S1u4 = new EnumC714720S1u("CLICK_INNER_EMOJI", 3);
        CLICK_INNER_EMOJI = enumC714720S1u4;
        EnumC714720S1u enumC714720S1u5 = new EnumC714720S1u("CLICK_SEND_BUTTON", 4);
        CLICK_SEND_BUTTON = enumC714720S1u5;
        EnumC714720S1u[] enumC714720S1uArr = {enumC714720S1u, enumC714720S1u2, enumC714720S1u3, enumC714720S1u4, enumC714720S1u5};
        LL = enumC714720S1uArr;
        LLILLJJLI = new C2254308sP(enumC714720S1uArr);
    }

    public static EnumC714720S1u[] values() {
        return (EnumC714720S1u[]) LL.clone();
    }

    public static EnumC714720S1u valueOf(String str) {
        return (EnumC714720S1u) C08FF.LIZ(EnumC714720S1u.class, str);
    }

    public EnumC714720S1u(String str, int i) {
    }
}
