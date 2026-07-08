package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eoD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1102990eoD {
    public static final EnumC1102990eoD COLORFUL;
    public static final EnumC1102990eoD DEFAULT;
    public static final EnumC1102990eoD GRAY;
    public static final EnumC1102990eoD HIGHLIGHT;
    public static final /* synthetic */ EnumC1102990eoD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1102990eoD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1102990eoD enumC1102990eoD = new EnumC1102990eoD("GRAY", 0);
        GRAY = enumC1102990eoD;
        EnumC1102990eoD enumC1102990eoD2 = new EnumC1102990eoD("COLORFUL", 1);
        COLORFUL = enumC1102990eoD2;
        EnumC1102990eoD enumC1102990eoD3 = new EnumC1102990eoD("HIGHLIGHT", 2);
        HIGHLIGHT = enumC1102990eoD3;
        EnumC1102990eoD enumC1102990eoD4 = new EnumC1102990eoD(LivePreviewCTASmartDisplayManager.DEFAULT, 3);
        DEFAULT = enumC1102990eoD4;
        EnumC1102990eoD[] enumC1102990eoDArr = {enumC1102990eoD, enumC1102990eoD2, enumC1102990eoD3, enumC1102990eoD4};
        LL = enumC1102990eoDArr;
        LLILLJJLI = new C2254308sP(enumC1102990eoDArr);
    }

    public static EnumC1102990eoD[] values() {
        return (EnumC1102990eoD[]) LL.clone();
    }

    public static EnumC1102990eoD valueOf(String str) {
        return (EnumC1102990eoD) C08FF.LIZ(EnumC1102990eoD.class, str);
    }

    public EnumC1102990eoD(String str, int i) {
    }
}
