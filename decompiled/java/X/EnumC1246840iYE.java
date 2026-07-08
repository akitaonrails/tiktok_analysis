package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iYE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1246840iYE {
    public static final EnumC1246840iYE CLICK;
    public static final EnumC1246840iYE CLOSE;
    public static final /* synthetic */ EnumC1246840iYE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1246840iYE SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1246840iYE> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1246840iYE enumC1246840iYE = new EnumC1246840iYE("SHOW", 0, "show");
        SHOW = enumC1246840iYE;
        EnumC1246840iYE enumC1246840iYE2 = new EnumC1246840iYE("CLICK", 1, "click");
        CLICK = enumC1246840iYE2;
        EnumC1246840iYE enumC1246840iYE3 = new EnumC1246840iYE("CLOSE", 2, "close");
        CLOSE = enumC1246840iYE3;
        EnumC1246840iYE[] enumC1246840iYEArr = {enumC1246840iYE, enumC1246840iYE2, enumC1246840iYE3};
        LLILLJJLI = enumC1246840iYEArr;
        LLILLL = new C2254308sP(enumC1246840iYEArr);
    }

    public static EnumC1246840iYE[] values() {
        return (EnumC1246840iYE[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1246840iYE valueOf(String str) {
        return (EnumC1246840iYE) C08FF.LIZ(EnumC1246840iYE.class, str);
    }

    public EnumC1246840iYE(String str, int i, String str2) {
        this.LL = str2;
    }
}
