package X;

import Y.AfS184S0100000_15;
import android.content.Context;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.api.KaraokeModeStatusChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestKaraokePlayerChangeChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.MultiGuestLayoutRenderV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aZX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940130aZX extends AbstractC939840aZ4 {
    public final DataChannel LLIZLLLIL;
    public final WeakReference<C938220aWS> LLJ;
    public Long LLJI;
    public C940600aaI LLJIJIL;
    public Integer LLJILJIL;
    public LiveIconView LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C11PQ<Boolean> LLJJIII;

    /* JADX INFO: renamed from: getLayoutId, reason: collision with other method in class */
    public Void m45getLayoutId() {
        return null;
    }

    public final void LJIIIZ() {
        C917720ZzO.LIZ.getClass();
        if (C917720ZzO.LIZJ()) {
            if (Intrinsics.LJFF(this.LLJI, getUserId())) {
                this.LLJJIII.onNext(Boolean.FALSE);
            }
            this.LLJI = null;
        }
    }

    public final Function1<C940600aaI, Unit> getPlayerChangeObserver() {
        return (Function1) this.LLJILLL.getValue();
    }

    @Override // X.AbstractC939840aZ4
    public C940610aaJ getPriority() {
        return new C940610aaJ(100, 0, 2);
    }

    public final Function1<List<? extends EnumC934000aPe>, Unit> getRoleObserver() {
        return (Function1) this.LLJJI.getValue();
    }

    public final Function1<Boolean, Unit> getStatusObserver() {
        return (Function1) this.LLJJ.getValue();
    }

    private final Long getUserId() {
        String str;
        C938220aWS c938220aWS;
        C938230aWT c938230aWTLIZJ;
        C11PQ<List<C2262071DgL>> c11pq;
        List<C2262071DgL> listLJLZ;
        PosIdentity posIdentity = getWindow().getPosIdentity();
        if (posIdentity == null || posIdentity.type != 1 || (str = posIdentity.value) == null || (c938220aWS = this.LLJ.get()) == null || (c938230aWTLIZJ = c938220aWS.LIZJ(str, false, false)) == null || (c11pq = c938230aWTLIZJ.LJ) == null || (listLJLZ = c11pq.LJLZ()) == null || !(!listLJLZ.isEmpty())) {
            return null;
        }
        return Long.valueOf(((C2262071DgL) C13LP.LJJJJZI(listLJLZ)).getId());
    }

    @Override // X.AbstractC939840aZ4
    public /* bridge */ /* synthetic */ Integer getLayoutId() {
        return (Integer) m45getLayoutId();
    }

    @Override // X.AbstractC939840aZ4
    public Integer getLayoutIdLazy() {
        return Integer.valueOf(R.layout.hti);
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
        getCompositeDisposable().LIZ(new C11IW(c938230aWTLIZJ.LJ.LJJIL(new InterfaceC19483011Ki() { // from class: X.0aZe
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return !((List) obj).isEmpty();
            }
        }).LJLIIL(1L).LJJIJIIJIL(new AfS184S0100000_15(this, 226))).LJIILL().LJIIZILJ());
        getCompositeDisposable().LIZ(new C11IW(C11NZ.LJIIJJI(C937310aUz.LIZ(c938230aWTLIZJ.LIZ), c938230aWTLIZJ.LIZJ.LJJIFFI(), this.LLJJIII, new InterfaceC953020auK() { // from class: X.0aZd
            @Override // X.InterfaceC953020auK
            public final Object LIZ(Object obj, Object obj2, Object obj3) {
                return new C11H7(obj, obj2, obj3);
            }
        }).LJJIJIIJIL(new AfS184S0100000_15(this, 227))).LJIILL().LJIIZILJ());
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJIJIL = null;
        getDataChannel().HQ2(this, MultiGuestKaraokePlayerChangeChannel.class, getPlayerChangeObserver());
        getDataChannel().HQ2(this, KaraokeModeStatusChannel.class, getStatusObserver());
        getDataChannel().HQ2(this, MultiGuestLayoutRenderV2.RoleChannel.class, getRoleObserver());
    }

    @Override // X.AbstractC939840aZ4
    public DataChannel getDataChannel() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC939840aZ4
    public EnumC939900aZA getElementType() {
        return EnumC939900aZA.KARAOKE;
    }

    @Override // X.AbstractC939840aZ4
    public Integer getExternalHiddenViewWidth() {
        return this.LLJILJIL;
    }

    public final LiveIconView LJIIJ(boolean z) {
        LiveIconView liveIconView;
        LiveIconView liveIconView2 = this.LLJILJILJ;
        if (liveIconView2 == null) {
            liveIconView2 = null;
            if (z && (liveIconView = (LiveIconView) LJI(R.id.pn2)) != null) {
                this.LLJILJILJ = liveIconView;
                return liveIconView;
            }
        }
        return liveIconView2;
    }

    public final void LJIIJJI(C940600aaI c940600aaI) {
        C917720ZzO.LIZ.getClass();
        if (!C917720ZzO.LIZJ()) {
            return;
        }
        if (Intrinsics.LJFF(c940600aaI.LIZJ, "onNewSongMsg") && C930540aK4.LIZLLL()) {
            return;
        }
        Long l = c940600aaI.LIZ;
        this.LLJI = c940600aaI.LIZIZ;
        if (Intrinsics.LJFF(l, getUserId()) && !Intrinsics.LJFF(this.LLJI, getUserId())) {
            this.LLJJIII.onNext(Boolean.FALSE);
        } else if (Intrinsics.LJFF(this.LLJI, getUserId())) {
            this.LLJJIII.onNext(Boolean.TRUE);
        }
    }

    public final void LJIIL(C11H7<List<Boolean>, Boolean, Boolean> c11h7) {
        List<Boolean> list = c11h7.LIZ;
        boolean zBooleanValue = c11h7.LIZIZ.booleanValue();
        boolean zBooleanValue2 = c11h7.LIZJ.booleanValue();
        if (getExternalHiddenViewWidth() == null && (!list.isEmpty()) && ((Boolean) C13LP.LJJJJZI(list)).booleanValue() && zBooleanValue && zBooleanValue2) {
            C12ES.LJIILL(0, this);
            LiveIconView liveIconViewLJIIJ = LJIIJ(true);
            if (liveIconViewLJIIJ != null) {
                liveIconViewLJIIJ.setIconAttr(R.attr.dcc);
            }
            LiveIconView liveIconViewLJIIJ2 = LJIIJ(true);
            if (liveIconViewLJIIJ2 != null) {
                C917650ZzH.LJFF(liveIconViewLJIIJ2);
                return;
            }
            return;
        }
        LiveIconView liveIconViewLJIIJ3 = LJIIJ(false);
        if (liveIconViewLJIIJ3 != null) {
            C917650ZzH.LJ(liveIconViewLJIIJ3);
        } else {
            C439101nJ.LJI(this);
        }
    }

    @Override // X.AbstractC939840aZ4
    public void setExternalHiddenViewWidth(Integer num) {
        C938220aWS c938220aWS;
        String str;
        List<Boolean> listLJLZ;
        Boolean boolLJLZ;
        Integer num2 = this.LLJILJIL;
        this.LLJILJIL = num;
        if (!Intrinsics.LJFF(num2, num) && (c938220aWS = this.LLJ.get()) != null) {
            PosIdentity posIdentity = getWindow().getPosIdentity();
            if (posIdentity == null || posIdentity.type != 1 || (str = posIdentity.value) == null) {
                str = "";
            }
            C938230aWT c938230aWTLIZJ = c938220aWS.LIZJ(str, false, false);
            if (c938230aWTLIZJ != null && (listLJLZ = c938230aWTLIZJ.LIZ.LJLZ()) != null && (boolLJLZ = c938230aWTLIZJ.LIZJ.LJLZ()) != null) {
                Boolean boolValueOf = Boolean.valueOf(boolLJLZ.booleanValue());
                Boolean boolLJLZ2 = this.LLJJIII.LJLZ();
                if (boolLJLZ2 != null) {
                    LJIIL(new C11H7<>(listLJLZ, boolValueOf, Boolean.valueOf(boolLJLZ2.booleanValue())));
                }
            }
        }
    }

    public C940130aZX(Context context, C957020b0m c957020b0m, DataChannel dataChannel, WeakReference weakReference) {
        super(context, dataChannel, c957020b0m, null);
        this.LLIZLLLIL = dataChannel;
        this.LLJ = weakReference;
        this.LLJILLL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1116));
        this.LLJJ = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1128));
        this.LLJJI = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1123));
        C11PQ<Boolean> c11pq = new C11PQ<>();
        c11pq.onNext(Boolean.FALSE);
        this.LLJJIII = c11pq;
    }
}
