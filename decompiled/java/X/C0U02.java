package X;

import Y.AAListenerS323S0100000_12;
import Y.AUListenerS262S0100000_12;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeQueueSongListFragment;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U02, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.fragments.KaraokeQueueSongListFragment$updateNewSongHint$2", f = "KaraokeQueueSongListFragment.kt", l = {135}, m = "invokeSuspend")
public final class C0U02 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ KaraokeQueueSongListFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U02(KaraokeQueueSongListFragment karaokeQueueSongListFragment, InterfaceC1364105Vn<? super C0U02> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = karaokeQueueSongListFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0U02(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ViewGroup.LayoutParams layoutParams;
        C19ME c19me;
        C1C7U.LIZ("KaraokeQueueSongListFragment@687b.updateNewSongHint$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(Mp4ScreenVideoLoadTimeout.CONTROL, this) == objLJFF) {
                C1C7U.LIZIZ("KaraokeQueueSongListFragment@687b.updateNewSongHint$2");
                return objLJFF;
            }
        }
        KaraokeQueueSongListFragment karaokeQueueSongListFragment = this.LLILLJJLI;
        ValueAnimator valueAnimatorRS = karaokeQueueSongListFragment.rS();
        int[] iArr = new int[2];
        iArr[0] = 0;
        TextView textView = karaokeQueueSongListFragment.LLJJIII;
        TextView textView2 = null;
        if (textView == null) {
            textView = null;
        }
        iArr[1] = textView.getHeight();
        valueAnimatorRS.setIntValues(iArr);
        karaokeQueueSongListFragment.rS().removeAllListeners();
        karaokeQueueSongListFragment.rS().removeAllUpdateListeners();
        karaokeQueueSongListFragment.rS().addUpdateListener(new AUListenerS262S0100000_12(karaokeQueueSongListFragment, 48));
        karaokeQueueSongListFragment.rS().addListener(new AAListenerS323S0100000_12(karaokeQueueSongListFragment, 21));
        RunnableC781530UlD runnableC781530UlDVR = karaokeQueueSongListFragment.VR();
        if (runnableC781530UlDVR != null) {
            layoutParams = runnableC781530UlDVR.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
            TextView textView3 = karaokeQueueSongListFragment.LLJJIII;
            if (textView3 != null) {
                textView2 = textView3;
            }
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = textView2.getHeight();
            c19me.topToTop = 0;
            c19me.topToBottom = -1;
            RunnableC781530UlD runnableC781530UlDVR2 = karaokeQueueSongListFragment.VR();
            if (runnableC781530UlDVR2 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(runnableC781530UlDVR2);
                runnableC781530UlDVR2.setLayoutParams(c19me);
            }
        }
        karaokeQueueSongListFragment.rS().start();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeQueueSongListFragment@687b.updateNewSongHint$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
