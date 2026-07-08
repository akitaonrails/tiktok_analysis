package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0sob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641390sob implements InterfaceC385700FAi {
    public static final EnumC1641390sob ACTIVITY_CREATED;
    public static final EnumC1641390sob ACTIVITY_ENTER_ANIMATION_END;
    public static final EnumC1641390sob ACTIVITY_RESUME;
    public static final EnumC1641390sob ACTIVITY_STARTED;
    public static final EnumC1641390sob CAMERA_FRAME_AVAILABLE;
    public static final EnumC1641390sob DEFAULT;
    public static final /* synthetic */ EnumC1641390sob[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1641390sob UI_FRAME_AVAILABLE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1641390sob> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1641390sob enumC1641390sob = new EnumC1641390sob(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1641390sob;
        EnumC1641390sob enumC1641390sob2 = new EnumC1641390sob("ACTIVITY_CREATED", 1, 1);
        ACTIVITY_CREATED = enumC1641390sob2;
        EnumC1641390sob enumC1641390sob3 = new EnumC1641390sob("ACTIVITY_STARTED", 2, 2);
        ACTIVITY_STARTED = enumC1641390sob3;
        EnumC1641390sob enumC1641390sob4 = new EnumC1641390sob("ACTIVITY_RESUME", 3, 3);
        ACTIVITY_RESUME = enumC1641390sob4;
        EnumC1641390sob enumC1641390sob5 = new EnumC1641390sob("UI_FRAME_AVAILABLE", 4, 4);
        UI_FRAME_AVAILABLE = enumC1641390sob5;
        EnumC1641390sob enumC1641390sob6 = new EnumC1641390sob("ACTIVITY_ENTER_ANIMATION_END", 5, 5);
        ACTIVITY_ENTER_ANIMATION_END = enumC1641390sob6;
        EnumC1641390sob enumC1641390sob7 = new EnumC1641390sob("CAMERA_FRAME_AVAILABLE", 6, 6);
        CAMERA_FRAME_AVAILABLE = enumC1641390sob7;
        EnumC1641390sob[] enumC1641390sobArr = {enumC1641390sob, enumC1641390sob2, enumC1641390sob3, enumC1641390sob4, enumC1641390sob5, enumC1641390sob6, enumC1641390sob7};
        LLILLJJLI = enumC1641390sobArr;
        LLILLL = new C2254308sP(enumC1641390sobArr);
    }

    public static EnumC1641390sob[] values() {
        return (EnumC1641390sob[]) LLILLJJLI.clone();
    }

    @Override // X.InterfaceC385700FAi
    public int getValue() {
        return this.LL;
    }

    public static EnumC1641390sob valueOf(String str) {
        return (EnumC1641390sob) C08FF.LIZ(EnumC1641390sob.class, str);
    }

    public EnumC1641390sob(String str, int i, int i2) {
        this.LL = i2;
    }
}
