package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePinCardSetting;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UNX, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UNX implements InterfaceC771240UNe {
    public View LL;

    @Override // X.InterfaceC1108000ewI
    public final boolean LIZJ() {
        return LivePinCardSetting.INSTANCE.enableQA();
    }

    @Override // X.InterfaceC771240UNe
    public final View LIZLLL(Context context) {
        View view = this.LL;
        if (view == null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.i25, null, false);
            this.LL = viewTd;
            return viewTd;
        }
        return view;
    }
}
