package X;

import Y.ALAdapterS0S0201000_7;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import webcast.api.room.EncourageGoLiveCard;
import webcast.api.room.GoLiveCardPicture;

/* JADX INFO: renamed from: X.0IcH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470230IcH extends C09AY implements Function2<Integer, Integer, Unit> {
    public final /* synthetic */ C470220IcG LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C470230IcH(C470220IcG c470220IcG) {
        super(2);
        this.LL = c470220IcG;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
        TuxTextView tuxTextView;
        View view;
        Object c098200Yq;
        Object c098200Yq2;
        String str;
        String str2;
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        C470220IcG c470220IcG = this.LL;
        EncourageGoLiveCard encourageGoLiveCard = c470220IcG.LLILZ;
        if (encourageGoLiveCard != null && (tuxTextView = c470220IcG.LLJJL) != null && (view = c470220IcG.LLJJLIIIJLLLLLLLZ) != null) {
            Object obj = null;
            try {
                GoLiveCardPicture goLiveCardPicture = (GoLiveCardPicture) C13LP.LJJJLZIJ(iIntValue, encourageGoLiveCard.pictures);
                if (goLiveCardPicture != null) {
                    str2 = goLiveCardPicture.bgColor;
                } else {
                    str2 = null;
                }
                c098200Yq = Integer.valueOf(Color.parseColor(str2));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Integer num3 = (Integer) c098200Yq;
            if (num3 != null) {
                int iIntValue3 = num3.intValue();
                try {
                    GoLiveCardPicture goLiveCardPicture2 = (GoLiveCardPicture) C13LP.LJJJLZIJ(iIntValue2, encourageGoLiveCard.pictures);
                    if (goLiveCardPicture2 != null) {
                        str = goLiveCardPicture2.bgColor;
                    } else {
                        str = null;
                    }
                    c098200Yq2 = Integer.valueOf(Color.parseColor(str));
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                    obj = c098200Yq2;
                }
                Integer num4 = (Integer) obj;
                if (num4 != null) {
                    ObjectAnimator objectAnimatorOfArgb = ObjectAnimator.ofArgb(view, C470220IcG.LLJLIL, iIntValue3, num4.intValue());
                    objectAnimatorOfArgb.setEvaluator(new ArgbEvaluator());
                    objectAnimatorOfArgb.setDuration(350L);
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxTextView, (Property<TuxTextView, Float>) View.ALPHA, 1.0f, 0.3f);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tuxTextView, (Property<TuxTextView, Float>) View.ALPHA, 0.3f, 1.0f);
                    objectAnimatorOfFloat.addListener(new ALAdapterS0S0201000_7(tuxTextView, encourageGoLiveCard, iIntValue2, 1));
                    long j = 350 / ((long) 2);
                    objectAnimatorOfFloat.setDuration(j);
                    objectAnimatorOfFloat2.setDuration(j);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.play(objectAnimatorOfArgb).with(objectAnimatorOfFloat).before(objectAnimatorOfFloat2);
                    animatorSet.start();
                }
            }
        }
        C470220IcG c470220IcG2 = this.LL;
        c470220IcG2.LLJJJJJIL.removeCallbacks(c470220IcG2.LLJL);
        C470220IcG c470220IcG3 = this.LL;
        C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, c470220IcG3.LLJJJJJIL, c470220IcG3.LLJL);
        return Unit.LIZ;
    }
}
