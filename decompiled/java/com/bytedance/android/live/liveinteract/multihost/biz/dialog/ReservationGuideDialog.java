package com.bytedance.android.live.liveinteract.multihost.biz.dialog;

import X.C16F5;
import X.C500980Jkm;
import X.C786410Ut5;
import Y.ACListenerS150S0100000_15;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes16.dex */
public final class ReservationGuideDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImHELIOSJDElISAgPGsuIDV9LCwtJSA0ZhcpOiohPiQ4ICA9DzAlLSoXISQgJig=";
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.ga6);
        c500980Jkm.LIZJ = R.style.ahb;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -2;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.tv_reserve_guide_1);
        C16F5 c16f52 = (C16F5) view.findViewById(R.id.tv_reserve_guide_2);
        C16F5 c16f53 = (C16F5) view.findViewById(R.id.tv_reserve_guide_3);
        C16F5 c16f54 = (C16F5) view.findViewById(R.id.tv_reserve_guide_4);
        String str = this.LLILLL;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C786410Ut5.LLJJJJ(c16f53, 8);
            C786410Ut5.LLJJJJ(c16f54, 0);
            C786410Ut5.LLJJJJ(c16f52, 0);
            C786410Ut5.LLJJJJ(c16f5, 0);
            c16f5.setText(this.LL);
            c16f52.setText(this.LLILLJJLI);
            c16f54.setText(this.LLILZ);
        } else {
            C786410Ut5.LLJJJJ(c16f54, 0);
            C786410Ut5.LLJJJJ(c16f53, 0);
            C786410Ut5.LLJJJJ(c16f5, 8);
            C786410Ut5.LLJJJJ(c16f52, 8);
            c16f53.setText(this.LLILLL);
            c16f54.setText(this.LLILZ);
        }
        C786410Ut5.I7(new ACListenerS150S0100000_15(this, 157), view.findViewById(R.id.jwk));
    }
}
