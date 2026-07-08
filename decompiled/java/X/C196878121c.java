package X;

import Y.ACallableS432S0100000_29;
import Y.ARunnableS48S0110000_29;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.vesdk.VEEditor;

/* JADX INFO: renamed from: X.121c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C196878121c {
    public final CreativeInfo LIZ;
    public final InterfaceC1452170ntP LIZIZ;
    public final InterfaceC1455860nzM LIZJ;
    public String LJ;
    public String LJFF;
    public C196899121x LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public C0KW6 LJIIIZ;
    public String LIZLLL = "";
    public final C196884121i LJIIJ = new InterfaceC1464200oCo() { // from class: X.121i
        @Override // X.InterfaceC1464200oCo
        public final void onCallback(int i, int i2, float f, String str) {
            if (i != 4098) {
                if (i == 4132) {
                    C196878121c c196878121c = this.LL;
                    c196878121c.LJII = false;
                    c196878121c.LIZ();
                    return;
                }
                return;
            }
            C196878121c c196878121c2 = this.LL;
            if (!c196878121c2.LJII) {
                return;
            }
            C15O7.LIZIZ(new ACallableS432S0100000_29(c196878121c2, 6), C15O7.LJIIIIZZ, null);
        }
    };

    public final void LIZ() {
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(this.LIZIZ);
        if (c348100DkmLIZIZ == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        c348100DkmLIZIZ.LJIIIZ().LIZ().cancelInfoStickerPin(this.LIZLLL);
        this.LIZIZ.Yf(this.LJIIIIZZ, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, new InterfaceC1464180oCm() { // from class: X.121h
            @Override // X.InterfaceC1464180oCm
            public final void onSeekDone(int i) {
                this.LIZ.LIZIZ.play();
                C196899121x c196899121x = this.LIZ.LJI;
                if (c196899121x != null) {
                    HandlerHook.viewPost(c196899121x.LIZ.LLILLL, new ARunnableS48S0110000_29(c196899121x, 1));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.121i] */
    public C196878121c(CreativeInfo creativeInfo, InterfaceC1452170ntP interfaceC1452170ntP, InterfaceC1455860nzM interfaceC1455860nzM) {
        this.LIZ = creativeInfo;
        this.LIZIZ = interfaceC1452170ntP;
        this.LIZJ = interfaceC1455860nzM;
    }
}
