package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gHw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1159860gHw {
    public static final EnumC1159860gHw HIDDEN;
    public static final /* synthetic */ EnumC1159860gHw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1159860gHw PRE_HIDE;
    public static final EnumC1159860gHw PRE_SHOW;
    public static final EnumC1159860gHw SHOWN;

    public static InterfaceC2044707zh<EnumC1159860gHw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1159860gHw enumC1159860gHw = new EnumC1159860gHw("PRE_SHOW", 0);
        PRE_SHOW = enumC1159860gHw;
        EnumC1159860gHw enumC1159860gHw2 = new EnumC1159860gHw("SHOWN", 1);
        SHOWN = enumC1159860gHw2;
        EnumC1159860gHw enumC1159860gHw3 = new EnumC1159860gHw("PRE_HIDE", 2);
        PRE_HIDE = enumC1159860gHw3;
        EnumC1159860gHw enumC1159860gHw4 = new EnumC1159860gHw("HIDDEN", 3);
        HIDDEN = enumC1159860gHw4;
        EnumC1159860gHw[] enumC1159860gHwArr = {enumC1159860gHw, enumC1159860gHw2, enumC1159860gHw3, enumC1159860gHw4};
        LL = enumC1159860gHwArr;
        LLILLJJLI = new C2254308sP(enumC1159860gHwArr);
    }

    public static EnumC1159860gHw[] values() {
        return (EnumC1159860gHw[]) LL.clone();
    }

    public static EnumC1159860gHw valueOf(String str) {
        return (EnumC1159860gHw) C08FF.LIZ(EnumC1159860gHw.class, str);
    }

    public EnumC1159860gHw(String str, int i) {
    }
}
