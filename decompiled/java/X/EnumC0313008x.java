package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0313008x {
    public static final EnumC0313008x CommitDislikeItemCountOnly;
    public static final EnumC0313008x CommitDislikeItemFully;
    public static final EnumC0313008x CommitDislikeItemReasonOnly;
    public static final /* synthetic */ EnumC0313008x[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC0313008x> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC0313008x enumC0313008x = new EnumC0313008x("CommitDislikeItemFully", 0);
        CommitDislikeItemFully = enumC0313008x;
        EnumC0313008x enumC0313008x2 = new EnumC0313008x("CommitDislikeItemCountOnly", 1);
        CommitDislikeItemCountOnly = enumC0313008x2;
        EnumC0313008x enumC0313008x3 = new EnumC0313008x("CommitDislikeItemReasonOnly", 2);
        CommitDislikeItemReasonOnly = enumC0313008x3;
        EnumC0313008x[] enumC0313008xArr = {enumC0313008x, enumC0313008x2, enumC0313008x3};
        LL = enumC0313008xArr;
        LLILLJJLI = new C2254308sP(enumC0313008xArr);
    }

    public static EnumC0313008x[] values() {
        return (EnumC0313008x[]) LL.clone();
    }

    public static EnumC0313008x valueOf(String str) {
        return (EnumC0313008x) C08FF.LIZ(EnumC0313008x.class, str);
    }

    public EnumC0313008x(String str, int i) {
    }
}
