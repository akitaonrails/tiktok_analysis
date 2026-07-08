package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QPq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC669960QPq {
    public static final EnumC669960QPq INIT_NOT_SENT;
    public static final EnumC669960QPq INIT_SENT;
    public static final /* synthetic */ EnumC669960QPq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC669960QPq SPARK_NOT_FOUND;
    public static final EnumC669960QPq SPARK_RETRY_FAILED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC669960QPq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC669960QPq enumC669960QPq = new EnumC669960QPq("INIT_SENT", 0, 1);
        INIT_SENT = enumC669960QPq;
        EnumC669960QPq enumC669960QPq2 = new EnumC669960QPq("INIT_NOT_SENT", 1, 2);
        INIT_NOT_SENT = enumC669960QPq2;
        EnumC669960QPq enumC669960QPq3 = new EnumC669960QPq("SPARK_NOT_FOUND", 2, 3);
        SPARK_NOT_FOUND = enumC669960QPq3;
        EnumC669960QPq enumC669960QPq4 = new EnumC669960QPq("SPARK_RETRY_FAILED", 3, 4);
        SPARK_RETRY_FAILED = enumC669960QPq4;
        EnumC669960QPq[] enumC669960QPqArr = {enumC669960QPq, enumC669960QPq2, enumC669960QPq3, enumC669960QPq4};
        LLILLJJLI = enumC669960QPqArr;
        LLILLL = new C2254308sP(enumC669960QPqArr);
    }

    public static EnumC669960QPq[] values() {
        return (EnumC669960QPq[]) LLILLJJLI.clone();
    }

    public final int getId() {
        return this.LL;
    }

    public static EnumC669960QPq valueOf(String str) {
        return (EnumC669960QPq) C08FF.LIZ(EnumC669960QPq.class, str);
    }

    public EnumC669960QPq(String str, int i, int i2) {
        this.LL = i2;
    }
}
