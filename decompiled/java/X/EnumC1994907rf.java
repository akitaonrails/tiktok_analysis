package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07rf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1994907rf {
    public static final EnumC1994907rf ANIM_BADGE;
    public static final EnumC1994907rf DEFAULT;
    public static final /* synthetic */ EnumC1994907rf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1994907rf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1994907rf enumC1994907rf = new EnumC1994907rf(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1994907rf;
        EnumC1994907rf enumC1994907rf2 = new EnumC1994907rf("ANIM_BADGE", 1);
        ANIM_BADGE = enumC1994907rf2;
        EnumC1994907rf[] enumC1994907rfArr = {enumC1994907rf, enumC1994907rf2};
        LL = enumC1994907rfArr;
        LLILLJJLI = new C2254308sP(enumC1994907rfArr);
    }

    public static EnumC1994907rf[] values() {
        return (EnumC1994907rf[]) LL.clone();
    }

    public static EnumC1994907rf valueOf(String str) {
        return (EnumC1994907rf) C08FF.LIZ(EnumC1994907rf.class, str);
    }

    public EnumC1994907rf(String str, int i) {
    }
}
