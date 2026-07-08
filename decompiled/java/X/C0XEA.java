package X;

import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XEA, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XEA extends C09AY implements Function0<List<? extends FeatureItem>> {
    public C0XEA() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends FeatureItem> invoke() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FeatureItem("f_global_app_language", null, "app_language", null, -1, null, new ArrayList()));
        arrayList.add(new FeatureItem("f_global_region", null, "region", null, -1, null, new ArrayList()));
        arrayList.add(new FeatureItem("f_global_sys_region", null, "sys_region", null, -1, null, new ArrayList()));
        arrayList.add(new FeatureItem("f_global_carrier_region", null, "carrier_region", null, -1, null, new ArrayList()));
        arrayList.add(new FeatureItem("f_global_timezone_display", null, "timezone_name", null, -1, null, new ArrayList()));
        arrayList.add(new FeatureItem("f_global_timezone_offset", null, "timezone_offset", null, -1, null, new ArrayList()));
        if (((Boolean) C260940AKm.LIZ.getValue()).booleanValue()) {
            arrayList.add(new FeatureItem("f_global_language", null, "language", null, -1, null, new ArrayList()));
        }
        return arrayList;
    }
}
