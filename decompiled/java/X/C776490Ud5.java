package X;

import Y.AObserverS216S0100000_12;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.game.broadcast.bgbroadcast.internalrecord.EnableFallbackAudioOldChainSetting;
import com.bytedance.android.livesdk.game.common.datachannel.GameLiveInternalRecordFallbackChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.GameFloatTipsOptimize;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ud5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C776490Ud5 implements InterfaceC777850UfH {
    public static final /* synthetic */ int LLJ = 0;
    public final Fragment LL;
    public final DataChannel LLILLJJLI;
    public final InterfaceC778270Ufx LLILLL;
    public final Context LLILZ;
    public DialogC778400UgA LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;

    @Override // X.InterfaceC777850UfH
    public final void LJII(AbstractC777950UfR abstractC777950UfR, EnumC778130Ufj enumC778130Ufj) {
    }

    public final void LIZ() {
        DialogC778400UgA dialogC778400UgA;
        DialogC778400UgA dialogC778400UgA2 = this.LLILZIL;
        if (dialogC778400UgA2 == null || !dialogC778400UgA2.isShowing() || (dialogC778400UgA = this.LLILZIL) == null) {
            return;
        }
        dialogC778400UgA.dismiss();
        C785410UrT.LIZ(dialogC778400UgA);
    }

    public final void LIZIZ() {
        DialogC778400UgA dialogC778400UgA;
        boolean z = false;
        if (!EnableFallbackAudioOldChainSetting.INSTANCE.enable() || !Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(GameLiveInternalRecordFallbackChannel.class), Boolean.TRUE)) {
            Map<String, Object> map = C1338270kvh.LIZ;
            return;
        }
        if (!this.LLIZ && ((dialogC778400UgA = this.LLILZIL) == null || !dialogC778400UgA.isShowing())) {
            z = true;
        }
        boolean z2 = !this.LLILZLL;
        if (z) {
            Map<String, Object> map2 = C1338270kvh.LIZ;
            this.LLILLL.LIZIZ().addToShow(10, this.LL, new AObserverS216S0100000_12(this, 71));
            if (!z2) {
                return;
            }
        } else if (!z2) {
            Map<String, Object> map3 = C1338270kvh.LIZ;
            return;
        }
        LIZJ(C497740JfY.LJIJI(2131853416), true);
        this.LLILZLL = true;
    }

    @Override // X.InterfaceC777850UfH
    public final void LJI(AbstractC777950UfR abstractC777950UfR) {
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    public final void LIZJ(String str, boolean z) {
        if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            if (z) {
                C777840UfG.LJII(new AbstractC777950UfR() { // from class: X.0Uef
                    public final EnumC777930UfP LJ = EnumC777930UfP.PRIORITY_TYPE_P2;
                    public final EnumC777480Ueg LJFF = EnumC777480Ueg.MIC_MUTE;
                    public final CharSequence LJI = C497740JfY.LJIJI(2131853416);

                    {
                        this.LIZIZ = new AbstractC777790UfB() { // from class: X.0Uex
                            public final EnumC777770Uf9 LIZ = EnumC777770Uf9.CLOSE;

                            @Override // X.AbstractC777790UfB
                            public final EnumC777770Uf9 LIZ() {
                                return this.LIZ;
                            }
                        };
                    }

                    @Override // X.AbstractC777950UfR
                    public final EnumC777930UfP LIZJ() {
                        return this.LJ;
                    }

                    @Override // X.AbstractC777950UfR
                    public final CharSequence LIZLLL() {
                        return this.LJI;
                    }

                    @Override // X.AbstractC777950UfR
                    public final EnumC777480Ueg LJ() {
                        return this.LJFF;
                    }
                });
                return;
            } else {
                C777840UfG.LIZIZ(EnumC777480Ueg.MIC_MUTE);
                return;
            }
        }
        this.LLILLL.LJIIIZ(EnumC778100Ufg.LIVE_TIP_MESSAGE_MIC_MUTE.ordinal(), null, str, null, z);
    }

    public C776490Ud5(Fragment fragment, DataChannel dataChannel, InterfaceC778270Ufx interfaceC778270Ufx) {
        this.LL = fragment;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = interfaceC778270Ufx;
        this.LLILZ = fragment.requireContext();
    }
}
