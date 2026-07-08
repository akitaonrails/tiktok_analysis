package X;

import Y.ALAdapterS0S0000000_12;
import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.tunnel.BroadcastTunnelVM;
import com.bytedance.android.livesdkapi.depend.model.live.PaidContentInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.fragment.PaidSeriesAddedListFragment;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tn2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C757180Tn2 extends AbsSlotWidget<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> {
    public IIconSlot.SlotViewModel LLILLL;
    public InterfaceC21213717zz LLILZ;
    public Room LLILZIL;

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "live_paid_series";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Tn4] */
    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        final ?? r0 = new AbstractC757140Tmy() { // from class: X.0Tn4
            @Override // X.AbstractC757140Tmy
            public final void LIZIZ() {
                Context context;
                C19EG c19egLIZIZ;
                BroadcastTunnelVM broadcastTunnelVMLIZ;
                MutableLiveData<EnumC517850KSp> mutableLiveData;
                C757180Tn2 c757180Tn2 = this.LJ;
                InterfaceC21213717zz interfaceC21213717zz = c757180Tn2.LLILZ;
                if (interfaceC21213717zz == null || (context = interfaceC21213717zz.getContext()) == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) {
                    return;
                }
                if (C290160BYw.LIZ()) {
                    InterfaceC757210Tn5 interfaceC757210Tn5K3 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).K3();
                    InterfaceC21213717zz interfaceC21213717zz2 = c757180Tn2.LLILZ;
                    broadcastTunnelVMLIZ = interfaceC757210Tn5K3.LIZIZ(interfaceC21213717zz2 != null ? interfaceC21213717zz2.getContext() : null);
                } else {
                    broadcastTunnelVMLIZ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).K3().LIZ(c19egLIZIZ);
                }
                if (broadcastTunnelVMLIZ != null && (mutableLiveData = broadcastTunnelVMLIZ.LL) != null) {
                    mutableLiveData.setValue(EnumC517850KSp.STREAM_ON);
                }
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                c1390920mIc.LJIIIIZZ(1);
                c1390920mIc.LIZ.LLJJL = (int) (((double) C497820Jfg.LIZ(c19egLIZIZ)) * 0.73d);
                C757170Tn1 c757170Tn1 = PaidSeriesAddedListFragment.LLJJI;
                Room room = c757180Tn2.LLILZIL;
                long id = room != null ? room.getId() : 0L;
                c757170Tn1.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("room_id", id);
                bundle.putBoolean("is_before_live", false);
                PaidSeriesAddedListFragment paidSeriesAddedListFragment = new PaidSeriesAddedListFragment();
                paidSeriesAddedListFragment.setArguments(bundle);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIJI = paidSeriesAddedListFragment;
                tuxSheet.LLJLILLLLZIIL = false;
                tuxSheet.LLJJIJIIJIL = true;
                tuxSheet.LLJLL = true;
                tuxSheet.showNow(c19egLIZIZ.getSupportFragmentManager(), null);
            }
        };
        return new IIconSlot(r0) { // from class: X.0Tn3
            public final InterfaceC752610Tff LIZ;

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final void getScheme() {
            }

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final Animator.AnimatorListener LIZ() {
                return new ALAdapterS0S0000000_12(0);
            }

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final InterfaceC752610Tff LIZJ() {
                return this.LIZ;
            }

            {
                this.LIZ = r0;
            }
        };
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        C622680Oba.LIZLLL(this);
    }

    @C14EU
    public final void onPopCardEvent(C7828033y c7828033y) {
        MutableLiveData<Drawable> mutableLiveData;
        Context context;
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<Drawable> mutableLiveData2;
        if (c7828033y.LIZ) {
            InterfaceC21213717zz interfaceC21213717zz = this.LLILZ;
            if (interfaceC21213717zz != null && (context = interfaceC21213717zz.getContext()) != null && (slotViewModel = this.LLILLL) != null && (mutableLiveData2 = slotViewModel.LLJILJIL) != null) {
                mutableLiveData2.setValue(C19LH.LIZ(context.getResources(), R.drawable.c18, null));
                return;
            }
            return;
        }
        IIconSlot.SlotViewModel slotViewModel2 = this.LLILLL;
        if (slotViewModel2 == null || (mutableLiveData = slotViewModel2.LLJILJIL) == null) {
            return;
        }
        mutableLiveData.postValue(null);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) viewModel;
        this.LL = slotViewModel;
        this.LLILLJJLI = interfaceC21213717zz;
        this.LLILZ = interfaceC21213717zz;
        this.LLILLL = slotViewModel;
        C622680Oba.LIZJ(this);
        Long lValueOf = null;
        Drawable drawableLIZ = C420660GeW.LIZ(interfaceC21213717zz.getContext().getResources(), R.drawable.c2a, null);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_series_dollar;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(interfaceC21213717zz.getContext());
        slotViewModel.LLILZ.setValue(Boolean.TRUE);
        slotViewModel.LLJ.setValue(drawableLIZ);
        slotViewModel.LLJILJILJ.setValue(interfaceC21213717zz.getContext().getString(2131847359));
        slotViewModel.LLJIJIL.setValue(tuxIconDrawableLIZ);
        slotViewModel.LLJILLL.setValue(interfaceC21213717zz.getContext().getString(2131847351));
        C1236090iGt c1236090iGt = C1236090iGt.LIZ;
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        Room room = this.LLILZIL;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        }
        String strValueOf = String.valueOf(lValueOf);
        c1236090iGt.getClass();
        C1236090iGt.LIZIZ(currentUserID, strValueOf);
    }

    @Override // X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        Room room;
        PaidContentInfo paidContentInfo;
        Object obj = map.get("param_room");
        Boolean boolValueOf = null;
        if (obj instanceof Room) {
            room = (Room) obj;
        } else {
            room = null;
        }
        this.LLILZIL = room;
        if (room != null && (paidContentInfo = room.paidContentInfo) != null) {
            boolValueOf = Boolean.valueOf(paidContentInfo.paidContentPermission);
        }
        interfaceC756140TlM.LIZ(Intrinsics.LJFF(boolValueOf, Boolean.TRUE));
    }
}
