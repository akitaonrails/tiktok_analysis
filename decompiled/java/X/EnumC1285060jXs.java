package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0jXs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1285060jXs {
    public static final EnumC1285060jXs DEFAULT;
    public static final EnumC1285060jXs DISABLE;
    public static final EnumC1285060jXs ENABLE;
    public static final /* synthetic */ EnumC1285060jXs[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1285060jXs> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1285060jXs enumC1285060jXs = new EnumC1285060jXs(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1285060jXs;
        EnumC1285060jXs enumC1285060jXs2 = new EnumC1285060jXs("ENABLE", 1);
        ENABLE = enumC1285060jXs2;
        EnumC1285060jXs enumC1285060jXs3 = new EnumC1285060jXs("DISABLE", 2);
        DISABLE = enumC1285060jXs3;
        EnumC1285060jXs[] enumC1285060jXsArr = {enumC1285060jXs, enumC1285060jXs2, enumC1285060jXs3};
        LL = enumC1285060jXsArr;
        LLILLJJLI = new C2254308sP(enumC1285060jXsArr);
    }

    public static EnumC1285060jXs[] values() {
        return (EnumC1285060jXs[]) LL.clone();
    }

    public static EnumC1285060jXs valueOf(String str) {
        return (EnumC1285060jXs) C08FF.LIZ(EnumC1285060jXs.class, str);
    }

    public EnumC1285060jXs(String str, int i) {
    }
}
