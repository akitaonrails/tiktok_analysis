package X;

import android.content.Context;
import android.os.Message;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.level.LevelRenderEffectConfig;
import com.bytedance.android.livesdk.livesetting.level.LiveLevelRenderEffectConfigSetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS418S0200000_17;

/* JADX INFO: renamed from: X.0eVD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091210eVD extends C1091180eVA implements InterfaceC1141530foN {
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLILZLL;
    public C1092630eXV LLIZ;
    public C1540830qCP LLIZLLLIL;
    public SparkContext LLJ;
    public String LLJI;
    public long LLJIJIL;
    public long LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public C1091150eV7 LLJJ;
    public final long LLJJI;
    public final long LLJJIII;

    @Override // X.C1091180eVA, X.InterfaceC1091030eUv
    public final void release() {
        LIZJ(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    @Override // X.C1091180eVA, X.InterfaceC1091030eUv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1091150eV7 r13) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1091210eVD.LIZ(X.0eV7):void");
    }

    public final void LIZJ(boolean z) {
        this.LLILZLL = null;
        C1092630eXV c1092630eXV = this.LLIZ;
        if (c1092630eXV != null) {
            c1092630eXV.LL = null;
        }
        C1540830qCP c1540830qCP = this.LLIZLLLIL;
        if (c1540830qCP != null) {
            c1540830qCP.LLILLJJLI = null;
            c1540830qCP.LLILLL = true;
        }
        this.LLIZLLLIL = null;
        this.LLIZ = null;
        this.LLJ = null;
        this.LLJI = "";
        this.LLJILJILJ = "";
        C1548820qPI.LJIIIIZZ("lynx_sar_render_start", this);
        C1548820qPI.LJIIIIZZ("lynx_sar_render_end", this);
        C1548820qPI.LJIIIIZZ("lynx_barrage_on_error", this);
        FrameLayout frameLayout = this.LLILLL;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        FrameLayout frameLayout2 = this.LLILLL;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(8, frameLayout2);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z2 = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        this.LLILZLL = null;
        this.LLILZIL.removeMessages(1001);
        this.LLILZIL.removeMessages(1002);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z;
        C1091090eV1 c1091090eV1;
        int i = message.what;
        if (i != 1001) {
            if (i == 1002) {
                DataChannel dataChannel = this.LL;
                String str = this.LLJILJILJ;
                C1091150eV7 c1091150eV7 = this.LLJJ;
                if (c1091150eV7 != null && (c1091090eV1 = c1091150eV7.LIZLLL) != null) {
                    z = c1091090eV1.LIZIZ;
                } else {
                    z = false;
                }
                C255500yn.LIZJ(dataChannel, str, this.LLJILLL, z, true);
                LIZJ(true);
                InterfaceC1091200eVC interfaceC1091200eVC = this.LLILLJJLI;
                if (interfaceC1091200eVC != null) {
                    interfaceC1091200eVC.LIZ();
                }
            }
            return false;
        }
        LIZIZ(new C1091190eVB(this, 10002, "first_frame_timeout_error"));
        return false;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        LIZIZ(new AwS418S0200000_17(c262100zr, this, 69));
    }

    public C1091210eVD(DataChannel dataChannel, InterfaceC1091200eVC interfaceC1091200eVC, FrameLayout frameLayout, Context context) {
        int i;
        super(dataChannel, interfaceC1091200eVC, frameLayout, context);
        this.LLJILJILJ = "";
        this.LLJILLL = "";
        LiveLevelRenderEffectConfigSetting liveLevelRenderEffectConfigSetting = LiveLevelRenderEffectConfigSetting.INSTANCE;
        LevelRenderEffectConfig levelSystemResConfig = liveLevelRenderEffectConfigSetting.getLevelSystemResConfig();
        if (levelSystemResConfig != null) {
            i = levelSystemResConfig.firstFrameTimeoutDuration;
        } else {
            i = 2;
        }
        this.LLJJI = ((long) i) * 1000;
        LevelRenderEffectConfig levelSystemResConfig2 = liveLevelRenderEffectConfigSetting.getLevelSystemResConfig();
        this.LLJJIII = ((long) (levelSystemResConfig2 != null ? levelSystemResConfig2.playEndExceedDuration : 2)) * 1000;
    }
}
