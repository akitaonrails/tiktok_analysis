package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10wq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@InterfaceC1294060jmO
public final class EnumC19410610wq {
    public static final EnumC19410610wq BACKGROUND;
    public static final EnumC19410610wq DEFAULT;
    public static final EnumC19410610wq FORCE_VIDEO;
    public static final EnumC19410610wq FORCE_VIDEO_NO_COVER;
    public static final EnumC19410610wq GREY_CARD;
    public static final /* synthetic */ EnumC19410610wq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC19410610wq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19410610wq enumC19410610wq = new EnumC19410610wq(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC19410610wq;
        EnumC19410610wq enumC19410610wq2 = new EnumC19410610wq("GREY_CARD", 1, 1);
        GREY_CARD = enumC19410610wq2;
        EnumC19410610wq enumC19410610wq3 = new EnumC19410610wq("FORCE_VIDEO", 2, 2);
        FORCE_VIDEO = enumC19410610wq3;
        EnumC19410610wq enumC19410610wq4 = new EnumC19410610wq("FORCE_VIDEO_NO_COVER", 3, 3);
        FORCE_VIDEO_NO_COVER = enumC19410610wq4;
        EnumC19410610wq enumC19410610wq5 = new EnumC19410610wq("BACKGROUND", 4, 4);
        BACKGROUND = enumC19410610wq5;
        EnumC19410610wq[] enumC19410610wqArr = {enumC19410610wq, enumC19410610wq2, enumC19410610wq3, enumC19410610wq4, enumC19410610wq5};
        LLILLJJLI = enumC19410610wqArr;
        LLILLL = new C2254308sP(enumC19410610wqArr);
    }

    public static EnumC19410610wq[] values() {
        return (EnumC19410610wq[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC19410610wq valueOf(String str) {
        return (EnumC19410610wq) C08FF.LIZ(EnumC19410610wq.class, str);
    }

    public EnumC19410610wq(String str, int i, int i2) {
        this.LL = i2;
    }
}
