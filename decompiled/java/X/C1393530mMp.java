package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mMp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1393530mMp extends C09AY implements Function0<IPoiService> {
    public C1393530mMp() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.poi_api.service.IPoiService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IPoiService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
    }
}
