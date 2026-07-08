package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HKt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC439370HKt {
    public static final EnumC439370HKt ALBUM;
    public static final EnumC439370HKt CAMERA;
    public static final /* synthetic */ EnumC439370HKt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC439370HKt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC439370HKt enumC439370HKt = new EnumC439370HKt("CAMERA", 0);
        CAMERA = enumC439370HKt;
        EnumC439370HKt enumC439370HKt2 = new EnumC439370HKt("ALBUM", 1);
        ALBUM = enumC439370HKt2;
        EnumC439370HKt[] enumC439370HKtArr = {enumC439370HKt, enumC439370HKt2};
        LL = enumC439370HKtArr;
        LLILLJJLI = new C2254308sP(enumC439370HKtArr);
    }

    public static EnumC439370HKt[] values() {
        return (EnumC439370HKt[]) LL.clone();
    }

    public static EnumC439370HKt valueOf(String str) {
        return (EnumC439370HKt) C08FF.LIZ(EnumC439370HKt.class, str);
    }

    public EnumC439370HKt(String str, int i) {
    }
}
