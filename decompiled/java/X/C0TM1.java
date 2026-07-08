package X;

import Y.ACListenerS116S0200000_12;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0TM1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TM1 extends AbstractC21673619ry<C0TM2> {
    public final LiveDialogFragment LL;
    public final List<InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR>> LLILLJJLI;
    public final Map<InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR>, IIconSlot.SlotViewModel> LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String value;
        Drawable value2;
        MutableLiveData<String> mutableLiveData;
        String value3;
        MutableLiveData<Drawable> mutableLiveData2;
        MutableLiveData<String> mutableLiveData3;
        InterfaceC1124060fMC interfaceC1124060fMC = (InterfaceC1124060fMC) ListProtector.get(this.LLILLJJLI, i);
        IIconSlot.SlotViewModel slotViewModel = this.LLILLL.get(interfaceC1124060fMC);
        TextView textView = (TextView) viewHolder.itemView.findViewById(R.id.title);
        String strLIZIZ = null;
        if (slotViewModel != null && (mutableLiveData3 = slotViewModel.LLJILLL) != null) {
            value = mutableLiveData3.getValue();
        } else {
            value = null;
        }
        textView.setText(value);
        LiveIconView liveIconView = (LiveIconView) viewHolder.itemView.findViewById(R.id.jxe);
        if (slotViewModel != null && (mutableLiveData2 = slotViewModel.LLJIJIL) != null) {
            value2 = mutableLiveData2.getValue();
        } else {
            value2 = null;
        }
        liveIconView.setImageDrawable(value2);
        TextView textView2 = (TextView) viewHolder.itemView.findViewById(R.id.hij);
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LLILZLL) != null && (value3 = mutableLiveData.getValue()) != null && value3.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" (");
            sbLIZ.append(value3);
            sbLIZ.append(')');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        textView2.setText(strLIZIZ);
        C786410Ut5.LJLLLLLL(8, viewHolder.itemView.findViewById(R.id.t16));
        C786410Ut5.I7(new ACListenerS116S0200000_12(interfaceC1124060fMC, this, 38), viewHolder.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hmt, viewGroup, false);
        RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(viewTd) { // from class: X.0TM2
        };
        try {
            View view = viewHolder.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0TM2.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0TM2.class.getName();
        return viewHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0TM1(LiveDialogFragment liveDialogFragment, List<? extends InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR>> list, Map<InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR>, ? extends IIconSlot.SlotViewModel> map) {
        this.LL = liveDialogFragment;
        this.LLILLJJLI = list;
        this.LLILLL = map;
    }
}
