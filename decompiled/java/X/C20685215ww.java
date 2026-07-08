package X;

import com.ss.android.ugc.aweme.explore.track.IExploreMobTrackExtension;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15ww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20685215ww extends C09AY implements Function0<Set<IExploreMobTrackExtension>> {
    public C20685215ww() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<IExploreMobTrackExtension> invoke() {
        return ServiceManager.get().getServices(IExploreMobTrackExtension.class);
    }
}
