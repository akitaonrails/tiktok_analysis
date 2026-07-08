package com.bytedance.android.live.base.model.user;

import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _ProjectionConfig_ProtoEncoder implements InterfaceC1132110fZB<ProjectionConfig> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, ProjectionConfig projectionConfig) {
        ProjectionConfig projectionConfig2 = projectionConfig;
        boolean z = projectionConfig2.useProjection;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJ(z ? 1 : 0);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 2, projectionConfig2.icon);
    }
}
