package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FHq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC387600FHq {
    public static final EnumC387600FHq CAPTION;
    public static final /* synthetic */ EnumC387600FHq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC387600FHq TEXT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC387600FHq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC387600FHq enumC387600FHq = new EnumC387600FHq("TEXT", 0, "text");
        TEXT = enumC387600FHq;
        EnumC387600FHq enumC387600FHq2 = new EnumC387600FHq("CAPTION", 1, "caption");
        CAPTION = enumC387600FHq2;
        EnumC387600FHq[] enumC387600FHqArr = {enumC387600FHq, enumC387600FHq2};
        LLILLJJLI = enumC387600FHqArr;
        LLILLL = new C2254308sP(enumC387600FHqArr);
    }

    public static EnumC387600FHq[] values() {
        return (EnumC387600FHq[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC387600FHq valueOf(String str) {
        return (EnumC387600FHq) C08FF.LIZ(EnumC387600FHq.class, str);
    }

    public EnumC387600FHq(String str, int i, String str2) {
        this.LL = str2;
    }
}
