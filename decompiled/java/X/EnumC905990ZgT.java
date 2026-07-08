package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZgT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC905990ZgT {
    public static final EnumC905990ZgT CANCELLED;
    public static final EnumC905990ZgT ERROR;
    public static final EnumC905990ZgT FINISHED;
    public static final EnumC905990ZgT INTERRUPTED;
    public static final /* synthetic */ EnumC905990ZgT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC905990ZgT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC905990ZgT enumC905990ZgT = new EnumC905990ZgT("FINISHED", 0, "finished");
        FINISHED = enumC905990ZgT;
        EnumC905990ZgT enumC905990ZgT2 = new EnumC905990ZgT("ERROR", 1, "error");
        ERROR = enumC905990ZgT2;
        EnumC905990ZgT enumC905990ZgT3 = new EnumC905990ZgT("CANCELLED", 2, "cancelled");
        CANCELLED = enumC905990ZgT3;
        EnumC905990ZgT enumC905990ZgT4 = new EnumC905990ZgT("INTERRUPTED", 3, "interrupted");
        INTERRUPTED = enumC905990ZgT4;
        EnumC905990ZgT[] enumC905990ZgTArr = {enumC905990ZgT, enumC905990ZgT2, enumC905990ZgT3, enumC905990ZgT4};
        LLILLJJLI = enumC905990ZgTArr;
        LLILLL = new C2254308sP(enumC905990ZgTArr);
    }

    public static EnumC905990ZgT[] values() {
        return (EnumC905990ZgT[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC905990ZgT valueOf(String str) {
        return (EnumC905990ZgT) C08FF.LIZ(EnumC905990ZgT.class, str);
    }

    public EnumC905990ZgT(String str, int i, String str2) {
        this.LL = str2;
    }
}
