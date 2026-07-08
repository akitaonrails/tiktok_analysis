package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveHangoutPerformanceOptSetting;
import com.ss.android.ugc.aweme.hangout.component.livecard.view.HangoutRoomFeedAssem;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Kd3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class ViewOnLayoutChangeListenerC521670Kd3 implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

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
        }
    }

    public ViewOnLayoutChangeListenerC521670Kd3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC521670Kd3 viewOnLayoutChangeListenerC521670Kd3, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Fragment fragment = (Fragment) viewOnLayoutChangeListenerC521670Kd3.l0;
        WeakHashMap<View, Integer> weakHashMap = C0IUT.LIZIZ.get(fragment);
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap<>();
        }
        HashMap map = new HashMap();
        int i9 = 0;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            i9++;
            map.put(parent, Integer.valueOf(i9));
        }
        for (ViewParent parent2 = view.getParent(); parent2 != null; parent2 = parent2.getParent()) {
            if (map.containsKey(parent2)) {
                int iIntValue = i9 - ((Number) map.get(parent2)).intValue();
                if ((parent2 instanceof View) && !weakHashMap.containsKey(parent2)) {
                    weakHashMap.put(parent2, Integer.valueOf(iIntValue));
                }
            }
        }
        C0IUT.LIZIZ.put(fragment, weakHashMap);
        ((View) viewOnLayoutChangeListenerC521670Kd3.l1).removeOnLayoutChangeListener(viewOnLayoutChangeListenerC521670Kd3);
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC521670Kd3 viewOnLayoutChangeListenerC521670Kd3, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 - i2 != i8 - i6) {
            ((C482930Iwl) viewOnLayoutChangeListenerC521670Kd3.l0).LIZIZ((C483100Ix2) viewOnLayoutChangeListenerC521670Kd3.l1);
            C482930Iwl c482930Iwl = (C482930Iwl) viewOnLayoutChangeListenerC521670Kd3.l0;
            if (c482930Iwl.LLIZLLLIL == EnumC482940Iwm.OPENED) {
                c482930Iwl.LJFF();
            }
        }
    }

    public static final void onLayoutChange$2(ViewOnLayoutChangeListenerC521670Kd3 viewOnLayoutChangeListenerC521670Kd3, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ValueAnimator valueAnimator;
        int iKp = ((HangoutRoomFeedAssem) viewOnLayoutChangeListenerC521670Kd3.l0).kp();
        if (iKp <= 0) {
            return;
        }
        if (iKp != ((C118300cf) viewOnLayoutChangeListenerC521670Kd3.l1).element) {
            if (!TiktokLiveHangoutPerformanceOptSetting.isHotPathLogReduceOpt()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("feed anchor changed: ");
                sbLIZ.append(((C118300cf) viewOnLayoutChangeListenerC521670Kd3.l1).element);
                sbLIZ.append(" -> ");
                sbLIZ.append(iKp);
                sbLIZ.append(", isExpanded=");
                sbLIZ.append(((HangoutRoomFeedAssem) viewOnLayoutChangeListenerC521670Kd3.l0).LLJJJ);
                C20441214yg.LIZIZ("HangoutRoomFeedAssem", C2188811AlT.LIZIZ(sbLIZ));
            }
            ((C118300cf) viewOnLayoutChangeListenerC521670Kd3.l1).element = iKp;
            HangoutRoomFeedAssem hangoutRoomFeedAssem = (HangoutRoomFeedAssem) viewOnLayoutChangeListenerC521670Kd3.l0;
            if (!hangoutRoomFeedAssem.LLJJJ && !hangoutRoomFeedAssem.LLJJJJLIIL && ((valueAnimator = hangoutRoomFeedAssem.LLJLILLLLZIIL) == null || !valueAnimator.isRunning())) {
                HangoutRoomFeedAssem hangoutRoomFeedAssem2 = (HangoutRoomFeedAssem) viewOnLayoutChangeListenerC521670Kd3.l0;
                if (!hangoutRoomFeedAssem2.LLJZ) {
                    hangoutRoomFeedAssem2.hp(iKp);
                }
            }
        }
        HangoutRoomFeedAssem hangoutRoomFeedAssem3 = (HangoutRoomFeedAssem) viewOnLayoutChangeListenerC521670Kd3.l0;
        if (hangoutRoomFeedAssem3.LLLILZJ) {
            View view2 = hangoutRoomFeedAssem3.LLJJIJIIJIL;
            if (view2 != null && view2.getVisibility() == 0) {
                return;
            }
            View view3 = ((HangoutRoomFeedAssem) viewOnLayoutChangeListenerC521670Kd3.l0).LLJJIJIIJIL;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(0, view3);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fragmentContainer set to VISIBLE after layout, anchor=");
            sbLIZ2.append(iKp);
            C20441214yg.LIZIZ("HangoutRoomFeedAssem", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public static final void onLayoutChange$3(ViewOnLayoutChangeListenerC521670Kd3 viewOnLayoutChangeListenerC521670Kd3, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        if (i9 != i8 - i6) {
            ((Function1) viewOnLayoutChangeListenerC521670Kd3.l0).invoke(Integer.valueOf(i9));
            if (view != null) {
                view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC521670Kd3);
            }
            ((C476840Imw) viewOnLayoutChangeListenerC521670Kd3.l1).LJIIL = null;
        }
    }
}
