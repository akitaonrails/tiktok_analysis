package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Dp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC043500Dp implements Serializable {
    public static final EnumC043500Dp DEFAULT;
    public static final EnumC043500Dp LAUNCH_CSP_CHECKOUT;
    public static final /* synthetic */ EnumC043500Dp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC043500Dp> getEntries() {
        return LLILLL;
    }

    static {
        EnumC043500Dp enumC043500Dp = new EnumC043500Dp(LivePreviewCTASmartDisplayManager.DEFAULT, 0, CardStruct.IStatusCode.DEFAULT);
        DEFAULT = enumC043500Dp;
        EnumC043500Dp enumC043500Dp2 = new EnumC043500Dp("LAUNCH_CSP_CHECKOUT", 1, "1");
        LAUNCH_CSP_CHECKOUT = enumC043500Dp2;
        EnumC043500Dp[] enumC043500DpArr = {enumC043500Dp, enumC043500Dp2};
        LLILLJJLI = enumC043500DpArr;
        LLILLL = new C2254308sP(enumC043500DpArr);
    }

    public static EnumC043500Dp[] values() {
        return (EnumC043500Dp[]) LLILLJJLI.clone();
    }

    public final String getRawValue() {
        return this.LL;
    }

    public static EnumC043500Dp valueOf(String str) {
        return (EnumC043500Dp) C08FF.LIZ(EnumC043500Dp.class, str);
    }

    public EnumC043500Dp(String str, int i, String str2) {
        this.LL = str2;
    }
}
