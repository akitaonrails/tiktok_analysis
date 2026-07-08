package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01on, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC448301on {
    public static final EnumC448301on DEFAULT;
    public static final /* synthetic */ EnumC448301on[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC448301on LOTTIE;

    public static InterfaceC2044707zh<EnumC448301on> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC448301on enumC448301on = new EnumC448301on(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC448301on;
        EnumC448301on enumC448301on2 = new EnumC448301on("LOTTIE", 1);
        LOTTIE = enumC448301on2;
        EnumC448301on[] enumC448301onArr = {enumC448301on, enumC448301on2};
        LL = enumC448301onArr;
        LLILLJJLI = new C2254308sP(enumC448301onArr);
    }

    public static EnumC448301on[] values() {
        return (EnumC448301on[]) LL.clone();
    }

    public static EnumC448301on valueOf(String str) {
        return (EnumC448301on) C08FF.LIZ(EnumC448301on.class, str);
    }

    public EnumC448301on(String str, int i) {
    }
}
