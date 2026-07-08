package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w4F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1766410w4F {
    public static final EnumC1766410w4F AVAILABLE;
    public static final EnumC1766410w4F DEFAULT;
    public static final /* synthetic */ EnumC1766410w4F[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1766410w4F UNAVAILABLE;

    public static InterfaceC2044707zh<EnumC1766410w4F> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1766410w4F enumC1766410w4F = new EnumC1766410w4F(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1766410w4F;
        EnumC1766410w4F enumC1766410w4F2 = new EnumC1766410w4F("AVAILABLE", 1);
        AVAILABLE = enumC1766410w4F2;
        EnumC1766410w4F enumC1766410w4F3 = new EnumC1766410w4F("UNAVAILABLE", 2);
        UNAVAILABLE = enumC1766410w4F3;
        EnumC1766410w4F[] enumC1766410w4FArr = {enumC1766410w4F, enumC1766410w4F2, enumC1766410w4F3};
        LL = enumC1766410w4FArr;
        LLILLJJLI = new C2254308sP(enumC1766410w4FArr);
    }

    public static EnumC1766410w4F[] values() {
        return (EnumC1766410w4F[]) LL.clone();
    }

    public static EnumC1766410w4F valueOf(String str) {
        return (EnumC1766410w4F) C08FF.LIZ(EnumC1766410w4F.class, str);
    }

    public EnumC1766410w4F(String str, int i) {
    }
}
