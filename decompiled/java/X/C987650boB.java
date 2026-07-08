package X;

import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0boB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C987650boB extends C09AY implements Function0<IAdSceneService> {
    public C987650boB() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IAdSceneService invoke() {
        return ServiceManager.get().getService(IAdSceneService.class);
    }
}
