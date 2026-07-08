package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c0B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC995090c0B {
    public static final /* synthetic */ EnumC995090c0B[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC995090c0B RED;
    public static final EnumC995090c0B WHITE;

    public static InterfaceC2044707zh<EnumC995090c0B> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC995090c0B enumC995090c0B = new EnumC995090c0B("RED", 0);
        RED = enumC995090c0B;
        EnumC995090c0B enumC995090c0B2 = new EnumC995090c0B("WHITE", 1);
        WHITE = enumC995090c0B2;
        EnumC995090c0B[] enumC995090c0BArr = {enumC995090c0B, enumC995090c0B2};
        LL = enumC995090c0BArr;
        LLILLJJLI = new C2254308sP(enumC995090c0BArr);
    }

    public static EnumC995090c0B[] values() {
        return (EnumC995090c0B[]) LL.clone();
    }

    public static EnumC995090c0B valueOf(String str) {
        return (EnumC995090c0B) C08FF.LIZ(EnumC995090c0B.class, str);
    }

    public EnumC995090c0B(String str, int i) {
    }
}
