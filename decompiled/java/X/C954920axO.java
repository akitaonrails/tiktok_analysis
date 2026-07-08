package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.BizContentWrapper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ExtraDataWrapper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutDSLConfig;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.model.message.linkcore.DSLConfig;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.model.message.linkcore.LinkPosition;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0axO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954920axO {
    public static final /* synthetic */ int LIZ = 0;

    public static C920820a4O LIZIZ(OnLineMicInfo onLineMicInfo) {
        long j;
        if (onLineMicInfo != null) {
            MicPositionInfo micPositionInfo = onLineMicInfo.micPositionData;
            if (micPositionInfo != null) {
                j = micPositionInfo.position;
            } else {
                j = -1;
            }
            return new C920820a4O(new C788130Uvr(j));
        }
        return null;
    }

    public static OnLineMicInfo LIZJ(MicPositionData micPositionData) {
        int i;
        int i2;
        int i3;
        long jLongValue = 0;
        Long l = 0L;
        if (micPositionData != null) {
            LinkPosition linkPosition = micPositionData.linkPosition;
            if (linkPosition != null) {
                i = linkPosition.positionType;
                i2 = linkPosition.position;
                i3 = linkPosition.position;
            } else {
                i = 0;
                i2 = -1;
                i3 = -1;
            }
            if (l != null) {
                jLongValue = l.longValue();
            }
            return new OnLineMicInfo(micPositionData.type, new MicPositionInfo(i, i2, i3, jLongValue, 0, null));
        }
        return null;
    }

    public static LayoutDSLConfig LIZLLL(DSLConfig dSLConfig) {
        String str;
        int i;
        LayoutDSLConfig.Builder builder = new LayoutDSLConfig.Builder();
        if (dSLConfig == null || (str = dSLConfig.layoutId) == null) {
            str = "";
        }
        builder.setLayoutId(str);
        if (dSLConfig != null) {
            i = dSLConfig.sceneVersion;
        } else {
            i = -1;
        }
        builder.setSceneVersion(i);
        return builder.build();
    }

    public static boolean LIZ(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(list, i);
            Object obj2 = ListProtector.get(list2, i);
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public static CustomLinkMessage LJ(LinkLayerMessage linkLayerMessage, ExtraDataWrapper extraDataWrapper) {
        return new CustomLinkMessage(linkLayerMessage.scene, new BizContentWrapper(linkLayerMessage.bizContent, null), extraDataWrapper);
    }
}
