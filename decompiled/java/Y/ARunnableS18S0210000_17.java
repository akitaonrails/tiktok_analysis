package Y;

import X.C1082150eGb;
import X.C1105460esC;
import X.C1128710fTh;
import X.C1135810ff9;
import X.C1135910ffJ;
import X.C1135920ffK;
import X.C1760810vvD;
import X.C194310110i;
import X.C1C7U;
import X.C238400w2;
import X.C786410Ut5;
import X.EnumC1083180eIG;
import X.InterfaceC1136020ffU;
import android.app.Dialog;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class ARunnableS18S0210000_17 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS18S0210000_17.LIZ$0():void");
    }

    public final void LIZ$1() {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Window window;
        final C1760810vvD c1760810vvD = (C1760810vvD) this.l0;
        Uri uri = (Uri) this.l1;
        final boolean z = this.z2;
        c1760810vvD.getClass();
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2), "soft_input_adjust")) == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0) {
            return;
        }
        BottomSheetDialogFragment bottomSheetDialogFragment = c1760810vvD.LLILZLL;
        if (bottomSheetDialogFragment == null) {
            c1760810vvD.getActivity().getWindow().setSoftInputMode(36);
            C786410Ut5.x3(c1760810vvD.getRootView().getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0eq5
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    Rect rect = new Rect();
                    c1760810vvD.getWindowVisibleDisplayFrame(rect);
                    int i = z ? 0 : c1760810vvD.LLJI;
                    C1760810vvD c1760810vvD2 = c1760810vvD;
                    int i2 = (rect.bottom - rect.top) + i;
                    if (c1760810vvD2.getLayoutParams().height != i2) {
                        c1760810vvD2.getLayoutParams().height = i2;
                        c1760810vvD2.requestLayout();
                    }
                }
            });
            return;
        }
        Dialog dialog = bottomSheetDialogFragment.getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        final View viewFindViewById = c1760810vvD.getSparkView().getRootView().findViewById(R.id.eqx);
        View viewFindViewById2 = c1760810vvD.getSparkView().getRootView().findViewById(R.id.exx);
        if (viewFindViewById == null || viewFindViewById2 == null) {
            return;
        }
        window.setSoftInputMode(36);
        C786410Ut5.x3(c1760810vvD.getRootView().getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0eq4
            public boolean LL;
            public int LLILLJJLI;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Rect rect = new Rect();
                viewFindViewById.getWindowVisibleDisplayFrame(rect);
                int height = viewFindViewById.getHeight() - rect.bottom;
                if (height <= 0) {
                    if (this.LL) {
                        this.LL = false;
                        if (c1760810vvD.getLayoutParams().height != this.LLILLJJLI) {
                            c1760810vvD.getLayoutParams().height = this.LLILLJJLI;
                            c1760810vvD.requestLayout();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!this.LL) {
                    this.LLILLJJLI = c1760810vvD.getHeight();
                    this.LL = true;
                }
                int height2 = viewFindViewById.getHeight() - height;
                int height3 = this.LLILLJJLI;
                if (height2 <= height3) {
                    height3 = (viewFindViewById.getHeight() - height) - C497820Jfg.LIZJ(c1760810vvD.getContext());
                }
                C1760810vvD c1760810vvD2 = c1760810vvD;
                if (c1760810vvD2.getLayoutParams().height != height3) {
                    c1760810vvD2.getLayoutParams().height = height3;
                    c1760810vvD2.requestLayout();
                }
            }
        });
    }

    public static final void run$0(ARunnableS18S0210000_17 aRunnableS18S0210000_17) {
        boolean zLIZ;
        C1C7U.LIZ("OnlineAudienceRankWidget@5757.notifyFixedProfileListChange$runnable$1");
        try {
            aRunnableS18S0210000_17.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OnlineAudienceRankWidget@5757.notifyFixedProfileListChange$runnable$1");
    }

    public static final void run$1(ARunnableS18S0210000_17 aRunnableS18S0210000_17) {
        boolean zLIZ;
        C1C7U.LIZ("SparkFallbackView@7a42.init$6");
        try {
            aRunnableS18S0210000_17.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SparkFallbackView@7a42.init$6");
    }

    public static final void run$2(ARunnableS18S0210000_17 aRunnableS18S0210000_17) {
        boolean zLIZ;
        C1C7U.LIZ("LandScapePinchGestureListener@5ea8.resetInternal$1");
        try {
            if (aRunnableS18S0210000_17.z2) {
                ((C194310110i) ((C1082150eGb) aRunnableS18S0210000_17.l0).LJJIFFI.getValue()).LIZ();
            }
            EnumC1083180eIG enumC1083180eIG = (EnumC1083180eIG) aRunnableS18S0210000_17.l1;
            if (enumC1083180eIG != EnumC1083180eIG.OTHER) {
                ((C1082150eGb) aRunnableS18S0210000_17.l0).LIZJ.LIZJ(enumC1083180eIG);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LandScapePinchGestureListener@5ea8.resetInternal$1");
    }

    public static final void run$3(ARunnableS18S0210000_17 aRunnableS18S0210000_17) {
        boolean zLIZ;
        C1C7U.LIZ("GiftTrayMessageQueue@b0e6.pushMsgInQueueOrStoreInMap$2");
        try {
            ((C1135920ffK) aRunnableS18S0210000_17.l0).LJJIIJZLJL((InterfaceC1136020ffU) aRunnableS18S0210000_17.l1, aRunnableS18S0210000_17.z2, false, false);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftTrayMessageQueue@b0e6.pushMsgInQueueOrStoreInMap$2");
    }

    public static final void run$4(ARunnableS18S0210000_17 aRunnableS18S0210000_17) {
        boolean zLIZ;
        C1C7U.LIZ("GiftPanelLeafV2@f893.changeData$3");
        try {
            if (!aRunnableS18S0210000_17.z2) {
                ((C1128710fTh) aRunnableS18S0210000_17.l0).LJLLILLLL();
            }
            ((C1128710fTh) aRunnableS18S0210000_17.l0).LJLIL(((C238400w2) aRunnableS18S0210000_17.l1).element);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftPanelLeafV2@f893.changeData$3");
    }

    public static final void run$5(ARunnableS18S0210000_17 aRunnableS18S0210000_17) {
        boolean zLIZ;
        C1C7U.LIZ("LiveGiftTrayQueueV2@e220.pushMsgInQueueOrStoreInMap$1");
        try {
            ((C1135910ffJ) aRunnableS18S0210000_17.l0).LJIIZILJ((C1135810ff9) aRunnableS18S0210000_17.l1, aRunnableS18S0210000_17.z2, false);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveGiftTrayQueueV2@e220.pushMsgInQueueOrStoreInMap$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS18S0210000_17(Object obj, OnlineAudienceRankWidget onlineAudienceRankWidget, List<C1105460esC> list, boolean z) {
        this.$t = z ? 1 : 0;
        this.l0 = obj;
        this.l1 = onlineAudienceRankWidget;
        this.z2 = list;
    }
}
