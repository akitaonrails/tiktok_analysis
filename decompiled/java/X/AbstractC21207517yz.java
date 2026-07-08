package X;

import android.os.Bundle;
import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.17yz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21207517yz extends AbsSlotWidget<IFrameSlot, IFrameSlot.SlotViewModel, EnumC1124020fM8> implements InterfaceC21180617ue {
    public AbstractC21206817ys LLILZ;
    public String LLILZLL;
    public final List<AbstractC21206817ys> LLILLL = new ArrayList();
    public final C1123840fLq LLILZIL = new C1123840fLq();

    public boolean LJJ(boolean z) {
        return z;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final /* bridge */ /* synthetic */ List LJLI() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final boolean LLIZLLLIL() {
        return true;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        Iterator<AbstractC21206817ys> it2 = this.LLILLL.iterator();
        while (it2.hasNext()) {
            it2.next().onDestroy();
        }
        ((ArrayList) this.LLILLL).clear();
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDispose() {
        Iterator<AbstractC21206817ys> it2 = this.LLILLL.iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onPause() {
        Iterator<AbstractC21206817ys> it2 = this.LLILLL.iterator();
        while (it2.hasNext()) {
            it2.next().onPause();
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onResume() {
        Iterator<AbstractC21206817ys> it2 = this.LLILLL.iterator();
        while (it2.hasNext()) {
            it2.next().onResume();
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onStart() {
        Iterator<AbstractC21206817ys> it2 = this.LLILLL.iterator();
        while (it2.hasNext()) {
            it2.next().onStart();
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onStop() {
        Iterator<AbstractC21206817ys> it2 = this.LLILLL.iterator();
        while (it2.hasNext()) {
            it2.next().onStop();
        }
    }

    @Override // X.InterfaceC1124060fMC
    public final /* bridge */ /* synthetic */ Object LLILZLL() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC21180617ue
    public final boolean LJIL(AbstractC21206817ys abstractC21206817ys) {
        return Intrinsics.LJFF(abstractC21206817ys, this.LLILZ);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onCreate(Bundle bundle) {
        Iterator it2 = ((ArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((AbsSlotWidget) it2.next()).onCreate(bundle);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public void onEvent(Boolean bool) {
        Iterator<AbstractC21206817ys> it2 = this.LLILLL.iterator();
        while (it2.hasNext()) {
            it2.next().onEvent(bool);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onExposure(String str) {
        Iterator<AbstractC21206817ys> it2 = this.LLILLL.iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onMessage(IMessage iMessage) {
        Iterator<AbstractC21206817ys> it2 = this.LLILLL.iterator();
        while (it2.hasNext()) {
            it2.next().onMessage(iMessage);
        }
    }

    @Override // X.InterfaceC21180617ue
    public final boolean LJIIZILJ(AbstractC21206817ys abstractC21206817ys, boolean z) {
        String simpleName;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        Pair<Boolean, String> value2;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AbsECCardWidgetWrapper setSlotVisible= ");
        sbLIZ.append(z);
        sbLIZ.append(", currentShowSlotWidget = ");
        AbstractC21206817ys abstractC21206817ys2 = this.LLILZ;
        IFrameSlot.SlotViewModel slotViewModel = null;
        if (abstractC21206817ys2 != null) {
            simpleName = abstractC21206817ys2.getClass().getSimpleName();
        } else {
            simpleName = null;
        }
        sbLIZ.append(simpleName);
        sbLIZ.append(", slotWidget = ");
        sbLIZ.append(abstractC21206817ys.getClass().getSimpleName());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        ViewModel viewModel = this.LL;
        if (viewModel instanceof IFrameSlot.SlotViewModel) {
            slotViewModel = (IFrameSlot.SlotViewModel) viewModel;
        }
        if (slotViewModel != null) {
            if (z) {
                C2341109Fh.LJ("setSlotVisible visible = true");
                MutableLiveData<Pair<Boolean, String>> mutableLiveData2 = slotViewModel.LL;
                if (mutableLiveData2 != null && (value2 = mutableLiveData2.getValue()) != null && Intrinsics.LJFF(value2.first, Boolean.TRUE)) {
                    C2341109Fh.LJ("setSlotVisible is also visible");
                    return false;
                }
                this.LLILZ = abstractC21206817ys;
                this.LLILZIL.LL = ((AbstractC21194217wq) abstractC21206817ys).LJJIJIIJI();
                C21207817z2.LIZIZ(slotViewModel, true);
                return true;
            }
            if (Intrinsics.LJFF(this.LLILZ, abstractC21206817ys) && (mutableLiveData = slotViewModel.LL) != null && (value = mutableLiveData.getValue()) != null && Intrinsics.LJFF(value.first, Boolean.TRUE)) {
                C2341109Fh.LJ("setSlotVisible visible = false");
                C21207817z2.LIZIZ(slotViewModel, false);
                return true;
            }
            C2341109Fh.LJ("setSlotVisible fail visible = false");
        }
        return false;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    /* JADX INFO: renamed from: LJJI, reason: merged with bridge method [inline-methods] */
    public void LLIZ(IFrameSlot.SlotViewModel slotViewModel, InterfaceC21213717zz interfaceC21213717zz) {
        this.LL = slotViewModel;
        this.LLILLJJLI = interfaceC21213717zz;
        Iterator<AbstractC21206817ys> it2 = this.LLILLL.iterator();
        while (it2.hasNext()) {
            it2.next().LLIZ(slotViewModel, interfaceC21213717zz);
        }
    }

    @Override // X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        Room room;
        Object obj = map.get("param_room");
        String string = null;
        if ((obj instanceof Room) && (room = (Room) obj) != null) {
            string = Long.valueOf(room.getId()).toString();
        }
        boolean z = false;
        if (string != null && !a0.LJJJIL(string)) {
            this.LLILZLL = string;
            Iterator it2 = ((ArrayList) this.LLILLL).iterator();
            while (it2.hasNext()) {
                boolean zLJJ = ((AbstractC21206817ys) it2.next()).LJJ(map);
                if (!zLJJ) {
                    it2.remove();
                }
                z |= zLJJ;
            }
            LJJ(z);
            interfaceC756140TlM.LIZ(z);
            return;
        }
        interfaceC756140TlM.LIZ(false);
    }
}
