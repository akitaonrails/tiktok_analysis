package X;

import com.bytedance.android.starship.IStarshipBridgeService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ECn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2277511ECn extends C09AY implements Function0<IStarshipBridgeService> {
    public C2277511ECn() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.starship.IStarshipBridgeService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IStarshipBridgeService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(IStarshipBridgeService.class, false, false, false, 14, null);
    }
}
