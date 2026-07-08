package X;

import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.runtime.VEEditorResManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS134S0201000_8;
import v7.o;

/* JADX INFO: renamed from: X.0Mge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C574860Mge extends AbstractC364180EPo {
    public final InterfaceC1452170ntP LJ;
    public final MultiEditVideoRecordData LJFF;
    public final o<Boolean> LJI;
    public VEEditorResManager LJII;

    @Override // X.InterfaceC364120EPi
    public final C15O7<Boolean> prepare() {
        if (LIZLLL() != null) {
            this.LJI.LJ(Boolean.TRUE);
        } else if (!this.LIZIZ) {
            VERecordData vERecordDataLIZJ = C574800MgY.LIZJ(this.LJFF);
            if (vERecordDataLIZJ.getSegmentData().size() == 1) {
                VERecordData.VERecordSegmentData vERecordSegmentData = (VERecordData.VERecordSegmentData) ListProtector.remove(vERecordDataLIZJ.getSegmentData(), 0);
                Pair<Integer, Integer> playInOutTime = this.LJFF.getPlayInOutTime();
                vERecordDataLIZJ.getSegmentData().add(new VERecordData.VERecordSegmentData(vERecordSegmentData.mVideo, vERecordSegmentData.mVideoLength, vERecordSegmentData.mAudio, vERecordSegmentData.mAudioLength, vERecordSegmentData.mVideoSpeed, vERecordSegmentData.mSpeed, vERecordSegmentData.mRotate, ((Number) playInOutTime.first).longValue() * 1000, 1000 * ((Number) playInOutTime.second).longValue(), true));
            }
            final VEEditorResManager vEEditorResManager = new VEEditorResManager(this.LJ.getWorkspace());
            this.LJII = vEEditorResManager;
            this.LIZIZ = true;
            VEEditor.LJIIZILJ(vEEditorResManager, vERecordDataLIZJ, -1, -1, new C1DOH() { // from class: X.0Mgf
                @Override // X.C1DOH
                public final void LIZ(double d) {
                    Function1<? super Double, Unit> function1 = this.LIZ.LIZLLL;
                    if (function1 != null) {
                        function1.invoke(Double.valueOf(d));
                    }
                }

                @Override // X.C1DOH
                public final void LIZIZ(int i) {
                    C01TT.LIZLLL(new AwS134S0201000_8(this.LIZ, vEEditorResManager, i, 4));
                }
            });
        }
        return this.LJI.LIZ;
    }

    @Override // X.AbstractC364180EPo
    public final InterfaceC1452170ntP LJ() {
        return this.LJ;
    }

    @Override // X.AbstractC364180EPo
    public final VEEditorResManager LJI() {
        return this.LJII;
    }

    public C574860Mge(InterfaceC1452170ntP interfaceC1452170ntP, MultiEditVideoRecordData multiEditVideoRecordData) {
        super(interfaceC1452170ntP);
        this.LJ = interfaceC1452170ntP;
        this.LJFF = multiEditVideoRecordData;
        this.LJI = new o<>();
    }
}
