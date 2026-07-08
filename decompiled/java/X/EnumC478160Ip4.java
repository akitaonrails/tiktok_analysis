package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ip4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC478160Ip4 {
    public static final EnumC478160Ip4 DEFAULT;
    public static final EnumC478160Ip4 FREQUENTLY;
    public static final EnumC478160Ip4 GO_LIVE;
    public static final EnumC478160Ip4 LIVE_EVENT;
    public static final /* synthetic */ EnumC478160Ip4[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC478160Ip4 MULTI_GUEST_APPLY;
    public static final EnumC478160Ip4 ROOM;
    public static final EnumC478160Ip4 U_MAY_KNOW;
    public static final EnumC478160Ip4 WATCH_LATER;
    public final int LL;
    public final Integer LLILLJJLI;
    public final Integer LLILLL;

    public EnumC478160Ip4() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC478160Ip4> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC478160Ip4 enumC478160Ip4 = new EnumC478160Ip4(0, 1, 4, null, null, "ROOM");
        ROOM = enumC478160Ip4;
        EnumC478160Ip4 enumC478160Ip42 = new EnumC478160Ip4(1, 19, 4, 1010, null, "FREQUENTLY");
        FREQUENTLY = enumC478160Ip42;
        EnumC478160Ip4 enumC478160Ip43 = new EnumC478160Ip4(2, 20, 4, 1011, null, "U_MAY_KNOW");
        U_MAY_KNOW = enumC478160Ip43;
        EnumC478160Ip4 enumC478160Ip44 = new EnumC478160Ip4(3, 18, 4, 1007, null, "LIVE_EVENT");
        LIVE_EVENT = enumC478160Ip44;
        EnumC478160Ip4 enumC478160Ip45 = new EnumC478160Ip4(4, 101, 4, null, null, "GO_LIVE");
        GO_LIVE = enumC478160Ip45;
        EnumC478160Ip4 enumC478160Ip46 = new EnumC478160Ip4(5, 21, 2, null, 1012, "MULTI_GUEST_APPLY");
        MULTI_GUEST_APPLY = enumC478160Ip46;
        EnumC478160Ip4 enumC478160Ip47 = new EnumC478160Ip4(6, 22, 4, null, null, "WATCH_LATER");
        WATCH_LATER = enumC478160Ip47;
        EnumC478160Ip4 enumC478160Ip48 = new EnumC478160Ip4(7, -1, 4, null, null, LivePreviewCTASmartDisplayManager.DEFAULT);
        DEFAULT = enumC478160Ip48;
        EnumC478160Ip4[] enumC478160Ip4Arr = {enumC478160Ip4, enumC478160Ip42, enumC478160Ip43, enumC478160Ip44, enumC478160Ip45, enumC478160Ip46, enumC478160Ip47, enumC478160Ip48};
        LLILZ = enumC478160Ip4Arr;
        LLILZIL = new C2254308sP(enumC478160Ip4Arr);
    }

    public static EnumC478160Ip4[] values() {
        return (EnumC478160Ip4[]) LLILZ.clone();
    }

    public final Integer getEndGapType() {
        return this.LLILLL;
    }

    public final int getFeedType() {
        return this.LL;
    }

    public final Integer getStartGapType() {
        return this.LLILLJJLI;
    }

    public static EnumC478160Ip4 valueOf(String str) {
        return (EnumC478160Ip4) C08FF.LIZ(EnumC478160Ip4.class, str);
    }

    public EnumC478160Ip4(int i, int i2, int i3, Integer num, Integer num2, String str) {
        num = (i3 & 2) != 0 ? null : num;
        num2 = (i3 & 4) != 0 ? null : num2;
        this.LL = i2;
        this.LLILLJJLI = num;
        this.LLILLL = num2;
    }
}
