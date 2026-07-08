package X;

import Y.ARunnableS119S0100000_19;
import Y.AsS46S0100000_19;
import android.view.animation.Interpolator;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ix5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262250ix5 implements InterfaceC1262800ixy, InterfaceC19341710lj {
    public static final Interpolator LLJIJIL = C1619980sG4.LJ();
    public boolean LL;
    public boolean LLILLJJLI;
    public C1262300ixA LLILLL;
    public final List<InterfaceC1261750iwH> LLILZ = new ArrayList();
    public C1262970iyF LLILZIL;
    public AbstractC1262620ixg LLILZLL;
    public C1749280vcc LLIZ;
    public TuxSkeletonLayout LLIZLLLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;
    public C481090Itn LLJI;

    @Override // X.InterfaceC1262800ixy, X.InterfaceC1262810ixz
    public final void LJI(AbstractC1264080j02<C1261860iwS> abstractC1264080j02) {
    }

    @Override // X.InterfaceC1262800ixy
    public final void LIZLLL() {
        C1262300ixA c1262300ixA = this.LLILLL;
        if (c1262300ixA == null) {
            c1262300ixA = null;
        }
        C1722300uv6 c1722300uv6 = c1262300ixA.uiConfig.LJIILJJIL;
        if (c1722300uv6 != null) {
            C1749280vcc c1749280vcc = this.LLIZ;
            LIZJ(c1749280vcc != null ? c1749280vcc : null, c1722300uv6);
        }
    }

    @Override // X.InterfaceC1262810ixz
    public final void destroy() {
        C1262970iyF c1262970iyF = this.LLILZIL;
        if (c1262970iyF == null) {
            c1262970iyF = null;
        }
        c1262970iyF.destroy();
    }

    @Override // X.InterfaceC1262810ixz
    public final C1075800e6M getCurrentState() {
        C1262970iyF c1262970iyF = this.LLILZIL;
        return c1262970iyF != null ? c1262970iyF.getCurrentState() : new C1075800e6M(null, 7);
    }

    @Override // X.InterfaceC1262810ixz
    public final AbstractC21673719rz getItemAnimator() {
        "not supported itemAnimator".toString();
        throw new IllegalStateException("not supported itemAnimator");
    }

    @Override // X.InterfaceC1262800ixy
    public final AbstractC1262620ixg getLayout() {
        AbstractC1262620ixg abstractC1262620ixg = this.LLILZLL;
        if (abstractC1262620ixg == null) {
            return null;
        }
        return abstractC1262620ixg;
    }

    @Override // X.InterfaceC1262800ixy
    public final ViewOnAttachStateChangeListenerC20604515jv getPowerList() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJ;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            return null;
        }
        return viewOnAttachStateChangeListenerC20604515jv;
    }

    @Override // X.InterfaceC1262800ixy
    public final C1749280vcc getStatusView() {
        C1749280vcc c1749280vcc = this.LLIZ;
        if (c1749280vcc == null) {
            return null;
        }
        return c1749280vcc;
    }

    @Override // X.InterfaceC1262810ixz
    public final void reset() {
        C1262970iyF c1262970iyF = this.LLILZIL;
        if (c1262970iyF == null) {
            c1262970iyF = null;
        }
        c1262970iyF.reset();
    }

    @Override // X.InterfaceC19341710lj
    public final void LJFF() {
        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk = getCurrentState().LIZ;
        if (abstractC1623806Xk instanceof C1623706Xj) {
            return;
        }
        C1262970iyF c1262970iyF = this.LLILZIL;
        if (c1262970iyF == null) {
            c1262970iyF = null;
        }
        ((CopyOnWriteArraySet) c1262970iyF.LLIZLLLIL.LIZ().yQ2().LLJI).clear();
        if (!(abstractC1623806Xk instanceof C491101vh)) {
            LLFZ(false);
            return;
        }
        C1749280vcc c1749280vcc = this.LLIZ;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C786410Ut5.LJLLLLLL(8, c1749280vcc);
        C1262970iyF c1262970iyF2 = this.LLILZIL;
        (c1262970iyF2 != null ? c1262970iyF2 : null).LLFZ(false);
    }

    @Override // X.InterfaceC1262810ixz
    public final void Eg(InterfaceC1261750iwH interfaceC1261750iwH) {
        ((ArrayList) this.LLILZ).add(interfaceC1261750iwH);
        C1262970iyF c1262970iyF = this.LLILZIL;
        if (c1262970iyF == null) {
            c1262970iyF = null;
        }
        c1262970iyF.Eg(interfaceC1261750iwH);
    }

    public final void LIZ(boolean z) {
        boolean z2;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJ;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = null;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        int i = 0;
        if (viewOnAttachStateChangeListenerC20604515jv.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == z) {
            return;
        }
        C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("list view isVisible: ");
        sbLIZ.append(z);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1264320j0Q.getClass();
        C1264320j0Q.LIZLLL("LayoutController", strLIZIZ);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJ;
        if (viewOnAttachStateChangeListenerC20604515jv3 == null) {
            viewOnAttachStateChangeListenerC20604515jv3 = null;
        }
        if (!z) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewOnAttachStateChangeListenerC20604515jv3);
        C1262300ixA c1262300ixA = this.LLILLL;
        if (c1262300ixA == null) {
            c1262300ixA = null;
        }
        if (c1262300ixA.uiConfig.LJIJJ) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJ;
            if (viewOnAttachStateChangeListenerC20604515jv4 == null) {
                viewOnAttachStateChangeListenerC20604515jv4 = null;
            }
            C786410Ut5.s5(viewOnAttachStateChangeListenerC20604515jv4, 0.0f);
            if (z) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = this.LLJ;
                if (viewOnAttachStateChangeListenerC20604515jv5 != null) {
                    viewOnAttachStateChangeListenerC20604515jv2 = viewOnAttachStateChangeListenerC20604515jv5;
                }
                viewOnAttachStateChangeListenerC20604515jv2.animate().alpha(1.0f).setInterpolator(LLJIJIL).setDuration(400L).setStartDelay(400L).start();
            }
        }
    }

    public final void LIZIZ(boolean z) {
        C1262300ixA c1262300ixA = this.LLILLL;
        TuxSkeletonLayout tuxSkeletonLayout = null;
        C1749280vcc c1749280vcc = null;
        TuxSkeletonLayout tuxSkeletonLayout2 = null;
        if (c1262300ixA == null) {
            c1262300ixA = null;
        }
        Integer num = c1262300ixA.uiConfig.LIZIZ;
        if (this.LL != z && num != null) {
            C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("layout is loading: ");
            sbLIZ.append(z);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1264320j0Q.getClass();
            C1264320j0Q.LIZLLL("LayoutController", strLIZIZ);
            int i = 0;
            if (num.intValue() == 300) {
                C1749280vcc c1749280vcc2 = this.LLIZ;
                if (c1749280vcc2 == null) {
                    c1749280vcc2 = null;
                }
                if (!z) {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, c1749280vcc2);
                if (z) {
                    C1749280vcc c1749280vcc3 = this.LLIZ;
                    if (c1749280vcc3 != null) {
                        c1749280vcc = c1749280vcc3;
                    }
                    c1749280vcc.LJ();
                }
            } else if (num.intValue() == 301) {
                if (!z) {
                    ARunnableS119S0100000_19 aRunnableS119S0100000_19 = new ARunnableS119S0100000_19(this, 176);
                    C1262300ixA c1262300ixA2 = this.LLILLL;
                    if (c1262300ixA2 == null) {
                        c1262300ixA2 = null;
                    }
                    if (c1262300ixA2.uiConfig.LJIJJ) {
                        TuxSkeletonLayout tuxSkeletonLayout3 = this.LLIZLLLIL;
                        if (tuxSkeletonLayout3 != null) {
                            tuxSkeletonLayout2 = tuxSkeletonLayout3;
                        }
                        tuxSkeletonLayout2.animate().alpha(0.0f).setDuration(400L).setInterpolator(LLJIJIL).withEndAction(aRunnableS119S0100000_19).start();
                    } else {
                        aRunnableS119S0100000_19.run();
                    }
                } else {
                    TuxSkeletonLayout tuxSkeletonLayout4 = this.LLIZLLLIL;
                    if (tuxSkeletonLayout4 == null) {
                        tuxSkeletonLayout4 = null;
                    }
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxSkeletonLayout4);
                    tuxSkeletonLayout4.setAlpha(1.0f);
                    TuxSkeletonLayout tuxSkeletonLayout5 = this.LLIZLLLIL;
                    if (tuxSkeletonLayout5 == null) {
                        tuxSkeletonLayout5 = null;
                    }
                    C786410Ut5.LJLLLLLL(0, tuxSkeletonLayout5);
                    TuxSkeletonLayout tuxSkeletonLayout6 = this.LLIZLLLIL;
                    if (tuxSkeletonLayout6 != null) {
                        tuxSkeletonLayout = tuxSkeletonLayout6;
                    }
                    tuxSkeletonLayout.setLoading(true);
                }
            }
            C481090Itn c481090Itn = this.LLJI;
            if (c481090Itn != null) {
                c481090Itn.setEnabled(!z);
            }
            this.LL = z;
        }
    }

    @Override // X.InterfaceC1262800ixy
    public final void LJLILLLLZI(boolean z) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = null;
        if (z) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJ;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                viewOnAttachStateChangeListenerC20604515jv = viewOnAttachStateChangeListenerC20604515jv2;
            }
            viewOnAttachStateChangeListenerC20604515jv.smoothScrollToPosition(0);
            return;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJ;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            viewOnAttachStateChangeListenerC20604515jv = viewOnAttachStateChangeListenerC20604515jv3;
        }
        viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(0);
    }

    @Override // X.InterfaceC1262810ixz
    public final void LLFZ(boolean z) {
        C1262970iyF c1262970iyF = this.LLILZIL;
        if (c1262970iyF == null) {
            c1262970iyF = null;
        }
        c1262970iyF.LLFZ(z);
    }

    @Override // X.InterfaceC1262810ixz
    public final void LLL(Function1<? super C1261270ivV, C1261270ivV> function1) {
        C1262970iyF c1262970iyF = this.LLILZIL;
        if (c1262970iyF == null) {
            c1262970iyF = null;
        }
        c1262970iyF.LLL(function1);
    }

    @Override // X.InterfaceC1262800ixy
    public final void LLLIIII(AbstractC1262620ixg abstractC1262620ixg) {
        this.LLILZLL = abstractC1262620ixg;
        this.LLIZ = (C1749280vcc) abstractC1262620ixg.findViewById(R.id.w28);
        this.LLJ = (ViewOnAttachStateChangeListenerC20604515jv) abstractC1262620ixg.findViewById(R.id.rn0);
        this.LLIZLLLIL = (TuxSkeletonLayout) abstractC1262620ixg.findViewById(R.id.vev);
    }

    @Override // X.InterfaceC1262810ixz
    public final void ng(InterfaceC1261750iwH interfaceC1261750iwH) {
        ((ArrayList) this.LLILZ).remove(interfaceC1261750iwH);
        C1262970iyF c1262970iyF = this.LLILZIL;
        if (c1262970iyF == null) {
            c1262970iyF = null;
        }
        c1262970iyF.ng(interfaceC1261750iwH);
    }

    @Override // X.InterfaceC1262800ixy
    public final void setConfigInner(C1262300ixA c1262300ixA) {
        Pair pair;
        this.LLILLL = c1262300ixA;
        C1749280vcc c1749280vcc = null;
        if (this.LLILZLL == null) {
            new C1262790ixx(C1262490ixT.LIZIZ(c1262300ixA), null, this, 6);
        }
        AbstractC1262620ixg abstractC1262620ixg = this.LLILZLL;
        if (abstractC1262620ixg == null) {
            abstractC1262620ixg = null;
        }
        C1262320ixC c1262320ixC = c1262300ixA.listConfig;
        C447550Hgn.LJFF(abstractC1262620ixg, c1262320ixC.LIZIZ, c1262320ixC.LIZJ);
        if (c1262300ixA.listConfig.LIZ == 401) {
            pair = new Pair(1, 1);
        } else {
            pair = new Pair(0, 0);
        }
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        if (iIntValue == 1 && c1262300ixA.uiConfig.LJII) {
            AbstractC1262620ixg abstractC1262620ixg2 = this.LLILZLL;
            if (abstractC1262620ixg2 == null) {
                abstractC1262620ixg2 = null;
            }
            this.LLJ = (ViewOnAttachStateChangeListenerC20604515jv) abstractC1262620ixg2.findViewById(R.id.rn1);
            AbstractC1262620ixg abstractC1262620ixg3 = this.LLILZLL;
            if (abstractC1262620ixg3 == null) {
                abstractC1262620ixg3 = null;
            }
            C481090Itn c481090Itn = (C481090Itn) abstractC1262620ixg3.findViewById(R.id.t25);
            C786410Ut5.LJLLLLLL(0, c481090Itn);
            c481090Itn.setOnRefreshListener(this);
            this.LLJI = c481090Itn;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJ;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        viewOnAttachStateChangeListenerC20604515jv.setOrientation(iIntValue);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJ;
        if (viewOnAttachStateChangeListenerC20604515jv2 == null) {
            viewOnAttachStateChangeListenerC20604515jv2 = null;
        }
        viewOnAttachStateChangeListenerC20604515jv2.addOnScrollListener(new AsS46S0100000_19(this, 17));
        Integer num = c1262300ixA.uiConfig.LIZIZ;
        if (num != null && num.intValue() == 301 && c1262300ixA.listConfig.LIZ == 401) {
            TuxSkeletonLayout tuxSkeletonLayout = this.LLIZLLLIL;
            if (tuxSkeletonLayout == null) {
                tuxSkeletonLayout = null;
            }
            tuxSkeletonLayout.setRepeat(0);
            TuxSkeletonLayout tuxSkeletonLayout2 = this.LLIZLLLIL;
            if (tuxSkeletonLayout2 == null) {
                tuxSkeletonLayout2 = null;
            }
            tuxSkeletonLayout2.setRepeatOrientation(iIntValue2);
            TuxSkeletonLayout tuxSkeletonLayout3 = this.LLIZLLLIL;
            if (tuxSkeletonLayout3 == null) {
                tuxSkeletonLayout3 = null;
            }
            tuxSkeletonLayout3.setPreviewItemRes(R.layout.els);
        }
        IRelationUserCardInternalService.LIZ.getClass();
        C1262970iyF c1262970iyFLIZIZ = C1073940e3M.LIZ().LIZIZ(c1262300ixA);
        this.LLILZIL = c1262970iyFLIZIZ;
        c1262970iyFLIZIZ.Eg(new InterfaceC1261750iwH() { // from class: X.0ix4
            @Override // X.InterfaceC1261750iwH
            public final void Kk0(AbstractC1261460ivo<?> abstractC1261460ivo) {
            }

            @Override // X.InterfaceC1261750iwH
            public final void LLF(RecyclerView recyclerView, int i) {
            }

            /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:87:0x0138  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x013f  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.InterfaceC1261750iwH
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void nO0(X.C1075800e6M r10) {
                /*
                    Method dump skipped, instruction units count: 396
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1262240ix4.nO0(X.0e6M):void");
            }
        });
        C1262970iyF c1262970iyF = this.LLILZIL;
        if (c1262970iyF == null) {
            c1262970iyF = null;
        }
        c1262970iyF.LJI(null);
        C1262970iyF c1262970iyF2 = this.LLILZIL;
        if (c1262970iyF2 == null) {
            c1262970iyF2 = null;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJ;
        if (viewOnAttachStateChangeListenerC20604515jv3 == null) {
            viewOnAttachStateChangeListenerC20604515jv3 = null;
        }
        c1262970iyF2.LLIIZ(viewOnAttachStateChangeListenerC20604515jv3);
        C447550Hgn.LIZLLL(new AwS420S0200000_19(c1262300ixA, this, 174));
        if (c1262300ixA.uiConfig.LIZIZ != null) {
            LIZIZ(true);
            Function1<? super C1749280vcc, Unit> function1 = c1262300ixA.uiConfig.LJIJI;
            if (function1 != null) {
                C1749280vcc c1749280vcc2 = this.LLIZ;
                if (c1749280vcc2 != null) {
                    c1749280vcc = c1749280vcc2;
                }
                function1.invoke(c1749280vcc);
            }
        }
    }

    public final void LIZJ(C1749280vcc c1749280vcc, C1722300uv6 c1722300uv6) {
        C1264320j0Q.LIZ.getClass();
        C1264320j0Q.LIZLLL("LayoutController", "set status view");
        LIZ(false);
        c1749280vcc.setStatus(c1722300uv6);
        C786410Ut5.LJLLLLLL(0, c1749280vcc);
        C1262300ixA c1262300ixA = this.LLILLL;
        if (c1262300ixA == null) {
            c1262300ixA = null;
        }
        if (c1262300ixA.uiConfig.LJIJJ) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1749280vcc);
            c1749280vcc.setAlpha(0.0f);
            c1749280vcc.animate().alpha(1.0f).setDuration(400L).setStartDelay(400L).setInterpolator(LLJIJIL).start();
        }
    }

    @Override // X.InterfaceC1262810ixz
    public final void LJJLIIIJILLIZJL(String str, String str2, List list) {
        C1262970iyF c1262970iyF = this.LLILZIL;
        if (c1262970iyF == null) {
            c1262970iyF = null;
        }
        c1262970iyF.LJJLIIIJILLIZJL(str, str2, list);
    }

    @Override // X.InterfaceC1262800ixy
    public final void LJLJLLL(C19EG c19eg, Fragment fragment, Function1<? super C1262310ixB, Unit> function1) {
        C1262310ixB c1262310ixB = new C1262310ixB(c19eg, fragment);
        function1.invoke(c1262310ixB);
        C1262320ixC c1262320ixC = c1262310ixB.LIZLLL;
        if (c1262320ixC.LIZLLL == -1) {
            int i = c1262310ixB.LJFF.LIZJ - 10;
            if (i < 5) {
                i = 5;
            }
            c1262320ixC.LIZLLL = i;
        }
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C1262790ixx.class);
        if (!Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C1262790ixx.class)) && !Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C1262780ixw.class)) && (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(AbstractC1263550izB.class)) || Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(AbstractC1890380zIC.class)))) {
            C1262590ixd c1262590ixd = c1262310ixB.LJFF;
            if (c1262590ixd.LJIILJJIL == null) {
                c1262590ixd.LJIILJJIL = Boolean.TRUE;
            }
        }
        setConfigInner(new C1262300ixA(c19eg, fragment, c1262310ixB.LIZJ, c1262310ixB.LIZLLL, c1262310ixB.LJ, c1262310ixB.LJFF, null, c1262310ixB.LJI));
    }
}
