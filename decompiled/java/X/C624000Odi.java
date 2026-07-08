package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.WorkBenchNoticeResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Odi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.workbench.WorkBenchDataManager$markCacheDataRead$1", f = "WorkBenchDataManager.kt", l = {}, m = "invokeSuspend")
public final class C624000Odi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C624000Odi(InterfaceC1364105Vn<? super C624000Odi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C624000Odi(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<MissionStruct> missionList;
        MissionStruct missionStructCopy;
        C1C7U.LIZ("WorkBenchDataManager@2241.markCacheDataRead$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C624110Odt.LIZ.getClass();
        C624100Ods c624100OdsLIZ = C624110Odt.LIZ();
        if (c624100OdsLIZ.LIZLLL) {
            ArrayList arrayList = new ArrayList();
            WorkBenchNoticeResponse workBenchNoticeResponse = c624100OdsLIZ.LIZJ;
            WorkBenchNoticeResponse workBenchNoticeResponseCopy = null;
            if (workBenchNoticeResponse != null && (missionList = workBenchNoticeResponse.getMissionList()) != null) {
                for (MissionStruct missionStruct : missionList) {
                    if (missionStruct != null) {
                        missionStructCopy = missionStruct.copy(missionStruct.mid, missionStruct.sourceType, missionStruct.statusType, missionStruct.updateTime, missionStruct.createTime, true, missionStruct.uiStruct, missionStruct.messageExtra, missionStruct.subSourceType, missionStruct.subSourceLabel, missionStruct.subSourceText, missionStruct.unsubscribeStatus);
                    } else {
                        missionStructCopy = null;
                    }
                    arrayList.add(missionStructCopy);
                }
            }
            C624110Odt c624110Odt = C624110Odt.LIZ;
            WorkBenchNoticeResponse workBenchNoticeResponse2 = c624100OdsLIZ.LIZJ;
            if (workBenchNoticeResponse2 != null) {
                workBenchNoticeResponseCopy = workBenchNoticeResponse2.copy(arrayList, workBenchNoticeResponse2.missionTabInfo, "", workBenchNoticeResponse2.total, false, workBenchNoticeResponse2.tabId, null, "", 0L, workBenchNoticeResponse2.filterConfig, workBenchNoticeResponse2.settings);
            }
            C624110Odt.LIZIZ = C624100Ods.LIZ(c624100OdsLIZ, workBenchNoticeResponseCopy, false, 3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WorkBenchDataManager@2241.markCacheDataRead$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C624000Odi(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
