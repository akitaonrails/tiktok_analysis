package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC696910RVh {
    public static final /* synthetic */ EnumC696910RVh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC696910RVh ON_BIND;
    public static final EnumC696910RVh ON_CREATE;
    public static final EnumC696910RVh ON_DESTROY;
    public static final EnumC696910RVh ON_SELECTED;
    public static final EnumC696910RVh ON_UN_BIND;
    public static final EnumC696910RVh ON_UN_SELECTED;
    public static final EnumC696910RVh ON_VIEW_CREATED;

    public static InterfaceC2044707zh<EnumC696910RVh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC696910RVh enumC696910RVh = new EnumC696910RVh("ON_CREATE", 0);
        ON_CREATE = enumC696910RVh;
        EnumC696910RVh enumC696910RVh2 = new EnumC696910RVh("ON_VIEW_CREATED", 1);
        ON_VIEW_CREATED = enumC696910RVh2;
        EnumC696910RVh enumC696910RVh3 = new EnumC696910RVh("ON_BIND", 2);
        ON_BIND = enumC696910RVh3;
        EnumC696910RVh enumC696910RVh4 = new EnumC696910RVh("ON_SELECTED", 3);
        ON_SELECTED = enumC696910RVh4;
        EnumC696910RVh enumC696910RVh5 = new EnumC696910RVh("ON_UN_SELECTED", 4);
        ON_UN_SELECTED = enumC696910RVh5;
        EnumC696910RVh enumC696910RVh6 = new EnumC696910RVh("ON_UN_BIND", 5);
        ON_UN_BIND = enumC696910RVh6;
        EnumC696910RVh enumC696910RVh7 = new EnumC696910RVh("ON_DESTROY", 6);
        ON_DESTROY = enumC696910RVh7;
        EnumC696910RVh[] enumC696910RVhArr = {enumC696910RVh, enumC696910RVh2, enumC696910RVh3, enumC696910RVh4, enumC696910RVh5, enumC696910RVh6, enumC696910RVh7};
        LL = enumC696910RVhArr;
        LLILLJJLI = new C2254308sP(enumC696910RVhArr);
    }

    public static EnumC696910RVh[] values() {
        return (EnumC696910RVh[]) LL.clone();
    }

    public static EnumC696910RVh valueOf(String str) {
        return (EnumC696910RVh) C08FF.LIZ(EnumC696910RVh.class, str);
    }

    public EnumC696910RVh(String str, int i) {
    }
}
