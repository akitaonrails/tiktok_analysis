package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PPb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC644330PPb {
    public static final EnumC644330PPb ECOM;
    public static final EnumC644330PPb LIVE;
    public static final /* synthetic */ EnumC644330PPb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC644330PPb NONE;
    public static final EnumC644330PPb POI;
    public static final EnumC644330PPb USER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC644330PPb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC644330PPb enumC644330PPb = new EnumC644330PPb("NONE", 0, 0);
        NONE = enumC644330PPb;
        EnumC644330PPb enumC644330PPb2 = new EnumC644330PPb("USER", 1, 1);
        USER = enumC644330PPb2;
        EnumC644330PPb enumC644330PPb3 = new EnumC644330PPb("POI", 2, 2);
        POI = enumC644330PPb3;
        EnumC644330PPb enumC644330PPb4 = new EnumC644330PPb("ECOM", 3, 3);
        ECOM = enumC644330PPb4;
        EnumC644330PPb enumC644330PPb5 = new EnumC644330PPb("LIVE", 4, 4);
        LIVE = enumC644330PPb5;
        EnumC644330PPb[] enumC644330PPbArr = {enumC644330PPb, enumC644330PPb2, enumC644330PPb3, enumC644330PPb4, enumC644330PPb5};
        LLILLJJLI = enumC644330PPbArr;
        LLILLL = new C2254308sP(enumC644330PPbArr);
    }

    public static EnumC644330PPb[] values() {
        return (EnumC644330PPb[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC644330PPb valueOf(String str) {
        return (EnumC644330PPb) C08FF.LIZ(EnumC644330PPb.class, str);
    }

    public EnumC644330PPb(String str, int i, int i2) {
        this.LL = i2;
    }
}
