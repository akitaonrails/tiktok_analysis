package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gC4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1156220gC4 {
    public static final EnumC1156220gC4 DISK;
    public static final /* synthetic */ EnumC1156220gC4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1156220gC4 MEMORY;
    public static final EnumC1156220gC4 REMOTE;

    public static InterfaceC2044707zh<EnumC1156220gC4> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1156220gC4 enumC1156220gC4 = new EnumC1156220gC4("MEMORY", 0);
        MEMORY = enumC1156220gC4;
        EnumC1156220gC4 enumC1156220gC42 = new EnumC1156220gC4("DISK", 1);
        DISK = enumC1156220gC42;
        EnumC1156220gC4 enumC1156220gC43 = new EnumC1156220gC4("REMOTE", 2);
        REMOTE = enumC1156220gC43;
        EnumC1156220gC4[] enumC1156220gC4Arr = {enumC1156220gC4, enumC1156220gC42, enumC1156220gC43};
        LL = enumC1156220gC4Arr;
        LLILLJJLI = new C2254308sP(enumC1156220gC4Arr);
    }

    public static EnumC1156220gC4[] values() {
        return (EnumC1156220gC4[]) LL.clone();
    }

    public static EnumC1156220gC4 valueOf(String str) {
        return (EnumC1156220gC4) C08FF.LIZ(EnumC1156220gC4.class, str);
    }

    public EnumC1156220gC4(String str, int i) {
    }
}
