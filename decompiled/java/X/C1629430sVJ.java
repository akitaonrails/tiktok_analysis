package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0sVJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1629430sVJ implements IEffectDownloadProgressListener, InterfaceC1629540sVU {
    public final C1629340sVA LIZ;
    public final InterfaceC1632620saS<C1629340sVA, Effect, C1629620sVc> LIZIZ;
    public volatile boolean LIZJ;
    public volatile boolean LIZLLL;
    public volatile boolean LJ;
    public volatile int LJFF;
    public volatile int LJI;
    public long LJII = System.currentTimeMillis();
    public long LJIIIIZZ;

    public final void LIZLLL() {
        this.LJ = true;
        LIZJ();
    }

    @Override // X.InterfaceC1629540sVU
    public final void onFailed() {
        this.LIZLLL = true;
        C1624360sN8.LIZ.put(this.LIZ.LIZ.getEffectId(), null);
        LIZJ();
    }

    public final void LIZJ() {
        if (this.LIZLLL) {
            if (this.LIZJ) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LJII;
                InterfaceC1632620saS<C1629340sVA, Effect, C1629620sVc> interfaceC1632620saS = this.LIZIZ;
                C1629340sVA c1629340sVA = this.LIZ;
                interfaceC1632620saS.LIZ(c1629340sVA, c1629340sVA.LIZ, new C1629620sVc(this.LJIIIIZZ, 3), jCurrentTimeMillis);
                return;
            }
            if (this.LJ) {
                InterfaceC1632620saS<C1629340sVA, Effect, C1629620sVc> interfaceC1632620saS2 = this.LIZIZ;
                C1629340sVA c1629340sVA2 = this.LIZ;
                interfaceC1632620saS2.LIZLLL(c1629340sVA2, c1629340sVA2.LIZ);
            }
        }
    }

    public final void LJ() {
        this.LIZIZ.LIZJ((this.LIZJ || this.LIZLLL) ? !this.LIZLLL ? (this.LJI + 100) / 2 : !this.LIZJ ? (this.LJFF + 100) / 2 : 100 : (this.LJI + this.LJFF) / 2, this.LIZ);
    }

    @Override // X.InterfaceC1629540sVU
    public final void onProgress(int i) {
        this.LJI = i;
        LJ();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        this.LJII = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        this.LIZJ = true;
        LIZJ();
    }

    public C1629430sVJ(C1629340sVA c1629340sVA, C1629410sVH c1629410sVH) {
        this.LIZ = c1629340sVA;
        this.LIZIZ = c1629410sVH;
    }

    @Override // X.InterfaceC1629540sVU
    public final void LIZ(InterfaceC1629560sVW interfaceC1629560sVW, String str) {
        this.LIZLLL = true;
        String effectId = this.LIZ.LIZ.getEffectId();
        if (interfaceC1629560sVW != null) {
            interfaceC1629560sVW.setMusicPriority(-1);
        }
        C1624360sN8.LIZ.put(effectId, interfaceC1629560sVW);
        C1624360sN8.LIZIZ.put(effectId, str);
        if (str != null) {
            ((Keva) C1629700sVk.LIZ.getValue()).storeString(interfaceC1629560sVW.getMusicId(), str);
        }
        LIZJ();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        this.LIZIZ.LIZIZ(this.LIZ, exceptionResult.getException(), new C1629620sVc(Integer.valueOf(exceptionResult.getErrorCode()), exceptionResult.getMsg(), this.LJIIIIZZ), System.currentTimeMillis() - this.LJII);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        this.LJIIIIZZ = j;
        this.LJFF = i;
        LJ();
    }
}
