package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.view.PcsThirdPartyLinkDialog;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.view.PcsThirdPartyLinkFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xV2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821460xV2 extends C09AY implements Function2<Boolean, Boolean, Unit> {
    public final /* synthetic */ PcsThirdPartyLinkDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1821460xV2(PcsThirdPartyLinkDialog pcsThirdPartyLinkDialog) {
        super(2);
        this.LL = pcsThirdPartyLinkDialog;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Boolean bool2) {
        boolean z;
        ViewGroup viewGroup;
        PcsThirdPartyLinkFragment pcsThirdPartyLinkFragmentUS;
        float f;
        int i;
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        final PcsThirdPartyLinkDialog pcsThirdPartyLinkDialog = this.LL;
        pcsThirdPartyLinkDialog.getClass();
        if (!zBooleanValue && !zBooleanValue2) {
            z = false;
        } else {
            z = true;
        }
        View view = pcsThirdPartyLinkDialog.LLLFF;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        LiveIconView liveIconView = pcsThirdPartyLinkDialog.LLLFFI;
        float f2 = 1.0f;
        if (liveIconView != null) {
            liveIconView.setEnabled(zBooleanValue);
            if (zBooleanValue) {
                f = 1.0f;
            } else {
                f = 0.3f;
            }
            C786410Ut5.i5(liveIconView, f);
        }
        LiveIconView liveIconView2 = pcsThirdPartyLinkDialog.LLLFZ;
        if (liveIconView2 != null) {
            liveIconView2.setEnabled(zBooleanValue2);
            if (!zBooleanValue2) {
                f2 = 0.3f;
            }
            C786410Ut5.i5(liveIconView2, f2);
        }
        if (z && !pcsThirdPartyLinkDialog.LLLI && (pcsThirdPartyLinkFragmentUS = pcsThirdPartyLinkDialog.uS()) != null) {
            C1821500xV6.LIZ("show", null, pcsThirdPartyLinkFragmentUS.NR().wQ2());
        }
        pcsThirdPartyLinkDialog.LLLI = z;
        final PcsThirdPartyLinkFragment pcsThirdPartyLinkFragmentUS2 = pcsThirdPartyLinkDialog.uS();
        if (pcsThirdPartyLinkFragmentUS2 != null) {
            if (!z) {
                View view2 = pcsThirdPartyLinkFragmentUS2.getView();
                if (view2 != null && (viewGroup = (ViewGroup) view2.findViewById(R.id.xtd)) != null) {
                    viewGroup.setPadding(0, 0, 0, 0);
                    viewGroup.setClipToPadding(false);
                }
            } else {
                View view3 = pcsThirdPartyLinkDialog.LLLFF;
                if (view3 != null) {
                    HandlerHook.viewPost(view3, new Runnable() { // from class: X.0xV1
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            ViewGroup viewGroup2;
                            C1C7U.LIZ("PcsThirdPartyLinkDialog@1a9d.updateContentPadding$1");
                            try {
                                PcsThirdPartyLinkFragment pcsThirdPartyLinkFragment = pcsThirdPartyLinkFragmentUS2;
                                View view4 = pcsThirdPartyLinkDialog.LLLFF;
                                int height = view4 != null ? view4.getHeight() : 0;
                                View view5 = pcsThirdPartyLinkFragment.getView();
                                if (view5 != null && (viewGroup2 = (ViewGroup) view5.findViewById(R.id.xtd)) != null) {
                                    viewGroup2.setPadding(0, 0, 0, height);
                                    viewGroup2.setClipToPadding(false);
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("PcsThirdPartyLinkDialog@1a9d.updateContentPadding$1");
                        }
                    });
                }
            }
        }
        return Unit.LIZ;
    }
}
