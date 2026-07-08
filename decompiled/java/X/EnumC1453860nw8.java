package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nw8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1453860nw8 implements InterfaceC385700FAi {
    public static final EnumC1453860nw8 DEFAULT;
    public static final EnumC1453860nw8 EDIT_VIDEO_FRAME_AVAILABLE;
    public static final EnumC1453860nw8 EDIT_VIDEO_FRAME_AVAILABLE_DELAY;
    public static final /* synthetic */ EnumC1453860nw8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1453860nw8> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1453860nw8 enumC1453860nw8 = new EnumC1453860nw8(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1453860nw8;
        EnumC1453860nw8 enumC1453860nw82 = new EnumC1453860nw8("EDIT_VIDEO_FRAME_AVAILABLE", 1, 1);
        EDIT_VIDEO_FRAME_AVAILABLE = enumC1453860nw82;
        EnumC1453860nw8 enumC1453860nw83 = new EnumC1453860nw8("EDIT_VIDEO_FRAME_AVAILABLE_DELAY", 2, 2);
        EDIT_VIDEO_FRAME_AVAILABLE_DELAY = enumC1453860nw83;
        EnumC1453860nw8[] enumC1453860nw8Arr = {enumC1453860nw8, enumC1453860nw82, enumC1453860nw83};
        LLILLJJLI = enumC1453860nw8Arr;
        LLILLL = new C2254308sP(enumC1453860nw8Arr);
    }

    public static EnumC1453860nw8[] values() {
        return (EnumC1453860nw8[]) LLILLJJLI.clone();
    }

    @Override // X.InterfaceC385700FAi
    public int getValue() {
        return this.LL;
    }

    public static EnumC1453860nw8 valueOf(String str) {
        return (EnumC1453860nw8) C08FF.LIZ(EnumC1453860nw8.class, str);
    }

    public EnumC1453860nw8(String str, int i, int i2) {
        this.LL = i2;
    }
}
