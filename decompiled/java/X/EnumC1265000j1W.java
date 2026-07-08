package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0j1W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1265000j1W {
    public static final EnumC1265000j1W DEFAULT;
    public static final EnumC1265000j1W FOLLOWER;
    public static final EnumC1265000j1W FOLLOWING;
    public static final /* synthetic */ EnumC1265000j1W[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1265000j1W> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1265000j1W enumC1265000j1W = new EnumC1265000j1W(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1265000j1W;
        EnumC1265000j1W enumC1265000j1W2 = new EnumC1265000j1W("FOLLOWING", 1);
        FOLLOWING = enumC1265000j1W2;
        EnumC1265000j1W enumC1265000j1W3 = new EnumC1265000j1W("FOLLOWER", 2);
        FOLLOWER = enumC1265000j1W3;
        EnumC1265000j1W[] enumC1265000j1WArr = {enumC1265000j1W, enumC1265000j1W2, enumC1265000j1W3};
        LL = enumC1265000j1WArr;
        LLILLJJLI = new C2254308sP(enumC1265000j1WArr);
    }

    public static EnumC1265000j1W[] values() {
        return (EnumC1265000j1W[]) LL.clone();
    }

    public static EnumC1265000j1W valueOf(String str) {
        return (EnumC1265000j1W) C08FF.LIZ(EnumC1265000j1W.class, str);
    }

    public EnumC1265000j1W(String str, int i) {
    }
}
