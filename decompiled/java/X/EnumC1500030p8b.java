package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0p8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1500030p8b {
    public static final EnumC1500030p8b DAILY_SCREEN_TIME;
    public static final EnumC1500030p8b DEFAULT;
    public static final /* synthetic */ EnumC1500030p8b[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1500030p8b SLEEP_HOUR;
    public static final EnumC1500030p8b SLEEP_HOUR_LYNX_OVERLAY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1500030p8b> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1500030p8b enumC1500030p8b = new EnumC1500030p8b("SLEEP_HOUR_LYNX_OVERLAY", 0, 9);
        SLEEP_HOUR_LYNX_OVERLAY = enumC1500030p8b;
        EnumC1500030p8b enumC1500030p8b2 = new EnumC1500030p8b("SLEEP_HOUR", 1, 11);
        SLEEP_HOUR = enumC1500030p8b2;
        EnumC1500030p8b enumC1500030p8b3 = new EnumC1500030p8b("DAILY_SCREEN_TIME", 2, 12);
        DAILY_SCREEN_TIME = enumC1500030p8b3;
        EnumC1500030p8b enumC1500030p8b4 = new EnumC1500030p8b(LivePreviewCTASmartDisplayManager.DEFAULT, 3, 99);
        DEFAULT = enumC1500030p8b4;
        EnumC1500030p8b[] enumC1500030p8bArr = {enumC1500030p8b, enumC1500030p8b2, enumC1500030p8b3, enumC1500030p8b4};
        LLILLJJLI = enumC1500030p8bArr;
        LLILLL = new C2254308sP(enumC1500030p8bArr);
    }

    public static EnumC1500030p8b[] values() {
        return (EnumC1500030p8b[]) LLILLJJLI.clone();
    }

    public final int getI() {
        return this.LL;
    }

    public static EnumC1500030p8b valueOf(String str) {
        return (EnumC1500030p8b) C08FF.LIZ(EnumC1500030p8b.class, str);
    }

    public EnumC1500030p8b(String str, int i, int i2) {
        this.LL = i2;
    }
}
