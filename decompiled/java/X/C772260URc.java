package X;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.broadcast.TryModeGoLiveChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.startlive.PreviewContinueLiveHelper;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.message.proto.CppAgeVerificationInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.router.monitor.RouterPageMonitor;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0URc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C772260URc implements InterfaceC465240IMg {
    public final DataChannel LL;
    public final Context LLILLJJLI;
    public final Fragment LLILLL;
    public DialogC780480UjW LLILZ;
    public final C01GW LLILZIL;
    public final C772410URr LLILZLL;
    public C0UQ6 LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public int LLJIJIL;

    public final void LIZJ() throws Throwable {
        C19EG c19egLJ = C500260Jjc.LJ(this.LLILLJJLI);
        PreviewContinueLiveHelper previewContinueLiveHelper = PreviewContinueLiveHelper.LIZ;
        LiveMode liveModeLIZJ = C751980Tee.LIZJ(this.LL);
        previewContinueLiveHelper.getClass();
        int iLIZ = PreviewContinueLiveHelper.LIZ(liveModeLIZJ);
        this.LL.zW(TryModeGoLiveChannel.class, Boolean.TRUE);
        if (c19egLJ != null) {
            Intent intentCreateStartBroadcastIntent = C781270Ukn.LJIIJ().createStartBroadcastIntent(c19egLJ, iLIZ);
            intentCreateStartBroadcastIntent.putExtra("request_page", "try_mode");
            intentCreateStartBroadcastIntent.putExtra("is_try_mode", false);
            intentCreateStartBroadcastIntent.putExtra("is_from_try_mode", true);
            intentCreateStartBroadcastIntent.setFlags(268435456);
            c19egLJ.finish();
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19egLJ, intentCreateStartBroadcastIntent, "Context_startActivity_1");
            C1701330uNH.LIZ(intentCreateStartBroadcastIntent, c19egLJ);
            C2204961BRm.LLJJJJ(c19egLJ, intentCreateStartBroadcastIntent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+gUiv1nfRXtrB3gN3JPSSLlX+pkuy7Jp78IMg==", null));
        }
    }

    @Override // X.InterfaceC465240IMg
    public final void handleMsg(Message message) {
        if (this.LLIZ == null) {
            DataChannel dataChannel = this.LL;
            this.LLIZ = new C0UQ6(this.LLILLJJLI, this.LLILLL, dataChannel);
        }
        C0UQ6 c0uq6 = this.LLIZ;
        if (c0uq6 != null) {
            c0uq6.LIZJ(message, LiveMode.VIDEO, new C772280URe(this), new C772270URd(this), null, true, true);
        }
    }

    public static void LIZ(DataChannel dataChannel, int i) {
        C0UTQ c0utq = (C0UTQ) DataChannelGlobal.LLILZ.gg0(C931280aLG.class);
        if (c0utq != null) {
            c0utq.LJI = 1;
            c0utq.LJIIIZ = System.currentTimeMillis();
            c0utq.LJIIJ = i;
        }
        C0UTP.LIZ.LIZLLL(dataChannel, 1);
    }

    public final void LIZIZ(String str, String str2) {
        String str3;
        Boolean bool;
        CppAgeVerificationInfo cppAgeVerificationInfo;
        Integer num;
        C0UTQ c0utq = new C0UTQ();
        c0utq.LIZ = System.currentTimeMillis();
        LiveMode liveMode = LiveMode.VIDEO;
        c0utq.LIZIZ = liveMode.logStreamingType;
        boolean z = true;
        c0utq.LIZJ = true;
        c0utq.LJ = C776270Ucj.LJIIL;
        c0utq.LJFF = 0;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.JQ2(C931280aLG.class, c0utq);
        C0UO8 c0uo8 = C0UO8.LIZ;
        DataChannel dataChannel = this.LL;
        Context context = this.LLILLJJLI;
        c0uo8.getClass();
        C0UNK c0unk = (C0UNK) dataChannelGlobal.gg0(C931290aLH.class);
        if (c0unk == null || (num = c0unk.LIZIZ) == null || num.intValue() != -1) {
            z = false;
        }
        if (!z) {
            LiveMode liveMode2 = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
            if (liveMode2 == null || (str3 = liveMode2.logStreamingType) == null) {
                str3 = liveMode.logStreamingType;
            }
            if (c0unk != null) {
                bool = c0unk.LIZ;
            } else {
                bool = null;
            }
            if (!C500260Jjc.LJJJI(bool)) {
                if (c0unk != null) {
                    cppAgeVerificationInfo = c0unk.LIZJ;
                } else {
                    cppAgeVerificationInfo = null;
                }
                if (C0UO8.LIZIZ(cppAgeVerificationInfo, context, "try_mode", str3, true, dataChannel)) {
                    if (c0unk != null) {
                        c0unk.LIZ = Boolean.TRUE;
                    }
                    LIZ(this.LL, 110);
                    return;
                }
            }
        }
        if (this.LLILZLL == null) {
            return;
        }
        this.LLIZLLLIL = str;
        this.LLJ = str2;
        if (this.LLILZ == null) {
            C780470UjV c780470UjV = new C780470UjV(this.LLILLJJLI);
            c780470UjV.LIZIZ = C497740JfY.LJIJI(2131853470);
            this.LLILZ = c780470UjV.LIZ();
        }
        C500260Jjc.LJJLIIIJLLLLLLLZ(this.LLILZ);
        C500260Jjc.LJJJJJ(this.LLILLL, null, new C772250URb(this, str, str2, null), 3);
    }

    public C772260URc(Context context, Fragment fragment, DataChannel dataChannel) {
        this.LL = dataChannel;
        this.LLILLJJLI = context;
        this.LLILLL = fragment;
        C01GW c01gwLIZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 741));
        this.LLILZIL = c01gwLIZ;
        this.LLIZLLLIL = "";
        this.LLJ = "";
        this.LLJI = "";
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        C772410URr c772410URr = (C772410URr) dataChannelGlobal.gg0(C168U.class);
        if (c772410URr != null) {
            c772410URr.LIZ = (Handler) c01gwLIZ.getValue();
        } else {
            c772410URr = null;
        }
        this.LLILZLL = c772410URr;
        dataChannelGlobal.IQ2(C168U.class);
    }
}
