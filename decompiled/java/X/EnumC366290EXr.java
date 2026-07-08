package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EXr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC366290EXr {
    public static final EnumC366290EXr ADD;
    public static final EnumC366290EXr ALL;
    public static final EnumC366290EXr DELETE;
    public static final /* synthetic */ EnumC366290EXr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC366290EXr UPDATE;

    public static InterfaceC2044707zh<EnumC366290EXr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC366290EXr enumC366290EXr = new EnumC366290EXr("ADD", 0);
        ADD = enumC366290EXr;
        EnumC366290EXr enumC366290EXr2 = new EnumC366290EXr("DELETE", 1);
        DELETE = enumC366290EXr2;
        EnumC366290EXr enumC366290EXr3 = new EnumC366290EXr("UPDATE", 2);
        UPDATE = enumC366290EXr3;
        EnumC366290EXr enumC366290EXr4 = new EnumC366290EXr("ALL", 3);
        ALL = enumC366290EXr4;
        EnumC366290EXr[] enumC366290EXrArr = {enumC366290EXr, enumC366290EXr2, enumC366290EXr3, enumC366290EXr4};
        LL = enumC366290EXrArr;
        LLILLJJLI = new C2254308sP(enumC366290EXrArr);
    }

    public static EnumC366290EXr[] values() {
        return (EnumC366290EXr[]) LL.clone();
    }

    public static EnumC366290EXr valueOf(String str) {
        return (EnumC366290EXr) C08FF.LIZ(EnumC366290EXr.class, str);
    }

    public EnumC366290EXr(String str, int i) {
    }
}
