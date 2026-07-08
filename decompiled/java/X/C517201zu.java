package X;

import com.bytedance.android.live.liveinteract.competition.model.BeansInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfo;
import com.bytedance.android.live.liveinteract.competition.model.TakeTheStageInfo;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.01zu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C517201zu implements InterfaceC1487280oo2 {
    public final int $t;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            default:
                return null;
        }
    }

    public C517201zu(int i) {
        this.$t = i;
    }

    public static final Object apply$0(C517201zu c517201zu, Object obj) {
        int size;
        String str;
        RoomLinkInfo roomLinkInfo = (RoomLinkInfo) obj;
        HashMap map = new HashMap();
        map.put("channel_id", String.valueOf(roomLinkInfo.channelId));
        map.put("connection_type", "anchor");
        List<Long> list = roomLinkInfo.audienceIdList;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        map.put("guest_cnt", String.valueOf(size));
        if (size > 0) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_guest_connection", str);
        return map;
    }

    public static final Object apply$1(C517201zu c517201zu, Object obj) {
        return Long.valueOf(10 - (((Long) obj).longValue() + 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$2(C517201zu c517201zu, Object obj) {
        long j;
        Long lValueOf;
        BeansInfo beansInfo;
        BaseResponse baseResponse = (BaseResponse) obj;
        CompetitionInfo competitionInfo = (CompetitionInfo) baseResponse.data;
        CompetitionCommon competitionCommon = competitionInfo.bizCommon;
        if (competitionCommon != null) {
            j = competitionCommon.competitionId;
        } else {
            j = 0;
        }
        boolean z = true;
        if (j != 0 && ((beansInfo = competitionInfo.beansInfo) == null || beansInfo.status != 5)) {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isNotInCatchBeans");
        sbLIZ.append(", result=");
        sbLIZ.append(z);
        sbLIZ.append(", competitionId=");
        CompetitionCommon competitionCommon2 = ((CompetitionInfo) baseResponse.data).bizCommon;
        Integer numValueOf = null;
        if (competitionCommon2 != null) {
            lValueOf = Long.valueOf(competitionCommon2.competitionId);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(", catchBeansStatus=");
        BeansInfo beansInfo2 = ((CompetitionInfo) baseResponse.data).beansInfo;
        if (beansInfo2 != null) {
            numValueOf = Integer.valueOf(beansInfo2.status);
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LJ("MultiHostCrossAdapter", C2188811AlT.LIZIZ(sbLIZ));
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$3(C517201zu c517201zu, Object obj) {
        long j;
        Long lValueOf;
        TakeTheStageInfo takeTheStageInfo;
        BaseResponse baseResponse = (BaseResponse) obj;
        CompetitionInfo competitionInfo = (CompetitionInfo) baseResponse.data;
        CompetitionCommon competitionCommon = competitionInfo.bizCommon;
        if (competitionCommon != null) {
            j = competitionCommon.competitionId;
        } else {
            j = 0;
        }
        boolean z = true;
        if (j != 0 && ((takeTheStageInfo = competitionInfo.takeTheStageInfo) == null || takeTheStageInfo.takeTheStageStatus != 6)) {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isNotInTakeTheStage");
        sbLIZ.append(", result=");
        sbLIZ.append(z);
        sbLIZ.append(", competitionId=");
        CompetitionCommon competitionCommon2 = ((CompetitionInfo) baseResponse.data).bizCommon;
        Integer numValueOf = null;
        if (competitionCommon2 != null) {
            lValueOf = Long.valueOf(competitionCommon2.competitionId);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(", takeTheStageStatus=");
        TakeTheStageInfo takeTheStageInfo2 = ((CompetitionInfo) baseResponse.data).takeTheStageInfo;
        if (takeTheStageInfo2 != null) {
            numValueOf = Integer.valueOf(takeTheStageInfo2.takeTheStageStatus);
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LJ("MultiHostCrossAdapter", C2188811AlT.LIZIZ(sbLIZ));
        return Boolean.valueOf(z);
    }
}
