package X;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.tux.drawable.TuxIconDrawable;
import java.lang.Enum;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.17zv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21213317zv<W, VM extends ViewModel, T extends Enum<T>> extends AbsSlotWidget<W, VM, T> {
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 64));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 63));

    public abstract TuxIconDrawable LJJ();

    public abstract TuxIconDrawable LJJIFFI();

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void LLILLJJLI() {
        IIconSlot.SlotViewModel slotViewModel;
        Object value;
        MutableLiveData<Drawable> mutableLiveData;
        ViewModel viewModel = this.LL;
        if (!(viewModel instanceof IIconSlot.SlotViewModel) || (slotViewModel = (IIconSlot.SlotViewModel) viewModel) == null || (value = this.LLILZ.getValue()) == null || (mutableLiveData = slotViewModel.LLJI) == null) {
            return;
        }
        mutableLiveData.setValue((Drawable) value);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void LLILZ() {
        IIconSlot.SlotViewModel slotViewModel;
        Object value;
        MutableLiveData<Drawable> mutableLiveData;
        ViewModel viewModel = this.LL;
        if (!(viewModel instanceof IIconSlot.SlotViewModel) || (slotViewModel = (IIconSlot.SlotViewModel) viewModel) == null || (value = this.LLILLL.getValue()) == null || (mutableLiveData = slotViewModel.LLJI) == null) {
            return;
        }
        mutableLiveData.setValue((Drawable) value);
    }

    public final Drawable LJJI(Drawable drawable) {
        EnumC1102990eoD enumC1102990eoDLIZLLL;
        InterfaceC21213717zz interfaceC21213717zz = this.LLILLJJLI;
        if (interfaceC21213717zz != null && (enumC1102990eoDLIZLLL = interfaceC21213717zz.LIZLLL()) != null) {
            int i = C1103000eoE.LIZ[enumC1102990eoDLIZLLL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (this.LLILLJJLI.LIZJ()) {
                            return (Drawable) this.LLILZ.getValue();
                        }
                        return (Drawable) this.LLILLL.getValue();
                    }
                    return drawable;
                }
                return (Drawable) this.LLILZ.getValue();
            }
            return (Drawable) this.LLILLL.getValue();
        }
        return drawable;
    }
}
