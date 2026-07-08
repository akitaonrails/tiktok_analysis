package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.17vh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21187117vh {
    public static final EnumC21187117vh CRITICAL;
    public static final EnumC21187117vh ERROR;
    public static final /* synthetic */ EnumC21187117vh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC21187117vh NOTICE;
    public static final EnumC21187117vh SUCCESS;
    public static final EnumC21187117vh WARNING;
    public final int LL;

    public static InterfaceC2044707zh<EnumC21187117vh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC21187117vh enumC21187117vh = new EnumC21187117vh("SUCCESS", 0, 0);
        SUCCESS = enumC21187117vh;
        EnumC21187117vh enumC21187117vh2 = new EnumC21187117vh("NOTICE", 1, 1);
        NOTICE = enumC21187117vh2;
        EnumC21187117vh enumC21187117vh3 = new EnumC21187117vh("WARNING", 2, 2);
        WARNING = enumC21187117vh3;
        EnumC21187117vh enumC21187117vh4 = new EnumC21187117vh("ERROR", 3, 3);
        ERROR = enumC21187117vh4;
        EnumC21187117vh enumC21187117vh5 = new EnumC21187117vh("CRITICAL", 4, 4);
        CRITICAL = enumC21187117vh5;
        EnumC21187117vh[] enumC21187117vhArr = {enumC21187117vh, enumC21187117vh2, enumC21187117vh3, enumC21187117vh4, enumC21187117vh5};
        LLILLJJLI = enumC21187117vhArr;
        LLILLL = new C2254308sP(enumC21187117vhArr);
    }

    public static EnumC21187117vh[] values() {
        return (EnumC21187117vh[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC21187117vh valueOf(String str) {
        return (EnumC21187117vh) C08FF.LIZ(EnumC21187117vh.class, str);
    }

    public EnumC21187117vh(String str, int i, int i2) {
        this.LL = i2;
    }
}
