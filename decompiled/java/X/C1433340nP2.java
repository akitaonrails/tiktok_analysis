package X;

import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nP2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1433340nP2 extends AbstractC1433570nPP {
    public final InterfaceC1433360nP4<CreateBaseAwemeResponse> LIZ;
    public final C1433350nP3 LIZIZ = new C1433350nP3("PublishScheduler-PublishCallbackWrapper");

    public C1433340nP2(InterfaceC1433360nP4<CreateBaseAwemeResponse> interfaceC1433360nP4) {
        this.LIZ = interfaceC1433360nP4;
    }

    @Override // X.AbstractC1433570nPP
    public final void onProgress(int i, Object obj) {
        C1434900nRY c1434900nRY;
        InterfaceC1433360nP4<CreateBaseAwemeResponse> interfaceC1433360nP4 = this.LIZ;
        if (obj instanceof C1434900nRY) {
            c1434900nRY = (C1434900nRY) obj;
        } else {
            c1434900nRY = null;
        }
        interfaceC1433360nP4.LJFF(i, c1434900nRY);
    }

    @Override // X.AbstractC1433570nPP
    public final void onFinish(AbstractC1433460nPE abstractC1433460nPE, Object obj, PublishModel publishModel) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishParallel PublishCallbackWrapper onFinish ");
        sbLIZ.append(this);
        C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (abstractC1433460nPE instanceof C492390JSr) {
            if (!(obj instanceof Boolean)) {
                this.LIZIZ.LIZ("onFinish extra not boolean");
                return;
            } else {
                this.LIZ.LIZJ(((C492390JSr) abstractC1433460nPE).LIZ, ((Boolean) obj).booleanValue(), publishModel);
                return;
            }
        }
        if (abstractC1433460nPE instanceof C1433450nPD) {
            C1433450nPD c1433450nPD = (C1433450nPD) abstractC1433460nPE;
            C1433270nOv c1433270nOv = c1433450nPD.LIZ;
            if (c1433270nOv.LIZLLL != null && (c1433270nOv.LJ instanceof Boolean)) {
                InterfaceC1433360nP4<CreateBaseAwemeResponse> interfaceC1433360nP4 = this.LIZ;
                C1433270nOv c1433270nOv2 = c1433450nPD.LIZ;
                C1434650nR9 c1434650nR9 = new C1434650nR9(c1433270nOv2.LIZLLL, c1433270nOv2.LIZJ, c1433270nOv2.LJFF, c1433270nOv2.LIZIZ);
                c1434650nR9.setRecover(((Boolean) c1433450nPD.LIZ.LJ).booleanValue());
                interfaceC1433360nP4.LIZIZ(c1434650nR9, publishModel);
                return;
            }
            this.LIZIZ.LIZ("onFinish  null error / extra not boolean");
            return;
        }
        if (abstractC1433460nPE instanceof C1433410nP9) {
            C1430810nKx c1430810nKx = ((C1433410nP9) abstractC1433460nPE).LIZ;
            if (c1430810nKx != null) {
                this.LIZ.LIZIZ(c1430810nKx, publishModel);
                return;
            } else {
                this.LIZIZ.LIZ("onFinish  null error / extra not boolean");
                return;
            }
        }
        if (abstractC1433460nPE instanceof C1433430nPB) {
            InterfaceC1433360nP4<CreateBaseAwemeResponse> interfaceC1433360nP42 = this.LIZ;
            C1434650nR9 c1434650nR92 = new C1434650nR9(((C1433430nPB) abstractC1433460nPE).LIZ.LIZJ);
            c1434650nR92.setRecover(true);
            interfaceC1433360nP42.LIZIZ(c1434650nR92, publishModel);
            return;
        }
        if (abstractC1433460nPE instanceof C1433440nPC) {
            this.LIZ.LIZIZ(((C1433440nPC) abstractC1433460nPE).LIZ, publishModel);
        } else if (abstractC1433460nPE instanceof C1433600nPS) {
            this.LIZ.LJ();
        }
    }

    @Override // X.AbstractC1433570nPP
    public final void onStageUpdate(String str, AbstractC1433380nP6 abstractC1433380nP6, Object obj) {
        if (Intrinsics.LJFF(str, "STAGE_SYNTHETIC") && (abstractC1433380nP6 instanceof C1433370nP5)) {
            AbstractC1433400nP8 abstractC1433400nP8 = ((C1433370nP5) abstractC1433380nP6).LIZ;
            if ((abstractC1433400nP8 instanceof C1433390nP7) && (((C1433390nP7) abstractC1433400nP8).LIZ instanceof String)) {
                this.LIZ.LIZLLL((String) ((C1433390nP7) abstractC1433400nP8).LIZ);
            }
        }
    }
}
