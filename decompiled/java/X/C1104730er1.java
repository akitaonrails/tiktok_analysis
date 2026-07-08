package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.envelope.model.EnvelopeEnigmaInfo;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopInfo4FE;
import com.bytedance.android.livesdk.model.message.redenvelope.MessageRedEnvelopInfo;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0er1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104730er1 {
    public static final RedEnvelopInfo4FE LIZ(MessageRedEnvelopInfo messageRedEnvelopInfo) {
        int size;
        String str;
        ImageModel imageModel;
        List urls;
        List urls2;
        RedEnvelopInfo4FE redEnvelopInfo4FE = new RedEnvelopInfo4FE();
        redEnvelopInfo4FE.businessType = messageRedEnvelopInfo.businessType;
        redEnvelopInfo4FE.diamondCount = messageRedEnvelopInfo.diamondCount;
        redEnvelopInfo4FE.envelopeId = messageRedEnvelopInfo.envelopeId;
        redEnvelopInfo4FE.envelopeIdc = messageRedEnvelopInfo.envelopeIdc;
        redEnvelopInfo4FE.peopleCount = messageRedEnvelopInfo.peopleCount;
        redEnvelopInfo4FE.sendUserId = messageRedEnvelopInfo.sendUserId;
        redEnvelopInfo4FE.unpackAt = messageRedEnvelopInfo.unpackAt;
        redEnvelopInfo4FE.sendUserName = messageRedEnvelopInfo.sendUserName;
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
        redEnvelopInfo4FE.sendUserAvatar = str;
        redEnvelopInfo4FE.followStatusShow = messageRedEnvelopInfo.followStatusShow;
        redEnvelopInfo4FE.createAt = messageRedEnvelopInfo.createTime;
        redEnvelopInfo4FE.skinId = messageRedEnvelopInfo.skinId;
        redEnvelopInfo4FE.voteCount = messageRedEnvelopInfo.voteCount;
        EnvelopeEnigmaInfo envelopeEnigmaInfo = messageRedEnvelopInfo.senderEnigmaInfo;
        if (envelopeEnigmaInfo != null) {
            json = GsonProtectorUtils.toJson(C19748512Ol.LIZJ, envelopeEnigmaInfo);
        }
        redEnvelopInfo4FE.senderEnigmaInfo = json;
        return redEnvelopInfo4FE;
    }
}
