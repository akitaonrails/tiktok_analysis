package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OXc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC620940OXc {
    public static final EnumC620940OXc ADD_FIRSTLY_COMMENT;
    public static final EnumC620940OXc ADD_SECONDLY_COMMENT;
    public static final /* synthetic */ EnumC620940OXc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC620940OXc REMOVE_FIRSTLY_COMMENT;
    public static final EnumC620940OXc REMOVE_SECONDLY_COMMENT;
    public static final EnumC620940OXc UPDATE;
    public static final EnumC620940OXc UPDATE_FAKE_COMMENT;

    public static InterfaceC2044707zh<EnumC620940OXc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC620940OXc enumC620940OXc = new EnumC620940OXc("UPDATE", 0);
        UPDATE = enumC620940OXc;
        EnumC620940OXc enumC620940OXc2 = new EnumC620940OXc("UPDATE_FAKE_COMMENT", 1);
        UPDATE_FAKE_COMMENT = enumC620940OXc2;
        EnumC620940OXc enumC620940OXc3 = new EnumC620940OXc("ADD_FIRSTLY_COMMENT", 2);
        ADD_FIRSTLY_COMMENT = enumC620940OXc3;
        EnumC620940OXc enumC620940OXc4 = new EnumC620940OXc("ADD_SECONDLY_COMMENT", 3);
        ADD_SECONDLY_COMMENT = enumC620940OXc4;
        EnumC620940OXc enumC620940OXc5 = new EnumC620940OXc("REMOVE_FIRSTLY_COMMENT", 4);
        REMOVE_FIRSTLY_COMMENT = enumC620940OXc5;
        EnumC620940OXc enumC620940OXc6 = new EnumC620940OXc("REMOVE_SECONDLY_COMMENT", 5);
        REMOVE_SECONDLY_COMMENT = enumC620940OXc6;
        EnumC620940OXc[] enumC620940OXcArr = {enumC620940OXc, enumC620940OXc2, enumC620940OXc3, enumC620940OXc4, enumC620940OXc5, enumC620940OXc6};
        LL = enumC620940OXcArr;
        LLILLJJLI = new C2254308sP(enumC620940OXcArr);
    }

    public static EnumC620940OXc[] values() {
        return (EnumC620940OXc[]) LL.clone();
    }

    public static EnumC620940OXc valueOf(String str) {
        return (EnumC620940OXc) C08FF.LIZ(EnumC620940OXc.class, str);
    }

    public EnumC620940OXc(String str, int i) {
    }
}
