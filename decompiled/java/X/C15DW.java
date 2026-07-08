package X;

import android.animation.AnimatorSet;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpAnimationEndEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpAnimationStartEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpStarAnimationStartEvent;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.15DW, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15DW implements InterfaceC977420bXg {
    public final Function0<Unit> LL;
    public ViewGroup LLILLJJLI;
    public View LLILLL;
    public DataChannel LLILZ;
    public C1295960jpS LLILZIL;
    public C994700bzY LLILZLL;
    public AnimatorSet LLIZ;
    public final C423250Gih LLIZLLLIL = new C423250Gih(new AwS575S0100000_31(this, 1329), new AwS575S0100000_31(this, 1331), "MvpAnimationComponent");

    @Override // X.InterfaceC977420bXg
    public final void LJII(BattleInfoResponse battleInfoResponse) {
    }

    @Override // X.InterfaceC977420bXg
    public final void reset() {
    }

    public final void LJIIIIZZ() {
        C20441214yg.LIZIZ("MvpAnimationComponent", "onMvpLottieEnd");
        DataChannel dataChannel = this.LLILZ;
        if (dataChannel != null) {
            dataChannel.FQ2(BattleMvpAnimationEndEvent.class);
        }
        this.LL.invoke();
    }

    @Override // X.InterfaceC977430bXh
    public final void dismiss() {
        C20441214yg.LIZIZ("MvpAnimationComponent", "dismiss");
        C1295960jpS c1295960jpS = this.LLILZIL;
        if (c1295960jpS != null) {
            c1295960jpS.removeAllAnimatorListeners();
        }
        C1295960jpS c1295960jpS2 = this.LLILZIL;
        if (c1295960jpS2 != null) {
            c1295960jpS2.cancelAnimation();
        }
        C1295960jpS c1295960jpS3 = this.LLILZIL;
        if (c1295960jpS3 != null) {
            C786410Ut5.LLD(8, c1295960jpS3);
        }
        this.LLIZLLLIL.LIZIZ(8);
        AnimatorSet animatorSet = this.LLIZ;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.LLIZ;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
    }

    @Override // X.InterfaceC977430bXh
    public final void onUnload() {
        C20441214yg.LIZIZ("MvpAnimationComponent", "onUnload");
        DataChannel dataChannel = this.LLILZ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public static final boolean LJI() {
        return C915980Zwa.LJFF().r82() && C915980Zwa.LJII().L6();
    }

    public C15DW(AwS559S0100000_15 awS559S0100000_15) {
        this.LL = awS559S0100000_15;
    }

    @Override // X.InterfaceC977420bXg
    public final void LIZJ(AbstractC986700bme abstractC986700bme) {
        C1295960jpS c1295960jpS;
        if ((abstractC986700bme instanceof C986690bmd) && (c1295960jpS = this.LLILZIL) != null && c1295960jpS.isAnimating()) {
            C20441214yg.LJIIIZ("MvpAnimationComponent", "[Enlarge] cancel mvp animation on layout enlarge");
            C1295960jpS c1295960jpS2 = this.LLILZIL;
            if (c1295960jpS2 != null) {
                c1295960jpS2.cancelAnimation();
            }
            AnimatorSet animatorSet = this.LLIZ;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            LJIIIIZZ();
        }
        this.LLIZLLLIL.LIZ();
    }

    @Override // X.InterfaceC977430bXh
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        ViewGroup viewGroup;
        C994700bzY c994700bzY;
        C1295960jpS c1295960jpS;
        this.LLILZ = matchBaseWidget.dataChannel;
        View view = matchBaseWidget.contentView;
        C1295960jpS c1295960jpS2 = null;
        if (view != null) {
            viewGroup = (ViewGroup) view.findViewById(R.id.mcy);
        } else {
            viewGroup = null;
        }
        this.LLILLJJLI = viewGroup;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(matchBaseWidget.context), R.layout.h31, null, false);
        this.LLILLL = viewTd;
        if (viewTd != null) {
            c994700bzY = (C994700bzY) viewTd.findViewById(R.id.bu8);
        } else {
            c994700bzY = null;
        }
        this.LLILZLL = c994700bzY;
        View view2 = this.LLILLL;
        if (view2 != null) {
            c1295960jpS2 = (C1295960jpS) view2.findViewById(R.id.ntp);
        }
        this.LLILZIL = c1295960jpS2;
        if (c1295960jpS2 != null) {
            c1295960jpS2.removeAllAnimatorListeners();
        }
        C1295960jpS c1295960jpS3 = this.LLILZIL;
        if (c1295960jpS3 != null) {
            c1295960jpS3.cancelAnimation();
        }
        ViewGroup viewGroup2 = this.LLILLJJLI;
        if (viewGroup2 != null) {
            viewGroup2.addView(this.LLILLL);
        }
        if (Build.VERSION.SDK_INT > 26 && (c1295960jpS = this.LLILZIL) != null) {
            c1295960jpS.setRenderMode(EnumC1295970jpT.HARDWARE);
        }
        C20441214yg.LJ("MvpAnimationComponent", "MvpAnimation onLoad");
        DataChannel dataChannel = this.LLILZ;
        if (dataChannel != null) {
            dataChannel.CQ2(BattleMvpAnimationStartEvent.class, this, new AwS610S0100000_31(this, 289));
        }
        DataChannel dataChannel2 = this.LLILZ;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(BattleMvpStarAnimationStartEvent.class, this, new AwS595S0100000_16(this, 187));
        }
        this.LLIZLLLIL.LIZ();
    }

    @Override // X.InterfaceC977420bXg
    public final void LJFF(C975960bVK c975960bVK) {
        C20441214yg.LIZIZ("MvpAnimationComponent", "show");
        C1295960jpS c1295960jpS = this.LLILZIL;
        if (c1295960jpS != null) {
            c1295960jpS.removeAllAnimatorListeners();
        }
        C1295960jpS c1295960jpS2 = this.LLILZIL;
        if (c1295960jpS2 != null) {
            c1295960jpS2.cancelAnimation();
        }
        this.LLIZLLLIL.LIZIZ(0);
        C1295960jpS c1295960jpS3 = this.LLILZIL;
        if (c1295960jpS3 != null) {
            C786410Ut5.LLD(0, c1295960jpS3);
        }
        AnimatorSet animatorSet = this.LLIZ;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.LLIZ;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
    }
}
