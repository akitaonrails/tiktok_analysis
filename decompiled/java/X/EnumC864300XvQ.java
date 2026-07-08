package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XvQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC864300XvQ {
    public static final EnumC864300XvQ CANCELED;
    public static final EnumC864300XvQ END;
    public static final /* synthetic */ EnumC864300XvQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC864300XvQ NEW;
    public static final EnumC864300XvQ PENDING;
    public static final EnumC864300XvQ RUNNING;
    public final String LL;

    public static InterfaceC2044707zh<EnumC864300XvQ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC864300XvQ enumC864300XvQ = new EnumC864300XvQ("NEW", 0, "New");
        NEW = enumC864300XvQ;
        EnumC864300XvQ enumC864300XvQ2 = new EnumC864300XvQ("RUNNING", 1, "Running");
        RUNNING = enumC864300XvQ2;
        EnumC864300XvQ enumC864300XvQ3 = new EnumC864300XvQ("END", 2, "End");
        END = enumC864300XvQ3;
        EnumC864300XvQ enumC864300XvQ4 = new EnumC864300XvQ("CANCELED", 3, "Canceled");
        CANCELED = enumC864300XvQ4;
        EnumC864300XvQ enumC864300XvQ5 = new EnumC864300XvQ("PENDING", 4, "Pending");
        PENDING = enumC864300XvQ5;
        EnumC864300XvQ[] enumC864300XvQArr = {enumC864300XvQ, enumC864300XvQ2, enumC864300XvQ3, enumC864300XvQ4, enumC864300XvQ5};
        LLILLJJLI = enumC864300XvQArr;
        LLILLL = new C2254308sP(enumC864300XvQArr);
    }

    public static EnumC864300XvQ[] values() {
        return (EnumC864300XvQ[]) LLILLJJLI.clone();
    }

    public final String getState() {
        return this.LL;
    }

    public static EnumC864300XvQ valueOf(String str) {
        return (EnumC864300XvQ) C08FF.LIZ(EnumC864300XvQ.class, str);
    }

    public EnumC864300XvQ(String str, int i, String str2) {
        this.LL = str2;
    }
}
