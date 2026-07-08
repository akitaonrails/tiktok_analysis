package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zWK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1899140zWK {
    public static final EnumC1899140zWK FINISHED;
    public static final EnumC1899140zWK INITIAL;
    public static final /* synthetic */ EnumC1899140zWK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1899140zWK PAUSE;
    public static final EnumC1899140zWK START;
    public static final EnumC1899140zWK STOP;

    public static InterfaceC2044707zh<EnumC1899140zWK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1899140zWK enumC1899140zWK = new EnumC1899140zWK("INITIAL", 0);
        INITIAL = enumC1899140zWK;
        EnumC1899140zWK enumC1899140zWK2 = new EnumC1899140zWK("START", 1);
        START = enumC1899140zWK2;
        EnumC1899140zWK enumC1899140zWK3 = new EnumC1899140zWK("PAUSE", 2);
        PAUSE = enumC1899140zWK3;
        EnumC1899140zWK enumC1899140zWK4 = new EnumC1899140zWK("STOP", 3);
        STOP = enumC1899140zWK4;
        EnumC1899140zWK enumC1899140zWK5 = new EnumC1899140zWK("FINISHED", 4);
        FINISHED = enumC1899140zWK5;
        EnumC1899140zWK[] enumC1899140zWKArr = {enumC1899140zWK, enumC1899140zWK2, enumC1899140zWK3, enumC1899140zWK4, enumC1899140zWK5};
        LL = enumC1899140zWKArr;
        LLILLJJLI = new C2254308sP(enumC1899140zWKArr);
    }

    public static EnumC1899140zWK[] values() {
        return (EnumC1899140zWK[]) LL.clone();
    }

    public static EnumC1899140zWK valueOf(String str) {
        return (EnumC1899140zWK) C08FF.LIZ(EnumC1899140zWK.class, str);
    }

    public EnumC1899140zWK(String str, int i) {
    }
}
