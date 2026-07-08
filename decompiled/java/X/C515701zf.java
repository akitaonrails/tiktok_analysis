package X;

import android.app.Activity;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardGetUserRestrictedHistoryResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.01zf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C515701zf implements C09JN {
    public final int $t;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
        }
    }

    public C515701zf(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(C515701zf c515701zf, Object obj) {
        C1C7U.LIZ("InteractService@c732.getNoticeboardRestrictedHistory$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        String str = c515701zf.s0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getUserRestrictedHistory success logid=");
        sbLIZ.append(baseResponse.LIZIZ);
        C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        Set<Map.Entry<String, Integer>> setEntrySet = ((NoticeboardGetUserRestrictedHistoryResponse.ResponseData) baseResponse.data).restrictedMap.entrySet();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setEntrySet, 10));
        Iterator<T> it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        C953760avW.LIZIZ.LIZ().LJIJ(arrayList);
        C1C7U.LIZIZ("InteractService@c732.getNoticeboardRestrictedHistory$1");
    }

    public static final void accept$1(C515701zf c515701zf, Object obj) {
        String logId;
        C1C7U.LIZ("InteractService@c732.getNoticeboardRestrictedHistory$2");
        Throwable th = (Throwable) obj;
        if (th instanceof C477520Io2) {
            logId = ((C501470JlZ) th).getLogId();
        } else {
            logId = "";
        }
        String str = c515701zf.s0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getUserRestrictedHistory fail throwable=");
        sbLIZ.append(th);
        sbLIZ.append(" logid=");
        sbLIZ.append(logId);
        C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("InteractService@c732.getNoticeboardRestrictedHistory$2");
    }

    public static final void accept$2(C515701zf c515701zf, Object obj) {
        C1C7U.LIZ("NoticeboardGuestController@b397.getImageMetaFromPublicServer$1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getImageMetaInfo url=");
        sbLIZ.append(c515701zf.s0);
        sbLIZ.append(" imageMetaData=");
        sbLIZ.append(obj);
        C20441214yg.LJIIIZ("NoticeboardGuestController", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("NoticeboardGuestController@b397.getImageMetaFromPublicServer$1");
    }

    public static final void accept$3(C515701zf c515701zf, Object obj) {
        C1C7U.LIZ("GuestTextHeaderViewModel@ebbe.recordInfoObserver$1$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchSingleEffect failed effect:");
        sbLIZ.append(C20424314vx.LIZJ(c515701zf.s0));
        sbLIZ.append(" msg:");
        sbLIZ.append(obj);
        C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "GuestTextHeaderViewModel", 2);
        C1C7U.LIZIZ("GuestTextHeaderViewModel@ebbe.recordInfoObserver$1$2");
    }

    public static final void accept$4(C515701zf c515701zf, Object obj) {
        Activity activityLIZ;
        C1C7U.LIZ("EditGroupInfoContainerAssem@22f0.onViewCreated$2$1");
        Activity activityLIZIZ = ((AbstractC1387200mCc) obj).LIZIZ();
        if (activityLIZIZ != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null && !activityLIZ.isFinishing() && !activityLIZ.isDestroyed()) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ(c515701zf.s0);
            c1389890mGx.LJIIJJI();
        }
        C1C7U.LIZIZ("EditGroupInfoContainerAssem@22f0.onViewCreated$2$1");
    }

    public static final void accept$5(C515701zf c515701zf, Object obj) {
        C1C7U.LIZ("NoticeboardGuestController@b397.getImageMetaFromPublicServer$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getImageMetaInfo url=");
        sbLIZ.append(c515701zf.s0);
        sbLIZ.append(" throwable=");
        sbLIZ.append(obj);
        C20441214yg.LJIIIZ("NoticeboardGuestController", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("NoticeboardGuestController@b397.getImageMetaFromPublicServer$2");
    }

    public static final void accept$6(C515701zf c515701zf, Object obj) {
        C1C7U.LIZ("MultiTopLiveTopModuleTimerManager@625d.startPrefetchTimerIfNeeded$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopModuleTimerManager RxJava timer error, source: ");
        sbLIZ.append(c515701zf.s0);
        C20441214yg.LJFF("MultiTopLiveTopModuleTimerManager", C2188811AlT.LIZIZ(sbLIZ), (Throwable) obj);
        C1C7U.LIZIZ("MultiTopLiveTopModuleTimerManager@625d.startPrefetchTimerIfNeeded$2");
    }

    public static final void accept$7(C515701zf c515701zf, Object obj) {
        C1C7U.LIZ("DrawRoomListProvider@3742.uploadUnReadItem$2$1$1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Collecting unread room result, extra: ");
        sbLIZ.append(c515701zf.s0);
        sbLIZ.append(", statusCode: ");
        sbLIZ.append(((BaseResponse) obj).statusCode);
        sbLIZ.append('.');
        C20441214yg.LIZIZ("DrawRoomListProvider", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("DrawRoomListProvider@3742.uploadUnReadItem$2$1$1");
    }

    public static final void accept$8(C515701zf c515701zf, Object obj) {
        C1C7U.LIZ("MultiGuestPermissionManager@6f0.checkVideoShotPluginInstall$1$onSuccess$2");
        boolean z = C925080aBG.LIZ;
        String strLJII = C925080aBG.LJII(474);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadShortVideoRes CreateModeFailed, from:");
        sbLIZ.append(c515701zf.s0);
        C1AZW.LJFF(strLJII, C2188811AlT.LIZIZ(sbLIZ), ((Throwable) obj).getMessage(), null);
        C1C7U.LIZIZ("MultiGuestPermissionManager@6f0.checkVideoShotPluginInstall$1$onSuccess$2");
    }
}
