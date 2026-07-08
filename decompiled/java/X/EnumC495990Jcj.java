package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Jcj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC495990Jcj {
    public static final EnumC495990Jcj DEFAULT;
    public static final /* synthetic */ EnumC495990Jcj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC495990Jcj OPEN_LIVING_CREATOR_PROFILE_FROM_SCENE_RANKING;
    public static final EnumC495990Jcj OPEN_PROFILE_FROM_SCENE_CREATOR_RANKING;

    public static InterfaceC2044707zh<EnumC495990Jcj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC495990Jcj enumC495990Jcj = new EnumC495990Jcj(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC495990Jcj;
        EnumC495990Jcj enumC495990Jcj2 = new EnumC495990Jcj("OPEN_PROFILE_FROM_SCENE_CREATOR_RANKING", 1);
        OPEN_PROFILE_FROM_SCENE_CREATOR_RANKING = enumC495990Jcj2;
        EnumC495990Jcj enumC495990Jcj3 = new EnumC495990Jcj("OPEN_LIVING_CREATOR_PROFILE_FROM_SCENE_RANKING", 2);
        OPEN_LIVING_CREATOR_PROFILE_FROM_SCENE_RANKING = enumC495990Jcj3;
        EnumC495990Jcj[] enumC495990JcjArr = {enumC495990Jcj, enumC495990Jcj2, enumC495990Jcj3};
        LL = enumC495990JcjArr;
        LLILLJJLI = new C2254308sP(enumC495990JcjArr);
    }

    public static EnumC495990Jcj[] values() {
        return (EnumC495990Jcj[]) LL.clone();
    }

    public static EnumC495990Jcj valueOf(String str) {
        return (EnumC495990Jcj) C08FF.LIZ(EnumC495990Jcj.class, str);
    }

    public EnumC495990Jcj(String str, int i) {
    }
}
