package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveIconOutService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sFX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1619650sFX extends C09AY implements Function0<ILiveIconOutService> {
    public C1619650sFX() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.live.ILiveIconOutService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ILiveIconOutService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(ILiveIconOutService.class, false, false, false, 14, null);
    }
}
