package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Pt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC839503Pt {
    public static final EnumC839503Pt DEFAULT;
    public static final EnumC839503Pt HYBRID;
    public static final /* synthetic */ EnumC839503Pt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC839503Pt TTF;
    public static final EnumC839503Pt TTS;
    public final Integer LL;

    public static InterfaceC2044707zh<EnumC839503Pt> getEntries() {
        return LLILLL;
    }

    static {
        EnumC839503Pt enumC839503Pt = new EnumC839503Pt("TTS", 0, 0);
        TTS = enumC839503Pt;
        EnumC839503Pt enumC839503Pt2 = new EnumC839503Pt("TTF", 1, 2);
        TTF = enumC839503Pt2;
        EnumC839503Pt enumC839503Pt3 = new EnumC839503Pt("HYBRID", 2, 99);
        HYBRID = enumC839503Pt3;
        EnumC839503Pt enumC839503Pt4 = new EnumC839503Pt(LivePreviewCTASmartDisplayManager.DEFAULT, 3, null);
        DEFAULT = enumC839503Pt4;
        EnumC839503Pt[] enumC839503PtArr = {enumC839503Pt, enumC839503Pt2, enumC839503Pt3, enumC839503Pt4};
        LLILLJJLI = enumC839503PtArr;
        LLILLL = new C2254308sP(enumC839503PtArr);
    }

    public static EnumC839503Pt[] values() {
        return (EnumC839503Pt[]) LLILLJJLI.clone();
    }

    public final Integer getType() {
        return this.LL;
    }

    public static EnumC839503Pt valueOf(String str) {
        return (EnumC839503Pt) C08FF.LIZ(EnumC839503Pt.class, str);
    }

    public EnumC839503Pt(String str, int i, Integer num) {
        this.LL = num;
    }
}
