package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.texttoimage.track.IText2ImageMobTrackExtension;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15wx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20685315wx extends C09AY implements Function0<Set<IText2ImageMobTrackExtension>> {
    public C20685315wx() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<IText2ImageMobTrackExtension> invoke() {
        return ServiceManager.get().getServices(IText2ImageMobTrackExtension.class);
    }
}
