package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PvH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC660370PvH {
    public static final EnumC660370PvH AIGC_LABEL;
    public static final EnumC660370PvH BIG_COMMENT;
    public static final EnumC660370PvH COMMENT;
    public static final EnumC660370PvH ECOMMERCE_DYNAMIC;
    public static final EnumC660370PvH ECOMMERCE_STRONG;
    public static final EnumC660370PvH ECOMMERCE_WEAK;
    public static final EnumC660370PvH KEY_FRAME;
    public static final EnumC660370PvH KEY_FRAME_INTENT;
    public static final EnumC660370PvH KEY_FRAME_OPT;
    public static final /* synthetic */ EnumC660370PvH[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC660370PvH MAX_PRIORITY;
    public static final EnumC660370PvH NO_PRIORITY;
    public static final EnumC660370PvH PHOTO_COMMENT;
    public static final EnumC660370PvH POI;
    public static final EnumC660370PvH SUBTITLE;
    public static final EnumC660370PvH TRANSLATION;
    public static final EnumC660370PvH VIDEO_DURATION;
    public final int LL;
    public final InterfaceC660500PvU LLILLJJLI;

    public static InterfaceC2044707zh<EnumC660370PvH> getEntries() {
        return LLILZ;
    }

    static {
        EnumC660370PvH enumC660370PvH = new EnumC660370PvH("MAX_PRIORITY", 0, 0, C660610Pvf.LIZ);
        MAX_PRIORITY = enumC660370PvH;
        EnumC660370PvH enumC660370PvH2 = new EnumC660370PvH("ECOMMERCE_DYNAMIC", 1, 9, C660630Pvh.LIZ);
        ECOMMERCE_DYNAMIC = enumC660370PvH2;
        EnumC660370PvH enumC660370PvH3 = new EnumC660370PvH("ECOMMERCE_WEAK", 2, 10, C660620Pvg.LIZ);
        ECOMMERCE_WEAK = enumC660370PvH3;
        EnumC660370PvH enumC660370PvH4 = new EnumC660370PvH("ECOMMERCE_STRONG", 3, 10, C659930PuZ.LIZ);
        ECOMMERCE_STRONG = enumC660370PvH4;
        C660520PvW c660520PvW = new InterfaceC660500PvU() { // from class: X.0PvW
        };
        EnumC660370PvH enumC660370PvH5 = new EnumC660370PvH("TRANSLATION", 4, 20, c660520PvW);
        TRANSLATION = enumC660370PvH5;
        EnumC660370PvH enumC660370PvH6 = new EnumC660370PvH("KEY_FRAME_OPT", 5, 23, new InterfaceC660460PvQ() { // from class: X.0Pvk
        });
        KEY_FRAME_OPT = enumC660370PvH6;
        EnumC660370PvH enumC660370PvH7 = new EnumC660370PvH("KEY_FRAME_INTENT", 6, 24, C660640Pvi.LIZ);
        KEY_FRAME_INTENT = enumC660370PvH7;
        C660650Pvj c660650Pvj = C660650Pvj.LIZ;
        EnumC660370PvH enumC660370PvH8 = new EnumC660370PvH("KEY_FRAME", 7, 25, c660650Pvj);
        KEY_FRAME = enumC660370PvH8;
        EnumC660370PvH enumC660370PvH9 = new EnumC660370PvH("COMMENT", 8, 30, new InterfaceC660460PvQ() { // from class: X.0Pve
        });
        COMMENT = enumC660370PvH9;
        EnumC660370PvH enumC660370PvH10 = new EnumC660370PvH("POI", 9, 40, C660680Pvm.LIZ);
        POI = enumC660370PvH10;
        EnumC660370PvH enumC660370PvH11 = new EnumC660370PvH("SUBTITLE", 10, 50, c660520PvW);
        SUBTITLE = enumC660370PvH11;
        EnumC660370PvH enumC660370PvH12 = new EnumC660370PvH("PHOTO_COMMENT", 11, 60, C660670Pvl.LIZ);
        PHOTO_COMMENT = enumC660370PvH12;
        EnumC660370PvH enumC660370PvH13 = new EnumC660370PvH("BIG_COMMENT", 12, 61, C660590Pvd.LIZ);
        BIG_COMMENT = enumC660370PvH13;
        EnumC660370PvH enumC660370PvH14 = new EnumC660370PvH("VIDEO_DURATION", 13, LSPassThroughRecordSizeConfig.DEFAULT, c660650Pvj);
        VIDEO_DURATION = enumC660370PvH14;
        EnumC660370PvH enumC660370PvH15 = new EnumC660370PvH("AIGC_LABEL", 14, 65, new InterfaceC660460PvQ() { // from class: X.0Pvc
        });
        AIGC_LABEL = enumC660370PvH15;
        EnumC660370PvH enumC660370PvH16 = new EnumC660370PvH("NO_PRIORITY", 15, Integer.MAX_VALUE, new InterfaceC660500PvU() { // from class: X.0PvV
        });
        NO_PRIORITY = enumC660370PvH16;
        EnumC660370PvH[] enumC660370PvHArr = {enumC660370PvH, enumC660370PvH2, enumC660370PvH3, enumC660370PvH4, enumC660370PvH5, enumC660370PvH6, enumC660370PvH7, enumC660370PvH8, enumC660370PvH9, enumC660370PvH10, enumC660370PvH11, enumC660370PvH12, enumC660370PvH13, enumC660370PvH14, enumC660370PvH15, enumC660370PvH16};
        LLILLL = enumC660370PvHArr;
        LLILZ = new C2254308sP(enumC660370PvHArr);
    }

    public static EnumC660370PvH[] values() {
        return (EnumC660370PvH[]) LLILLL.clone();
    }

    public final InterfaceC660500PvU getAnchorNewType() {
        return this.LLILLJJLI;
    }

    public final int getPriority() {
        return this.LL;
    }

    public static EnumC660370PvH valueOf(String str) {
        return (EnumC660370PvH) C08FF.LIZ(EnumC660370PvH.class, str);
    }

    public EnumC660370PvH(String str, int i, int i2, InterfaceC660500PvU interfaceC660500PvU) {
        this.LL = i2;
        this.LLILLJJLI = interfaceC660500PvU;
    }
}
