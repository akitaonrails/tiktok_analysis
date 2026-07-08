package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0324009i {
    public static final EnumC0324009i DSP_ACTION_SHOW;
    public static final /* synthetic */ EnumC0324009i[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL = 4;

    public static InterfaceC2044707zh<EnumC0324009i> getEntries() {
        return LLILLL;
    }

    static {
        EnumC0324009i enumC0324009i = new EnumC0324009i();
        DSP_ACTION_SHOW = enumC0324009i;
        EnumC0324009i[] enumC0324009iArr = {enumC0324009i};
        LLILLJJLI = enumC0324009iArr;
        LLILLL = new C2254308sP(enumC0324009iArr);
    }

    public static EnumC0324009i[] values() {
        return (EnumC0324009i[]) LLILLJJLI.clone();
    }

    public final int getNumber() {
        return this.LL;
    }

    public static EnumC0324009i valueOf(String str) {
        return (EnumC0324009i) C08FF.LIZ(EnumC0324009i.class, str);
    }
}
