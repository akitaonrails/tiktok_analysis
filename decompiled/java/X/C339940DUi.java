package X;

import Y.ACListenerS71S0300000_4;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import avg.f;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.0DUi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339940DUi extends AbstractC2172971A2l<AbstractC339890DUd, C340000DUo<InterfaceC340040DUs>> {
    public final InterfaceC340010DUp LLILLJJLI;

    public C339940DUi(InterfaceC340010DUp interfaceC340010DUp) {
        super(new AbstractC339510DSr<AbstractC339890DUd>() { // from class: X.0DUe
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(AbstractC339890DUd abstractC339890DUd, AbstractC339890DUd abstractC339890DUd2) {
                return Intrinsics.LJFF(abstractC339890DUd, abstractC339890DUd2);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(AbstractC339890DUd abstractC339890DUd, AbstractC339890DUd abstractC339890DUd2) {
                return Intrinsics.LJFF(abstractC339890DUd.LIZ(), abstractC339890DUd2.LIZ());
            }

            @Override // X.AbstractC339510DSr
            public final Object LIZJ(AbstractC339890DUd abstractC339890DUd, AbstractC339890DUd abstractC339890DUd2) {
                AbstractC339890DUd abstractC339890DUd3 = abstractC339890DUd;
                AbstractC339890DUd abstractC339890DUd4 = abstractC339890DUd2;
                EnumC339930DUh enumC339930DUhLIZIZ = abstractC339890DUd3.LIZIZ();
                EnumC339930DUh enumC339930DUh = EnumC339930DUh.DRAFT;
                if (enumC339930DUhLIZIZ == enumC339930DUh && abstractC339890DUd4.LIZIZ() == enumC339930DUh) {
                    ArrayList arrayList = new ArrayList();
                    C339870DUb c339870DUb = (C339870DUb) abstractC339890DUd3;
                    C339870DUb c339870DUb2 = (C339870DUb) abstractC339890DUd4;
                    if (c339870DUb.LIZIZ != c339870DUb2.LIZIZ) {
                        arrayList.add("selected_state");
                    }
                    if (c339870DUb.LIZJ.modifiedTime != c339870DUb2.LIZJ.modifiedTime) {
                        arrayList.add("modified_time");
                    }
                    if (!arrayList.isEmpty()) {
                        return arrayList;
                    }
                    return null;
                }
                return null;
            }
        });
        this.LLILLJJLI = interfaceC340010DUp;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        EnumC339930DUh enumC339930DUhLIZIZ;
        AbstractC339890DUd abstractC339890DUdLLLFZ = LLLFZ(i);
        if (abstractC339890DUdLLLFZ != null && (enumC339930DUhLIZIZ = abstractC339890DUdLLLFZ.LIZIZ()) != null) {
            return enumC339930DUhLIZIZ.ordinal();
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        GridLayoutManager gridLayoutManager;
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
            gridLayoutManager.LJIJI(new C346250Dhn(this, gridLayoutManager, 0));
        }
    }

    public static void LLLIILIL(C339870DUb c339870DUb, C339960DUk c339960DUk) {
        int i;
        C0HZQ c0hzq = c339960DUk.LLILLJJLI;
        boolean z = true;
        if (c339870DUb.LIZIZ != C0DUY.NONE) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, c0hzq);
        C0HZQ c0hzq2 = c339960DUk.LLILLJJLI;
        if (c339870DUb.LIZIZ != C0DUY.SELECTED) {
            z = false;
        }
        c0hzq2.setChecked(z);
    }

    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLIL, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(C340000DUo<InterfaceC340040DUs> c340000DUo, int i) {
        AbstractC339890DUd abstractC339890DUdLLLFZ = LLLFZ(i);
        if (abstractC339890DUdLLLFZ == null) {
            return;
        }
        int i2 = C339950DUj.LIZ[abstractC339890DUdLLLFZ.LIZIZ().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new C1954807lC();
                }
                return;
            }
            C339870DUb c339870DUb = (C339870DUb) abstractC339890DUdLLLFZ;
            C339960DUk c339960DUk = (C339960DUk) c340000DUo.LL;
            c339960DUk.LLJ.setText(new BDDateFormat("L").LIZIZ(c339870DUb.LIZJ.createdTime, Locale.getDefault()));
            LLLIIIIL(c339870DUb, c339960DUk, i);
            LLLIILIL(c339870DUb, c339960DUk);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        InterfaceC340040DUs interfaceC340040DUsLIZ;
        if (i == EnumC339930DUh.HEADER.ordinal()) {
            interfaceC340040DUsLIZ = C06V4.LIZ(C786410Ut5.ne(viewGroup.getContext()), viewGroup);
        } else {
            if (i == EnumC339930DUh.DRAFT.ordinal()) {
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fea, viewGroup, false);
                int i2 = R.id.dqk;
                C0HZQ c0hzq = (C0HZQ) C1616006Uk.LIZ(R.id.dqk, viewTd);
                if (c0hzq != null) {
                    FixedRatioFrameLayout fixedRatioFrameLayout = (FixedRatioFrameLayout) viewTd;
                    i2 = R.id.er9;
                    if (C1616006Uk.LIZ(R.id.er9, viewTd) != null) {
                        i2 = R.id.etj;
                        if (C1616006Uk.LIZ(R.id.etj, viewTd) != null) {
                            i2 = R.id.cover;
                            SmartImageView smartImageView = (SmartImageView) C1616006Uk.LIZ(R.id.cover, viewTd);
                            if (smartImageView != null) {
                                i2 = R.id.jz1;
                                TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.jz1, viewTd);
                                if (tuxIconView != null) {
                                    i2 = R.id.k1r;
                                    TuxSpinner tuxSpinner = (TuxSpinner) C1616006Uk.LIZ(R.id.k1r, viewTd);
                                    if (tuxSpinner != null) {
                                        i2 = R.id.k4u;
                                        View viewLIZ = C1616006Uk.LIZ(R.id.k4u, viewTd);
                                        if (viewLIZ != null) {
                                            i2 = R.id.pwk;
                                            View viewLIZ2 = C1616006Uk.LIZ(R.id.pwk, viewTd);
                                            if (viewLIZ2 != null) {
                                                i2 = R.id.zax;
                                                TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.zax, viewTd);
                                                if (tuxTextView != null) {
                                                    i2 = R.id.tv_top;
                                                    TuxTextView tuxTextView2 = (TuxTextView) C1616006Uk.LIZ(R.id.tv_top, viewTd);
                                                    if (tuxTextView2 != null) {
                                                        interfaceC340040DUsLIZ = new C339960DUk(fixedRatioFrameLayout, c0hzq, smartImageView, tuxIconView, tuxSpinner, viewLIZ, viewLIZ2, tuxTextView, tuxTextView2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i2)));
            }
            if (i == EnumC339930DUh.FOOTER.ordinal()) {
                View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.feb, viewGroup, false);
                if (viewTd2 != null) {
                    final FrameLayout frameLayout = (FrameLayout) viewTd2;
                    interfaceC340040DUsLIZ = new InterfaceC340040DUs(frameLayout) { // from class: X.0DUq
                        public final FrameLayout LL;

                        @Override // X.InterfaceC340040DUs
                        public final /* bridge */ /* synthetic */ View getRoot() {
                            return this.LL;
                        }

                        {
                            this.LL = frameLayout;
                        }
                    };
                } else {
                    throw new NullPointerException("rootView");
                }
            } else {
                interfaceC340040DUsLIZ = C06V4.LIZ(C786410Ut5.ne(viewGroup.getContext()), viewGroup);
            }
        }
        C340000DUo c340000DUo = new C340000DUo(interfaceC340040DUsLIZ);
        try {
            View view = c340000DUo.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c340000DUo.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c340000DUo.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C340000DUo.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c340000DUo.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c340000DUo.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C340000DUo.class.getName();
        return c340000DUo;
    }

    public final void LLLIIIIL(C339870DUb c339870DUb, C339960DUk c339960DUk, int i) {
        File coverFile = c339870DUb.LIZJ.getCoverFile();
        int iIntValue = -1;
        if (coverFile.exists()) {
            C1324750kZt.LJIIIZ(c339960DUk.LLILLL, Uri.fromFile(coverFile).toString(), -1, -1);
        }
        C339970DUl c339970DUl = EnumC339980DUm.Companion;
        int i2 = c339870DUb.LIZJ.taskStatus;
        c339970DUl.getClass();
        int i3 = 0;
        switch (C339950DUj.LIZIZ[C339970DUl.LIZ(i2).ordinal()]) {
            case 1:
                C786410Ut5.LJLLLLLL(8, c339960DUk.LLILZLL);
                C786410Ut5.LJLLLLLL(8, c339960DUk.LLILZ);
                C786410Ut5.LJLLLLLL(8, c339960DUk.LLILZIL);
                C786410Ut5.LJLLLLLL(8, c339960DUk.LLIZLLLIL);
                C786410Ut5.LJLLLLLL(8, c339960DUk.LLIZ);
                break;
            case 2:
            case 3:
            case 4:
                C786410Ut5.LJLLLLLL(8, c339960DUk.LLILZLL);
                C786410Ut5.LJLLLLLL(0, c339960DUk.LLILZ);
                c339960DUk.LLILZ.setIconRes(R.raw.icon_x_mark_fill_small);
                c339960DUk.LLILZ.setTintColorRes(R.attr.a1l);
                C786410Ut5.LJLLLLLL(8, c339960DUk.LLILZIL);
                C786410Ut5.LJLLLLLL(0, c339960DUk.LLIZLLLIL);
                TuxTextView tuxTextView = c339960DUk.LLIZLLLIL;
                tuxTextView.setText(tuxTextView.getContext().getString(2131832400));
                C786410Ut5.LJLLLLLL(0, c339960DUk.LLIZ);
                break;
            case 5:
            case 6:
                C786410Ut5.LJLLLLLL(8, c339960DUk.LLILZLL);
                C786410Ut5.LJLLLLLL(8, c339960DUk.LLILZ);
                C786410Ut5.LJLLLLLL(0, c339960DUk.LLILZIL);
                TuxSpinner tuxSpinner = c339960DUk.LLILZIL;
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zi, tuxSpinner.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                }
                tuxSpinner.LIZ(R.raw.icon_spinner_normal, iIntValue);
                C786410Ut5.LJLLLLLL(0, c339960DUk.LLIZLLLIL);
                TuxTextView tuxTextView2 = c339960DUk.LLIZLLLIL;
                tuxTextView2.setText(tuxTextView2.getContext().getString(2131820555));
                C786410Ut5.LJLLLLLL(8, c339960DUk.LLIZ);
                break;
            case 7:
                View view = c339960DUk.LLILZLL;
                if (C298600Bn8.LIZ() && c339870DUb.LIZJ.isRead()) {
                    i3 = 8;
                }
                C786410Ut5.LJLLLLLL(i3, view);
                C786410Ut5.LJLLLLLL(8, c339960DUk.LLILZ);
                C786410Ut5.LJLLLLLL(8, c339960DUk.LLILZIL);
                C786410Ut5.LJLLLLLL(8, c339960DUk.LLIZLLLIL);
                C786410Ut5.LJLLLLLL(8, c339960DUk.LLIZ);
                break;
            default:
                throw new C1954807lC();
        }
        C786410Ut5.b9(c339960DUk.LLILLJJLI, new ACListenerS71S0300000_4(this, c339870DUb, c339960DUk, i, 0));
        FixedRatioFrameLayout fixedRatioFrameLayout = c339960DUk.LL;
        View.OnClickListener aCListenerS71S0300000_4 = new ACListenerS71S0300000_4(this, c339870DUb, c339960DUk, i, 1);
        if (C1848410yCV.LIZ) {
            aCListenerS71S0300000_4 = new f(aCListenerS71S0300000_4);
        }
        a aVar = new a(aCListenerS71S0300000_4);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(fixedRatioFrameLayout);
        }
        fixedRatioFrameLayout.setOnClickListener(aVar);
        c339960DUk.LL.setOnLongClickListener(new ViewOnLongClickListenerC346300Dhs(this, c339870DUb, c339960DUk, i, 0));
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        List list2;
        C340000DUo<InterfaceC340040DUs> c340000DUo = (C340000DUo) viewHolder;
        if (list.isEmpty()) {
            onBindViewHolder(c340000DUo, i);
            return;
        }
        AbstractC339890DUd abstractC339890DUdLLLFZ = LLLFZ(i);
        if (abstractC339890DUdLLLFZ == null) {
            return;
        }
        Object objLJJJLL = C13LP.LJJJLL(list);
        if (!(objLJJJLL instanceof List) || (list2 = (List) objLJJJLL) == null) {
            list2 = C13BV.INSTANCE;
        }
        if (list2.contains("selected_state")) {
            LLLIILIL((C339870DUb) abstractC339890DUdLLLFZ, (C339960DUk) c340000DUo.LL);
        }
        if (!list2.contains("modified_time")) {
            return;
        }
        LLLIIIIL((C339870DUb) abstractC339890DUdLLLFZ, (C339960DUk) c340000DUo.LL, i);
    }
}
