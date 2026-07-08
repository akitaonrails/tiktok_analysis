package X;

import Y.AcS496S0100000_15;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdkapi.host.IHostAction;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import tikcast.linkmic.common.AnchorLayoutSetting;
import tikcast.linkmic.common.AnchorLayoutStyleSetting;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0ZxS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C916520ZxS {
    public static void LIZ(Function0 function0) {
        int i;
        AnchorLayoutStyleSetting next;
        int i2;
        PosIdentity posIdentity;
        AnchorLayoutSetting anchorLayoutSettingLIZLLL = C940770aaZ.LIZ().getDataSource().LIZLLL();
        Iterator<AnchorLayoutStyleSetting> it2 = anchorLayoutSettingLIZLLL.layoutStyleSettings.iterator();
        while (true) {
            i = 0;
            if (it2.hasNext()) {
                next = it2.next();
                if (next.layoutStyle == anchorLayoutSettingLIZLLL.latestLayoutStyle) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AnchorLayoutStyleSetting anchorLayoutStyleSetting = next;
        if (anchorLayoutStyleSetting != null) {
            i2 = anchorLayoutStyleSetting.maxPosition;
        } else {
            i2 = 9;
        }
        int i3 = i2 - 1;
        List<C957020b0m> listLJIIIZ = C940770aaZ.LIZ().getDataSource().LJIIIZ();
        if (!(listLJIIIZ instanceof Collection) || !listLJIIIZ.isEmpty()) {
            i = 0;
            for (C957020b0m c957020b0m : listLJIIIZ) {
                PosIdentity posIdentity2 = c957020b0m.getPosIdentity();
                if ((posIdentity2 != null && posIdentity2.type == 1) || ((posIdentity = c957020b0m.getPosIdentity()) != null && posIdentity.type == 2)) {
                    i++;
                    if (i < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
        }
        int i4 = i - 1;
        int iLJIIJ = C940770aaZ.LIZ().getDataSource().LJIIJ();
        C20441214yg.LIZIZ("CancelZoomMoreInterceptorV2", "enlargeStatus," + iLJIIJ + ", curGuestCount = " + i4 + ", lastCacheGuestMicCount = " + i3);
        if (iLJIIJ == 2 && i4 > i3) {
            C782110Um9 c782110Um9 = new C782110Um9(((IHostAction) C915980Zwa.LIZIZ.getValue()).getTopContext());
            c782110Um9.LJIILLIIL = true;
            c782110Um9.LJIILL = true;
            c782110Um9.LJIIZILJ(2131853007);
            c782110Um9.LJII(2131853006);
            c782110Um9.LJIILIIL(2131853008, new AcS496S0100000_15(function0, 63));
            c782110Um9.LJIIJ(2131853005, new InterfaceC743640TFa() { // from class: X.0ZxT
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                    C20441214yg.LIZIZ("CancelZoomMoreInterceptorV2", "cancel action");
                }
            });
            C786410Ut5.E4(c782110Um9.LIZ());
            return;
        }
        function0.invoke();
    }
}
