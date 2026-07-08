package X;

import com.bytedance.android.starship.engine.service.StarshipEngineService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14fF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20320714fF extends C09AY implements Function0<StarshipEngineService> {
    public C20320714fF() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.starship.engine.service.StarshipEngineService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final StarshipEngineService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(StarshipEngineService.class, false, false, false, 14, null);
    }
}
