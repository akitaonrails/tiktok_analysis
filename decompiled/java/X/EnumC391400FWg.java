package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FWg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC391400FWg {
    public static final EnumC391400FWg EDITOR_PRO;
    public static final EnumC391400FWg IMAGE_GLOBAL_EDIT;
    public static final EnumC391400FWg IMAGE_NON_GLOBAL_EDIT;
    public static final /* synthetic */ EnumC391400FWg[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC391400FWg RECORD;
    public static final EnumC391400FWg VIDEO_2_STICKER;
    public static final EnumC391400FWg VIDEO_EDIT;
    public static final EnumC391400FWg VIDEO_PUBLISH_PREVIEW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC391400FWg> getEntries() {
        return LLILLL;
    }

    static {
        EnumC391400FWg enumC391400FWg = new EnumC391400FWg("RECORD", 0, 0);
        RECORD = enumC391400FWg;
        EnumC391400FWg enumC391400FWg2 = new EnumC391400FWg("VIDEO_EDIT", 1, 1);
        VIDEO_EDIT = enumC391400FWg2;
        EnumC391400FWg enumC391400FWg3 = new EnumC391400FWg("IMAGE_GLOBAL_EDIT", 2, 2);
        IMAGE_GLOBAL_EDIT = enumC391400FWg3;
        EnumC391400FWg enumC391400FWg4 = new EnumC391400FWg("IMAGE_NON_GLOBAL_EDIT", 3, 3);
        IMAGE_NON_GLOBAL_EDIT = enumC391400FWg4;
        EnumC391400FWg enumC391400FWg5 = new EnumC391400FWg("VIDEO_PUBLISH_PREVIEW", 4, 4);
        VIDEO_PUBLISH_PREVIEW = enumC391400FWg5;
        EnumC391400FWg enumC391400FWg6 = new EnumC391400FWg("VIDEO_2_STICKER", 5, 5);
        VIDEO_2_STICKER = enumC391400FWg6;
        EnumC391400FWg enumC391400FWg7 = new EnumC391400FWg("EDITOR_PRO", 6, 6);
        EDITOR_PRO = enumC391400FWg7;
        EnumC391400FWg[] enumC391400FWgArr = {enumC391400FWg, enumC391400FWg2, enumC391400FWg3, enumC391400FWg4, enumC391400FWg5, enumC391400FWg6, enumC391400FWg7};
        LLILLJJLI = enumC391400FWgArr;
        LLILLL = new C2254308sP(enumC391400FWgArr);
    }

    public static EnumC391400FWg[] values() {
        return (EnumC391400FWg[]) LLILLJJLI.clone();
    }

    public final int getSceneType() {
        return this.LL;
    }

    public static EnumC391400FWg valueOf(String str) {
        return (EnumC391400FWg) C08FF.LIZ(EnumC391400FWg.class, str);
    }

    public EnumC391400FWg(String str, int i, int i2) {
        this.LL = i2;
    }
}
