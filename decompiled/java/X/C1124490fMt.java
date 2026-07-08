package X;

import Y.ACListenerS83S0300000_17;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0fMt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124490fMt extends AbstractC21673619ry<C1124220fMS> {
    public final GiftPanelLeafViewModel LL;
    public List<C1124240fMU> LLILLJJLI = new ArrayList();
    public C1124290fMZ LLILLL;
    public View LLILZ;
    public int LLILZIL;
    public DataChannel LLILZLL;

    public final int LLLFZ() {
        List<C1124240fMU> list = this.LLILLJJLI;
        if (list != null && (!list.isEmpty())) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C1124240fMU c1124240fMU = (C1124240fMU) C13LP.LJJJLZIJ(i, list);
                if (c1124240fMU != null && c1124240fMU.LIZJ == this.LLILZIL) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<C1124240fMU> list = this.LLILLJJLI;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public C1124490fMt(GiftPanelLeafViewModel giftPanelLeafViewModel) {
        this.LL = giftPanelLeafViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLI(int r26) {
        /*
            Method dump skipped, instruction units count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1124490fMt.LLLI(int):void");
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        C1124240fMU c1124240fMU;
        List<C1124240fMU> list = this.LLILLJJLI;
        if (list != null && (c1124240fMU = (C1124240fMU) ListProtector.get(list, i)) != null) {
            return c1124240fMU.LIZJ;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1124240fMU c1124240fMU;
        Integer numLIZJ;
        Context context;
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJJJIZL;
        MutableLiveData<GiftPanelBanner> mutableLiveData;
        C1124220fMS c1124220fMS = (C1124220fMS) viewHolder;
        List<C1124240fMU> list = this.LLILLJJLI;
        if (list != null && (c1124240fMU = (C1124240fMU) ListProtector.get(list, i)) != null) {
            c1124220fMS.I5(c1124240fMU);
            int iIntValue = ((Integer) c1124220fMS.LLILLJJLI.getTag()).intValue();
            C786410Ut5.I7(new ACListenerS83S0300000_17(this, c1124220fMS, c1124240fMU, 10), c1124220fMS.itemView);
            if (iIntValue == this.LLILZIL) {
                GiftPanelBanner giftPanelBanner = c1124240fMU.LJ;
                C1124290fMZ c1124290fMZ = this.LLILLL;
                if (c1124290fMZ != null && (giftPanelLeafViewModelLJJJJIZL = c1124290fMZ.LJJJJIZL()) != null && (mutableLiveData = giftPanelLeafViewModelLJJJJIZL.LL) != null) {
                    mutableLiveData.setValue(giftPanelBanner);
                }
                C16F5 c16f5 = c1124220fMS.LLILLJJLI;
                this.LLILZ = c16f5;
                if (iIntValue == 16) {
                    this.LLILZ = c1124220fMS.LLILLL;
                }
                c16f5.setTextColor(ColorProtector.parseColor("#E6FFFFFF"));
                C786410Ut5.V4(c1124220fMS.LLILLL, 0.9f);
                if (iIntValue == 1) {
                    View view = this.LLILZ;
                    if (!C1124560fN0.LIZ.getBoolean(C1124560fN0.LJ(), false) && C1124560fN0.LIZIZ) {
                        C0J3Y c0j3y = C0J3Y.LIZ;
                        if (view != null) {
                            context = view.getContext();
                        } else {
                            context = null;
                        }
                        View viewLJFF = C0J3Y.LJFF(c0j3y, R.layout.hqf, null, false, context, false, 52);
                        TextView textView = (TextView) viewLJFF.findViewById(R.id.ewp);
                        textView.setText(C497740JfY.LJIJI(2131841896));
                        C785240UrC c785240UrC = new C785240UrC(view);
                        c785240UrC.LIZJ = viewLJFF;
                        c785240UrC.LJIJJ = textView.getText();
                        c785240UrC.LJIILL = new InterfaceC254600ye() { // from class: X.0fMw
                            @Override // X.InterfaceC254600ye
                            public final void onShow() {
                                C1124560fN0.LIZ.storeBoolean(C1124560fN0.LJ(), true);
                                C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
                                c1128760fTm.getClass();
                                C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_panel_price_sorting_guide_popup_show");
                                c474500IjALIZ.LJIL();
                                c474500IjALIZ.LJJII("live", "enter_from_method");
                                String str = c1128760fTm.LJI;
                                if (str == null) {
                                    str = "icon";
                                }
                                c474500IjALIZ.LJJII(str, "gift_enter_from");
                                c474500IjALIZ.LJJII(C1128450fTH.LJIIIZ().getDesc(), "send_gift_scene");
                                c474500IjALIZ.LJJII(C1128760fTm.LJIJJLI() ? "1" : CardStruct.IStatusCode.DEFAULT, C1128760fTm.LJIIJJI);
                                c474500IjALIZ.LIZ();
                            }
                        };
                        c785240UrC.LJIIIIZZ = Mp4ScreenVideoLoadTimeout.CONTROL;
                        c785240UrC.LJIIIZ = true;
                        C1113800f5e.LIZ.LJ(new C785310UrJ(c785240UrC), EnumC1120860fH2.GIFT_PANEL_SORT, this.LLILZLL);
                        return;
                    }
                    return;
                }
                return;
            }
            Context context2 = c1124220fMS.LLILLJJLI.getContext();
            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.eh, context2)) != null) {
                c1124220fMS.LLILLJJLI.setTextColor(numLIZJ.intValue());
            }
            C786410Ut5.V4(c1124220fMS.LLILLL, 0.5f);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewLJI = C0J3Y.LIZ.LJI(R.layout.gr2);
        if (viewLJI != null) {
            if (viewLJI.getLayoutParams() == null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
                marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                C786410Ut5.W5(viewLJI, marginLayoutParams);
            }
        } else {
            viewLJI = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gr2, viewGroup, false);
        }
        C1124220fMS c1124220fMS = new C1124220fMS(viewLJI);
        c1124220fMS.itemView.getRootView().setTag(Integer.valueOf(i));
        c1124220fMS.LLILLJJLI.setTag(Integer.valueOf(i));
        c1124220fMS.LLILLL.setTag(Integer.valueOf(i));
        try {
            View view = c1124220fMS.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1124220fMS.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1124220fMS.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1124220fMS.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1124220fMS.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1124220fMS.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1124220fMS.class.getName();
        return c1124220fMS;
    }
}
