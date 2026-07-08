package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.bulletin.db.modle.BulletinCommentDB;
import com.ss.android.ugc.aweme.bulletin.db.modle.BulletinCommentDBOverview;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinCommentUIOverview;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinPhotoItem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinVoiceItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCommentDetail;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCommentOverview;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCommentUser;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinHybridCardConfigStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OPq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C619000OPq {
    public static final String LIZIZ(BulletinBaseItem bulletinBaseItem) {
        BulletinCardInfo bulletinCardInfo;
        if (bulletinBaseItem instanceof C0OOP) {
            return "text";
        }
        if (bulletinBaseItem instanceof BulletinPhotoItem) {
            return "photo";
        }
        if (bulletinBaseItem instanceof BulletinVoiceItem) {
            return "voice";
        }
        if (!(bulletinBaseItem instanceof C0OOV) || (bulletinCardInfo = ((C0OOV) bulletinBaseItem).LLJJL) == null) {
            return "";
        }
        if (bulletinCardInfo.cardType == 1) {
            return "live_event";
        }
        if (bulletinCardInfo.cardType != 5 && bulletinCardInfo.cardType != 6) {
            if (bulletinCardInfo.cardType != 9) {
                return "";
            }
            return "video";
        }
        return "music_card";
    }

    public static final String LIZJ(BulletinItem bulletinItem) {
        String strLIZIZ;
        BulletinHybridCardConfigStruct bulletinHybridCardConfigStruct;
        String str;
        Uri uri;
        int i = C0OOT.LIZ[C618820OOy.LIZ(EnumC618810OOx.Companion, bulletinItem.getType()).ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        BulletinCardInfo cardInfo = bulletinItem.getCardInfo();
                        if (cardInfo != null && cardInfo.cardType == 1) {
                            return "live_event";
                        }
                        BulletinCardInfo cardInfo2 = bulletinItem.getCardInfo();
                        if (cardInfo2 != null && cardInfo2.cardType == 5) {
                            return "music_card";
                        }
                        BulletinCardInfo cardInfo3 = bulletinItem.getCardInfo();
                        if (cardInfo3 != null && cardInfo3.cardType == 6) {
                            return "music_card";
                        }
                        BulletinCardInfo cardInfo4 = bulletinItem.getCardInfo();
                        if (cardInfo4 != null && (bulletinHybridCardConfigStruct = cardInfo4.hybridConfigInfo) != null && (str = bulletinHybridCardConfigStruct.schema) != null && (uri = UriProtector.parse(str)) != null) {
                            strLIZIZ = C1907940zkW.LIZIZ(uri, "spark_page");
                        } else {
                            strLIZIZ = null;
                        }
                        if (Intrinsics.LJFF(strLIZIZ, "social_inbox_bulletin_media_card")) {
                            return "video";
                        }
                        return "";
                    }
                    return "";
                }
                return "voice";
            }
            return "photo";
        }
        return "text";
    }

    public static final int LIZLLL(BulletinCommentUIOverview bulletinCommentUIOverview) {
        List<AbstractC619610ORz> list = bulletinCommentUIOverview.comments;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC619610ORz abstractC619610ORz : list) {
                if (abstractC619610ORz instanceof C0OS0) {
                    arrayList.add(abstractC619610ORz);
                }
            }
            return arrayList.size();
        }
        return 0;
    }

    public static final boolean LJ(Comment comment) {
        if (comment == null || !C123100dR.LIZ(comment.getRootCommentId()) || Intrinsics.LJFF(comment.getRootCommentId(), CardStruct.IStatusCode.DEFAULT)) {
            return false;
        }
        return true;
    }

    public static final BulletinCommentOverview LJII(BulletinCommentDBOverview bulletinCommentDBOverview) {
        ArrayList arrayList = null;
        if (bulletinCommentDBOverview == null) {
            return null;
        }
        Boolean bool = bulletinCommentDBOverview.enableComment;
        List<BulletinCommentDB> list = bulletinCommentDBOverview.comments;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (BulletinCommentDB bulletinCommentDB : list) {
                arrayList.add(new BulletinCommentDetail(bulletinCommentDB.id, bulletinCommentDB.content, new BulletinCommentUser(bulletinCommentDB.userId, null, null, bulletinCommentDB.avatar, null), bulletinCommentDB.commentLanguage, bulletinCommentDB.status));
            }
        }
        return new BulletinCommentOverview(bool, arrayList, bulletinCommentDBOverview.total);
    }

    public static final Boolean LJIIIZ(String str) {
        String lowerCase;
        if (str == null || (lowerCase = str.toLowerCase(Locale.ROOT)) == null) {
            return null;
        }
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != 3392903) {
            if (iHashCode != 3569038) {
                if (iHashCode == 97196323 && lowerCase.equals("false")) {
                    return Boolean.FALSE;
                }
            } else if (lowerCase.equals("true")) {
                return Boolean.TRUE;
            }
        } else if (lowerCase.equals("null")) {
            return null;
        }
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    public static final BulletinCommentUIOverview LIZ(Boolean bool, String str) {
        List listSingletonList = null;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            listSingletonList = Collections.singletonList(new C619580ORw(((AbstractC848400XPy) C0XQ7.LJFF()).getAvatarUrl(), str, null));
        }
        return new BulletinCommentUIOverview(bool, listSingletonList, null, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleTextModel] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static final BulletinCommentUIOverview LJIIIIZZ(BulletinCommentOverview bulletinCommentOverview, String str, String str2) {
        int iIntValue;
        List listLL;
        ?? r11;
        ?? r3 = 0;
        r3 = 0;
        r3 = 0;
        r3 = 0;
        r3 = 0;
        if (bulletinCommentOverview == null) {
            return null;
        }
        Boolean bool = bulletinCommentOverview.enableComment;
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        Integer num = bulletinCommentOverview.total;
        int i = 0;
        if (num != null && num.intValue() > 0) {
            Integer num2 = bulletinCommentOverview.total;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
            c13dvLIZIZ.add(new C619590ORx(iIntValue, str, null));
            List<BulletinCommentDetail> list = bulletinCommentOverview.comments;
            if (list != null && (listLL = C13LP.LL(list, 2)) != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLL, 10));
                for (Object obj : listLL) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        BulletinCommentDetail bulletinCommentDetail = (BulletinCommentDetail) obj;
                        String str3 = bulletinCommentDetail.cid;
                        String str4 = bulletinCommentDetail.text;
                        BulletinCommentUser bulletinCommentUser = bulletinCommentDetail.user;
                        if (bulletinCommentUser != null) {
                            r11 = bulletinCommentUser.avatarThumb;
                        } else {
                            r11 = r3;
                        }
                        Integer num3 = bulletinCommentDetail.status;
                        String str5 = bulletinCommentDetail.commentLanguage;
                        if (bulletinCommentUser != null) {
                            r3 = bulletinCommentUser.uid;
                        }
                        arrayList.add(Boolean.valueOf(c13dvLIZIZ.add(new C0OS0(str3, str4, r11, str, str2, num3, i2, str5, r3, null))));
                        i = i2;
                        r3 = 0;
                    } else {
                        C1697810uHb.LJIJI();
                        throw r3;
                    }
                }
            }
        }
        if (Intrinsics.LJFF(bulletinCommentOverview.enableComment, Boolean.TRUE)) {
            c13dvLIZIZ.add(new C619580ORw(((AbstractC848400XPy) C0XQ7.LJFF()).getAvatarUrl(), str, r3));
        }
        return new BulletinCommentUIOverview(bool, C1697820uHc.LIZ(c13dvLIZIZ), bulletinCommentOverview.total, 0);
    }

    public static final BulletinCommentUIOverview LJIIJJI(BulletinCommentUIOverview bulletinCommentUIOverview, Boolean bool, String str) {
        Collection collection = bulletinCommentUIOverview.comments;
        if (collection == null) {
            collection = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(collection);
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        C19719612Di.LJJIIJ(arrayList, AFwS240S0000000_9.get$arr$(936), true);
        c13dvLIZIZ.addAll(arrayList);
        Boolean bool2 = Boolean.TRUE;
        List listSingletonList = null;
        if (Intrinsics.LJFF(bool, bool2)) {
            c13dvLIZIZ.add(new C619580ORw(((AbstractC848400XPy) C0XQ7.LJFF()).getAvatarUrl(), str, null));
        }
        BulletinCommentUIOverview bulletinCommentUIOverviewCopy = bulletinCommentUIOverview.copy(bool, C1697820uHc.LIZ(c13dvLIZIZ), bulletinCommentUIOverview.total, bulletinCommentUIOverview.version);
        if (bulletinCommentUIOverviewCopy == null) {
            if (Intrinsics.LJFF(bool, bool2)) {
                listSingletonList = Collections.singletonList(new C619580ORw(((AbstractC848400XPy) C0XQ7.LJFF()).getAvatarUrl(), str, null));
            }
            return new BulletinCommentUIOverview(bool, listSingletonList, null, 0);
        }
        return bulletinCommentUIOverviewCopy;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinCommentUIOverview LJIIJ(com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinCommentUIOverview r19, java.util.List<? extends X.InterfaceC1891350zJl> r20, java.lang.Integer r21, java.lang.String r22, java.lang.String r23, com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleTextModel r24) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C619000OPq.LJIIJ(com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinCommentUIOverview, java.util.List, java.lang.Integer, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleTextModel):com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinCommentUIOverview");
    }

    public static final C0OTS LJFF(Comment comment, long j, long j2, boolean z, UrlModel urlModel, boolean z2, boolean z3, boolean z4, String str, String str2, EnumC620990OXh enumC620990OXh, boolean z5) {
        return new C0OTS(comment, j, j2, z, urlModel, z2, z3, z4, str, 0, str2, enumC620990OXh, z5);
    }
}
