package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Tf0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC752200Tf0 {
    public static final EnumC752200Tf0 FLOAT_WINDOW_MSG_STRATEGY_ANDROID;
    public static final /* synthetic */ EnumC752200Tf0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "gp_anchor_float_window_msg_strategy_android";

    public static InterfaceC2044707zh<EnumC752200Tf0> getEntries() {
        return LLILLL;
    }

    static {
        EnumC752200Tf0 enumC752200Tf0 = new EnumC752200Tf0();
        FLOAT_WINDOW_MSG_STRATEGY_ANDROID = enumC752200Tf0;
        EnumC752200Tf0[] enumC752200Tf0Arr = {enumC752200Tf0};
        LLILLJJLI = enumC752200Tf0Arr;
        LLILLL = new C2254308sP(enumC752200Tf0Arr);
    }

    public static EnumC752200Tf0[] values() {
        return (EnumC752200Tf0[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static EnumC752200Tf0 valueOf(String str) {
        return (EnumC752200Tf0) C08FF.LIZ(EnumC752200Tf0.class, str);
    }
}
