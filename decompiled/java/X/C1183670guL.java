package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0guL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183670guL {
    public static final C1180920gpu LIZ(C1180620gpQ c1180620gpQ) {
        List<C1180920gpu> listLJIILIIL = c1180620gpQ.LJIILIIL();
        C1180920gpu c1180920gpu = null;
        if (listLJIILIIL == null) {
            return null;
        }
        Iterator<C1180920gpu> it2 = listLJIILIIL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C1180920gpu next = it2.next();
            if (Intrinsics.LJFF(next.LIZIZ.LIZ, "poi_head_info")) {
                c1180920gpu = next;
                break;
            }
        }
        return c1180920gpu;
    }

    public static final PoiListApi.PoiDetailResponse LIZIZ(C1180620gpQ c1180620gpQ) {
        BaseComponentData baseComponentData;
        C1180920gpu c1180920gpuLIZ = LIZ(c1180620gpQ);
        if (c1180920gpuLIZ != null) {
            baseComponentData = c1180920gpuLIZ.LIZLLL;
        } else {
            baseComponentData = null;
        }
        if (!(baseComponentData instanceof PoiListApi.PoiDetailResponse)) {
            return null;
        }
        return (PoiListApi.PoiDetailResponse) baseComponentData;
    }
}
