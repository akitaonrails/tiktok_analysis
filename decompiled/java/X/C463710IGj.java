package X;

import android.content.Context;
import android.os.Build;
import android.view.KeyEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkLinkMicLandscapeSetting;
import com.bytedance.android.livesdk.workaround.SurfaceViewAndroid10Workaround;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0IGj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C463710IGj {
    public View LIZ;
    public boolean LIZIZ;

    public final Context LIZ() {
        return this.LIZ.getContext();
    }

    public final ViewGroup.LayoutParams LIZIZ() throws Exception {
        ViewGroup.LayoutParams layoutParams = this.LIZ.getLayoutParams();
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() && (layoutParams.height == 0 || layoutParams.width == 0)) {
            throw new Exception("somewhere you changed make SurfaceView width and height equal to 0. This is not allowed");
        }
        return layoutParams;
    }

    public final InterfaceC463820IGu LIZJ() {
        KeyEvent.Callback callback = this.LIZ;
        if (callback instanceof InterfaceC463820IGu) {
            return (InterfaceC463820IGu) callback;
        }
        return null;
    }

    public C463710IGj(View view) {
        C0IF5 c0if5;
        this.LIZ = view;
        if (SurfaceViewAndroid10Workaround.INSTANCE.isProxyPositionChangeListenerOfSurfaceView() && Build.VERSION.SDK_INT == 29 && (view instanceof SurfaceView)) {
            new C1474170oSt().LIZIZ((SurfaceView) view);
        }
        KeyEvent.Callback callback = this.LIZ;
        if ((callback instanceof C0IF5) && (c0if5 = (C0IF5) callback) != null) {
            c0if5.setVisibilityChangeListener(new C463230IEn(this));
        }
    }

    public final void LJFF(int i) {
        LJ(i, "");
    }

    public final void LIZLLL(ViewGroup.LayoutParams layoutParams, String str) {
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LiveRoomVideoView_setLayoutParams: width: ");
            sbLIZ.append(layoutParams.width);
            sbLIZ.append(", height: ");
            sbLIZ.append(layoutParams.height);
            sbLIZ.append(", leftMargin: ");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            sbLIZ.append(layoutParams2.leftMargin);
            sbLIZ.append(", rightMargin: ");
            sbLIZ.append(layoutParams2.rightMargin);
            sbLIZ.append(", topMargin: ");
            sbLIZ.append(layoutParams2.topMargin);
            sbLIZ.append(", bottomMargin: ");
            sbLIZ.append(layoutParams2.bottomMargin);
            sbLIZ.append(", gravity:  ");
            sbLIZ.append(layoutParams2.gravity);
            sbLIZ.append(", from: ");
            sbLIZ.append(str);
            sbLIZ.append(" hc = ");
            sbLIZ.append(this.LIZ.hashCode());
            sbLIZ.append(" lp.hc = ");
            sbLIZ.append(layoutParams.hashCode());
            C20441214yg.LIZIZ("live_renderview", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (((ILinkMicService) C1161920gLG.LIZJ(ILinkMicService.class)).zu(this.LIZ, layoutParams, str)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("l:");
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams;
            sbLIZ2.append(layoutParams3.leftMargin);
            sbLIZ2.append(", t:");
            sbLIZ2.append(layoutParams3.topMargin);
            sbLIZ2.append(", w:");
            sbLIZ2.append(layoutParams.width);
            sbLIZ2.append(", h:");
            sbLIZ2.append(layoutParams.height);
            sbLIZ2.append(", g:");
            sbLIZ2.append(layoutParams3.gravity);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("In linkmic room, setLayoutParams ignore, ");
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(", from=");
            sbLIZ3.append(str);
            C20441214yg.LIZIZ("live_renderview", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        if (this.LIZ.getContext() != null) {
            if (layoutParams.height != 0 || layoutParams.width != 0) {
                if (LiveSdkLinkMicLandscapeSetting.isEnable() && !C497740JfY.LJIL() && ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).w9()) {
                    ((FrameLayout.LayoutParams) layoutParams).gravity = 49;
                }
                C786410Ut5.W5(this.LIZ, layoutParams);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("In room: setLayoutParams = code: ");
                sbLIZ4.append(this.LIZ.hashCode());
                sbLIZ4.append(" width: ");
                sbLIZ4.append(layoutParams.width);
                sbLIZ4.append(", height: ");
                sbLIZ4.append(layoutParams.height);
                sbLIZ4.append(", from=");
                sbLIZ4.append(str);
                C20441214yg.LJ("LiveRoomVideoView", C2188811AlT.LIZIZ(sbLIZ4));
            }
        }
    }

    public final Unit LJ(int i, String str) {
        KeyEvent.Callback callback = this.LIZ;
        if (!(callback instanceof InterfaceC464060IHs) || callback == null) {
            return null;
        }
        ((InterfaceC464060IHs) callback).LIZJ(i, str);
        return Unit.LIZ;
    }

    public final void LJI(int i, String str) {
        if (this.LIZ.getContext() != null) {
            try {
                C12ES.LJIILL(i, this.LIZ);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            C827750WdZ.LIZIZ("LiveRoomVideoView", "In room: setVisibility=" + i + ", source=" + str + ", hashcode=" + hashCode());
        }
    }
}
