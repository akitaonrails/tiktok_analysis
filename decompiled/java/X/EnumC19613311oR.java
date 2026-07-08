package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11oR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19613311oR {
    public static final EnumC19613311oR DEFAULT;
    public static final /* synthetic */ EnumC19613311oR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19613311oR STYLE_1;
    public static final EnumC19613311oR STYLE_2;
    public final int LL;

    public static InterfaceC2044707zh<EnumC19613311oR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19613311oR enumC19613311oR = new EnumC19613311oR(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC19613311oR;
        EnumC19613311oR enumC19613311oR2 = new EnumC19613311oR("STYLE_1", 1, 1);
        STYLE_1 = enumC19613311oR2;
        EnumC19613311oR enumC19613311oR3 = new EnumC19613311oR("STYLE_2", 2, 2);
        STYLE_2 = enumC19613311oR3;
        EnumC19613311oR[] enumC19613311oRArr = {enumC19613311oR, enumC19613311oR2, enumC19613311oR3};
        LLILLJJLI = enumC19613311oRArr;
        LLILLL = new C2254308sP(enumC19613311oRArr);
    }

    public static EnumC19613311oR[] values() {
        return (EnumC19613311oR[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC19613311oR valueOf(String str) {
        return (EnumC19613311oR) C08FF.LIZ(EnumC19613311oR.class, str);
    }

    public EnumC19613311oR(String str, int i, int i2) {
        this.LL = i2;
    }
}
