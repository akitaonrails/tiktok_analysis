package X;

import android.view.View;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0f0p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110810f0p {
    public static final C1110810f0p LIZ = new C1110810f0p();
    public static final Map<DataChannel, Map<PublicAreaMessageCommon.OperationState, C246000xG>> LIZIZ = new LinkedHashMap();
    public static final Map<DataChannel, WeakReference<View>> LIZJ = new LinkedHashMap();

    public static void LIZ(DataChannel dataChannel, AbstractC1110800f0o abstractC1110800f0o, C0KAJ c0kaj) {
        C246000xG c246000xG;
        Object obj;
        PublicAreaMessageCommon.OperationInfo operationInfo;
        PublicAreaMessageCommon.OperationState operationState;
        PublicAreaMessageCommon.OperationInfo operationInfo2;
        C1102070emj c1102070emj = C1102070emj.LIZ;
        C1110870f0v c1110870f0v = C1110870f0v.LL;
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZIZ;
        Map map = (Map) linkedHashMap.get(dataChannel);
        PublicAreaMessageCommon.OperationState operationState2 = null;
        if (map != null) {
            PublicAreaMessageCommon publicAreaMessageCommonLLIIII = abstractC1110800f0o.LLIIII();
            if (publicAreaMessageCommonLLIIII != null && (operationInfo2 = publicAreaMessageCommonLLIIII.operationInfo) != null) {
                operationState = operationInfo2.initialState;
            } else {
                operationState = null;
            }
            c246000xG = (C246000xG) map.get(operationState);
        } else {
            c246000xG = null;
        }
        C1102070emj.LJIILJJIL(c1102070emj, dataChannel, c1110870f0v, c246000xG, c0kaj, null, null, 112);
        if (dataChannel != null && c0kaj != C0KAJ.MANUALLY_ROUTE && (obj = linkedHashMap.get(dataChannel)) != null) {
            PublicAreaMessageCommon publicAreaMessageCommonLLIIII2 = abstractC1110800f0o.LLIIII();
            if (publicAreaMessageCommonLLIIII2 != null && (operationInfo = publicAreaMessageCommonLLIIII2.operationInfo) != null) {
                operationState2 = operationInfo.initialState;
            }
            C19719512Dh.LIZJ(obj).remove(operationState2);
        }
    }
}
