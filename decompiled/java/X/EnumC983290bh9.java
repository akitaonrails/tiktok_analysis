package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bh9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC983290bh9 {
    public static final EnumC983290bh9 DEFAULT;
    public static final /* synthetic */ EnumC983290bh9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC983290bh9 SEND_GIFT;
    public static final EnumC983290bh9 SWITCH_TURN;
    public static final EnumC983290bh9 WATCH_LIVE;

    public static InterfaceC2044707zh<EnumC983290bh9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC983290bh9 enumC983290bh9 = new EnumC983290bh9(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC983290bh9;
        EnumC983290bh9 enumC983290bh92 = new EnumC983290bh9("SWITCH_TURN", 1);
        SWITCH_TURN = enumC983290bh92;
        EnumC983290bh9 enumC983290bh93 = new EnumC983290bh9("SEND_GIFT", 2);
        SEND_GIFT = enumC983290bh93;
        EnumC983290bh9 enumC983290bh94 = new EnumC983290bh9("WATCH_LIVE", 3);
        WATCH_LIVE = enumC983290bh94;
        EnumC983290bh9[] enumC983290bh9Arr = {enumC983290bh9, enumC983290bh92, enumC983290bh93, enumC983290bh94};
        LL = enumC983290bh9Arr;
        LLILLJJLI = new C2254308sP(enumC983290bh9Arr);
    }

    public static EnumC983290bh9[] values() {
        return (EnumC983290bh9[]) LL.clone();
    }

    public static EnumC983290bh9 valueOf(String str) {
        return (EnumC983290bh9) C08FF.LIZ(EnumC983290bh9.class, str);
    }

    public EnumC983290bh9(String str, int i) {
    }
}
