package X;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.renderscript.Matrix4f;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0kHG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313200kHG extends C1313270kHN {
    public final WeakReference<LynxUI> LJFF;
    public C1313230kHJ LJI;
    public PointF LJII;
    public boolean LJIIIIZZ;

    @Override // X.C1313270kHN
    /* JADX INFO: renamed from: LJIIJJI */
    public final BackgroundDrawable LIZ() {
        LynxUI lynxUI = this.LJFF.get();
        if (lynxUI == null) {
            return null;
        }
        BackgroundDrawable backgroundDrawableLIZ = super.LIZ();
        T t = lynxUI.mView;
        if (t != 0) {
            Drawable background = t.getBackground();
            lynxUI.mView.setBackground(null);
            if (background != null) {
                lynxUI.mView.setBackground(new LayerDrawable(new Drawable[]{backgroundDrawableLIZ, background}));
                return backgroundDrawableLIZ;
            }
            lynxUI.mView.setBackground(backgroundDrawableLIZ);
        }
        return backgroundDrawableLIZ;
    }

    public final void LJIJJ() {
        float fLJIIJ;
        LynxUI lynxUI = this.LJFF.get();
        if (lynxUI == null) {
            return;
        }
        PointF pointF = this.LJII;
        float fLJIIIZ = 0.0f;
        if (pointF != null) {
            float f = pointF.x + 0.0f;
            fLJIIJ = 0.0f + pointF.y;
            fLJIIIZ = f;
        } else {
            fLJIIJ = 0.0f;
        }
        C1313230kHJ c1313230kHJ = this.LJI;
        if (c1313230kHJ != null) {
            fLJIIIZ += c1313230kHJ.LJIIIZ();
            fLJIIJ += this.LJI.LJIIJ();
        }
        T t = lynxUI.mView;
        if (t != 0) {
            C786410Ut5.Jc(t, fLJIIIZ);
            C786410Ut5.ed(lynxUI.mView, fLJIIJ);
        }
    }

    @Override // X.C1313270kHN, X.AbstractC1313300kHQ
    public final /* bridge */ /* synthetic */ AbstractC1313260kHM LIZ() {
        return LIZ();
    }

    public final void LJIJI(List<C1313280kHO> list) {
        T t;
        LynxUI lynxUI = this.LJFF.get();
        if (lynxUI == null) {
            return;
        }
        LynxUI lynxUI2 = this.LJFF.get();
        if (lynxUI2 != null && (t = lynxUI2.mView) != 0) {
            C786410Ut5.Jc(t, 0.0f);
            C786410Ut5.ed(lynxUI2.mView, 0.0f);
            C786410Ut5.Ab(lynxUI2.mView, 0.0f);
            C786410Ut5.Hb(lynxUI2.mView, 0.0f);
            C786410Ut5.Ib(lynxUI2.mView, 0.0f);
            C786410Ut5.Ob(lynxUI2.mView, 1.0f);
            C786410Ut5.pc(lynxUI2.mView, 1.0f);
            this.LJI = null;
            LJIJJ();
        }
        if (list == null) {
            return;
        }
        if (this.LJIIIIZZ) {
            this.LIZ.LLJILJILJ.getLatestWidth();
            this.LIZ.LLJILJILJ.getLatestHeight();
            int latestWidth = lynxUI.getLatestWidth();
            int latestHeight = lynxUI.getLatestHeight();
            C1313230kHJ c1313230kHJ = new C1313230kHJ();
            if (!list.isEmpty()) {
                Matrix4f matrix4f = new Matrix4f();
                Iterator<C1313280kHO> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C1313280kHO next = it2.next();
                        int i = next.LIZ;
                        if (i != 1) {
                            if (i != 2) {
                                switch (i) {
                                    case 4:
                                        matrix4f.translate(0.0f, C1313230kHJ.LIZ(next, 0, latestHeight), 0.0f);
                                        continue;
                                    case 8:
                                        matrix4f.translate(0.0f, 0.0f, C1313230kHJ.LIZ(next, 0, 0.0f));
                                        continue;
                                    case 16:
                                        break;
                                    case 32:
                                    case 256:
                                        matrix4f.rotate(next.LIZIZ, 0.0f, 0.0f, 1.0f);
                                        continue;
                                    case 64:
                                        matrix4f.rotate(next.LIZIZ, 1.0f, 0.0f, 0.0f);
                                        continue;
                                    case 128:
                                        matrix4f.rotate(next.LIZIZ, 0.0f, 1.0f, 0.0f);
                                        continue;
                                    case 512:
                                        matrix4f.scale(next.LIZIZ, next.LJ, 1.0f);
                                        continue;
                                    case 1024:
                                        matrix4f.scale(next.LIZIZ, 1.0f, 1.0f);
                                        continue;
                                    case SpeechEngineDefines.ASR_WORK_MODE_OFFLINE /* 2048 */:
                                        matrix4f.scale(1.0f, next.LIZIZ, 1.0f);
                                        continue;
                                    case SpeechEngineDefines.TTS_WORK_MODE_BOTH /* 4096 */:
                                        c1313230kHJ.LJIILJJIL((float) C1313440kHe.LIZIZ(next.LIZIZ));
                                        c1313230kHJ.LJIILL((float) C1313440kHe.LIZIZ(next.LJ));
                                        continue;
                                    case 8192:
                                        c1313230kHJ.LJIILJJIL((float) C1313440kHe.LIZIZ(next.LIZIZ));
                                        continue;
                                    case 16384:
                                        c1313230kHJ.LJIILL((float) C1313440kHe.LIZIZ(next.LIZIZ));
                                        continue;
                                    case 32768:
                                    case 65536:
                                        matrix4f.multiply(new Matrix4f(next.LJIIIZ));
                                        continue;
                                    default:
                                        LynxLog.DTHROW(null);
                                        c1313230kHJ = null;
                                        break;
                                }
                            } else {
                                matrix4f.translate(C1313230kHJ.LIZ(next, 0, latestWidth), 0.0f, 0.0f);
                            }
                        }
                        matrix4f.translate(C1313230kHJ.LIZ(next, 0, latestWidth), C1313230kHJ.LIZ(next, 1, latestHeight), C1313230kHJ.LIZ(next, 2, 0.0f));
                    } else {
                        C1314310kJ3 c1314310kJ3 = new C1314310kJ3();
                        c1314310kJ3.LIZ();
                        C1313440kHe.LIZ(C1313230kHJ.LIZIZ(matrix4f.getArray()), c1314310kJ3);
                        c1313230kHJ.LJIILIIL(c1314310kJ3);
                    }
                }
            }
            this.LJI = c1313230kHJ;
        } else {
            this.LIZ.LLJILJILJ.getLatestWidth();
            this.LIZ.LLJILJILJ.getLatestHeight();
            this.LJI = C1313230kHJ.LJIIL(list, lynxUI.getLatestWidth(), lynxUI.getLatestHeight());
        }
        LJIJJ();
        lynxUI.mView.setOutlineProvider(null);
        C14K9.LJIL(lynxUI.mView, this.LJI.LJIIJJI());
        C786410Ut5.Ab(lynxUI.mView, this.LJI.LIZJ());
        C786410Ut5.Hb(lynxUI.mView, this.LJI.LIZLLL());
        C786410Ut5.Ib(lynxUI.mView, this.LJI.LJ());
        C786410Ut5.Ob(lynxUI.mView, this.LJI.LJFF());
        C786410Ut5.pc(lynxUI.mView, this.LJI.LJI());
        lynxUI.mSkewX = this.LJI.LJII();
        lynxUI.mSkewY = this.LJI.LJIIIIZZ();
        lynxUI.mView.invalidate();
    }

    public C1313200kHG(LynxUI lynxUI, s sVar) {
        super(sVar);
        this.LJIIIIZZ = true;
        this.LJFF = new WeakReference<>(lynxUI);
    }
}
