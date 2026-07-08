package X;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.12LW, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12LW extends C09AY implements Function1<SidecarDisplayFeature, Boolean> {
    public C12LW() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        boolean z;
        SidecarDisplayFeature sidecarDisplayFeature2 = sidecarDisplayFeature;
        if (sidecarDisplayFeature2.getRect().width() == 0 && sidecarDisplayFeature2.getRect().height() == 0) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
