package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yNa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1855280yNa {
    public static final EnumC1855280yNa HIGH_VOLUME;
    public static final /* synthetic */ EnumC1855280yNa[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1855280yNa LOW_VOLUME;

    public static InterfaceC2044707zh<EnumC1855280yNa> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1855280yNa enumC1855280yNa = new EnumC1855280yNa("LOW_VOLUME", 0);
        LOW_VOLUME = enumC1855280yNa;
        EnumC1855280yNa enumC1855280yNa2 = new EnumC1855280yNa("HIGH_VOLUME", 1);
        HIGH_VOLUME = enumC1855280yNa2;
        EnumC1855280yNa[] enumC1855280yNaArr = {enumC1855280yNa, enumC1855280yNa2};
        LL = enumC1855280yNaArr;
        LLILLJJLI = new C2254308sP(enumC1855280yNaArr);
    }

    public static EnumC1855280yNa[] values() {
        return (EnumC1855280yNa[]) LL.clone();
    }

    public static EnumC1855280yNa valueOf(String str) {
        return (EnumC1855280yNa) C08FF.LIZ(EnumC1855280yNa.class, str);
    }

    public EnumC1855280yNa(String str, int i) {
    }
}
