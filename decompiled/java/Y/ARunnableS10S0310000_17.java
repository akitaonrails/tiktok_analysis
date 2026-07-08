package Y;

import X.AbstractC1136060ffY;
import X.C1092460eXE;
import X.C1111930f2d;
import X.C1135810ff9;
import X.C1135890ffH;
import X.C1136080ffa;
import X.C118300cf;
import X.C11RO;
import X.C1294320jmo;
import X.C12ES;
import X.C19613111oP;
import X.C1C7U;
import X.C20441214yg;
import X.C2268791DrB;
import X.C497740JfY;
import X.InterfaceC1109220eyG;
import X.InterfaceC1112060f2q;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.model.message.GiftGalleryMessage;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public class ARunnableS10S0310000_17 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS10S0310000_17 aRunnableS10S0310000_17) {
        boolean zLIZ;
        C1C7U.LIZ("LinkStickerView@ff41.adjustWidth$1$1");
        try {
            C118300cf c118300cf = new C118300cf();
            c118300cf.element = ((C19613111oP) aRunnableS10S0310000_17.l0).getMeasuredWidth();
            LIZ$0((C19613111oP) aRunnableS10S0310000_17.l2, (C19613111oP) aRunnableS10S0310000_17.l0, (C118300cf) aRunnableS10S0310000_17.l1, c118300cf, aRunnableS10S0310000_17.z3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LinkStickerView@ff41.adjustWidth$1$1");
    }

    public static final void run$1(ARunnableS10S0310000_17 aRunnableS10S0310000_17) {
        C1111930f2d c1111930f2d = (C1111930f2d) aRunnableS10S0310000_17.l0;
        boolean z = aRunnableS10S0310000_17.z3;
        InterfaceC1112060f2q interfaceC1112060f2q = (InterfaceC1112060f2q) aRunnableS10S0310000_17.l1;
        InterfaceC1109220eyG interfaceC1109220eyG = (InterfaceC1109220eyG) aRunnableS10S0310000_17.l2;
        c1111930f2d.getClass();
        C1C7U.LIZ("PublicScreenPresenter@c5a7.insertModel$1L");
        long jLLD = c1111930f2d.LLD(z, interfaceC1112060f2q, true);
        if (interfaceC1109220eyG != null) {
            c1111930f2d.LLLLLZ.LIZJ(new ARunnableS20S0100100_17(jLLD, interfaceC1109220eyG, 5));
        }
        C1C7U.LIZIZ("PublicScreenPresenter@c5a7.insertModel$1L");
    }

    public static final void run$2(ARunnableS10S0310000_17 aRunnableS10S0310000_17) {
        C1111930f2d c1111930f2d = (C1111930f2d) aRunnableS10S0310000_17.l0;
        AbstractC1136060ffY abstractC1136060ffY = (AbstractC1136060ffY) aRunnableS10S0310000_17.l1;
        boolean z = aRunnableS10S0310000_17.z3;
        InterfaceC1109220eyG interfaceC1109220eyG = (InterfaceC1109220eyG) aRunnableS10S0310000_17.l2;
        c1111930f2d.getClass();
        C1C7U.LIZ("PublicScreenPresenter@c5a7.insertMessage$5L");
        long jLJLIL = c1111930f2d.LJLIL(abstractC1136060ffY, z);
        if (interfaceC1109220eyG != null) {
            c1111930f2d.LLLLLZ.LIZJ(new ARunnableS20S0100100_17(jLJLIL, interfaceC1109220eyG, 6));
        }
        C1C7U.LIZIZ("PublicScreenPresenter@c5a7.insertMessage$5L");
    }

    public static final void run$3(ARunnableS10S0310000_17 aRunnableS10S0310000_17) {
        View viewLIZIZ;
        String str;
        String str2;
        long j;
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aRunnableS10S0310000_17.l0;
        FrameLayout frameLayout = (FrameLayout) aRunnableS10S0310000_17.l1;
        GiftGalleryMessage giftGalleryMessage = (GiftGalleryMessage) aRunnableS10S0310000_17.l2;
        boolean z = aRunnableS10S0310000_17.z3;
        String str3 = LiveRoomUserInfoWidget.Q;
        liveRoomUserInfoWidget.getClass();
        C1C7U.LIZ("LiveRoomUserInfoWidget@476a.realStartGiftGalleryAnimation$1L");
        if (liveRoomUserInfoWidget.K != null && liveRoomUserInfoWidget.L != null && liveRoomUserInfoWidget.M != null && liveRoomUserInfoWidget.N != null && liveRoomUserInfoWidget.f326O != null && (viewLIZIZ = C1092460eXE.LIZIZ(liveRoomUserInfoWidget.LLJJIJI, liveRoomUserInfoWidget.LLJLILLLLZIIL, liveRoomUserInfoWidget.LLJJJJLIIL, liveRoomUserInfoWidget.LLJLL)) != null && liveRoomUserInfoWidget.LLLIIII != null && liveRoomUserInfoWidget.LLLLIILLL != null) {
            try {
                int iLIZIZ = (int) C497740JfY.LIZIZ(30.0f);
                int iLIZIZ2 = (int) C497740JfY.LIZIZ(30.0f);
                Map<String, C1294320jmo> map = liveRoomUserInfoWidget.M;
                if (z) {
                    str = "image_171";
                } else {
                    str = "image_38";
                }
                C1294320jmo c1294320jmo = map.get(str);
                if (c1294320jmo != null) {
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(liveRoomUserInfoWidget.N, iLIZIZ, iLIZIZ2, true);
                    if (C497740JfY.LJJ()) {
                        bitmapCreateScaledBitmap = LiveRoomUserInfoWidget.F1(bitmapCreateScaledBitmap);
                    }
                    c1294320jmo.LJFF = bitmapCreateScaledBitmap;
                }
                Map<String, C1294320jmo> map2 = liveRoomUserInfoWidget.M;
                if (z) {
                    str2 = "image_173";
                } else {
                    str2 = "image_40";
                }
                C1294320jmo c1294320jmo2 = map2.get(str2);
                if (c1294320jmo2 != null) {
                    Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(liveRoomUserInfoWidget.f326O, iLIZIZ, iLIZIZ2, true);
                    if (C497740JfY.LJJ()) {
                        bitmapCreateScaledBitmap2 = LiveRoomUserInfoWidget.F1(bitmapCreateScaledBitmap2);
                    }
                    c1294320jmo2.LJFF = bitmapCreateScaledBitmap2;
                }
                ViewGroup viewGroup = liveRoomUserInfoWidget.LLILZ;
                if (viewGroup != null) {
                    viewGroup.setBackground(null);
                }
                C12ES.LJIILL(0, frameLayout);
                C12ES.LJIILL(0, liveRoomUserInfoWidget.LLLLIIL);
                C12ES.LJIILL(0, liveRoomUserInfoWidget.LLLLIILLL);
                C2268791DrB c2268791DrB = new C2268791DrB(0.65f, 0.0f, 0.35f, 1.0f);
                liveRoomUserInfoWidget.LLLLLLZZ = new AnimatorSet();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(liveRoomUserInfoWidget.LLLIIII, (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(c2268791DrB);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(viewLIZIZ, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                objectAnimatorOfFloat2.setDuration(300L);
                objectAnimatorOfFloat2.setInterpolator(c2268791DrB);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(liveRoomUserInfoWidget.LLLLIILLL, (Property<FrameLayout, Float>) View.ALPHA, 1.0f, 0.0f);
                objectAnimatorOfFloat3.setDuration(300L);
                objectAnimatorOfFloat3.setInterpolator(c2268791DrB);
                liveRoomUserInfoWidget.LLLLLLZZ.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
                liveRoomUserInfoWidget.LLLLLLZZ.addListener(new ALAdapterS13S0100000_17(liveRoomUserInfoWidget, 57));
                liveRoomUserInfoWidget.LLLLLLZZ.start();
                liveRoomUserInfoWidget.LLLLLZ = new AnimatorSet();
                if (z) {
                    j = 8940;
                } else {
                    j = 6640;
                }
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(liveRoomUserInfoWidget.LLLIIII, (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f);
                objectAnimatorOfFloat4.setDuration(300L);
                objectAnimatorOfFloat4.setStartDelay(j);
                objectAnimatorOfFloat4.setInterpolator(c2268791DrB);
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(viewLIZIZ, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                objectAnimatorOfFloat5.setDuration(300L);
                objectAnimatorOfFloat5.setStartDelay(j);
                objectAnimatorOfFloat5.setInterpolator(c2268791DrB);
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(liveRoomUserInfoWidget.LLLLIILLL, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f);
                objectAnimatorOfFloat6.setDuration(300L);
                objectAnimatorOfFloat6.setStartDelay(j);
                objectAnimatorOfFloat6.setInterpolator(c2268791DrB);
                liveRoomUserInfoWidget.LLLLLZ.playTogether(objectAnimatorOfFloat4, objectAnimatorOfFloat5, objectAnimatorOfFloat6);
                liveRoomUserInfoWidget.LLLLLZ.addListener(new ALAdapterS13S0100000_17(liveRoomUserInfoWidget, 61));
                liveRoomUserInfoWidget.LLLLLZ.start();
                liveRoomUserInfoWidget.K.addAnimatorListener(new ALAdapterS12S0200000_17(frameLayout, liveRoomUserInfoWidget, 25));
                liveRoomUserInfoWidget.K.playAnimation();
                HandlerHook.viewPostDelay(liveRoomUserInfoWidget.L, new ARunnableS116S0100000_16(liveRoomUserInfoWidget, 152), 730L);
                liveRoomUserInfoWidget.p2(giftGalleryMessage, z);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI(LiveRoomUserInfoWidget.Q, e);
            }
        }
        C1C7U.LIZIZ("LiveRoomUserInfoWidget@476a.realStartGiftGalleryAnimation$1L");
    }

    public static final void run$4(ARunnableS10S0310000_17 aRunnableS10S0310000_17) {
        boolean zLIZ;
        C1C7U.LIZ("LiveGiftTrayQueueHelper@f614.insertIntoQueue$3");
        try {
            C11RO c11ro = C1135890ffH.LIZ;
            C1135890ffH.LIZ((List) aRunnableS10S0310000_17.l0, (C1135810ff9) aRunnableS10S0310000_17.l1);
            C1136080ffa.LJ((C1135810ff9) aRunnableS10S0310000_17.l1, aRunnableS10S0310000_17.z3);
            ((Function0) aRunnableS10S0310000_17.l2).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveGiftTrayQueueHelper@f614.insertIntoQueue$3");
    }

    public ARunnableS10S0310000_17(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.$t = i;
        this.l0 = obj3;
        this.l1 = obj;
        this.l2 = obj2;
        this.z3 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$0(final X.C19613111oP r12, final X.C19613111oP r13, final X.C118300cf r14, final X.C118300cf r15, final boolean r16) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS10S0310000_17.LIZ$0(X.11oP, X.11oP, X.00cf, X.00cf, boolean):void");
    }
}
