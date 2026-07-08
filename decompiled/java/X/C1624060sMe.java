package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.AwS569S0100000_25;
import lnn.q;

/* JADX INFO: renamed from: X.0sMe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624060sMe implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final String[] LLJIJIL;
    public final LifecycleOwner LL;
    public final C1DRG LLILLJJLI;
    public final C1664750tQH LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664750tQH LLILZIL;
    public Effect LLILZLL;
    public boolean LLIZLLLIL;
    public int LLIZ = -1;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1060));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1624060sMe.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1624060sMe.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1624060sMe.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJIJIL = new String[]{EnumC1647570syZ.RECORD_NOW.getTag()};
    }

    public final q LIZ() {
        return (q) this.LLILLL.getValue(this, LLJI[0]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public final void LIZIZ(String str) {
        int iLJIIIZ = -1;
        if (C13LQ.LJIILLIIL(str, LLJIJIL)) {
            if (!this.LLIZLLLIL) {
                this.LLIZLLLIL = true;
                List<String> list = C579450Mo3.LIZ;
                C1664750tQH c1664750tQH = this.LLILZIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
                if (!C579450Mo3.LIZ((ShortVideoContext) c1664750tQH.getValue(this, interfaceC2217461BqaArr[2]))) {
                    LIZ().KA1(true);
                }
                if (C1624010sMZ.LIZIZ(LIZ()) != null) {
                    ((InterfaceC1650190t2n) this.LLILZ.getValue(this, interfaceC2217461BqaArr[1])).St2().getMediaController().x5(true);
                    Effect effectLIZIZ = C1624010sMZ.LIZIZ(LIZ());
                    if (effectLIZIZ != null) {
                        C1446130njf.LIZ.getClass();
                        if (C1446130njf.LJIILJJIL(effectLIZIZ, "share_ar", false) || (effectLIZIZ != null && (C1624200sMs.LJIIIIZZ(effectLIZIZ) || (!C2401009ay.LIZ(effectLIZIZ.getTags()) && effectLIZIZ.getTags().contains("now_camera_disable"))))) {
                            this.LLILZLL = C1624010sMZ.LIZIZ(LIZ());
                            if (C1625940sPg.LJIIJ(LIZ().C0(), this.LLILZLL)) {
                                iLJIIIZ = C1625940sPg.LJIIIZ(LIZ().C0());
                            }
                            this.LLIZ = iLJIIIZ;
                            LIZ().w4().LIZJ(C1622820sKe.LIZ(null, null, 7));
                        }
                    }
                }
                LIZ().C0().LJII().LIZ().observe(this.LL, (Observer) this.LLJ.getValue());
                return;
            }
            return;
        }
        if (!this.LLIZLLLIL) {
            return;
        }
        this.LLIZLLLIL = false;
        LIZ().C0().LJII().LIZ().removeObserver((Observer) this.LLJ.getValue());
        List<String> list2 = C579450Mo3.LIZ;
        C1664750tQH c1664750tQH2 = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJI;
        if (!C579450Mo3.LIZ((ShortVideoContext) c1664750tQH2.getValue(this, interfaceC2217461BqaArr2[2]))) {
            LIZ().KA1(false);
        }
        if (C1624010sMZ.LIZIZ(LIZ()) != null) {
            ((InterfaceC1650190t2n) this.LLILZ.getValue(this, interfaceC2217461BqaArr2[1])).St2().getMediaController().x5(false);
        }
        if (C1624010sMZ.LIZIZ(LIZ()) == null && this.LLILZLL != null) {
            InterfaceC1625410sOp interfaceC1625410sOpW4 = LIZ().w4();
            Effect effect = this.LLILZLL;
            if (effect != null) {
                interfaceC1625410sOpW4.LIZJ(C1622820sKe.LIZIZ(effect, this.LLIZ, EnumC1448980noG.RECOVER, null, null, null, null, 0, false, null, null, 1020));
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        this.LLILZLL = null;
        this.LLIZ = -1;
    }

    public C1624060sMe(C1646390swf c1646390swf, C1DRG c1drg) {
        this.LL = c1646390swf;
        this.LLILLJJLI = c1drg;
        this.LLILLL = C1664770tQJ.LIZ(c1drg, q.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, InterfaceC1650230t2r.class, null);
        this.LLILZIL = C1664770tQJ.LIZ(c1drg, ShortVideoContext.class, null);
    }
}
