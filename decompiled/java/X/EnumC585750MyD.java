package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MyD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC585750MyD {
    public static final EnumC585750MyD COMMENT;
    public static final EnumC585750MyD DEFAULT;
    public static final /* synthetic */ EnumC585750MyD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC585750MyD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC585750MyD enumC585750MyD = new EnumC585750MyD(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC585750MyD;
        EnumC585750MyD enumC585750MyD2 = new EnumC585750MyD("COMMENT", 1);
        COMMENT = enumC585750MyD2;
        EnumC585750MyD[] enumC585750MyDArr = {enumC585750MyD, enumC585750MyD2};
        LL = enumC585750MyDArr;
        LLILLJJLI = new C2254308sP(enumC585750MyDArr);
    }

    public static EnumC585750MyD[] values() {
        return (EnumC585750MyD[]) LL.clone();
    }

    public static EnumC585750MyD valueOf(String str) {
        return (EnumC585750MyD) C08FF.LIZ(EnumC585750MyD.class, str);
    }

    public EnumC585750MyD(String str, int i) {
    }
}
