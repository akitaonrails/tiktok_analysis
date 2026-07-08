package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0b5L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC959850b5L {
    public static final /* synthetic */ EnumC959850b5L[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC959850b5L QUICK_LINK_MIC_STATE_WRONG;
    public static final EnumC959850b5L QUICK_PAIR_FILTER_WHEN_LINKED;
    public static final EnumC959850b5L RANDOM_MATCH_CONTENT_INVALID;
    public final long LL;

    public static InterfaceC2044707zh<EnumC959850b5L> getEntries() {
        return LLILLL;
    }

    static {
        EnumC959850b5L enumC959850b5L = new EnumC959850b5L("QUICK_PAIR_FILTER_WHEN_LINKED", 0, -1000L);
        QUICK_PAIR_FILTER_WHEN_LINKED = enumC959850b5L;
        EnumC959850b5L enumC959850b5L2 = new EnumC959850b5L("RANDOM_MATCH_CONTENT_INVALID", 1, -1001L);
        RANDOM_MATCH_CONTENT_INVALID = enumC959850b5L2;
        EnumC959850b5L enumC959850b5L3 = new EnumC959850b5L("QUICK_LINK_MIC_STATE_WRONG", 2, -1002L);
        QUICK_LINK_MIC_STATE_WRONG = enumC959850b5L3;
        EnumC959850b5L[] enumC959850b5LArr = {enumC959850b5L, enumC959850b5L2, enumC959850b5L3};
        LLILLJJLI = enumC959850b5LArr;
        LLILLL = new C2254308sP(enumC959850b5LArr);
    }

    public static EnumC959850b5L[] values() {
        return (EnumC959850b5L[]) LLILLJJLI.clone();
    }

    public final long getType() {
        return this.LL;
    }

    public static EnumC959850b5L valueOf(String str) {
        return (EnumC959850b5L) C08FF.LIZ(EnumC959850b5L.class, str);
    }

    public EnumC959850b5L(String str, int i, long j) {
        this.LL = j;
    }
}
