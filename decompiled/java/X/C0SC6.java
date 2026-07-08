package X;

import Y.AAListenerS322S0100000_11;
import Y.ARunnableS71S0200000_2;
import Y.AUListenerS261S0100000_11;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.animation.Interpolator;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.touchpoint.api.model.CommonFeedButton;
import com.ss.android.ugc.aweme.feed.assem.incentive.IncentiveBottomButtonAssem;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0SC6, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.incentive.IncentiveBottomButtonAssem$onBind$2", f = "IncentiveBottomButtonAssem.kt", l = {}, m = "invokeSuspend")
public final class C0SC6 extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ VideoItemParams LL;
    public final /* synthetic */ CommonFeedButton LLILLJJLI;
    public final /* synthetic */ IncentiveBottomButtonAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SC6(VideoItemParams videoItemParams, CommonFeedButton commonFeedButton, IncentiveBottomButtonAssem incentiveBottomButtonAssem, InterfaceC1364105Vn<? super C0SC6> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = videoItemParams;
        this.LLILLJJLI = commonFeedButton;
        this.LLILLL = incentiveBottomButtonAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0SC6(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int height;
        C1C7U.LIZ("IncentiveBottomButtonAssem@df21.onBind$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Set<String> set = C710500Rtw.LIZ;
        String authorUid = AwemeExtKt.getAuthorUid(this.LL.getAweme());
        Set<String> set2 = C710500Rtw.LIZIZ;
        if (!set2.contains(authorUid)) {
            set2.add(authorUid);
        }
        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("click_position", "confirm"));
        Integer num = this.LLILLJJLI.LIZJ;
        c1894320zOY.getClass();
        C1894320zOY.LJIILJJIL(95, mapLJIIJ, num, null, null);
        IncentiveBottomButtonAssem incentiveBottomButtonAssem = this.LLILLL;
        RelationButton relationButton = incentiveBottomButtonAssem.LLJLLIL;
        if (relationButton != null) {
            relationButton.clearAnimation();
        }
        RelationButton relationButton2 = incentiveBottomButtonAssem.LLJLLIL;
        if (relationButton2 != null && relationButton2.isAttachedToWindow() && relationButton2.hasWindowFocus() && relationButton2.getWindowVisibility() == 0 && relationButton2.isShown() && relationButton2.getWidth() > 0 && relationButton2.getHeight() > 0 && relationButton2.getAlpha() > 0.0f && relationButton2.getGlobalVisibleRect(new Rect())) {
            Interpolator interpolatorLJ = C1619980sG4.LJ();
            int[] iArr = new int[2];
            RelationButton relationButton3 = incentiveBottomButtonAssem.LLJLLIL;
            if (relationButton3 != null) {
                height = relationButton3.getHeight();
            } else {
                height = 0;
            }
            iArr[0] = height;
            iArr[1] = 0;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iArr);
            valueAnimatorOfInt.setInterpolator(interpolatorLJ);
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS261S0100000_11(incentiveBottomButtonAssem, 28));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setInterpolator(interpolatorLJ);
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS261S0100000_11(incentiveBottomButtonAssem, 27));
            valueAnimatorOfFloat.addListener(new AAListenerS322S0100000_11(incentiveBottomButtonAssem, 30));
            RelationButton relationButton4 = incentiveBottomButtonAssem.LLJLLIL;
            if (relationButton4 != null) {
                HandlerHook.viewPostDelay(relationButton4, new ARunnableS71S0200000_2(valueAnimatorOfInt, valueAnimatorOfFloat, 28), 600L);
            }
        } else {
            RelationButton relationButton5 = incentiveBottomButtonAssem.LLJLLIL;
            if (relationButton5 != null) {
                C786410Ut5.LJLLLLLL(8, relationButton5);
            }
        }
        C1C7U.LIZIZ("IncentiveBottomButtonAssem@df21.onBind$2");
        return false;
    }
}
