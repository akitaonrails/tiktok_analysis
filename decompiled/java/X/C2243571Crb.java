package X;

import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import java.util.List;

/* JADX INFO: renamed from: X.1Crb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243571Crb {
    public static final String LIZ(StickerTemplate stickerTemplate) {
        return stickerTemplate.baseRequestComponent.queryData.extras.get("a:sticker_creator_user_id");
    }

    public static final Long LIZIZ(StickerTemplate stickerTemplate) {
        String str = stickerTemplate.baseRequestComponent.queryData.extras.get("a:sticker_id");
        if (str != null) {
            return C2095008Iq.LJIILIIL(str);
        }
        return null;
    }

    public static final Long LIZJ(StickerTemplate stickerTemplate) {
        String str = stickerTemplate.baseRequestComponent.queryData.extras.get("a:sticker_set_id");
        if (str != null) {
            return C2095008Iq.LJIILIIL(str);
        }
        return null;
    }

    public static final Integer LIZLLL(StickerTemplate stickerTemplate) {
        String str = stickerTemplate.baseRequestComponent.queryData.extras.get("a:sticker_type");
        if (str != null) {
            return C2095008Iq.LJIIJJI(str);
        }
        return null;
    }

    public static final String LJ(StickerTemplate stickerTemplate) {
        return stickerTemplate.baseRequestComponent.queryData.extras.get("a:typing_reco_id");
    }

    public static final boolean LJFF(StickerTemplate stickerTemplate) {
        List<EnumC2243731Crr> list = stickerTemplate.blockedActions;
        if (list == null || !list.contains(EnumC2243731Crr.FAVOURITE)) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(StickerTemplate stickerTemplate) {
        List<EnumC2243731Crr> list = stickerTemplate.blockedActions;
        if (list == null || !list.contains(EnumC2243731Crr.REPORT)) {
            return false;
        }
        return true;
    }

    public static final boolean LJII(StickerTemplate stickerTemplate) {
        List<EnumC2243731Crr> list = stickerTemplate.blockedActions;
        if (list == null || !list.contains(EnumC2243731Crr.SEND)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fe  */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate LJIIIIZZ(X.C2243581Crc r40, X.C2242321Cpa r41, X.C2242801CqM r42, X.C2242771CqJ r43) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2243571Crb.LJIIIIZZ(X.1Crc, X.1Cpa, X.1CqM, X.1CqJ):com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate");
    }
}
