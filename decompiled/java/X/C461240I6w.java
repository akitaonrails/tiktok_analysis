package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMCrossAppFeatureDiffApi;
import com.ss.android.ugc.aweme.im.saas.host.api.messagelist.IMAwemeCardHostBridge;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.IMMediaServiceInternalBridge;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C461240I6w {
    public static final List LIZ(Activity activity, Fragment fragment, C869590Y9l c869590Y9l, SessionInfo sessionInfo, C0IBF c0ibf, C0ZQI c0zqi, PanelStateViewModel panelStateViewModel) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c0zqi.LIZIZ(c869590Y9l, true));
        if (C457760HxG.LIZIZ(false)) {
            String str = c869590Y9l.getLocalExt().get("video_sticker_status");
            if (str != null && C123100dR.LIZ(str) && CastIntegerProtector.parseInt(str) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!Intrinsics.LJFF(c869590Y9l.getScene(), "share_video_story") && z && C451740HnY.LIZ()) {
                IMCrossAppFeatureDiffApi.LIZ.getClass();
                C898670ZNh.LIZ();
                arrayList.add(C1558650qf9.LIZIZ("Create", C0ZL0.VIDEO_STICKER, Integer.valueOf(IMStickerApi.LIZ.LIZIZ().getImStickerStoreService().LJJIFFI()), 2131848842, false, new AwS372S0200000_6(c869590Y9l, c0zqi, 99), 48));
            }
        }
        if (sessionInfo != null && c0ibf != null && C461220I6u.LIZ(c869590Y9l, sessionInfo, c0ibf)) {
            IMAwemeCardHostBridge.LIZ.getClass();
            IMAwemeCardHostBridge value = C461250I6x.LIZIZ.getValue();
            C1562980qm8 c1562980qm8LIZJ = null;
            if (value != null) {
                c1562980qm8LIZJ = value.LIZJ(c869590Y9l, c0zqi, sessionInfo, c0ibf, fragment, activity, panelStateViewModel);
            }
            if ((c1562980qm8LIZJ instanceof C1562980qm8) && c1562980qm8LIZJ != null) {
                arrayList.add(c1562980qm8LIZJ);
            }
            IMMediaServiceInternalBridge iMMediaServiceInternalBridgeLIZ = IMMediaServiceInternalBridge.LIZ.LIZ();
            if (iMMediaServiceInternalBridgeLIZ != null) {
                iMMediaServiceInternalBridgeLIZ.LJIIIIZZ(sessionInfo, c0ibf, "quick_live_react", null, "message_long_press", C0I0B.LJFF.LIZIZ());
            }
        }
        return arrayList;
    }
}
