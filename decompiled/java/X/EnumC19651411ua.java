package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11ua, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19651411ua {
    public static final EnumC19651411ua FINISHED;
    public static final /* synthetic */ EnumC19651411ua[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19651411ua PENDING;
    public static final EnumC19651411ua RUNNING;

    public static InterfaceC2044707zh<EnumC19651411ua> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19651411ua enumC19651411ua = new EnumC19651411ua("PENDING", 0);
        PENDING = enumC19651411ua;
        EnumC19651411ua enumC19651411ua2 = new EnumC19651411ua("RUNNING", 1);
        RUNNING = enumC19651411ua2;
        EnumC19651411ua enumC19651411ua3 = new EnumC19651411ua("FINISHED", 2);
        FINISHED = enumC19651411ua3;
        EnumC19651411ua[] enumC19651411uaArr = {enumC19651411ua, enumC19651411ua2, enumC19651411ua3};
        LL = enumC19651411uaArr;
        LLILLJJLI = new C2254308sP(enumC19651411uaArr);
    }

    public static EnumC19651411ua[] values() {
        return (EnumC19651411ua[]) LL.clone();
    }

    public static EnumC19651411ua valueOf(String str) {
        return (EnumC19651411ua) C08FF.LIZ(EnumC19651411ua.class, str);
    }

    public EnumC19651411ua(String str, int i) {
    }
}
