package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1D3r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class EnumC2249731D3r {
    public static final EnumC2249731D3r DEFAULT;
    public static final /* synthetic */ EnumC2249731D3r[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2249731D3r SYNTHESISED;
    public static final EnumC2249731D3r UPLOADED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2249731D3r> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2249731D3r enumC2249731D3r = new EnumC2249731D3r("UPLOADED", 0, "uploaded");
        UPLOADED = enumC2249731D3r;
        EnumC2249731D3r enumC2249731D3r2 = new EnumC2249731D3r("SYNTHESISED", 1, "synthesised");
        SYNTHESISED = enumC2249731D3r2;
        EnumC2249731D3r enumC2249731D3r3 = new EnumC2249731D3r(LivePreviewCTASmartDisplayManager.DEFAULT, 2, "default");
        DEFAULT = enumC2249731D3r3;
        EnumC2249731D3r[] enumC2249731D3rArr = {enumC2249731D3r, enumC2249731D3r2, enumC2249731D3r3};
        LLILLJJLI = enumC2249731D3rArr;
        LLILLL = new C2254308sP(enumC2249731D3rArr);
    }

    public static EnumC2249731D3r[] values() {
        return (EnumC2249731D3r[]) LLILLJJLI.clone();
    }

    public final String getStrategy() {
        return this.LL;
    }

    public static EnumC2249731D3r valueOf(String str) {
        return (EnumC2249731D3r) C08FF.LIZ(EnumC2249731D3r.class, str);
    }

    public EnumC2249731D3r(String str, int i, String str2) {
        this.LL = str2;
    }
}
