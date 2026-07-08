package X;

import Y.ARunnableS48S0300000_15;
import Y.ARunnableS84S0200000_15;
import Y.AfS184S0100000_15;
import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.MultiGuestLayoutRenderV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.settings.MultiGuestBorderViewLeakFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestEnableCoroutineOptSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aar, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940950aar extends AbstractC939840aZ4 {
    public final DataChannel LLIZLLLIL;
    public final WeakReference<C938220aWS> LLJ;
    public final FrameLayout LLJI;
    public final InterfaceC920220a3Q LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public View LLJILLL;
    public C416040GTa LLJJ;
    public boolean LLJJI;
    public final List<Runnable> LLJJIII;
    public final C11PQ<Boolean> LLJJIJI;

    /* JADX INFO: renamed from: getLayoutId, reason: collision with other method in class */
    public Void m46getLayoutId() {
        return null;
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        View view;
        String str;
        C938220aWS c938220aWS;
        C938230aWT c938230aWTLIZJ;
        this.LLJJI = true;
        super.onAttachedToWindow();
        if (LJIIIZ()) {
            C937310aUz.LJII(getRealTag(), "onAttachedToWindow needUseOptBorder");
            C416040GTa c416040GTa = new C416040GTa(getContext());
            C439101nJ.LJI(c416040GTa);
            LJIIJJI();
            this.LLJJ = c416040GTa;
        } else {
            C937310aUz.LJII(getRealTag(), "onAttachedToWindow not needUseOptBorder");
            this.LLJILLL = LJI(R.id.jai);
            if (getWindow().getShapeDescriptor().LIZIZ > 0 && (view = this.LLJILLL) != null) {
                C936720aU2.LIZLLL(view, C20736316Cj.LIZIZ(R.attr.fxy, getContext()), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))), getWindow().getShapeDescriptor().LIZIZ);
            }
        }
        getDataChannel().BQ2(this, MultiGuestLayoutRenderV2.SwitchLayoutEvent.class, getSwitchLayoutObserver());
        PosIdentity posIdentity = getWindow().getPosIdentity();
        if (posIdentity != null && posIdentity.type == 2) {
            LJIIJ(false);
            View view2 = LJIIIZ() ? this.LLJJ : this.LLJILLL;
            if (view2 != null) {
                setNormalBorderBg(view2);
                return;
            }
            return;
        }
        PosIdentity posIdentity2 = getWindow().getPosIdentity();
        if (posIdentity2 != null && posIdentity2.type == 1 && (str = posIdentity2.value) != null && (c938220aWS = this.LLJ.get()) != null && (c938230aWTLIZJ = c938220aWS.LIZJ(str, false, false)) != null) {
            getCompositeDisposable().LIZ(C937310aUz.LJI(new C11IW(C11NZ.LJIIIZ(C937310aUz.LIZ(c938230aWTLIZJ.LIZ), C937310aUz.LIZ(c938230aWTLIZJ.LJIILIIL), c938230aWTLIZJ.LIZJ.LJJIFFI(), c938230aWTLIZJ.LJ.LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0aXW
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    List list = (List) obj;
                    if (list.isEmpty()) {
                        return C13BV.INSTANCE;
                    }
                    return C1697810uHb.LJIILJJIL(Long.valueOf(((C2262071DgL) C13LP.LJJJJZI(list)).getId()));
                }
            }).LJJII(new InterfaceC1627390sS1() { // from class: X.0aas
                @Override // X.InterfaceC1627390sS1
                public final boolean test(Object obj, Object obj2) {
                    return Intrinsics.LJFF(C13LP.LJJJLL((List) obj), C13LP.LJJJLL((List) obj2));
                }
            }), C937310aUz.LIZ(c938230aWTLIZJ.LIZIZ), new InterfaceC1627660sSS<T1, T2, T3, T4, T5, R>() { // from class: X.0sSQ
                @Override // X.InterfaceC1627660sSS
                public final R LIZ(T1 t1, T2 t2, T3 t3, T4 t4, T5 t52) {
                    return (R) new C11H2(t1, t2, t3, t4, t52);
                }
            }).LJJIJIIJIL(new AfS184S0100000_15(this, 233))), getRealTag(), "combineLatest").LJIILL().LJIIZILJ());
        }
        getCompositeDisposable().LIZ(new C11IW(this.LLJJIJI.LJJIFFI().LJJIJIIJIL(new AfS184S0100000_15(this, 234))).LJIILL().LJIIZILJ());
    }

    private final Function1<Unit, Unit> getSwitchLayoutObserver() {
        return (Function1) this.LLJILJILJ.getValue();
    }

    private final C941290abP getTalkVolumeWaveHandler() {
        return (C941290abP) this.LLJILJIL.getValue();
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (this.LLJJI) {
            C937310aUz.LJII(getRealTag(), "onDetachedFromWindow");
            this.LLJJI = false;
            Iterator<Runnable> it2 = this.LLJJIII.iterator();
            while (it2.hasNext()) {
                HandlerHook.viewRemoveCallbacks(this.LLJI, it2.next());
            }
            ((ArrayList) this.LLJJIII).clear();
            C416040GTa c416040GTa = this.LLJJ;
            if (MultiGuestBorderViewLeakFixSetting.INSTANCE.getValue()) {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS84S0200000_15(this, c416040GTa, 80));
            } else {
                HandlerHook.viewPost(this.LLJI, new ARunnableS84S0200000_15(this, c416040GTa, 81));
            }
            getTalkVolumeWaveHandler().LJI();
            this.LLJJ = null;
            super.onDetachedFromWindow();
        }
    }

    public final boolean LJIIIZ() {
        InterfaceC940060aZQ layoutManager = getLayoutManager();
        return (layoutManager == null || layoutManager.LLIIZ()) ? false : true;
    }

    public final void LJIIJJI() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        FrameLayout frameLayoutLL;
        InterfaceC940060aZQ layoutManager = getLayoutManager();
        ViewGroup.LayoutParams layoutParams = (layoutManager == null || (frameLayoutLL = layoutManager.LL()) == null) ? null : frameLayoutLL.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return;
        }
        Rect rect = getWindow().getShapeDescriptor().LIZ;
        String realTag = getRealTag();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateBorderViewV2 windowRect=");
        sbLIZ.append(rect);
        C937310aUz.LJII(realTag, C2188811AlT.LIZIZ(sbLIZ));
        Rect rect2 = new Rect();
        rect2.left = marginLayoutParams.getMarginStart();
        rect2.top = marginLayoutParams.topMargin;
        rect2.right = marginLayoutParams.getMarginStart() + marginLayoutParams.width;
        rect2.bottom = marginLayoutParams.topMargin + marginLayoutParams.height;
        String realTag2 = getRealTag();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateBorderViewV2 containerRect=");
        sbLIZ2.append(rect2);
        C937310aUz.LJII(realTag2, C2188811AlT.LIZIZ(sbLIZ2));
        Rect rect3 = new Rect();
        int i = rect2.left + rect.left;
        rect3.left = i;
        rect3.top = rect2.top + rect.top;
        rect3.right = i + rect.width();
        rect3.bottom = rect3.top + rect.height();
        String realTag3 = getRealTag();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("updateBorderViewV2 outerRect=");
        sbLIZ3.append(rect3);
        C937310aUz.LJII(realTag3, C2188811AlT.LIZIZ(sbLIZ3));
        ARunnableS48S0300000_15 aRunnableS48S0300000_15 = new ARunnableS48S0300000_15(this, rect3, rect2, 14);
        ((ArrayList) this.LLJJIII).add(aRunnableS48S0300000_15);
        try {
            if (!LiveSdkMultiGuestEnableCoroutineOptSetting.isEnable()) {
                HandlerHook.viewPost(this.LLJI, aRunnableS48S0300000_15);
            } else {
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C807420Vls(this, aRunnableS48S0300000_15, null), 3);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String realTag4 = getRealTag();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("updateBorderViewV2 error=");
            sbLIZ4.append(e);
            C937310aUz.LJFF(realTag4, C2188811AlT.LIZIZ(sbLIZ4));
        }
    }

    public final int getCornerRadius() {
        return getWindow().getShapeDescriptor().LIZIZ;
    }

    public final float getCurrentCornerRadiusOfAudience() {
        return getCornerRadius();
    }

    @Override // X.AbstractC939840aZ4
    public /* bridge */ /* synthetic */ Integer getLayoutId() {
        return (Integer) m46getLayoutId();
    }

    @Override // X.AbstractC939840aZ4
    public Integer getLayoutIdLazy() {
        return Integer.valueOf(R.layout.htf);
    }

    @Override // X.AbstractC939840aZ4
    public DataChannel getDataChannel() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC939840aZ4
    public EnumC939900aZA getElementType() {
        return EnumC939900aZA.BORDER;
    }

    public final void LJIIJ(boolean z) {
        if (LJIIIZ()) {
            if (z) {
                C416040GTa c416040GTa = this.LLJJ;
                if (c416040GTa != null) {
                    C12ES.LJIILL(0, c416040GTa);
                }
            } else if (C937310aUz.LIZJ(this.LLJIJIL)) {
                C416040GTa c416040GTa2 = this.LLJJ;
                if (c416040GTa2 != null) {
                    C12ES.LJIILL(0, c416040GTa2);
                }
            } else {
                C416040GTa c416040GTa3 = this.LLJJ;
                if (c416040GTa3 != null) {
                    C439101nJ.LJI(c416040GTa3);
                }
            }
            View view = this.LLJILLL;
            if (view != null) {
                C439101nJ.LJI(view);
                return;
            }
            return;
        }
        if (z) {
            View view2 = this.LLJILLL;
            if (view2 == null) {
                return;
            }
            C12ES.LJIILL(0, view2);
            return;
        }
        if (C937310aUz.LIZJ(this.LLJIJIL)) {
            View view3 = this.LLJILLL;
            if (view3 == null) {
                return;
            }
            C12ES.LJIILL(0, view3);
            return;
        }
        View view4 = this.LLJILLL;
        if (view4 == null) {
            return;
        }
        C439101nJ.LJI(view4);
    }

    public final void setNormalBorderBg(View view) {
        int iLIZIZ;
        if (LJII()) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(1.0f)));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(1.5f)));
        }
        C936720aU2.LIZLLL(view, C20736316Cj.LIZIZ(R.attr.ewy, view.getContext()), iLIZIZ, getCornerRadius());
    }

    public final void setTalkVolumeBorderBg(View view) {
        int iLIZIZ;
        if (LJII()) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(1.0f)));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(1.5f)));
        }
        C936720aU2.LIZLLL(view, C20736316Cj.LIZIZ(R.attr.eut, view.getContext()), iLIZIZ, getCornerRadius());
    }

    public final void LJIIL(int i, long j) {
        int i2;
        String str;
        if (getTalkVolumeWaveHandler().LJFF(i, new AwS559S0100000_15(this, 1141))) {
            this.LLJJIJI.onNext(Boolean.TRUE);
            LJIIJ(true);
            EnumC934000aPe enumC934000aPeLIZIZ = C937310aUz.LIZIZ(getDataChannel());
            if (enumC934000aPeLIZIZ == null) {
                i2 = -1;
            } else {
                i2 = C939390aYL.LIZ[enumC934000aPeLIZIZ.ordinal()];
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    str = "guest";
                } else {
                    str = "viewer";
                }
            } else {
                str = "anchor";
            }
            C934650aQh c934650aQh = new C934650aQh(str, 300000L);
            c934650aQh.LIZLLL = j;
            c934650aQh.LJ = "guest";
            C934640aQg.LIZIZ(c934650aQh);
        }
    }

    public C940950aar(Context context, DataChannel dataChannel, WeakReference<C938220aWS> weakReference, C957020b0m c957020b0m, FrameLayout frameLayout, InterfaceC920220a3Q interfaceC920220a3Q, InterfaceC940060aZQ interfaceC940060aZQ) {
        super(context, dataChannel, c957020b0m, interfaceC940060aZQ);
        this.LLIZLLLIL = dataChannel;
        this.LLJ = weakReference;
        this.LLJI = frameLayout;
        this.LLJIJIL = interfaceC920220a3Q;
        this.LLJILJIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(464));
        this.LLJILJILJ = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1126));
        this.LLJJIII = new ArrayList();
        this.LLJJIJI = C11PQ.LJLLLLLL(Boolean.FALSE);
    }
}
