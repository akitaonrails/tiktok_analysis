package X;

import java.util.Map;
import tikcast.api.epiphron.UploadFeatureRequest;

/* JADX INFO: renamed from: X.0eQU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1088280eQU extends AbstractC1088350eQb<Long> implements InterfaceC1088470eQn<Long> {
    @Override // X.AbstractC1088350eQb, X.AbstractC1089300eS8
    public final void release() {
    }

    public C1088280eQU() {
        super(new AbstractC1084540eKS<Long>() { // from class: X.0eKV
        });
    }

    @Override // X.InterfaceC1088470eQn
    public final Long LIZ() {
        return Long.valueOf(System.currentTimeMillis());
    }

    @Override // X.AbstractC1089300eS8
    public final Object LIZLLL() {
        return Long.valueOf(System.currentTimeMillis());
    }

    @Override // X.AbstractC1088350eQb, X.AbstractC1089300eS8
    public final void LJ() {
        LJFF(Long.valueOf(System.currentTimeMillis()));
    }

    @Override // X.AbstractC1088350eQb
    public final Map<String, String> LJI(UploadFeatureRequest uploadFeatureRequest) {
        return uploadFeatureRequest.baseInfo;
    }
}
