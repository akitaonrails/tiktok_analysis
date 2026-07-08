package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0h1U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1188100h1U {
    public static final EnumC1188100h1U DEFAULT;
    public static final /* synthetic */ EnumC1188100h1U[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1188100h1U MULTI_TAB;
    public static final EnumC1188100h1U MULTI_TAG;

    public static InterfaceC2044707zh<EnumC1188100h1U> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1188100h1U enumC1188100h1U = new EnumC1188100h1U(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1188100h1U;
        EnumC1188100h1U enumC1188100h1U2 = new EnumC1188100h1U("MULTI_TAB", 1);
        MULTI_TAB = enumC1188100h1U2;
        EnumC1188100h1U enumC1188100h1U3 = new EnumC1188100h1U("MULTI_TAG", 2);
        MULTI_TAG = enumC1188100h1U3;
        EnumC1188100h1U[] enumC1188100h1UArr = {enumC1188100h1U, enumC1188100h1U2, enumC1188100h1U3};
        LL = enumC1188100h1UArr;
        LLILLJJLI = new C2254308sP(enumC1188100h1UArr);
    }

    public static EnumC1188100h1U[] values() {
        return (EnumC1188100h1U[]) LL.clone();
    }

    public static EnumC1188100h1U valueOf(String str) {
        return (EnumC1188100h1U) C08FF.LIZ(EnumC1188100h1U.class, str);
    }

    public EnumC1188100h1U(String str, int i) {
    }
}
