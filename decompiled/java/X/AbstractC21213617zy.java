package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;

/* JADX INFO: renamed from: X.17zy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21213617zy extends AbstractC21213417zw<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> {
    public IIconSlot.SlotViewModel LLIZ;

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    /* JADX INFO: renamed from: LJJIII, reason: merged with bridge method [inline-methods] */
    public void LLIZ(IIconSlot.SlotViewModel slotViewModel, InterfaceC21213717zz interfaceC21213717zz) {
        this.LL = slotViewModel;
        this.LLILLJJLI = interfaceC21213717zz;
        this.LLIZ = slotViewModel;
    }

    public final void LJJIIJ(int i, String str) {
        MutableLiveData<Boolean> mutableLiveData;
        IIconSlot.SlotViewModel slotViewModel = this.LLIZ;
        if (slotViewModel != null) {
            slotViewModel.LLJLILLLLZIIL = str;
            slotViewModel.LLJLL = null;
            slotViewModel.LLJZ = Integer.valueOf(i);
        }
        IIconSlot.SlotViewModel slotViewModel2 = this.LLIZ;
        if (slotViewModel2 != null && (mutableLiveData = slotViewModel2.LLJJIJI) != null) {
            mutableLiveData.setValue(Boolean.TRUE);
        }
    }
}
