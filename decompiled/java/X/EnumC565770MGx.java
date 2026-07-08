package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MGx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC565770MGx {
    public static final EnumC565770MGx DEFAULT;
    public static final EnumC565770MGx IMAGE;
    public static final /* synthetic */ EnumC565770MGx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC565770MGx VIDEO;
    public static final EnumC565770MGx ZIP;

    public static InterfaceC2044707zh<EnumC565770MGx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC565770MGx enumC565770MGx = new EnumC565770MGx("IMAGE", 0);
        IMAGE = enumC565770MGx;
        EnumC565770MGx enumC565770MGx2 = new EnumC565770MGx("VIDEO", 1);
        VIDEO = enumC565770MGx2;
        EnumC565770MGx enumC565770MGx3 = new EnumC565770MGx("ZIP", 2);
        ZIP = enumC565770MGx3;
        EnumC565770MGx enumC565770MGx4 = new EnumC565770MGx(LivePreviewCTASmartDisplayManager.DEFAULT, 3);
        DEFAULT = enumC565770MGx4;
        EnumC565770MGx[] enumC565770MGxArr = {enumC565770MGx, enumC565770MGx2, enumC565770MGx3, enumC565770MGx4};
        LL = enumC565770MGxArr;
        LLILLJJLI = new C2254308sP(enumC565770MGxArr);
    }

    public static EnumC565770MGx[] values() {
        return (EnumC565770MGx[]) LL.clone();
    }

    public static EnumC565770MGx valueOf(String str) {
        return (EnumC565770MGx) C08FF.LIZ(EnumC565770MGx.class, str);
    }

    public EnumC565770MGx(String str, int i) {
    }
}
