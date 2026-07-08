package X;

import Y.ACListenerS124S0200000_21;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0laG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1363420laG extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final SharePanelViewModel LL;
    public final InterfaceC1362600lYw LLILLJJLI;
    public final Context LLILLL;
    public final InterfaceC897330ZId LLILZ;
    public final C788580Uwa LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(553));
    public final List<Integer> LLIZ = new ArrayList();
    public final List<Integer> LLIZLLLIL = new ArrayList();
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(301));

    public final List<IMContact> getData() {
        return (List) this.LLJ.getValue();
    }

    public final void LLLFZ() {
        Iterator<IMContact> it2 = getData().iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next() instanceof C1363130lZn) {
                if (i != -1) {
                    notifyItemChanged(i);
                    return;
                }
                return;
            }
            i++;
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return getData().size();
    }

    public final void LLLI(boolean z) {
        int i = 0;
        if (z) {
            Iterator<IMContact> it2 = getData().iterator();
            while (it2.hasNext()) {
                if (it2.next() instanceof C1363130lZn) {
                    if (i != -1) {
                        int i2 = i + 1;
                        ListProtector.add(getData(), i2, new C1363160lZq());
                        notifyItemInserted(i2);
                        return;
                    }
                    return;
                }
                i++;
            }
            return;
        }
        Iterator<IMContact> it3 = getData().iterator();
        while (it3.hasNext()) {
            if (it3.next() instanceof C1363160lZq) {
                if (i == -1) {
                    return;
                }
                ListProtector.remove(getData(), i);
                notifyItemRemoved(i);
                return;
            }
            i++;
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Object obj = ListProtector.get(getData(), i);
        if (obj instanceof C1363150lZp) {
            return 2;
        }
        if (obj instanceof C1365460ldY) {
            return 3;
        }
        if (!(obj instanceof MAFIMUser)) {
            if (obj instanceof C1363730lal) {
                return 6;
            }
            if (obj instanceof C1363130lZn) {
                return 7;
            }
            if (obj instanceof C1363160lZq) {
                return 8;
            }
            return 1;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof InterfaceC1363770lap) {
            ((InterfaceC1363770lap) viewHolder).onAttachedToWindow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof InterfaceC1363770lap) {
            ((InterfaceC1363770lap) viewHolder).onDetachedFromWindow();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int iLIZLLL;
        Integer numLIZJ;
        int iLIZIZ;
        int iLJFF;
        if (viewHolder instanceof C1363580laW) {
            ((C1363580laW) viewHolder).I5(i, (IMContact) ListProtector.get(getData(), i), this.LL);
            return;
        }
        if (viewHolder instanceof C1364130lbP) {
            ((C1364130lbP) viewHolder).I5((C1365460ldY) ListProtector.get(getData(), i), this.LL, i);
            return;
        }
        if (viewHolder instanceof C1363960lb8) {
            IMContact iMContact = (IMContact) ListProtector.get(getData(), i);
            boolean zContains = ((ArrayList) this.LLIZ).contains(Integer.valueOf(i));
            boolean zContains2 = ((ArrayList) this.LLIZLLLIL).contains(Integer.valueOf(i));
            SharePanelViewModel sharePanelViewModel = this.LL;
            C0SY5.LIZIZ(this.LLILLL);
            ((C1363960lb8) viewHolder).I5(iMContact, i, zContains, zContains2, sharePanelViewModel, null, null, this.LL.LJIIJJI().indexOf(ListProtector.get(getData(), i)));
            return;
        }
        if (viewHolder instanceof C1381550m3V) {
            ((C1381550m3V) viewHolder).I5((MAFIMUser) ListProtector.get(getData(), i), this.LL);
            return;
        }
        if (viewHolder instanceof C995260c0S) {
            return;
        }
        int iIntValue = 0;
        if (viewHolder instanceof C1363440laI) {
            C1363440laI c1363440laI = (C1363440laI) viewHolder;
            IMContact iMContact2 = (IMContact) ListProtector.get(getData(), i);
            c1363440laI.LL = this.LL;
            if (c1363440laI.I5()) {
                String strLJIIJJI = ((InterfaceC1361560lXG) c1363440laI.LLILZIL.getValue()).LJIIJJI();
                InterfaceC1363540laS interfaceC1363540laS = (InterfaceC1363540laS) c1363440laI.LLILZ.getValue();
                if (interfaceC1363540laS != null) {
                    iLJFF = interfaceC1363540laS.LJFF();
                } else {
                    iLJFF = 0;
                }
                C1295960jpS c1295960jpS = (C1295960jpS) c1363440laI.LLILLJJLI.getValue();
                if (c1295960jpS != null) {
                    c1295960jpS.setAnimation(strLJIIJJI);
                }
                ((TextView) c1363440laI.LLILLL.getValue()).setText(C20642515q3.LJI(iLJFF));
            } else {
                int iLJFF2 = ((InterfaceC1361560lXG) c1363440laI.LLILZIL.getValue()).LJFF();
                InterfaceC1363540laS interfaceC1363540laS2 = (InterfaceC1363540laS) c1363440laI.LLILZ.getValue();
                if (interfaceC1363540laS2 != null) {
                    iLIZIZ = interfaceC1363540laS2.LIZIZ();
                } else {
                    iLIZIZ = 0;
                }
                C1295960jpS c1295960jpS2 = (C1295960jpS) c1363440laI.LLILLJJLI.getValue();
                if (c1295960jpS2 != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = iLJFF2;
                    c1295960jpS2.setImageDrawable(c419910GdJ.LIZ(c1295960jpS2.getContext()));
                }
                ((TextView) c1363440laI.LLILLL.getValue()).setText(C20642515q3.LJI(iLIZIZ));
            }
            C786410Ut5.I7(new ACListenerS124S0200000_21(iMContact2, c1363440laI, 86), c1363440laI.itemView);
            InterfaceC1363540laS interfaceC1363540laS3 = (InterfaceC1363540laS) c1363440laI.LLILZ.getValue();
            if ((interfaceC1363540laS3 != null && interfaceC1363540laS3.LJIIJ()) || !c1363440laI.I5() || C0CBR.LIZIZ) {
                return;
            }
            C1295960jpS c1295960jpS3 = (C1295960jpS) c1363440laI.LLILLJJLI.getValue();
            if (c1295960jpS3 != null) {
                c1295960jpS3.setRepeatCount(((InterfaceC1361560lXG) c1363440laI.LLILZIL.getValue()).LJIIIIZZ());
            }
            C1295960jpS c1295960jpS4 = (C1295960jpS) c1363440laI.LLILLJJLI.getValue();
            if (c1295960jpS4 != null) {
                c1295960jpS4.playAnimation();
            }
            InterfaceC1363540laS interfaceC1363540laS4 = (InterfaceC1363540laS) c1363440laI.LLILZ.getValue();
            if (interfaceC1363540laS4 == null) {
                return;
            }
            interfaceC1363540laS4.LJ();
            return;
        }
        if (!(viewHolder instanceof C1363570laV)) {
            return;
        }
        C1363570laV c1363570laV = (C1363570laV) viewHolder;
        IMContact iMContact3 = (IMContact) ListProtector.get(getData(), i);
        c1363570laV.LL = this.LL;
        c1363570laV.LLILZLL.LIZ(iMContact3, "SHARE_PANEL", new AwS565S0100000_21(c1363570laV, 1588));
        int iLJIIIZ = ((InterfaceC1361560lXG) c1363570laV.LLILZIL.getValue()).LJIIIZ();
        InterfaceC1363540laS interfaceC1363540laS5 = (InterfaceC1363540laS) c1363570laV.LLILZ.getValue();
        if (interfaceC1363540laS5 != null) {
            iLIZLLL = interfaceC1363540laS5.LIZLLL();
        } else {
            iLIZLLL = 0;
        }
        TuxIconView tuxIconView = (TuxIconView) c1363570laV.LLILLJJLI.getValue();
        if (tuxIconView != null) {
            tuxIconView.setIconRes(iLJIIIZ);
            tuxIconView.setTintColorRes(R.attr.a0o);
            Context context = tuxIconView.getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bi, context)) != null) {
                iIntValue = numLIZJ.intValue();
            }
            tuxIconView.setBackgroundColor(iIntValue);
        }
        ((TextView) c1363570laV.LLILLL.getValue()).setText(C20642515q3.LJI(iLIZLLL));
        C786410Ut5.I7(new ACListenerS124S0200000_21(iMContact3, c1363570laV, 99), c1363570laV.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderLIZ;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 6) {
                        if (i != 7) {
                            if (i != 8) {
                                int i2 = C1363960lb8.LLJJJJ;
                                viewHolderLIZ = C1363460laK.LIZ(viewGroup, this.LL, this.LLILLJJLI, false, this.LLILZIL, this.LLILZ, 96);
                            } else {
                                int i3 = C1363570laV.LLIZ;
                                SharePanelViewModel sharePanelViewModel = this.LL;
                                C788580Uwa c788580Uwa = this.LLILZIL;
                                View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ckx, viewGroup, false);
                                if (c788580Uwa != null && c788580Uwa.LIZ) {
                                    viewTd.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68));
                                    View viewFindViewById = viewTd.findViewById(R.id.t9v);
                                    if (viewFindViewById != null && (layoutParams2 = viewFindViewById.getLayoutParams()) != null) {
                                        layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                                        layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                                    }
                                    TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.t9x);
                                    if (tuxTextView != null) {
                                        tuxTextView.setTuxFont(102);
                                    }
                                }
                                viewHolderLIZ = new C1363570laV(viewTd, sharePanelViewModel);
                            }
                        } else {
                            int i4 = C1363440laI.LLILZLL;
                            SharePanelViewModel sharePanelViewModel2 = this.LL;
                            C788580Uwa c788580Uwa2 = this.LLILZIL;
                            View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cky, viewGroup, false);
                            if (c788580Uwa2 != null && c788580Uwa2.LIZ) {
                                viewTd2.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68));
                                View viewFindViewById2 = viewTd2.findViewById(R.id.t9v);
                                if (viewFindViewById2 != null && (layoutParams = viewFindViewById2.getLayoutParams()) != null) {
                                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                                    layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                                }
                                TuxTextView tuxTextView2 = (TuxTextView) viewTd2.findViewById(R.id.t9x);
                                if (tuxTextView2 != null) {
                                    tuxTextView2.setTuxFont(102);
                                    ((ViewGroup.MarginLayoutParams) tuxTextView2.getLayoutParams()).setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                                }
                            }
                            viewHolderLIZ = new C1363440laI(viewTd2, sharePanelViewModel2);
                        }
                    } else {
                        int i5 = C995260c0S.LL;
                        viewHolderLIZ = C995250c0R.LIZ(viewGroup, true, this.LLILZIL);
                    }
                } else {
                    int i6 = C1381550m3V.LLJI;
                    viewHolderLIZ = C1363490laN.LIZ(viewGroup, this.LL, this.LLILLJJLI, false, this.LLILZIL, 8);
                }
            } else {
                int i7 = C1364130lbP.LLJIJIL;
                viewHolderLIZ = C1363600laY.LIZ(viewGroup, this.LL, false, this.LLILLJJLI, this.LLILZIL, 4);
            }
        } else {
            int i8 = C1363580laW.LLIZLLLIL;
            viewHolderLIZ = C1363590laX.LIZ(viewGroup, this.LL, false, this.LLILLJJLI, this.LLILZIL, false, 36);
        }
        try {
            View view = viewHolderLIZ.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolderLIZ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolderLIZ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolderLIZ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolderLIZ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolderLIZ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolderLIZ.getClass().getName();
        return viewHolderLIZ;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        C1363960lb8 c1363960lb8;
        if (list.isEmpty()) {
            super.onBindViewHolder(viewHolder, i, list);
        } else {
            if (!(viewHolder instanceof C1363960lb8) || (c1363960lb8 = (C1363960lb8) viewHolder) == null) {
                return;
            }
            c1363960lb8.R5(((Boolean) ListProtector.get(list, 0)).booleanValue());
        }
    }

    public C1363420laG(SharePanelViewModel sharePanelViewModel, InterfaceC1362600lYw interfaceC1362600lYw, Context context, C897520ZIw c897520ZIw, C788580Uwa c788580Uwa) {
        this.LL = sharePanelViewModel;
        this.LLILLJJLI = interfaceC1362600lYw;
        this.LLILLL = context;
        this.LLILZ = c897520ZIw;
        this.LLILZIL = c788580Uwa;
    }
}
