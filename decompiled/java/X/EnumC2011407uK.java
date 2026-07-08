package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07uK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2011407uK {
    public static final EnumC2011407uK DEFAULT;
    public static final /* synthetic */ EnumC2011407uK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2011407uK NOTICE_BOARD;

    public static InterfaceC2044707zh<EnumC2011407uK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2011407uK enumC2011407uK = new EnumC2011407uK(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC2011407uK;
        EnumC2011407uK enumC2011407uK2 = new EnumC2011407uK("NOTICE_BOARD", 1);
        NOTICE_BOARD = enumC2011407uK2;
        EnumC2011407uK[] enumC2011407uKArr = {enumC2011407uK, enumC2011407uK2};
        LL = enumC2011407uKArr;
        LLILLJJLI = new C2254308sP(enumC2011407uKArr);
    }

    public static EnumC2011407uK[] values() {
        return (EnumC2011407uK[]) LL.clone();
    }

    public static EnumC2011407uK valueOf(String str) {
        return (EnumC2011407uK) C08FF.LIZ(EnumC2011407uK.class, str);
    }

    public EnumC2011407uK(String str, int i) {
    }
}
