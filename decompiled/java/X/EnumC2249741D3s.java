package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1D3s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class EnumC2249741D3s {
    public static final EnumC2249741D3s DEFAULT;
    public static final /* synthetic */ EnumC2249741D3s[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2249741D3s SYNTHESISED;
    public static final EnumC2249741D3s UPLOADED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2249741D3s> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2249741D3s enumC2249741D3s = new EnumC2249741D3s(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC2249741D3s;
        EnumC2249741D3s enumC2249741D3s2 = new EnumC2249741D3s("SYNTHESISED", 1, 1);
        SYNTHESISED = enumC2249741D3s2;
        EnumC2249741D3s enumC2249741D3s3 = new EnumC2249741D3s("UPLOADED", 2, 3);
        UPLOADED = enumC2249741D3s3;
        EnumC2249741D3s[] enumC2249741D3sArr = {enumC2249741D3s, enumC2249741D3s2, enumC2249741D3s3};
        LLILLJJLI = enumC2249741D3sArr;
        LLILLL = new C2254308sP(enumC2249741D3sArr);
    }

    public static EnumC2249741D3s[] values() {
        return (EnumC2249741D3s[]) LLILLJJLI.clone();
    }

    public final int getState() {
        return this.LL;
    }

    public static EnumC2249741D3s valueOf(String str) {
        return (EnumC2249741D3s) C08FF.LIZ(EnumC2249741D3s.class, str);
    }

    public EnumC2249741D3s(String str, int i, int i2) {
        this.LL = i2;
    }
}
