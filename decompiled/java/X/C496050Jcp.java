package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.profile.dao.LiveProfilePreloadViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS586S0100000_7;
import webcast.api.room.BusinessDataFilter;
import webcast.api.room.GetRoomProfileCardResponse;
import webcast.api.room.PreloadRoomData;

/* JADX INFO: renamed from: X.0Jcp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C496050Jcp extends AbstractC496140Jcy<C496180Jd2> {
    @Override // X.AbstractC496140Jcy
    public final boolean LIZJ() {
        C495930Jcd c495930JcdLIZJ;
        BaseResponse<GetRoomProfileCardResponse.ResponseData, Extra> baseResponse;
        GetRoomProfileCardResponse.ResponseData responseData;
        User user;
        User user2;
        FollowInfo followInfo;
        GetRoomProfileCardResponse.ResponseData responseData2;
        User user3;
        FollowInfo followInfo2;
        GetRoomProfileCardResponse.ResponseData responseData3;
        User user4;
        User user5;
        FollowInfo followInfo3;
        GetRoomProfileCardResponse.ResponseData responseData4;
        User user6;
        FollowInfo followInfo4;
        LiveProfilePreloadViewModel liveProfilePreloadViewModel = this.LIZJ;
        if (liveProfilePreloadViewModel == null) {
            return false;
        }
        C495920Jcc c495920Jcc = this.LIZ;
        long j = c495920Jcc.LJII;
        C495950Jcf c495950Jcf = c495920Jcc.LIZJ;
        if (c495950Jcf.LJII) {
            C495930Jcd c495930Jcd = liveProfilePreloadViewModel.LL;
            if (c495930Jcd == null || (baseResponse = c495930Jcd.LIZ) == null || (responseData3 = baseResponse.data) == null || (user4 = responseData3.user) == null || user4.getId() != j) {
                return false;
            }
            if (c495930Jcd.LIZIZ != null && (responseData4 = baseResponse.data) != null && (user6 = responseData4.user) != null && (followInfo4 = user6.getFollowInfo()) != null) {
                followInfo4.setFollowStatus(r1.followStatus);
            }
            Integer num = c495930Jcd.LIZJ;
            if (num != null) {
                int iIntValue = num.intValue();
                GetRoomProfileCardResponse.ResponseData responseData5 = baseResponse.data;
                if (responseData5 != null && (user5 = responseData5.user) != null && (followInfo3 = user5.getFollowInfo()) != null) {
                    followInfo3.setPushStatus(iIntValue);
                }
            }
        } else {
            if (!c495950Jcf.LJIIIIZZ || (c495930JcdLIZJ = liveProfilePreloadViewModel.LLILLJJLI.LIZJ(Long.valueOf(j))) == null || (baseResponse = c495930JcdLIZJ.LIZ) == null || (responseData = baseResponse.data) == null || (user = responseData.user) == null || user.getId() != j) {
                return false;
            }
            if (c495930JcdLIZJ.LIZIZ != null && (responseData2 = baseResponse.data) != null && (user3 = responseData2.user) != null && (followInfo2 = user3.getFollowInfo()) != null) {
                followInfo2.setFollowStatus(r1.followStatus);
            }
            Integer num2 = c495930JcdLIZJ.LIZJ;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                GetRoomProfileCardResponse.ResponseData responseData6 = baseResponse.data;
                if (responseData6 != null && (user2 = responseData6.user) != null && (followInfo = user2.getFollowInfo()) != null) {
                    followInfo.setPushStatus(iIntValue2);
                }
            }
        }
        this.LIZLLL.setValue(new C496270JdB<>(0, LJFF(baseResponse, this.LIZIZ), null));
        LiveProfilePreloadViewModel liveProfilePreloadViewModel2 = this.LIZJ;
        C495920Jcc c495920Jcc2 = this.LIZ;
        long j2 = c495920Jcc2.LJII;
        User user7 = c495920Jcc2.LJI;
        Room room = c495920Jcc2.LJFF;
        C495950Jcf c495950Jcf2 = c495920Jcc2.LIZJ;
        boolean z = c495920Jcc2.LJ;
        AwS586S0100000_7 awS586S0100000_7 = new AwS586S0100000_7(this, 454);
        liveProfilePreloadViewModel2.getClass();
        if (!c495950Jcf2.LIZLLL && !c495950Jcf2.LJI && (c495950Jcf2.LJII || c495950Jcf2.LJIIIIZZ)) {
            AnonymousClass0956 anonymousClass0956 = liveProfilePreloadViewModel2.LLILLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            liveProfilePreloadViewModel2.LLILLL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(liveProfilePreloadViewModel2), null, null, new C496040Jco(c495950Jcf2, liveProfilePreloadViewModel2, awS586S0100000_7, j2, room, user7, z, null), 3);
        }
        return true;
    }

    public C496050Jcp(C495920Jcc c495920Jcc, List<? extends AbstractC495790JcP<?>> list) {
        super(c495920Jcc, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C496120Jcw LJ(BaseResponse baseResponse, Map map) {
        GetRoomProfileCardResponse.ResponseData responseData = (GetRoomProfileCardResponse.ResponseData) baseResponse.data;
        PreloadRoomData preloadRoomData = null;
        if (responseData == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("buildLiveProfileResponse, response error = ");
        sbLIZ.append(baseResponse.LJ);
        sbLIZ.append(" status = ");
        sbLIZ.append(baseResponse.statusCode);
        C20441214yg.LIZIZ("LiveProfileRepository", C2188811AlT.LIZIZ(sbLIZ));
        User user = responseData.user;
        if (user == null) {
            return null;
        }
        GetRoomProfileCardResponse.ResponseData responseData2 = (GetRoomProfileCardResponse.ResponseData) baseResponse.data;
        if (responseData2 != null) {
            preloadRoomData = responseData2.preloadRoomData;
        }
        return new C496120Jcw(user, preloadRoomData, map, baseResponse.LIZIZ, baseResponse.statusCode, responseData.componentLayoutConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C496120Jcw LJFF(BaseResponse baseResponse, List list) {
        GetRoomProfileCardResponse.ResponseData responseData = (GetRoomProfileCardResponse.ResponseData) baseResponse.data;
        PreloadRoomData preloadRoomData = null;
        if (responseData == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("buildLiveProfileResponseForPreload, response error = ");
        sbLIZ.append(baseResponse.LJ);
        sbLIZ.append(" status = ");
        sbLIZ.append(baseResponse.statusCode);
        C20441214yg.LIZIZ("LiveProfileRepository", C2188811AlT.LIZIZ(sbLIZ));
        User user = responseData.user;
        if (user == null) {
            return null;
        }
        GetRoomProfileCardResponse.ResponseData responseData2 = (GetRoomProfileCardResponse.ResponseData) baseResponse.data;
        if (responseData2 != null) {
            preloadRoomData = responseData2.preloadRoomData;
        }
        PreloadRoomData preloadRoomData2 = preloadRoomData;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Object obj : list) {
            linkedHashMap.put(obj, ((AbstractC495790JcP) obj).LJIILIIL(responseData));
        }
        return new C496120Jcw(user, preloadRoomData2, linkedHashMap, baseResponse.LIZIZ, baseResponse.statusCode, responseData.componentLayoutConfig);
    }

    @Override // X.AbstractC496140Jcy
    public final Object LIZ(LifecycleCoroutineScope lifecycleCoroutineScope, boolean z) {
        BusinessDataFilter businessDataFilter = new BusinessDataFilter();
        businessDataFilter.needUser = true;
        List<AbstractC495790JcP<?>> list = this.LIZIZ;
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC495790JcP<?>> it2 = list.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().LJI().getSecond(), arrayList);
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((EnumC496240Jd8) it3.next()).filter(businessDataFilter);
        }
        C099G c099gLIZIZ = C23250099c.LIZIZ(lifecycleCoroutineScope, C0PEM.LIZJ, null, new C496020Jcm(this, businessDataFilter, null), 2);
        List<AbstractC495790JcP<?>> list2 = this.LIZIZ;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (AbstractC495790JcP<?> abstractC495790JcP : list2) {
            linkedHashMap.put(abstractC495790JcP, C23250099c.LIZIZ(lifecycleCoroutineScope, C0PEM.LIZJ, null, new C0JG9(c099gLIZIZ, abstractC495790JcP, null), 2));
        }
        return new C496180Jd2(c099gLIZIZ, linkedHashMap);
    }

    @Override // X.AbstractC496140Jcy
    public final /* bridge */ /* synthetic */ Object LIZIZ(C496180Jd2 c496180Jd2, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean zLJI = MethodIDManager.LJI(137907);
        Object objLIZLLL = LIZLLL(c496180Jd2, interfaceC1364105Vn);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return objLIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2 A[Catch: all -> 0x0109, TRY_LEAVE, TryCatch #0 {all -> 0x0109, blocks: (B:21:0x0056, B:22:0x0059, B:24:0x008f, B:25:0x009f, B:27:0x00a5, B:29:0x00a9, B:31:0x00bb, B:33:0x00c4, B:34:0x00cb, B:35:0x00ce, B:37:0x00d2, B:39:0x00d8, B:41:0x00dc, B:44:0x00f2, B:16:0x003d), top: B:59:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C496180Jd2 r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C496050Jcp.LIZLLL(X.0Jd2, X.05Vn):java.lang.Object");
    }
}
