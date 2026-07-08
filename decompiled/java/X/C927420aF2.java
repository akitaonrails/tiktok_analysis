package X;

import com.bytedance.android.live.liveinteract.linkroom.toolbarsheet.MultiGuestToolAndPlayFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.MultiGuestAsGuestModeratorsWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.moderator.LiveShowModeratorWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0aF2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C927420aF2 implements InterfaceC924830aAr {
    public final /* synthetic */ MultiGuestAsGuestModeratorsWidget LIZ;

    public C927420aF2(MultiGuestAsGuestModeratorsWidget multiGuestAsGuestModeratorsWidget) {
        this.LIZ = multiGuestAsGuestModeratorsWidget;
    }

    @Override // X.InterfaceC924830aAr
    public final void LIZ(int i) {
        Integer numValueOf;
        MultiGuestAsGuestModeratorsWidget multiGuestAsGuestModeratorsWidget = this.LIZ;
        int i2 = multiGuestAsGuestModeratorsWidget.LLJI;
        if (i2 == i) {
            return;
        }
        if (i2 == 0) {
            if (i > 0 && !C924230a9t.LIZ(2)) {
                MultiGuestLiveShowSetting multiGuestLiveShowSetting = MultiGuestLiveShowSetting.INSTANCE;
                if (multiGuestLiveShowSetting.isV1()) {
                    if (multiGuestAsGuestModeratorsWidget.LLIZLLLIL == null) {
                        if (multiGuestLiveShowSetting.isV1() && multiGuestAsGuestModeratorsWidget.LLIZLLLIL == null) {
                            C20441214yg.LIZIZ("MultiGuestAsGuestModeratorsWidget", "loadShowWidget");
                            multiGuestAsGuestModeratorsWidget.LLIZLLLIL = new LiveShowModeratorWidget();
                            multiGuestAsGuestModeratorsWidget.enableSubWidgetManager();
                            try {
                                multiGuestAsGuestModeratorsWidget.subWidgetManager.load(multiGuestAsGuestModeratorsWidget.LLIZLLLIL);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C20441214yg.LJ("MultiGuestAsGuestModeratorsWidget", String.valueOf(e));
                            }
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("loadShowWidget return as liveShowWidget:");
                            LiveShowModeratorWidget liveShowModeratorWidget = multiGuestAsGuestModeratorsWidget.LLIZLLLIL;
                            if (liveShowModeratorWidget != null) {
                                numValueOf = Integer.valueOf(liveShowModeratorWidget.hashCode());
                            } else {
                                numValueOf = null;
                            }
                            sbLIZ.append(numValueOf);
                            sbLIZ.append(' ');
                            sbLIZ.append(!multiGuestLiveShowSetting.isV1());
                            C20441214yg.LIZIZ("MultiGuestAsGuestModeratorsWidget", C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                    C20441214yg.LIZIZ("MultiGuestAsGuestModeratorsWidget", "showLiveShowBtn");
                    C923330a8R c923330a8R = C923330a8R.LIZ;
                    if (C923330a8R.LJIIIIZZ()) {
                        multiGuestAsGuestModeratorsWidget.dataChannel.zW(MultiGuestToolAndPlayFragment.LiveShowIconShowChannel.class, Boolean.TRUE);
                    }
                }
            }
        } else if (i2 > 0 && i == 0) {
            multiGuestAsGuestModeratorsWidget.y1();
        }
        this.LIZ.LLJI = i;
    }
}
