package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DPc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC338580DPc {
    public static final EnumC338580DPc EDIT_SCHOOL;
    public static final EnumC338580DPc FIND_SCHOOL_FRIENDS;
    public static final /* synthetic */ EnumC338580DPc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC338580DPc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC338580DPc enumC338580DPc = new EnumC338580DPc("EDIT_SCHOOL", 0);
        EDIT_SCHOOL = enumC338580DPc;
        EnumC338580DPc enumC338580DPc2 = new EnumC338580DPc("FIND_SCHOOL_FRIENDS", 1);
        FIND_SCHOOL_FRIENDS = enumC338580DPc2;
        EnumC338580DPc[] enumC338580DPcArr = {enumC338580DPc, enumC338580DPc2};
        LL = enumC338580DPcArr;
        LLILLJJLI = new C2254308sP(enumC338580DPcArr);
    }

    public static EnumC338580DPc[] values() {
        return (EnumC338580DPc[]) LL.clone();
    }

    public static EnumC338580DPc valueOf(String str) {
        return (EnumC338580DPc) C08FF.LIZ(EnumC338580DPc.class, str);
    }

    public EnumC338580DPc(String str, int i) {
    }
}
