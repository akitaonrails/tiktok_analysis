package X;

import Y.AAListenerS276S0200000_29;
import Y.AAListenerS323S0100000_12;
import Y.AAListenerS339S0100000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.CycleInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.notify.IBusinessAvoidConflictNotifyService;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.12O6, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12O6 extends C12O8 {
    public final LiveIconView LJ;
    public final C16F5 LJFF;
    public final View LJI;
    public final View LJII;
    public final ConstraintLayout LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;

    @Override // X.C12O8
    public final int LJII() {
        return 38;
    }

    @Override // X.C12O8
    public final int LJIIIZ() {
        return 73;
    }

    @Override // X.C12O8
    public final int LJIIJJI() {
        return 1;
    }

    @Override // X.C12O8
    public final boolean LJIJI() {
        return true;
    }

    @Override // X.C12O8
    public final void LJIILJJIL() {
        Map<String, Integer> map;
        User owner;
        long j = LiveHostAutoAdaptiveParams.disableLiveCenterAnim() ? 0L : 500L;
        C12OY.LJIIZILJ(LJ(), "violation", "show");
        C12OA c12oa = this.LIZJ.get();
        if (c12oa != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_center_icon");
            c474500IjALIZ.LJIJJLI(LJ());
            Gson gson = C19748512Ol.LIZJ;
            c474500IjALIZ.LJJII(GsonProtectorUtils.toJson(gson, ((LinkedHashMap) c12oa.LJ).keySet()), "record_id");
            c474500IjALIZ.LJJII("show", "action_type");
            c474500IjALIZ.LJJII("violation", "icon_type");
            c474500IjALIZ.LJJII(c12oa.LJ.isEmpty() ? "normal" : "restriction", "restriction_status");
            c474500IjALIZ.LJJII(Integer.valueOf(c12oa.LJ.size()), "restriction_number");
            c474500IjALIZ.LJJII(c12oa.LJ.isEmpty() ? CardStruct.IStatusCode.DEFAULT : "1", "is_violation");
            Map<String, String> map2 = c12oa.LJFF;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map2).entrySet()) {
                if (c12oa.LJ.containsKey(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            c474500IjALIZ.LJJII(GsonProtectorUtils.toJson(gson, linkedHashMap.values()), "violation_type");
            Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(LJ());
            c474500IjALIZ.LJJII((roomLJJLIIIIJ == null || (owner = roomLJJLIIIIJ.getOwner()) == null) ? null : Long.valueOf(owner.getId()), "violation_anchor_id");
            c474500IjALIZ.LIZ();
        }
        C500260Jjc.LLFFF(this.LJFF);
        C500260Jjc.LLFFF(this.LJ);
        ConstraintLayout constraintLayout = this.LJIIIIZZ;
        if (constraintLayout != null) {
            C786410Ut5.c5(constraintLayout, 1.0f);
        }
        C12OA c12oa2 = this.LIZJ.get();
        if (c12oa2 == null || (map = c12oa2.LJ) == null || !map.isEmpty()) {
            C16F5 c16f5 = this.LJFF;
            if (c16f5 != null) {
                c16f5.setText(2131844158);
            }
        } else {
            C16F5 c16f52 = this.LJFF;
            if (c16f52 != null) {
                c16f52.setText(2131844157);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LJIIIIZZ, (Property<ConstraintLayout, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LJI, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(LiveHostAutoAdaptiveParams.disableLiveCenterAnim() ? 0L : 2800L);
        objectAnimatorOfFloat2.setInterpolator(new CycleInterpolator(2.0f));
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.LJFF, (Property<C16F5, Float>) View.ALPHA, 0.9f, 0.5f);
        objectAnimatorOfFloat3.setDuration(j);
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(this.LJIIIZ, this.LJIIJ);
        valueAnimatorOfArgb.addUpdateListener(new AUListenerS277S0100000_29(this, 60));
        valueAnimatorOfArgb.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.LJ, (Property<LiveIconView, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat4.setDuration(j);
        objectAnimatorOfFloat4.addListener(new AAListenerS339S0100000_29(this, 24));
        objectAnimatorOfFloat4.setStartDelay(2250L);
        animatorSet2.playTogether(objectAnimatorOfFloat3, valueAnimatorOfArgb, objectAnimatorOfFloat4);
        animatorSet2.addListener(new AAListenerS276S0200000_29(this, this, 3));
        animatorSet.addListener(new AAListenerS323S0100000_12(animatorSet2, 25));
        animatorSet.start();
    }

    @Override // X.C12O8
    public final void LJIIZILJ() {
        DataChannel dataChannelLJ = LJ();
        if (dataChannelLJ != null) {
            ((IBusinessAvoidConflictNotifyService) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class)).f10(dataChannelLJ, C1107810evz.LJJJJIZL, new C1107780evw(false, 2));
        }
    }

    @Override // X.C12O8
    public final View LIZJ() {
        return this.LJIIIIZZ;
    }

    public C12O6(View view) {
        super(C12OE.PUNISH_END, 7, 0);
        this.LJIIIZ = C497740JfY.LIZLLL(R.attr.etr, view.getContext());
        this.LJIIJ = C497740JfY.LIZLLL(R.attr.c9l, view.getContext());
        this.LJI = view.findViewById(R.id.bnv);
        this.LJIIIIZZ = (ConstraintLayout) view.findViewById(R.id.violation_area);
        this.LJ = (LiveIconView) view.findViewById(R.id.violation_icon);
        this.LJFF = (C16F5) view.findViewById(R.id.violation_text);
        this.LJII = view.findViewById(R.id.jsv);
    }

    @Override // X.C12O8
    public final void LJIIL(C12OB c12ob) {
        long j;
        if (LiveHostAutoAdaptiveParams.disableLiveCenterAnim()) {
            j = 0;
        } else {
            j = 150;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LJIIIIZZ, (Property<ConstraintLayout, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.addListener(new AAListenerS339S0100000_29(this, 22));
        objectAnimatorOfFloat.addListener(new AAListenerS339S0100000_29(c12ob, 23));
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }
}
