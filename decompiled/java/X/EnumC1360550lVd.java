package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lVd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1360550lVd {
    public static final EnumC1360550lVd FRIENDS_WATERFALL;
    public static final /* synthetic */ EnumC1360550lVd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1360550lVd OPEN_PANEL;
    public static final EnumC1360550lVd POOLING;
    public static final EnumC1360550lVd UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1360550lVd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1360550lVd enumC1360550lVd = new EnumC1360550lVd("UNKNOWN", 0, 100);
        UNKNOWN = enumC1360550lVd;
        EnumC1360550lVd enumC1360550lVd2 = new EnumC1360550lVd("OPEN_PANEL", 1, 101);
        OPEN_PANEL = enumC1360550lVd2;
        EnumC1360550lVd enumC1360550lVd3 = new EnumC1360550lVd("POOLING", 2, 102);
        POOLING = enumC1360550lVd3;
        EnumC1360550lVd enumC1360550lVd4 = new EnumC1360550lVd("FRIENDS_WATERFALL", 3, 103);
        FRIENDS_WATERFALL = enumC1360550lVd4;
        EnumC1360550lVd[] enumC1360550lVdArr = {enumC1360550lVd, enumC1360550lVd2, enumC1360550lVd3, enumC1360550lVd4};
        LLILLJJLI = enumC1360550lVdArr;
        LLILLL = new C2254308sP(enumC1360550lVdArr);
    }

    public static EnumC1360550lVd[] values() {
        return (EnumC1360550lVd[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1360550lVd valueOf(String str) {
        return (EnumC1360550lVd) C08FF.LIZ(EnumC1360550lVd.class, str);
    }

    public EnumC1360550lVd(String str, int i, int i2) {
        this.LL = i2;
    }
}
