package X;

import Y.AAListenerS63S0110000_12;
import Y.ACListenerS147S0100000_12;
import Y.AUListenerS262S0100000_12;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS88S1000000_3;

/* JADX INFO: renamed from: X.0U7H, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U7H extends AbstractC761520Tu2 {
    public final DataChannel LIZLLL;
    public final LiveSmallItemBeautyViewModel LJ;
    public final C0U7L LJFF;
    public final ViewGroup LJI;
    public final C16F5 LJII;
    public AnonymousClass0956 LJIIIIZZ;
    public ValueAnimator LJIIIZ;

    @Override // X.AbstractC761520Tu2
    public final void LIZIZ() {
    }

    @Override // X.AbstractC761520Tu2
    public final void LIZLLL() {
        C0U7R.LIZ.LJFF("enter ai optimize tab", "");
        LJFF();
        C500260Jjc.LLFFF(this.LIZIZ);
        C0U7L c0u7l = this.LJFF;
        if (c0u7l != null) {
            c0u7l.notifyDataSetChanged();
        }
    }

    public final C0UJY LJ() {
        return ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getLiveParamsListener(this.LIZLLL);
    }

    @Override // X.AbstractC761520Tu2
    public final void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unobserve: ");
        AnonymousClass0956 anonymousClass0956 = this.LJIIIIZZ;
        sbLIZ.append(anonymousClass0956 != null ? Boolean.valueOf(anonymousClass0956.isActive()) : null);
        C20441214yg.LIZIZ("AIBeauty#dialogClose", C2188811AlT.LIZIZ(sbLIZ));
        AnonymousClass0956 anonymousClass09562 = this.LJIIIIZZ;
        if (anonymousClass09562 == null || !anonymousClass09562.isActive()) {
            return;
        }
        AnonymousClass0956 anonymousClass09563 = this.LJIIIIZZ;
        if (anonymousClass09563 != null) {
            C23118094a.LIZIZ("dialog close", null, anonymousClass09563);
        }
        this.LJIIIIZZ = null;
    }

    @Override // X.AbstractC761520Tu2
    public final void LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unobserve: ");
        AnonymousClass0956 anonymousClass0956 = this.LJIIIIZZ;
        sbLIZ.append(anonymousClass0956 != null ? Boolean.valueOf(anonymousClass0956.isActive()) : null);
        C20441214yg.LIZIZ("AIBeauty#remove", C2188811AlT.LIZIZ(sbLIZ));
        AnonymousClass0956 anonymousClass09562 = this.LJIIIIZZ;
        if (anonymousClass09562 == null || !anonymousClass09562.isActive()) {
            return;
        }
        AnonymousClass0956 anonymousClass09563 = this.LJIIIIZZ;
        if (anonymousClass09563 != null) {
            C23118094a.LIZIZ("dialog close", null, anonymousClass09563);
        }
        this.LJIIIIZZ = null;
    }

    public final void LJFF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observe ");
        AnonymousClass0956 anonymousClass0956 = this.LJIIIIZZ;
        sbLIZ.append(anonymousClass0956 != null ? Boolean.valueOf(anonymousClass0956.isActive()) : null);
        C20441214yg.LIZIZ("AIBeauty", C2188811AlT.LIZIZ(sbLIZ));
        AnonymousClass0956 anonymousClass09562 = this.LJIIIIZZ;
        if (anonymousClass09562 == null || !anonymousClass09562.isActive()) {
            this.LJIIIIZZ = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LJ), null, null, new C0U7I(this, null), 3);
        }
    }

    public final void LJII() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("paramListener: ");
        sbLIZ.append(LJ());
        C20441214yg.LIZIZ("AIBeauty", C2188811AlT.LIZIZ(sbLIZ));
        LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel = this.LJ;
        liveSmallItemBeautyViewModel.LLJILJIL++;
        DataChannel dataChannel = this.LIZLLL;
        C0U7R c0u7r = C0U7R.LIZ;
        String strValueOf = String.valueOf(liveSmallItemBeautyViewModel.LLJ);
        String strValueOf2 = String.valueOf(liveSmallItemBeautyViewModel.LLIZLLLIL);
        String str = liveSmallItemBeautyViewModel.LLJIJIL;
        int iDQ2 = liveSmallItemBeautyViewModel.DQ2();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_ai_optimize_start");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(strValueOf, "color_correction_setting");
        c474500IjALIZ.LJJII(strValueOf2, "beauty_setting");
        c474500IjALIZ.LJJII(str, "task_id");
        c474500IjALIZ.LJJII(Integer.valueOf(iDQ2), "task_round");
        c474500IjALIZ.LIZ();
        C0UJY c0ujyLJ = LJ();
        if (c0ujyLJ != null) {
            C20441214yg.LIZIZ("AIBeauty", "paramListener not null");
            c0ujyLJ.LJIILJJIL(new InterfaceC770080UIs() { // from class: X.0U7J
                @Override // X.InterfaceC770080UIs
                public final void LIZ(Bitmap bitmap) {
                    if (bitmap != null) {
                        C20441214yg.LIZIZ("AIBeauty", "start upload");
                        this.LIZ.LJ.JQ2(new C080700Rx(bitmap));
                        C0U7H c0u7h = this.LIZ;
                        c0u7h.getClass();
                        C500260Jjc.LJJLIIIJILLIZJL(new AwS556S0100000_12(c0u7h, 938));
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 30000);
                        valueAnimatorOfInt.addListener(new AAListenerS63S0110000_12(c0u7h, 3));
                        valueAnimatorOfInt.addUpdateListener(new AUListenerS262S0100000_12(c0u7h, 63));
                        valueAnimatorOfInt.setDuration(30000L);
                        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                        c0u7h.LJIIIZ = valueAnimatorOfInt;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("start: ");
                        sbLIZ2.append(c0u7h.LJIIIZ);
                        C20441214yg.LIZIZ("AIBeauty#anim", C2188811AlT.LIZIZ(sbLIZ2));
                        C500260Jjc.LJJLIIIJILLIZJL(new AwS556S0100000_12(c0u7h, 939));
                        return;
                    }
                    C20441214yg.LIZIZ("AIBeauty", "screen shot fail");
                    this.LIZ.LJ.BQ2(false, false);
                }
            });
        }
    }

    public final void LJI(String str, String str2) {
        C0U7R c0u7r = C0U7R.LIZ;
        DataChannel dataChannel = this.LIZLLL;
        LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel = this.LJ;
        String str3 = liveSmallItemBeautyViewModel.LLJIJIL;
        int iDQ2 = liveSmallItemBeautyViewModel.DQ2();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_optimize_permission_popup");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJIIZ(str2, "click_position", new AwS88S1000000_3(str2, 7));
        c474500IjALIZ.LJJII(str3, "task_id");
        c474500IjALIZ.LJJII(Integer.valueOf(iDQ2), "task_round");
        c474500IjALIZ.LIZ();
    }

    public C0U7H(ViewGroup viewGroup, DataChannel dataChannel, LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel) {
        super(R.layout.gf3, viewGroup);
        this.LIZLLL = dataChannel;
        this.LJ = liveSmallItemBeautyViewModel;
        C20441214yg.LIZIZ("AIBeauty", "init");
        RunnableC781530UlD runnableC781530UlD = this.LIZIZ;
        runnableC781530UlD.setLayoutManager(this.LIZJ);
        C0U7L c0u7l = new C0U7L(dataChannel, liveSmallItemBeautyViewModel);
        this.LJFF = c0u7l;
        runnableC781530UlD.setAdapter(c0u7l);
        this.LJI = (ViewGroup) this.LIZ.findViewById(R.id.f667an3);
        this.LJII = (C16F5) this.LIZ.findViewById(R.id.s9w);
        C16F5 c16f5 = (C16F5) this.LIZ.findViewById(R.id.daz);
        if (c16f5 != null) {
            C786410Ut5.l8(c16f5, new ACListenerS147S0100000_12(this, 414));
        }
        LJFF();
    }
}
