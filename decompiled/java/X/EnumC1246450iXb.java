package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iXb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1246450iXb {
    public static final EnumC1246450iXb CLICK;
    public static final /* synthetic */ EnumC1246450iXb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1246450iXb PARSE;
    public static final EnumC1246450iXb SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1246450iXb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1246450iXb enumC1246450iXb = new EnumC1246450iXb("PARSE", 0, "parse");
        PARSE = enumC1246450iXb;
        EnumC1246450iXb enumC1246450iXb2 = new EnumC1246450iXb("SHOW", 1, "show");
        SHOW = enumC1246450iXb2;
        EnumC1246450iXb enumC1246450iXb3 = new EnumC1246450iXb("CLICK", 2, "click");
        CLICK = enumC1246450iXb3;
        EnumC1246450iXb[] enumC1246450iXbArr = {enumC1246450iXb, enumC1246450iXb2, enumC1246450iXb3};
        LLILLJJLI = enumC1246450iXbArr;
        LLILLL = new C2254308sP(enumC1246450iXbArr);
    }

    public static EnumC1246450iXb[] values() {
        return (EnumC1246450iXb[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1246450iXb valueOf(String str) {
        return (EnumC1246450iXb) C08FF.LIZ(EnumC1246450iXb.class, str);
    }

    public EnumC1246450iXb(String str, int i, String str2) {
        this.LL = str2;
    }
}
