package X;

import Y.ARunnableS94S0200000_25;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import ln3.a;

/* JADX INFO: renamed from: X.0sO4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624940sO4 implements InterfaceC1637800sio {
    public final InterfaceC1650230t2r LIZ;
    public final boolean LIZIZ;
    public final C01GW<a> LIZJ;
    public final a LIZLLL;
    public final InterfaceC1644770su3 LJ;
    public final C01GW<InterfaceC1644770su3> LJFF;
    public final InterfaceC1625000sOA LJI;
    public final ShortVideoContext LJII;
    public final C560530Lyd<AbstractC1881107Yj> LJIIIIZZ;
    public final C19EG LJIIIZ;
    public final LifecycleOwner LJIIJ;
    public final SafeHandler LJIIJJI;
    public FilterBean LJIIL;

    @Override // X.InterfaceC1637800sio
    public final void i() {
        this.LJIIIIZZ.LJIIJ(new AbstractC1881107Yj() { // from class: X.07Yl
        });
    }

    @Override // X.InterfaceC1637800sio
    public final void m() {
        this.LJIIIIZZ.LJIIJ(new AbstractC1881107Yj() { // from class: X.07Yk
        });
    }

    @Override // X.InterfaceC1637800sio
    public final void j(final Effect effect) {
        this.LJIIIIZZ.LJIIJ(new AbstractC1881107Yj(effect) { // from class: X.07Yh
            public final Effect LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1880907Yh) && Intrinsics.LJFF(this.LIZ, ((C1880907Yh) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("GameReset(gameSticker=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = effect;
            }
        });
        this.LJI.vS0().LIZIZ(effect, true);
    }

    @Override // X.InterfaceC1637800sio
    public final void k(Effect effect) {
        this.LJIIJJI.post(new ARunnableS94S0200000_25(this, effect, 13));
    }

    @Override // X.InterfaceC1637800sio
    public final void l(final Effect effect) {
        FilterBean filterBean;
        InterfaceC1644770su3 value;
        this.LJIIIIZZ.LJIIJ(new AbstractC1881107Yj(effect) { // from class: X.07Yg
            public final Effect LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1880807Yg) && Intrinsics.LJFF(this.LIZ, ((C1880807Yg) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("GameEnd(gameSticker=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = effect;
            }
        });
        if (C1624010sMZ.LIZJ(this.LJI)) {
            this.LIZ.Zl0(new C1663770tOh(false, false, false));
        } else {
            this.LIZ.Zl0(new C1663770tOh(true, false, false));
        }
        View viewFindViewById = this.LJIIIZ.findViewById(R.id.mfh);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        View viewFindViewById2 = this.LJIIIZ.findViewById(R.id.mb4);
        if (viewFindViewById2 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        }
        if (C1624200sMs.LJIIIIZZ(effect) && (filterBean = this.LJIIL) != null) {
            if (this.LIZIZ) {
                C01GW<InterfaceC1644770su3> c01gw = this.LJFF;
                if (c01gw != null && (value = c01gw.getValue()) != null) {
                    value.MO(filterBean, null, false, false, false, true);
                    return;
                }
                return;
            }
            InterfaceC1644770su3 interfaceC1644770su3 = this.LJ;
            if (interfaceC1644770su3 == null) {
                return;
            }
            interfaceC1644770su3.MO(filterBean, null, false, false, false, true);
        }
    }

    public C1624940sO4(C1DRG c1drg, InterfaceC1650230t2r interfaceC1650230t2r, boolean z, C1624850sNv c1624850sNv, a aVar, InterfaceC1644770su3 interfaceC1644770su3, C1624860sNw c1624860sNw, InterfaceC1625000sOA interfaceC1625000sOA, ShortVideoContext shortVideoContext, C560530Lyd c560530Lyd) {
        this.LIZ = interfaceC1650230t2r;
        this.LIZIZ = z;
        this.LIZJ = c1624850sNv;
        this.LIZLLL = aVar;
        this.LJ = interfaceC1644770su3;
        this.LJFF = c1624860sNw;
        this.LJI = interfaceC1625000sOA;
        this.LJII = shortVideoContext;
        this.LJIIIIZZ = c560530Lyd;
        this.LJIIIZ = (C19EG) c1drg.LJII(C19EG.class, null);
        LifecycleOwner lifecycleOwner = (LifecycleOwner) c1drg.LJII(LifecycleOwner.class, null);
        this.LJIIJ = lifecycleOwner;
        this.LJIIJJI = new SafeHandler(lifecycleOwner);
    }
}
