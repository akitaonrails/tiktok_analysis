package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07rb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1994507rb {
    public static final EnumC1994507rb CONST_BLACK;
    public static final EnumC1994507rb DARK_MODE;
    public static final EnumC1994507rb DEFAULT;
    public static final /* synthetic */ EnumC1994507rb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1994507rb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1994507rb enumC1994507rb = new EnumC1994507rb(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1994507rb;
        EnumC1994507rb enumC1994507rb2 = new EnumC1994507rb("CONST_BLACK", 1, 1);
        CONST_BLACK = enumC1994507rb2;
        EnumC1994507rb enumC1994507rb3 = new EnumC1994507rb("DARK_MODE", 2, 2);
        DARK_MODE = enumC1994507rb3;
        EnumC1994507rb[] enumC1994507rbArr = {enumC1994507rb, enumC1994507rb2, enumC1994507rb3};
        LLILLJJLI = enumC1994507rbArr;
        LLILLL = new C2254308sP(enumC1994507rbArr);
    }

    public static EnumC1994507rb[] values() {
        return (EnumC1994507rb[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1994507rb valueOf(String str) {
        return (EnumC1994507rb) C08FF.LIZ(EnumC1994507rb.class, str);
    }

    public EnumC1994507rb(String str, int i, int i2) {
        this.LL = i2;
    }
}
