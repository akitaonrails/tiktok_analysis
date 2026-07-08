package X;

import Y.ALAdapterS6S0000000_32;
import android.animation.Animator;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.api.IPaidSeriesLiveApiService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.fragment.PaidSeriesAddedListFragment;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01nE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C438601nE extends AbsSlotWidget<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> implements C01SH {
    public InterfaceC21213717zz LLILLL;
    public IIconSlot.SlotViewModel LLILZ;
    public Room LLILZIL;
    public final C11NJ LLILZLL = new C11NJ();
    public final C01GW LLIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(574));
    public final BPEAHandler LLIZLLLIL = new BPEAHandler(Looper.getMainLooper());

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "live_paid_series";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Tn0] */
    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        final ?? r0 = new InterfaceC752610Tff() { // from class: X.0Tn0
            @Override // X.InterfaceC752610Tff
            public final void LIZ(View view, String str) {
                Context context;
                C19EG c19egLIZIZ;
                long id;
                InterfaceC21213717zz interfaceC21213717zz = this.LIZ.LLILLL;
                if (interfaceC21213717zz != null && (context = interfaceC21213717zz.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                    C438601nE c438601nE = this.LIZ;
                    C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                    c1390920mIc.LJIIIIZZ(1);
                    c1390920mIc.LIZ.LLJJL = (int) (((double) C497820Jfg.LIZ(c19egLIZIZ)) * 0.73d);
                    C757170Tn1 c757170Tn1 = PaidSeriesAddedListFragment.LLJJI;
                    Room room = c438601nE.LLILZIL;
                    if (room != null) {
                        id = room.getId();
                    } else {
                        id = 0;
                    }
                    c757170Tn1.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putLong("room_id", id);
                    bundle.putBoolean("is_before_live", true);
                    PaidSeriesAddedListFragment paidSeriesAddedListFragment = new PaidSeriesAddedListFragment();
                    paidSeriesAddedListFragment.setArguments(bundle);
                    TuxSheet tuxSheet = c1390920mIc.LIZ;
                    tuxSheet.LLJJIJI = paidSeriesAddedListFragment;
                    tuxSheet.LLJLILLLLZIIL = false;
                    tuxSheet.LLJJIJIIJIL = true;
                    tuxSheet.LLJLL = true;
                    tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC512701zB(c438601nE, 11);
                    tuxSheet.showNow(c19egLIZIZ.getSupportFragmentManager(), null);
                }
            }
        };
        return new IIconSlot(r0) { // from class: X.1819
            public final InterfaceC752610Tff LIZ;

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final void getScheme() {
            }

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final Animator.AnimatorListener LIZ() {
                return new ALAdapterS6S0000000_32(4);
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

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        this.LLILZLL.dispose();
    }

    public final void LJJ() {
        boolean zLJI = MethodIDManager.LJI(202187);
        IPaidSeriesLiveApiService iPaidSeriesLiveApiService = (IPaidSeriesLiveApiService) this.LLIZ.getValue();
        Room room = this.LLILZIL;
        this.LLILZLL.LIZ(iPaidSeriesLiveApiService.getSeriesNum(room != null ? room.getId() : 0L).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C516201zk(this, 348), new C09JN() { // from class: X.01i9
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("PaidSeriesBeforeLiveWidget@71.getSeriesNum$2");
                C1C7U.LIZIZ("PaidSeriesBeforeLiveWidget@71.getSeriesNum$2");
            }
        }));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC756810TmR.SLOT_BROADCAST_PREVIEW_TOOLBAR;
    }

    @Override // X.C01SH
    public final Object LJIILLIIL(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        long id;
        try {
            IPaidSeriesLiveApiService iPaidSeriesLiveApiService = (IPaidSeriesLiveApiService) this.LLIZ.getValue();
            Room room = this.LLILZIL;
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            if (iPaidSeriesLiveApiService.LIZ(id).LJ().status_code == 0) {
                C786410Ut5.LJJZZIII(this.LLIZLLLIL, new RunnableC514801zW(this, 201));
                return true;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return false;
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
        long id;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) viewModel;
        this.LL = slotViewModel;
        this.LLILLJJLI = interfaceC21213717zz;
        this.LLILLL = interfaceC21213717zz;
        this.LLILZ = slotViewModel;
        LJJ();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_series_dollar;
        c419910GdJ.LIZLLL = Integer.valueOf(C446980Hfs.LIZ(interfaceC21213717zz.getContext(), R.color.ac4));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(interfaceC21213717zz.getContext());
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_series_dollar;
        TuxIconDrawable tuxIconDrawableLIZ2 = c419910GdJ2.LIZ(interfaceC21213717zz.getContext());
        slotViewModel.LLIZ.setValue(Boolean.FALSE);
        slotViewModel.LLILZ.setValue(Boolean.TRUE);
        slotViewModel.LLJ.setValue(tuxIconDrawableLIZ);
        slotViewModel.LLJILJILJ.setValue(interfaceC21213717zz.getContext().getString(2131847359));
        slotViewModel.LLJIJIL.setValue(tuxIconDrawableLIZ2);
        slotViewModel.LLJILLL.setValue(interfaceC21213717zz.getContext().getString(2131847351));
        slotViewModel.LLJLIL = 10000L;
        slotViewModel.LLJJ.setValue(interfaceC21213717zz.getContext().getString(2131847358));
        C1236090iGt c1236090iGt = C1236090iGt.LIZ;
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        Room room = this.LLILZIL;
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        String strValueOf = String.valueOf(id);
        c1236090iGt.getClass();
        C1236090iGt.LIZIZ(currentUserID, strValueOf);
    }

    @Override // X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        Object obj = map.get("param_live_paid_series");
        Room room = null;
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Object obj2 = map.get("param_room");
        if (obj2 instanceof Room) {
            room = (Room) obj2;
        }
        this.LLILZIL = room;
        interfaceC756140TlM.LIZ(Intrinsics.LJFF(obj, Boolean.TRUE));
    }
}
