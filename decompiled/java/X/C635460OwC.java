package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.notification.bean.UnSubscribeSettingsData;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0OwC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C635460OwC extends RecyclerView.ViewHolder {
    public UnSubscribeSettingsData LL;
    public int LLILLJJLI;

    public final void L5() {
        C11GO c11go;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("SNSettingCategoryViewHolder", "updateTuxSwitch");
        boolean z = false;
        if (C635470OwD.LIZ()) {
            C127K c127k = (C127K) this.itemView.findViewById(R.id.txCell);
            C127M accessory = c127k != null ? c127k.getAccessory() : null;
            if ((accessory instanceof C127A) && (c11go = (C11GO) accessory) != null) {
                UnSubscribeSettingsData unSubscribeSettingsData = this.LL;
                c11go.LJIILJJIL(!(unSubscribeSettingsData != null && unSubscribeSettingsData.isUnsubscribe));
            }
            I5(false);
            return;
        }
        C21411818qq c21411818qq = (C21411818qq) this.itemView.findViewById(R.id.yzn);
        if (c21411818qq != null) {
            UnSubscribeSettingsData unSubscribeSettingsData2 = this.LL;
            if (unSubscribeSettingsData2 != null && unSubscribeSettingsData2.isUnsubscribe) {
                z = true;
            }
            c21411818qq.setChecked(!z);
        }
    }

    public C635460OwC(View view) {
        super(view);
    }

    public final void I5(boolean z) {
        C127K c127k = (C127K) this.itemView.findViewById(R.id.txCell);
        C127M accessory = null;
        if (c127k != null) {
            accessory = c127k.getAccessory();
        }
        if ((accessory instanceof C127A) && accessory != null) {
            accessory.LJIIJJI(z);
        }
    }
}
