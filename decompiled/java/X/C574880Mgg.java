package X;

import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.runtime.VEEditorResManager;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS20S0401000_8;
import v7.o;

/* JADX INFO: renamed from: X.0Mgg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C574880Mgg extends AbstractC364180EPo {
    public final InterfaceC1452170ntP LJ;
    public final MultiEditVideoRecordData LJFF;
    public final EditPreviewInfo LJI;
    public final LiveData<C364270EPx> LJII;
    public VEEditorResManager LJIIIIZZ;
    public final C348100Dkm LJIIIZ;
    public float LJIIJ;
    public final C364190EPp LJIIJJI;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float LJII() {
        /*
            r6 = this;
            X.0Dkm r0 = r6.LJIIIZ
            com.bytedance.ies.nle.editor_jni.NLEEditor r0 = r0.LIZ
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = r0.getModel()
            com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr r0 = r0.getTracks()
            r5 = 0
            if (r0 == 0) goto L49
            java.util.Iterator r4 = r0.iterator()
        L13:
            boolean r0 = r4.hasNext()
            r3 = 1
            if (r0 == 0) goto L47
            java.lang.Object r2 = r4.next()
            r1 = r2
            com.bytedance.ies.nle.editor_jni.NLETrack r1 = (com.bytedance.ies.nle.editor_jni.NLETrack) r1
            boolean r0 = r1.getMainTrack()
            if (r0 == 0) goto L13
            java.lang.String r1 = X.C348350DlB.LJIIIIZZ(r1)
            java.lang.String r0 = "VIDEO"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L13
        L33:
            com.bytedance.ies.nle.editor_jni.NLETrack r2 = (com.bytedance.ies.nle.editor_jni.NLETrack) r2
            if (r2 == 0) goto L49
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r0 = r2.getSlots()
            if (r0 == 0) goto L49
            int r0 = r0.size()
            if (r0 != r3) goto L49
        L43:
            r1 = 0
            if (r3 != 0) goto L4b
            return r1
        L47:
            r2 = 0
            goto L33
        L49:
            r3 = 0
            goto L43
        L4b:
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r0 = r6.LJI
            java.util.List r0 = r0.getVideoList()
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r5, r0)
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r0 = (com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r0
            if (r0 == 0) goto L64
            com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo r0 = r0.getVideoCutInfo()
            if (r0 == 0) goto L64
            int r0 = r0.getRotate()
            float r1 = (float) r0
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C574880Mgg.LJII():float");
    }

    @Override // X.InterfaceC364120EPi
    public final C15O7<Boolean> prepare() {
        String resourceFile;
        NLETrackSlot renderProxy;
        NLESegment mainSegment;
        NLEResourceNode resource;
        final o oVar = new o();
        if (LIZ()) {
            oVar.LJ(Boolean.TRUE);
        } else if (!this.LIZIZ) {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(this.LJ);
            final NLEEditor nLEEditor = c348100DkmLIZIZ != null ? c348100DkmLIZIZ.LIZ : null;
            VERecordData vERecordDataLIZJ = C574800MgY.LIZJ(this.LJFF);
            if (nLEEditor != null) {
                nLEEditor.removeConsumer(this.LJIIJJI);
            }
            VecNLETrackSlotSPtr slots = this.LJIIIZ.LIZ.getModel().getMainTrack().getSlots();
            int i = 0;
            if (!(slots instanceof Collection) || !slots.isEmpty()) {
                Iterator<NLETrackSlot> it2 = slots.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (C348520DlS.LJIIIIZZ(it2.next())) {
                        for (VERecordData.VERecordSegmentData vERecordSegmentData : vERecordDataLIZJ.getSegmentData()) {
                            int i2 = i + 1;
                            if (i < 0) {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                            VERecordData.VERecordSegmentData vERecordSegmentData2 = vERecordSegmentData;
                            NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(i, this.LJIIIZ.LIZ.getModel().getMainTrack().getSlots());
                            if (nLETrackSlot == null || (renderProxy = nLETrackSlot.getRenderProxy()) == null || (mainSegment = renderProxy.getMainSegment()) == null || (resource = mainSegment.getResource()) == null || (resourceFile = resource.getResourceFile()) == null) {
                                resourceFile = vERecordSegmentData2.mVideo;
                            }
                            vERecordSegmentData2.mVideo = resourceFile;
                            i = i2;
                        }
                    }
                }
            }
            VESize vESizeCalcTargetRes = VEUtils.calcTargetRes(this.LJI.getTotalVideoWidth(), this.LJI.getTotalVideoHeight(), C571630MbR.LIZ(this.LJI), this.LJI.getPreviewWidth());
            final VEEditorResManager vEEditorResManager = new VEEditorResManager(this.LJ.getWorkspace());
            this.LJIIIIZZ = vEEditorResManager;
            this.LIZIZ = true;
            VEEditor.LJIIZILJ(vEEditorResManager, vERecordDataLIZJ, vESizeCalcTargetRes.width, vESizeCalcTargetRes.height, new C1DOH() { // from class: X.0Mgh
                @Override // X.C1DOH
                public final void LIZ(double d) {
                    Function1<? super Double, Unit> function1 = this.LIZ.LIZLLL;
                    if (function1 != null) {
                        function1.invoke(Double.valueOf(d));
                    }
                }

                @Override // X.C1DOH
                public final void LIZIZ(int i3) {
                    C01TT.LIZLLL(new AwS20S0401000_8(this.LIZ, (C574880Mgg) vEEditorResManager, (VEEditorResManager) nLEEditor, (NLEEditor) i3, (int) oVar, (o<Boolean>) 0));
                }
            });
        }
        return oVar.LIZ;
    }

    @Override // X.AbstractC364180EPo, X.InterfaceC364120EPi
    public final boolean LIZ() {
        if (!super.LIZ()) {
            return false;
        }
        if (this.LJIIJ == LJII()) {
            return true;
        }
        this.LJIIIZ.LIZLLL().LJIILLIIL();
        return false;
    }

    @Override // X.AbstractC364180EPo
    public final InterfaceC1452170ntP LJ() {
        return this.LJ;
    }

    @Override // X.AbstractC364180EPo
    public final VEEditorResManager LJI() {
        return this.LJIIIIZZ;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0EPp] */
    public C574880Mgg(InterfaceC1452170ntP interfaceC1452170ntP, MultiEditVideoRecordData multiEditVideoRecordData, EditPreviewInfo editPreviewInfo, LiveData<C364270EPx> liveData) {
        super(interfaceC1452170ntP);
        this.LJ = interfaceC1452170ntP;
        this.LJFF = multiEditVideoRecordData;
        this.LJI = editPreviewInfo;
        this.LJII = liveData;
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
        if (c348100DkmLIZIZ != null) {
            this.LJIIIZ = c348100DkmLIZIZ;
            this.LJIIJJI = new C354000DuI() { // from class: X.0EPp
                @Override // X.C354000DuI
                public final void LIZ() {
                    C364270EPx value;
                    if (this.LIZ.LIZLLL() != null) {
                        VecNLETrackSlotSPtr slots = this.LIZ.LJIIIZ.LIZ.getModel().getMainTrack().getSlots();
                        if (!(slots instanceof Collection) || !slots.isEmpty()) {
                            Iterator<NLETrackSlot> it2 = slots.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if (C348520DlS.LJIIIIZZ(it2.next())) {
                                    LiveData<C364270EPx> liveData2 = this.LIZ.LJII;
                                    if (!C113I.LIZLLL((liveData2 == null || (value = liveData2.getValue()) == null) ? null : value.LIZIZ)) {
                                        this.LIZ.LIZIZ();
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    this.LIZ.LJIIIZ.LIZ.removeConsumer(this);
                }
            };
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
