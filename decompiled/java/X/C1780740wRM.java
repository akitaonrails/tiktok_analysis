package X;

import com.ss.android.ugc.aweme.tako.camera.record.TakoRecordCoreViewModel;
import java.util.List;

/* JADX INFO: renamed from: X.0wRM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1780740wRM implements InterfaceC1780750wRN {
    public final /* synthetic */ TakoRecordCoreViewModel LIZ;

    @Override // X.InterfaceC1780750wRN
    public final void LIZLLL(float f, int i, boolean z) {
    }

    @Override // X.InterfaceC1780750wRN
    public final void LJII() {
    }

    public C1780740wRM(TakoRecordCoreViewModel takoRecordCoreViewModel) {
        this.LIZ = takoRecordCoreViewModel;
    }

    @Override // X.InterfaceC1780750wRN
    public final void LIZJ(int i, boolean z, boolean z2, float f, List<Integer> list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onZoomSupport: cameraType: ");
        sbLIZ.append(i);
        sbLIZ.append(" supportZoom: ");
        sbLIZ.append(z);
        sbLIZ.append(" supportSmooth:");
        sbLIZ.append(z2);
        sbLIZ.append(" maxZoom:");
        sbLIZ.append(f);
        sbLIZ.append(" ratios:");
        sbLIZ.append(list);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LIZ.LLILLL = f;
    }
}
