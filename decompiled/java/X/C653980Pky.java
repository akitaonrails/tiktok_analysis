package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Pky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C653980Pky extends AbstractC653990Pkz {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        EnterRoomConfig enterRoomConfig;
        long jLongValue;
        InterfaceC654000Pl0 interfaceC654000Pl0 = (InterfaceC654000Pl0) xBaseParamModel;
        String containerID = null;
        try {
            Map<String, Object> logExtra = interfaceC654000Pl0.getLogExtra();
            if (logExtra != null) {
                JSONObject jSONObject = new JSONObject(logExtra);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    linkedHashMap.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
                }
                C651970Phj.LLILLL.getClass();
                C651980Phk.LJFF(linkedHashMap, false);
                enterRoomConfig = new EnterRoomConfig();
                enterRoomConfig.mLogData.search_id = jSONObject.optString("search_id");
                enterRoomConfig.mLogData.search_keyword = jSONObject.optString("search_keyword");
                enterRoomConfig.mLogData.search_type = jSONObject.optString("search_type");
                enterRoomConfig.mLogData.requestId = jSONObject.optString("search_id");
                enterRoomConfig.mRoomsData.userId = jSONObject.optString("anchor_id");
                enterRoomConfig.mRoomsData.enterMethod = jSONObject.optString("enter_method");
                enterRoomConfig.mRoomsData.enterFromMerge = jSONObject.optString("enter_from");
            } else {
                enterRoomConfig = null;
            }
            Number startCursor = interfaceC654000Pl0.getStartCursor();
            if (startCursor != null) {
                jLongValue = startCursor.longValue();
            } else {
                jLongValue = 0;
            }
            boolean zLJFF = Intrinsics.LJFF(interfaceC654000Pl0.getHasMore(), 1);
            LiveRoomStruct liveRoomStruct = (LiveRoomStruct) C09C2.LIZ().LJII(interfaceC654000Pl0.getCurRawData(), LiveRoomStruct.class);
            List<String> rawDataList = interfaceC654000Pl0.getRawDataList();
            ArrayList arrayList = new ArrayList();
            if (rawDataList != null) {
                Iterator<String> it2 = rawDataList.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C09C2.LIZ().LJII(it2.next(), LiveRoomStruct.class));
                }
            }
            C1440005kM.LIZ(new C0PZ7(liveRoomStruct, arrayList, jLongValue, enterRoomConfig, Boolean.valueOf(zLJFF)));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message != null) {
                C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
            }
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC654010Pl1.class, containerID), "");
    }
}
