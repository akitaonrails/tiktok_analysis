package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0l4w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1344000l4w {
    public static final /* synthetic */ EnumC1344000l4w[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1344000l4w MIX;
    public static final EnumC1344000l4w UPLOAD;
    public static final EnumC1344000l4w VISUAL_POET;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1344000l4w> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1344000l4w enumC1344000l4w = new EnumC1344000l4w("MIX", 0, "mix");
        MIX = enumC1344000l4w;
        EnumC1344000l4w enumC1344000l4w2 = new EnumC1344000l4w("UPLOAD", 1, "upload");
        UPLOAD = enumC1344000l4w2;
        EnumC1344000l4w enumC1344000l4w3 = new EnumC1344000l4w("VISUAL_POET", 2, "visual_poet");
        VISUAL_POET = enumC1344000l4w3;
        EnumC1344000l4w[] enumC1344000l4wArr = {enumC1344000l4w, enumC1344000l4w2, enumC1344000l4w3};
        LLILLJJLI = enumC1344000l4wArr;
        LLILLL = new C2254308sP(enumC1344000l4wArr);
    }

    public static EnumC1344000l4w[] values() {
        return (EnumC1344000l4w[]) LLILLJJLI.clone();
    }

    public final String getDescription() {
        return this.LL;
    }

    public static EnumC1344000l4w valueOf(String str) {
        return (EnumC1344000l4w) C08FF.LIZ(EnumC1344000l4w.class, str);
    }

    public EnumC1344000l4w(String str, int i, String str2) {
        this.LL = str2;
    }
}
