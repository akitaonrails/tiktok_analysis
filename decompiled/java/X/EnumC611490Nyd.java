package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Nyd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC611490Nyd {
    public static final EnumC611490Nyd FAIL;
    public static final EnumC611490Nyd INFERENCING;
    public static final /* synthetic */ EnumC611490Nyd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC611490Nyd SUCCESS;

    public static InterfaceC2044707zh<EnumC611490Nyd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC611490Nyd enumC611490Nyd = new EnumC611490Nyd("INFERENCING", 0);
        INFERENCING = enumC611490Nyd;
        EnumC611490Nyd enumC611490Nyd2 = new EnumC611490Nyd("SUCCESS", 1);
        SUCCESS = enumC611490Nyd2;
        EnumC611490Nyd enumC611490Nyd3 = new EnumC611490Nyd("FAIL", 2);
        FAIL = enumC611490Nyd3;
        EnumC611490Nyd[] enumC611490NydArr = {enumC611490Nyd, enumC611490Nyd2, enumC611490Nyd3};
        LL = enumC611490NydArr;
        LLILLJJLI = new C2254308sP(enumC611490NydArr);
    }

    public static EnumC611490Nyd[] values() {
        return (EnumC611490Nyd[]) LL.clone();
    }

    public static EnumC611490Nyd valueOf(String str) {
        return (EnumC611490Nyd) C08FF.LIZ(EnumC611490Nyd.class, str);
    }

    public EnumC611490Nyd(String str, int i) {
    }
}
