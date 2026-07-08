package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15aR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20545715aR {
    public static final EnumC20545715aR LL;
    public static final EnumC20545715aR LLILLJJLI;
    public static final EnumC20545715aR LLILLL;
    public static final EnumC20545715aR LLILZ;
    public static final EnumC20545715aR LLILZIL;
    public static final /* synthetic */ EnumC20545715aR[] LLILZLL;

    static {
        EnumC20545715aR enumC20545715aR = new EnumC20545715aR("IDLE", 0);
        LL = enumC20545715aR;
        EnumC20545715aR enumC20545715aR2 = new EnumC20545715aR("LOADING", 1);
        LLILLJJLI = enumC20545715aR2;
        EnumC20545715aR enumC20545715aR3 = new EnumC20545715aR("SUCCESS", 2);
        LLILLL = enumC20545715aR3;
        EnumC20545715aR enumC20545715aR4 = new EnumC20545715aR("CONSUMED", 3);
        LLILZ = enumC20545715aR4;
        EnumC20545715aR enumC20545715aR5 = new EnumC20545715aR("FAILED", 4);
        LLILZIL = enumC20545715aR5;
        EnumC20545715aR[] enumC20545715aRArr = {enumC20545715aR, enumC20545715aR2, enumC20545715aR3, enumC20545715aR4, enumC20545715aR5};
        LLILZLL = enumC20545715aRArr;
        new C2254308sP(enumC20545715aRArr);
    }

    public static EnumC20545715aR[] values() {
        return (EnumC20545715aR[]) LLILZLL.clone();
    }

    public static EnumC20545715aR valueOf(String str) {
        return (EnumC20545715aR) C08FF.LIZ(EnumC20545715aR.class, str);
    }

    public EnumC20545715aR(String str, int i) {
    }
}
