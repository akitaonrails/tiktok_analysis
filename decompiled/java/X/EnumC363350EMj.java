package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EMj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC363350EMj {
    public static final EnumC363350EMj ALL_LOWER;
    public static final EnumC363350EMj ALL_UPPER;
    public static final EnumC363350EMj CAPITALIZE;
    public static final EnumC363350EMj DEFAULT;
    public static final /* synthetic */ EnumC363350EMj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC363350EMj NONE;

    public static InterfaceC2044707zh<EnumC363350EMj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC363350EMj enumC363350EMj = new EnumC363350EMj("NONE", 0);
        NONE = enumC363350EMj;
        EnumC363350EMj enumC363350EMj2 = new EnumC363350EMj(LivePreviewCTASmartDisplayManager.DEFAULT, 1);
        DEFAULT = enumC363350EMj2;
        EnumC363350EMj enumC363350EMj3 = new EnumC363350EMj("ALL_UPPER", 2);
        ALL_UPPER = enumC363350EMj3;
        EnumC363350EMj enumC363350EMj4 = new EnumC363350EMj("ALL_LOWER", 3);
        ALL_LOWER = enumC363350EMj4;
        EnumC363350EMj enumC363350EMj5 = new EnumC363350EMj("CAPITALIZE", 4);
        CAPITALIZE = enumC363350EMj5;
        EnumC363350EMj[] enumC363350EMjArr = {enumC363350EMj, enumC363350EMj2, enumC363350EMj3, enumC363350EMj4, enumC363350EMj5};
        LL = enumC363350EMjArr;
        LLILLJJLI = new C2254308sP(enumC363350EMjArr);
    }

    public static EnumC363350EMj[] values() {
        return (EnumC363350EMj[]) LL.clone();
    }

    public static EnumC363350EMj valueOf(String str) {
        return (EnumC363350EMj) C08FF.LIZ(EnumC363350EMj.class, str);
    }

    public EnumC363350EMj(String str, int i) {
    }
}
