package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Grw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC428980Grw {
    public static final EnumC428980Grw END;
    public static final /* synthetic */ EnumC428980Grw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC428980Grw START;

    public static InterfaceC2044707zh<EnumC428980Grw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC428980Grw enumC428980Grw = new EnumC428980Grw("START", 0);
        START = enumC428980Grw;
        EnumC428980Grw enumC428980Grw2 = new EnumC428980Grw("END", 1);
        END = enumC428980Grw2;
        EnumC428980Grw[] enumC428980GrwArr = {enumC428980Grw, enumC428980Grw2};
        LL = enumC428980GrwArr;
        LLILLJJLI = new C2254308sP(enumC428980GrwArr);
    }

    public static EnumC428980Grw[] values() {
        return (EnumC428980Grw[]) LL.clone();
    }

    public static EnumC428980Grw valueOf(String str) {
        return (EnumC428980Grw) C08FF.LIZ(EnumC428980Grw.class, str);
    }

    public EnumC428980Grw(String str, int i) {
    }
}
