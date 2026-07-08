package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rCW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1579340rCW {
    public static final EnumC1579340rCW DEFAULT;
    public static final /* synthetic */ EnumC1579340rCW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1579340rCW NOT_VERIFIED;
    public static final EnumC1579340rCW VERIFIED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1579340rCW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1579340rCW enumC1579340rCW = new EnumC1579340rCW(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1579340rCW;
        EnumC1579340rCW enumC1579340rCW2 = new EnumC1579340rCW("VERIFIED", 1, 1);
        VERIFIED = enumC1579340rCW2;
        EnumC1579340rCW enumC1579340rCW3 = new EnumC1579340rCW("NOT_VERIFIED", 2, 2);
        NOT_VERIFIED = enumC1579340rCW3;
        EnumC1579340rCW[] enumC1579340rCWArr = {enumC1579340rCW, enumC1579340rCW2, enumC1579340rCW3};
        LLILLJJLI = enumC1579340rCWArr;
        LLILLL = new C2254308sP(enumC1579340rCWArr);
    }

    public static EnumC1579340rCW[] values() {
        return (EnumC1579340rCW[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1579340rCW valueOf(String str) {
        return (EnumC1579340rCW) C08FF.LIZ(EnumC1579340rCW.class, str);
    }

    public EnumC1579340rCW(String str, int i, int i2) {
        this.LL = i2;
    }
}
