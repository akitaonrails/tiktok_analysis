package Y;

import X.C09JN;
import X.C1661090tKN;
import X.C1661100tKO;
import X.C1661110tKP;
import X.C1661120tKQ;
import X.C1661140tKS;
import X.C1C7U;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: loaded from: classes26.dex */
public class AfS1S0112000_25 implements C09JN {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public boolean z1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public AfS1S0112000_25(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(AfS1S0112000_25 afS1S0112000_25, Object obj) {
        int i;
        C1661110tKP c1661110tKP;
        C1C7U.LIZ("EffectWithMusicDownloader@cff0.provideMusicAndEffectProgressConsumer$1");
        C1661140tKS c1661140tKS = (C1661140tKS) obj;
        int i2 = c1661140tKS.LIZ;
        int i3 = c1661140tKS.LIZIZ;
        Effect effect = c1661140tKS.LIZJ;
        long j = c1661140tKS.LIZLLL;
        ExceptionResult exceptionResult = c1661140tKS.LJ;
        if (i3 == -102) {
            if (i2 == -101 && (c1661110tKP = ((C1661120tKQ) afS1S0112000_25.l0).LJIIIIZZ) != null) {
                c1661110tKP.LIZLLL = System.currentTimeMillis();
            }
            if (!afS1S0112000_25.z1) {
                afS1S0112000_25.z1 = true;
                C1661090tKN c1661090tKN = ((C1661120tKQ) afS1S0112000_25.l0).LJII;
                if (c1661090tKN != null) {
                    c1661090tKN.onStart(effect);
                }
            }
        } else if (-106 == i2) {
            if (i3 == 100) {
                C1661110tKP c1661110tKP2 = ((C1661120tKQ) afS1S0112000_25.l0).LJIIIIZZ;
                if (c1661110tKP2 != null) {
                    c1661110tKP2.LIZ(0, null);
                }
            } else {
                C1661110tKP c1661110tKP3 = ((C1661120tKQ) afS1S0112000_25.l0).LJIIIIZZ;
                if (c1661110tKP3 != null) {
                    c1661110tKP3.LIZ(1, exceptionResult);
                }
            }
        } else if (i3 == -104) {
            C1661090tKN c1661090tKN2 = ((C1661120tKQ) afS1S0112000_25.l0).LJII;
            if (c1661090tKN2 != null) {
                c1661090tKN2.LJ(effect);
            }
        } else {
            if (-100 == i2) {
                afS1S0112000_25.i2 = i3;
            } else if (-101 == i2) {
                afS1S0112000_25.i3 = i3;
            }
            C1661120tKQ c1661120tKQ = (C1661120tKQ) afS1S0112000_25.l0;
            C1661090tKN c1661090tKN3 = c1661120tKQ.LJII;
            if (c1661090tKN3 != null) {
                if (c1661120tKQ.LIZJ == null) {
                    i = afS1S0112000_25.i3;
                } else {
                    i = (afS1S0112000_25.i2 + afS1S0112000_25.i3) / 2;
                }
                c1661090tKN3.LIZLLL(i, effect, Long.valueOf(j));
            }
        }
        C1C7U.LIZIZ("EffectWithMusicDownloader@cff0.provideMusicAndEffectProgressConsumer$1");
    }

    public static final void accept$1(AfS1S0112000_25 afS1S0112000_25, Object obj) {
        int i;
        C1661090tKN c1661090tKN;
        C1661110tKP c1661110tKP;
        C1C7U.LIZ("MusicWithEffectDownloader@8d60.provideMusicAndEffectProgressConsumer$1");
        C1661140tKS c1661140tKS = (C1661140tKS) obj;
        int i2 = c1661140tKS.LIZ;
        int i3 = c1661140tKS.LIZIZ;
        Effect effect = c1661140tKS.LIZJ;
        long j = c1661140tKS.LIZLLL;
        ExceptionResult exceptionResult = c1661140tKS.LJ;
        if (i3 == -102) {
            if (i2 == -101 && (c1661110tKP = ((C1661100tKO) afS1S0112000_25.l0).LJIIIIZZ) != null) {
                c1661110tKP.LIZLLL = System.currentTimeMillis();
            }
            if (!afS1S0112000_25.z1) {
                afS1S0112000_25.z1 = true;
                C1661090tKN c1661090tKN2 = ((C1661100tKO) afS1S0112000_25.l0).LJII;
                if (c1661090tKN2 != null) {
                    c1661090tKN2.onStart(effect);
                }
            }
        } else if (-106 == i2) {
            if (i3 == 100) {
                C1661110tKP c1661110tKP2 = ((C1661100tKO) afS1S0112000_25.l0).LJIIIIZZ;
                if (c1661110tKP2 != null) {
                    c1661110tKP2.LIZ(0, null);
                }
            } else {
                C1661110tKP c1661110tKP3 = ((C1661100tKO) afS1S0112000_25.l0).LJIIIIZZ;
                if (c1661110tKP3 != null) {
                    c1661110tKP3.LIZ(1, exceptionResult);
                }
            }
        } else {
            if (i3 == -104 && (c1661090tKN = ((C1661100tKO) afS1S0112000_25.l0).LJII) != null) {
                c1661090tKN.LJ(effect);
            }
            if (-100 == i2) {
                afS1S0112000_25.i2 = i3;
            } else if (-101 == i2) {
                afS1S0112000_25.i3 = i3;
            }
            C1661100tKO c1661100tKO = (C1661100tKO) afS1S0112000_25.l0;
            C1661090tKN c1661090tKN3 = c1661100tKO.LJII;
            if (c1661090tKN3 != null) {
                if (TextUtils.isEmpty(c1661100tKO.LIZIZ)) {
                    i = afS1S0112000_25.i2;
                } else {
                    i = (afS1S0112000_25.i2 + afS1S0112000_25.i3) / 2;
                }
                c1661090tKN3.LIZLLL(i, effect, Long.valueOf(j));
            }
        }
        C1C7U.LIZIZ("MusicWithEffectDownloader@8d60.provideMusicAndEffectProgressConsumer$1");
    }
}
