package X;

import com.ss.android.ugc.aweme.ad.feed.midad.IPostRollAdService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MxM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C585220MxM extends C09AY implements Function0<Boolean> {
    public C585220MxM() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((IPostRollAdService) ServiceManager.get().getService(IPostRollAdService.class)).LIZLLL());
    }
}
