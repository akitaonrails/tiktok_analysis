package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QWd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC671650QWd {
    public static final EnumC671650QWd END_WITHOUT_SPLIT;
    public static final EnumC671650QWd END_WITH_SPLIT;
    public static final EnumC671650QWd GONE;
    public static final /* synthetic */ EnumC671650QWd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC671650QWd START_WITH_SPLIT;

    public static InterfaceC2044707zh<EnumC671650QWd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC671650QWd enumC671650QWd = new EnumC671650QWd("GONE", 0);
        GONE = enumC671650QWd;
        EnumC671650QWd enumC671650QWd2 = new EnumC671650QWd("END_WITH_SPLIT", 1);
        END_WITH_SPLIT = enumC671650QWd2;
        EnumC671650QWd enumC671650QWd3 = new EnumC671650QWd("END_WITHOUT_SPLIT", 2);
        END_WITHOUT_SPLIT = enumC671650QWd3;
        EnumC671650QWd enumC671650QWd4 = new EnumC671650QWd("START_WITH_SPLIT", 3);
        START_WITH_SPLIT = enumC671650QWd4;
        EnumC671650QWd[] enumC671650QWdArr = {enumC671650QWd, enumC671650QWd2, enumC671650QWd3, enumC671650QWd4};
        LL = enumC671650QWdArr;
        LLILLJJLI = new C2254308sP(enumC671650QWdArr);
    }

    public static EnumC671650QWd[] values() {
        return (EnumC671650QWd[]) LL.clone();
    }

    public static EnumC671650QWd valueOf(String str) {
        return (EnumC671650QWd) C08FF.LIZ(EnumC671650QWd.class, str);
    }

    public EnumC671650QWd(String str, int i) {
    }
}
