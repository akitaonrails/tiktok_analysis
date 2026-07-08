package X;

import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.12Pb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19750112Pb extends AbstractC2255721DQs<InterfaceC19753412Qi> implements InterfaceC19753412Qi, InterfaceC379610EuV {
    public static final int LLIZLLLIL = 8;
    public final C1DRG LL;
    public final InterfaceC19753412Qi LLILLJJLI = this;
    public final C560530Lyd<Boolean> LLILLL = new C560530Lyd<>();
    public final C560530Lyd<AudioRecorderParam> LLILZ = new C560530Lyd<>();
    public final C560530Lyd<Effect> LLILZIL = new C560530Lyd<>();
    public final C560530Lyd<Integer> LLILZLL = new C560530Lyd<>();
    public final C19750512Pf LLIZ = new C19750512Pf();

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        ((ArrayList) OL1().LIZ).clear();
    }

    @Override // X.InterfaceC19753412Qi
    public C19750512Pf OL1() {
        return this.LLIZ;
    }

    public InterfaceC19753412Qi W1() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC19753412Qi
    public C560530Lyd<AudioRecorderParam> ZD0() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC19753412Qi
    public C560530Lyd<Boolean> m31() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC19753412Qi
    public C560530Lyd<Effect> rd2() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC19753412Qi
    public C560530Lyd<Integer> x11() {
        return this.LLILZLL;
    }

    public C19750112Pb(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
