package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.api.activestatus.IActiveStatusObserverProducer;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelImHeadViewModel;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: renamed from: X.0laD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1363390laD extends AbstractC1362700lZ6 implements InterfaceC1356400lOw {
    public SharePanelViewModel LL;
    public final InterfaceC897330ZId LLILLJJLI;
    public final SharePanelImHeadViewModel LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public boolean LLJ;
    public final EnumC1364050lbH LLJI;
    public final Function1<? super IMContact, Unit> LLJIJIL;
    public InterfaceC1362600lYw LLJILJIL;
    public boolean LLJILJILJ;
    public final C01GW LLJILLL;
    public LifecycleOwner LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public boolean LLJJIJI;
    public final Set<String> LLJJIJIIJIL;

    @Override // X.InterfaceC1356400lOw
    public void LLJJIJIIJIL(List<? extends InterfaceC1369790lkX> list) {
    }

    public final int LLLIIIIL() {
        return ((Number) this.LLJILLL.getValue()).intValue();
    }

    public final List<IMContact> getData() {
        return (List) this.LLJJIII.getValue();
    }

    @Override // X.AbstractC1362700lZ6
    public final List<IMContact> LLLFZ() {
        return getData();
    }

    @Override // X.AbstractC21673619ry
    public int getItemCount() {
        return getData().size();
    }

    @Override // X.AbstractC1362700lZ6, X.InterfaceC1356400lOw
    public final void refresh() {
        notifyItemRangeChanged(0, getData().size(), Boolean.TRUE);
    }

    @Override // X.AbstractC1362700lZ6
    public final void LLLI(SharePanelViewModel sharePanelViewModel) {
        this.LL = sharePanelViewModel;
    }

    public final C1364170lbT LLLII(ViewGroup viewGroup) {
        int i = C1364170lbT.LLJJJJ;
        SharePanelViewModel sharePanelViewModel = this.LL;
        boolean z = this.LLJ;
        int dimensionPixelSize = this.LLIZ;
        boolean z2 = this.LLILZ;
        int i2 = this.LLIZLLLIL;
        int iLLLIIIIL = LLLIIIIL();
        InterfaceC1362600lYw interfaceC1362600lYw = this.LLJILJIL;
        EnumC1364050lbH enumC1364050lbH = this.LLJI;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f8_, viewGroup, false);
        if (dimensionPixelSize <= 0) {
            C844470XAv.LIZ.getClass();
            dimensionPixelSize = C844470XAv.LIZ().getResources().getDimensionPixelSize(R.dimen.a2y);
        }
        return new C1364170lbT(viewTd, sharePanelViewModel, z, dimensionPixelSize, z2, i2, iLLLIIIIL, interfaceC1362600lYw, enumC1364050lbH);
    }

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        return ListProtector.get(getData(), i).hashCode();
    }

    @Override // X.AbstractC21673619ry
    public int getItemViewType(int i) {
        IMContact iMContact = (IMContact) ListProtector.get(getData(), i);
        if (iMContact instanceof C1363200lZu) {
            return 6;
        }
        if (iMContact instanceof C1363150lZp) {
            if (((C1363150lZp) iMContact).getIconStyle().isRightArrow()) {
                return 10;
            }
            return 2;
        }
        if (iMContact instanceof C1363320la6) {
            return 3;
        }
        if (iMContact instanceof C1363310la5) {
            return 4;
        }
        if (iMContact instanceof C1363280la2) {
            return 5;
        }
        if (iMContact instanceof C1363680lag) {
            return 7;
        }
        if (iMContact instanceof C1363710laj) {
            return 8;
        }
        if (iMContact instanceof C1363190lZt) {
            return 11;
        }
        if (iMContact instanceof C1363140lZo) {
            return 12;
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

    @Override // X.InterfaceC1356400lOw
    public final void LJLL(RecyclerView recyclerView, List list) {
        int i;
        if (list == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) list;
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                Object next = it2.next();
                if ((next instanceof IMUser) || (next instanceof IMConversation)) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (i2 >= 0 && arrayList.size() >= (i = i2 + 1)) {
            arrayList2.addAll(arrayList.subList(0, i2));
            arrayList2.addAll(arrayList.subList(i, arrayList.size()));
            if (recyclerView != null) {
                recyclerView.setItemAnimator(null);
            }
            List<IMContact> data = getData();
            SharePanelViewModel sharePanelViewModel = this.LL;
            C1363700lai.LIZ(data, arrayList2, this, false, sharePanelViewModel.LLJZ, C13LP.LLIIII(sharePanelViewModel.LJIILL()));
            if (C866950Xzh.LIZIZ(list)) {
                getData().clear();
                getData().addAll(arrayList2);
            }
            C1362210lYJ c1362210lYJ = new C1362210lYJ(recyclerView, this, list, i2);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C412501j1(c1362210lYJ, recyclerView, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02ca A[LOOP:1: B:162:0x02c4->B:164:0x02ca, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011f  */
    @Override // X.AbstractC1362700lZ6, X.InterfaceC1356400lOw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LLJILJILJ(androidx.lifecycle.LifecycleOwner r20, java.util.List r21) {
        /*
            Method dump skipped, instruction units count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1363390laD.LLJILJILJ(androidx.lifecycle.LifecycleOwner, java.util.List):void");
    }

    @Override // X.AbstractC21673619ry
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1363140lZo c1363140lZo;
        UrlModel displayAvatar;
        UrlModel displayAvatar2;
        C1363710laj c1363710laj;
        C1363660lae takoInfo;
        C0ZK1 c0zk1;
        C0ZE7 activityStatusParams;
        AbstractC595720NYc abstractC595720NYcLJ;
        EnumC1364010lbD enumC1364010lbD;
        C1362510lYn c1362510lYn;
        Boolean bool;
        View viewFindViewById;
        C0NZ5 c0nz5;
        C595660NXw c595660NXw;
        AnonymousClass0956 anonymousClass0956LIZ;
        Drawable drawableI5;
        Bundle bundle;
        IMContact iMContact = (IMContact) C13LP.LJJJLZIJ(i, getData());
        if (iMContact == null) {
            return;
        }
        String string = null;
        if (viewHolder instanceof C1362840lZK) {
            C1362840lZK c1362840lZK = (C1362840lZK) viewHolder;
            SharePanelViewModel sharePanelViewModel = this.LL;
            c1362840lZK.LLILZIL = iMContact;
            iMContact.displayPosition = i;
            c1362840lZK.LL = sharePanelViewModel;
            c1362840lZK.LLILZLL = i;
            if (c1362840lZK.LLILLJJLI == EnumC994650bzT.RIGHT_ARROW) {
                drawableI5 = c1362840lZK.I5(R.raw.icon_chevron_right_ltr, c1362840lZK.LLILZ.getContext());
            } else {
                drawableI5 = c1362840lZK.I5(R.raw.icon_magnifying_glass_fill, c1362840lZK.LLILZ.getContext());
            }
            c1362840lZK.LLILZ.setImageDrawable(drawableI5);
            q0.LJIJ(c1362840lZK.itemView, new C1266330j3f(5));
            SharePanelViewModel sharePanelViewModel2 = c1362840lZK.LL;
            SharePackage sharePackage = sharePanelViewModel2.LL;
            if (sharePackage != null && (bundle = sharePackage.extras) != null) {
                C786410Ut5.LJJJI("button_source", bundle.getString("enter_method"), bundle);
                bundle.putInt("rank_num", c1362840lZK.getBindingAdapterPosition());
            }
            SharePanelViewModel.LJIJ(sharePanelViewModel2);
            return;
        }
        boolean zBooleanValue = false;
        if (viewHolder instanceof C1363950lb7) {
            this.LL.LJIIJJI().indexOf(iMContact);
            if (!this.LLJJIJI) {
                C1363780laq.LIZ.getClass();
                C1363780laq.LIZJ++;
            }
            C1363950lb7 c1363950lb7 = (C1363950lb7) viewHolder;
            SharePanelViewModel sharePanelViewModel3 = this.LL;
            if (this.LLJJIJI) {
                c0zk1 = null;
            } else {
                C1363780laq.LIZ.getClass();
                c0zk1 = (C0ZK1) C1363780laq.LJFF.getValue();
            }
            c1363950lb7.LLJJI = iMContact;
            iMContact.displayPosition = sharePanelViewModel3.LJIIJJI().indexOf(iMContact);
            c1363950lb7.LLJJJJ.LIZ(iMContact, "SHARE_PANEL", new AwS565S0100000_21(c1363950lb7, 1585));
            c1363950lb7.LL = sharePanelViewModel3;
            c1363950lb7.LLJJIII = i;
            InterfaceC1363370laB interfaceC1363370laB = sharePanelViewModel3.LLIZLLLIL;
            if (interfaceC1363370laB != null) {
                activityStatusParams = interfaceC1363370laB.getActivityStatusParams();
            } else {
                activityStatusParams = null;
            }
            c1363950lb7.LLJJJIL = activityStatusParams;
            if (iMContact instanceof IMUser) {
                IMUser iMUser = (IMUser) iMContact;
                c1363950lb7.itemView.setContentDescription(iMUser.getDisplayName());
                c1363950lb7.S5(iMUser);
                c1363950lb7.U5(iMUser);
                zBooleanValue = false;
                ((IDMAvatarLoader) c1363950lb7.LLJJL.getValue()).LJ(iMUser, new C0ZKF(0, 0, 0, 0, 0, c0zk1, 31));
                c1363950lb7.I5(iMContact.getUid(), null);
            } else if (iMContact instanceof IMConversation) {
                IMConversation iMConversation = (IMConversation) iMContact;
                c1363950lb7.itemView.setContentDescription(iMConversation.getConversationName());
                c1363950lb7.R5(iMConversation);
                c1363950lb7.U5(iMConversation);
                zBooleanValue = false;
                ((IDMAvatarLoader) c1363950lb7.LLJJL.getValue()).LJ(iMConversation, new C0ZKF(0, 0, 0, 0, 0, c0zk1, 31));
                c1363950lb7.I5(null, iMConversation.getConversationId());
            } else {
                c1363950lb7.I5(null, null);
            }
            C0ZJ7.LIZ(c1363950lb7.itemView);
            IActiveStatusObserverProducer.LIZ.getClass();
            IActiveStatusObserverProducer iActiveStatusObserverProducerLIZ = C1362550lYr.LIZ();
            if (iActiveStatusObserverProducerLIZ != null) {
                abstractC595720NYcLJ = iActiveStatusObserverProducerLIZ.LJ(iMContact);
            } else {
                abstractC595720NYcLJ = null;
            }
            if (C595800NYk.LIZ().imitateLiveDataInShareScenario) {
                AnonymousClass0956 anonymousClass0956 = c1363950lb7.LLLF;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                InterfaceC897330ZId interfaceC897330ZId = c1363950lb7.LLILZIL;
                if (interfaceC897330ZId != null && abstractC595720NYcLJ != null) {
                    c0nz5 = new C0NZ5(interfaceC897330ZId, abstractC595720NYcLJ);
                    c595660NXw = (C595660NXw) c0nz5.LIZJ.getValue();
                } else {
                    c0nz5 = null;
                    c595660NXw = null;
                }
                c1363950lb7.T5(iMContact, C896480ZEw.LIZIZ(c595660NXw));
                if (c0nz5 != null) {
                    anonymousClass0956LIZ = c0nz5.LIZ(c1363950lb7.LLLFF, new C1363470laL(c1363950lb7, iMContact, null));
                } else {
                    anonymousClass0956LIZ = null;
                }
                c1363950lb7.LLLF = anonymousClass0956LIZ;
            } else {
                InterfaceC897380ZIi.LIZIZ.getClass();
                C595660NXw c595660NXwLIZIZ = C897370ZIh.LIZ().LIZIZ(abstractC595720NYcLJ);
                c1363950lb7.LLJJJJJIL = C896480ZEw.LIZJ(c595660NXwLIZIZ);
                c1363950lb7.T5(iMContact, C896480ZEw.LIZIZ(c595660NXwLIZIZ));
            }
            String displayName = iMContact.getDisplayName();
            if (displayName == null || displayName.length() == 0 || (enumC1364010lbD = (EnumC1364010lbD) ((LinkedHashMap) C1363360laA.LIZ).get(displayName)) == null) {
                enumC1364010lbD = EnumC1364010lbD.NONE;
            }
            c1363950lb7.W5(enumC1364010lbD);
            String displayName2 = iMContact.getDisplayName();
            if (displayName2 == null || displayName2.length() == 0 || (c1362510lYn = (C1362510lYn) ((LinkedHashMap) C1363360laA.LIZIZ).get(displayName2)) == null) {
                c1362510lYn = new C1362510lYn(zBooleanValue, zBooleanValue, 4);
            }
            C786410Ut5.J5(c1363950lb7.LLJILJIL, 1.0f);
            View view = c1363950lb7.itemView;
            if (view != null && (viewFindViewById = view.findViewById(R.id.bi2)) != null) {
                C786410Ut5.T4(viewFindViewById, 1.0f);
            }
            c1363950lb7.V5(c1362510lYn, Boolean.valueOf(c1362510lYn.LIZJ));
            String displayName3 = iMContact.getDisplayName();
            if (displayName3 != null && displayName3.length() != 0 && (bool = (Boolean) ((LinkedHashMap) C1363360laA.LIZJ).get(displayName3)) != null) {
                zBooleanValue = bool.booleanValue();
            }
            c1363950lb7.LLJJIJIIJIL = !zBooleanValue;
            c1363950lb7.LLJLL.LIZJ(iMContact);
            q0.LJIJ(c1363950lb7.itemView, new C1402420mbA(c1363950lb7, 10));
            AnonymousClass0956 anonymousClass09562 = c1363950lb7.LLJL;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            c1363950lb7.LLJL = C23250099c.LIZLLL(c1363950lb7.LL.LLJL, null, null, new C1363530laR(c1363950lb7, iMContact, null), 3);
            AnonymousClass0956 anonymousClass09563 = c1363950lb7.LLJLIL;
            if (anonymousClass09563 != null) {
                anonymousClass09563.LIZIZ(null);
            }
            c1363950lb7.LLJLIL = C23250099c.LIZLLL(c1363950lb7.LL.LLJL, null, null, new C1363520laQ(c1363950lb7, iMContact, null), 3);
            AnonymousClass0956 anonymousClass09564 = c1363950lb7.LLJLILLLLZIIL;
            if (anonymousClass09564 != null) {
                anonymousClass09564.LIZIZ(null);
            }
            c1363950lb7.LLJLILLLLZIIL = C23250099c.LIZLLL(c1363950lb7.LL.LLJL, null, null, new C1363550laT(c1363950lb7, iMContact, null), 3);
            C1364290lbf c1364290lbf = c1363950lb7.LLJJJ;
            if (c1364290lbf == null) {
                return;
            }
            c1364290lbf.LIZIZ(iMContact, c1363950lb7.LL, c1363950lb7.LLJLL, c1363950lb7.LLJJJIL);
            return;
        }
        if (viewHolder instanceof C1361550lXF) {
            ((C1361550lXF) viewHolder).I5(iMContact, this.LL);
            return;
        }
        if (viewHolder instanceof C1362520lYo) {
            ((C1362520lYo) viewHolder).I5(iMContact, this.LL);
            return;
        }
        if (viewHolder instanceof C1363510laP) {
            C1363510laP c1363510laP = (C1363510laP) viewHolder;
            c1363510laP.LL = this.LL;
            c1363510laP.L5(iMContact);
            c1363510laP.LLILLJJLI.LIZ(iMContact, "SHARE_PANEL", AFwS209S0000000_21.get$arr$(632));
            return;
        }
        if (viewHolder instanceof C1363560laU) {
            C1363560laU c1363560laU = (C1363560laU) viewHolder;
            c1363560laU.LL = this.LL;
            c1363560laU.LLILLJJLI = iMContact;
            c1363560laU.LLILZ.LIZ(iMContact, "SHARE_PANEL", new AwS565S0100000_21(c1363560laU, 1568));
            c1363560laU.LLILLL = i;
            if (!(iMContact instanceof C1363200lZu)) {
                return;
            }
            C1363200lZu c1363200lZu = (C1363200lZu) iMContact;
            if (c1363200lZu.getMafUsers().size() > 1) {
                C786410Ut5.j((C422820Gi0) c1363560laU.itemView.findViewById(R.id.hzh), 0);
                C786410Ut5.j((C422820Gi0) c1363560laU.itemView.findViewById(R.id.ugg), 0);
                C0I98.LJFF((C1322110kVd) c1363560laU.itemView.findViewById(R.id.hzh), ((BaseContact) ListProtector.get(c1363200lZu.getMafUsers(), 0)).getDisplayAvatar(), "", null, null, 0, 0, true, null, false);
                C0I98.LJFF((C1322110kVd) c1363560laU.itemView.findViewById(R.id.ugg), ((BaseContact) ListProtector.get(c1363200lZu.getMafUsers(), 1)).getDisplayAvatar(), "", null, null, 0, 0, true, null, false);
                C786410Ut5.j((C422820Gi0) c1363560laU.itemView.findViewById(R.id.biz), 8);
                return;
            }
            if (c1363200lZu.getMafUsers().size() != 1) {
                return;
            }
            C0I98.LJFF((C1322110kVd) c1363560laU.itemView.findViewById(R.id.biz), ((BaseContact) ListProtector.get(c1363200lZu.getMafUsers(), 0)).getDisplayAvatar(), "", null, null, 0, 0, true, null, false);
            C786410Ut5.j((C422820Gi0) c1363560laU.itemView.findViewById(R.id.hzh), 8);
            C786410Ut5.j((C422820Gi0) c1363560laU.itemView.findViewById(R.id.ugg), 8);
            C786410Ut5.j((C422820Gi0) c1363560laU.itemView.findViewById(R.id.biz), 0);
            return;
        }
        if (viewHolder instanceof C1363670laf) {
            return;
        }
        if (viewHolder instanceof C1363970lb9) {
            C1363970lb9 c1363970lb9 = (C1363970lb9) viewHolder;
            SharePanelViewModel sharePanelViewModel4 = this.LL;
            c1363970lb9.getClass();
            if (!(iMContact instanceof C1363710laj) || (c1363710laj = (C1363710laj) iMContact) == null || (takoInfo = c1363710laj.getTakoInfo()) == null) {
                return;
            }
            c1363970lb9.LLILLJJLI.setText(takoInfo.LIZ);
            InterfaceC1631620sYq<ImageView, Integer, Integer, Unit> interfaceC1631620sYq = takoInfo.LIZIZ;
            C427660Gpo c427660Gpo = c1363970lb9.LLILLL;
            interfaceC1631620sYq.invoke(c427660Gpo, Integer.valueOf(c427660Gpo.getLayoutParams().width), Integer.valueOf(c1363970lb9.LLILLL.getLayoutParams().height));
            c1363970lb9.LLILZLL = iMContact;
            c1363970lb9.LLJI.LIZ(iMContact, "SHARE_PANEL", new AwS422S0200000_21(c1363970lb9, iMContact, 131));
            c1363970lb9.LL = sharePanelViewModel4;
            c1363970lb9.LLJIJIL.LIZJ(iMContact);
            q0.LJIJ(c1363970lb9.itemView, new C1402420mbA(c1363970lb9, 11));
            AnonymousClass0956 anonymousClass09565 = c1363970lb9.LLIZLLLIL;
            if (anonymousClass09565 != null) {
                anonymousClass09565.LIZIZ(null);
            }
            c1363970lb9.LLIZLLLIL = C23250099c.LIZLLL(c1363970lb9.LL.LLJL, null, null, new C1363990lbB(c1363970lb9, null), 3);
            C1364290lbf c1364290lbf2 = c1363970lb9.LLJ;
            if (c1364290lbf2 == null) {
                return;
            }
            c1364290lbf2.LIZIZ(iMContact, c1363970lb9.LL, c1363970lb9.LLJIJIL, null);
            return;
        }
        if (viewHolder instanceof C1364170lbT) {
            ((C1364170lbT) viewHolder).I5(i, iMContact, this.LL);
            return;
        }
        if (!(viewHolder instanceof C1362050lY3)) {
            return;
        }
        C1362050lY3 c1362050lY3 = (C1362050lY3) viewHolder;
        SharePanelViewModel sharePanelViewModel5 = this.LL;
        c1362050lY3.getClass();
        if (!(iMContact instanceof C1363140lZo) || (c1363140lZo = (C1363140lZo) iMContact) == null) {
            return;
        }
        c1362050lY3.LLILZIL = c1363140lZo;
        c1362050lY3.LL = sharePanelViewModel5;
        C1363140lZo c1363140lZo2 = (C1363140lZo) iMContact;
        int size = c1363140lZo2.getContacts().size();
        if (size < 2) {
            return;
        }
        BaseContact baseContact = (BaseContact) C13LP.LJJJLZIJ(0, c1363140lZo2.getContacts());
        if (baseContact != null) {
            displayAvatar = baseContact.getDisplayAvatar();
        } else {
            displayAvatar = null;
        }
        ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(displayAvatar);
        BaseContact baseContact2 = (BaseContact) C13LP.LJJJLZIJ(1, c1363140lZo2.getContacts());
        if (baseContact2 != null) {
            displayAvatar2 = baseContact2.getDisplayAvatar();
        } else {
            displayAvatar2 = null;
        }
        ImageUrlModel imageUrlModelLIZ2 = C438710HIf.LIZ(displayAvatar2);
        C430200Gtu c430200Gtu = c1362050lY3.LLILLJJLI;
        if (c430200Gtu != null) {
            C430200Gtu.LIZ(c430200Gtu, imageUrlModelLIZ);
        }
        C430200Gtu c430200Gtu2 = c1362050lY3.LLILLJJLI;
        if (c430200Gtu2 != null) {
            C430200Gtu.LIZIZ(c430200Gtu2, imageUrlModelLIZ2);
        }
        TuxTextView tuxTextView = c1362050lY3.LLILLL;
        if (tuxTextView != null) {
            Context context = c1362050lY3.itemView.getContext();
            if (context != null) {
                string = context.getString(2131840051, String.valueOf(size));
            }
            tuxTextView.setText(string);
        }
        c1362050lY3.LLILZ.LIZ(iMContact, "SHARE_PANEL", new AwS565S0100000_21(c1362050lY3, 1580));
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0166  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r27, int r28) {
        /*
            Method dump skipped, instruction units count: 1468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1363390laD.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    public C1363390laD(SharePanelViewModel sharePanelViewModel, InterfaceC897330ZId interfaceC897330ZId, SharePanelImHeadViewModel sharePanelImHeadViewModel) {
        this.LL = sharePanelViewModel;
        this.LLILLJJLI = interfaceC897330ZId;
        this.LLILLL = sharePanelImHeadViewModel;
        this.LLILZLL = true;
        int i = C1363950lb7.LLLFFI;
        this.LLIZ = C1363950lb7.LLLFFI;
        this.LLIZLLLIL = 2;
        this.LLJI = EnumC1364050lbH.MASK_WITH_CHECK_MARK;
        this.LLJILLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(556));
        this.LLJJI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(554));
        this.LLJJIII = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(555));
        this.LLJJIJIIJIL = new LinkedHashSet();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        C1363690lah c1363690lah;
        C1363690lah c1363690lah2;
        if (list.isEmpty()) {
            super.onBindViewHolder(viewHolder, i, list);
            return;
        }
        Object objLJJJLL = C13LP.LJJJLL(list);
        if (!(objLJJJLL instanceof Boolean)) {
            objLJJJLL = null;
        }
        IMContact iMContact = (IMContact) C13LP.LJJJLZIJ(i, getData());
        if (iMContact == null) {
            return;
        }
        if (Intrinsics.LJFF(objLJJJLL, Boolean.TRUE)) {
            if (viewHolder instanceof C1363950lb7) {
                ((C1363950lb7) viewHolder).LLJLL.LIZJ(iMContact);
            } else if (viewHolder instanceof C1361550lXF) {
                C1361550lXF c1361550lXF = (C1361550lXF) viewHolder;
                int iP5 = c1361550lXF.P5();
                c1361550lXF.T5(iP5);
                c1361550lXF.U5(iP5, iMContact);
            } else if (viewHolder instanceof C1362520lYo) {
                C1362520lYo c1362520lYo = (C1362520lYo) viewHolder;
                c1362520lYo.P5();
                c1362520lYo.R5(iMContact);
            } else if (viewHolder instanceof C1363510laP) {
                ((C1363510laP) viewHolder).L5(iMContact);
            } else if (viewHolder instanceof C1364170lbT) {
                ((C1364170lbT) viewHolder).LLJJIJIIJIL.LIZJ(iMContact);
            }
        }
        boolean z = viewHolder instanceof C1363950lb7;
        if (z) {
            Object objLJJJLL2 = C13LP.LJJJLL(list);
            if ((objLJJJLL2 instanceof C1363690lah) && (c1363690lah2 = (C1363690lah) objLJJJLL2) != null && c1363690lah2.LIZIZ) {
                C1363950lb7 c1363950lb7 = (C1363950lb7) viewHolder;
                c1363950lb7.LLJJIJI = true;
                C1362510lYn c1362510lYn = new C1362510lYn(true, false, 4);
                c1363950lb7.V5(c1362510lYn, null);
                String displayName = iMContact.getDisplayName();
                C1362510lYn c1362510lYn2 = new C1362510lYn(c1362510lYn.LIZ, c1362510lYn.LIZIZ, c1363950lb7.LLJJIJI);
                if (displayName != null && displayName.length() != 0) {
                    C1363360laA.LIZIZ.put(displayName, c1362510lYn2);
                }
                EnumC1364010lbD enumC1364010lbD = EnumC1364010lbD.SELECTED;
                c1363950lb7.W5(enumC1364010lbD);
                String displayName2 = iMContact.getDisplayName();
                if (displayName2 != null && displayName2.length() != 0) {
                    C1363360laA.LIZ.put(displayName2, enumC1364010lbD);
                }
            }
        }
        Object objLJJJLL3 = C13LP.LJJJLL(list);
        if (!(objLJJJLL3 instanceof C1363690lah) || (c1363690lah = (C1363690lah) objLJJJLL3) == null || !(iMContact instanceof IMUser) || !z) {
            return;
        }
        if (!C13LP.LJJJJ(iMContact.getUid(), this.LLJJIJIIJIL)) {
            return;
        }
        ((C1363950lb7) viewHolder).S5((IMUser) iMContact);
        if (Intrinsics.LJFF(iMContact.getUid(), c1363690lah.LIZ)) {
            return;
        }
        C19719512Dh.LIZ(this.LLJJIJIIJIL).remove(iMContact.getUid());
    }

    public C1363390laD(SharePanelViewModel sharePanelViewModel, C1363630lab c1363630lab, InterfaceC897330ZId interfaceC897330ZId) {
        this(sharePanelViewModel, interfaceC897330ZId, (SharePanelImHeadViewModel) null);
        this.LLILZ = false;
        this.LLILZIL = c1363630lab.LIZ;
        this.LLIZ = c1363630lab.LIZIZ;
        this.LLIZLLLIL = c1363630lab.LIZJ;
        this.LLILZLL = c1363630lab.LIZLLL;
        this.LLJI = c1363630lab.LJ;
        this.LLJIJIL = c1363630lab.LJFF;
    }
}
