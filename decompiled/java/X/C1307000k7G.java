package X;

import com.bytedance.android.starship.engine.strategy.IStarShipStrategy;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0k7G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1307000k7G extends C09AY implements Function0<IStarShipStrategy> {
    public C1307000k7G() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.starship.engine.strategy.IStarShipStrategy, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IStarShipStrategy invoke() {
        return PluggableExtentionKt.pluggableSpi$default(IStarShipStrategy.class, false, false, false, 14, null);
    }
}
