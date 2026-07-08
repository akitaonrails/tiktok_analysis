package X;

import Y.ACListenerS159S0100000_25;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;

/* JADX INFO: renamed from: X.0t01, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1648470t01 {
    public final C1650090t2d LIZ = new C1650090t2d();

    public C1648470t01(final C19EG c19eg, final InterfaceC1650230t2r interfaceC1650230t2r, final InterfaceC1648570t0B interfaceC1648570t0B, final ViewOnTouchListenerC1649580t1o viewOnTouchListenerC1649580t1o, final ACListenerS159S0100000_25 aCListenerS159S0100000_25) {
        viewOnTouchListenerC1649580t1o.setRecordListener(new InterfaceC1649610t1r() { // from class: X.0t00
            public boolean LL = true;

            @Override // X.InterfaceC1649610t1r
            public final void Lk() {
            }

            @Override // X.InterfaceC1649610t1r
            public final boolean ja() {
                return false;
            }

            @Override // X.InterfaceC1649610t1r
            public final void Kf() {
                C1650090t2d c1650090t2d = this.LLIZ.LIZ;
                long jCurrentTimeMillis = System.currentTimeMillis() - viewOnTouchListenerC1649580t1o.getActionDownTime();
                c1650090t2d.getClass();
                c1650090t2d.LIZ(-1, jCurrentTimeMillis, "click_record", false);
            }

            @Override // X.InterfaceC1649610t1r
            public final boolean O0() {
                if (c19eg == null) {
                    return false;
                }
                return C1448730nnr.LIZ(interfaceC1650230t2r, c19eg);
            }

            @Override // X.InterfaceC1649610t1r
            public final void Q2() {
                if (C1448790nnx.LIZ) {
                    C1448790nnx.LIZ = false;
                    C1448790nnx.LIZJ("record_start");
                }
                interfaceC1648570t0B.l60(null);
            }

            @Override // X.InterfaceC1649610t1r
            public final void bw() {
                aCListenerS159S0100000_25.onClick(viewOnTouchListenerC1649580t1o);
            }

            @Override // X.InterfaceC1649610t1r
            public final void oH() {
                interfaceC1648570t0B.h81(new C1644050sst("record end"));
            }

            @Override // X.InterfaceC1649610t1r
            public final void p2() {
                viewOnTouchListenerC1649580t1o.setCurrentScaleMode(0);
                interfaceC1650230t2r.j8();
            }

            @Override // X.InterfaceC1649610t1r
            public final void rO(float f) {
                if (this.LL && f >= 0.0f) {
                    ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) C1659630tI1.LIZLLL(viewOnTouchListenerC1649580t1o).get(ShortVideoContextViewModel.class)).LL;
                    if (shortVideoContext != null) {
                        C1403170mcN.LIZIZ(1, shortVideoContext.getCreationId(), shortVideoContext.shootWay, "press_record_button");
                    }
                    this.LL = false;
                }
                viewOnTouchListenerC1649580t1o.setHasBeenMoveScaled(true);
                interfaceC1650230t2r.Kg1(f, viewOnTouchListenerC1649580t1o.getY());
            }

            @Override // X.InterfaceC1649610t1r
            public final void y2(EnumC1448830no1 enumC1448830no1) {
                if (((ShortVideoContextViewModel) ViewModelProviders.of(c19eg).get(ShortVideoContextViewModel.class)).vQ2()) {
                    return;
                }
                interfaceC1648570t0B.oa0(new C1448290nn9(enumC1448830no1), false);
            }
        });
    }
}
