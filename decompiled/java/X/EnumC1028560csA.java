package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0csA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1028560csA implements InterfaceC593520NPq<String> {
    public static final /* synthetic */ EnumC1028560csA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1028560csA NONE;
    public static final EnumC1028560csA NON_FEED_DIALOG;
    public static final EnumC1028560csA NON_FEED_TAB;
    public static final EnumC1028560csA NON_LAUNCHER;
    public static final EnumC1028560csA PUSH;
    public static final EnumC1028560csA SHARE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1028560csA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1028560csA enumC1028560csA = new EnumC1028560csA("NONE", 0, CardStruct.IStatusCode.DEFAULT);
        NONE = enumC1028560csA;
        EnumC1028560csA enumC1028560csA2 = new EnumC1028560csA("PUSH", 1, "1");
        PUSH = enumC1028560csA2;
        EnumC1028560csA enumC1028560csA3 = new EnumC1028560csA("SHARE", 2, "2");
        SHARE = enumC1028560csA3;
        EnumC1028560csA enumC1028560csA4 = new EnumC1028560csA("NON_FEED_TAB", 3, "3");
        NON_FEED_TAB = enumC1028560csA4;
        EnumC1028560csA enumC1028560csA5 = new EnumC1028560csA("NON_FEED_DIALOG", 4, "4");
        NON_FEED_DIALOG = enumC1028560csA5;
        EnumC1028560csA enumC1028560csA6 = new EnumC1028560csA("NON_LAUNCHER", 5, "5");
        NON_LAUNCHER = enumC1028560csA6;
        EnumC1028560csA[] enumC1028560csAArr = {enumC1028560csA, enumC1028560csA2, enumC1028560csA3, enumC1028560csA4, enumC1028560csA5, enumC1028560csA6};
        LLILLJJLI = enumC1028560csAArr;
        LLILLL = new C2254308sP(enumC1028560csAArr);
    }

    public static EnumC1028560csA[] values() {
        return (EnumC1028560csA[]) LLILLJJLI.clone();
    }

    @Override // X.InterfaceC593520NPq
    public String getParamValue() {
        return this.LL;
    }

    public static EnumC1028560csA valueOf(String str) {
        return (EnumC1028560csA) C08FF.LIZ(EnumC1028560csA.class, str);
    }

    public EnumC1028560csA(String str, int i, String str2) {
        this.LL = str2;
    }
}
