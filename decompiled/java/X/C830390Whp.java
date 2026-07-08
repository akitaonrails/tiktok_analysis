package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.pns.scopedid.GetScopedUserIdRequest;
import com.bytedance.pns.scopedid.GetScopedUserIdResponse;
import com.bytedance.pns.scopedid.IdPair;
import com.bytedance.pns.scopedid.IdPairList;
import com.bytedance.pns.scopedid.ScopedUserIdModel;
import com.bytedance.pns.scopedid.ScopedUserIdService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Whp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C830390Whp {
    public static final C830390Whp LIZ = new C830390Whp();
    public static final C830490Whz<String, String> LIZIZ = new C830490Whz<>();
    public static final Keva LIZJ;
    public static final IRetrofitFactory LIZLLL;

    static {
        Keva repo = Keva.getRepo("pns_scoped_user_id");
        LIZJ = repo;
        LIZLLL = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        Iterator<T> it2 = repo.getAll().entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                LIZIZ.put((String) key, (String) value);
            }
        }
    }

    public static void LIZIZ() {
        final String currentUserID;
        C830420Whs.LIZ.getClass();
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ScopedUserIdModel scopedUserIdModel = C830420Whs.LIZIZ;
        ScopedUserIdModel scopedUserIdModel2 = (ScopedUserIdModel) settingsManagerLIZLLL.LJIIIIZZ("pns_scoped_user_id_settings", ScopedUserIdModel.class, scopedUserIdModel);
        if (scopedUserIdModel2 != null) {
            scopedUserIdModel = scopedUserIdModel2;
        }
        C793770VBv.LJII("scoped_id_monitor", new JSONObject().put("scoped_userid_sampled", String.valueOf(scopedUserIdModel.enabled)), null, null);
        if (!scopedUserIdModel.enabled || scopedUserIdModel.scopedBizIds.isEmpty()) {
            return;
        }
        List<String> list = scopedUserIdModel.scopedBizIds;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null || (currentUserID = iUserService.getCurrentUserID()) == null || currentUserID.length() == 0 || Intrinsics.LJFF(currentUserID, CardStruct.IStatusCode.DEFAULT)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            LIZ.getClass();
            String strLIZ = LIZ(str);
            if (strLIZ != null) {
                C830490Whz<String, String> c830490Whz = LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('_');
                sbLIZ.append(currentUserID);
                c830490Whz.put(C2188811AlT.LIZIZ(sbLIZ), strLIZ);
            } else {
                arrayList.add(str);
            }
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        if (strArr.length != 0) {
            ((ScopedUserIdService) LIZLLL.LIZ("https://api.tiktokv.com").create(ScopedUserIdService.class)).getScopedUserId(new GetScopedUserIdRequest(strArr)).enqueue(new InterfaceC594300NSq<GetScopedUserIdResponse>() { // from class: X.0Whq
                @Override // X.InterfaceC594300NSq
                public final void onFailure(C0X9S<GetScopedUserIdResponse> c0x9s, Throwable th) {
                }

                @Override // X.InterfaceC594300NSq
                public final void onResponse(C0X9S<GetScopedUserIdResponse> c0x9s, C0X52<GetScopedUserIdResponse> c0x52) {
                    C830410Whr.LIZ();
                    GetScopedUserIdResponse getScopedUserIdResponse = c0x52.LIZIZ;
                    if (getScopedUserIdResponse != null && getScopedUserIdResponse.code == 0 && Intrinsics.LJFF(getScopedUserIdResponse.msg, "success")) {
                        IdPairList idPairList = getScopedUserIdResponse.data;
                        if (idPairList == null) {
                            C830390Whp.LIZ.getClass();
                            C793770VBv.LJII("scoped_id_monitor", new JSONObject().put("error_code", "dataIsNull"), null, null);
                            return;
                        }
                        if (idPairList.list == null) {
                            C830390Whp.LIZ.getClass();
                            C793770VBv.LJII("scoped_id_monitor", new JSONObject().put("error_code", "idListIsNull"), null, null);
                            return;
                        }
                        if (!u.LJIIZILJ(currentUserID, idPairList.userIdSuffix, false)) {
                            C830390Whp.LIZ.getClass();
                            C793770VBv.LJII("scoped_id_monitor", new JSONObject().put("error_code", "userIdNotMatch"), null, null);
                            return;
                        }
                        List<IdPair> list2 = getScopedUserIdResponse.data.list;
                        String str2 = currentUserID;
                        for (IdPair idPair : list2) {
                            if (idPair.bizId.length() > 0 && idPair.bizUserId.length() > 0) {
                                C830390Whp c830390Whp = C830390Whp.LIZ;
                                String str3 = idPair.bizId;
                                String str4 = idPair.bizUserId;
                                c830390Whp.getClass();
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(str3);
                                sbLIZ2.append('_');
                                sbLIZ2.append(str2);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                C830410Whr.LIZ();
                                C830390Whp.LIZIZ.put(strLIZIZ, str4);
                                C830390Whp.LIZJ.storeString(strLIZIZ, str4);
                            } else {
                                C830390Whp.LIZ.getClass();
                                C793770VBv.LJII("scoped_id_monitor", new JSONObject().put("error_code", "bizIdOrBizUserIdIsEmpty"), null, null);
                            }
                        }
                    }
                }
            });
        }
    }

    public static String LIZ(String str) {
        String currentUserID;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null || (currentUserID = iUserService.getCurrentUserID()) == null) {
            return null;
        }
        C830490Whz<String, String> c830490Whz = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(currentUserID);
        String str2 = c830490Whz.get(C2188811AlT.LIZIZ(sbLIZ));
        if (str2 == null) {
            return null;
        }
        return str2;
    }
}
