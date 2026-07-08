package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10oE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19357210oE {
    public static final EnumC19357210oE COPY_LINK;
    public static final /* synthetic */ EnumC19357210oE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19357210oE RECORD_STICKER;

    public static InterfaceC2044707zh<EnumC19357210oE> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19357210oE enumC19357210oE = new EnumC19357210oE("RECORD_STICKER", 0);
        RECORD_STICKER = enumC19357210oE;
        EnumC19357210oE enumC19357210oE2 = new EnumC19357210oE("COPY_LINK", 1);
        COPY_LINK = enumC19357210oE2;
        EnumC19357210oE[] enumC19357210oEArr = {enumC19357210oE, enumC19357210oE2};
        LL = enumC19357210oEArr;
        LLILLJJLI = new C2254308sP(enumC19357210oEArr);
    }

    public static EnumC19357210oE[] values() {
        return (EnumC19357210oE[]) LL.clone();
    }

    public static EnumC19357210oE valueOf(String str) {
        return (EnumC19357210oE) C08FF.LIZ(EnumC19357210oE.class, str);
    }

    public EnumC19357210oE(String str, int i) {
    }
}
