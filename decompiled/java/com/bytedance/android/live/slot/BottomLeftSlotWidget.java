package com.bytedance.android.live.slot;

import X.AnonymousClass0956;
import X.C0IJT;
import X.C1098990ehl;
import X.C1123980fM4;
import X.C1161920gLG;
import X.C1295960jpS;
import X.C16F5;
import X.C447180HgC;
import X.C474500IjA;
import X.C497740JfY;
import X.C520010KaN;
import X.C770580UKq;
import X.C780690Ujr;
import X.C783190Unt;
import X.C785020Uqq;
import X.C786410Ut5;
import X.EnumC1102640ene;
import X.EnumC1102740eno;
import X.EnumC756810TmR;
import X.EnumC785140Ur2;
import X.InterfaceC1088880eRS;
import X.InterfaceC1123890fLv;
import X.InterfaceC1124060fMC;
import X.InterfaceC770540UKm;
import Y.ACListenerS147S0100000_12;
import Y.ACListenerS79S0300000_12;
import Y.AComparatorS31S0000000_12;
import Y.ALAdapterS9S0100000_12;
import Y.AObjectS355S0100000_12;
import Y.AObserverS125S0300000_12;
import Y.AObserverS177S0200000_12;
import Y.AObserverS216S0100000_12;
import Y.AObserverS78S0400000_12;
import android.content.Context;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNewMessageVisible;
import com.bytedance.android.livesdk.ecommerce.datachannel.EcLiveBarrageEnable;
import com.bytedance.android.livesdk.event.NotifyGamePartnershipIconVisible;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes13.dex */
public class BottomLeftSlotWidget extends RoomRecycleWidget implements WeakHandler.IHandler, InterfaceC1123890fLv {
    public static final List<C785020Uqq> LLJJIJIIJIL;
    public InterfaceC770540UKm LL;
    public ImageView LLILLJJLI;
    public FrameLayout LLILLL;
    public View LLILZ;
    public TextView LLILZIL;
    public ImageView LLILZLL;
    public C16F5 LLIZ;
    public C1295960jpS LLIZLLLIL;
    public IIconSlot.SlotViewModel LLJ;
    public Queue<C1123980fM4> LLJI;
    public Map<C1123980fM4, IIconSlot.SlotViewModel> LLJIJIL;
    public EnumC785140Ur2 LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public long LLJJ;
    public C447180HgC LLJJI;
    public InterfaceC1124060fMC LLJJIII;
    public final ALAdapterS9S0100000_12 LLJJIJI = new ALAdapterS9S0100000_12(this, 10);

    @Override // X.InterfaceC1123890fLv
    public final /* synthetic */ void LJJL(IIconSlot.SlotViewModel slotViewModel) {
    }

    @Override // X.InterfaceC1123890fLv
    public final /* synthetic */ View LJLLI() {
        return null;
    }

    @Override // X.InterfaceC1123890fLv
    public final /* synthetic */ void P0(Boolean bool) {
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    static {
        ArrayList arrayList = new ArrayList();
        LLJJIJIIJIL = arrayList;
        arrayList.add(new C785020Uqq((int) C497740JfY.LIZIZ(30.0f), (int) C497740JfY.LIZIZ(30.0f), 0, 255));
        arrayList.add(new C785020Uqq((int) C497740JfY.LIZIZ(28.0f), (int) C497740JfY.LIZIZ(28.0f), (int) C497740JfY.LIZIZ(6.0f), 204));
        arrayList.add(new C785020Uqq((int) C497740JfY.LIZIZ(26.0f), (int) C497740JfY.LIZIZ(26.0f), (int) C497740JfY.LIZIZ(12.0f), 102));
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        DataChannel dataChannel = this.dataChannel;
        boolean z = dataChannel != null && Boolean.TRUE.equals(dataChannel.gg0(C780690Ujr.class));
        this.LLJILJILJ = z;
        return z ? R.layout.hzq : R.layout.hzp;
    }

    public final void y1() {
        C786410Ut5.LJZI(8, this.LLILZLL);
        C786410Ut5.LLIL(this.LLILZIL, 8);
        C786410Ut5.LJLLLLLL(8, this.LLILZ);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        InterfaceC1088880eRS interfaceC1088880eRSMn1 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(this.dataChannel);
        if (interfaceC1088880eRSMn1 != null) {
            interfaceC1088880eRSMn1.LJIIIZ(EnumC1102640ene.BOTTOM_LEFT_SLOT, this.dataChannel);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        InterfaceC1088880eRS interfaceC1088880eRSMn1 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(this.dataChannel);
        if (interfaceC1088880eRSMn1 != null) {
            interfaceC1088880eRSMn1.LJIIJ(EnumC1102640ene.BOTTOM_LEFT_SLOT, this.dataChannel);
        }
    }

    public final void A1(InterfaceC1124060fMC interfaceC1124060fMC) {
        String str;
        show();
        HashMap map = new HashMap();
        if (!this.LLJILLL) {
            InterfaceC770540UKm interfaceC770540UKm = this.LL;
            if (interfaceC770540UKm != null) {
                C783190Unt.LIZ(this.LLJJ, map, interfaceC770540UKm.getDataContainer());
            }
            C770580UKq.LIZLLL(interfaceC1124060fMC, map);
        }
        C770580UKq.LIZIZ(interfaceC1124060fMC, map);
        this.LLJILLL = true;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toolbar_button_show");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII(EnumC1102740eno.ICON_SLOT.getIdentifier(), "button_name");
        if (C497740JfY.LJIL()) {
            str = "portrait";
        } else {
            str = "landscape";
        }
        c474500IjALIZ.LJJII(str, "room_orientation");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC1123890fLv
    public final void g(EnumC785140Ur2 enumC785140Ur2) {
        this.LLJILJIL = enumC785140Ur2;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public final void onGetRoomInfo(Room room) {
        onLoad(getRecycleSourceInfo().loadFrom, null);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LLILLJJLI = (ImageView) findViewById(R.id.y7j);
        this.LLILLL = (FrameLayout) findViewById(R.id.y7k);
        this.LLILZIL = (TextView) findViewById(R.id.y78);
        this.LLILZLL = (ImageView) findViewById(R.id.y76);
        this.LLILZ = findViewById(R.id.y7f);
        this.LLIZLLLIL = (C1295960jpS) findViewById(R.id.y79);
        if (this.LLJILJILJ) {
            this.LLIZ = (C16F5) findViewById(R.id.y7s);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        AnonymousClass0956 anonymousClass0956;
        IIconSlot.SlotViewModel slotViewModel = this.LLJ;
        if (slotViewModel != null) {
            slotViewModel.vQ2(this);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(EcLiveBarrageEnable.class, Boolean.TRUE);
        }
        Queue<C1123980fM4> queue = this.LLJI;
        if (queue != null) {
            ((PriorityBlockingQueue) queue).clear();
        }
        Map<C1123980fM4, IIconSlot.SlotViewModel> map = this.LLJIJIL;
        if (map != null) {
            Iterator it2 = ((HashMap) map).values().iterator();
            while (it2.hasNext()) {
                ((IIconSlot.SlotViewModel) it2.next()).vQ2(this);
            }
            ((HashMap) this.LLJIJIL).clear();
        }
        C447180HgC c447180HgC = this.LLJJI;
        if (c447180HgC != null && (anonymousClass0956 = c447180HgC.LIZIZ) != null) {
            anonymousClass0956.LIZIZ(null);
        }
        InterfaceC770540UKm interfaceC770540UKm = this.LL;
        if (interfaceC770540UKm != null) {
            interfaceC770540UKm.onDestroy();
            getLifecycle().removeObserver(this.LL);
        }
    }

    public final void x1(boolean z) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toolbar_button_click");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII(EnumC1102740eno.ICON_SLOT.getIdentifier(), "button_name");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_false_trigger");
        if (C497740JfY.LJIL()) {
            str = "portrait";
        } else {
            str = "landscape";
        }
        c474500IjALIZ.LJJII(str, "room_orientation");
        c474500IjALIZ.LIZ();
    }

    public final void B1(InterfaceC1124060fMC interfaceC1124060fMC, IIconSlot.SlotViewModel slotViewModel) {
        IIconSlot iIconSlot = (IIconSlot) interfaceC1124060fMC.LLILZLL();
        slotViewModel.LLJILJIL.observe(this, new AObserverS177S0200000_12(this, slotViewModel, 1));
        slotViewModel.LLIZ.observe(this, new AObserverS177S0200000_12(this, slotViewModel, 2));
        slotViewModel.LLILZLL.observe(this, new AObserverS177S0200000_12(this, slotViewModel, 3));
        slotViewModel.LLJ.observe(this, new AObserverS177S0200000_12(this, slotViewModel, 4));
        slotViewModel.LLJI.observe(this, new AObserverS177S0200000_12(this, slotViewModel, 5));
        slotViewModel.LLJJIJI.observe(this, new AObserverS78S0400000_12(this, slotViewModel, iIconSlot, interfaceC1124060fMC, 0));
        if (this.LLJILJILJ) {
            slotViewModel.LLJILJILJ.observe(this, new AObserverS177S0200000_12(this, slotViewModel, 6));
        }
        slotViewModel.LLJJIII.observe(this, new AObserverS125S0300000_12(this, slotViewModel, interfaceC1124060fMC, 4));
        slotViewModel.LLJJJJ.observe(this, new AObserverS216S0100000_12(this, 14));
        C1098990ehl.LIZIZ(getView(), new ACListenerS79S0300000_12(this, iIconSlot, interfaceC1124060fMC, 0), new ACListenerS147S0100000_12(this, 71));
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) {
        hide();
        y1();
        this.LLILZLL.setImageDrawable(null);
        this.LLILZIL.setText((CharSequence) null);
        this.LLILLJJLI.setImageDrawable(null);
        C16F5 c16f5 = this.LLIZ;
        if (c16f5 != null) {
            c16f5.setText((CharSequence) null);
        }
        this.LLJJ = SystemClock.uptimeMillis();
        Context contextLJJIIZI = C520010KaN.LJJIIZI(getContext(), false);
        if (contextLJJIIZI != null) {
            this.LL = ((ISlotService) C1161920gLG.LIZJ(ISlotService.class)).createIconSlotController(contextLJJIIZI, this, EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR, EnumC785140Ur2.PRIORITY, null);
        }
        this.LLJI = new PriorityBlockingQueue(3, new AComparatorS31S0000000_12(0));
        this.LLJIJIL = new HashMap();
        InterfaceC770540UKm interfaceC770540UKm = this.LL;
        if (interfaceC770540UKm != null) {
            interfaceC770540UKm.setDataChannel(this.dataChannel);
            this.LL.load(EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR);
            getLifecycle().addObserver(this.LL);
        }
        if (getView() != null) {
            getView().setTag("BottomLeftSlotWidget");
        }
        DataChannel dataChannel = this.dataChannel;
        dataChannel.BQ2(this, PublicScreenNewMessageVisible.class, new AObjectS355S0100000_12(this, 1));
        dataChannel.BQ2(this, NotifyGamePartnershipIconVisible.class, new AObjectS355S0100000_12(this, 2));
    }

    @Override // X.InterfaceC1123890fLv
    public final void t1(InterfaceC1124060fMC interfaceC1124060fMC, IIconSlot.SlotViewModel slotViewModel) {
        this.LLJ = slotViewModel;
        if (slotViewModel != null && getView() != null) {
            this.LLJ.LL.postValue(Boolean.TRUE);
            slotViewModel.LLILZ.observe(this, new AObserverS125S0300000_12(this, slotViewModel, interfaceC1124060fMC, 2));
            B1(interfaceC1124060fMC, slotViewModel);
        }
    }

    @Override // X.InterfaceC1123890fLv
    public final void v1(C1123980fM4 c1123980fM4, IIconSlot.SlotViewModel slotViewModel) {
        ((PriorityBlockingQueue) this.LLJI).add(c1123980fM4);
        ((HashMap) this.LLJIJIL).put(c1123980fM4, slotViewModel);
        EnumC785140Ur2 enumC785140Ur2 = this.LLJILJIL;
        if (enumC785140Ur2 == EnumC785140Ur2.FIRST) {
            slotViewModel.LLILZ.observe(this, new AObserverS125S0300000_12(this, slotViewModel, c1123980fM4, 3));
        } else if (enumC785140Ur2 == EnumC785140Ur2.LAST) {
            slotViewModel.LLILZ.observe(this, new AObserverS125S0300000_12(this, slotViewModel, c1123980fM4, 0));
        } else {
            if (enumC785140Ur2 != EnumC785140Ur2.PRIORITY) {
                return;
            }
            slotViewModel.LLILZ.observe(this, new AObserverS125S0300000_12(this, slotViewModel, c1123980fM4, 1));
        }
    }

    public final void z1(InterfaceC1124060fMC interfaceC1124060fMC, boolean z) {
        if (z) {
            this.LLJJIII = interfaceC1124060fMC;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && Boolean.TRUE.equals(dataChannel.gg0(NotifyGamePartnershipIconVisible.class))) {
                return;
            }
            A1(interfaceC1124060fMC);
            return;
        }
        this.LLJJIII = null;
        hide();
        C770580UKq.LIZIZ(interfaceC1124060fMC, null);
    }
}
