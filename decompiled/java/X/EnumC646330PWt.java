package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PWt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC646330PWt {
    public static final EnumC646330PWt DEFAULT;
    public static final EnumC646330PWt LIVE;
    public static final EnumC646330PWt LIVE_V1;
    public static final EnumC646330PWt LIVE_V2;
    public static final EnumC646330PWt LIVE_V3;
    public static final /* synthetic */ EnumC646330PWt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC646330PWt NO_LIVE;
    public static final EnumC646330PWt NO_LIVE_NEW;

    public static InterfaceC2044707zh<EnumC646330PWt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC646330PWt enumC646330PWt = new EnumC646330PWt(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC646330PWt;
        EnumC646330PWt enumC646330PWt2 = new EnumC646330PWt("NO_LIVE", 1);
        NO_LIVE = enumC646330PWt2;
        EnumC646330PWt enumC646330PWt3 = new EnumC646330PWt("NO_LIVE_NEW", 2);
        NO_LIVE_NEW = enumC646330PWt3;
        EnumC646330PWt enumC646330PWt4 = new EnumC646330PWt("LIVE", 3);
        LIVE = enumC646330PWt4;
        EnumC646330PWt enumC646330PWt5 = new EnumC646330PWt("LIVE_V1", 4);
        LIVE_V1 = enumC646330PWt5;
        EnumC646330PWt enumC646330PWt6 = new EnumC646330PWt("LIVE_V2", 5);
        LIVE_V2 = enumC646330PWt6;
        EnumC646330PWt enumC646330PWt7 = new EnumC646330PWt("LIVE_V3", 6);
        LIVE_V3 = enumC646330PWt7;
        EnumC646330PWt[] enumC646330PWtArr = {enumC646330PWt, enumC646330PWt2, enumC646330PWt3, enumC646330PWt4, enumC646330PWt5, enumC646330PWt6, enumC646330PWt7};
        LL = enumC646330PWtArr;
        LLILLJJLI = new C2254308sP(enumC646330PWtArr);
    }

    public static EnumC646330PWt[] values() {
        return (EnumC646330PWt[]) LL.clone();
    }

    public static EnumC646330PWt valueOf(String str) {
        return (EnumC646330PWt) C08FF.LIZ(EnumC646330PWt.class, str);
    }

    public EnumC646330PWt(String str, int i) {
    }
}
