package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bJo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C968820bJo {
    public static boolean LIZ(Map map, Map map2) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        Integer numValueOf5;
        Integer numValueOf6;
        Integer numValueOf7;
        MicPositionInfo micPositionInfo;
        MicPositionInfo micPositionInfo2;
        MicPositionInfo micPositionInfo3;
        MicPositionInfo micPositionInfo4;
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            OnLineMicInfo onLineMicInfo = (OnLineMicInfo) map2.get(key);
            if (onLineMicInfo == null || ((OnLineMicInfo) entry.getValue()).onLinePattern != onLineMicInfo.onLinePattern) {
                return false;
            }
            MicPositionInfo micPositionInfo5 = ((OnLineMicInfo) entry.getValue()).micPositionData;
            Integer numValueOf8 = null;
            if (micPositionInfo5 != null) {
                numValueOf = Integer.valueOf(micPositionInfo5.strategy);
            } else {
                numValueOf = null;
            }
            OnLineMicInfo onLineMicInfo2 = (OnLineMicInfo) map2.get(key);
            if (onLineMicInfo2 != null && (micPositionInfo4 = onLineMicInfo2.micPositionData) != null) {
                numValueOf2 = Integer.valueOf(micPositionInfo4.strategy);
            } else {
                numValueOf2 = null;
            }
            if (!Intrinsics.LJFF(numValueOf, numValueOf2)) {
                return false;
            }
            MicPositionInfo micPositionInfo6 = ((OnLineMicInfo) entry.getValue()).micPositionData;
            if (micPositionInfo6 != null) {
                numValueOf3 = Integer.valueOf(micPositionInfo6.position);
            } else {
                numValueOf3 = null;
            }
            OnLineMicInfo onLineMicInfo3 = (OnLineMicInfo) map2.get(key);
            if (onLineMicInfo3 != null && (micPositionInfo3 = onLineMicInfo3.micPositionData) != null) {
                numValueOf4 = Integer.valueOf(micPositionInfo3.position);
            } else {
                numValueOf4 = null;
            }
            if (!Intrinsics.LJFF(numValueOf3, numValueOf4)) {
                return false;
            }
            MicPositionInfo micPositionInfo7 = ((OnLineMicInfo) entry.getValue()).micPositionData;
            if (micPositionInfo7 != null) {
                numValueOf5 = Integer.valueOf(micPositionInfo7.uiPos);
            } else {
                numValueOf5 = null;
            }
            OnLineMicInfo onLineMicInfo4 = (OnLineMicInfo) map2.get(key);
            if (onLineMicInfo4 != null && (micPositionInfo2 = onLineMicInfo4.micPositionData) != null) {
                numValueOf6 = Integer.valueOf(micPositionInfo2.uiPos);
            } else {
                numValueOf6 = null;
            }
            if (!Intrinsics.LJFF(numValueOf5, numValueOf6)) {
                return false;
            }
            MicPositionInfo micPositionInfo8 = ((OnLineMicInfo) entry.getValue()).micPositionData;
            if (micPositionInfo8 != null) {
                numValueOf7 = Integer.valueOf(micPositionInfo8.contentType);
            } else {
                numValueOf7 = null;
            }
            OnLineMicInfo onLineMicInfo5 = (OnLineMicInfo) map2.get(key);
            if (onLineMicInfo5 != null && (micPositionInfo = onLineMicInfo5.micPositionData) != null) {
                numValueOf8 = Integer.valueOf(micPositionInfo.contentType);
            }
            if (!Intrinsics.LJFF(numValueOf7, numValueOf8)) {
                return false;
            }
        }
        return true;
    }
}
