package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.17wd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21192917wd {
    public static final /* synthetic */ EnumC21192917wd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC21192917wd MORE_WAIT_FOR_SHOW;
    public static final EnumC21192917wd NOTIFY_SHOW;
    public static final EnumC21192917wd NOTIFY_SHOW_LYNX;
    public static final EnumC21192917wd ON_DATA_READY;
    public static final EnumC21192917wd ON_SLOT_CREATED;
    public static final EnumC21192917wd ON_SLOT_CREATED_FROM_RESPONSE;
    public static final EnumC21192917wd ON_VIEW_CREATED;
    public static final EnumC21192917wd PREPARE_TO_SHOW;
    public static final EnumC21192917wd SHOW_TO_USER;
    public static final EnumC21192917wd WAIT_FOR_SHOW;

    public static InterfaceC2044707zh<EnumC21192917wd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC21192917wd enumC21192917wd = new EnumC21192917wd("PREPARE_TO_SHOW", 0);
        PREPARE_TO_SHOW = enumC21192917wd;
        EnumC21192917wd enumC21192917wd2 = new EnumC21192917wd("ON_DATA_READY", 1);
        ON_DATA_READY = enumC21192917wd2;
        EnumC21192917wd enumC21192917wd3 = new EnumC21192917wd("ON_SLOT_CREATED", 2);
        ON_SLOT_CREATED = enumC21192917wd3;
        EnumC21192917wd enumC21192917wd4 = new EnumC21192917wd("ON_SLOT_CREATED_FROM_RESPONSE", 3);
        ON_SLOT_CREATED_FROM_RESPONSE = enumC21192917wd4;
        EnumC21192917wd enumC21192917wd5 = new EnumC21192917wd("WAIT_FOR_SHOW", 4);
        WAIT_FOR_SHOW = enumC21192917wd5;
        EnumC21192917wd enumC21192917wd6 = new EnumC21192917wd("MORE_WAIT_FOR_SHOW", 5);
        MORE_WAIT_FOR_SHOW = enumC21192917wd6;
        EnumC21192917wd enumC21192917wd7 = new EnumC21192917wd("NOTIFY_SHOW", 6);
        NOTIFY_SHOW = enumC21192917wd7;
        EnumC21192917wd enumC21192917wd8 = new EnumC21192917wd("NOTIFY_SHOW_LYNX", 7);
        NOTIFY_SHOW_LYNX = enumC21192917wd8;
        EnumC21192917wd enumC21192917wd9 = new EnumC21192917wd("ON_VIEW_CREATED", 8);
        ON_VIEW_CREATED = enumC21192917wd9;
        EnumC21192917wd enumC21192917wd10 = new EnumC21192917wd("SHOW_TO_USER", 9);
        SHOW_TO_USER = enumC21192917wd10;
        EnumC21192917wd[] enumC21192917wdArr = {enumC21192917wd, enumC21192917wd2, enumC21192917wd3, enumC21192917wd4, enumC21192917wd5, enumC21192917wd6, enumC21192917wd7, enumC21192917wd8, enumC21192917wd9, enumC21192917wd10};
        LL = enumC21192917wdArr;
        LLILLJJLI = new C2254308sP(enumC21192917wdArr);
    }

    public static EnumC21192917wd[] values() {
        return (EnumC21192917wd[]) LL.clone();
    }

    public static EnumC21192917wd valueOf(String str) {
        return (EnumC21192917wd) C08FF.LIZ(EnumC21192917wd.class, str);
    }

    public EnumC21192917wd(String str, int i) {
    }
}
