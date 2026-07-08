package X;

import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.inbox.bulletin.share.BulletinBoardInviteSharePackage;
import com.ss.android.ugc.aweme.inbox.bulletin.share.BulletinBoardShareConfiguration;
import com.ss.android.ugc.aweme.inbox.bulletin.share.BulletinShareModel;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0OYY, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OYY {
    public static void LIZ(BulletinShareModel bulletinShareModel, C19EG c19eg, String str, String str2) {
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("from_bb_channel_id", bulletinShareModel.bulletinId));
        BaseTemplate baseTemplateLIZIZ = C2241931Cox.LIZIZ(2000, bulletinShareModel.contentPb);
        if (baseTemplateLIZIZ == null) {
            return;
        }
        SendMessageTemplateTask sendMessageTemplateTask = new SendMessageTemplateTask("bulletin_share", baseTemplateLIZIZ, new SendMessageEventParcel(str, null, null, str2, null, C105700ad.LIZIZ(mapLIZJ), 22), null, false, 24);
        C1370940lmO c1370940lmOLJIIIIZZ = new C617580OKe(bulletinShareModel, c19eg).LJIIIIZZ();
        c1370940lmOLJIIIIZZ.LJIIIIZZ = sendMessageTemplateTask;
        BulletinBoardInviteSharePackage bulletinBoardInviteSharePackage = new BulletinBoardInviteSharePackage(c1370940lmOLJIIIIZZ);
        C621180OYa.LIZIZ.LJJIJLIJ(bulletinBoardInviteSharePackage);
        C786410Ut5.LJJJI("enter_from", str, bulletinBoardInviteSharePackage.extras);
        C786410Ut5.LJJJI("enter_method", str2, bulletinBoardInviteSharePackage.extras);
        C621180OYa.LIZ.LJIIZILJ(bulletinBoardInviteSharePackage, c19eg, BulletinBoardShareConfiguration.LLILLJJLI);
    }
}
