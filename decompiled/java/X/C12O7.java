package X;

import Y.AAListenerS276S0200000_29;
import Y.AAListenerS339S0100000_29;
import Y.ARunnableS98S0200000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
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
import java.util.LinkedList;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS238S0300000_29;

/* JADX INFO: renamed from: X.12O7, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12O7 extends C12O8 {
    public final LinkedList<Pair<Integer, Integer>> LJ;
    public boolean LJFF;
    public final LiveIconView LJI;
    public final C16F5 LJII;
    public final View LJIIIIZZ;
    public final View LJIIIZ;
    public final View LJIIJ;
    public final ConstraintLayout LJIIJJI;
    public final int LJIIL;
    public final int LJIILIIL;

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
        return 2;
    }

    @Override // X.C12O8
    public final void LJIILL(C12O8 c12o8) {
    }

    @Override // X.C12O8
    public final boolean LJIJI() {
        return true;
    }

    @Override // X.C12O8
    public final void LJIIZILJ() {
        this.LJ.clear();
        DataChannel dataChannelLJ = LJ();
        if (dataChannelLJ != null) {
            ((IBusinessAvoidConflictNotifyService) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class)).f10(dataChannelLJ, C1107810evz.LJJJJIZL, new C1107780evw(false, 2));
        }
    }

    public final boolean LJJ() {
        Map<String, Integer> map;
        C12OA c12oa = this.LIZJ.get();
        return (c12oa == null || (map = c12oa.LJ) == null || map.size() <= 0) ? false : true;
    }

    public final void LJJI() {
        C12OA c12oa = this.LIZJ.get();
        if (c12oa != null) {
            LJIJJ(c12oa.LJI, c12oa.LJ.size());
        }
    }

    @Override // X.C12O8
    public final View LIZJ() {
        return this.LJIIJJI;
    }

    @Override // X.C12O8
    public final void LJIILJJIL() {
        LJJI();
    }

    public C12O7(View view) {
        super(C12OE.PUNISH, 7, 0);
        this.LJ = new LinkedList<>();
        this.LJIIIIZZ = view.findViewById(R.id.bnu);
        this.LJIIIZ = view.findViewById(R.id.bnv);
        this.LJIIJJI = (ConstraintLayout) view.findViewById(R.id.violation_area);
        this.LJI = (LiveIconView) view.findViewById(R.id.violation_icon);
        this.LJII = (C16F5) view.findViewById(R.id.violation_text);
        this.LJIIJ = view.findViewById(R.id.jsv);
        this.LJIIL = C497740JfY.LIZLLL(R.attr.etr, view.getContext());
        this.LJIILIIL = C497740JfY.LIZLLL(R.attr.c9l, view.getContext());
    }

    public static String LJIL(int i) {
        if (i == 1) {
            String strLJIJI = C497740JfY.LJIJI(2131844159);
            if (strLJIJI == null) {
                return "";
            }
            return strLJIJI;
        }
        return C497740JfY.LJIJJ(2131844156, Integer.valueOf(i));
    }

    @Override // X.C12O8
    public final boolean LIZ(C12O8 c12o8) {
        return c12o8 instanceof C12O7;
    }

    @Override // X.C12O8
    public final void LJIIL(C12OB c12ob) {
        long j;
        if (LJJ()) {
            if (LiveHostAutoAdaptiveParams.disableLiveCenterAnim()) {
                j = 0;
            } else {
                j = 150;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LJIIJJI, (Property<ConstraintLayout, Float>) View.ALPHA, 1.0f, 0.0f);
            objectAnimatorOfFloat.setDuration(j);
            objectAnimatorOfFloat.addListener(new AAListenerS339S0100000_29(this, 19));
            objectAnimatorOfFloat.addListener(new AAListenerS276S0200000_29(this, c12ob, 10));
            C786410Ut5.Pd(objectAnimatorOfFloat);
            return;
        }
        LJIJJLI(c12ob, null);
    }

    @Override // X.C12O8
    public final void LJIILLIIL(C19MB c19mb) {
        int size;
        Map<String, Integer> map;
        super.LJIILLIIL(c19mb);
        C16F5 c16f5 = this.LJII;
        if (c16f5 != null) {
            C12OA c12oa = this.LIZJ.get();
            if (c12oa != null && (map = c12oa.LJ) != null) {
                size = map.size();
            } else {
                size = 0;
            }
            c16f5.setText(LJIL(size));
        }
        C16F5 c16f52 = this.LJII;
        if (c16f52 != null) {
            C786410Ut5.k5(c16f52, 1.0f);
        }
        LiveIconView liveIconView = this.LJI;
        if (liveIconView != null) {
            C786410Ut5.i5(liveIconView, 1.0f);
        }
    }

    public final void LJJIFFI(String str) {
        String str2;
        String str3;
        Long lValueOf;
        User owner;
        C12OY.LJIIZILJ(LJ(), "violation", str);
        C12OA c12oa = this.LIZJ.get();
        if (c12oa != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_center_icon");
            c474500IjALIZ.LJIJJLI(LJ());
            Gson gson = C19748512Ol.LIZJ;
            c474500IjALIZ.LJJII(GsonProtectorUtils.toJson(gson, ((LinkedHashMap) c12oa.LJ).keySet()), "record_id");
            c474500IjALIZ.LJJII(str, "action_type");
            c474500IjALIZ.LJJII("violation", "icon_type");
            if (c12oa.LJ.isEmpty()) {
                str2 = "normal";
            } else {
                str2 = "restriction";
            }
            c474500IjALIZ.LJJII(str2, "restriction_status");
            c474500IjALIZ.LJJII(Integer.valueOf(c12oa.LJ.size()), "restriction_number");
            if (c12oa.LJ.isEmpty()) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            } else {
                str3 = "1";
            }
            c474500IjALIZ.LJJII(str3, "is_violation");
            Map<String, String> map = c12oa.LJFF;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                if (c12oa.LJ.containsKey(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            c474500IjALIZ.LJJII(GsonProtectorUtils.toJson(gson, linkedHashMap.values()), "violation_type");
            Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(LJ());
            if (roomLJJLIIIIJ != null && (owner = roomLJJLIIIIJ.getOwner()) != null) {
                lValueOf = Long.valueOf(owner.getId());
            } else {
                lValueOf = null;
            }
            c474500IjALIZ.LJJII(lValueOf, "violation_anchor_id");
            c474500IjALIZ.LIZ();
        }
    }

    @Override // X.C12O8
    public final void LJIILIIL(C12OB c12ob, AwS238S0300000_29 awS238S0300000_29) {
        if (LJJ()) {
            super.LJIILIIL(c12ob, awS238S0300000_29);
        } else {
            LJIJJLI(c12ob, awS238S0300000_29);
        }
    }

    public final void LJIJJ(int i, int i2) {
        Pair<Integer, Integer> pairPoll;
        LJJIFFI("show");
        this.LJ.add(new Pair<>(Integer.valueOf(i), Integer.valueOf(i2)));
        if (!this.LJFF && (pairPoll = this.LJ.poll()) != null) {
            this.LJFF = true;
            C473410IhP.LIZJ(new ARunnableS98S0200000_29(this, pairPoll, 70), 0L);
        }
    }

    public final void LJIJJLI(C12OB c12ob, AwS238S0300000_29 awS238S0300000_29) {
        long j;
        if (LiveHostAutoAdaptiveParams.disableLiveCenterAnim()) {
            j = 0;
        } else {
            j = 500;
        }
        C16F5 c16f5 = this.LJII;
        if (c16f5 != null) {
            c16f5.setText(2131844157);
        }
        C500260Jjc.LLFFF(this.LJII);
        C500260Jjc.LLFFF(this.LJI);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LJII, (Property<C16F5, Float>) View.ALPHA, 0.9f, 0.5f);
        objectAnimatorOfFloat.setDuration(j);
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(this.LJIIL, this.LJIILIIL);
        valueAnimatorOfArgb.addUpdateListener(new AUListenerS277S0100000_29(this, 48));
        valueAnimatorOfArgb.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LJI, (Property<LiveIconView, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(j);
        objectAnimatorOfFloat2.addListener(new AAListenerS276S0200000_29(this, awS238S0300000_29, 7));
        objectAnimatorOfFloat2.setStartDelay(2250L);
        animatorSet.playTogether(objectAnimatorOfFloat, valueAnimatorOfArgb, objectAnimatorOfFloat2);
        animatorSet.addListener(new AAListenerS276S0200000_29(this, c12ob, 8));
        animatorSet.start();
    }
}
