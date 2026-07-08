package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eoC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1102980eoC {
    public static final EnumC1102980eoC COLORFUL;
    public static final EnumC1102980eoC DEFAULT;
    public static final EnumC1102980eoC GRAY;
    public static final EnumC1102980eoC HIGHLIGHT;
    public static final /* synthetic */ EnumC1102980eoC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1102980eoC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1102980eoC enumC1102980eoC = new EnumC1102980eoC("GRAY", 0);
        GRAY = enumC1102980eoC;
        EnumC1102980eoC enumC1102980eoC2 = new EnumC1102980eoC("COLORFUL", 1);
        COLORFUL = enumC1102980eoC2;
        EnumC1102980eoC enumC1102980eoC3 = new EnumC1102980eoC("HIGHLIGHT", 2);
        HIGHLIGHT = enumC1102980eoC3;
        EnumC1102980eoC enumC1102980eoC4 = new EnumC1102980eoC(LivePreviewCTASmartDisplayManager.DEFAULT, 3);
        DEFAULT = enumC1102980eoC4;
        EnumC1102980eoC[] enumC1102980eoCArr = {enumC1102980eoC, enumC1102980eoC2, enumC1102980eoC3, enumC1102980eoC4};
        LL = enumC1102980eoCArr;
        LLILLJJLI = new C2254308sP(enumC1102980eoCArr);
    }

    public static EnumC1102980eoC[] values() {
        return (EnumC1102980eoC[]) LL.clone();
    }

    public static EnumC1102980eoC valueOf(String str) {
        return (EnumC1102980eoC) C08FF.LIZ(EnumC1102980eoC.class, str);
    }

    public EnumC1102980eoC(String str, int i) {
    }
}
