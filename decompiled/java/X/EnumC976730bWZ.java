package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bWZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC976730bWZ {
    public static final /* synthetic */ EnumC976730bWZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC976730bWZ P0;
    public static final EnumC976730bWZ P1;

    public static InterfaceC2044707zh<EnumC976730bWZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC976730bWZ enumC976730bWZ = new EnumC976730bWZ("P0", 0);
        P0 = enumC976730bWZ;
        EnumC976730bWZ enumC976730bWZ2 = new EnumC976730bWZ("P1", 1);
        P1 = enumC976730bWZ2;
        EnumC976730bWZ[] enumC976730bWZArr = {enumC976730bWZ, enumC976730bWZ2};
        LL = enumC976730bWZArr;
        LLILLJJLI = new C2254308sP(enumC976730bWZArr);
    }

    public static EnumC976730bWZ[] values() {
        return (EnumC976730bWZ[]) LL.clone();
    }

    public static EnumC976730bWZ valueOf(String str) {
        return (EnumC976730bWZ) C08FF.LIZ(EnumC976730bWZ.class, str);
    }

    public EnumC976730bWZ(String str, int i) {
    }
}
