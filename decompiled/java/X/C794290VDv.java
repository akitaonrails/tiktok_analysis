package X;

import com.bytedance.memdump.data.HeaderBean;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0VDv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C794290VDv {
    public static HeaderBean LIZ(Map<String, String> map) {
        HeaderBean.Filters filters = new HeaderBean.Filters();
        HashMap map2 = (HashMap) map;
        filters.exception_type = (String) map2.get("exception_type");
        return new HeaderBean((String) map2.get("aid"), (String) map2.get("channel"), (String) map2.get("device_id"), (String) map2.get("app_version"), (String) map2.get("update_version_code"), (String) map2.get("current_update_version_code"), (String) map2.get("os_version"), (String) map2.get("os_api"), (String) map2.get("device_model"), (String) map2.get("device_brand"), (String) map2.get("device_manufacturer"), (String) map2.get("process_name"), (String) map2.get("version_name"), (String) map2.get("version_code"), (String) map2.get("region"), "Android", "android", String.valueOf(System.currentTimeMillis()), String.valueOf(System.currentTimeMillis()), (String) map2.get("release_build"), filters);
    }
}
