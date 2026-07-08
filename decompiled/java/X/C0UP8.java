package X;

import Y.AfS181S0100000_12;
import android.text.TextUtils;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.model.GameLiveConvertInfo;
import com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment;
import com.bytedance.android.livesdkapi.user.ApplyLivePermission;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import kotlin.Pair;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0UP8, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UP8 {
    public final DataChannel LIZ;
    public Fragment LIZIZ;
    public final DetailLivePermission LIZJ;
    public final ApplyLivePermission LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public Window.Callback LJI;
    public C0UPA LJII;
    public boolean LJIIIIZZ;
    public final C19489311Mt<GameLiveConvertInfo> LJIIIZ;
    public C11JF LJIIJ;
    public C11JL LJIIJJI;
    public String LJIIL;
    public Pair<Long, Long> LJIILIIL;
    public final AfS181S0100000_12 LJIILJJIL;

    public final Pair<Long, Long> LIZ() {
        Pair<Long, Long> pair = this.LJIILIIL;
        if (pair != null) {
            return pair;
        }
        this.LJIILIIL = new Pair<>(0L, 0L);
        String strLIZIZ = InterfaceC772390URp.E.LIZIZ();
        if (TextUtils.isEmpty(strLIZIZ)) {
            this.LJIILIIL = new Pair<>(0L, 0L);
        }
        try {
            this.LJIILIIL = (Pair) C19748512Ol.LIZJ.LJIIIIZZ(strLIZIZ, new TypeToken<Pair<? extends Long, ? extends Long>>() { // from class: X.0UP9
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("PreviewGameContentHelper", e);
        }
        return this.LJIILIIL;
    }

    public C0UP8(LiveBroadcastPreviewFragment liveBroadcastPreviewFragment, DataChannel dataChannel) {
        this.LIZ = dataChannel;
        this.LIZIZ = liveBroadcastPreviewFragment;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        this.LIZJ = (DetailLivePermission) dataChannelGlobal.gg0(C168F.class);
        this.LIZLLL = (ApplyLivePermission) dataChannelGlobal.gg0(C168D.class);
        this.LJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 12));
        this.LJFF = C452501pT.LIZIZ(new AwS556S0100000_12(this, 13));
        this.LJIIIZ = new C19489311Mt<>();
        this.LJIILJJIL = new AfS181S0100000_12(this, 67);
    }

    public static void LIZIZ(String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_takepage_video_convertion_guide_show_fail");
        c474500IjALIZ.LJJII("video_live", "live_type");
        c474500IjALIZ.LJJII(str, "target_live_type");
        c474500IjALIZ.LJJII(str2, "fail_reason");
        c474500IjALIZ.LIZ();
    }
}
