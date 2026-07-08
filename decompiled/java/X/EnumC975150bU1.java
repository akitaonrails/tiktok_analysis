package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bU1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC975150bU1 {
    public static final EnumC975150bU1 IN_COHOST_INVITING_OR_APPLYING;
    public static final /* synthetic */ EnumC975150bU1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC975150bU1 NO_CATCH_BEAN_WHEN_IN_MATCH;
    public static final EnumC975150bU1 NO_CATCH_BEAN_WHEN_IN_MG_AND_COHOST;
    public static final EnumC975150bU1 NO_CATCH_BEAN_WHEN_IN_TAKE_STAGE;
    public static final EnumC975150bU1 NO_CATCH_BEAN_WHEN_IN_WRONG_COHOST_NUM;
    public static final EnumC975150bU1 NO_MATCH_WHEN_IN_CATCH_BEAN;
    public static final EnumC975150bU1 NO_MATCH_WHEN_IN_TAKE_STAGE;
    public static final EnumC975150bU1 NO_PERMISSION_BY_SETTING;
    public static final EnumC975150bU1 NO_TAKE_STAGE_WHEN_IN_MATCH;
    public static final EnumC975150bU1 NO_TAKE_STAGE_WHEN_IN_MG_AND_COHOST;

    public static InterfaceC2044707zh<EnumC975150bU1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC975150bU1 enumC975150bU1 = new EnumC975150bU1("NO_MATCH_WHEN_IN_TAKE_STAGE", 0);
        NO_MATCH_WHEN_IN_TAKE_STAGE = enumC975150bU1;
        EnumC975150bU1 enumC975150bU12 = new EnumC975150bU1("NO_MATCH_WHEN_IN_CATCH_BEAN", 1);
        NO_MATCH_WHEN_IN_CATCH_BEAN = enumC975150bU12;
        EnumC975150bU1 enumC975150bU13 = new EnumC975150bU1("NO_TAKE_STAGE_WHEN_IN_MATCH", 2);
        NO_TAKE_STAGE_WHEN_IN_MATCH = enumC975150bU13;
        EnumC975150bU1 enumC975150bU14 = new EnumC975150bU1("NO_CATCH_BEAN_WHEN_IN_MATCH", 3);
        NO_CATCH_BEAN_WHEN_IN_MATCH = enumC975150bU14;
        EnumC975150bU1 enumC975150bU15 = new EnumC975150bU1("NO_CATCH_BEAN_WHEN_IN_TAKE_STAGE", 4);
        NO_CATCH_BEAN_WHEN_IN_TAKE_STAGE = enumC975150bU15;
        EnumC975150bU1 enumC975150bU16 = new EnumC975150bU1("NO_CATCH_BEAN_WHEN_IN_WRONG_COHOST_NUM", 5);
        NO_CATCH_BEAN_WHEN_IN_WRONG_COHOST_NUM = enumC975150bU16;
        EnumC975150bU1 enumC975150bU17 = new EnumC975150bU1("NO_TAKE_STAGE_WHEN_IN_MG_AND_COHOST", 6);
        NO_TAKE_STAGE_WHEN_IN_MG_AND_COHOST = enumC975150bU17;
        EnumC975150bU1 enumC975150bU18 = new EnumC975150bU1("NO_CATCH_BEAN_WHEN_IN_MG_AND_COHOST", 7);
        NO_CATCH_BEAN_WHEN_IN_MG_AND_COHOST = enumC975150bU18;
        EnumC975150bU1 enumC975150bU19 = new EnumC975150bU1("NO_PERMISSION_BY_SETTING", 8);
        NO_PERMISSION_BY_SETTING = enumC975150bU19;
        EnumC975150bU1 enumC975150bU110 = new EnumC975150bU1("IN_COHOST_INVITING_OR_APPLYING", 9);
        IN_COHOST_INVITING_OR_APPLYING = enumC975150bU110;
        EnumC975150bU1[] enumC975150bU1Arr = {enumC975150bU1, enumC975150bU12, enumC975150bU13, enumC975150bU14, enumC975150bU15, enumC975150bU16, enumC975150bU17, enumC975150bU18, enumC975150bU19, enumC975150bU110};
        LL = enumC975150bU1Arr;
        LLILLJJLI = new C2254308sP(enumC975150bU1Arr);
    }

    public static EnumC975150bU1[] values() {
        return (EnumC975150bU1[]) LL.clone();
    }

    public static EnumC975150bU1 valueOf(String str) {
        return (EnumC975150bU1) C08FF.LIZ(EnumC975150bU1.class, str);
    }

    public EnumC975150bU1(String str, int i) {
    }
}
