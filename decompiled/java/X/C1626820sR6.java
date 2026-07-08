package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.recordcontrol.e0;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import lnn.q;

/* JADX INFO: renamed from: X.0sR6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1626820sR6 extends AbstractC2255721DQs<InterfaceC1627140sRc> implements InterfaceC1627140sRc, InterfaceC1626500sQa {
    public static final int LLJI = 8;
    public final InterfaceC1626500sQa LL;
    public final boolean LLILLJJLI;
    public boolean LLIZLLLIL;
    public final InterfaceC497601wk LLILLL = C2296808zG.LJII(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ);
    public final InterfaceC332260D0u<Long> LLILZ = C1BNE.LIZ(null);
    public final InterfaceC332260D0u<Long> LLILZIL = C1BNE.LIZ(null);
    public final InterfaceC332260D0u<C1626830sR7> LLILZLL = C1BNE.LIZ(null);
    public final InterfaceC332260D0u<Long> LLIZ = C1BNE.LIZ(null);
    public final InterfaceC1627140sRc LLJ = this;

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1650930t3z Cp() {
        return this.LL.Cp();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1623680sM2 Ep() {
        return this.LL.Ep();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1649820t2C Eq() {
        return this.LL.Eq();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC579050MnP Gp() {
        return this.LL.Gp();
    }

    @Override // X.InterfaceC1626500sQa
    public l0 Hq() {
        return this.LL.Hq();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1448860no4 Ip() {
        return this.LL.Ip();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1625000sOA Iq() {
        return this.LL.Iq();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1646220swO Kp() {
        return this.LL.Kp();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1650620t3U Lp() {
        return this.LL.Lp();
    }

    @Override // X.InterfaceC1626500sQa
    public q Mq() {
        return this.LL.Mq();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1648020szI Op() {
        return this.LL.Op();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1628180sTI Pp() {
        return this.LL.Pp();
    }

    @Override // X.InterfaceC1626500sQa
    public long Xp() {
        return this.LL.Xp();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1647520syU aq() {
        return this.LL.aq();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1650230t2r getCameraApiComponent() {
        return this.LL.getCameraApiComponent();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1648510t05 getGestureApiComponent() {
        return this.LL.getGestureApiComponent();
    }

    @Override // X.InterfaceC1626500sQa
    public a getPlanCUIApiComponent() {
        return this.LL.getPlanCUIApiComponent();
    }

    @Override // X.InterfaceC1626500sQa
    public ShortVideoContext getShortVideoContext() {
        return this.LL.getShortVideoContext();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1638550sk1 gq() {
        return this.LL.gq();
    }

    @Override // X.InterfaceC1626500sQa
    public e0 iq() {
        return this.LL.iq();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1625000sOA nq() {
        return this.LL.nq();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1625220sOW uq() {
        return this.LL.uq();
    }

    @Override // X.InterfaceC1626500sQa
    public q yq() {
        return this.LL.yq();
    }

    private final void X1() {
        C23250099c.LIZLLL(this.LLILLL, null, null, new C1407850mjv(this, null), 3);
    }

    @Override // X.InterfaceC1627140sRc
    public void HH() {
        if (this.LLIZLLLIL) {
            return;
        }
        this.LLIZLLLIL = true;
        this.LLIZ.setValue(Long.valueOf(System.currentTimeMillis()));
    }

    @Override // X.InterfaceC1627140sRc
    public void es0() {
        this.LLILZ.setValue(Long.valueOf(System.currentTimeMillis()));
    }

    @Override // X.InterfaceC1627140sRc
    public void sN1() {
        if (this.LLILZIL.getValue() == null) {
            this.LLILZIL.setValue(Long.valueOf(System.currentTimeMillis()));
        }
    }

    public InterfaceC1627140sRc W1() {
        return this.LLJ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJ;
    }

    public C1626820sR6(InterfaceC1626500sQa interfaceC1626500sQa, boolean z) {
        this.LL = interfaceC1626500sQa;
        this.LLILLJJLI = z;
        X1();
    }

    @Override // X.InterfaceC1627140sRc
    public void EJ(boolean z, long j) {
        if (this.LLILZIL.getValue() == null) {
            sN1();
        }
        this.LLILZLL.setValue(new C1626830sR7(System.currentTimeMillis(), z, j));
    }
}
