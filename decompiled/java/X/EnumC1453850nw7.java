package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nw7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1453850nw7 implements InterfaceC1454660nxQ {
    public static final EnumC1453850nw7 BACK_TO_EDIT_END;
    public static final EnumC1453850nw7 BACK_TO_EDIT_START;
    public static final EnumC1453850nw7 DEFAULT;
    public static final EnumC1453850nw7 GO_TO_PUBLISH;
    public static final /* synthetic */ EnumC1453850nw7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1453850nw7 UI_FIRST_FRAME;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1453850nw7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1453850nw7 enumC1453850nw7 = new EnumC1453850nw7(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1453850nw7;
        EnumC1453850nw7 enumC1453850nw72 = new EnumC1453850nw7("UI_FIRST_FRAME", 1, 1);
        UI_FIRST_FRAME = enumC1453850nw72;
        EnumC1453850nw7 enumC1453850nw73 = new EnumC1453850nw7("BACK_TO_EDIT_START", 2, 2);
        BACK_TO_EDIT_START = enumC1453850nw73;
        EnumC1453850nw7 enumC1453850nw74 = new EnumC1453850nw7("BACK_TO_EDIT_END", 3, 3);
        BACK_TO_EDIT_END = enumC1453850nw74;
        EnumC1453850nw7 enumC1453850nw75 = new EnumC1453850nw7("GO_TO_PUBLISH", 4, 4);
        GO_TO_PUBLISH = enumC1453850nw75;
        EnumC1453850nw7[] enumC1453850nw7Arr = {enumC1453850nw7, enumC1453850nw72, enumC1453850nw73, enumC1453850nw74, enumC1453850nw75};
        LLILLJJLI = enumC1453850nw7Arr;
        LLILLL = new C2254308sP(enumC1453850nw7Arr);
    }

    public static EnumC1453850nw7[] values() {
        return (EnumC1453850nw7[]) LLILLJJLI.clone();
    }

    @Override // X.InterfaceC385700FAi
    public int getValue() {
        return this.LL;
    }

    public static EnumC1453850nw7 valueOf(String str) {
        return (EnumC1453850nw7) C08FF.LIZ(EnumC1453850nw7.class, str);
    }

    public EnumC1453850nw7(String str, int i, int i2) {
        this.LL = i2;
    }
}
