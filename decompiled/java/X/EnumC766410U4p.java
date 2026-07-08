package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0U4p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC766410U4p {
    public static final EnumC766410U4p ACTIVITY;
    public static final EnumC766410U4p ANCHOR;
    public static final /* synthetic */ EnumC766410U4p[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC766410U4p SEARCH;
    public static final EnumC766410U4p UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC766410U4p> getEntries() {
        return LLILLL;
    }

    static {
        EnumC766410U4p enumC766410U4p = new EnumC766410U4p("UNKNOWN", 0, 0);
        UNKNOWN = enumC766410U4p;
        EnumC766410U4p enumC766410U4p2 = new EnumC766410U4p("ANCHOR", 1, 1);
        ANCHOR = enumC766410U4p2;
        EnumC766410U4p enumC766410U4p3 = new EnumC766410U4p("SEARCH", 2, 2);
        SEARCH = enumC766410U4p3;
        EnumC766410U4p enumC766410U4p4 = new EnumC766410U4p("ACTIVITY", 3, 3);
        ACTIVITY = enumC766410U4p4;
        EnumC766410U4p[] enumC766410U4pArr = {enumC766410U4p, enumC766410U4p2, enumC766410U4p3, enumC766410U4p4};
        LLILLJJLI = enumC766410U4pArr;
        LLILLL = new C2254308sP(enumC766410U4pArr);
    }

    public static EnumC766410U4p[] values() {
        return (EnumC766410U4p[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC766410U4p valueOf(String str) {
        return (EnumC766410U4p) C08FF.LIZ(EnumC766410U4p.class, str);
    }

    public EnumC766410U4p(String str, int i, int i2) {
        this.LL = i2;
    }
}
