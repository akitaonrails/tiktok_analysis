package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.chatroom.slide.v2.LiveSlideUpGuideAvoidSetting;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: X.0IQV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IQV implements C0IKO, Observer<Boolean>, InterfaceC1102150emr, InterfaceC1102160ems, InterfaceC465570INn {
    public static final C0IQV LL;
    public static LiveRoomFragment LLILLJJLI;
    public static C0IOL LLILLL;
    public static ViewGroup LLILZ;
    public static DataChannel LLILZIL;
    public static EnterRoomConfig LLILZLL;
    public static String LLIZ;
    public static C11JF LLIZLLLIL;
    public static boolean LLJ;
    public static boolean LLJI;
    public static boolean LLJIJIL;
    public static boolean LLJILJIL;
    public static boolean LLJILJILJ;
    public static boolean LLJILLL;
    public static Runnable LLJJ;
    public static C0IQX LLJJI;
    public static final C465560INm LLJJIII;
    public static final C0IQZ LLJJIJI;
    public static final C0IJ6 LLJJIJIIJIL;
    public static final C0IQW LLJJIJIL;
    public static final boolean LLJJJ;

    @Override // X.InterfaceC1102150emr
    public final List<String> Q0() {
        return null;
    }

    @Override // X.InterfaceC1102150emr
    public final boolean e() {
        return true;
    }

    @Override // X.InterfaceC1102150emr
    public final int getComponentType() {
        return 19;
    }

    @Override // X.InterfaceC1102150emr
    public final C0K9J getUiInfo() {
        return null;
    }

    static {
        C0IQV c0iqv = new C0IQV();
        LL = c0iqv;
        C0IQY c0iqy = new C0IQY(c0iqv);
        C465560INm c465560INm = new C465560INm(c0iqv);
        LLJJIII = c465560INm;
        LLJJIJI = new C0IQZ(c0iqy);
        LLJJIJIIJIL = new C0IJ6(c465560INm);
        LLJJIJIL = new C0IQW(c465560INm);
        LLJJJ = LiveSlideUpGuideAvoidSetting.INSTANCE.getValue();
    }

    @Override // X.InterfaceC465570INn
    public final void LIZ() {
        if (LLJJJ) {
            C1102070emj c1102070emj = C1102070emj.LIZ;
            DataChannel dataChannel = LLILZIL;
            c1102070emj.getClass();
            C1102070emj.LJIIL(dataChannel, 0, "SlideUpGuide");
        }
    }

    @Override // X.C0IKO
    public final void LIZIZ() {
        if (LLJ) {
            LIZJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0201  */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.0IQX] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instruction units count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IQV.LIZJ():void");
    }

    public final void LIZLLL() {
        if (LLJ) {
            LLILLJJLI = null;
            C0IOL c0iol = LLILLL;
            if (c0iol != null) {
                ((HashSet) c0iol.LL).remove(this);
            }
            LLILLL = null;
            LLILZ = null;
            LLILZIL = null;
            LLILZLL = null;
            LLIZ = null;
            C11JF c11jf = LLIZLLLIL;
            if (c11jf != null) {
                c11jf.dispose();
            }
            LLIZLLLIL = null;
            C465560INm c465560INm = LLJJIII;
            ValueAnimator valueAnimator = c465560INm.LIZJ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = c465560INm.LIZIZ;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            c465560INm.LIZJ = null;
            c465560INm.LIZIZ = null;
            c465560INm.LJFF = false;
            c465560INm.LIZLLL = false;
            LLJ = false;
            LLJI = false;
            LLJIJIL = false;
            LLJILJIL = false;
            LLJILJILJ = false;
            LLJILLL = false;
            LLJJ = null;
            LLJJI = null;
            if (LLJJJ) {
                return;
            }
            C473050Igp.LIZIZ().LIZLLL.removeObserver(this);
        }
    }

    @Override // X.InterfaceC1102150emr
    public final EnumC1107830ew1 LJIIL() {
        return EnumC1107830ew1.GESTURE_GUIDE;
    }

    @Override // X.InterfaceC1102150emr
    public final EnumC1100250ejn m() {
        return EnumC1100250ejn.MESSAGE;
    }

    @Override // X.InterfaceC1102160ems
    public final void LLFFF(int i) {
        Runnable runnable = LLJJ;
        if (runnable != null) {
            runnable.run();
            LLJJ = null;
            LLJILLL = true;
            C1102070emj.LIZ.LJIIJ(LLILZIL, LL, LLJJI, null);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        Boolean bool2 = bool;
        if (LLJ && bool2 != null && bool2.booleanValue()) {
            LIZJ();
        }
    }

    @Override // X.InterfaceC1102160ems
    public final void w0(int i, List<String> list) {
        LLFFF(i);
    }

    @Override // X.InterfaceC1102160ems
    public final void t(int i, int i2, InterfaceC1102120emo interfaceC1102120emo, C1102130emp c1102130emp, boolean z) {
        InterfaceC466370IQp currentFragment;
        C465560INm c465560INm = LLJJIII;
        if (c465560INm.LJFF) {
            LiveRoomFragment liveRoomFragment = LLILLJJLI;
            InterfaceC466370IQp interfaceC466370IQpZR = null;
            if (liveRoomFragment != null) {
                currentFragment = liveRoomFragment.getCurrentFragment();
            } else {
                currentFragment = null;
            }
            LiveRoomFragment liveRoomFragment2 = LLILLJJLI;
            if (liveRoomFragment2 != null) {
                interfaceC466370IQpZR = liveRoomFragment2.ZR();
            }
            if ((currentFragment instanceof LivePlayFragment) && (interfaceC466370IQpZR instanceof LivePlayFragment)) {
                c465560INm.LIZIZ((LivePlayFragment) currentFragment, (LivePlayFragment) interfaceC466370IQpZR);
            }
        }
    }
}
