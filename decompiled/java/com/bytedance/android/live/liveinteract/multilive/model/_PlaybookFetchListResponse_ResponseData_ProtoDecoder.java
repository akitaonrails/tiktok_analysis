package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookFetchListResponse;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookTagAggregation;
import webcast.data.multi_guest_play.PlaybookTagInfo;
import webcast.data.multi_guest_play._PlaybookTagAggregation_ProtoDecoder;
import webcast.data.multi_guest_play._PlaybookTagInfo_ProtoDecoder;
import webcast.data.multi_guest_play._Playbook_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _PlaybookFetchListResponse_ResponseData_ProtoDecoder implements C0IMD<PlaybookFetchListResponse.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(PlaybookFetchListResponse.ResponseData responseData) {
        PlaybookFetchListResponse.ResponseData responseData2 = responseData;
        List<Playbook> list = responseData2.myPlaybooks;
        if (list == null) {
            responseData2.myPlaybooks = new ArrayList();
        } else if (!list.isEmpty()) {
            for (Playbook playbook : responseData2.myPlaybooks) {
                if (playbook != null) {
                    _Playbook_ProtoDecoder.LJ(playbook);
                }
            }
        }
        List<Playbook> list2 = responseData2.favoritePlaybooks;
        if (list2 == null) {
            responseData2.favoritePlaybooks = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (Playbook playbook2 : responseData2.favoritePlaybooks) {
                if (playbook2 != null) {
                    _Playbook_ProtoDecoder.LJ(playbook2);
                }
            }
        }
        List<Playbook> list3 = responseData2.recommendedPlaybooks;
        if (list3 == null) {
            responseData2.recommendedPlaybooks = new ArrayList();
        } else if (!list3.isEmpty()) {
            for (Playbook playbook3 : responseData2.recommendedPlaybooks) {
                if (playbook3 != null) {
                    _Playbook_ProtoDecoder.LJ(playbook3);
                }
            }
        }
        List<PlaybookTagInfo> list4 = responseData2.allTags;
        if (list4 == null) {
            responseData2.allTags = new ArrayList();
        } else if (!list4.isEmpty()) {
            Iterator<PlaybookTagInfo> it2 = responseData2.allTags.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<PlaybookTagAggregation> list5 = responseData2.tagAggregations;
        if (list5 == null) {
            responseData2.tagAggregations = new ArrayList();
            return;
        }
        if (list5.isEmpty()) {
            return;
        }
        for (PlaybookTagAggregation playbookTagAggregation : responseData2.tagAggregations) {
            if (playbookTagAggregation != null) {
                _PlaybookTagAggregation_ProtoDecoder.LJ(playbookTagAggregation);
            }
        }
    }

    @Override // X.C0IMD
    public final PlaybookFetchListResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PlaybookFetchListResponse.ResponseData responseData = new PlaybookFetchListResponse.ResponseData();
        responseData.recommendedPlaybooks = new ArrayList();
        responseData.favoritePlaybooks = new ArrayList();
        responseData.tagAggregations = new ArrayList();
        responseData.allTags = new ArrayList();
        responseData.myPlaybooks = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        responseData.myPlaybooks.add(_Playbook_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 2:
                        responseData.favoritePlaybooks.add(_Playbook_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        responseData.recommendedPlaybooks.add(_Playbook_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        responseData.isOfficialUser = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        responseData.allTags.add(_PlaybookTagInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        responseData.currentRecommendedTagType = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        responseData.tagAggregations.add(_PlaybookTagAggregation_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 8:
                        responseData.currentRecommendedFirstLevelTagType = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        responseData.latestUsedPlaybookId = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PlaybookFetchListResponse.ResponseData responseData, List list) {
    }
}
