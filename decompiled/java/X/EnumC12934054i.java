package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.054i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC12934054i {
    public static final EnumC12934054i DO_FRAME;
    public static final /* synthetic */ EnumC12934054i[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC12934054i NO_CACHE;
    public static final EnumC12934054i SAME_MESSAGE;

    public static InterfaceC2044707zh<EnumC12934054i> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC12934054i enumC12934054i = new EnumC12934054i("NO_CACHE", 0);
        NO_CACHE = enumC12934054i;
        EnumC12934054i enumC12934054i2 = new EnumC12934054i("SAME_MESSAGE", 1);
        SAME_MESSAGE = enumC12934054i2;
        EnumC12934054i enumC12934054i3 = new EnumC12934054i("DO_FRAME", 2);
        DO_FRAME = enumC12934054i3;
        EnumC12934054i[] enumC12934054iArr = {enumC12934054i, enumC12934054i2, enumC12934054i3};
        LL = enumC12934054iArr;
        LLILLJJLI = new C2254308sP(enumC12934054iArr);
    }

    public static EnumC12934054i[] values() {
        return (EnumC12934054i[]) LL.clone();
    }

    public static EnumC12934054i valueOf(String str) {
        return (EnumC12934054i) C08FF.LIZ(EnumC12934054i.class, str);
    }

    public EnumC12934054i(String str, int i) {
    }
}
