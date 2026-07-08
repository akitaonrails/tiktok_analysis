package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06sW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1745406sW {
    public static final EnumC1745406sW DEFAULT;
    public static final /* synthetic */ EnumC1745406sW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1745406sW SUGGESTED_QN_ANS;
    public static final EnumC1745406sW SUGGESTED_QN_ASK;
    public static final EnumC1745406sW SUGGESTED_QN_LIST;
    public static final EnumC1745406sW WELCOME;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1745406sW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1745406sW enumC1745406sW = new EnumC1745406sW("WELCOME", 0, "welcome_message");
        WELCOME = enumC1745406sW;
        EnumC1745406sW enumC1745406sW2 = new EnumC1745406sW("SUGGESTED_QN_LIST", 1, "suggested_question_list");
        SUGGESTED_QN_LIST = enumC1745406sW2;
        EnumC1745406sW enumC1745406sW3 = new EnumC1745406sW("SUGGESTED_QN_ASK", 2, "suggested_question_ask");
        SUGGESTED_QN_ASK = enumC1745406sW3;
        EnumC1745406sW enumC1745406sW4 = new EnumC1745406sW("SUGGESTED_QN_ANS", 3, "suggested_question_answer");
        SUGGESTED_QN_ANS = enumC1745406sW4;
        EnumC1745406sW enumC1745406sW5 = new EnumC1745406sW(LivePreviewCTASmartDisplayManager.DEFAULT, 4, "");
        DEFAULT = enumC1745406sW5;
        EnumC1745406sW[] enumC1745406sWArr = {enumC1745406sW, enumC1745406sW2, enumC1745406sW3, enumC1745406sW4, enumC1745406sW5};
        LLILLJJLI = enumC1745406sWArr;
        LLILLL = new C2254308sP(enumC1745406sWArr);
    }

    public static EnumC1745406sW[] values() {
        return (EnumC1745406sW[]) LLILLJJLI.clone();
    }

    public final String getLogValue() {
        return this.LL;
    }

    public static EnumC1745406sW valueOf(String str) {
        return (EnumC1745406sW) C08FF.LIZ(EnumC1745406sW.class, str);
    }

    public EnumC1745406sW(String str, int i, String str2) {
        this.LL = str2;
    }
}
