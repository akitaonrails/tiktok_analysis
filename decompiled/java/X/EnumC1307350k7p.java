package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0k7p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1307350k7p {
    public static final EnumC1307350k7p CANCELLED;
    public static final EnumC1307350k7p CREATED;
    public static final EnumC1307350k7p DONE;
    public static final EnumC1307350k7p FAILED;
    public static final /* synthetic */ EnumC1307350k7p[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1307350k7p PENDING;
    public static final EnumC1307350k7p RUNNING;

    public static InterfaceC2044707zh<EnumC1307350k7p> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1307350k7p enumC1307350k7p = new EnumC1307350k7p("CREATED", 0);
        CREATED = enumC1307350k7p;
        EnumC1307350k7p enumC1307350k7p2 = new EnumC1307350k7p("PENDING", 1);
        PENDING = enumC1307350k7p2;
        EnumC1307350k7p enumC1307350k7p3 = new EnumC1307350k7p("RUNNING", 2);
        RUNNING = enumC1307350k7p3;
        EnumC1307350k7p enumC1307350k7p4 = new EnumC1307350k7p("DONE", 3);
        DONE = enumC1307350k7p4;
        EnumC1307350k7p enumC1307350k7p5 = new EnumC1307350k7p("FAILED", 4);
        FAILED = enumC1307350k7p5;
        EnumC1307350k7p enumC1307350k7p6 = new EnumC1307350k7p("CANCELLED", 5);
        CANCELLED = enumC1307350k7p6;
        EnumC1307350k7p[] enumC1307350k7pArr = {enumC1307350k7p, enumC1307350k7p2, enumC1307350k7p3, enumC1307350k7p4, enumC1307350k7p5, enumC1307350k7p6};
        LL = enumC1307350k7pArr;
        LLILLJJLI = new C2254308sP(enumC1307350k7pArr);
    }

    public static EnumC1307350k7p[] values() {
        return (EnumC1307350k7p[]) LL.clone();
    }

    public static EnumC1307350k7p valueOf(String str) {
        return (EnumC1307350k7p) C08FF.LIZ(EnumC1307350k7p.class, str);
    }

    public EnumC1307350k7p(String str, int i) {
    }
}
