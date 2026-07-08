package X;

import com.ss.android.ugc.aweme.rich.reward.ui.GmtRewardAdContainer;

/* JADX INFO: renamed from: X.0cxv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1032130cxv {
    public static final boolean LIZ(GmtRewardAdContainer gmtRewardAdContainer) {
        Double closeButtonDelaySeconds;
        InterfaceC1032120cxu interfaceC1032120cxu = gmtRewardAdContainer.LLJJ;
        if (interfaceC1032120cxu == null || (closeButtonDelaySeconds = interfaceC1032120cxu.getCloseButtonDelaySeconds()) == null) {
            return false;
        }
        double dDoubleValue = closeButtonDelaySeconds.doubleValue();
        if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue) || dDoubleValue <= 0.0d) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(InterfaceC1032120cxu interfaceC1032120cxu) {
        InterfaceC1032100cxs interfaceC1032100cxs;
        if ((interfaceC1032120cxu instanceof InterfaceC1032100cxs) && (interfaceC1032100cxs = (InterfaceC1032100cxs) interfaceC1032120cxu) != null && interfaceC1032100cxs.isInterstitialAd()) {
            return true;
        }
        return false;
    }
}
