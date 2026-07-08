package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter;
import com.bytedance.pipo.stellar.base.fragment.StellarCardHostAbility;
import com.bytedance.pipo.stellar.base.fragment.StellarCardHostAbilityKt$createStellarCardHostAbility$1;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.model.ContainerCardDO;
import com.bytedance.pipo.stellar.base.model.LayoutParamDO;
import com.bytedance.pipo.stellar.base.model.MarginDO;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0usm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720860usm extends AbstractC1720840usk<ContainerCardDO> {
    public Function0<? extends InterfaceC1720700usW> LLILZ;
    public Function0<? extends Fragment> LLILZIL;

    @Override // X.AbstractC1720840usk
    public final int LJ() {
        return R.layout.adw;
    }

    @Override // X.AbstractC1720840usk
    public final void LJFF(View view, ContainerCardDO containerCardDO, EnumC1720670usT enumC1720670usT) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        String str;
        LinearLayoutManager linearLayoutManager;
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZIZ3;
        int iLIZIZ4;
        int iLJIIJJI;
        int iLJIIJJI2;
        InterfaceC1720700usW interfaceC1720700usWInvoke;
        C423640GjK c423640GjK;
        Fragment fragmentInvoke;
        String str2;
        String str3;
        MarginDO marginDO;
        String str4;
        Integer numLJIIJJI;
        MarginDO marginDO2;
        String str5;
        Integer numLJIIJJI2;
        MarginDO marginDO3;
        String str6;
        Integer numLJIIJJI3;
        MarginDO marginDO4;
        String str7;
        Integer numLJIIJJI4;
        C423640GjK c423640GjK2;
        ContainerCardDO containerCardDO2 = containerCardDO;
        super.LJFF(view, containerCardDO2, enumC1720670usT);
        if ((view instanceof ViewOnAttachStateChangeListenerC20604515jv) && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view) != null) {
            LayoutParamDO layoutParam = containerCardDO2.getLayoutParam();
            if (layoutParam != null) {
                str = layoutParam.orientation;
            } else {
                str = null;
            }
            boolean z = true;
            boolean zLJIJI = u.LJIJI(str, "vertical", true);
            RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                linearLayoutManager = null;
            }
            if (linearLayoutManager == null || linearLayoutManager.getOrientation() != zLJIJI) {
                viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), zLJIJI ? 1 : 0, false));
            }
            AbstractC21673719rz itemAnimator = viewOnAttachStateChangeListenerC20604515jv.getItemAnimator();
            if (!(itemAnimator instanceof C423640GjK) || (c423640GjK2 = (C423640GjK) itemAnimator) == null || c423640GjK2.LLJJIJIL != zLJIJI) {
                viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(new C423640GjK(zLJIJI ? 1 : 0));
            }
            LayoutParamDO layoutParam2 = containerCardDO2.getLayoutParam();
            if (layoutParam2 != null && (marginDO4 = layoutParam2.padding) != null && (str7 = marginDO4.start) != null && (numLJIIJJI4 = C2095008Iq.LJIIJJI(str7)) != null) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI4));
            } else {
                iLIZIZ = 0;
            }
            LayoutParamDO layoutParam3 = containerCardDO2.getLayoutParam();
            if (layoutParam3 != null && (marginDO3 = layoutParam3.padding) != null && (str6 = marginDO3.top) != null && (numLJIIJJI3 = C2095008Iq.LJIIJJI(str6)) != null) {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI3));
            } else {
                iLIZIZ2 = 0;
            }
            LayoutParamDO layoutParam4 = containerCardDO2.getLayoutParam();
            if (layoutParam4 != null && (marginDO2 = layoutParam4.padding) != null && (str5 = marginDO2.end) != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str5)) != null) {
                iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI2));
            } else {
                iLIZIZ3 = 0;
            }
            LayoutParamDO layoutParam5 = containerCardDO2.getLayoutParam();
            if (layoutParam5 != null && (marginDO = layoutParam5.padding) != null && (str4 = marginDO.bottom) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str4)) != null) {
                iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI));
            } else {
                iLIZIZ4 = 0;
            }
            viewOnAttachStateChangeListenerC20604515jv.setPadding(iLIZIZ, iLIZIZ2, iLIZIZ3, iLIZIZ4);
            while (viewOnAttachStateChangeListenerC20604515jv.getItemDecorationCount() > 0) {
                viewOnAttachStateChangeListenerC20604515jv.removeItemDecorationAt(0);
            }
            LayoutParamDO layoutParam6 = containerCardDO2.getLayoutParam();
            if (layoutParam6 == null || (str3 = layoutParam6.itemSpaceHorizontal) == null || (iLJIIJJI = C2095008Iq.LJIIJJI(str3)) == null) {
                iLJIIJJI = 0;
            }
            final int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(iLJIIJJI));
            LayoutParamDO layoutParam7 = containerCardDO2.getLayoutParam();
            if (layoutParam7 == null || (str2 = layoutParam7.itemSpaceVertical) == null || (iLJIIJJI2 = C2095008Iq.LJIIJJI(str2)) == null) {
                iLJIIJJI2 = 0;
            }
            final int iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(iLJIIJJI2));
            final int i = zLJIJI ? 1 : 0;
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0DXR(i, iLIZIZ5, iLIZIZ6) { // from class: X.0GjM
                public final int LL;
                public final int LLILLJJLI;
                public final int LLILLL;

                {
                    this.LL = i;
                    this.LLILLJJLI = iLIZIZ5;
                    this.LLILLL = iLIZIZ6;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    if (this.LL == 1) {
                        rect.bottom = this.LLILLL;
                    } else {
                        rect.right = this.LLILLJJLI;
                    }
                }
            });
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Function0<? extends InterfaceC1720700usW> function0 = this.LLILZ;
            if (function0 != null) {
                interfaceC1720700usWInvoke = function0.invoke();
            } else {
                interfaceC1720700usWInvoke = null;
            }
            List<CardDO> cardList = containerCardDO2.getCardList();
            if (cardList == null) {
                cardList = C13BV.INSTANCE;
            }
            final ArrayList<CardDO> arrayList2 = new ArrayList();
            for (CardDO cardDO : cardList) {
                if (!Intrinsics.LJFF(cardDO.getCardShow(), CardStruct.IStatusCode.DEFAULT)) {
                    arrayList2.add(cardDO);
                }
            }
            if (interfaceC1720700usWInvoke == null) {
                final C1720760usc c1720760usc = this.LL;
                final int i2 = zLJIJI ? 1 : 0;
                viewOnAttachStateChangeListenerC20604515jv.setAdapter(new AbstractC21673619ry<C1720930ust>(c1720760usc, arrayList2, i2) { // from class: X.0usn
                    public final C1720760usc LL;
                    public final List<CardDO> LLILLJJLI;
                    public final int LLILLL;

                    @Override // X.AbstractC21673619ry
                    public final int getItemCount() {
                        return this.LLILLJJLI.size();
                    }

                    @Override // X.AbstractC21673619ry
                    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i3) {
                        View view2;
                        C1720930ust c1720930ust = (C1720930ust) viewHolder;
                        C786410Ut5.LJJJJIZL(c1720930ust.LL);
                        Map<String, WeakReference<C1721420utg>> map = C1720940usu.LIZ;
                        AbstractC1720840usk abstractC1720840uskLIZ = C1720940usu.LIZ(c1720930ust.LL.getContext(), this.LL, (CardDO) ListProtector.get(this.LLILLJJLI, i3), null);
                        if (abstractC1720840uskLIZ != null && (view2 = abstractC1720840uskLIZ.LLILLJJLI) != null) {
                            c1720930ust.LL.addView(view2);
                        }
                    }

                    @Override // X.AbstractC21673619ry
                    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i3) {
                        int i4;
                        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                        if (this.LLILLL == 1) {
                            i4 = -1;
                        } else {
                            i4 = -2;
                        }
                        C786410Ut5.a6(frameLayout, new RecyclerView.LayoutParams(i4, -2));
                        C1720930ust c1720930ust = new C1720930ust(frameLayout);
                        try {
                            View view2 = c1720930ust.itemView;
                            if (view2 != null) {
                                view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        c1720930ust.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                        try {
                            if (c1720930ust.itemView.getParent() != null) {
                                try {
                                    SettingsManager.LIZLLL().getClass();
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                    stringBuffer.append(C1720930ust.class.getName());
                                    stringBuffer.append(" parent ");
                                    stringBuffer.append(viewGroup.getClass().getName());
                                    stringBuffer.append(" viewType ");
                                    stringBuffer.append(i3);
                                    C1AF0.LIZJ(stringBuffer.toString());
                                    ViewGroup viewGroup2 = (ViewGroup) c1720930ust.itemView.getParent();
                                    if (viewGroup2 != null) {
                                        C786410Ut5.LJJJLZIJ(c1720930ust.itemView, viewGroup2);
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            C2081408Dk.LIZ(e2);
                            C2344809Gs.LIZ(e2);
                        }
                        C20612085q.LIZ = C1720930ust.class.getName();
                        return c1720930ust;
                    }

                    {
                        this.LL = c1720760usc;
                        this.LLILLJJLI = arrayList2;
                        this.LLILLL = i2;
                    }
                });
                return;
            }
            for (CardDO cardDO2 : arrayList2) {
                StellarCardAdapter<InterfaceC1720550usH> stellarCardAdapterIs2 = interfaceC1720700usWInvoke.is2(cardDO2.getType());
                if (stellarCardAdapterIs2 != null) {
                    linkedHashSet.add(stellarCardAdapterIs2);
                    C1721300utU.LIZ.getClass();
                    InterfaceC1720550usH interfaceC1720550usHLJII = C1721300utU.LJII(stellarCardAdapterIs2, cardDO2);
                    if (interfaceC1720550usHLJII != null) {
                        arrayList.add(interfaceC1720550usHLJII);
                    }
                }
            }
            C1720710usX c1720710usX = new C1720710usX(viewOnAttachStateChangeListenerC20604515jv, interfaceC1720700usWInvoke);
            Function0<? extends Fragment> function02 = this.LLILZIL;
            if (function02 != null && (fragmentInvoke = function02.invoke()) != null) {
                InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentInvoke, null);
                StellarCardHostAbility stellarCardHostAbilityKt$createStellarCardHostAbility$1 = (StellarCardHostAbility) C1558520qew.LIZ(interfaceC665370Q7zLJFF, StellarCardHostAbility.class, null);
                if (stellarCardHostAbilityKt$createStellarCardHostAbility$1 == null) {
                    stellarCardHostAbilityKt$createStellarCardHostAbility$1 = new StellarCardHostAbilityKt$createStellarCardHostAbility$1(new AwS570S0100000_26(interfaceC1720700usWInvoke, 1412));
                    C1558520qew.LJII(interfaceC665370Q7zLJFF, stellarCardHostAbilityKt$createStellarCardHostAbility$1, StellarCardHostAbility.class, null, null);
                }
                stellarCardHostAbilityKt$createStellarCardHostAbility$1.Bz1(viewOnAttachStateChangeListenerC20604515jv, c1720710usX);
            }
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                ((StellarCardAdapter) it2.next()).U5(viewOnAttachStateChangeListenerC20604515jv);
            }
            AbstractC21673719rz itemAnimator2 = viewOnAttachStateChangeListenerC20604515jv.getItemAnimator();
            if ((itemAnimator2 instanceof C423640GjK) && (c423640GjK = (C423640GjK) itemAnimator2) != null) {
                AbstractC21673619ry adapter = viewOnAttachStateChangeListenerC20604515jv.getAdapter();
                if (adapter == null || adapter.getItemCount() <= 0) {
                    z = false;
                }
                c423640GjK.LLJJJ = z;
            }
            c1720710usX.LLILLL = arrayList;
            c1720710usX.LLILLJJLI.getState().LJIILL(arrayList, null);
        }
    }
}
