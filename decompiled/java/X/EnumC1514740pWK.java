package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pWK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1514740pWK {
    public static final EnumC1514740pWK CommonChange;
    public static final EnumC1514740pWK End;
    public static final /* synthetic */ EnumC1514740pWK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1514740pWK Mark;
    public static final EnumC1514740pWK ReceivedCustom;
    public static final EnumC1514740pWK ReceivedIssue;
    public static final EnumC1514740pWK Start;

    public static InterfaceC2044707zh<EnumC1514740pWK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1514740pWK enumC1514740pWK = new EnumC1514740pWK("Start", 0);
        Start = enumC1514740pWK;
        EnumC1514740pWK enumC1514740pWK2 = new EnumC1514740pWK("Mark", 1);
        Mark = enumC1514740pWK2;
        EnumC1514740pWK enumC1514740pWK3 = new EnumC1514740pWK("CommonChange", 2);
        CommonChange = enumC1514740pWK3;
        EnumC1514740pWK enumC1514740pWK4 = new EnumC1514740pWK("ReceivedCustom", 3);
        ReceivedCustom = enumC1514740pWK4;
        EnumC1514740pWK enumC1514740pWK5 = new EnumC1514740pWK("ReceivedIssue", 4);
        ReceivedIssue = enumC1514740pWK5;
        EnumC1514740pWK enumC1514740pWK6 = new EnumC1514740pWK("End", 5);
        End = enumC1514740pWK6;
        EnumC1514740pWK[] enumC1514740pWKArr = {enumC1514740pWK, enumC1514740pWK2, enumC1514740pWK3, enumC1514740pWK4, enumC1514740pWK5, enumC1514740pWK6};
        LL = enumC1514740pWKArr;
        LLILLJJLI = new C2254308sP(enumC1514740pWKArr);
    }

    public static EnumC1514740pWK[] values() {
        return (EnumC1514740pWK[]) LL.clone();
    }

    public static EnumC1514740pWK valueOf(String str) {
        return (EnumC1514740pWK) C08FF.LIZ(EnumC1514740pWK.class, str);
    }

    public EnumC1514740pWK(String str, int i) {
    }
}
