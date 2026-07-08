package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Rdh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC700430Rdh {
    public static final EnumC700430Rdh DEFAULT;
    public static final /* synthetic */ EnumC700430Rdh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC700430Rdh NEGATIVE;
    public static final EnumC700430Rdh POSITIVE;

    public static InterfaceC2044707zh<EnumC700430Rdh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC700430Rdh enumC700430Rdh = new EnumC700430Rdh("POSITIVE", 0);
        POSITIVE = enumC700430Rdh;
        EnumC700430Rdh enumC700430Rdh2 = new EnumC700430Rdh("NEGATIVE", 1);
        NEGATIVE = enumC700430Rdh2;
        EnumC700430Rdh enumC700430Rdh3 = new EnumC700430Rdh(LivePreviewCTASmartDisplayManager.DEFAULT, 2);
        DEFAULT = enumC700430Rdh3;
        EnumC700430Rdh[] enumC700430RdhArr = {enumC700430Rdh, enumC700430Rdh2, enumC700430Rdh3};
        LL = enumC700430RdhArr;
        LLILLJJLI = new C2254308sP(enumC700430RdhArr);
    }

    public static EnumC700430Rdh[] values() {
        return (EnumC700430Rdh[]) LL.clone();
    }

    public static EnumC700430Rdh valueOf(String str) {
        return (EnumC700430Rdh) C08FF.LIZ(EnumC700430Rdh.class, str);
    }

    public EnumC700430Rdh(String str, int i) {
    }
}
