package com.bytedance.android.live.wallet.view.recharge;

import X.C01GW;
import X.C0IJR;
import X.C0IJT;
import X.C0IP3;
import X.C1078150eA9;
import X.C1161920gLG;
import X.C1548820qPI;
import X.C158B;
import X.C1796440wqg;
import X.C1796540wqq;
import X.C1803550x29;
import X.C1803830x2b;
import X.C1803860x2e;
import X.C1804000x2s;
import X.C1804010x2t;
import X.C1804030x2v;
import X.C1804060x2y;
import X.C19EG;
import X.C19EH;
import X.C292401Bi;
import X.C418440Gaw;
import X.C474500IjA;
import X.C497740JfY;
import X.C500980Jkm;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1796260wqO;
import X.InterfaceC1804040x2w;
import X.InterfaceC1805160x4k;
import X.InterfaceC1806230x6T;
import X.InterfaceC1806350x6f;
import X.WindowCallbackC1202580hOq;
import Y.AObjectS370S0100000_27;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.wallet.model.ReChargeDialogOnShow;
import com.bytedance.android.live.wallet.viewmodel.recharge.RechargeDialogVM;
import com.bytedance.android.live.walletnew.RechargeDialogNew;
import com.bytedance.android.live.walletnew.event.WalletRechargePanelRendered;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletNewRechargeLatencyTrackingEnabledSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletRechargePanelHeightPercentageSetting;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes28.dex */
public final class RechargeDialog extends LiveDialogFragment implements InterfaceC1805160x4k, C0IP3 {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiPi4/JCHELIOSA4Zzk6LTJiOyowICQ+Lip9GiAvIS4hLyAIIC4/JyI=";
    public InterfaceC1806230x6T LL;
    public DataChannel LLILLL;
    public RechargeDialogNew LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public AObjectS370S0100000_27 LLIZLLLIL;
    public C1803830x2b LLILLJJLI = new C1803830x2b();
    public final C01GW LLIZ = C292401Bi.LIZ(new AwS571S0100000_27(this, 125));

    @Override // X.InterfaceC1805160x4k
    public final LifecycleOwner LJJJJ() {
        return this;
    }

    @Override // X.InterfaceC1805160x4k
    public final ViewModelStoreOwner LLIIIILZ() {
        return this;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean adaptEdgeToEdge() {
        return true;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return false;
    }

    public final RechargeDialogVM NR() {
        return (RechargeDialogVM) this.LLIZ.getValue();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean enablePadAdapter() {
        return ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx();
    }

    @Override // X.InterfaceC1805160x4k
    public final void nD() {
        C1804030x2v c1804030x2v = RechargeDialogNew.LLLLIIL;
        C19EG activity = getActivity();
        Bundle arguments = getArguments();
        if (arguments == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        InterfaceC1806230x6T interfaceC1806230x6T = this.LL;
        C1803830x2b c1803830x2b = this.LLILLJJLI;
        DataChannel dataChannel = this.LLILLL;
        c1804030x2v.getClass();
        RechargeDialogNew rechargeDialogNew = new RechargeDialogNew();
        rechargeDialogNew.LLJLL = activity;
        rechargeDialogNew.setArguments(arguments);
        rechargeDialogNew.LLJLLIL = interfaceC1806230x6T;
        rechargeDialogNew.LLJLLL = c1803830x2b;
        rechargeDialogNew.LLJZ = dataChannel;
        rechargeDialogNew.LLJZIJLIL = this;
        C1796540wqq.LIZ.LIZ(EnumC1796260wqO.BOTH, "livesdk_wallet_recharge_panel_pop_up", null, null, null, null, "wallet");
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.iiv, rechargeDialogNew, null);
        c19ehLJIIJ.LJIIL();
        this.LLILZ = rechargeDialogNew;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        RechargeDialogNew rechargeDialogNew = this.LLILZ;
        if (rechargeDialogNew == null || rechargeDialogNew.ES()) {
            return true;
        }
        RechargeDialogNew rechargeDialogNew2 = this.LLILZ;
        if (rechargeDialogNew2 != null) {
            rechargeDialogNew2.NR();
        }
        return super.onBackPressed();
    }

    @Override // X.C0IP3
    public final DataChannel provideDataChannel() {
        return C0IJR.LIZ(new ViewModelProvider(this), this);
    }

    public final int MR() {
        Integer value = NR().LLIZLLLIL.getValue();
        int iLIZIZ = 0;
        int iIntValue = value != null ? value.intValue() : 0;
        if (Intrinsics.LJFF(NR().LLILZLL.getValue(), Boolean.FALSE) && !this.LLILZIL) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
        }
        return iIntValue == 0 ? !Intrinsics.LJFF(NR().LLIZ.getValue(), Boolean.TRUE) ? iLIZIZ + (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68)) * 2) : iLIZIZ : iIntValue < 3 ? iLIZIZ + ((3 - iIntValue) * C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68))) : iLIZIZ;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        View viewFindViewById;
        this.LLILZLL = MR();
        C19EG activity = getActivity();
        int i = this.LLILZLL;
        boolean zLIZ = C1804000x2s.LIZ(activity);
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.ga0);
        c500980Jkm.LIZLLL = !zLIZ;
        int height = 0;
        c500980Jkm.LJ = false;
        if (!zLIZ) {
            c500980Jkm.LJII = 80;
            c500980Jkm.LJIIIZ = -1;
            c500980Jkm.LJIIJ = ((int) ((C497740JfY.LJIILIIL(activity).heightPixels * LiveWalletRechargePanelHeightPercentageSetting.INSTANCE.getValue()) / 100.0f)) - i;
            return c500980Jkm;
        }
        c500980Jkm.LIZJ = R.style.ahe;
        c500980Jkm.LJII = C497740JfY.LJJ() ? 8388611 : 8388613;
        c500980Jkm.LJIIIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(375));
        if (activity != null) {
            int i2 = C497740JfY.LJIILIIL(activity).heightPixels;
            Resources resources = activity.getResources();
            int iN3 = C786410Ut5.n3(resources, "config_navBarInteractionMode", "integer", "android");
            if (iN3 > 0 && resources.getInteger(iN3) == 2 && (viewFindViewById = activity.findViewById(android.R.id.navigationBarBackground)) != null) {
                height = viewFindViewById.getHeight();
            }
            height = i2 - height;
        }
        c500980Jkm.LJIIJ = height;
        return c500980Jkm;
    }

    @Override // X.InterfaceC1805160x4k
    public final Window getWindow() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog.getWindow();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        DataChannel dataChannel;
        super.onDestroyView();
        DataChannel dataChannel2 = this.LLILLL;
        if (dataChannel2 != null) {
            dataChannel2.zW(ReChargeDialogOnShow.class, Boolean.FALSE);
        }
        AObjectS370S0100000_27 aObjectS370S0100000_27 = this.LLIZLLLIL;
        if (aObjectS370S0100000_27 == null || (dataChannel = this.LLILLL) == null) {
            return;
        }
        dataChannel.HQ2(this, WalletRechargePanelRendered.class, aObjectS370S0100000_27);
    }

    @Override // X.InterfaceC1805160x4k
    public final DataChannel o3() {
        return this.LLILLL;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        if (bundle != null && (bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key")) != null) {
            C786410Ut5.LJJIIZI(bundle2, new Bundle(), "android:support:fragments");
        }
        C1548820qPI.LIZLLL("DiamondsRefreshed", NR().LLJIJIL);
        super.onCreate(bundle);
        DataChannel dataChannel = this.LLILLL;
        if (dataChannel != null) {
            dataChannel.zW(ReChargeDialogOnShow.class, Boolean.TRUE);
        }
        if (C1804000x2s.LIZIZ(getContext())) {
            AObjectS370S0100000_27 aObjectS370S0100000_27 = new AObjectS370S0100000_27(this, 2);
            DataChannel dataChannel2 = this.LLILLL;
            if (dataChannel2 != null) {
                dataChannel2.BQ2(this, WalletRechargePanelRendered.class, aObjectS370S0100000_27);
            }
            this.LLIZLLLIL = aObjectS370S0100000_27;
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.LLILZ = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC1806350x6f c1803860x2e;
        final Window window;
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            final Window.Callback callback = window.getCallback();
            window.setCallback(new WindowCallbackC1202580hOq(callback) { // from class: X.0UlO
                /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
                @Override // X.WindowCallbackC1202580hOq, android.view.Window.Callback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
                    /*
                        r6 = this;
                        int r1 = r7.getAction()
                        r0 = 4
                        r5 = 1
                        if (r1 == r0) goto L41
                        com.bytedance.android.live.wallet.view.recharge.RechargeDialog r0 = r6.LLILLJJLI
                        android.content.Context r2 = r0.getContext()
                        if (r2 == 0) goto L5c
                        android.view.Window r1 = r2
                        int r0 = r7.getAction()
                        if (r0 != 0) goto L5c
                        float r0 = r7.getX()
                        int r4 = (int) r0
                        float r0 = r7.getY()
                        int r3 = (int) r0
                        android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r2)
                        int r2 = r0.getScaledWindowTouchSlop()
                        android.view.View r1 = r1.getDecorView()
                        int r0 = -r2
                        if (r4 < r0) goto L41
                        if (r3 < r0) goto L41
                        int r0 = r1.getWidth()
                        int r0 = r0 + r2
                        if (r4 > r0) goto L41
                        int r0 = r1.getHeight()
                        int r0 = r0 + r2
                        if (r3 <= r0) goto L5c
                    L41:
                        com.bytedance.android.live.wallet.view.recharge.RechargeDialog r0 = r6.LLILLJJLI
                        com.bytedance.android.live.walletnew.RechargeDialogNew r0 = r0.LLILZ
                        if (r0 == 0) goto L5c
                        boolean r0 = r0.ES()
                        if (r0 != 0) goto L5c
                        com.bytedance.android.live.wallet.view.recharge.RechargeDialog r0 = r6.LLILLJJLI
                        android.app.Dialog r0 = r0.getDialog()
                        if (r0 == 0) goto L5b
                        r0.dismiss()
                        X.C785410UrT.LIZ(r0)
                    L5b:
                        return r5
                    L5c:
                        boolean r0 = super.dispatchTouchEvent(r7)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C781640UlO.dispatchTouchEvent(android.view.MotionEvent):boolean");
                }
            });
        }
        RechargeDialogVM rechargeDialogVMNR = NR();
        rechargeDialogVMNR.getClass();
        C1803830x2b c1803830x2b = rechargeDialogVMNR.LL;
        if (c1803830x2b.LJ == 0 && c1803830x2b.LJIIJ && (!Intrinsics.LJFF(c1803830x2b.LIZLLL, "first_recharge"))) {
            c1803860x2e = new C1804010x2t();
        } else {
            c1803860x2e = new C1803860x2e();
        }
        InterfaceC1804040x2w.LIZ.getClass();
        C1804060x2y.LIZIZ.getValue().LIZIZ(InterfaceC1806350x6f.class, c1803860x2e);
        InterfaceC1805160x4k interfaceC1805160x4k = rechargeDialogVMNR.LLILLJJLI;
        if (interfaceC1805160x4k != null) {
            interfaceC1805160x4k.nD();
        }
        RadiusLayout radiusLayout = (RadiusLayout) view.findViewById(R.id.iir);
        if (radiusLayout != null && ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx()) {
            float fLIZIZ = C418440Gaw.LIZIZ(8);
            radiusLayout.LIZ(fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ);
        }
    }

    @Override // X.InterfaceC1805160x4k
    public final void qK(boolean z, boolean z2) {
        this.LLILZIL = z2;
        RechargeDialogVM rechargeDialogVMNR = NR();
        rechargeDialogVMNR.LLJI = z;
        rechargeDialogVMNR.wQ2();
    }

    public static final RechargeDialog OR(Bundle bundle, DialogInterface.OnDismissListener onDismissListener, InterfaceC1806230x6T interfaceC1806230x6T, C1803830x2b c1803830x2b, DataChannel dataChannel) {
        boolean z;
        String str;
        RechargeDialog rechargeDialog = new RechargeDialog();
        rechargeDialog.setArguments(bundle);
        rechargeDialog.setOnDismissListener(onDismissListener);
        rechargeDialog.LL = interfaceC1806230x6T;
        if (bundle != null) {
            c1803830x2b.LJFF = bundle.getLong("key_bundle_gift_id");
            String string = bundle.getString("key_bundle_gift_name");
            String str2 = "";
            if (string == null) {
                string = "";
            }
            c1803830x2b.LJI = string;
            String string2 = bundle.getString("key_charge_reason");
            if (string2 == null) {
                string2 = "";
            }
            c1803830x2b.LIZLLL = string2;
            bundle.getString("key_bundle_notification_type");
            c1803830x2b.LJ = bundle.getInt("key_bundle_charge_source");
            String roomStatus = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getRoomStatus();
            if (roomStatus == null) {
                roomStatus = "";
            }
            c1803830x2b.LJIIIIZZ = roomStatus;
            long j = bundle.getLong("key_bundle_total_coins");
            c1803830x2b.LJIIIZ = j;
            long jLIZ = C1078150eA9.LIZ(bundle.getLong("key_bundle_need_coins"), j);
            c1803830x2b.LJII = jLIZ;
            if (jLIZ > 0) {
                z = true;
            } else {
                z = false;
            }
            c1803830x2b.LJIIJ = z;
            c1803830x2b.LJIIJJI = bundle.getBoolean("key_bundle_is_from_gift_panel");
            String string3 = c1803830x2b.LIZJ.get("request_page");
            if (string3 == null || !(!a0.LJJJIL(string3))) {
                int i = c1803830x2b.LJ;
                string3 = bundle.getString("request_page");
                if (string3 == null) {
                    string3 = (String) ((LinkedHashMap) C1078150eA9.LIZ).get(Integer.valueOf(i));
                    if (string3 == null) {
                        string3 = "live_detail";
                    }
                }
            }
            c1803830x2b.LJIIL = string3;
            String string4 = bundle.getString("key_bundle_previous_page");
            if (string4 == null) {
                string4 = "normal";
            }
            c1803830x2b.LJIILIIL = string4;
            String string5 = bundle.getString("key_bundle_gift_from", "");
            if (string5 == null) {
                string5 = "";
            }
            c1803830x2b.LJIILJJIL = string5;
            String string6 = bundle.getString("key_bundle_request_id", "");
            if (string6 == null) {
                string6 = "";
            }
            c1803830x2b.LJIILL = string6;
            String string7 = bundle.getString("key_bundle_gift_send_type", "");
            if (string7 != null) {
                str2 = string7;
            }
            c1803830x2b.LJIILLIIL = str2;
            c1803830x2b.LJIIZILJ = bundle.getInt("key_bundle_show_balance");
            c1803830x2b.LJIJ = bundle.getInt("key_bundle_can_exchange");
            if (bundle.getBoolean("key_bundle_gift_has_sent_before")) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c1803830x2b.LJIJI = str;
        }
        rechargeDialog.LLILLL = dataChannel;
        rechargeDialog.LLILLJJLI = c1803830x2b;
        C1803550x29.LIZ();
        C1803550x29.LIZ = true;
        C1803550x29.LIZIZ = C158B.LIZ();
        if (LiveWalletNewRechargeLatencyTrackingEnabledSetting.INSTANCE.getValue()) {
            C1803550x29.LIZJ = C158B.LIZ();
        }
        C1803550x29.LJIILIIL = c1803830x2b.LIZLLL;
        C1803550x29.LJIILL = c1803830x2b.LJIIL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_panel_start_loading");
        c474500IjALIZ.LJJII(C1796440wqg.LIZ(), "pay_method");
        c474500IjALIZ.LJJII(C1803550x29.LJIILL, "request_page");
        c474500IjALIZ.LIZ();
        return rechargeDialog;
    }
}
