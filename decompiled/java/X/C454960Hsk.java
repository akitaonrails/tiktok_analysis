package X;

import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hsk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454960Hsk {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(554));

    public static boolean LIZ(C869590Y9l c869590Y9l) {
        if (c869590Y9l == null) {
            return false;
        }
        return Intrinsics.LJFF(c869590Y9l.getLocalExt().get("is_disabled_animation_sticker"), "1");
    }

    public static boolean LIZIZ(StickerTemplate stickerTemplate) {
        if (C300780Bqe.LIZ() > 0 && ((List) C1231504rp.LIZIZ.getValue()).contains(String.valueOf(C2243571Crb.LIZJ(stickerTemplate)))) {
            return true;
        }
        return false;
    }
}
