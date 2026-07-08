package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mfW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1405120mfW {
    public static final C1405110mfV Companion;
    public static final EnumC1405120mfW DEFAULT;
    public static final EnumC1405120mfW GENERATED_AVATAR;
    public static final /* synthetic */ EnumC1405120mfW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1405120mfW SOCIAL_AVATAR;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1405120mfW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1405120mfW enumC1405120mfW = new EnumC1405120mfW(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1405120mfW;
        EnumC1405120mfW enumC1405120mfW2 = new EnumC1405120mfW("SOCIAL_AVATAR", 1, 1);
        SOCIAL_AVATAR = enumC1405120mfW2;
        EnumC1405120mfW enumC1405120mfW3 = new EnumC1405120mfW("GENERATED_AVATAR", 2, 2);
        GENERATED_AVATAR = enumC1405120mfW3;
        EnumC1405120mfW[] enumC1405120mfWArr = {enumC1405120mfW, enumC1405120mfW2, enumC1405120mfW3};
        LLILLJJLI = enumC1405120mfWArr;
        LLILLL = new C2254308sP(enumC1405120mfWArr);
        Companion = new C1405110mfV();
    }

    public static EnumC1405120mfW[] values() {
        return (EnumC1405120mfW[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1405120mfW valueOf(String str) {
        return (EnumC1405120mfW) C08FF.LIZ(EnumC1405120mfW.class, str);
    }

    public EnumC1405120mfW(String str, int i, int i2) {
        this.LL = i2;
    }
}
