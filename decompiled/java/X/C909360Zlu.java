package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Zlu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C909360Zlu {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC909380Zlw.values().length];
        try {
            iArr[EnumC909380Zlw.CHAT_ROOM_TITLE_BAR_RIGHT_ICON.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC909380Zlw.CHAT_ROOM_TITLE_BAR_LABEL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC909380Zlw.GREETING_CARD_COMMON_RESOURCE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC909380Zlw.CUSTOM_MESSAGE_BUBBLE_CATEGORY_SUBTITLE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC909380Zlw.CUSTOM_MESSAGE_BUBBLE_NEW_LABEL.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZ = iArr;
    }
}
