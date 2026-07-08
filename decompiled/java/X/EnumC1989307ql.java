package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07ql, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1989307ql {
    public static final /* synthetic */ EnumC1989307ql[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1989307ql PHOTO;
    public static final EnumC1989307ql VIDEO;

    public static InterfaceC2044707zh<EnumC1989307ql> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1989307ql enumC1989307ql = new EnumC1989307ql("PHOTO", 0);
        PHOTO = enumC1989307ql;
        EnumC1989307ql enumC1989307ql2 = new EnumC1989307ql("VIDEO", 1);
        VIDEO = enumC1989307ql2;
        EnumC1989307ql[] enumC1989307qlArr = {enumC1989307ql, enumC1989307ql2};
        LL = enumC1989307qlArr;
        LLILLJJLI = new C2254308sP(enumC1989307qlArr);
    }

    public static EnumC1989307ql[] values() {
        return (EnumC1989307ql[]) LL.clone();
    }

    public static EnumC1989307ql valueOf(String str) {
        return (EnumC1989307ql) C08FF.LIZ(EnumC1989307ql.class, str);
    }

    public EnumC1989307ql(String str, int i) {
    }
}
