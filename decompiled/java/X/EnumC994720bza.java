package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bza, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994720bza {
    public static final EnumC994720bza CLICK;
    public static final /* synthetic */ EnumC994720bza[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC994720bza SHOW;

    public static InterfaceC2044707zh<EnumC994720bza> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC994720bza enumC994720bza = new EnumC994720bza("SHOW", 0);
        SHOW = enumC994720bza;
        EnumC994720bza enumC994720bza2 = new EnumC994720bza("CLICK", 1);
        CLICK = enumC994720bza2;
        EnumC994720bza[] enumC994720bzaArr = {enumC994720bza, enumC994720bza2};
        LL = enumC994720bzaArr;
        LLILLJJLI = new C2254308sP(enumC994720bzaArr);
    }

    public static EnumC994720bza[] values() {
        return (EnumC994720bza[]) LL.clone();
    }

    public static EnumC994720bza valueOf(String str) {
        return (EnumC994720bza) C08FF.LIZ(EnumC994720bza.class, str);
    }

    public EnumC994720bza(String str, int i) {
    }
}
