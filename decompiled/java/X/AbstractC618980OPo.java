package X;

import com.ss.android.ugc.aweme.bulletin.db.modle.BulletinCommentDB;
import com.ss.android.ugc.aweme.bulletin.db.modle.BulletinCommentDBOverview;
import com.ss.android.ugc.aweme.bulletin.db.modle.BulletinItemBase;
import com.ss.android.ugc.aweme.bulletin.db.modle.BulletinItemContent;
import com.ss.android.ugc.aweme.bulletin.db.modle.BulletinItemInteraction;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAudioInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCommentDetail;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCommentOverview;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCommentUser;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinImage;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPoll;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0OPo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC618980OPo {
    public static C619060OPw LIZ(BulletinItem bulletinItem, String str, boolean z) {
        String uid;
        int i;
        BulletinCommentDBOverview bulletinCommentDBOverview;
        String str2;
        ArrayList arrayList;
        String str3;
        TuxImageModel tuxImageModel;
        String itemId = bulletinItem.getItemId();
        if (itemId == null) {
            return null;
        }
        Long updateTime = bulletinItem.getUpdateTime();
        Long lValueOf = Long.valueOf(bulletinItem.getCreatorTime());
        User publishUser = bulletinItem.getPublishUser();
        if (publishUser != null) {
            uid = publishUser.getUid();
        } else {
            uid = null;
        }
        Integer numValueOf = Integer.valueOf(bulletinItem.getType());
        if (z && !bulletinItem.getHasRead()) {
            i = 0;
        } else {
            i = 1;
        }
        BulletinItemBase bulletinItemBase = new BulletinItemBase(itemId, str, updateTime, lValueOf, uid, numValueOf, Integer.valueOf(i), 0, Integer.valueOf(bulletinItem.getStatus()), bulletinItem.getStyleId());
        String strLIZIZ = C619030OPt.LIZIZ(bulletinItem.getEmojiList());
        BulletinCommentOverview commentOverview = bulletinItem.getCommentOverview();
        if (commentOverview != null) {
            Boolean bool = commentOverview.enableComment;
            List<BulletinCommentDetail> list = commentOverview.comments;
            if (list != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (BulletinCommentDetail bulletinCommentDetail : list) {
                    String str4 = bulletinCommentDetail.cid;
                    String str5 = bulletinCommentDetail.text;
                    BulletinCommentUser bulletinCommentUser = bulletinCommentDetail.user;
                    if (bulletinCommentUser != null) {
                        str3 = bulletinCommentUser.uid;
                        tuxImageModel = bulletinCommentUser.avatarThumb;
                    } else {
                        str3 = null;
                        tuxImageModel = null;
                    }
                    arrayList.add(new BulletinCommentDB(str4, str5, str3, tuxImageModel, bulletinCommentDetail.commentLanguage, bulletinCommentDetail.status));
                }
            } else {
                arrayList = null;
            }
            bulletinCommentDBOverview = new BulletinCommentDBOverview(bool, arrayList, commentOverview.total);
        } else {
            bulletinCommentDBOverview = null;
        }
        BulletinItemInteraction bulletinItemInteraction = new BulletinItemInteraction(itemId, strLIZIZ, C619030OPt.LIZIZ(bulletinCommentDBOverview), Integer.valueOf(bulletinItem.getViewCount()), C619030OPt.LIZIZ(bulletinItem.getBottomStruct()));
        ArrayList arrayList2 = new ArrayList();
        String text = bulletinItem.getText();
        if (text != null) {
            arrayList2.add(new BulletinItemContent(itemId, C619040OPu.LIZ("text"), C619030OPt.LIZIZ(text)));
        }
        List<String> links = bulletinItem.getLinks();
        if (links != null) {
            arrayList2.add(new BulletinItemContent(itemId, C619040OPu.LIZ("links"), C619030OPt.LIZIZ(links)));
        }
        List<BulletinImage> images = bulletinItem.getImages();
        if (images != null) {
            arrayList2.add(new BulletinItemContent(itemId, C619040OPu.LIZ("images"), C619030OPt.LIZIZ(images)));
        }
        Aweme aweme = bulletinItem.getAweme();
        if (aweme != null) {
            arrayList2.add(new BulletinItemContent(itemId, C619040OPu.LIZ("forward_aweme"), C619030OPt.LIZIZ(aweme)));
        }
        BulletinCardInfo cardInfo = bulletinItem.getCardInfo();
        if (cardInfo != null) {
            C618820OOy c618820OOy = EnumC618810OOx.Companion;
            int type = bulletinItem.getType();
            c618820OOy.getClass();
            EnumC618810OOx enumC618810OOx = EnumC618810OOx.typeCache.get(Integer.valueOf(type));
            if (enumC618810OOx != null) {
                int i2 = C0OOX.LIZ[enumC618810OOx.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        str2 = "live_room";
                    }
                } else {
                    str2 = "lynx_card";
                }
                arrayList2.add(new BulletinItemContent(itemId, C619040OPu.LIZ(str2), C619030OPt.LIZIZ(cardInfo)));
            }
        }
        BulletinPoll poll = bulletinItem.getPoll();
        if (poll != null) {
            arrayList2.add(new BulletinItemContent(itemId, C619040OPu.LIZ("poll"), C619030OPt.LIZIZ(poll)));
        }
        String text2 = bulletinItem.getText();
        if (text2 != null) {
            C618820OOy c618820OOy2 = EnumC618810OOx.Companion;
            int type2 = bulletinItem.getType();
            c618820OOy2.getClass();
            if (EnumC618810OOx.typeCache.get(Integer.valueOf(type2)) == EnumC618810OOx.INLINE_MSG) {
                arrayList2.add(new BulletinItemContent(itemId, C619040OPu.LIZ("inline_msg"), C619030OPt.LIZIZ(text2)));
            }
        }
        List<BulletinAudioInfo> voices = bulletinItem.getVoices();
        if (voices != null) {
            arrayList2.add(new BulletinItemContent(itemId, C619040OPu.LIZ("voice"), C619030OPt.LIZIZ(voices)));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new C619060OPw(bulletinItemBase, new ArrayList(arrayList2), bulletinItemInteraction);
    }
}
