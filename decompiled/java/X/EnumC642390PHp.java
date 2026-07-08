package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PHp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC642390PHp {
    public static final EnumC642390PHp INNER_LOAD_MORE;
    public static final /* synthetic */ EnumC642390PHp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC642390PHp OUT_LOAD_MORE;
    public static final EnumC642390PHp REBIND;
    public static final EnumC642390PHp RERANK;

    public static InterfaceC2044707zh<EnumC642390PHp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC642390PHp enumC642390PHp = new EnumC642390PHp("REBIND", 0);
        REBIND = enumC642390PHp;
        EnumC642390PHp enumC642390PHp2 = new EnumC642390PHp("OUT_LOAD_MORE", 1);
        OUT_LOAD_MORE = enumC642390PHp2;
        EnumC642390PHp enumC642390PHp3 = new EnumC642390PHp("INNER_LOAD_MORE", 2);
        INNER_LOAD_MORE = enumC642390PHp3;
        EnumC642390PHp enumC642390PHp4 = new EnumC642390PHp("RERANK", 3);
        RERANK = enumC642390PHp4;
        EnumC642390PHp[] enumC642390PHpArr = {enumC642390PHp, enumC642390PHp2, enumC642390PHp3, enumC642390PHp4};
        LL = enumC642390PHpArr;
        LLILLJJLI = new C2254308sP(enumC642390PHpArr);
    }

    public static EnumC642390PHp[] values() {
        return (EnumC642390PHp[]) LL.clone();
    }

    public static EnumC642390PHp valueOf(String str) {
        return (EnumC642390PHp) C08FF.LIZ(EnumC642390PHp.class, str);
    }

    public EnumC642390PHp(String str, int i) {
    }
}
