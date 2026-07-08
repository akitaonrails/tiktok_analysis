package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lzQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1379020lzQ {
    public static final C1379010lzP Companion;
    public static final /* synthetic */ EnumC1379020lzQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1379020lzQ MINIS_TYPE_APP;
    public static final EnumC1379020lzQ MINIS_TYPE_GAME;
    public static final EnumC1379020lzQ MINIS_TYPE_NATIVE_GAME;
    public static final EnumC1379020lzQ MINIS_TYPE_UNKNOWN;

    public static InterfaceC2044707zh<EnumC1379020lzQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1379020lzQ enumC1379020lzQ = new EnumC1379020lzQ("MINIS_TYPE_UNKNOWN", 0);
        MINIS_TYPE_UNKNOWN = enumC1379020lzQ;
        EnumC1379020lzQ enumC1379020lzQ2 = new EnumC1379020lzQ("MINIS_TYPE_APP", 1);
        MINIS_TYPE_APP = enumC1379020lzQ2;
        EnumC1379020lzQ enumC1379020lzQ3 = new EnumC1379020lzQ("MINIS_TYPE_GAME", 2);
        MINIS_TYPE_GAME = enumC1379020lzQ3;
        EnumC1379020lzQ enumC1379020lzQ4 = new EnumC1379020lzQ("MINIS_TYPE_NATIVE_GAME", 3);
        MINIS_TYPE_NATIVE_GAME = enumC1379020lzQ4;
        EnumC1379020lzQ[] enumC1379020lzQArr = {enumC1379020lzQ, enumC1379020lzQ2, enumC1379020lzQ3, enumC1379020lzQ4};
        LL = enumC1379020lzQArr;
        LLILLJJLI = new C2254308sP(enumC1379020lzQArr);
        Companion = new C1379010lzP();
    }

    public static EnumC1379020lzQ[] values() {
        return (EnumC1379020lzQ[]) LL.clone();
    }

    public static EnumC1379020lzQ valueOf(String str) {
        return (EnumC1379020lzQ) C08FF.LIZ(EnumC1379020lzQ.class, str);
    }

    public EnumC1379020lzQ(String str, int i) {
    }
}
