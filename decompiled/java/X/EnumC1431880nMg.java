package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nMg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1431880nMg {
    public static final /* synthetic */ EnumC1431880nMg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1431880nMg NORMAL_PUBLISH;
    public static final EnumC1431880nMg NO_PUBLISH;
    public static final EnumC1431880nMg PRE_PUBLISH;
    public static final EnumC1431880nMg PRE_SYNTHETIC;

    public static InterfaceC2044707zh<EnumC1431880nMg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1431880nMg enumC1431880nMg = new EnumC1431880nMg("NO_PUBLISH", 0);
        NO_PUBLISH = enumC1431880nMg;
        EnumC1431880nMg enumC1431880nMg2 = new EnumC1431880nMg("NORMAL_PUBLISH", 1);
        NORMAL_PUBLISH = enumC1431880nMg2;
        EnumC1431880nMg enumC1431880nMg3 = new EnumC1431880nMg("PRE_SYNTHETIC", 2);
        PRE_SYNTHETIC = enumC1431880nMg3;
        EnumC1431880nMg enumC1431880nMg4 = new EnumC1431880nMg("PRE_PUBLISH", 3);
        PRE_PUBLISH = enumC1431880nMg4;
        EnumC1431880nMg[] enumC1431880nMgArr = {enumC1431880nMg, enumC1431880nMg2, enumC1431880nMg3, enumC1431880nMg4};
        LL = enumC1431880nMgArr;
        LLILLJJLI = new C2254308sP(enumC1431880nMgArr);
    }

    public static EnumC1431880nMg[] values() {
        return (EnumC1431880nMg[]) LL.clone();
    }

    public static EnumC1431880nMg valueOf(String str) {
        return (EnumC1431880nMg) C08FF.LIZ(EnumC1431880nMg.class, str);
    }

    public EnumC1431880nMg(String str, int i) {
    }
}
