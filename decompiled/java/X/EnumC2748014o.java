package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.014o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2748014o {
    public static final EnumC2748014o CLICK;
    public static final /* synthetic */ EnumC2748014o[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2748014o SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2748014o> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2748014o enumC2748014o = new EnumC2748014o("CLICK", 0, "click");
        CLICK = enumC2748014o;
        EnumC2748014o enumC2748014o2 = new EnumC2748014o("SHOW", 1, "show");
        SHOW = enumC2748014o2;
        EnumC2748014o[] enumC2748014oArr = {enumC2748014o, enumC2748014o2};
        LLILLJJLI = enumC2748014oArr;
        LLILLL = new C2254308sP(enumC2748014oArr);
    }

    public static EnumC2748014o[] values() {
        return (EnumC2748014o[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC2748014o valueOf(String str) {
        return (EnumC2748014o) C08FF.LIZ(EnumC2748014o.class, str);
    }

    public EnumC2748014o(String str, int i, String str2) {
        this.LL = str2;
    }
}
