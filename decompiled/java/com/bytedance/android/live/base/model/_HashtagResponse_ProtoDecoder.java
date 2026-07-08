package com.bytedance.android.live.base.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model._GameTag_ProtoDecoder;
import com.bytedance.android.livesdk.model._Hashtag_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _HashtagResponse_ProtoDecoder implements C0IMD<HashtagResponse> {
    @Override // X.C0IMD
    public final void LIZ(HashtagResponse hashtagResponse) {
        ImageModel imageModel;
        ImageModel imageModel2;
        ImageModel imageModel3;
        ImageModel imageModel4;
        HashtagResponse hashtagResponse2 = hashtagResponse;
        List<Hashtag> list = hashtagResponse2.hashtags;
        if (list == null) {
            hashtagResponse2.hashtags = new ArrayList();
        } else if (!list.isEmpty()) {
            for (Hashtag hashtag : hashtagResponse2.hashtags) {
                if (hashtag != null && (imageModel = hashtag.image) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        List<GameTag> list2 = hashtagResponse2.gameTagList;
        if (list2 == null) {
            hashtagResponse2.gameTagList = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (GameTag gameTag : hashtagResponse2.gameTagList) {
                if (gameTag != null) {
                    _GameTag_ProtoDecoder.LJ(gameTag);
                }
            }
        }
        Hashtag hashtag2 = hashtagResponse2.gameHashTag;
        if (hashtag2 != null) {
            _Hashtag_ProtoDecoder.LJ(hashtag2);
        }
        List<Hashtag> list3 = hashtagResponse2.obsHashTag;
        if (list3 == null) {
            hashtagResponse2.obsHashTag = new ArrayList();
        } else if (!list3.isEmpty()) {
            for (Hashtag hashtag3 : hashtagResponse2.obsHashTag) {
                if (hashtag3 != null && (imageModel2 = hashtag3.image) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel2);
                }
            }
        }
        List<Hashtag> list4 = hashtagResponse2.liveVoiceHashtag;
        if (list4 == null) {
            hashtagResponse2.liveVoiceHashtag = new ArrayList();
        } else if (!list4.isEmpty()) {
            for (Hashtag hashtag4 : hashtagResponse2.liveVoiceHashtag) {
                if (hashtag4 != null && (imageModel3 = hashtag4.image) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel3);
                }
            }
        }
        List<Hashtag> list5 = hashtagResponse2.liveStudioHashtag;
        if (list5 == null) {
            hashtagResponse2.liveStudioHashtag = new ArrayList();
            return;
        }
        if (list5.isEmpty()) {
            return;
        }
        for (Hashtag hashtag5 : hashtagResponse2.liveStudioHashtag) {
            if (hashtag5 != null && (imageModel4 = hashtag5.image) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel4);
            }
        }
    }

    @Override // X.C0IMD
    public final HashtagResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        HashtagResponse hashtagResponse = new HashtagResponse();
        hashtagResponse.obsHashTag = new ArrayList();
        hashtagResponse.liveStudioHashtag = new ArrayList();
        hashtagResponse.liveVoiceHashtag = new ArrayList();
        hashtagResponse.gameTagList = new ArrayList();
        hashtagResponse.hashtags = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        hashtagResponse.hashtags.add(_Hashtag_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 2:
                        hashtagResponse.gameTagList.add(_GameTag_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        hashtagResponse.gameHashTag = _Hashtag_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        hashtagResponse.obsHashTag.add(_Hashtag_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 5:
                        hashtagResponse.liveVoiceHashtag.add(_Hashtag_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        hashtagResponse.liveStudioHashtag.add(_Hashtag_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return hashtagResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HashtagResponse hashtagResponse, List list) {
    }
}
