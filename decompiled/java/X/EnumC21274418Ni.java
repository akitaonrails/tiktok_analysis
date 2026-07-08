package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18Ni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21274418Ni {
    public static final EnumC21274418Ni DEFAULT;
    public static final /* synthetic */ EnumC21274418Ni[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC21274418Ni PUSH;
    public static final EnumC21274418Ni SHARE;

    public static InterfaceC2044707zh<EnumC21274418Ni> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC21274418Ni enumC21274418Ni = new EnumC21274418Ni(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC21274418Ni;
        EnumC21274418Ni enumC21274418Ni2 = new EnumC21274418Ni("SHARE", 1);
        SHARE = enumC21274418Ni2;
        EnumC21274418Ni enumC21274418Ni3 = new EnumC21274418Ni("PUSH", 2);
        PUSH = enumC21274418Ni3;
        EnumC21274418Ni[] enumC21274418NiArr = {enumC21274418Ni, enumC21274418Ni2, enumC21274418Ni3};
        LL = enumC21274418NiArr;
        LLILLJJLI = new C2254308sP(enumC21274418NiArr);
    }

    public static EnumC21274418Ni[] values() {
        return (EnumC21274418Ni[]) LL.clone();
    }

    public static EnumC21274418Ni valueOf(String str) {
        return (EnumC21274418Ni) C08FF.LIZ(EnumC21274418Ni.class, str);
    }

    public EnumC21274418Ni(String str, int i) {
    }
}
