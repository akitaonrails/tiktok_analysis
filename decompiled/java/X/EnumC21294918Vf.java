package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18Vf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21294918Vf {
    public static final EnumC21294918Vf DEFAULT;
    public static final EnumC21294918Vf IMAGE_ACTION_BAR;
    public static final EnumC21294918Vf IMAGE_ADDED;
    public static final EnumC21294918Vf IMAGE_ENTRANCE_VISIBLE;
    public static final EnumC21294918Vf IMAGE_MAXED;
    public static final /* synthetic */ EnumC21294918Vf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC21294918Vf REINFORCE;
    public static final EnumC21294918Vf TEXT_ONLY;

    public static InterfaceC2044707zh<EnumC21294918Vf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC21294918Vf enumC21294918Vf = new EnumC21294918Vf("REINFORCE", 0);
        REINFORCE = enumC21294918Vf;
        EnumC21294918Vf enumC21294918Vf2 = new EnumC21294918Vf(LivePreviewCTASmartDisplayManager.DEFAULT, 1);
        DEFAULT = enumC21294918Vf2;
        EnumC21294918Vf enumC21294918Vf3 = new EnumC21294918Vf("IMAGE_ENTRANCE_VISIBLE", 2);
        IMAGE_ENTRANCE_VISIBLE = enumC21294918Vf3;
        EnumC21294918Vf enumC21294918Vf4 = new EnumC21294918Vf("IMAGE_ADDED", 3);
        IMAGE_ADDED = enumC21294918Vf4;
        EnumC21294918Vf enumC21294918Vf5 = new EnumC21294918Vf("IMAGE_MAXED", 4);
        IMAGE_MAXED = enumC21294918Vf5;
        EnumC21294918Vf enumC21294918Vf6 = new EnumC21294918Vf("IMAGE_ACTION_BAR", 5);
        IMAGE_ACTION_BAR = enumC21294918Vf6;
        EnumC21294918Vf enumC21294918Vf7 = new EnumC21294918Vf("TEXT_ONLY", 6);
        TEXT_ONLY = enumC21294918Vf7;
        EnumC21294918Vf[] enumC21294918VfArr = {enumC21294918Vf, enumC21294918Vf2, enumC21294918Vf3, enumC21294918Vf4, enumC21294918Vf5, enumC21294918Vf6, enumC21294918Vf7};
        LL = enumC21294918VfArr;
        LLILLJJLI = new C2254308sP(enumC21294918VfArr);
    }

    public static EnumC21294918Vf[] values() {
        return (EnumC21294918Vf[]) LL.clone();
    }

    public static EnumC21294918Vf valueOf(String str) {
        return (EnumC21294918Vf) C08FF.LIZ(EnumC21294918Vf.class, str);
    }

    public EnumC21294918Vf(String str, int i) {
    }
}
