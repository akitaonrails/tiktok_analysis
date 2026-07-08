package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hyo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1224880hyo {
    public static final EnumC1224880hyo END;
    public static final /* synthetic */ EnumC1224880hyo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1224880hyo START;

    public static InterfaceC2044707zh<EnumC1224880hyo> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1224880hyo enumC1224880hyo = new EnumC1224880hyo("START", 0);
        START = enumC1224880hyo;
        EnumC1224880hyo enumC1224880hyo2 = new EnumC1224880hyo("END", 1);
        END = enumC1224880hyo2;
        EnumC1224880hyo[] enumC1224880hyoArr = {enumC1224880hyo, enumC1224880hyo2};
        LL = enumC1224880hyoArr;
        LLILLJJLI = new C2254308sP(enumC1224880hyoArr);
    }

    public static EnumC1224880hyo[] values() {
        return (EnumC1224880hyo[]) LL.clone();
    }

    public static EnumC1224880hyo valueOf(String str) {
        return (EnumC1224880hyo) C08FF.LIZ(EnumC1224880hyo.class, str);
    }

    public EnumC1224880hyo(String str, int i) {
    }
}
