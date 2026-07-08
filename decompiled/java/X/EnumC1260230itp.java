package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0itp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1260230itp {
    public static final EnumC1260230itp DEFAULT;
    public static final EnumC1260230itp FOLLOWING_TAB;
    public static final EnumC1260230itp FRIENDS_TAB;
    public static final /* synthetic */ EnumC1260230itp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1260230itp OTHERS_PROFILE_HORIZONTAL;

    public static InterfaceC2044707zh<EnumC1260230itp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1260230itp enumC1260230itp = new EnumC1260230itp("OTHERS_PROFILE_HORIZONTAL", 0);
        OTHERS_PROFILE_HORIZONTAL = enumC1260230itp;
        EnumC1260230itp enumC1260230itp2 = new EnumC1260230itp("FOLLOWING_TAB", 1);
        FOLLOWING_TAB = enumC1260230itp2;
        EnumC1260230itp enumC1260230itp3 = new EnumC1260230itp("FRIENDS_TAB", 2);
        FRIENDS_TAB = enumC1260230itp3;
        EnumC1260230itp enumC1260230itp4 = new EnumC1260230itp(LivePreviewCTASmartDisplayManager.DEFAULT, 3);
        DEFAULT = enumC1260230itp4;
        EnumC1260230itp[] enumC1260230itpArr = {enumC1260230itp, enumC1260230itp2, enumC1260230itp3, enumC1260230itp4};
        LL = enumC1260230itpArr;
        LLILLJJLI = new C2254308sP(enumC1260230itpArr);
    }

    public static EnumC1260230itp[] values() {
        return (EnumC1260230itp[]) LL.clone();
    }

    public static EnumC1260230itp valueOf(String str) {
        return (EnumC1260230itp) C08FF.LIZ(EnumC1260230itp.class, str);
    }

    public EnumC1260230itp(String str, int i) {
    }
}
