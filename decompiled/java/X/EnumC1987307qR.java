package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1987307qR {
    public static final /* synthetic */ EnumC1987307qR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1987307qR VOICE_CALL;

    public static InterfaceC2044707zh<EnumC1987307qR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1987307qR enumC1987307qR = new EnumC1987307qR();
        VOICE_CALL = enumC1987307qR;
        EnumC1987307qR[] enumC1987307qRArr = {enumC1987307qR};
        LL = enumC1987307qRArr;
        LLILLJJLI = new C2254308sP(enumC1987307qRArr);
    }

    public static EnumC1987307qR[] values() {
        return (EnumC1987307qR[]) LL.clone();
    }

    public static EnumC1987307qR valueOf(String str) {
        return (EnumC1987307qR) C08FF.LIZ(EnumC1987307qR.class, str);
    }
}
