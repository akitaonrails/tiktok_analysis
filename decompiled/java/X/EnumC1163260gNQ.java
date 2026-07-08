package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gNQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1163260gNQ {
    public static final EnumC1163260gNQ CLASSIC;
    public static final C1163250gNP Companion;
    public static final EnumC1163260gNQ DEFAULT;
    public static final /* synthetic */ EnumC1163260gNQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1163260gNQ RAIN;
    public static final EnumC1163260gNQ WAVE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1163260gNQ> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0gNP] */
    static {
        EnumC1163260gNQ enumC1163260gNQ = new EnumC1163260gNQ("CLASSIC", 0, "classic");
        CLASSIC = enumC1163260gNQ;
        EnumC1163260gNQ enumC1163260gNQ2 = new EnumC1163260gNQ("RAIN", 1, "rain");
        RAIN = enumC1163260gNQ2;
        EnumC1163260gNQ enumC1163260gNQ3 = new EnumC1163260gNQ("WAVE", 2, "wave");
        WAVE = enumC1163260gNQ3;
        EnumC1163260gNQ enumC1163260gNQ4 = new EnumC1163260gNQ(LivePreviewCTASmartDisplayManager.DEFAULT, 3, "rain");
        DEFAULT = enumC1163260gNQ4;
        EnumC1163260gNQ[] enumC1163260gNQArr = {enumC1163260gNQ, enumC1163260gNQ2, enumC1163260gNQ3, enumC1163260gNQ4};
        LLILLJJLI = enumC1163260gNQArr;
        LLILLL = new C2254308sP(enumC1163260gNQArr);
        Companion = new Object() { // from class: X.0gNP
        };
    }

    public static EnumC1163260gNQ[] values() {
        return (EnumC1163260gNQ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1163260gNQ valueOf(String str) {
        return (EnumC1163260gNQ) C08FF.LIZ(EnumC1163260gNQ.class, str);
    }

    public EnumC1163260gNQ(String str, int i, String str2) {
        this.LL = str2;
    }
}
