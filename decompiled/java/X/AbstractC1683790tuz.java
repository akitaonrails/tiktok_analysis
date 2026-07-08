package X;

import android.graphics.RenderEffect;

/* JADX INFO: renamed from: X.0tuz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1683790tuz {
    public RenderEffect LIZ;

    public abstract RenderEffect LIZIZ();

    public final RenderEffect LIZ() {
        RenderEffect renderEffect = this.LIZ;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectLIZIZ = LIZIZ();
        this.LIZ = renderEffectLIZIZ;
        return renderEffectLIZIZ;
    }
}
