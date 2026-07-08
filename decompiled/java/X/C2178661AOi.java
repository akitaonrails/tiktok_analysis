package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import com.ss.android.videoshop.context.VideoContext;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AOi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2178661AOi extends View {
    public VideoContext LL;

    public C2178661AOi(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        VideoContext videoContext = this.LL;
        if (videoContext != null) {
            C2178651AOh c2178651AOh = videoContext.LL;
            c2178651AOh.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onConfigurationChanged newConfig.orientation:");
            sbLIZ.append(configuration.orientation);
            C2188811AlT.LIZIZ(sbLIZ);
            EnumC1474430oTJ enumC1474430oTJ = EnumC1474430oTJ.ENTER_FULLSCREEN;
            if (c2178651AOh.LLILZLL == 3) {
                enumC1474430oTJ = EnumC1474430oTJ.EXIT_FULLSCREEN;
            }
            C1471760oP0 c1471760oP0LIZIZ = C1471760oP0.LIZIZ("FOOnConfigurationChanged", enumC1474430oTJ, 6);
            if (c1471760oP0LIZIZ != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(" ");
                sbLIZ2.append(configuration.orientation);
                c1471760oP0LIZIZ.LIZ("orientation", C2188811AlT.LIZIZ(sbLIZ2));
                EnumC1471750oOz.INS.addTrace(c2178651AOh.LLJJJ.LJJJJLI(), c1471760oP0LIZIZ);
            }
            int i = c2178651AOh.LLJI;
            int i2 = configuration.orientation;
            if (i != i2) {
                c2178651AOh.LLJI = i2;
                Activity activityLIZ = C1474460oTM.LIZ(c2178651AOh.LLJ);
                if (activityLIZ != null) {
                    int requestedOrientation = activityLIZ.getRequestedOrientation();
                    int i3 = c2178651AOh.LLJI;
                    if (i3 == 1) {
                        if (requestedOrientation == 1) {
                            c2178651AOh.LLJJJJJIL = requestedOrientation;
                        } else {
                            c2178651AOh.LLJJJJJIL = -1;
                        }
                    } else if (i3 == 2) {
                        if (requestedOrientation != 0 && requestedOrientation != 8) {
                            c2178651AOh.LLJJJJJIL = -1;
                        } else {
                            c2178651AOh.LLJJJJJIL = requestedOrientation;
                        }
                    } else {
                        c2178651AOh.LLJJJJJIL = -1;
                    }
                }
                if (c2178651AOh.LLJIJIL && c2178651AOh.LLILZLL == 1) {
                    c2178651AOh.LLILLJJLI.removeMessages(2);
                    c2178651AOh.LIZLLL(c2178651AOh.LLJILJILJ);
                    c2178651AOh.LLILZLL = 2;
                }
                c2178651AOh.LLJJJJ = false;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onConfigurationChanged currentOrientation:");
                sbLIZ3.append(c2178651AOh.LLJJJJJIL);
                C2188811AlT.LIZIZ(sbLIZ3);
            }
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        VideoContext videoContext = this.LL;
        if (videoContext != null) {
            Iterator it2 = ((ConcurrentHashMap) videoContext.LLJ).entrySet().iterator();
            while (it2.hasNext()) {
                C807710VmL c807710VmL = (C807710VmL) ((Map.Entry) it2.next()).getValue();
                if (c807710VmL != null) {
                    c807710VmL.onWindowFocusChanged(videoContext, z);
                }
            }
            videoContext.LJJLI(new C790900V0u() { // from class: X.1AP6
            });
        }
    }

    @Override // android.view.View
    public void setKeepScreenOn(boolean z) {
        VideoContext videoContext;
        C1471760oP0 c1471760oP0LIZIZ;
        if (getKeepScreenOn() != z && (videoContext = this.LL) != null && (c1471760oP0LIZIZ = C1471760oP0.LIZIZ("KeepScreenOn", EnumC1474430oTJ.KEEP_SCREEN, 6)) != null) {
            c1471760oP0LIZIZ.LIZ("keep", Intrinsics.LJIIJJI(Boolean.valueOf(z), ""));
            EnumC1471750oOz.INS.addTrace(videoContext.LJJJJLI(), c1471760oP0LIZIZ);
        }
        super.setKeepScreenOn(z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("keep_screen_on:");
        sbLIZ.append(z);
        sbLIZ.append(" hash:");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setVideoContext(VideoContext videoContext) {
        this.LL = videoContext;
    }
}
