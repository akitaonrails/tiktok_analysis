package X;

import com.bytedance.ies.ugc.aweme.smartanchor_declaration.RouterAnchorPoint;
import com.bytedance.router.IRouterInjectInitializer;
import com.ss.android.ugc.aweme.legoImp.task.PowerPageTask;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10iV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19321710iV extends C09AY implements Function0<C19274210aq> {
    public C19321710iV() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.10aq] */
    @Override // kotlin.jvm.functions.Function0
    public final C19274210aq invoke() {
        return new IRouterInjectInitializer() { // from class: X.10aq
            @Override // com.bytedance.router.IRouterInjectInitializer
            public final void injectInitialize() {
                RouterAnchorPoint.getPoint().run(new Object());
                C1074030e3V.LIZ.LIZIZ();
                PowerPageTask.LL.LIZ();
            }
        };
    }
}
