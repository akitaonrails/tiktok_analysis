package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lEW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1349940lEW {
    public static final EnumC1349940lEW CLICK_CONFIRM;
    public static final EnumC1349940lEW CLICK_IMAGE_COMMENT;
    public static final EnumC1349940lEW CLICK_JUMP_ACTIVITY_PAGE;
    public static final EnumC1349940lEW CLICK_MENTION;
    public static final EnumC1349940lEW CLICK_RAISE_KEYBOARD;
    public static final EnumC1349940lEW CLICK_REPLY;
    public static final EnumC1349940lEW DEFAULT;
    public static final /* synthetic */ EnumC1349940lEW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1349940lEW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1349940lEW enumC1349940lEW = new EnumC1349940lEW(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1349940lEW;
        EnumC1349940lEW enumC1349940lEW2 = new EnumC1349940lEW("CLICK_CONFIRM", 1, 1);
        CLICK_CONFIRM = enumC1349940lEW2;
        EnumC1349940lEW enumC1349940lEW3 = new EnumC1349940lEW("CLICK_RAISE_KEYBOARD", 2, 2);
        CLICK_RAISE_KEYBOARD = enumC1349940lEW3;
        EnumC1349940lEW enumC1349940lEW4 = new EnumC1349940lEW("CLICK_IMAGE_COMMENT", 3, 3);
        CLICK_IMAGE_COMMENT = enumC1349940lEW4;
        EnumC1349940lEW enumC1349940lEW5 = new EnumC1349940lEW("CLICK_JUMP_ACTIVITY_PAGE", 4, 4);
        CLICK_JUMP_ACTIVITY_PAGE = enumC1349940lEW5;
        EnumC1349940lEW enumC1349940lEW6 = new EnumC1349940lEW("CLICK_MENTION", 5, 5);
        CLICK_MENTION = enumC1349940lEW6;
        EnumC1349940lEW enumC1349940lEW7 = new EnumC1349940lEW("CLICK_REPLY", 6, 6);
        CLICK_REPLY = enumC1349940lEW7;
        EnumC1349940lEW[] enumC1349940lEWArr = {enumC1349940lEW, enumC1349940lEW2, enumC1349940lEW3, enumC1349940lEW4, enumC1349940lEW5, enumC1349940lEW6, enumC1349940lEW7};
        LLILLJJLI = enumC1349940lEWArr;
        LLILLL = new C2254308sP(enumC1349940lEWArr);
    }

    public static EnumC1349940lEW[] values() {
        return (EnumC1349940lEW[]) LLILLJJLI.clone();
    }

    public final int getActionType() {
        return this.LL;
    }

    public static EnumC1349940lEW valueOf(String str) {
        return (EnumC1349940lEW) C08FF.LIZ(EnumC1349940lEW.class, str);
    }

    public EnumC1349940lEW(String str, int i, int i2) {
        this.LL = i2;
    }
}
