package X;

import Y.ARunnableS31S0110000_12;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import java.util.Locale;

/* JADX INFO: renamed from: X.14Yv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public final class C20285114Yv {
    public static final C20285114Yv LIZ = new C20285114Yv();

    public static EnumC19410610wq LIZIZ(int i) {
        if (i == C14Z5.GREY_CARD.getType()) {
            return EnumC19410610wq.GREY_CARD;
        }
        if (i == C14Z5.FORCE_VIDEO.getType()) {
            return EnumC19410610wq.FORCE_VIDEO;
        }
        if (i == C14Z5.FORCE_VIDEO_NO_COVER.getType()) {
            return EnumC19410610wq.FORCE_VIDEO_NO_COVER;
        }
        if (i == C14Z5.FORCE_VIDEO_LYNX.getType()) {
            return EnumC19410610wq.FORCE_VIDEO_NO_COVER;
        }
        if (i == C14Z5.BACKGROUND.getType()) {
            return EnumC19410610wq.BACKGROUND;
        }
        if (i == C14Z5.COMMON_FORCE_VIDEO_LYNX.getType()) {
            return EnumC19410610wq.FORCE_VIDEO_NO_COVER;
        }
        return EnumC19410610wq.DEFAULT;
    }

    public static boolean LIZLLL(EnumC19410610wq enumC19410610wq) {
        if (enumC19410610wq == EnumC19410610wq.BACKGROUND) {
            return true;
        }
        return false;
    }

    public static boolean LJ(EnumC19410610wq enumC19410610wq) {
        if (enumC19410610wq != EnumC19410610wq.FORCE_VIDEO_NO_COVER && enumC19410610wq != EnumC19410610wq.FORCE_VIDEO && enumC19410610wq != EnumC19410610wq.BACKGROUND) {
            return false;
        }
        return true;
    }

    public static final void LIZ(Aweme aweme, boolean z) {
        if (aweme != null) {
            int i = C20285514Yz.LIZ[C14Z4.LIZ(aweme).ordinal()];
            if (i != 1 && i != 2) {
                C786410Ut5.LJJZZIII(C20286614Zk.LJI, new ARunnableS31S0110000_12(aweme, z, 2));
            } else {
                C786410Ut5.LJJZZIII(C14Z7.LJI, new ARunnableS31S0110000_12(aweme, z, 4));
            }
        }
    }

    public static final void LIZJ(EnumC20283814Yi enumC20283814Yi, Aweme aweme, Option[] optionArr, C14Z0 c14z0, boolean z) {
        int type;
        int type2;
        int i = C20285514Yz.LIZ[c14z0.ordinal()];
        if (i != 1 && i != 2) {
            C20286614Zk c20286614Zk = C20286614Zk.LIZ;
            if (optionArr != null && optionArr.length != 0) {
                C20286614Zk.LIZJ = String.valueOf(optionArr[0].id);
            }
            if (enumC20283814Yi.getType() != EnumC20283814Yi.SWIPE.getType() && enumC20283814Yi.getType() != EnumC20283814Yi.CLICK_BLANK.getType() && enumC20283814Yi.getType() != EnumC20283814Yi.CLICK_VIDEO.getType()) {
                type2 = enumC20283814Yi.getType();
            } else {
                type2 = EnumC20283814Yi.CANCEL.getType();
            }
            if (!C14Z7.LIZ(aweme) || type2 != EnumC20283814Yi.CANCEL.getType()) {
                C20286614Zk.LIZ.getClass();
                C20286614Zk.LJI(type2, aweme, optionArr);
            }
            if (z) {
                C20286614Zk c20286614Zk2 = C20286614Zk.LIZ;
                String lowerCase = enumC20283814Yi.name().toLowerCase(Locale.ENGLISH);
                String str = C20286614Zk.LIZJ;
                c20286614Zk2.getClass();
                C20286614Zk.LJ(aweme, lowerCase, str);
            }
            C20286614Zk.LJ = false;
            C20286614Zk.LIZIZ = null;
            return;
        }
        C14Z7 c14z7 = C14Z7.LIZ;
        if (optionArr != null && optionArr.length != 0) {
            C14Z7.LJ = String.valueOf(optionArr[0].id);
        }
        if (enumC20283814Yi.getType() != EnumC20283814Yi.SWIPE.getType() && enumC20283814Yi.getType() != EnumC20283814Yi.CLICK_BLANK.getType() && enumC20283814Yi.getType() != EnumC20283814Yi.CLICK_VIDEO.getType()) {
            type = enumC20283814Yi.getType();
        } else {
            type = EnumC20283814Yi.CANCEL.getType();
        }
        C14Z7.LIZ.getClass();
        if (C14ZW.LIZLLL(aweme) != C14Z5.BACKGROUND.getType() || type != EnumC20283814Yi.CANCEL.getType()) {
            C14Z7.LJFF(type, aweme, optionArr);
        }
        if (z) {
            C14Z7.LIZLLL(aweme, enumC20283814Yi.name().toLowerCase(Locale.ENGLISH), C14Z7.LJ);
        }
        C14Z7.LJFF = false;
        C14Z7.LIZLLL = null;
    }
}
