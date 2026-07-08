package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EIs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC362400EIs {
    public static final EnumC362400EIs CLICK_CLOSE;
    public static final EnumC362400EIs CLICK_GOT_IT;
    public static final /* synthetic */ EnumC362400EIs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC362400EIs SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC362400EIs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC362400EIs enumC362400EIs = new EnumC362400EIs("SHOW", 0, "show");
        SHOW = enumC362400EIs;
        EnumC362400EIs enumC362400EIs2 = new EnumC362400EIs("CLICK_GOT_IT", 1, "click_got_it");
        CLICK_GOT_IT = enumC362400EIs2;
        EnumC362400EIs enumC362400EIs3 = new EnumC362400EIs("CLICK_CLOSE", 2, "click_close");
        CLICK_CLOSE = enumC362400EIs3;
        EnumC362400EIs[] enumC362400EIsArr = {enumC362400EIs, enumC362400EIs2, enumC362400EIs3};
        LLILLJJLI = enumC362400EIsArr;
        LLILLL = new C2254308sP(enumC362400EIsArr);
    }

    public static EnumC362400EIs[] values() {
        return (EnumC362400EIs[]) LLILLJJLI.clone();
    }

    public final String getAction() {
        return this.LL;
    }

    public static EnumC362400EIs valueOf(String str) {
        return (EnumC362400EIs) C08FF.LIZ(EnumC362400EIs.class, str);
    }

    public EnumC362400EIs(String str, int i, String str2) {
        this.LL = str2;
    }
}
