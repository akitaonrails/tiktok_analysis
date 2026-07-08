package X;

import Y.ACListenerS116S0200000_12;
import Y.AObserverS216S0100000_12;
import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TlG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C756080TlG extends AbstractC21673619ry<C756090TlH> {
    public final LiveDialogFragment LL;
    public final EnumC756810TmR LLILLJJLI;
    public final C756100TlI LLILLL;
    public final List<InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR>> LLILZ = new ArrayList();
    public boolean LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILZ).size();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String LLLFZ(String str) {
        switch (str.hashCode()) {
            case -1949982086:
                if (str.equals("business_links")) {
                    Context context = this.LL.getContext();
                    if (context == null) {
                        return null;
                    }
                    return context.getString(2131847357);
                }
                return "";
            case -1925858825:
                if (str.equals("ec_shop")) {
                    Context context2 = this.LL.getContext();
                    if (context2 == null) {
                        return null;
                    }
                    return context2.getString(2131847354);
                }
                return "";
            case -1732499337:
                if (str.equals("live_paid_series")) {
                    Context context3 = this.LL.getContext();
                    if (context3 == null) {
                        return null;
                    }
                    return context3.getString(2131847356);
                }
                return "";
            case -1455115807:
                if (str.equals("local_service")) {
                    Context context4 = this.LL.getContext();
                    if (context4 == null) {
                        return null;
                    }
                    return context4.getString(2131857080);
                }
                return "";
            case 671572535:
                if (str.equals("game_partnership")) {
                    Context context5 = this.LL.getContext();
                    if (context5 == null) {
                        return null;
                    }
                    return context5.getString(2131843173);
                }
                return "";
            case 1224862632:
                if (str.equals("ba_leads_gen")) {
                    Context context6 = this.LL.getContext();
                    if (context6 == null) {
                        return null;
                    }
                    return context6.getString(2131847355);
                }
                return "";
            default:
                return "";
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ViewModel viewModel;
        boolean z;
        int i2;
        MutableLiveData<Boolean> mutableLiveData;
        String value;
        Drawable value2;
        String value3;
        AbsSlotWidget absSlotWidget;
        C756090TlH c756090TlH = (C756090TlH) viewHolder;
        InterfaceC1124060fMC interfaceC1124060fMC = (InterfaceC1124060fMC) ListProtector.get(this.LLILZ, i);
        IIconSlot.SlotViewModel slotViewModel = null;
        if ((interfaceC1124060fMC instanceof AbsSlotWidget) && (absSlotWidget = (AbsSlotWidget) interfaceC1124060fMC) != null) {
            viewModel = absSlotWidget.LL;
        } else {
            viewModel = null;
        }
        if ((viewModel instanceof IIconSlot.SlotViewModel) && (slotViewModel = (IIconSlot.SlotViewModel) viewModel) != null) {
            MutableLiveData<String> mutableLiveData2 = slotViewModel.LLJILLL;
            if (mutableLiveData2 != null && (value3 = mutableLiveData2.getValue()) != null) {
                ((TextView) c756090TlH.LL.findViewById(R.id.title)).setText(value3);
            }
            MutableLiveData<Drawable> mutableLiveData3 = slotViewModel.LLJIJIL;
            if (mutableLiveData3 != null && (value2 = mutableLiveData3.getValue()) != null) {
                ((LiveIconView) c756090TlH.LL.findViewById(R.id.jxe)).setImageDrawable(value2);
            }
            MutableLiveData<String> mutableLiveData4 = slotViewModel.LLILZLL;
            if (mutableLiveData4 != null && (value = mutableLiveData4.getValue()) != null) {
                c756090TlH.I5(value);
            }
        }
        if (slotViewModel != null && Intrinsics.LJFF(slotViewModel.LLLFFI, Boolean.TRUE)) {
            C786410Ut5.T4(c756090TlH.LL, slotViewModel.LLLIIII);
        }
        if (Intrinsics.LJFF(interfaceC1124060fMC.LIZ(), "ec_shop") && slotViewModel != null && (mutableLiveData = slotViewModel.LLIZ) != null && Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE)) {
            z = true;
        } else {
            z = false;
        }
        C426770GoN c426770GoN = (C426770GoN) c756090TlH.LL.findViewById(R.id.t16);
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LLLLLLIL(c426770GoN, i2);
        if (slotViewModel != null) {
            MutableLiveData<String> mutableLiveData5 = slotViewModel.LLJILLL;
            if (mutableLiveData5 != null) {
                mutableLiveData5.observe(this.LL, new AObserverS216S0100000_12(c756090TlH, 48));
            }
            MutableLiveData<Drawable> mutableLiveData6 = slotViewModel.LLJIJIL;
            if (mutableLiveData6 != null) {
                mutableLiveData6.observe(this.LL, new AObserverS216S0100000_12(c756090TlH, 49));
            }
            MutableLiveData<String> mutableLiveData7 = slotViewModel.LLILZLL;
            if (mutableLiveData7 != null) {
                mutableLiveData7.observe(this.LL, new AObserverS216S0100000_12(c756090TlH, 50));
            }
        }
        C786410Ut5.I7(new ACListenerS116S0200000_12(this, interfaceC1124060fMC, 39), c756090TlH.LL);
        if (slotViewModel != null && Intrinsics.LJFF(slotViewModel.LLLII, Boolean.TRUE)) {
            slotViewModel.LLLII = Boolean.FALSE;
            HandlerHook.viewPostDelay(c756090TlH.LL, new ARunnableS112S0100000_12(c756090TlH, 208), 2500L);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C756090TlH c756090TlH = new C756090TlH(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hmt, viewGroup, false));
        try {
            View view = c756090TlH.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c756090TlH.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c756090TlH.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C756090TlH.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c756090TlH.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c756090TlH.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C756090TlH.class.getName();
        return c756090TlH;
    }

    public C756080TlG(LiveDialogFragment liveDialogFragment, EnumC756810TmR enumC756810TmR, C756100TlI c756100TlI) {
        this.LL = liveDialogFragment;
        this.LLILLJJLI = enumC756810TmR;
        this.LLILLL = c756100TlI;
    }
}
