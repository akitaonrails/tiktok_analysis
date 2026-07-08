package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0meg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1404600meg {
    public static final EnumC1404600meg DEFAULT;
    public static final EnumC1404600meg DETACHED_WATERMARK;
    public static final EnumC1404600meg EDITPOST;
    public static final /* synthetic */ EnumC1404600meg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1404600meg MOMENTS_SAVE;
    public static final EnumC1404600meg PCS_PAID_VIDEO;
    public static final EnumC1404600meg SAVE_TO_LOCAL;
    public static final EnumC1404600meg STORY;
    public static final EnumC1404600meg TTEP;

    public static InterfaceC2044707zh<EnumC1404600meg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1404600meg enumC1404600meg = new EnumC1404600meg(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1404600meg;
        EnumC1404600meg enumC1404600meg2 = new EnumC1404600meg("STORY", 1);
        STORY = enumC1404600meg2;
        EnumC1404600meg enumC1404600meg3 = new EnumC1404600meg("TTEP", 2);
        TTEP = enumC1404600meg3;
        EnumC1404600meg enumC1404600meg4 = new EnumC1404600meg("EDITPOST", 3);
        EDITPOST = enumC1404600meg4;
        EnumC1404600meg enumC1404600meg5 = new EnumC1404600meg("SAVE_TO_LOCAL", 4);
        SAVE_TO_LOCAL = enumC1404600meg5;
        EnumC1404600meg enumC1404600meg6 = new EnumC1404600meg("MOMENTS_SAVE", 5);
        MOMENTS_SAVE = enumC1404600meg6;
        EnumC1404600meg enumC1404600meg7 = new EnumC1404600meg("DETACHED_WATERMARK", 6);
        DETACHED_WATERMARK = enumC1404600meg7;
        EnumC1404600meg enumC1404600meg8 = new EnumC1404600meg("PCS_PAID_VIDEO", 7);
        PCS_PAID_VIDEO = enumC1404600meg8;
        EnumC1404600meg[] enumC1404600megArr = {enumC1404600meg, enumC1404600meg2, enumC1404600meg3, enumC1404600meg4, enumC1404600meg5, enumC1404600meg6, enumC1404600meg7, enumC1404600meg8};
        LL = enumC1404600megArr;
        LLILLJJLI = new C2254308sP(enumC1404600megArr);
    }

    public static EnumC1404600meg[] values() {
        return (EnumC1404600meg[]) LL.clone();
    }

    public static EnumC1404600meg valueOf(String str) {
        return (EnumC1404600meg) C08FF.LIZ(EnumC1404600meg.class, str);
    }

    public EnumC1404600meg(String str, int i) {
    }
}
