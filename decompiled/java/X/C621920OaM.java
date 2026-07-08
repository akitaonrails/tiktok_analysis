package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bulletin.db.modle.BulletinItemBase;
import com.ss.android.ugc.aweme.bulletin.db.modle.BulletinItemContent;
import com.ss.android.ugc.aweme.bulletin.db.modle.BulletinItemInteraction;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0OaM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C621920OaM {
    public static List LIZ(C908020Zjk c908020Zjk) {
        String strLJ;
        List<BulletinItemContent> list;
        ArrayList arrayList = new ArrayList();
        if (!c908020Zjk.LLILLL && c908020Zjk.moveToPosition(0)) {
            String str = null;
            C619060OPw c619060OPw = null;
            do {
                try {
                    try {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("content_");
                        sbLIZ.append(EnumC621870OaH.ITEM_ID.getKey());
                        strLJ = C622120Oag.LJ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ));
                        if (!a0.LJJJIL(strLJ)) {
                            if (!Intrinsics.LJFF(str, strLJ)) {
                                if (c619060OPw != null) {
                                    arrayList.add(c619060OPw);
                                }
                                try {
                                    c619060OPw = new C619060OPw(LIZIZ(c908020Zjk), new ArrayList(), LIZLLL(c908020Zjk));
                                    str = strLJ;
                                } catch (Exception e) {
                                    e = e;
                                    TryCatchGuardChecker.doCheck(e);
                                    str = strLJ;
                                }
                            }
                            BulletinItemContent bulletinItemContentLIZJ = LIZJ(c908020Zjk);
                            if (c619060OPw != null && (list = c619060OPw.LIZIZ) != null) {
                                list.add(bulletinItemContentLIZJ);
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c908020Zjk.close();
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    strLJ = str;
                }
            } while (c908020Zjk.moveToNext());
            if (c619060OPw != null) {
                arrayList.add(c619060OPw);
            }
            c908020Zjk.close();
            return arrayList;
        }
        return arrayList;
    }

    public static BulletinItemBase LIZIZ(C908020Zjk c908020Zjk) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("base_");
        sbLIZ.append(EnumC621930OaN.ITEM_ID.getKey());
        String strLJ = C622120Oag.LJ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("base_");
        sbLIZ2.append(EnumC621930OaN.BULLETIN_BOARD_ID.getKey());
        String strLJ2 = C622120Oag.LJ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("base_");
        sbLIZ3.append(EnumC621930OaN.LAST_UPDATE_TIME.getKey());
        Long lValueOf = Long.valueOf(C622120Oag.LIZJ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ3)));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("base_");
        sbLIZ4.append(EnumC621930OaN.CREATE_TIME.getKey());
        Long lValueOf2 = Long.valueOf(C622120Oag.LIZJ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ4)));
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("base_");
        sbLIZ5.append(EnumC621930OaN.PUBLISH_USER_ID.getKey());
        String strLIZLLL = C622120Oag.LIZLLL(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ5));
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("base_");
        sbLIZ6.append(EnumC621930OaN.TYPE.getKey());
        Integer numValueOf = Integer.valueOf(C622120Oag.LIZ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ6)));
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("base_");
        sbLIZ7.append(EnumC621930OaN.HAS_READ.getKey());
        Integer numValueOf2 = Integer.valueOf(C622120Oag.LIZ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ7)));
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("base_");
        sbLIZ8.append(EnumC621930OaN.TTL.getKey());
        Integer numValueOf3 = Integer.valueOf(C622120Oag.LIZ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ8)));
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("base_");
        sbLIZ9.append(EnumC621930OaN.STATUS.getKey());
        Integer numValueOf4 = Integer.valueOf(C622120Oag.LIZ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ9)));
        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
        sbLIZ10.append("base_");
        sbLIZ10.append(EnumC621930OaN.STYLE_ID.getKey());
        return new BulletinItemBase(strLJ, strLJ2, lValueOf, lValueOf2, strLIZLLL, numValueOf, numValueOf2, numValueOf3, numValueOf4, C622120Oag.LIZLLL(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ10)));
    }

    public static BulletinItemContent LIZJ(C908020Zjk c908020Zjk) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("content_");
        sbLIZ.append(EnumC621870OaH.ITEM_ID.getKey());
        String strLJ = C622120Oag.LJ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("content_");
        sbLIZ2.append(EnumC621870OaH.CONTENT_KEY.getKey());
        String strLJ2 = C622120Oag.LJ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("content_");
        sbLIZ3.append(EnumC621870OaH.CONTENT_VALUE.getKey());
        return new BulletinItemContent(strLJ, strLJ2, C622120Oag.LIZLLL(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ3)));
    }

    public static BulletinItemInteraction LIZLLL(C908020Zjk c908020Zjk) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("interaction_");
        sbLIZ.append(EnumC621910OaL.ITEM_ID.getKey());
        String strLJ = C622120Oag.LJ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("interaction_");
        sbLIZ2.append(EnumC621910OaL.EMOJI.getKey());
        String strLIZLLL = C622120Oag.LIZLLL(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("interaction_");
        sbLIZ3.append(EnumC621910OaL.COMMENT.getKey());
        String strLIZLLL2 = C622120Oag.LIZLLL(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("interaction_");
        sbLIZ4.append(EnumC621910OaL.VIEW_COUNT.getKey());
        Integer numValueOf = Integer.valueOf(C622120Oag.LIZ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ4)));
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("interaction_");
        sbLIZ5.append(EnumC621910OaL.BOTTOM_STRUCT.getKey());
        return new BulletinItemInteraction(strLJ, strLIZLLL, strLIZLLL2, numValueOf, C622120Oag.LIZLLL(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ5)));
    }
}
