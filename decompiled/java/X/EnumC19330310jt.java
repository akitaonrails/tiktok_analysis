package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10jt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19330310jt {
    public static final EnumC19330310jt CANCEL_BY_USER;
    public static final EnumC19330310jt CLICK;
    public static final EnumC19330310jt DISAPPEAR;
    public static final EnumC19330310jt DISPLAY_EXTERNAL_APP;
    public static final EnumC19330310jt DISPLAY_IN_APP;
    public static final EnumC19330310jt DROP;
    public static final EnumC19330310jt DROP_BY_BUSINESS;
    public static final EnumC19330310jt DROP_BY_CTX_INVALID;
    public static final EnumC19330310jt DROP_BY_DUPLICATION;
    public static final EnumC19330310jt DROP_BY_EXPIRATION;
    public static final EnumC19330310jt DROP_BY_FREQUENCY;
    public static final EnumC19330310jt DROP_BY_INNER_PUSH_OPT;
    public static final EnumC19330310jt DROP_BY_LOCAL_CHECK;
    public static final EnumC19330310jt DROP_BY_NOTICE_READ;
    public static final EnumC19330310jt DROP_BY_PERMISSION;
    public static final EnumC19330310jt DROP_BY_REVERSE;
    public static final EnumC19330310jt DROP_BY_USERID_MISMATCH;
    public static final /* synthetic */ EnumC19330310jt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19330310jt START;
    public static final EnumC19330310jt WAIT;
    public static final EnumC19330310jt WAIT_TO_DROP;
    public final int LL;

    public static InterfaceC2044707zh<EnumC19330310jt> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19330310jt enumC19330310jt = new EnumC19330310jt("START", 0, LSPassThroughRecordSizeConfig.DEFAULT);
        START = enumC19330310jt;
        EnumC19330310jt enumC19330310jt2 = new EnumC19330310jt("DROP_BY_PERMISSION", 1, 1);
        DROP_BY_PERMISSION = enumC19330310jt2;
        EnumC19330310jt enumC19330310jt3 = new EnumC19330310jt("DROP_BY_EXPIRATION", 2, 2);
        DROP_BY_EXPIRATION = enumC19330310jt3;
        EnumC19330310jt enumC19330310jt4 = new EnumC19330310jt("DROP_BY_DUPLICATION", 3, 3);
        DROP_BY_DUPLICATION = enumC19330310jt4;
        EnumC19330310jt enumC19330310jt5 = new EnumC19330310jt("DROP_BY_FREQUENCY", 4, 4);
        DROP_BY_FREQUENCY = enumC19330310jt5;
        EnumC19330310jt enumC19330310jt6 = new EnumC19330310jt("DROP_BY_NOTICE_READ", 5, 5);
        DROP_BY_NOTICE_READ = enumC19330310jt6;
        EnumC19330310jt enumC19330310jt7 = new EnumC19330310jt("DROP_BY_BUSINESS", 6, 6);
        DROP_BY_BUSINESS = enumC19330310jt7;
        EnumC19330310jt enumC19330310jt8 = new EnumC19330310jt("DROP_BY_USERID_MISMATCH", 7, 7);
        DROP_BY_USERID_MISMATCH = enumC19330310jt8;
        EnumC19330310jt enumC19330310jt9 = new EnumC19330310jt("DROP_BY_LOCAL_CHECK", 8, 8);
        DROP_BY_LOCAL_CHECK = enumC19330310jt9;
        EnumC19330310jt enumC19330310jt10 = new EnumC19330310jt("DROP_BY_REVERSE", 9, 9);
        DROP_BY_REVERSE = enumC19330310jt10;
        EnumC19330310jt enumC19330310jt11 = new EnumC19330310jt("DISPLAY_IN_APP", 10, 10);
        DISPLAY_IN_APP = enumC19330310jt11;
        EnumC19330310jt enumC19330310jt12 = new EnumC19330310jt("DISPLAY_EXTERNAL_APP", 11, 11);
        DISPLAY_EXTERNAL_APP = enumC19330310jt12;
        EnumC19330310jt enumC19330310jt13 = new EnumC19330310jt("CANCEL_BY_USER", 12, 12);
        CANCEL_BY_USER = enumC19330310jt13;
        EnumC19330310jt enumC19330310jt14 = new EnumC19330310jt("DROP", 13, 13);
        DROP = enumC19330310jt14;
        EnumC19330310jt enumC19330310jt15 = new EnumC19330310jt("WAIT", 14, 14);
        WAIT = enumC19330310jt15;
        EnumC19330310jt enumC19330310jt16 = new EnumC19330310jt("CLICK", 15, 15);
        CLICK = enumC19330310jt16;
        EnumC19330310jt enumC19330310jt17 = new EnumC19330310jt("DISAPPEAR", 16, 16);
        DISAPPEAR = enumC19330310jt17;
        EnumC19330310jt enumC19330310jt18 = new EnumC19330310jt("WAIT_TO_DROP", 17, 17);
        WAIT_TO_DROP = enumC19330310jt18;
        EnumC19330310jt enumC19330310jt19 = new EnumC19330310jt("DROP_BY_INNER_PUSH_OPT", 18, 18);
        DROP_BY_INNER_PUSH_OPT = enumC19330310jt19;
        EnumC19330310jt enumC19330310jt20 = new EnumC19330310jt("DROP_BY_CTX_INVALID", 19, 19);
        DROP_BY_CTX_INVALID = enumC19330310jt20;
        EnumC19330310jt[] enumC19330310jtArr = {enumC19330310jt, enumC19330310jt2, enumC19330310jt3, enumC19330310jt4, enumC19330310jt5, enumC19330310jt6, enumC19330310jt7, enumC19330310jt8, enumC19330310jt9, enumC19330310jt10, enumC19330310jt11, enumC19330310jt12, enumC19330310jt13, enumC19330310jt14, enumC19330310jt15, enumC19330310jt16, enumC19330310jt17, enumC19330310jt18, enumC19330310jt19, enumC19330310jt20};
        LLILLJJLI = enumC19330310jtArr;
        LLILLL = new C2254308sP(enumC19330310jtArr);
    }

    public static EnumC19330310jt[] values() {
        return (EnumC19330310jt[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC19330310jt valueOf(String str) {
        return (EnumC19330310jt) C08FF.LIZ(EnumC19330310jt.class, str);
    }

    public EnumC19330310jt(String str, int i, int i2) {
        this.LL = i2;
    }
}
