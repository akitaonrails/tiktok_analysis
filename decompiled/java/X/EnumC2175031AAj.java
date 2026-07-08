package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1AAj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC2175031AAj {
    public static final EnumC2175031AAj CHANGE_TO_LIVE_STREAM;
    public static final /* synthetic */ EnumC2175031AAj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2175031AAj RESUME_FEED_PLAY;
    public static final EnumC2175031AAj SELECT;
    public static final EnumC2175031AAj UNSELECTED;

    public static InterfaceC2044707zh<EnumC2175031AAj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2175031AAj enumC2175031AAj = new EnumC2175031AAj("RESUME_FEED_PLAY", 0);
        RESUME_FEED_PLAY = enumC2175031AAj;
        EnumC2175031AAj enumC2175031AAj2 = new EnumC2175031AAj("SELECT", 1);
        SELECT = enumC2175031AAj2;
        EnumC2175031AAj enumC2175031AAj3 = new EnumC2175031AAj("CHANGE_TO_LIVE_STREAM", 2);
        CHANGE_TO_LIVE_STREAM = enumC2175031AAj3;
        EnumC2175031AAj enumC2175031AAj4 = new EnumC2175031AAj("UNSELECTED", 3);
        UNSELECTED = enumC2175031AAj4;
        EnumC2175031AAj[] enumC2175031AAjArr = {enumC2175031AAj, enumC2175031AAj2, enumC2175031AAj3, enumC2175031AAj4};
        LL = enumC2175031AAjArr;
        LLILLJJLI = new C2254308sP(enumC2175031AAjArr);
    }

    public static EnumC2175031AAj[] values() {
        return (EnumC2175031AAj[]) LL.clone();
    }

    public static EnumC2175031AAj valueOf(String str) {
        return (EnumC2175031AAj) C08FF.LIZ(EnumC2175031AAj.class, str);
    }

    public EnumC2175031AAj(String str, int i) {
    }
}
