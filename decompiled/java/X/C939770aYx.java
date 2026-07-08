package X;

import Y.ACListenerS150S0100000_15;
import Y.AfS184S0100000_15;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLeaveGiftRankIsUSRegionSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aYx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939770aYx extends AbstractC939840aZ4 {
    public final DataChannel LLIZLLLIL;
    public final WeakReference<C938220aWS> LLJ;
    public final C11PQ<Boolean> LLJI;
    public C945640aiQ LLJIJIL;

    private final User getTargetUser() {
        C11PQ<List<C2262071DgL>> c11pq;
        List<C2262071DgL> listLJLZ;
        C2262071DgL c2262071DgL;
        C938220aWS c938220aWS = this.LLJ.get();
        if (c938220aWS == null) {
            return null;
        }
        PosIdentity posIdentity = getWindow().getPosIdentity();
        C938230aWT c938230aWTLIZJ = c938220aWS.LIZJ((posIdentity == null || posIdentity.type != 1) ? null : posIdentity.value, false, false);
        if (c938230aWTLIZJ == null || (c11pq = c938230aWTLIZJ.LJ) == null || (listLJLZ = c11pq.LJLZ()) == null || (c2262071DgL = (C2262071DgL) C13LP.LJJJLL(listLJLZ)) == null) {
            return null;
        }
        return c2262071DgL.LIZ;
    }

    public final void LJIIJ() {
        boolean zIsInUS = MultiGuestLeaveGiftRankIsUSRegionSetting.INSTANCE.isInUS();
        if (zIsInUS) {
            C940280aZm.LIZ(getContext(), getDataChannel());
        } else {
            if (zIsInUS) {
                throw new C1954807lC();
            }
            User targetUser = getTargetUser();
            C01ZG.LIZ(getContext(), Long.valueOf(targetUser != null ? targetUser.getId() : 0L));
        }
    }

    public final void LJIIIZ() {
        View viewLJLLLL;
        ViewStub viewStub = (ViewStub) findViewById(R.id.ezt);
        if (this.LLJIJIL == null) {
            Unit unit = null;
            if (viewStub != null) {
                try {
                    viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            } else {
                viewLJLLLL = null;
            }
            C945640aiQ c945640aiQ = viewLJLLLL instanceof C945640aiQ ? (C945640aiQ) viewLJLLLL : null;
            this.LLJIJIL = c945640aiQ;
            if (c945640aiQ != null) {
                C786410Ut5.p8(c945640aiQ, new ACListenerS150S0100000_15(this, 296));
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        }
        C945640aiQ c945640aiQ2 = this.LLJIJIL;
        if (c945640aiQ2 != null) {
            c945640aiQ2.LIZJ(getWindow().getShapeDescriptor().LIZ.width());
        }
    }

    @Override // X.AbstractC939840aZ4
    public Integer getLayoutId() {
        return Integer.valueOf(R.layout.htg);
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String str;
        C938220aWS c938220aWS;
        C938230aWT c938230aWTLIZJ;
        super.onAttachedToWindow();
        PosIdentity posIdentity = getWindow().getPosIdentity();
        if (posIdentity == null || posIdentity.type != 1 || (str = posIdentity.value) == null || (c938220aWS = this.LLJ.get()) == null || (c938230aWTLIZJ = c938220aWS.LIZJ(str, false, false)) == null) {
            return;
        }
        getCompositeDisposable().LIZ(new C11IW(C11NZ.LJIIJ(c938230aWTLIZJ.LIZJ.LJJIFFI(), c938230aWTLIZJ.LJIIJ.LJJIFFI(), new InterfaceC500500Jk0() { // from class: X.0aZa
            @Override // X.InterfaceC500500Jk0
            public final Object apply(Object obj, Object obj2) {
                return new Pair(obj, obj2);
            }
        }).LJJIJIIJIL(new AfS184S0100000_15(this, 239))).LJIILL().LJIIZILJ());
        getCompositeDisposable().LIZ(new C11IW(c938230aWTLIZJ.LJIIJJI.LJJIFFI().LJJIJIIJIL(new AfS184S0100000_15(this, 240))).LJIILL().LJIIZILJ());
    }

    @Override // X.AbstractC939840aZ4
    public DataChannel getDataChannel() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC939840aZ4
    public EnumC939900aZA getElementType() {
        return EnumC939900aZA.COUNTDOWN_TIMER;
    }

    public C939770aYx(Context context, DataChannel dataChannel, WeakReference<C938220aWS> weakReference, C11PQ<Boolean> c11pq, C957020b0m c957020b0m) {
        super(context, dataChannel, c957020b0m, null);
        this.LLIZLLLIL = dataChannel;
        this.LLJ = weakReference;
        this.LLJI = c11pq;
    }
}
