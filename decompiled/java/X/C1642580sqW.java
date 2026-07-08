package X;

import Y.ACListenerS159S0100000_25;
import Y.AObserverS227S0100000_25;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0sqW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1642580sqW implements InterfaceC1642220spw {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final ViewGroup LIZ;
    public final LifecycleOwner LIZIZ;
    public final InterfaceC1642570sqV LIZJ;
    public C1642630sqb LIZLLL;
    public C1645880svq LJ;
    public Toast LJII;
    public final C11RK LJFF = new C11RK();
    public final C11RK LJI = new C11RK();
    public final C1642560sqU LJIIIIZZ = new InterfaceC1642660sqe() { // from class: X.0sqU
        @Override // X.InterfaceC1642660sqe
        public final void LIZIZ(C1639880smA c1639880smA) {
            C1642580sqW c1642580sqW = this.LIZ;
            InterfaceC1642570sqV interfaceC1642570sqV = c1642580sqW.LIZJ;
            if (interfaceC1642570sqV != null) {
                interfaceC1642570sqV.iJ0(c1639880smA);
            }
            c1642580sqW.LJI.onNext(new C1641830spJ(EnumC1642540sqS.BUILTIN_CLICK, c1639880smA));
        }

        @Override // X.InterfaceC1642660sqe
        public final void LIZ(C1639880smA c1639880smA, boolean z) {
            C1642580sqW c1642580sqW = this.LIZ;
            InterfaceC1642570sqV interfaceC1642570sqV = c1642580sqW.LIZJ;
            if (interfaceC1642570sqV != null) {
                interfaceC1642570sqV.Jb0(c1639880smA);
            }
            if (z) {
                c1642580sqW.LJI.onNext(new C1641830spJ(EnumC1642540sqS.REMOVE, c1639880smA));
            }
        }

        @Override // X.InterfaceC1642660sqe
        public final void LIZJ(C1639880smA c1639880smA, boolean z) {
            C1642580sqW c1642580sqW = this.LIZ;
            InterfaceC1642570sqV interfaceC1642570sqV = c1642580sqW.LIZJ;
            if (interfaceC1642570sqV != null) {
                interfaceC1642570sqV.iJ0(c1639880smA);
            }
            if (z) {
                c1642580sqW.LJI.onNext(new C1641830spJ(EnumC1642540sqS.INSERT, c1639880smA));
            }
        }
    };

    static {
        new Object() { // from class: X.0sqX
        };
    }

    @Override // X.InterfaceC1642220spw
    public final void show() {
        this.LJII = null;
        InterfaceC1642570sqV interfaceC1642570sqV = this.LIZJ;
        if (interfaceC1642570sqV != null) {
            interfaceC1642570sqV.refreshData();
        }
        C1645880svq c1645880svq = this.LJ;
        (c1645880svq != null ? c1645880svq : null).show();
    }

    @Override // X.InterfaceC1642220spw
    public final C19475711Hn LIZ() {
        C11RK c11rk = this.LJFF;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC1642220spw
    public final void hide() {
        InterfaceC1642570sqV interfaceC1642570sqV = this.LIZJ;
        if (interfaceC1642570sqV != null) {
            interfaceC1642570sqV.Df(new AwS569S0100000_25(this, 154));
        }
        C1645880svq c1645880svq = this.LJ;
        if (c1645880svq == null) {
            c1645880svq = null;
        }
        c1645880svq.hide();
        C1642630sqb c1642630sqb = this.LIZLLL;
        (c1642630sqb != null ? c1642630sqb : null).setCategoryMap(C13BV.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0sqU] */
    public C1642580sqW(ViewGroup viewGroup, LifecycleOwner lifecycleOwner, FilterBoxViewModel filterBoxViewModel, C1642610sqZ c1642610sqZ) {
        this.LIZ = viewGroup;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = filterBoxViewModel;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.tt, viewGroup, false);
        viewGroup.addView(viewTd);
        C1642630sqb c1642630sqb = (C1642630sqb) viewTd.findViewById(R.id.hx_);
        this.LIZLLL = c1642630sqb;
        (c1642630sqb == null ? null : c1642630sqb).setFilterBoxViewConfigure(c1642610sqZ);
        this.LJ = new C1645880svq(viewTd, viewTd.findViewById(R.id.w4x));
        C786410Ut5.I7(new ACListenerS159S0100000_25(this, 66), viewTd.findViewById(R.id.w7p));
        C1645880svq c1645880svq = this.LJ;
        (c1645880svq != null ? c1645880svq : null).V0();
        LifecycleOwner lifecycleOwner2 = this.LIZIZ;
        MutableLiveData<Pair<EnumC1642120spm, C1639800sm2>> mutableLiveData = filterBoxViewModel.LLILLL;
        if (mutableLiveData != null) {
            mutableLiveData.observe(lifecycleOwner2, new AObserverS227S0100000_25(this, 116));
        }
    }
}
