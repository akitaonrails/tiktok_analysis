package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10oj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19360310oj {
    public static final EnumC19360310oj LL;
    public static final EnumC19360310oj LLILLJJLI;
    public static final /* synthetic */ EnumC19360310oj[] LLILLL;

    static {
        EnumC19360310oj enumC19360310oj = new EnumC19360310oj("IDLE", 0);
        LL = enumC19360310oj;
        EnumC19360310oj enumC19360310oj2 = new EnumC19360310oj("EDITING", 1);
        LLILLJJLI = enumC19360310oj2;
        EnumC19360310oj[] enumC19360310ojArr = {enumC19360310oj, enumC19360310oj2};
        LLILLL = enumC19360310ojArr;
        new C2254308sP(enumC19360310ojArr);
    }

    public static EnumC19360310oj[] values() {
        return (EnumC19360310oj[]) LLILLL.clone();
    }

    public static EnumC19360310oj valueOf(String str) {
        return (EnumC19360310oj) C08FF.LIZ(EnumC19360310oj.class, str);
    }

    public EnumC19360310oj(String str, int i) {
    }
}
