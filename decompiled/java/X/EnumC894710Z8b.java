package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Z8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC894710Z8b {
    public static final EnumC894710Z8b ACTIVE_HOUR;
    public static final EnumC894710Z8b ACTIVE_MINUTE;
    public static final EnumC894710Z8b ACTIVE_NOW;
    public static final EnumC894710Z8b ACTIVE_ON_WHEE;
    public static final EnumC894710Z8b ACTIVE_TODAY;
    public static final EnumC894710Z8b ACTIVE_YESTERDAY;
    public static final EnumC894710Z8b DEFAULT;
    public static final /* synthetic */ EnumC894710Z8b[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC894710Z8b NO_STATUS;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC894710Z8b> getEntries() {
        return LLILZ;
    }

    static {
        EnumC894710Z8b enumC894710Z8b = new EnumC894710Z8b(LivePreviewCTASmartDisplayManager.DEFAULT, 0, -1, "default");
        DEFAULT = enumC894710Z8b;
        EnumC894710Z8b enumC894710Z8b2 = new EnumC894710Z8b("NO_STATUS", 1, 0, "no_status");
        NO_STATUS = enumC894710Z8b2;
        EnumC894710Z8b enumC894710Z8b3 = new EnumC894710Z8b("ACTIVE_NOW", 2, 1, "active_now");
        ACTIVE_NOW = enumC894710Z8b3;
        EnumC894710Z8b enumC894710Z8b4 = new EnumC894710Z8b("ACTIVE_MINUTE", 3, 2, "active_minute");
        ACTIVE_MINUTE = enumC894710Z8b4;
        EnumC894710Z8b enumC894710Z8b5 = new EnumC894710Z8b("ACTIVE_HOUR", 4, 3, "active_hour");
        ACTIVE_HOUR = enumC894710Z8b5;
        EnumC894710Z8b enumC894710Z8b6 = new EnumC894710Z8b("ACTIVE_TODAY", 5, 4, "active_today");
        ACTIVE_TODAY = enumC894710Z8b6;
        EnumC894710Z8b enumC894710Z8b7 = new EnumC894710Z8b("ACTIVE_YESTERDAY", 6, 5, "active_yesterday");
        ACTIVE_YESTERDAY = enumC894710Z8b7;
        EnumC894710Z8b enumC894710Z8b8 = new EnumC894710Z8b("ACTIVE_ON_WHEE", 7, 6, "active_on_whee");
        ACTIVE_ON_WHEE = enumC894710Z8b8;
        EnumC894710Z8b[] enumC894710Z8bArr = {enumC894710Z8b, enumC894710Z8b2, enumC894710Z8b3, enumC894710Z8b4, enumC894710Z8b5, enumC894710Z8b6, enumC894710Z8b7, enumC894710Z8b8};
        LLILLL = enumC894710Z8bArr;
        LLILZ = new C2254308sP(enumC894710Z8bArr);
    }

    public static EnumC894710Z8b[] values() {
        return (EnumC894710Z8b[]) LLILLL.clone();
    }

    public final String getEventValue() {
        return this.LLILLJJLI;
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC894710Z8b valueOf(String str) {
        return (EnumC894710Z8b) C08FF.LIZ(EnumC894710Z8b.class, str);
    }

    public EnumC894710Z8b(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
