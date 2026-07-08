package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wUp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782890wUp {
    public static final EnumC1782890wUp INITIAL;
    public static final /* synthetic */ EnumC1782890wUp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1782890wUp LOADING;
    public static final EnumC1782890wUp PLAYING;

    public static InterfaceC2044707zh<EnumC1782890wUp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1782890wUp enumC1782890wUp = new EnumC1782890wUp("INITIAL", 0);
        INITIAL = enumC1782890wUp;
        EnumC1782890wUp enumC1782890wUp2 = new EnumC1782890wUp("LOADING", 1);
        LOADING = enumC1782890wUp2;
        EnumC1782890wUp enumC1782890wUp3 = new EnumC1782890wUp("PLAYING", 2);
        PLAYING = enumC1782890wUp3;
        EnumC1782890wUp[] enumC1782890wUpArr = {enumC1782890wUp, enumC1782890wUp2, enumC1782890wUp3};
        LL = enumC1782890wUpArr;
        LLILLJJLI = new C2254308sP(enumC1782890wUpArr);
    }

    public static EnumC1782890wUp[] values() {
        return (EnumC1782890wUp[]) LL.clone();
    }

    public static EnumC1782890wUp valueOf(String str) {
        return (EnumC1782890wUp) C08FF.LIZ(EnumC1782890wUp.class, str);
    }

    public EnumC1782890wUp(String str, int i) {
    }
}
