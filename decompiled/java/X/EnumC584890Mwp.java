package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Mwp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC584890Mwp {
    public static final EnumC584890Mwp COMMENT;
    public static final /* synthetic */ EnumC584890Mwp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC584890Mwp SUB_SPACE;

    public static InterfaceC2044707zh<EnumC584890Mwp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC584890Mwp enumC584890Mwp = new EnumC584890Mwp("COMMENT", 0);
        COMMENT = enumC584890Mwp;
        EnumC584890Mwp enumC584890Mwp2 = new EnumC584890Mwp("SUB_SPACE", 1);
        SUB_SPACE = enumC584890Mwp2;
        EnumC584890Mwp[] enumC584890MwpArr = {enumC584890Mwp, enumC584890Mwp2};
        LL = enumC584890MwpArr;
        LLILLJJLI = new C2254308sP(enumC584890MwpArr);
    }

    public static EnumC584890Mwp[] values() {
        return (EnumC584890Mwp[]) LL.clone();
    }

    public static EnumC584890Mwp valueOf(String str) {
        return (EnumC584890Mwp) C08FF.LIZ(EnumC584890Mwp.class, str);
    }

    public EnumC584890Mwp(String str, int i) {
    }
}
