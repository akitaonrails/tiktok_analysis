package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N4w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC588120N4w {
    public static final EnumC588120N4w AVATAR_WIDGET;
    public static final /* synthetic */ EnumC588120N4w[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "avatar_widget";

    public static InterfaceC2044707zh<EnumC588120N4w> getEntries() {
        return LLILLL;
    }

    static {
        EnumC588120N4w enumC588120N4w = new EnumC588120N4w();
        AVATAR_WIDGET = enumC588120N4w;
        EnumC588120N4w[] enumC588120N4wArr = {enumC588120N4w};
        LLILLJJLI = enumC588120N4wArr;
        LLILLL = new C2254308sP(enumC588120N4wArr);
    }

    public static EnumC588120N4w[] values() {
        return (EnumC588120N4w[]) LLILLJJLI.clone();
    }

    public final String getScene() {
        return this.LL;
    }

    public static EnumC588120N4w valueOf(String str) {
        return (EnumC588120N4w) C08FF.LIZ(EnumC588120N4w.class, str);
    }
}
