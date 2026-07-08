package X;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.12LV, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12LV extends C09AY implements Function1<SidecarDisplayFeature, Boolean> {
    public C12LV() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        SidecarDisplayFeature sidecarDisplayFeature2 = sidecarDisplayFeature;
        boolean z = true;
        if (sidecarDisplayFeature2.getType() == 1 && sidecarDisplayFeature2.getRect().width() != 0 && sidecarDisplayFeature2.getRect().height() != 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
