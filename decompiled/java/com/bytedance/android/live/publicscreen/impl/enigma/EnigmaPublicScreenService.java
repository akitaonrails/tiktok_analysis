package com.bytedance.android.live.publicscreen.impl.enigma;

import X.C087500Un;
import X.C15438062q;
import X.C20441214yg;
import X.C2188811AlT;
import X.C520890Kbn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.CombineBadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.enigma.IEnigmaPublicScreenService;
import com.bytedance.android.livesdk.model.message.WhisperMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class EnigmaPublicScreenService implements IEnigmaPublicScreenService {
    @Override // com.bytedance.android.live.publicscreen.api.enigma.IEnigmaPublicScreenService
    public final WhisperMessage ra1(long j, String str, User user, C520890Kbn c520890Kbn, String str2) {
        ArrayList arrayList;
        List<BadgeStruct> badgeList;
        User user2;
        BadgeStruct badgeStruct;
        CombineBadgeStruct combineBadgeStruct;
        ImageModel imageModel;
        List<String> urls;
        Set<Long> set = C087500Un.LIZ;
        WhisperMessage whisperMessage = new WhisperMessage();
        long j2 = -System.currentTimeMillis();
        C087500Un.LIZ.add(Long.valueOf(j2));
        CommonMessageData commonMessageData = new CommonMessageData();
        commonMessageData.roomId = j;
        commonMessageData.messageId = j2;
        commonMessageData.showMsg = true;
        commonMessageData.describe = str2;
        whisperMessage.baseMessage = commonMessageData;
        Text text = new Text();
        text.defaultPattern = str;
        whisperMessage.content = text;
        User userFrom = User.from(user);
        whisperMessage.user = userFrom;
        if (userFrom != null && (badgeList = userFrom.getBadgeList()) != null && (!badgeList.isEmpty()) && (user2 = whisperMessage.user) != null && (badgeStruct = (BadgeStruct) ListProtector.get(user2.getBadgeList(), 0)) != null && (combineBadgeStruct = badgeStruct.combineBadgeStruct) != null && (imageModel = combineBadgeStruct.icon) != null && (urls = imageModel.getUrls()) != null) {
            for (String str3 : urls) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("url = ");
                sbLIZ.append(str3);
                C20441214yg.LIZIZ("MockEnigmaWhisperMessageManager", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        whisperMessage.isLocalInsertMsg = true;
        List<EmoteWithIndex> list = c520890Kbn.LIZIZ;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (EmoteWithIndex emoteWithIndex : list) {
                WhisperMessage.EmoteWithIndex emoteWithIndex2 = new WhisperMessage.EmoteWithIndex();
                emoteWithIndex2.emote = emoteWithIndex.emoteModel;
                emoteWithIndex2.index = emoteWithIndex.index;
                arrayList2.add(emoteWithIndex2);
            }
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = new ArrayList();
        }
        whisperMessage.f316emotes = arrayList;
        return whisperMessage;
    }
}
