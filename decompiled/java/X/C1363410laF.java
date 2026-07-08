package X;

import Y.ACListenerS124S0200000_21;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0laF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1363410laF extends AbstractC1362700lZ6 implements InterfaceC1356400lOw {
    public SharePanelViewModel LL;
    public final C1214170hhX LLILLJJLI;
    public final InterfaceC1362600lYw LLILLL;
    public final InterfaceC897330ZId LLILZ;
    public final boolean LLILZIL;
    public final List<IMContact> LLILZLL = new ArrayList();
    public final List<Integer> LLIZ = new ArrayList();
    public final List<Integer> LLIZLLLIL = new ArrayList();
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(302));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(557));
    public LifecycleOwner LLJIJIL;

    @Override // X.InterfaceC1356400lOw
    public final void LJLL(RecyclerView recyclerView, List list) {
    }

    @Override // X.InterfaceC1356400lOw
    public final void LLJJIJIIJIL(List<? extends InterfaceC1369790lkX> list) {
    }

    public final List<IMContact> getData() {
        return (List) this.LLJ.getValue();
    }

    @Override // X.AbstractC1362700lZ6
    public final List<IMContact> LLLFZ() {
        return getData();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return getData().size();
    }

    @Override // X.AbstractC1362700lZ6, X.InterfaceC1356400lOw
    public final void refresh() {
        notifyItemRangeChanged(0, getData().size());
    }

    @Override // X.AbstractC1362700lZ6
    public final void LLLI(SharePanelViewModel sharePanelViewModel) {
        this.LL = sharePanelViewModel;
    }

    public final void LLLII(IMContact iMContact) {
        Iterator<IMContact> it2 = getData().iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next(), iMContact)) {
                if (i != -1) {
                    ((ArrayList) this.LLILZLL).add(iMContact);
                    ((ArrayList) this.LLIZ).add(Integer.valueOf(i));
                    notifyItemChanged(i, Boolean.TRUE);
                    return;
                }
                return;
            }
            i++;
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Object obj = ListProtector.get(getData(), i);
        if (obj instanceof C1363750lan) {
            return 6;
        }
        if (obj instanceof C1363150lZp) {
            return 2;
        }
        if (obj instanceof C1365460ldY) {
            return 3;
        }
        if (!(obj instanceof MAFIMUser)) {
            if (obj instanceof C1363320la6) {
                return 5;
            }
            if (obj instanceof C1363170lZr) {
                return 8;
            }
            if (obj instanceof C1363740lam) {
                return 7;
            }
            if (obj instanceof C1363710laj) {
                return 9;
            }
            if (obj instanceof C1363140lZo) {
                return 11;
            }
            return 1;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        InterfaceC1363770lap interfaceC1363770lap;
        super.onViewAttachedToWindow(viewHolder);
        if ((viewHolder instanceof InterfaceC1363770lap) && (interfaceC1363770lap = (InterfaceC1363770lap) viewHolder) != null) {
            interfaceC1363770lap.onAttachedToWindow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        InterfaceC1363770lap interfaceC1363770lap;
        super.onViewDetachedFromWindow(viewHolder);
        if ((viewHolder instanceof InterfaceC1363770lap) && (interfaceC1363770lap = (InterfaceC1363770lap) viewHolder) != null) {
            interfaceC1363770lap.onDetachedFromWindow();
        }
    }

    @Override // X.AbstractC1362700lZ6, X.InterfaceC1356400lOw
    public final void LLJILJILJ(LifecycleOwner lifecycleOwner, List list) {
        this.LLJIJIL = lifecycleOwner;
        Integer numValueOf = null;
        if (list == null) {
            getData().clear();
            notifyDataSetChanged();
        } else if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            if (this.LLILLJJLI != null) {
                arrayList.add(new IMContact() { // from class: X.0lan
                });
            }
            if (this.LL.LJII()) {
                arrayList.add(new C1363320la6());
            }
            arrayList.addAll(list);
            arrayList.add(new C1363150lZp(EnumC994650bzT.NORMAL));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((IMContact) it2.next()).setShareSuccess(false);
            }
            C1363700lai.LIZ(getData(), arrayList, this, false, null, C13BV.INSTANCE);
            List<IMContact> data = getData();
            data.clear();
            data.addAll(arrayList);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setData: ");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", ");
        sbLIZ.append(getData().size());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1363710laj c1363710laj;
        C1363660lae takoInfo;
        if (viewHolder instanceof C1363580laW) {
            ((C1363580laW) viewHolder).I5(i, (IMContact) ListProtector.get(getData(), i), this.LL);
            return;
        }
        if (viewHolder instanceof C1364130lbP) {
            ((C1364130lbP) viewHolder).I5((C1365460ldY) ListProtector.get(getData(), i), this.LL, i);
            return;
        }
        if (viewHolder instanceof C1363960lb8) {
            int iIndexOf = this.LL.LJIIJJI().indexOf(ListProtector.get(getData(), i));
            IMContact iMContact = (IMContact) ListProtector.get(getData(), i);
            boolean zContains = ((ArrayList) this.LLIZ).contains(Integer.valueOf(i));
            boolean zContains2 = ((ArrayList) this.LLIZLLLIL).contains(Integer.valueOf(i));
            SharePanelViewModel sharePanelViewModel = this.LL;
            C054G c054g = sharePanelViewModel.LLJL;
            IMContact iMContact2 = (IMContact) ListProtector.get(getData(), i);
            C328270Ctt c328270Ctt = C328270Ctt.LL;
            ((C1363960lb8) viewHolder).I5(iMContact, i, zContains, zContains2, sharePanelViewModel, c054g, C328270Ctt.LIZ(iMContact2, sharePanelViewModel.LLJJIJI), iIndexOf);
            return;
        }
        if (viewHolder instanceof C1381550m3V) {
            ((C1381550m3V) viewHolder).I5((MAFIMUser) ListProtector.get(getData(), i), this.LL);
            return;
        }
        if (viewHolder instanceof C1361550lXF) {
            ((C1361550lXF) viewHolder).I5((IMContact) ListProtector.get(getData(), i), this.LL);
            return;
        }
        if (viewHolder instanceof C1362520lYo) {
            ((C1362520lYo) viewHolder).I5((IMContact) ListProtector.get(getData(), i), this.LL);
            return;
        }
        if (viewHolder instanceof C1363650lad) {
            C1363650lad c1363650lad = (C1363650lad) viewHolder;
            C1214170hhX c1214170hhX = this.LLILLJJLI;
            if (c1214170hhX != null) {
                C1214160hhW c1214160hhW = (C1214160hhW) c1363650lad.LL.findViewById(R.id.v14);
                c1214160hhW.LIZ(false);
                c1214160hhW.LJ(c1214170hhX);
                return;
            }
            c1363650lad.getClass();
            return;
        }
        if (!(viewHolder instanceof C1363450laJ)) {
            return;
        }
        C1363450laJ c1363450laJ = (C1363450laJ) viewHolder;
        IMContact iMContact3 = (IMContact) ListProtector.get(getData(), i);
        SharePanelViewModel sharePanelViewModel2 = this.LL;
        C054G c054g2 = sharePanelViewModel2.LLJL;
        IMContact iMContact4 = (IMContact) ListProtector.get(getData(), i);
        C328270Ctt c328270Ctt2 = C328270Ctt.LL;
        InterfaceC332260D0u interfaceC332260D0uLIZ = C328270Ctt.LIZ(iMContact4, sharePanelViewModel2.LLJJIJI);
        c1363450laJ.getClass();
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        if (!(iMContact3 instanceof C1363710laj) || (c1363710laj = (C1363710laj) iMContact3) == null || (takoInfo = c1363710laj.getTakoInfo()) == null) {
            return;
        }
        c1363450laJ.LLILLL.setText(takoInfo.LIZ);
        takoInfo.LIZIZ.invoke(c1363450laJ.LLILZ, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))));
        c1363450laJ.LLIZ.LIZ(iMContact3, "SHARE_PANEL", new AwS422S0200000_21(c1363450laJ, iMContact3, 125));
        c1363450laJ.LL = sharePanelViewModel2;
        c1363450laJ.LLILZLL = i;
        ACListenerS124S0200000_21 aCListenerS124S0200000_21 = new ACListenerS124S0200000_21(iMContact3, c1363450laJ, 94);
        C786410Ut5.U8(c1363450laJ.LLILLJJLI, aCListenerS124S0200000_21);
        C786410Ut5.Y7(c1363450laJ.LLILZIL, aCListenerS124S0200000_21);
        AnonymousClass0956 anonymousClass0956 = c1363450laJ.LLIZLLLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (c054g2 != null) {
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(c054g2, null, null, new C323590CmL(interfaceC332260D0uLIZ, c1363450laJ, null), 3);
        }
        c1363450laJ.LLIZLLLIL = anonymousClass0956LIZLLL;
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1363450laJ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        boolean z = true;
        switch (i) {
            case 2:
                int i2 = C1363580laW.LLIZLLLIL;
                c1363450laJ = C1363590laX.LIZ(viewGroup, this.LL, true, null, null, this.LLILZIL, 24);
                break;
            case 3:
                int i3 = C1364130lbP.LLJIJIL;
                c1363450laJ = C1363600laY.LIZ(viewGroup, this.LL, true, this.LLILLL, null, 16);
                break;
            case 4:
                int i4 = C1381550m3V.LLJI;
                c1363450laJ = C1363490laN.LIZ(viewGroup, this.LL, this.LLILLL, true, null, 16);
                break;
            case 5:
                int i5 = C1361550lXF.LLJILJIL;
                c1363450laJ = C1341760l1K.LIZ(viewGroup, this.LL, true, true, false, 0, 0, 240);
                break;
            case 6:
                int i6 = C1363650lad.LLILLJJLI;
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.crz, viewGroup, false);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("create(): itemView = ");
                sbLIZ.append(viewTd);
                C2188811AlT.LIZIZ(sbLIZ);
                c1363450laJ = new C1363650lad(viewTd);
                break;
            case 7:
                int i7 = C995260c0S.LL;
                c1363450laJ = C995250c0R.LIZ(viewGroup, true, null);
                break;
            case 8:
                int i8 = C1362520lYo.LLJI;
                z = true;
                c1363450laJ = C1341770l1L.LIZ(0, 1, 0, viewGroup, this.LL, false, true);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                int i9 = C1363450laJ.LLJ;
                SharePanelViewModel sharePanelViewModel = this.LL;
                View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f85, viewGroup, false);
                C426750GoL.LJIIL(viewTd2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, 16);
                TuxTextView tuxTextView = (TuxTextView) viewTd2.findViewById(R.id.p0w);
                ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
                if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                    C786410Ut5.R6(tuxTextView, marginLayoutParams);
                }
                c1363450laJ = new C1363450laJ(viewTd2, sharePanelViewModel);
                break;
            default:
                int i10 = C1363960lb8.LLJJJJ;
                c1363450laJ = C1363460laK.LIZ(viewGroup, this.LL, this.LLILLL, true, null, this.LLILZ, 128);
                break;
        }
        C2211751BhN.LIZ(c1363450laJ.itemView, new C1402380mb6(c1363450laJ, this, 5));
        try {
            View view = c1363450laJ.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1363450laJ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1363450laJ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", z)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1363450laJ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1363450laJ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1363450laJ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1363450laJ.getClass().getName();
        return c1363450laJ;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        Boolean bool;
        if (list.isEmpty()) {
            super.onBindViewHolder(viewHolder, i, list);
            return;
        }
        Object objLJJJLL = C13LP.LJJJLL(list);
        if (objLJJJLL instanceof Boolean) {
            bool = (Boolean) objLJJJLL;
        } else {
            bool = null;
        }
        if (!(viewHolder instanceof C1363960lb8)) {
            return;
        }
        if (bool != null) {
            ((C1363960lb8) viewHolder).R5(bool.booleanValue());
        }
        if (!(C13LP.LJJJLL(list) instanceof C1363690lah)) {
            return;
        }
        ((C1363960lb8) viewHolder).LLJIJIL = i;
    }

    public C1363410laF(SharePanelViewModel sharePanelViewModel, C1214170hhX c1214170hhX, InterfaceC1362600lYw interfaceC1362600lYw, C897520ZIw c897520ZIw, boolean z) {
        this.LL = sharePanelViewModel;
        this.LLILLJJLI = c1214170hhX;
        this.LLILLL = interfaceC1362600lYw;
        this.LLILZ = c897520ZIw;
        this.LLILZIL = z;
    }
}
