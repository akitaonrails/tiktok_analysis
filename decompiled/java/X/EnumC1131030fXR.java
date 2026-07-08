package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fXR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1131030fXR {
    public static final EnumC1131030fXR GIFT;
    public static final /* synthetic */ EnumC1131030fXR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1131030fXR MUSIC_GIFT;

    public static InterfaceC2044707zh<EnumC1131030fXR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1131030fXR enumC1131030fXR = new EnumC1131030fXR("GIFT", 0);
        GIFT = enumC1131030fXR;
        EnumC1131030fXR enumC1131030fXR2 = new EnumC1131030fXR("MUSIC_GIFT", 1);
        MUSIC_GIFT = enumC1131030fXR2;
        EnumC1131030fXR[] enumC1131030fXRArr = {enumC1131030fXR, enumC1131030fXR2};
        LL = enumC1131030fXRArr;
        LLILLJJLI = new C2254308sP(enumC1131030fXRArr);
    }

    public static EnumC1131030fXR[] values() {
        return (EnumC1131030fXR[]) LL.clone();
    }

    public static EnumC1131030fXR valueOf(String str) {
        return (EnumC1131030fXR) C08FF.LIZ(EnumC1131030fXR.class, str);
    }

    public EnumC1131030fXR(String str, int i) {
    }
}
