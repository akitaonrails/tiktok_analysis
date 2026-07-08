package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.envelope.model.EnvelopeEnigmaInfo;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.model.ActivityTreasureBoxInfo4FE;
import com.bytedance.android.livesdk.model.message.redenvelope.MessageRedEnvelopInfo;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0er2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104740er2 {
    public static final ActivityTreasureBoxInfo4FE LIZ(MessageRedEnvelopInfo messageRedEnvelopInfo) {
        int size;
        String str;
        ImageModel imageModel;
        List urls;
        List urls2;
        ActivityTreasureBoxInfo4FE activityTreasureBoxInfo4FE = new ActivityTreasureBoxInfo4FE();
        activityTreasureBoxInfo4FE.businessType = messageRedEnvelopInfo.businessType;
        activityTreasureBoxInfo4FE.diamondCount = messageRedEnvelopInfo.diamondCount;
        activityTreasureBoxInfo4FE.envelopeId = messageRedEnvelopInfo.envelopeId;
        activityTreasureBoxInfo4FE.envelopeIdc = messageRedEnvelopInfo.envelopeIdc;
        activityTreasureBoxInfo4FE.peopleCount = messageRedEnvelopInfo.peopleCount;
        activityTreasureBoxInfo4FE.sendUserId = messageRedEnvelopInfo.sendUserId;
        activityTreasureBoxInfo4FE.unpackAt = messageRedEnvelopInfo.unpackAt;
        activityTreasureBoxInfo4FE.sendUserName = messageRedEnvelopInfo.sendUserName;
        ImageModel imageModel2 = messageRedEnvelopInfo.sendUserAvatar;
        if (imageModel2 != null && (urls2 = imageModel2.getUrls()) != null) {
            size = urls2.size();
        } else {
            size = 0;
        }
        String json = "";
        if (size <= 0 || (imageModel = messageRedEnvelopInfo.sendUserAvatar) == null || (urls = imageModel.getUrls()) == null || (str = (String) ListProtector.get(urls, 0)) == null) {
            str = "";
        }
        activityTreasureBoxInfo4FE.sendUserAvatar = str;
        activityTreasureBoxInfo4FE.followStatusShow = messageRedEnvelopInfo.followStatusShow;
        activityTreasureBoxInfo4FE.skinId = messageRedEnvelopInfo.skinId;
        activityTreasureBoxInfo4FE.voteCount = messageRedEnvelopInfo.voteCount;
        activityTreasureBoxInfo4FE.createAt = messageRedEnvelopInfo.createTime;
        EnvelopeEnigmaInfo envelopeEnigmaInfo = messageRedEnvelopInfo.senderEnigmaInfo;
        if (envelopeEnigmaInfo != null) {
            json = GsonProtectorUtils.toJson(C19748512Ol.LIZJ, envelopeEnigmaInfo);
        }
        activityTreasureBoxInfo4FE.senderEnigmaInfo = json;
        return activityTreasureBoxInfo4FE;
    }
}
