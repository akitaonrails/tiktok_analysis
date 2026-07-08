package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1599390rir {
    public static final EnumC1599390rir INBOX_VH;
    public static final /* synthetic */ EnumC1599390rir[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1599390rir NONE;
    public static final EnumC1599390rir POPUP;

    public static InterfaceC2044707zh<EnumC1599390rir> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1599390rir enumC1599390rir = new EnumC1599390rir("NONE", 0);
        NONE = enumC1599390rir;
        EnumC1599390rir enumC1599390rir2 = new EnumC1599390rir("INBOX_VH", 1);
        INBOX_VH = enumC1599390rir2;
        EnumC1599390rir enumC1599390rir3 = new EnumC1599390rir("POPUP", 2);
        POPUP = enumC1599390rir3;
        EnumC1599390rir[] enumC1599390rirArr = {enumC1599390rir, enumC1599390rir2, enumC1599390rir3};
        LL = enumC1599390rirArr;
        LLILLJJLI = new C2254308sP(enumC1599390rirArr);
    }

    public static EnumC1599390rir[] values() {
        return (EnumC1599390rir[]) LL.clone();
    }

    public static EnumC1599390rir valueOf(String str) {
        return (EnumC1599390rir) C08FF.LIZ(EnumC1599390rir.class, str);
    }

    public EnumC1599390rir(String str, int i) {
    }
}
