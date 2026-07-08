package X;

import Y.ARunnableS14S0100100_8;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tools.draft.adapter.viewholder.NewDraftViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0M2m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C562020M2m extends AbstractC21673619ry<AbstractC562050M2p<? extends C561950M2f>> {
    public final C0M3H LL;
    public final C561140Lzc LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public final Function0<Unit> LLILZ;
    public boolean LLILZLL;
    public boolean LLIZ;
    public List<C561950M2f> LLILZIL = new ArrayList();
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(513));

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZIL.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftAdapter -> getItemViewType -> position = ");
        sbLIZ.append(i);
        C201955140j.LIZJ(c0may, C2188811AlT.LIZIZ(sbLIZ));
        if (ListProtector.get(this.LLILZIL, i) == null) {
            C1AF0.LIZJ("draft item must not null");
            return 0;
        }
        return ((C561950M2f) ListProtector.get(this.LLILZIL, i)).LIZ();
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).LJIJI(new C580770MqB(this, layoutManager, 6));
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
    }

    public final void setData(final List<C561950M2f> list) {
        if (((Boolean) this.LLIZLLLIL.getValue()).booleanValue()) {
            this.LLILZIL = list;
            notifyDataSetChanged();
            return;
        }
        int i = 0;
        for (C561950M2f c561950M2f : list) {
            int i2 = i + 1;
            if (i >= 0) {
                if (c561950M2f == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Draft list item must not be null; list.size = ");
                    sbLIZ.append(list.size());
                    sbLIZ.append(";current index = ");
                    sbLIZ.append(i);
                    C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        final List<C561950M2f> list2 = this.LLILZIL;
        C21342318fd.LIZ(new AbstractC21342018fa(list2, list) { // from class: X.0M0Q
            public final List<C561950M2f> LIZ;
            public final List<C561950M2f> LIZIZ;

            @Override // X.AbstractC21342018fa
            public final Object LIZJ(int i3, int i4) {
                return null;
            }

            @Override // X.AbstractC21342018fa
            public final int LIZLLL() {
                return this.LIZIZ.size();
            }

            @Override // X.AbstractC21342018fa
            public final int LJ() {
                return this.LIZ.size();
            }

            {
                this.LIZ = list2;
                this.LIZIZ = list;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZ(int i3, int i4) {
                C561950M2f c561950M2f2 = (C561950M2f) ListProtector.get(this.LIZ, i3);
                C561950M2f c561950M2f3 = (C561950M2f) ListProtector.get(this.LIZIZ, i4);
                if ((c561950M2f2 instanceof C0M0P) && (c561950M2f3 instanceof C0M0P)) {
                    C0M0P c0m0p = (C0M0P) c561950M2f2;
                    C0M0P c0m0p2 = (C0M0P) c561950M2f3;
                    if (Intrinsics.LJFF(c0m0p.LJFF, c0m0p2.LJFF) && c0m0p.LJI == c0m0p2.LJI && Intrinsics.LJFF(c0m0p.LJIIL, c0m0p2.LJIIL) && Intrinsics.LJFF(c0m0p.LJIIIIZZ, c0m0p2.LJIIIIZZ)) {
                        return true;
                    }
                    return false;
                }
                return Intrinsics.LJFF(c561950M2f2, c561950M2f3);
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i3, int i4) {
                return Intrinsics.LJFF(ListProtector.get(this.LIZ, i3), ListProtector.get(this.LIZIZ, i4));
            }
        }, true).LIZJ(this);
        this.LLILZIL = new ArrayList(list);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) throws JSONException {
        LLLFZ((AbstractC562050M2p) viewHolder, i, false);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c562040M2o;
        C0M3H c0m3h = this.LL;
        C561140Lzc c561140Lzc = this.LLILLJJLI;
        Function0<Unit> function0 = this.LLILLL;
        Function0<Unit> function02 = this.LLILZ;
        switch (i) {
            case 104:
                final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cvf, viewGroup, false);
                c562040M2o = new AbstractC562050M2p<C561200Lzi>(viewTd) { // from class: X.0M2s
                    @Override // X.AbstractC562050M2p
                    public final /* bridge */ /* synthetic */ void I5(C561950M2f c561950M2f, int i2) {
                    }
                };
                break;
            case 105:
                final View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cvg, viewGroup, false);
                c562040M2o = new AbstractC562050M2p<C561470M0j>(viewTd2) { // from class: X.0M2n
                    public final C01GW LL;
                    public final C01GW LLILLJJLI;

                    {
                        super(viewTd2);
                        this.LL = C452501pT.LIZIZ(new AwS552S0100000_8(viewTd2, 1064));
                        this.LLILLJJLI = C452501pT.LIZIZ(new AwS552S0100000_8(viewTd2, 1063));
                    }

                    @Override // X.AbstractC562050M2p
                    public final void I5(C561950M2f c561950M2f, int i2) {
                        CharSequence text;
                        C561470M0j c561470M0j = (C561470M0j) c561950M2f;
                        if (c561470M0j.LIZJ && C571820Mbk.LIZ(this.itemView.getContext())) {
                            text = this.itemView.getContext().getText(2131828226);
                        } else {
                            text = this.itemView.getContext().getText(2131832449);
                        }
                        String string = text.toString();
                        if (!C09X9.LIZ()) {
                            TuxTextView tuxTextView = (TuxTextView) this.LL.getValue();
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) this.LL.getValue()).getLayoutParams();
                            int iLIZ = (int) C11VU.LIZ(16.0f);
                            marginLayoutParams.setMargins(iLIZ, iLIZ, iLIZ, iLIZ);
                            C786410Ut5.R6(tuxTextView, marginLayoutParams);
                        } else {
                            C786410Ut5.LLLLZLL((TuxTextView) this.LLILLJJLI.getValue(), 0);
                            if (c561470M0j.LJ) {
                                ((TextView) this.LLILLJJLI.getValue()).setText(this.itemView.getContext().getText(2131846786));
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(string);
                                sbLIZ.append(' ');
                                sbLIZ.append(this.itemView.getContext().getString(2131846783));
                                string = C2188811AlT.LIZIZ(sbLIZ);
                            } else {
                                ((TextView) this.LLILLJJLI.getValue()).setText(this.itemView.getContext().getText(2131832395));
                            }
                        }
                        ((TextView) this.LL.getValue()).setText(string);
                    }
                };
                break;
            case 106:
                c562040M2o = new NewDraftViewHolder(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cvt, viewGroup, false), c0m3h, c561140Lzc);
                break;
            case 107:
                final View viewTd3 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cve, viewGroup, false);
                c562040M2o = new AbstractC562050M2p<C561950M2f>(viewTd3) { // from class: X.0M2r
                    @Override // X.AbstractC562050M2p
                    public final void I5(C561950M2f c561950M2f, int i2) {
                    }
                };
                break;
            case 108:
                c562040M2o = new C562510M4j(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cvs, viewGroup, false), c0m3h);
                break;
            case 109:
                c562040M2o = new C0M3N(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cvu, viewGroup, false), c561140Lzc, function0, function02);
                break;
            case 110:
            default:
                throw new RuntimeException("wrong draft type");
            case 111:
            case 113:
                final FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                C786410Ut5.a6(frameLayout, new RecyclerView.LayoutParams(0, 0));
                c562040M2o = new AbstractC562050M2p<C561950M2f>(frameLayout) { // from class: X.0M2q
                    @Override // X.AbstractC562050M2p
                    public final void I5(C561950M2f c561950M2f, int i2) {
                    }
                };
                break;
            case 112:
                c562040M2o = new C562040M2o(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cvh, viewGroup, false), c0m3h);
                break;
        }
        try {
            View view = c562040M2o.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c562040M2o.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c562040M2o.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c562040M2o.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c562040M2o.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c562040M2o.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c562040M2o.getClass().getName();
        return c562040M2o;
    }

    public final void LLLFZ(AbstractC562050M2p<? extends C561950M2f> abstractC562050M2p, int i, boolean z) throws JSONException {
        C562090M2t c562090M2t = C562090M2t.LIZLLL;
        if (!c562090M2t.LIZIZ) {
            C786410Ut5.LJJZZIII((Handler) C562090M2t.LJ.getValue(), new Runnable() { // from class: X.0M2u
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("DraftBoxEnterPerformanceHelper@bf1d.mob$1");
                    try {
                        C823050WQl.LIZJ().execute(new ARunnableS14S0100100_8(System.currentTimeMillis() - C562090M2t.LIZLLL.LIZJ, 1));
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DraftBoxEnterPerformanceHelper@bf1d.mob$1");
                }
            });
            c562090M2t.LIZIZ = true;
        }
        int i2 = C0MJM.LIZJ;
        if (i == i2 && C0MJM.LIZLLL && i == i2) {
            C0MJM.LIZLLL = false;
            C0MJM.LIZIZ = System.currentTimeMillis();
            C0LAB c0lab = new C0LAB();
            c0lab.LIZIZ(C0MJM.LIZIZ - C0MJM.LIZ, "duration");
            C20684815ws.LJIILLIIL("load_drafts", c0lab.LIZ);
        }
        ((C561950M2f) ListProtector.get(this.LLILZIL, i)).LIZIZ = this.LLILZLL;
        ((C561950M2f) ListProtector.get(this.LLILZIL, i)).LIZJ = this.LLIZ;
        C561950M2f c561950M2f = (C561950M2f) ListProtector.get(this.LLILZIL, i);
        if (z && (abstractC562050M2p instanceof NewDraftViewHolder) && (c561950M2f instanceof C0M0P)) {
            ((NewDraftViewHolder) abstractC562050M2p).L5((C0M0P) c561950M2f, true);
        } else {
            abstractC562050M2p.I5(c561950M2f, i);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) throws JSONException {
        NewDraftViewHolder newDraftViewHolder;
        C0M0P c0m0p;
        NewDraftViewHolder newDraftViewHolder2;
        C0M0P c0m0p2;
        AbstractC562050M2p<? extends C561950M2f> abstractC562050M2p = (AbstractC562050M2p) viewHolder;
        if (list.isEmpty()) {
            LLLFZ(abstractC562050M2p, i, false);
            return;
        }
        if (abstractC562050M2p instanceof NewDraftViewHolder) {
            String string = C13LP.LJJJJZI(list).toString();
            int iHashCode = string.hashCode();
            C0M0P c0m0p3 = null;
            C0HZQ c0hzq = null;
            if (iHashCode != -1001078227) {
                if (iHashCode != 742313895) {
                    if (iHashCode != 848713495 || !string.equals("edit_mode_change")) {
                        return;
                    }
                    LLLFZ(abstractC562050M2p, i, true);
                    return;
                }
                if (!string.equals("checked") || (c0m0p2 = (newDraftViewHolder2 = (NewDraftViewHolder) abstractC562050M2p).LLJJIJIIJIL) == null) {
                    return;
                }
                C0HZQ c0hzq2 = newDraftViewHolder2.LLJJIII;
                if (c0hzq2 != null) {
                    c0hzq = c0hzq2;
                }
                c0hzq.setChecked(c0m0p2.LJIIJJI);
                return;
            }
            if (!string.equals("progress") || (c0m0p = (newDraftViewHolder = (NewDraftViewHolder) abstractC562050M2p).LLJJIJIIJIL) == null) {
                return;
            }
            if (c0m0p.LJIILIIL != EnumC545550LaT.NONE && !c0m0p.LIZJ) {
                ViewGroup viewGroup = newDraftViewHolder.LLIZLLLIL;
                if (viewGroup == null) {
                    viewGroup = null;
                }
                C786410Ut5.LJLZ(8, viewGroup);
                C0M0P c0m0p4 = newDraftViewHolder.LLJJIJIIJIL;
                if (c0m0p4 != null) {
                    c0m0p3 = c0m0p4;
                }
                newDraftViewHolder.S5(c0m0p3);
                return;
            }
            ViewGroup viewGroup2 = newDraftViewHolder.LLJI;
            if (viewGroup2 == null) {
                return;
            }
            C786410Ut5.LJLZ(8, viewGroup2);
            return;
        }
        if (!(abstractC562050M2p instanceof C562040M2o)) {
            return;
        }
        LLLFZ(abstractC562050M2p, i, false);
    }

    public C562020M2m(C0M3H c0m3h, C561140Lzc c561140Lzc, AwS552S0100000_8 awS552S0100000_8, AwS552S0100000_8 awS552S0100000_82, C19EG c19eg) {
        this.LL = c0m3h;
        this.LLILLJJLI = c561140Lzc;
        this.LLILLL = awS552S0100000_8;
        this.LLILZ = awS552S0100000_82;
    }
}
