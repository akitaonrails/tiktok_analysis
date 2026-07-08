package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0oG3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1466210oG3 {
    public static final EnumC1466210oG3 DEFAULT;
    public static final EnumC1466210oG3 HOLLOW;
    public static final /* synthetic */ EnumC1466210oG3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1466210oG3 TRANSLUCENT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1466210oG3> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1466210oG3 enumC1466210oG3 = new EnumC1466210oG3(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 1);
        DEFAULT = enumC1466210oG3;
        EnumC1466210oG3 enumC1466210oG32 = new EnumC1466210oG3("TRANSLUCENT", 1, 2);
        TRANSLUCENT = enumC1466210oG32;
        EnumC1466210oG3 enumC1466210oG33 = new EnumC1466210oG3("HOLLOW", 2, 3);
        HOLLOW = enumC1466210oG33;
        EnumC1466210oG3[] enumC1466210oG3Arr = {enumC1466210oG3, enumC1466210oG32, enumC1466210oG33};
        LLILLJJLI = enumC1466210oG3Arr;
        LLILLL = new C2254308sP(enumC1466210oG3Arr);
    }

    public static EnumC1466210oG3[] values() {
        return (EnumC1466210oG3[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1466210oG3 valueOf(String str) {
        return (EnumC1466210oG3) C08FF.LIZ(EnumC1466210oG3.class, str);
    }

    public EnumC1466210oG3(String str, int i, int i2) {
        this.LL = i2;
    }
}
