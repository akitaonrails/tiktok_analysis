package X;

import Y.ACallableS432S0100000_29;
import Y.ARunnableS48S0110000_29;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.vesdk.VEEditor;
import dmt.av.video.VEEditorAutoStartStopArbiter;

/* JADX INFO: renamed from: X.1214, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1214 {
    public final CreativeInfo LIZ;
    public final InterfaceC1452170ntP LIZIZ;
    public final InterfaceC1455860nzM LIZJ;
    public String LJ;
    public String LJFF;
    public C196874120y LJI;
    public C121R LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public DialogC848920XRy LJIIJ;
    public String LIZLLL = "";
    public final C121B LJIIJJI = new InterfaceC1464200oCo() { // from class: X.121B
        @Override // X.InterfaceC1464200oCo
        public final void onCallback(int i, int i2, float f, String str) {
            if (i != 4098) {
                if (i == 4132) {
                    this.LL.LIZIZ();
                }
            } else {
                AnonymousClass1214 anonymousClass1214 = this.LL;
                if (!anonymousClass1214.LJIIIIZZ) {
                    return;
                }
                C15O7.LIZIZ(new ACallableS432S0100000_29(anonymousClass1214, 10), C15O7.LJIIIIZZ, null);
            }
        }
    };

    public final void LIZIZ() {
        this.LJIIIIZZ = false;
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(this.LIZIZ);
        if (c348100DkmLIZIZ == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        c348100DkmLIZIZ.LJIIIZ().LIZ().cancelInfoStickerPin(this.LIZLLL);
        this.LIZIZ.Yf(this.LJIIIZ, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, new InterfaceC1464180oCm() { // from class: X.1217
            @Override // X.InterfaceC1464180oCm
            public final void onSeekDone(int i) {
                AnonymousClass1214 anonymousClass1214 = this.LIZ;
                VEEditorAutoStartStopArbiter value = anonymousClass1214.LIZJ.b10().getValue();
                if (value != null && value.LLJIJIL) {
                    anonymousClass1214.LIZIZ.play();
                }
                C121R c121r = this.LIZ.LJII;
                if (c121r != null) {
                    C196868120s c196868120s = c121r.LIZ;
                    if (c196868120s.LLILLL != null) {
                        HandlerHook.viewPost(c196868120s.LLILLL, new ARunnableS48S0110000_29(c121r, 2));
                    }
                }
            }
        });
    }

    public final void LIZ(C196874120y c196874120y) {
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(this.LIZIZ);
        if (c348100DkmLIZIZ != null) {
            C348440DlK c348440DlKLJJIIJZLJL = c348100DkmLIZIZ.LJIIIZ().LJJIIJZLJL(c196874120y.LLILLL.uuid);
            if (c348440DlKLJJIIJZLJL instanceof C348460DlM) {
                C348460DlM c348460DlM = (C348460DlM) c348440DlKLJJIIJZLJL;
                c348460DlM.LJIJ = null;
                c348460DlM.LJIJI = null;
                c348100DkmLIZIZ.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
                return;
            }
            if (!(c348440DlKLJJIIJZLJL instanceof C348450DlL)) {
                return;
            }
            C348450DlL c348450DlL = (C348450DlL) c348440DlKLJJIIJZLJL;
            c348450DlL.LJIILLIIL = null;
            c348450DlL.LJIIZILJ = null;
            c348100DkmLIZIZ.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.121B] */
    public AnonymousClass1214(CreativeInfo creativeInfo, InterfaceC1452170ntP interfaceC1452170ntP, InterfaceC1455860nzM interfaceC1455860nzM) {
        this.LIZ = creativeInfo;
        this.LIZIZ = interfaceC1452170ntP;
        this.LIZJ = interfaceC1455860nzM;
    }
}
