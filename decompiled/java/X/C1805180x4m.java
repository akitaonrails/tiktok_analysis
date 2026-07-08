package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.bytedance.android.live.walletnew.RechargeDialogNew;
import com.bytedance.android.live.walletnew.RechargeViewModel;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tracking.TrackingEventV3Data;
import java.util.Map;
import kotlin.jvm.internal.AwS141S1100000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import webcast.api.profit.CustomEntranceBannerConfig;
import webcast.api.profit.IapListResult;

/* JADX INFO: renamed from: X.0x4m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805180x4m implements InterfaceC1806590x73 {
    public final /* synthetic */ RechargeDialogNew LIZ;

    @Override // X.InterfaceC1806580x72
    public final void LJI() {
        InterfaceC1806230x6T interfaceC1806230x6T = this.LIZ.LLJLLIL;
        if (interfaceC1806230x6T != null) {
            interfaceC1806230x6T.LIZ();
        }
    }

    public C1805180x4m(RechargeDialogNew rechargeDialogNew) {
        this.LIZ = rechargeDialogNew;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00c8 A[PHI: r2
      0x00c8: PHI (r2v3 webcast.api.profit.TemplateButton) = (r2v2 webcast.api.profit.TemplateButton), (r2v6 webcast.api.profit.TemplateButton) binds: [B:50:0x00a7, B:57:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f3  */
    @Override // X.InterfaceC1806420x6m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.InterfaceC1806820x7Q r12) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1805180x4m.LJ(X.0x7Q):void");
    }

    @Override // X.InterfaceC1807220x84
    public final void LJIIIZ(int i) {
        String str;
        if (i == 0) {
            str = "tiktok";
        } else {
            str = "google_play";
        }
        this.LIZ.qS().Em1(str, true, this.LIZ.qS().LLLLIILL.getValue(), false, new AwS141S1100000_27(this.LIZ, str, 1));
    }

    @Override // X.InterfaceC1806590x73
    public final void LJIIJ(Diamond diamond) {
        RechargeViewModel rechargeViewModelQS = this.LIZ.qS();
        C1805620x5U c1805620x5U = RechargeViewModel.LLLLL;
        rechargeViewModelQS.rR2(diamond, false);
    }

    @Override // X.InterfaceC1806240x6U
    public final void LJIIJJI(String str) {
        InterfaceC1803460x20 interfaceC1803460x20;
        RechargeViewModel rechargeViewModelQS = this.LIZ.qS();
        rechargeViewModelQS.getClass();
        if (str.length() > 0 && (interfaceC1803460x20 = rechargeViewModelQS.LLILLJJLI) != null) {
            interfaceC1803460x20.c6(str);
        }
    }

    @Override // X.InterfaceC1806240x6U
    public final void LJIILIIL(C1797200wru c1797200wru) {
        this.LIZ.qS().oR2(c1797200wru, new AwS571S0100000_27(this.LIZ, 139));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011f  */
    @Override // X.InterfaceC1807220x84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(int r30) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1805180x4m.LJIILJJIL(int):void");
    }

    @Override // X.InterfaceC1806420x6m
    public final void LJIILL(InterfaceC1806820x7Q interfaceC1806820x7Q) {
        int i;
        String str;
        C1804170x39 value;
        IapListResult.ListResultExtra listResultExtraVx1;
        CustomEntranceBannerConfig customEntranceBannerConfig;
        String str2;
        RechargeViewModel rechargeViewModelQS = this.LIZ.qS();
        Diamond value2 = rechargeViewModelQS.LLLLIILL.getValue();
        boolean z = false;
        if (value2 != null) {
            i = value2.count;
        } else {
            i = 0;
        }
        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
        Boolean boolValueOf = null;
        if (value2 == null || (str2 = value2.customPriceCurrency) == null || str2.length() == 0) {
            z = true;
        }
        boolean z2 = !z;
        if (!(interfaceC1806820x7Q instanceof C1807200x82) && (listResultExtraVx1 = rechargeViewModelQS.vx1()) != null && (customEntranceBannerConfig = listResultExtraVx1.customEntranceBannerConfig) != null) {
            str = customEntranceBannerConfig.bannerType;
        } else {
            str = null;
        }
        LiveData<C1804170x39> liveDataZQ0 = rechargeViewModelQS.ZQ0();
        if (liveDataZQ0 != null && (value = liveDataZQ0.getValue()) != null) {
            boolValueOf = Boolean.valueOf(value.LJ);
        }
        boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
        c1803800x2Y.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_iap_guide_to_web_show");
        C1803800x2Y.LIZJ(c474500IjALIZ, i, z2, str, zLJJJI);
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC1806590x73
    public final void LJIIIIZZ(int i, int i2) {
        RechargeViewModel rechargeViewModelQS = this.LIZ.qS();
        RechargeDialogNew rechargeDialogNew = this.LIZ;
        Context context = rechargeDialogNew.LLJLL;
        View view = rechargeDialogNew.getView();
        if (view != null) {
            view.getMeasuredHeight();
        }
        rechargeViewModelQS.pR2(i, i2, context, Integer.valueOf(this.LIZ.qS().YQ2()));
    }

    @Override // X.InterfaceC1806590x73
    public final void LIZJ(boolean z, int i, C1806600x74 c1806600x74) {
        boolean z2;
        long jLJFF;
        int i2;
        int i3;
        Integer numValueOf;
        String str;
        boolean z3;
        boolean z4;
        Diamond diamond;
        RechargeViewModel rechargeViewModelQS = this.LIZ.qS();
        rechargeViewModelQS.getClass();
        if (z) {
            if (c1806600x74.LIZ == 7) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object obj = c1806600x74.LIZIZ;
            Map<String, String> mapLIZ = null;
            if ((obj instanceof Diamond) && (diamond = (Diamond) obj) != null) {
                jLJFF = C1804850x4F.LJFF(diamond);
            } else {
                jLJFF = 0;
            }
            if (!z2 && !rechargeViewModelQS.iR2(jLJFF)) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
            Object obj2 = c1806600x74.LIZIZ;
            if (obj2 instanceof Diamond) {
                i3 = ((Diamond) obj2).count;
            } else {
                i3 = 0;
            }
            C1803830x2b c1803830x2b = rechargeViewModelQS.LLJJJJ;
            DataChannel dataChannel = rechargeViewModelQS.LLJJJJJIL;
            Map<String, String> map = c1803830x2b.LIZJ;
            Diamond diamond2 = rechargeViewModelQS.LLLLIIL;
            if (diamond2 != null) {
                numValueOf = Integer.valueOf(diamond2.count);
            } else {
                numValueOf = null;
            }
            Diamond diamond3 = rechargeViewModelQS.LLLLIIL;
            if (diamond3 != null) {
                str = diamond3.LIZIZ;
            } else {
                str = null;
            }
            boolean zFQ2 = rechargeViewModelQS.FQ2();
            C1806860x7U c1806860x7UAR2 = rechargeViewModelQS.aR2();
            Diamond diamond4 = rechargeViewModelQS.LLLLIIL;
            if (diamond4 != null && diamond4.LIZIZ()) {
                z3 = true;
            } else {
                z3 = false;
            }
            Map<String, String> mapLIZIZ = c1806860x7UAR2.LIZIZ(z3, true, false);
            TrackingEventV3Data trackingEventV3DataOg1 = rechargeViewModelQS.og1(false);
            if (trackingEventV3DataOg1 != null) {
                mapLIZ = trackingEventV3DataOg1.LIZ();
            }
            if (c1806600x74.LIZ == 7) {
                z4 = true;
            } else {
                z4 = false;
            }
            int iZQ2 = rechargeViewModelQS.ZQ2();
            c1803800x2Y.getClass();
            C1803800x2Y.LJJJIL(i3, i, c1803830x2b, dataChannel, map, numValueOf, str, zFQ2, mapLIZIZ, mapLIZ, z4, iZQ2, i2);
        }
    }
}
