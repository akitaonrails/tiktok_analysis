package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07rd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1994707rd {
    public static final EnumC1994707rd DEFAULT;
    public static final EnumC1994707rd DISABLE;
    public static final /* synthetic */ EnumC1994707rd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1994707rd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1994707rd enumC1994707rd = new EnumC1994707rd(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1994707rd;
        EnumC1994707rd enumC1994707rd2 = new EnumC1994707rd("DISABLE", 1, 1);
        DISABLE = enumC1994707rd2;
        EnumC1994707rd[] enumC1994707rdArr = {enumC1994707rd, enumC1994707rd2};
        LLILLJJLI = enumC1994707rdArr;
        LLILLL = new C2254308sP(enumC1994707rdArr);
    }

    public static EnumC1994707rd[] values() {
        return (EnumC1994707rd[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1994707rd valueOf(String str) {
        return (EnumC1994707rd) C08FF.LIZ(EnumC1994707rd.class, str);
    }

    public EnumC1994707rd(String str, int i, int i2) {
        this.LL = i2;
    }
}
