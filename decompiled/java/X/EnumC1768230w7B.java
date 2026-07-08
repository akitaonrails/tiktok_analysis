package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w7B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1768230w7B {
    public static final EnumC1768230w7B BUBBLE;
    public static final EnumC1768230w7B DEFAULT;
    public static final EnumC1768230w7B ICON;
    public static final /* synthetic */ EnumC1768230w7B[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1768230w7B REDDOT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1768230w7B> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1768230w7B enumC1768230w7B = new EnumC1768230w7B(LivePreviewCTASmartDisplayManager.DEFAULT, 0, "default");
        DEFAULT = enumC1768230w7B;
        EnumC1768230w7B enumC1768230w7B2 = new EnumC1768230w7B("BUBBLE", 1, "bubble");
        BUBBLE = enumC1768230w7B2;
        EnumC1768230w7B enumC1768230w7B3 = new EnumC1768230w7B("ICON", 2, "icon");
        ICON = enumC1768230w7B3;
        EnumC1768230w7B enumC1768230w7B4 = new EnumC1768230w7B("REDDOT", 3, "reddot");
        REDDOT = enumC1768230w7B4;
        EnumC1768230w7B[] enumC1768230w7BArr = {enumC1768230w7B, enumC1768230w7B2, enumC1768230w7B3, enumC1768230w7B4};
        LLILLJJLI = enumC1768230w7BArr;
        LLILLL = new C2254308sP(enumC1768230w7BArr);
    }

    public static EnumC1768230w7B[] values() {
        return (EnumC1768230w7B[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1768230w7B valueOf(String str) {
        return (EnumC1768230w7B) C08FF.LIZ(EnumC1768230w7B.class, str);
    }

    public EnumC1768230w7B(String str, int i, String str2) {
        this.LL = str2;
    }
}
