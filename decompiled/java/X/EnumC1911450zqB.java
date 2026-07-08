package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zqB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1911450zqB {
    public static final EnumC1911450zqB BOTTOM_SHEET;
    public static final C1911480zqE Companion;
    public static final EnumC1911450zqB DEFAULT;
    public static final EnumC1911450zqB INLINE;
    public static final /* synthetic */ EnumC1911450zqB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1911450zqB> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0zqE] */
    static {
        EnumC1911450zqB enumC1911450zqB = new EnumC1911450zqB(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1911450zqB;
        EnumC1911450zqB enumC1911450zqB2 = new EnumC1911450zqB("BOTTOM_SHEET", 1);
        BOTTOM_SHEET = enumC1911450zqB2;
        EnumC1911450zqB enumC1911450zqB3 = new EnumC1911450zqB("INLINE", 2);
        INLINE = enumC1911450zqB3;
        EnumC1911450zqB[] enumC1911450zqBArr = {enumC1911450zqB, enumC1911450zqB2, enumC1911450zqB3};
        LL = enumC1911450zqBArr;
        LLILLJJLI = new C2254308sP(enumC1911450zqBArr);
        Companion = new Object() { // from class: X.0zqE
        };
    }

    public static EnumC1911450zqB[] values() {
        return (EnumC1911450zqB[]) LL.clone();
    }

    public final boolean isDefault() {
        return this == DEFAULT;
    }

    public static EnumC1911450zqB valueOf(String str) {
        return (EnumC1911450zqB) C08FF.LIZ(EnumC1911450zqB.class, str);
    }

    public EnumC1911450zqB(String str, int i) {
    }
}
