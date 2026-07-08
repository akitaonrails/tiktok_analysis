package X;

import Y.ACListenerS165S0100000_31;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.MusicRecyclerViewPoolViewModel;
import com.ss.android.ugc.aweme.services.StudioMusicExService;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.15GR, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public abstract class C15GR<T> implements InterfaceC20492315Gn<T> {
    public TuxNavBar LIZ;
    public RecyclerView LIZIZ;
    public C1749280vcc LIZJ;
    public LinearLayout LIZLLL;
    public Context LJ;
    public AbstractC683590Qrd<T> LJFF;
    public C15GU LJI;
    public C0P6P LJII;
    public InterfaceC20494515Hj<C15HP> LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public C1722300uv6 LJIILIIL;
    public final int LJIILJJIL;
    public final EnumC20491915Gj LJIILL;
    public final int LJIILLIIL;
    public C15GQ LJIIZILJ;

    public abstract AbstractC683590Qrd LIZIZ();

    @Override // X.InterfaceC20492315Gn
    public final void showLoadMoreError() {
    }

    @Override // X.InterfaceC20492315Gn
    public final void LIZ() {
        C1749280vcc c1749280vcc = this.LIZJ;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
            Pair<String, String> pairLIZ = C1627000sRO.LIZ(this.LIZJ.getContext());
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_large_refresh;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZIZ = c419910GdJ;
            int iLIZ = C341940Daq.LIZ(72.0d);
            int iLIZ2 = C341940Daq.LIZ(72.0d);
            c1722300uv6.LIZLLL = iLIZ;
            c1722300uv6.LJ = iLIZ2;
            c1722300uv6.LJI = pairLIZ.getFirst();
            c1722300uv6.LJIIIIZZ = pairLIZ.getSecond();
            C786410Ut5.l9(this.LIZJ, new ACListenerS165S0100000_31(this, 100));
            this.LIZJ.setStatus(c1722300uv6);
        }
        AbstractC683590Qrd<T> abstractC683590Qrd = this.LJFF;
        if (abstractC683590Qrd != null) {
            abstractC683590Qrd.setData(null);
        }
    }

    public void LJ() {
        AbstractC683590Qrd<T> abstractC683590Qrd = this.LJFF;
        if (abstractC683590Qrd.mShowFooter) {
            abstractC683590Qrd.setShowFooter(false);
            this.LJFF.setData(null);
            this.LJFF.showLoadMoreEmpty();
        }
        RecyclerView recyclerView = this.LIZIZ;
        if (recyclerView != null) {
            C786410Ut5.LLIZLLLIL(recyclerView, 4);
        }
        C1749280vcc c1749280vcc = this.LIZJ;
        if (c1749280vcc != null) {
            if (this.LJIILIIL != null) {
                this.LIZJ.setStatus(this.LJIILIIL);
                C786410Ut5.LLLZLZ(this.LIZJ, 0);
                return;
            }
            if (this.LJIIIZ != 0) {
                String string = c1749280vcc.getContext().getString(this.LJIIIZ);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_large_error_robot;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                c1722300uv6.LIZJ = 0;
                c1722300uv6.LIZIZ = c419910GdJ;
                c1722300uv6.LJI = this.LJ.getString(2131829009);
                c1722300uv6.LJIIIIZZ = string;
                this.LIZJ.setStatus(c1722300uv6);
                C786410Ut5.LLLZLZ(this.LIZJ, 0);
            }
        }
    }

    public final void LJFF() {
        if (this.LIZJ != null) {
            C786410Ut5.xd(this.LIZJ, C12ES.LIZJ(20.0f, this.LJ));
            C786410Ut5.LLLZLZ(this.LIZJ, 0);
            this.LIZJ.LJ();
        }
    }

    @Override // X.InterfaceC20492315Gn
    public final void showLoadMoreLoading() {
        AbstractC683590Qrd<T> abstractC683590Qrd = this.LJFF;
        if (abstractC683590Qrd != null) {
            abstractC683590Qrd.showLoadMoreLoading();
        }
    }

    @Override // X.InterfaceC20492315Gn
    public final AbstractC683590Qrd<T> LJJLIIIJL() {
        return this.LJFF;
    }

    public final void LIZLLL(C15GO c15go, int i) {
        C15GQ c15gq = new C15GQ(c15go, i);
        this.LJIIZILJ = c15gq;
        this.LIZIZ.setOnScrollChangeListener(new C15GP(c15gq));
    }

    @Override // X.InterfaceC20492315Gn
    public void LLJJJIL(List<T> list, boolean z) {
        if (this.LIZJ != null) {
            C786410Ut5.xd(this.LIZJ, 0.0f);
            C786410Ut5.LLLZLZ(this.LIZJ, 8);
        }
        if (this.LJFF == null) {
            return;
        }
        if (C086I.LIZIZ(list)) {
            LJ();
            return;
        }
        C15GQ c15gq = this.LJIIZILJ;
        if (c15gq != null) {
            c15gq.LIZJ = 0;
            c15gq.LJI = 0;
        }
        this.LJFF.setShowFooter(true);
        this.LJIIJJI = z;
        if (!z) {
            AbstractC683590Qrd<T> abstractC683590Qrd = this.LJFF;
            if (abstractC683590Qrd != null) {
                abstractC683590Qrd.setShowFooter(false);
            }
            if (this.LJIIL) {
                this.LJFF.setShowFooter(true);
            }
        } else {
            this.LJFF.resetLoadMoreState();
        }
        this.LJFF.setData(list);
        RecyclerView recyclerView = this.LIZIZ;
        if (recyclerView != null) {
            C786410Ut5.LLIZLLLIL(recyclerView, 0);
        }
    }

    @Override // X.InterfaceC20492315Gn
    public final void Pj(List<T> list, boolean z) {
        AbstractC683590Qrd<T> abstractC683590Qrd = this.LJFF;
        if (abstractC683590Qrd == null) {
            return;
        }
        this.LJIIJJI = z;
        if (!z) {
            abstractC683590Qrd.setShowFooter(false);
        } else {
            abstractC683590Qrd.resetLoadMoreState();
        }
        if (C086I.LIZIZ(list)) {
            return;
        }
        this.LJFF.setDataAfterLoadMore(list);
    }

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
    public final void LIZJ(Context context, View view, C15GU c15gu, int i, C0P6P c0p6p, InterfaceC20494515Hj<C15HP> interfaceC20494515Hj, int i2) {
        this.LIZ = (TuxNavBar) view.findViewById(R.id.y08);
        this.LIZIZ = (RecyclerView) view.findViewById(R.id.ovq);
        this.LIZJ = (C1749280vcc) view.findViewById(R.id.owh);
        this.LIZLLL = (LinearLayout) view.findViewById(R.id.ovt);
        this.LJ = context;
        this.LJI = c15gu;
        this.LJII = c0p6p;
        this.LJIIIIZZ = interfaceC20494515Hj;
        this.LJIIIZ = i;
        this.LJIIJ = i2;
        if (!StudioMusicExService.INSTANCE.initMusicListViewTitleBar(this.LIZ, c15gu)) {
            TuxNavBar tuxNavBar = this.LIZ;
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
            c1251150ifB.LIZ = new InterfaceC197023126r() { // from class: X.15GS
                @Override // X.InterfaceC197023126r
                public final void LIZ() {
                    C15GU c15gu2 = this.LIZ.LJI;
                    if (c15gu2 != null) {
                        c15gu2.LJIJ();
                    }
                }
            };
            c0om1.LJ(c1251150ifB);
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_arrow_turn_up_right;
            c1251150ifB2.LIZ = new InterfaceC197023126r() { // from class: X.15GT
                @Override // X.InterfaceC197023126r
                public final void LIZ() {
                    C15GU c15gu2 = this.LIZ.LJI;
                    if (c15gu2 != null) {
                        c15gu2.b1();
                    }
                }
            };
            c1251150ifB2.LIZIZ = "share";
            c1251150ifB2.LJI = false;
            c0om1.LIZIZ(c1251150ifB2);
            c0om1.LIZLLL = true;
            tuxNavBar.setNavActions(c0om1);
        }
        if (this.LJIILJJIL == 1) {
            LJFF();
        }
        AbstractC683590Qrd<T> abstractC683590QrdLIZIZ = LIZIZ();
        this.LJFF = abstractC683590QrdLIZIZ;
        abstractC683590QrdLIZIZ.setLoadMoreListener(this.LJII);
        this.LIZIZ.setAdapter(this.LJFF);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(this.LJ, 1);
        wrapLinearLayoutManager.mRecycleChildrenOnDetach = C15GL.LIZ();
        this.LIZIZ.setLayoutManager(wrapLinearLayoutManager);
        this.LIZIZ.setRecycledViewPool(MusicRecyclerViewPoolViewModel.vQ2(this.LJ));
    }

    public C15GR(Context context, View view, C15GU c15gu, int i, C0P6P c0p6p, InterfaceC20494515Hj<C15HP> interfaceC20494515Hj, int i2, int i3) {
        this.LJIILJJIL = 1;
        this.LJIILL = EnumC20491915Gj.UNSET;
        this.LJIILLIIL = i3;
        LIZJ(context, view, c15gu, i, c0p6p, interfaceC20494515Hj, i2);
    }

    public C15GR(Context context, View view, C15GU c15gu, int i, C0P6P c0p6p, InterfaceC20494515Hj<C15HP> interfaceC20494515Hj, int i2, int i3, int i4) {
        this.LJIILJJIL = 1;
        this.LJIILL = EnumC20491915Gj.UNSET;
        this.LJIILJJIL = i3;
        this.LJIILLIIL = i4;
        LIZJ(context, view, c15gu, i, c0p6p, interfaceC20494515Hj, i2);
    }

    public C15GR(Context context, View view, C15GU c15gu, int i, C0P6P c0p6p, InterfaceC20494515Hj<C15HP> interfaceC20494515Hj, int i2, EnumC20491915Gj enumC20491915Gj, int i3) {
        this.LJIILJJIL = 1;
        this.LJIILL = EnumC20491915Gj.UNSET;
        this.LJIILL = enumC20491915Gj;
        this.LJIILLIIL = i3;
        LIZJ(context, view, c15gu, i, c0p6p, interfaceC20494515Hj, i2);
    }
}
