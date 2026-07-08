package com.bytedance.android.live.rank.impl.sticker.base;

import X.C1143680frq;
import X.C16FV;
import X.C465640INu;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C786410Ut5;
import Y.ACListenerS152S0100000_17;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS698S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public abstract class BaseRankStickerDialog extends LiveDialogFragment {
    public LinearLayout LL;
    public LinearLayout LLILLJJLI;
    public LiveIconView LLILLL;
    public LiveIconView LLILZ;
    public LiveIconView LLILZIL;
    public C16FV LLILZLL;

    public abstract void MR();

    public abstract void NR();

    public abstract void OR();

    public abstract String PR();

    public abstract void RR();

    public abstract int SR();

    public abstract void UR();

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(SR());
        c500980Jkm.LIZJ = R.style.ahb;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJI = 0.0f;
        c500980Jkm.LJIIIZ = -1;
        int iLIZIZ = C465640INu.LIZIZ(getContext()) * 622;
        int iLIZ = (int) (C465640INu.LIZ(getContext()) * 0.8f);
        if (375 <= iLIZ) {
            iLIZ = 375;
        }
        c500980Jkm.LJIIJ = iLIZIZ / iLIZ;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = null;
        if (Intrinsics.LJFF(null, "rank_page")) {
            View viewFindViewById2 = this.LL;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.p1r);
                } else {
                    viewFindViewById2 = null;
                }
                this.LL = (LinearLayout) viewFindViewById2;
            }
            C500260Jjc.LLFFF(viewFindViewById2);
            View viewFindViewById3 = this.LLILLJJLI;
            if (viewFindViewById3 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById3 = view3.findViewById(R.id.p1s);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLILLJJLI = (LinearLayout) viewFindViewById3;
            }
            C500260Jjc.LJIILIIL(viewFindViewById3);
            View viewFindViewById4 = this.LLILLL;
            if (viewFindViewById4 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById4 = view4.findViewById(R.id.bmy);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLILLL = (LiveIconView) viewFindViewById4;
            }
            C786410Ut5.g8((LiveIconView) viewFindViewById4, new ACListenerS152S0100000_17(this, 159));
            View viewFindViewById5 = this.LLILZ;
            if (viewFindViewById5 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById5 = view5.findViewById(R.id.hp3);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLILZ = (LiveIconView) viewFindViewById5;
            }
            C786410Ut5.I7(new AbS698S0100000_17(this, 12, 42), viewFindViewById5);
        } else {
            View viewFindViewById6 = this.LL;
            if (viewFindViewById6 == null) {
                View view6 = getView();
                if (view6 != null) {
                    viewFindViewById6 = view6.findViewById(R.id.p1r);
                } else {
                    viewFindViewById6 = null;
                }
                this.LL = (LinearLayout) viewFindViewById6;
            }
            C500260Jjc.LJIILIIL(viewFindViewById6);
            View viewFindViewById7 = this.LLILLJJLI;
            if (viewFindViewById7 == null) {
                View view7 = getView();
                if (view7 != null) {
                    viewFindViewById7 = view7.findViewById(R.id.p1s);
                } else {
                    viewFindViewById7 = null;
                }
                this.LLILLJJLI = (LinearLayout) viewFindViewById7;
            }
            C500260Jjc.LLFFF(viewFindViewById7);
            View viewFindViewById8 = this.LLILZIL;
            if (viewFindViewById8 == null) {
                View view8 = getView();
                if (view8 != null) {
                    viewFindViewById8 = view8.findViewById(R.id.hp4);
                } else {
                    viewFindViewById8 = null;
                }
                this.LLILZIL = (LiveIconView) viewFindViewById8;
            }
            C786410Ut5.I7(new AbS698S0100000_17(this, 13, 42), viewFindViewById8);
        }
        View view9 = this.LLILZLL;
        if (view9 == null) {
            View view10 = getView();
            if (view10 != null) {
                viewFindViewById = view10.findViewById(R.id.rp3);
            }
            this.LLILZLL = (C16FV) viewFindViewById;
            view9 = viewFindViewById;
        }
        C1143680frq.LIZLLL(view9, "tiktok_live_revenue_demand_2", "ttlive_bg_rank_sticker_preview.png");
        OR();
        MR();
        NR();
        UR();
        RR();
    }
}
