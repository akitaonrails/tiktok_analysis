package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15Ne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20509615Ne {
    public static final EnumC20509615Ne BLOCK;
    public static final EnumC20509615Ne EXCEED_SIZE;
    public static final /* synthetic */ EnumC20509615Ne[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20509615Ne NONE;
    public static final EnumC20509615Ne PRIVACY;
    public static final EnumC20509615Ne SELF_REMOVE;
    public static final EnumC20509615Ne VISIBILITY;

    public static InterfaceC2044707zh<EnumC20509615Ne> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20509615Ne enumC20509615Ne = new EnumC20509615Ne("NONE", 0);
        NONE = enumC20509615Ne;
        EnumC20509615Ne enumC20509615Ne2 = new EnumC20509615Ne("SELF_REMOVE", 1);
        SELF_REMOVE = enumC20509615Ne2;
        EnumC20509615Ne enumC20509615Ne3 = new EnumC20509615Ne("BLOCK", 2);
        BLOCK = enumC20509615Ne3;
        EnumC20509615Ne enumC20509615Ne4 = new EnumC20509615Ne("PRIVACY", 3);
        PRIVACY = enumC20509615Ne4;
        EnumC20509615Ne enumC20509615Ne5 = new EnumC20509615Ne("VISIBILITY", 4);
        VISIBILITY = enumC20509615Ne5;
        EnumC20509615Ne enumC20509615Ne6 = new EnumC20509615Ne("EXCEED_SIZE", 5);
        EXCEED_SIZE = enumC20509615Ne6;
        EnumC20509615Ne[] enumC20509615NeArr = {enumC20509615Ne, enumC20509615Ne2, enumC20509615Ne3, enumC20509615Ne4, enumC20509615Ne5, enumC20509615Ne6};
        LL = enumC20509615NeArr;
        LLILLJJLI = new C2254308sP(enumC20509615NeArr);
    }

    public static EnumC20509615Ne[] values() {
        return (EnumC20509615Ne[]) LL.clone();
    }

    public static EnumC20509615Ne valueOf(String str) {
        return (EnumC20509615Ne) C08FF.LIZ(EnumC20509615Ne.class, str);
    }

    public EnumC20509615Ne(String str, int i) {
    }
}
