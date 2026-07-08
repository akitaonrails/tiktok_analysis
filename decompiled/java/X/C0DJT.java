package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0DJT, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DJT extends C09AY implements Function0<Boolean> {
    public C0DJT() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z = true;
        if (!C2213981Bky.LIZIZ.isDebug() && C0C64.LJIILLIIL().LJIJ(31744, 0, "android_image_download_priority", true) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
