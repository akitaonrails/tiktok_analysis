package X;

import X.C1562980qm8;
import X.C18YK;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.longpress.LongPressBubbleAnimUtil;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;
import java.lang.Enum;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18YP, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18YP<ACTION extends C18YK, REACTION extends C18YK, E extends Enum<E>, T extends C1562980qm8<E>> implements InterfaceC21300418Xi<ACTION, REACTION, E, T> {
    public final C18YE LIZ;
    public final C01GW<C18YJ<ACTION, REACTION>> LIZIZ;
    public final C01GW<C18YT<E>> LIZJ;
    public final E LIZLLL;
    public C18YL LJI;
    public ACTION LJII;
    public REACTION LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public volatile boolean LJIIJJI;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 201));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS576S0100000_32(this, 200));
    public final C01GW LJIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 199));
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 202));

    @Override // X.InterfaceC21300418Xi
    public final IMessageEventProtocol LIZ() {
        return (IMessageEventProtocol) this.LJIILIIL.getValue();
    }

    @Override // X.InterfaceC21300418Xi
    public final boolean isShowing() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC21300418Xi
    public final boolean LIZIZ(E e) {
        return LIZLLL(e);
    }

    public final boolean LIZLLL(E e) {
        ACTION action;
        REACTION reaction;
        boolean z = false;
        if (this.LJIIJJI) {
            return false;
        }
        this.LJIIJ = false;
        if (!((C0ZQZ) this.LJFF.getValue()).LIZJ()) {
            return false;
        }
        C18YN c18yn = (C18YN) ((C0ZQZ) this.LJFF.getValue()).LIZ();
        if (c18yn != null) {
            C18YE c18ye = this.LIZ;
            C18YL c18yl = this.LJI;
            if (c18yl == null || (action = this.LJII) == null || (reaction = this.LJIIIIZZ) == null) {
                return false;
            }
            if (c18yn.LJFF(e, c18ye, c18yl, action, reaction, this.LIZIZ.getValue(), (C18YQ) this.LJIIL.getValue(), new AwS576S0100000_32(this, 198))) {
                z = true;
                if (this.LJIIIZ) {
                    this.LIZ.LJFF.invoke();
                }
            }
        }
        return z;
    }

    @Override // X.InterfaceC21300418Xi
    public final void LIZJ(C18YL c18yl, Object obj, Object obj2) {
        LongPressBubbleAnimUtil longPressBubbleAnimUtil;
        ACTION action = (ACTION) obj;
        REACTION reaction = (REACTION) obj2;
        C18YS c18ys = (C18YS) this.LJ.getValue();
        ViewGroup viewGroup = this.LIZ.LIZJ;
        c18ys.setTouchable(true);
        c18ys.showAtLocation(viewGroup, 0, 0, 0);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJI(c18ys);
        C787990Uvd.LIZ.getClass();
        C994003uc.LIZ();
        c18ys.LL = new AwS576S0100000_32(this, 861);
        C18YN c18yn = (C18YN) ((C0ZQZ) this.LJFF.getValue()).LIZ();
        if (c18yn != null) {
            c18yn.LL = this.LIZ.LJ;
            this.LJIIIZ = false;
            this.LJIIJ = true;
            if ((c18yl.LIZ instanceof C789240Uxe) && (longPressBubbleAnimUtil = (LongPressBubbleAnimUtil) PluggableExtentionKt.pluggableSpiForReal(LongPressBubbleAnimUtil.class)) != null) {
                longPressBubbleAnimUtil.LIZ(c18yl.LIZ());
            }
            C18YE c18ye = this.LIZ;
            this.LJI = c18yl;
            this.LJII = action;
            this.LJIIIIZZ = reaction;
            c18yn.LJI(c18ye, c18yl, action, reaction, this.LIZIZ.getValue(), (C18YQ) this.LJIIL.getValue());
            c18yn.setDismissCallback(new AwS576S0100000_32(this, 862));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C18YP(C18YE c18ye, C01GW<? extends C18YJ<ACTION, REACTION>> c01gw, C01GW<? extends C18YT<E>> c01gw2, E e) {
        this.LIZ = c18ye;
        this.LIZIZ = c01gw;
        this.LIZJ = c01gw2;
        this.LIZLLL = e;
    }
}
