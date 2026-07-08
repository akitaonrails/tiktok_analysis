package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0sHw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1621140sHw extends AbstractC1622390sJx {
    public final Function0<Boolean> LLILLJJLI;
    public final Function1<Effect, Unit> LLILLL;
    public final Function0<Unit> LLILZ;
    public final Function0<Unit> LLILZIL;
    public final C560530Lyd<Boolean> LLILZLL;
    public Effect LLIZ;

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        this.LLILZ.invoke();
        this.LLIZ = null;
        this.LLILZLL.LJIIJ(Boolean.FALSE);
    }

    public final void LJJIIJ() {
        if (C1624200sMs.LJIILIIL(this.LLIZ)) {
            this.LLILZ.invoke();
        }
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        return C1624200sMs.LJIILIIL(c1627370sRz.LIZ);
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        this.LLILZIL.invoke();
        if (this.LLIZ != null) {
            this.LLILZ.invoke();
        }
        if (this.LLILLJJLI.invoke().booleanValue()) {
            this.LLILLL.invoke(c1627370sRz.LIZ);
        }
        this.LLILZLL.LJIIJ(Boolean.TRUE);
        this.LLIZ = c1627370sRz.LIZ;
    }

    public C1621140sHw(AFwS214S0000000_25 aFwS214S0000000_25, AwS604S0100000_25 awS604S0100000_25, AwS569S0100000_25 awS569S0100000_25, AwS569S0100000_25 awS569S0100000_252, C560530Lyd c560530Lyd) {
        this.LLILLJJLI = aFwS214S0000000_25;
        this.LLILLL = awS604S0100000_25;
        this.LLILZ = awS569S0100000_25;
        this.LLILZIL = awS569S0100000_252;
        this.LLILZLL = c560530Lyd;
    }
}
