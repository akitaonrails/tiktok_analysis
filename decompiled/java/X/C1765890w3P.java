package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mediaviewer.MediaViewer;

/* JADX INFO: renamed from: X.0w3P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1765890w3P extends AbstractC1765900w3Q {
    public static void LIZJ(Context context, InterfaceC1765910w3R interfaceC1765910w3R) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        Bundle bundle = new Bundle();
        bundle.putInt("type", 1);
        String fromPage = interfaceC1765910w3R.getFromPage();
        if (fromPage == null) {
            fromPage = "unknown";
        }
        C786410Ut5.LJJJI("from_page", fromPage, bundle);
        C786410Ut5.LJJJI("video_url", interfaceC1765910w3R.getVideoUrl(), bundle);
        C786410Ut5.LJJJI("video_cover", interfaceC1765910w3R.getVideoCover(), bundle);
        Boolean boolIsAutoPlay = interfaceC1765910w3R.isAutoPlay();
        if (boolIsAutoPlay != null) {
            bundle.putBoolean("is_auto_play", boolIsAutoPlay.booleanValue());
        }
        Number videoLen = interfaceC1765910w3R.getVideoLen();
        if (videoLen != null) {
            bundle.putInt("video_len", videoLen.intValue());
        }
        MediaViewer mediaViewer = new MediaViewer();
        mediaViewer.setArguments(bundle);
        mediaViewer.setCancelable(false);
        if (context != null && C1388190mED.LIZIZ(context) != null && context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            mediaViewer.show(supportFragmentManager, "ec_media_viewer");
        }
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        Context context;
        InterfaceC1765910w3R interfaceC1765910w3R = (InterfaceC1765910w3R) xBaseParamModel;
        if (interfaceC1765910w3R.getVideoUrl().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2382909Vj.LIZ(completionBlock, 0, "url is empty", null, 4);
            return;
        }
        try {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                context = interfaceC634840OvC.getContext();
            } else {
                context = null;
            }
            LIZJ(context, interfaceC1765910w3R);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1765920w3S.class, null), "");
    }
}
