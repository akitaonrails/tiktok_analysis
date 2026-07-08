package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Bq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC038400Bq {
    public static final EnumC038400Bq IDLE;
    public static final /* synthetic */ EnumC038400Bq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC038400Bq RUNNING;

    public static InterfaceC2044707zh<EnumC038400Bq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC038400Bq enumC038400Bq = new EnumC038400Bq("IDLE", 0);
        IDLE = enumC038400Bq;
        EnumC038400Bq enumC038400Bq2 = new EnumC038400Bq("RUNNING", 1);
        RUNNING = enumC038400Bq2;
        EnumC038400Bq[] enumC038400BqArr = {enumC038400Bq, enumC038400Bq2};
        LL = enumC038400BqArr;
        LLILLJJLI = new C2254308sP(enumC038400BqArr);
    }

    public static EnumC038400Bq[] values() {
        return (EnumC038400Bq[]) LL.clone();
    }

    public static EnumC038400Bq valueOf(String str) {
        return (EnumC038400Bq) C08FF.LIZ(EnumC038400Bq.class, str);
    }

    public EnumC038400Bq(String str, int i) {
    }
}
