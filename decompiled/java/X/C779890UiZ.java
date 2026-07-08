package X;

import android.view.View;
import android.view.WindowManager;
import com.bytedance.android.livesdk.game.broadcast.bgbroadcast.ConstraintFloatWindowLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.GameFloatTipsOptimize;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS413S0200000_12;

/* JADX INFO: renamed from: X.0UiZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779890UiZ extends C779870UiX {
    public boolean LIZLLL;
    public final /* synthetic */ C779880UiY LJ;

    @Override // X.C779870UiX
    public final void LIZIZ() {
        C779330Uhf c779330Uhf = this.LJ.LIZJ;
        if (c779330Uhf != null) {
            c779330Uhf.LJIILL();
        }
        C779880UiY c779880UiY = this.LJ;
        C780030Uin c780030Uin = c779880UiY.LJJ;
        if (c780030Uin != null) {
            c780030Uin.LJIIIIZZ = false;
        }
        C779260UhY c779260UhY = c779880UiY.LJFF;
        if (c779260UhY != null) {
            c779260UhY.LJIIIIZZ();
        }
        C780040Uio c780040Uio = this.LJ.LJJI;
        if (c780040Uio != null) {
            c780040Uio.LIZLLL = true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C779890UiZ(C779880UiY c779880UiY) {
        super(c779880UiY, "snappedState");
        this.LJ = c779880UiY;
        this.LIZLLL = true;
    }

    @Override // X.C779870UiX
    public final void LIZ(C779870UiX c779870UiX) {
        C778030UfZ c778030UfZ;
        View view;
        C779880UiY c779880UiY = this.LJ;
        C780040Uio c780040Uio = c779880UiY.LJJI;
        if (c780040Uio != null) {
            c780040Uio.LIZLLL = false;
        }
        c779880UiY.LJJIII.LJIIJJI();
        this.LJ.LJJIIJ.LJIIIIZZ();
        this.LJ.LJJIIJZLJL.LJIIIIZZ();
        C779880UiY c779880UiY2 = this.LJ;
        C780030Uin c780030Uin = c779880UiY2.LJJ;
        if (c780030Uin != null) {
            c780030Uin.LJIIIIZZ = true;
        }
        if (c779880UiY2.LJIIJJI.LIZJ) {
            c778030UfZ = c779880UiY2.LJ;
        } else {
            c778030UfZ = c779880UiY2.LIZ;
        }
        c779880UiY2.LJIIL(c778030UfZ);
        ConstraintFloatWindowLayout constraintFloatWindowLayout = this.LJ.LJJIFFI;
        if (constraintFloatWindowLayout != null) {
            C779160UhO c779160UhO = c778030UfZ.LIZ;
            if (c779160UhO != null) {
                view = c779160UhO.LIZLLL;
            } else {
                view = null;
            }
            constraintFloatWindowLayout.LIZIZ(view, true);
        }
        LJFF(this, false, new AwS413S0200000_12(this, c779870UiX, 66), 1);
        Iterator it2 = ((ArrayList) this.LJ.LJIIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC780000Uik) it2.next()).LIZLLL();
        }
    }

    @Override // X.C779870UiX
    public final boolean LIZJ(EnumC779790UiP enumC779790UiP) {
        int iLIZ;
        AbstractC777950UfR abstractC777950UfRLJII;
        int i = C779810UiR.LIZ[enumC779790UiP.ordinal()];
        if (i != 1) {
            EnumC777930UfP enumC777930UfPLIZJ = null;
            if (i != 2) {
                if (i != 3) {
                    return super.LIZJ(enumC779790UiP);
                }
                if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                    InterfaceC779960Uig interfaceC779960Uig = this.LJ.LIZLLL;
                    if (interfaceC779960Uig != null && (abstractC777950UfRLJII = interfaceC779960Uig.LJII()) != null) {
                        enumC777930UfPLIZJ = abstractC777950UfRLJII.LIZJ();
                    }
                    if (enumC777930UfPLIZJ == EnumC777930UfP.PRIORITY_TYPE_P0 || enumC777930UfPLIZJ == EnumC777930UfP.PRIORITY_TYPE_P1) {
                        return true;
                    }
                } else {
                    InterfaceC779960Uig interfaceC779960Uig2 = this.LJ.LIZLLL;
                    if (interfaceC779960Uig2 != null && interfaceC779960Uig2.LJIIJ() == 0) {
                        return true;
                    }
                    InterfaceC779960Uig interfaceC779960Uig3 = this.LJ.LIZLLL;
                    if (interfaceC779960Uig3 != null && interfaceC779960Uig3.LJIIJ() == 1) {
                        return true;
                    }
                }
                InterfaceC772390URp.z0.LJFF(Boolean.FALSE);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_ingame_overlay_absorbed_guide_show");
                c474500IjALIZ.LJJII(this.LJ.LJIJJLI.getValue(), "anchor_id");
                c474500IjALIZ.LJJII(Long.valueOf(((Number) this.LJ.LJIJJ.getValue()).longValue()), "room_id");
                c474500IjALIZ.LJJII("screen_share", "live_type");
                c474500IjALIZ.LIZ();
                InterfaceC779960Uig interfaceC779960Uig4 = this.LJ.LIZLLL;
                if (interfaceC779960Uig4 != null) {
                    interfaceC779960Uig4.init();
                }
                InterfaceC779960Uig interfaceC779960Uig5 = this.LJ.LIZLLL;
                if (interfaceC779960Uig5 != null) {
                    interfaceC779960Uig5.hide();
                }
                if (!this.LJ.LJJIII.LJ) {
                    boolean zLJJ = C497740JfY.LJJ();
                    int i2 = 8388613;
                    if (this.LIZLLL) {
                        if (zLJJ) {
                            iLIZ = C439101nJ.LIZ(10);
                            i2 = 8388611;
                        } else {
                            iLIZ = C439101nJ.LIZ(10);
                        }
                    } else if (zLJJ) {
                        iLIZ = C439101nJ.LIZ(-10);
                    } else {
                        iLIZ = C439101nJ.LIZ(-10);
                        i2 = 8388611;
                    }
                    C785230UrB c785230UrB = new C785230UrB(this.LJ.LJJIII.LIZLLL);
                    c785230UrB.LJIJJ = C497740JfY.LJIJI(2131843719);
                    c785230UrB.LJIIIIZZ = Mp4ScreenVideoLoadTimeout.CONTROL;
                    c785230UrB.LJIIIZ = true;
                    c785230UrB.LJI = iLIZ;
                    c785230UrB.LJFF = i2;
                    c785230UrB.LJIIZILJ = false;
                    c785230UrB.LJIJ = true;
                    C785270UrF c785270UrF = new C785270UrF(c785230UrB);
                    C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                    C1119700fFA.LIZIZ(c785270UrF);
                    return true;
                }
            } else {
                this.LJ.LJIILL();
                LJFF(this, true, null, 2);
            }
            return true;
        }
        C779880UiY c779880UiY = this.LJ;
        if (c779880UiY.LJIIJJI.LIZJ) {
            C779880UiY.LJIILIIL(c779880UiY, c779880UiY.LJJIJIL);
            return true;
        }
        C779880UiY.LJIILIIL(c779880UiY, c779880UiY.LJJIJIIJIL);
        return true;
    }

    public static void LJFF(C779890UiZ c779890UiZ, boolean z, AwS413S0200000_12 awS413S0200000_12, int i) {
        int iLIZ;
        int measuredWidth;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            awS413S0200000_12 = null;
        }
        C779330Uhf c779330Uhf = c779890UiZ.LJ.LIZJ;
        if (c779330Uhf != null) {
            iLIZ = c779330Uhf.LJIIIIZZ;
        } else {
            iLIZ = C439101nJ.LIZ(2);
        }
        C780040Uio c780040Uio = c779890UiZ.LJ.LJJI;
        if (c780040Uio != null) {
            Integer numValueOf = Integer.valueOf(c780040Uio.LJ);
            C779880UiY c779880UiY = c779890UiZ.LJ;
            if (numValueOf.intValue() == 2) {
                c779890UiZ.LIZLLL = false;
                int iLIZIZ = C779350Uhh.LIZIZ() - iLIZ;
                View view = c779880UiY.LJJIII.LIZLLL;
                if (view != null) {
                    measuredWidth = view.getMeasuredWidth();
                } else {
                    measuredWidth = 0;
                }
                iLIZ = iLIZIZ - measuredWidth;
            } else {
                c779890UiZ.LIZLLL = true;
            }
            C779260UhY c779260UhY = c779880UiY.LJFF;
            if (c779260UhY != null) {
                boolean z2 = c779890UiZ.LIZLLL;
                C19O5 c19o5 = new C19O5(c779260UhY.LIZLLL);
                c19o5.LIZIZ(1);
                c19o5.LIZIZ(2);
                if (z2) {
                    c779260UhY.LJIILL(1);
                    c19o5.LIZ(1, R.id.myd, 1, 0);
                } else {
                    c779260UhY.LJIILL(2);
                    c19o5.LIZ(2, R.id.myd, 2, 0);
                }
            }
            if (z) {
                c779880UiY.LIZ.LIZ.LJIILIIL(iLIZ, c779880UiY.LJIJI);
                c779880UiY.LJII();
            } else {
                C778030UfZ c778030UfZ = c779880UiY.LIZ;
                C779880UiY.LJIILJJIL(c778030UfZ, ((WindowManager.LayoutParams) c778030UfZ.LIZ.LIZJ).x, iLIZ, new AwS413S0200000_12((Function0) awS413S0200000_12, (Function0<Unit>) c779880UiY, (C779880UiY) 67));
            }
        }
    }
}
