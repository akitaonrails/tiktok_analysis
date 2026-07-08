package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ECr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC360830ECr {
    public static final EnumC360830ECr ADD_AUTO_BEAT;
    public static final EnumC360830ECr ADD_BEAT;
    public static final EnumC360830ECr DELETE_BEAT;
    public static final EnumC360830ECr INIT_LOAD;
    public static final /* synthetic */ EnumC360830ECr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC360830ECr REMOVE_AUTO_BEAT;
    public static final EnumC360830ECr RESET_BEATS;

    public static InterfaceC2044707zh<EnumC360830ECr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC360830ECr enumC360830ECr = new EnumC360830ECr("INIT_LOAD", 0);
        INIT_LOAD = enumC360830ECr;
        EnumC360830ECr enumC360830ECr2 = new EnumC360830ECr("ADD_BEAT", 1);
        ADD_BEAT = enumC360830ECr2;
        EnumC360830ECr enumC360830ECr3 = new EnumC360830ECr("DELETE_BEAT", 2);
        DELETE_BEAT = enumC360830ECr3;
        EnumC360830ECr enumC360830ECr4 = new EnumC360830ECr("ADD_AUTO_BEAT", 3);
        ADD_AUTO_BEAT = enumC360830ECr4;
        EnumC360830ECr enumC360830ECr5 = new EnumC360830ECr("REMOVE_AUTO_BEAT", 4);
        REMOVE_AUTO_BEAT = enumC360830ECr5;
        EnumC360830ECr enumC360830ECr6 = new EnumC360830ECr("RESET_BEATS", 5);
        RESET_BEATS = enumC360830ECr6;
        EnumC360830ECr[] enumC360830ECrArr = {enumC360830ECr, enumC360830ECr2, enumC360830ECr3, enumC360830ECr4, enumC360830ECr5, enumC360830ECr6};
        LL = enumC360830ECrArr;
        LLILLJJLI = new C2254308sP(enumC360830ECrArr);
    }

    public static EnumC360830ECr[] values() {
        return (EnumC360830ECr[]) LL.clone();
    }

    public static EnumC360830ECr valueOf(String str) {
        return (EnumC360830ECr) C08FF.LIZ(EnumC360830ECr.class, str);
    }

    public EnumC360830ECr(String str, int i) {
    }
}
