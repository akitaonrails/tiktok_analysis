package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06t1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1748506t1 {
    public static final EnumC1748506t1 KEYWORDREPLY;
    public static final /* synthetic */ EnumC1748506t1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1748506t1 SUGGESTQN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1748506t1> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1748506t1 enumC1748506t1 = new EnumC1748506t1("SUGGESTQN", 0, "suggested_question");
        SUGGESTQN = enumC1748506t1;
        EnumC1748506t1 enumC1748506t12 = new EnumC1748506t1("KEYWORDREPLY", 1, "keyword");
        KEYWORDREPLY = enumC1748506t12;
        EnumC1748506t1[] enumC1748506t1Arr = {enumC1748506t1, enumC1748506t12};
        LLILLJJLI = enumC1748506t1Arr;
        LLILLL = new C2254308sP(enumC1748506t1Arr);
    }

    public static EnumC1748506t1[] values() {
        return (EnumC1748506t1[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static EnumC1748506t1 valueOf(String str) {
        return (EnumC1748506t1) C08FF.LIZ(EnumC1748506t1.class, str);
    }

    public EnumC1748506t1(String str, int i, String str2) {
        this.LL = str2;
    }
}
