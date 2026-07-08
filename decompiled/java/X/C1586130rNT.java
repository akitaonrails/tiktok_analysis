package X;

import com.bytedance.tiktok.homepage.mainfragment.inflate.HomepageIconServiceApi;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rNT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1586130rNT extends C09AY implements Function0<HomepageIconServiceApi> {
    public C1586130rNT() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.tiktok.homepage.mainfragment.inflate.HomepageIconServiceApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final HomepageIconServiceApi invoke() {
        return PluggableExtentionKt.pluggableSpi$default(HomepageIconServiceApi.class, false, false, false, 14, null);
    }
}
