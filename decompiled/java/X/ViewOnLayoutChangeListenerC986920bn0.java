package X;

import Y.ARunnableS84S0200000_15;
import android.graphics.Rect;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multihost.biz.link.MultiCoHostWidget;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.LynxStreamSizeChangeChannel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bn0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class ViewOnLayoutChangeListenerC986920bn0 implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 4:
                onLayoutChange$4(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 5:
                onLayoutChange$5(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 6:
                onLayoutChange$6(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 7:
                onLayoutChange$7(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 8:
                onLayoutChange$8(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onLayoutChange$9(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onLayoutChange$10(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onLayoutChange$11(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onLayoutChange$12(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onLayoutChange$13(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC986920bn0(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC986920bn0 viewOnLayoutChangeListenerC986920bn0, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC986920bn0);
        ((Function0) viewOnLayoutChangeListenerC986920bn0.l0).invoke();
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC986920bn0 viewOnLayoutChangeListenerC986920bn0, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        HandlerHook.viewPostDelay(view, new ARunnableS84S0200000_15(view, (DialogC971210bNf) viewOnLayoutChangeListenerC986920bn0.l0, 3), 500L);
    }

    public static final void onLayoutChange$10(ViewOnLayoutChangeListenerC986920bn0 viewOnLayoutChangeListenerC986920bn0, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC986920bn0);
        ((Function0) viewOnLayoutChangeListenerC986920bn0.l0).invoke();
    }

    public static final void onLayoutChange$11(ViewOnLayoutChangeListenerC986920bn0 viewOnLayoutChangeListenerC986920bn0, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
            C940980aau c940980aau = (C940980aau) viewOnLayoutChangeListenerC986920bn0.l0;
            long j = c940980aau.LLJJL;
            if (j > 0) {
                c940980aau.LJIILJJIL(j);
            }
        }
    }

    public static final void onLayoutChange$12(ViewOnLayoutChangeListenerC986920bn0 viewOnLayoutChangeListenerC986920bn0, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C942280ad0) viewOnLayoutChangeListenerC986920bn0.l0).LJIIIZ();
    }

    public static final void onLayoutChange$13(ViewOnLayoutChangeListenerC986920bn0 viewOnLayoutChangeListenerC986920bn0, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        HandlerHook.viewPostDelay(view, new ARunnableS84S0200000_15(view, (DialogC971200bNe) viewOnLayoutChangeListenerC986920bn0.l0, 87), 500L);
    }

    public static final void onLayoutChange$2(ViewOnLayoutChangeListenerC986920bn0 viewOnLayoutChangeListenerC986920bn0, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        DataChannel dataChannel = ((MultiCoHostWidget) viewOnLayoutChangeListenerC986920bn0.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(LynxStreamSizeChangeChannel.class, new Rect(i, i2, i3, i4));
        }
    }

    public static final void onLayoutChange$3(ViewOnLayoutChangeListenerC986920bn0 viewOnLayoutChangeListenerC986920bn0, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C939290aYB c939290aYB = (C939290aYB) viewOnLayoutChangeListenerC986920bn0.l0;
        c939290aYB.LLIZ = i3 - i;
        c939290aYB.LLIZLLLIL = i4 - i2;
    }

    public static final void onLayoutChange$4(ViewOnLayoutChangeListenerC986920bn0 viewOnLayoutChangeListenerC986920bn0, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C939350aYH c939350aYH = (C939350aYH) viewOnLayoutChangeListenerC986920bn0.l0;
        c939350aYH.LLJIJIL = i3 - i;
        c939350aYH.LLJILJIL = i4 - i2;
    }

    public static final void onLayoutChange$5(ViewOnLayoutChangeListenerC986920bn0 viewOnLayoutChangeListenerC986920bn0, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ImageModel value;
        MutableLiveData<ImageModel> mutableLiveDataLJFF;
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC986920bn0);
        ViewOnClickListenerC939670aYn viewOnClickListenerC939670aYn = (ViewOnClickListenerC939670aYn) viewOnLayoutChangeListenerC986920bn0.l0;
        AbstractC938650aX9 abstractC938650aX9 = viewOnClickListenerC939670aYn.LLJIJIL;
        if (abstractC938650aX9 != null && (mutableLiveDataLJFF = abstractC938650aX9.LJFF()) != null) {
            value = mutableLiveDataLJFF.getValue();
        } else {
            value = null;
        }
        viewOnClickListenerC939670aYn.LJII(value);
    }

    public static final void onLayoutChange$6(ViewOnLayoutChangeListenerC986920bn0 viewOnLayoutChangeListenerC986920bn0, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC986920bn0);
        ((Function0) viewOnLayoutChangeListenerC986920bn0.l0).invoke();
    }

    public static final void onLayoutChange$7(ViewOnLayoutChangeListenerC986920bn0 viewOnLayoutChangeListenerC986920bn0, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC986920bn0);
        ((Function0) viewOnLayoutChangeListenerC986920bn0.l0).invoke();
    }

    public static final void onLayoutChange$8(ViewOnLayoutChangeListenerC986920bn0 viewOnLayoutChangeListenerC986920bn0, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC986920bn0);
        ((Function0) viewOnLayoutChangeListenerC986920bn0.l0).invoke();
    }

    public static final void onLayoutChange$9(ViewOnLayoutChangeListenerC986920bn0 viewOnLayoutChangeListenerC986920bn0, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC986920bn0);
        ((Function0) viewOnLayoutChangeListenerC986920bn0.l0).invoke();
    }
}
