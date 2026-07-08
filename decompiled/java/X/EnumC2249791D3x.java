package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1D3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class EnumC2249791D3x {
    public static final EnumC2249791D3x ACTIVE;
    public static final EnumC2249791D3x DEFAULT;
    public static final EnumC2249791D3x DRAGGING;
    public static final EnumC2249791D3x FROZEN;
    public static final /* synthetic */ EnumC2249791D3x[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC2249791D3x> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2249791D3x enumC2249791D3x = new EnumC2249791D3x("FROZEN", 0);
        FROZEN = enumC2249791D3x;
        EnumC2249791D3x enumC2249791D3x2 = new EnumC2249791D3x(LivePreviewCTASmartDisplayManager.DEFAULT, 1);
        DEFAULT = enumC2249791D3x2;
        EnumC2249791D3x enumC2249791D3x3 = new EnumC2249791D3x("ACTIVE", 2);
        ACTIVE = enumC2249791D3x3;
        EnumC2249791D3x enumC2249791D3x4 = new EnumC2249791D3x("DRAGGING", 3);
        DRAGGING = enumC2249791D3x4;
        EnumC2249791D3x[] enumC2249791D3xArr = {enumC2249791D3x, enumC2249791D3x2, enumC2249791D3x3, enumC2249791D3x4};
        LL = enumC2249791D3xArr;
        LLILLJJLI = new C2254308sP(enumC2249791D3xArr);
    }

    public static EnumC2249791D3x[] values() {
        return (EnumC2249791D3x[]) LL.clone();
    }

    public static EnumC2249791D3x valueOf(String str) {
        return (EnumC2249791D3x) C08FF.LIZ(EnumC2249791D3x.class, str);
    }

    public EnumC2249791D3x(String str, int i) {
    }
}
