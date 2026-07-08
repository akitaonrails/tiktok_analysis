package X;

import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0Ps2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C658360Ps2 {
    public static void LIZ(InterfaceC584630MwP interfaceC584630MwP, C583760Mv0 c583760Mv0) {
        C661490Px5 c661490Px5;
        CopyOnWriteArraySet<OnUIPlayListener> copyOnWriteArraySet;
        C661470Px3 videoView = interfaceC584630MwP.getVideoView();
        if (videoView != null && c583760Mv0 != null && (c661490Px5 = videoView.LLILLJJLI) != null && (copyOnWriteArraySet = c661490Px5.LJIILLIIL) != null) {
            copyOnWriteArraySet.remove(c583760Mv0);
        }
    }
}
