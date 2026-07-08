package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10tC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19388010tC {
    public static final EnumC19388010tC DEFAULT;
    public static final /* synthetic */ EnumC19388010tC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19388010tC ROUND_CORNER_RECT;

    public static InterfaceC2044707zh<EnumC19388010tC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19388010tC enumC19388010tC = new EnumC19388010tC(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC19388010tC;
        EnumC19388010tC enumC19388010tC2 = new EnumC19388010tC("ROUND_CORNER_RECT", 1);
        ROUND_CORNER_RECT = enumC19388010tC2;
        EnumC19388010tC[] enumC19388010tCArr = {enumC19388010tC, enumC19388010tC2};
        LL = enumC19388010tCArr;
        LLILLJJLI = new C2254308sP(enumC19388010tCArr);
    }

    public static EnumC19388010tC[] values() {
        return (EnumC19388010tC[]) LL.clone();
    }

    public static EnumC19388010tC valueOf(String str) {
        return (EnumC19388010tC) C08FF.LIZ(EnumC19388010tC.class, str);
    }

    public EnumC19388010tC(String str, int i) {
    }
}
