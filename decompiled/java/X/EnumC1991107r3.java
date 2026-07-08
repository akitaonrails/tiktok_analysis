package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07r3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1991107r3 {
    public static final EnumC1991107r3 DEFAULT;
    public static final /* synthetic */ EnumC1991107r3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1991107r3 VOICE_INPUT;
    public static final EnumC1991107r3 WORD_INPUT_KEYBOARD;

    public static InterfaceC2044707zh<EnumC1991107r3> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1991107r3 enumC1991107r3 = new EnumC1991107r3(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1991107r3;
        EnumC1991107r3 enumC1991107r32 = new EnumC1991107r3("WORD_INPUT_KEYBOARD", 1);
        WORD_INPUT_KEYBOARD = enumC1991107r32;
        EnumC1991107r3 enumC1991107r33 = new EnumC1991107r3("VOICE_INPUT", 2);
        VOICE_INPUT = enumC1991107r33;
        EnumC1991107r3[] enumC1991107r3Arr = {enumC1991107r3, enumC1991107r32, enumC1991107r33};
        LL = enumC1991107r3Arr;
        LLILLJJLI = new C2254308sP(enumC1991107r3Arr);
    }

    public static EnumC1991107r3[] values() {
        return (EnumC1991107r3[]) LL.clone();
    }

    public static EnumC1991107r3 valueOf(String str) {
        return (EnumC1991107r3) C08FF.LIZ(EnumC1991107r3.class, str);
    }

    public EnumC1991107r3(String str, int i) {
    }
}
