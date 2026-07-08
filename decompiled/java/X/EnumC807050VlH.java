package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VlH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC807050VlH {
    public static final EnumC807050VlH CUSTOM_EVENT;
    public static final EnumC807050VlH EVENT;
    public static final /* synthetic */ EnumC807050VlH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC807050VlH NET_API;
    public static final EnumC807050VlH PAGE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC807050VlH> getEntries() {
        return LLILLL;
    }

    static {
        EnumC807050VlH enumC807050VlH = new EnumC807050VlH("PAGE", 0, 1);
        PAGE = enumC807050VlH;
        EnumC807050VlH enumC807050VlH2 = new EnumC807050VlH("EVENT", 1, 2);
        EVENT = enumC807050VlH2;
        EnumC807050VlH enumC807050VlH3 = new EnumC807050VlH("CUSTOM_EVENT", 2, 3);
        CUSTOM_EVENT = enumC807050VlH3;
        EnumC807050VlH enumC807050VlH4 = new EnumC807050VlH("NET_API", 3, 101);
        NET_API = enumC807050VlH4;
        EnumC807050VlH[] enumC807050VlHArr = {enumC807050VlH, enumC807050VlH2, enumC807050VlH3, enumC807050VlH4};
        LLILLJJLI = enumC807050VlHArr;
        LLILLL = new C2254308sP(enumC807050VlHArr);
    }

    public static EnumC807050VlH[] values() {
        return (EnumC807050VlH[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC807050VlH valueOf(String str) {
        return (EnumC807050VlH) C08FF.LIZ(EnumC807050VlH.class, str);
    }

    public EnumC807050VlH(String str, int i, int i2) {
        this.LL = i2;
    }
}
