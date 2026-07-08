package X;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.12LX, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12LX extends C09AY implements Function1<SidecarDisplayFeature, Boolean> {
    public C12LX() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        boolean z;
        SidecarDisplayFeature sidecarDisplayFeature2 = sidecarDisplayFeature;
        if (sidecarDisplayFeature2.getRect().left != 0 && sidecarDisplayFeature2.getRect().top != 0) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
