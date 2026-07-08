package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14wr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20429914wr {
    public static final EnumC20429914wr ENTRANCE;
    public static final /* synthetic */ EnumC20429914wr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20429914wr PAGE;

    public static InterfaceC2044707zh<EnumC20429914wr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20429914wr enumC20429914wr = new EnumC20429914wr("PAGE", 0);
        PAGE = enumC20429914wr;
        EnumC20429914wr enumC20429914wr2 = new EnumC20429914wr("ENTRANCE", 1);
        ENTRANCE = enumC20429914wr2;
        EnumC20429914wr[] enumC20429914wrArr = {enumC20429914wr, enumC20429914wr2};
        LL = enumC20429914wrArr;
        LLILLJJLI = new C2254308sP(enumC20429914wrArr);
    }

    public static EnumC20429914wr[] values() {
        return (EnumC20429914wr[]) LL.clone();
    }

    public static EnumC20429914wr valueOf(String str) {
        return (EnumC20429914wr) C08FF.LIZ(EnumC20429914wr.class, str);
    }

    public EnumC20429914wr(String str, int i) {
    }
}
