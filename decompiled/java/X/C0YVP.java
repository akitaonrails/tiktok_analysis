package X;

import com.bytedance.im.core.proto.im_biz_ext.BizConvCorePersistentExt;
import com.bytedance.im.core.proto.im_biz_ext.BizConvSettingPersistentExt;
import com.bytedance.im.core.proto.im_biz_ext.ExtField;
import com.bytedance.im.core.proto.im_biz_ext.SettingExtField;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YVP, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YVP {
    public static Map LIZ(Map map, ByteString byteString) {
        C0YVQ c0yvq;
        Object objLIZ;
        if (byteString.size() != 0 && !map.isEmpty()) {
            try {
                BizConvCorePersistentExt bizConvCorePersistentExtDecode = BizConvCorePersistentExt.ADAPTER.decode(byteString);
                HashMap map2 = new HashMap();
                for (ExtField extField : bizConvCorePersistentExtDecode.fields) {
                    Integer num = extField.field_id;
                    if (num != null && extField.conv_ext != null && (c0yvq = (C0YVQ) map.get(num)) != null && (objLIZ = c0yvq.LIZ(extField.conv_ext)) != null) {
                        map2.put(extField.field_id, objLIZ);
                    }
                }
                if (map2.isEmpty()) {
                    return null;
                }
                return map2;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public static Map LIZIZ(Map map, ByteString byteString) {
        C0YVQ c0yvq;
        Object objLIZ;
        if (byteString.size() != 0 && !map.isEmpty()) {
            try {
                BizConvSettingPersistentExt bizConvSettingPersistentExtDecode = BizConvSettingPersistentExt.ADAPTER.decode(byteString);
                HashMap map2 = new HashMap();
                for (SettingExtField settingExtField : bizConvSettingPersistentExtDecode.fields) {
                    Integer num = settingExtField.field_id;
                    if (num != null && settingExtField.conv_ext != null && (c0yvq = (C0YVQ) map.get(num)) != null && (objLIZ = c0yvq.LIZ(settingExtField.conv_ext)) != null) {
                        map2.put(settingExtField.field_id, objLIZ);
                    }
                }
                if (map2.isEmpty()) {
                    return null;
                }
                return map2;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }
}
