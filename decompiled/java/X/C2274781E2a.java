package X;

import com.ss.android.ugc.aweme.image.experiment.TTIMImageRefreshConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1E2a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2274781E2a extends C09AY implements Function0<Boolean> {
    public C2274781E2a() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((TTIMImageRefreshConfig) C1E2X.LIZIZ.getValue()).enableStickerImageRefresh > 0);
    }
}
