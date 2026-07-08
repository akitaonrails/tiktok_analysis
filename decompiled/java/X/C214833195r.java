package X;

import Y.ARunnableS113S0100000_13;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostMockQuickCohostAvatarNudgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveQuickCohostPreferenceMatchTimingSettings;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipInputStream;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.195r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214833195r implements InterfaceC214832195q {
    public static final Interpolator LJJIJLIJ = C0GY9.LIZIZ(0.4f, 0.0f, 0.2f, 1.0f);
    public final C214831195p LIZ;
    public C1295960jpS LIZIZ;
    public C1295960jpS LIZJ;
    public ImageView LIZLLL;
    public View LJ;
    public ImageView LJFF;
    public View LJIIIIZZ;
    public ViewTreeObserverOnPreDrawListenerC21523719Lf LJIIIZ;
    public long LJIIL;
    public C16F5 LJIILIIL;
    public View LJIILL;
    public ImageView LJIILLIIL;
    public Bitmap LJIIZILJ;
    public boolean LJIJ;
    public Bitmap LJIJI;
    public boolean LJIJJ;
    public boolean LJIL;
    public boolean LJJ;
    public int LJJI;
    public int LJJIFFI;
    public boolean LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public Runnable LJJIIJZLJL;
    public boolean LJJIIZ;
    public long LJJIJ;
    public long LJJIJIL;
    public final int LJI = C439101nJ.LIZ(25);
    public final int LJII = C439101nJ.LIZ(80);
    public float LJIIJ = Float.NaN;
    public float LJIIJJI = Float.NaN;
    public String LJIILJJIL = "";
    public final BPEAHandler LJIJJLI = new BPEAHandler(Looper.getMainLooper());
    public EnumC214828195m LJJIIZI = EnumC214828195m.LARGE;
    public float LJJIJIIJI = Float.NaN;
    public float LJJIJIIJIL = Float.NaN;
    public float LJJIJL = Float.NaN;

    public final void LJIILIIL() throws Throwable {
        this.LJJIIJZLJL = null;
        LJJII();
        C1295960jpS c1295960jpS = this.LIZJ;
        if (c1295960jpS != null) {
            C786410Ut5.LLD(8, c1295960jpS);
            C786410Ut5.f5(c1295960jpS, 1.0f);
        }
        ImageView imageView = this.LJFF;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
            C786410Ut5.V4(imageView, 1.0f);
        }
        C16F5 c16f5 = this.LJIILIIL;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 8);
            C786410Ut5.k5(c16f5, 1.0f);
        }
        View view = this.LJIILL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
            C786410Ut5.T4(view, 1.0f);
        }
        ImageView imageView2 = this.LIZLLL;
        if (imageView2 != null) {
            C786410Ut5.LJZI(8, imageView2);
            C786410Ut5.V4(imageView2, 1.0f);
            C786410Ut5.Qb(imageView2, 1.0f);
            C786410Ut5.rc(imageView2, 1.0f);
        }
        this.LJJII = false;
        this.LJJIII = false;
        this.LJJIIJ = false;
        this.LJJIIZ = false;
        C20441214yg.LJIIIZ("QuickPairWaitingAnimComponent", "finalizeCelebrationTeardown — celebration done, notifying manager");
        C214831195p c214831195p = this.LIZ;
        if (c214831195p != null) {
            c214831195p.LIZIZ();
        }
    }

    public final void LJJ() {
        for (View view : C1697810uHb.LJIIJJI(this.LJIILIIL, this.LJFF, this.LJIILL)) {
            if (view != null && view.getVisibility() == 0) {
                view.animate().cancel();
                C786410Ut5.T4(view, 0.0f);
                view.animate().alpha(1.0f).setDuration(250L).start();
            }
        }
    }

    public final void LJ() {
        View view = this.LJIILL;
        if (view == null) {
            return;
        }
        int i = 8;
        if (LJIILLIIL()) {
            C786410Ut5.LJLLLLLL(8, view);
            return;
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        if (C464550IJp.LIZIZ().LJJLI != 0 && this.LJJII) {
            i = 0;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    public final void LJI() {
        ImageView imageView = this.LJFF;
        if (imageView == null) {
            return;
        }
        if (LJIILLIIL()) {
            C786410Ut5.LJZI(8, imageView);
            LJJII();
            return;
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        int i = C464550IJp.LIZIZ().LJJLI;
        boolean z = i != 0 && this.LJJII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[musicBadgeNudge] applyMusicBadgeVisibility tag=");
        sbLIZ.append(i);
        sbLIZ.append(" celebrationActive=");
        sbLIZ.append(this.LJJII);
        sbLIZ.append(" category=");
        sbLIZ.append(this.LJJIIZI);
        sbLIZ.append(" → visible=");
        sbLIZ.append(z);
        sbLIZ.append(" badgeNull=");
        sbLIZ.append(this.LJFF == null);
        C20441214yg.LJIIIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (!z) {
            C786410Ut5.LJZI(8, imageView);
            LJJII();
            return;
        }
        LJIIIIZZ();
        C1143680frq.LJ(imageView, "tiktok_live_interaction_demand_19", "music_badge.png", ImageView.ScaleType.FIT_CENTER);
        C786410Ut5.LJZI(0, imageView);
        ImageView imageView2 = this.LJFF;
        if (imageView2 == null) {
            C20441214yg.LJIIIZ("QuickPairWaitingAnimComponent", "[musicBadgeNudge] startMusicBadgeLayoutRefresh SKIP — musicBadge=null");
            return;
        }
        LJJII();
        this.LJIIL = 0L;
        ViewTreeObserverOnPreDrawListenerC21523719Lf viewTreeObserverOnPreDrawListenerC21523719Lf = new ViewTreeObserverOnPreDrawListenerC21523719Lf(this, 2);
        this.LJIIIZ = viewTreeObserverOnPreDrawListenerC21523719Lf;
        C786410Ut5.y3(imageView2.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC21523719Lf);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[musicBadgeNudge] startMusicBadgeLayoutRefresh — listener on badge (viewHash=");
        sbLIZ2.append(imageView2.hashCode());
        sbLIZ2.append(") vtoAlive=");
        sbLIZ2.append(imageView2.getViewTreeObserver().isAlive());
        C20441214yg.LJIIIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ2));
        LJIJJLI(true);
    }

    public final void LJII() {
        C16F5 c16f5 = this.LJIILIIL;
        if (c16f5 == null) {
            return;
        }
        if (LJIILLIIL()) {
            C786410Ut5.LLJJJJ(c16f5, 8);
            return;
        }
        if (this.LJJII) {
            if (a0.LJJJIL(this.LJIILJJIL)) {
                C786410Ut5.LLJJJJ(c16f5, 4);
            } else {
                c16f5.setText(this.LJIILJJIL);
                C786410Ut5.LLJJJJ(c16f5, 0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ() {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214833195r.LJIIIIZZ():void");
    }

    public final int LJIIJ() {
        int i = C214830195o.LIZ[this.LJJIIZI.ordinal()];
        if (i == 1) {
            return C497740JfY.LJIIIZ(R.dimen.avq);
        }
        if (i == 2) {
            return C497740JfY.LJIIIZ(R.dimen.avr);
        }
        throw new C1954807lC();
    }

    public final void LJIIJJI() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        ViewPropertyAnimator viewPropertyAnimatorAnimate3;
        ViewPropertyAnimator viewPropertyAnimatorAnimate4;
        ViewPropertyAnimator viewPropertyAnimatorAnimate5;
        ViewPropertyAnimator viewPropertyAnimatorAnimate6;
        C1295960jpS c1295960jpS = this.LIZIZ;
        if (c1295960jpS != null && (viewPropertyAnimatorAnimate6 = c1295960jpS.animate()) != null) {
            viewPropertyAnimatorAnimate6.cancel();
        }
        C1295960jpS c1295960jpS2 = this.LIZJ;
        if (c1295960jpS2 != null && (viewPropertyAnimatorAnimate5 = c1295960jpS2.animate()) != null) {
            viewPropertyAnimatorAnimate5.cancel();
        }
        ImageView imageView = this.LIZLLL;
        if (imageView != null && (viewPropertyAnimatorAnimate4 = imageView.animate()) != null) {
            viewPropertyAnimatorAnimate4.cancel();
        }
        C16F5 c16f5 = this.LJIILIIL;
        if (c16f5 != null && (viewPropertyAnimatorAnimate3 = c16f5.animate()) != null) {
            viewPropertyAnimatorAnimate3.cancel();
        }
        ImageView imageView2 = this.LJFF;
        if (imageView2 != null && (viewPropertyAnimatorAnimate2 = imageView2.animate()) != null) {
            viewPropertyAnimatorAnimate2.cancel();
        }
        View view = this.LJIILL;
        if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        Runnable runnable = this.LJJIIJZLJL;
        if (runnable != null) {
            this.LJIJJLI.removeCallbacks(runnable);
        }
        this.LJJIIJZLJL = null;
    }

    public final void LJIIL() {
        Bitmap bitmap;
        if (this.LJIJ && (bitmap = this.LJIIZILJ) != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        this.LJIIZILJ = null;
        this.LJIJ = false;
    }

    public final boolean LJIILLIIL() {
        return this.LJJIIZI == EnumC214828195m.COMPACT && !this.LJJII;
    }

    public final C1176304iv LJIJ() {
        int i = C214830195o.LIZ[this.LJJIIZI.ordinal()];
        if (i == 1) {
            return new C1176304iv(C439101nJ.LIZ(200), C439101nJ.LIZ(50));
        }
        if (i == 2) {
            return new C1176304iv(C439101nJ.LIZ(120), C439101nJ.LIZ(41));
        }
        throw new C1954807lC();
    }

    public final void LJJIFFI() throws Throwable {
        if (this.LJJII) {
            List listLJIJI = C13LQ.LJIJI(new View[]{this.LIZJ, this.LJFF, this.LJIILIIL, this.LJIILL, this.LIZLLL});
            ArrayList<View> arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLJIJI) {
                if (((View) obj).getVisibility() == 0) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                LJIILIIL();
                return;
            }
            for (View view : arrayList) {
                view.animate().cancel();
                view.animate().alpha(0.0f).setDuration(300L).start();
            }
            ARunnableS113S0100000_13 aRunnableS113S0100000_13 = new ARunnableS113S0100000_13(this, 279);
            this.LJJIIJZLJL = aRunnableS113S0100000_13;
            C786410Ut5.LJLIIL(300L, this.LJIJJLI, aRunnableS113S0100000_13);
        }
    }

    public final void LJJII() {
        ViewTreeObserverOnPreDrawListenerC21523719Lf viewTreeObserverOnPreDrawListenerC21523719Lf = this.LJIIIZ;
        if (viewTreeObserverOnPreDrawListenerC21523719Lf == null) {
            return;
        }
        ImageView imageView = this.LJFF;
        if (imageView != null && imageView.getViewTreeObserver().isAlive()) {
            C786410Ut5.D3(imageView.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC21523719Lf);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[musicBadgeNudge] stopMusicBadgeLayoutRefresh — preDrawCount=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(" lastApplied=(");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(',');
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(')');
        C20441214yg.LJIIIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ));
        this.LJIIIZ = null;
        this.LJIIL = 0L;
        this.LJIIJ = Float.NaN;
        this.LJIIJJI = Float.NaN;
        ImageView imageView2 = this.LJFF;
        if (imageView2 != null) {
            C786410Ut5.Lc(imageView2, 0.0f);
        }
        ImageView imageView3 = this.LJFF;
        if (imageView3 != null) {
            C786410Ut5.gd(imageView3, 0.0f);
        }
    }

    public final void LJIIIZ() {
        int iLJIIIZ;
        int iLIZ;
        C1176304iv c1176304ivLJIJ = LJIJ();
        EnumC214828195m enumC214828195m = this.LJJIIZI;
        int[] iArr = C214830195o.LIZ;
        int i = iArr[enumC214828195m.ordinal()];
        if (i == 1) {
            iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.awc);
        } else {
            if (i != 2) {
                throw new C1954807lC();
            }
            iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.awd);
        }
        View view = this.LJIIIIZZ;
        int iLJIIIZ2 = 0;
        int height = view != null ? view.getHeight() : 0;
        int i2 = c1176304ivLJIJ.LIZ;
        if (height > 0) {
            int i3 = iArr[this.LJJIIZI.ordinal()];
            if (i3 == 1) {
                iLJIIIZ2 = C497740JfY.LJIIIZ(R.dimen.aw6);
            } else if (i3 != 2) {
                throw new C1954807lC();
            }
            int i4 = iArr[this.LJJIIZI.ordinal()];
            if (i4 == 1) {
                iLIZ = C439101nJ.LIZ(108);
            } else {
                if (i4 != 2) {
                    throw new C1954807lC();
                }
                iLIZ = iLJIIIZ + 44;
            }
            int i5 = ((height - iLJIIIZ2) - iLIZ) - iLJIIIZ;
            if (i2 > i5) {
                i2 = i5;
            }
            int i6 = this.LJII;
            if (i2 < i6) {
                i2 = i6;
            }
        }
        int iLJIL = LJIL(c1176304ivLJIJ.LIZIZ, c1176304ivLJIJ.LIZ, i2);
        C1295960jpS c1295960jpS = this.LIZIZ;
        if (c1295960jpS != null) {
            LIZLLL(i2, iLJIIIZ, c1295960jpS);
        }
        C1295960jpS c1295960jpS2 = this.LIZJ;
        if (c1295960jpS2 != null) {
            LIZLLL(i2, iLJIIIZ, c1295960jpS2);
        }
        LIZJ(iLJIL, LJIL(LJIIJ(), c1176304ivLJIJ.LIZ, i2));
        LJIIIIZZ();
        LJIJJ();
    }

    public final void LJIJJ() {
        if (!LJIILLIIL()) {
            if (this.LJJII) {
                LJII();
                LJI();
                LJ();
                return;
            }
            return;
        }
        C16F5 c16f5 = this.LJIILIIL;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 8);
        }
        View view = this.LJIILL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        ImageView imageView = this.LJFF;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
        }
        LJJII();
    }

    public C214833195r(C214831195p c214831195p) {
        this.LIZ = c214831195p;
    }

    public static String LJJIIJZLJL(int i) {
        if (i != 0) {
            if (i != 4) {
                if (i != 8) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("unknown(");
                    sbLIZ.append(i);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                return "GONE";
            }
            return "INVISIBLE";
        }
        return "VISIBLE";
    }

    public final void LIZ(String str) throws Throwable {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" → cancel + hide celebration overlay");
        C20441214yg.LJIIIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ));
        LJIIJJI();
        Runnable runnable = this.LJJIIJZLJL;
        if (runnable != null) {
            this.LJIJJLI.removeCallbacks(runnable);
        }
        this.LJJIIJZLJL = null;
        LJIIL();
        C1295960jpS c1295960jpS = this.LIZIZ;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
            C786410Ut5.LLD(8, c1295960jpS);
            C786410Ut5.f5(c1295960jpS, 1.0f);
        }
        C1295960jpS c1295960jpS2 = this.LIZJ;
        if (c1295960jpS2 != null) {
            c1295960jpS2.cancelAnimation();
            C786410Ut5.LLD(8, c1295960jpS2);
            C786410Ut5.f5(c1295960jpS2, 1.0f);
        }
        ImageView imageView = this.LIZLLL;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
            C786410Ut5.V4(imageView, 1.0f);
            C786410Ut5.Qb(imageView, 1.0f);
            C786410Ut5.rc(imageView, 1.0f);
        }
        ImageView imageView2 = this.LJFF;
        if (imageView2 != null) {
            C786410Ut5.LJZI(8, imageView2);
            C786410Ut5.V4(imageView2, 1.0f);
        }
        LJJII();
        C16F5 c16f5 = this.LJIILIIL;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 8);
            C786410Ut5.k5(c16f5, 1.0f);
        }
        View view = this.LJIILL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
            C786410Ut5.T4(view, 1.0f);
        }
        this.LJJII = false;
        this.LJJIII = false;
        this.LJJIIJ = false;
        this.LJJIIZ = false;
        this.LJIILJJIL = "";
        C214831195p c214831195p = this.LIZ;
        if (c214831195p != null) {
            c214831195p.LIZIZ();
        }
    }

    public final void LIZIZ(String str) {
        C1295960jpS c1295960jpS = this.LIZJ;
        Bitmap bitmap = this.LJIIZILJ;
        if (c1295960jpS == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("applyAvatarBitmapToLottieB source=");
            sbLIZ.append(str);
            sbLIZ.append(" — lottieB null, skipping");
            C20441214yg.LJIIL("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (bitmap == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("applyAvatarBitmapToLottieB source=");
            sbLIZ2.append(str);
            sbLIZ2.append(" — partnerAvatarBitmap null, awaiting fresco");
            C20441214yg.LIZIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (c1295960jpS.getComposition() == null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("applyAvatarBitmapToLottieB source=");
            sbLIZ3.append(str);
            sbLIZ3.append(" — composition null, awaiting setComposition");
            C20441214yg.LIZIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("applyAvatarBitmapToLottieB source=");
        sbLIZ4.append(str);
        sbLIZ4.append(" → updateBitmap(\"image_0\", bitmap");
        sbLIZ4.append(bitmap.getWidth());
        sbLIZ4.append('x');
        sbLIZ4.append(bitmap.getHeight());
        sbLIZ4.append(')');
        C20441214yg.LJIIIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ4));
        c1295960jpS.updateBitmap("image_0", bitmap);
    }

    public final void LJIILJJIL(String str) {
        Integer numValueOf;
        this.LJJIJ = 0L;
        this.LJJIJIIJI = Float.NaN;
        this.LJJIJIIJIL = Float.NaN;
        LiveCohostMockQuickCohostAvatarNudgeSetting.Configs value = LiveCohostMockQuickCohostAvatarNudgeSetting.INSTANCE.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("T067z install (");
        sbLIZ.append(str);
        sbLIZ.append(") — addValueCallback for KeyPath(\"Ellipse.png\") on lottieB (viewHash=");
        C1295960jpS c1295960jpS = this.LIZJ;
        if (c1295960jpS != null) {
            numValueOf = Integer.valueOf(c1295960jpS.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(") initialSettingPayload=(dx=");
        sbLIZ.append(value.dx);
        sbLIZ.append(", dy=");
        sbLIZ.append(value.dy);
        sbLIZ.append("). dx=dy=0 → callback returns null (composition-authored position). non-zero → authored position + (dx, dy) canvas px per frame.");
        C20441214yg.LJIIIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ));
        C1295960jpS c1295960jpS2 = this.LIZJ;
        if (c1295960jpS2 != null) {
            c1295960jpS2.addValueCallback(new C1295090jo3("Ellipse.png"), InterfaceC1295080jo2.LJI, new C1295400joY<PointF>() { // from class: X.0jq0
                @Override // X.C1295400joY
                public final PointF LIZ(C1295570jop<PointF> c1295570jop) {
                    boolean z;
                    boolean z2;
                    boolean z3;
                    String str2;
                    LiveCohostMockQuickCohostAvatarNudgeSetting.Configs value2 = LiveCohostMockQuickCohostAvatarNudgeSetting.INSTANCE.getValue();
                    boolean z4 = true;
                    if (value2.dx == 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    PointF pointF = null;
                    if ((!z || value2.dy != 0.0f) && c1295570jop != null) {
                        this.LIZJ.LJJIJ++;
                        PointF pointF2 = c1295570jop.LIZJ;
                        PointF pointF3 = c1295570jop.LIZLLL;
                        if (pointF3 == null) {
                            pointF3 = pointF2;
                        }
                        float f = c1295570jop.LJFF;
                        float f2 = pointF2.x;
                        float f3 = f2 + ((pointF3.x - f2) * f);
                        float f4 = pointF2.y;
                        float f5 = f4 + ((pointF3.y - f4) * f);
                        pointF = new PointF(value2.dx + f3, value2.dy + f5);
                        C214833195r c214833195r = this.LIZJ;
                        long j = c214833195r.LJJIJ;
                        if (j == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (value2.dx == c214833195r.LJJIJIIJI && value2.dy == c214833195r.LJJIJIIJIL) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (j % 60 != 0) {
                            z4 = false;
                        }
                        if (!z2) {
                            if (!z3) {
                                if (z4) {
                                    str2 = "HEARTBEAT";
                                }
                            } else {
                                str2 = "CHANGED";
                            }
                        } else {
                            str2 = "FIRST";
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("T067z callback#");
                        sbLIZ2.append(this.LIZJ.LJJIJ);
                        sbLIZ2.append(" [");
                        sbLIZ2.append(str2);
                        sbLIZ2.append("] — setting=(dx=");
                        sbLIZ2.append(value2.dx);
                        sbLIZ2.append(", dy=");
                        sbLIZ2.append(value2.dy);
                        sbLIZ2.append(") baseAtFrame=(");
                        sbLIZ2.append(f3);
                        sbLIZ2.append(", ");
                        sbLIZ2.append(f5);
                        sbLIZ2.append(") → returning PointF(");
                        sbLIZ2.append(pointF.x);
                        sbLIZ2.append(", ");
                        sbLIZ2.append(pointF.y);
                        sbLIZ2.append(')');
                        C20441214yg.LJIIIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ2));
                        C214833195r c214833195r2 = this.LIZJ;
                        c214833195r2.LJJIJIIJI = value2.dx;
                        c214833195r2.LJJIJIIJIL = value2.dy;
                        return pointF;
                    }
                    return pointF;
                }
            });
        }
    }

    public final void LJIILL(String str) {
        Integer numValueOf;
        this.LJJIJIL = 0L;
        this.LJJIJL = Float.NaN;
        LiveCohostMockQuickCohostAvatarNudgeSetting.Configs value = LiveCohostMockQuickCohostAvatarNudgeSetting.INSTANCE.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("T067za install (");
        sbLIZ.append(str);
        sbLIZ.append(") — addValueCallback TRANSFORM_SCALE for KeyPath(\"Ellipse.png\") on lottieB (viewHash=");
        C1295960jpS c1295960jpS = this.LIZJ;
        if (c1295960jpS != null) {
            numValueOf = Integer.valueOf(c1295960jpS.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(") initialScale=");
        sbLIZ.append(value.scale);
        sbLIZ.append(". scale=1 → callback returns null (composition-authored scale). scale!=1 → authored scale × scale per frame.");
        C20441214yg.LJIIIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ));
        C1295960jpS c1295960jpS2 = this.LIZJ;
        if (c1295960jpS2 != null) {
            c1295960jpS2.addValueCallback(new C1295090jo3("Ellipse.png"), InterfaceC1295080jo2.LJIILJJIL, new C1295400joY<C1295580joq>() { // from class: X.0jpz
                @Override // X.C1295400joY
                public final C1295580joq LIZ(C1295570jop<C1295580joq> c1295570jop) {
                    boolean z;
                    boolean z2;
                    boolean z3;
                    String str2;
                    LiveCohostMockQuickCohostAvatarNudgeSetting.Configs value2 = LiveCohostMockQuickCohostAvatarNudgeSetting.INSTANCE.getValue();
                    float f = value2.scale;
                    boolean z4 = false;
                    if (f == 1.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C1295580joq c1295580joq = null;
                    if (!z && c1295570jop != null) {
                        C214833195r c214833195r = this.LIZJ;
                        long j = c214833195r.LJJIJIL + 1;
                        c214833195r.LJJIJIL = j;
                        C1295580joq c1295580joq2 = c1295570jop.LIZJ;
                        C1295580joq c1295580joq3 = c1295570jop.LIZLLL;
                        if (c1295580joq3 == null) {
                            c1295580joq3 = c1295580joq2;
                        }
                        float f2 = c1295570jop.LJFF;
                        float f3 = c1295580joq2.LIZ;
                        float f4 = f3 + ((c1295580joq3.LIZ - f3) * f2);
                        float f5 = c1295580joq2.LIZIZ;
                        float f6 = f5 + ((c1295580joq3.LIZIZ - f5) * f2);
                        c1295580joq = new C1295580joq(f4 * f, f6 * f);
                        if (j == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (f == c214833195r.LJJIJL) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean z5 = !z3;
                        if (j % 60 == 0) {
                            z4 = true;
                        }
                        if (!z2) {
                            if (!z5) {
                                if (z4) {
                                    str2 = "HEARTBEAT";
                                }
                            } else {
                                str2 = "CHANGED";
                            }
                        } else {
                            str2 = "FIRST";
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("T067za scaleCallback#");
                        sbLIZ2.append(this.LIZJ.LJJIJIL);
                        sbLIZ2.append(" [");
                        sbLIZ2.append(str2);
                        sbLIZ2.append("] — settingScale=");
                        sbLIZ2.append(value2.scale);
                        sbLIZ2.append(" baseAtFrame=(");
                        sbLIZ2.append(f4);
                        sbLIZ2.append(", ");
                        sbLIZ2.append(f6);
                        sbLIZ2.append(") → returning ScaleXY(");
                        sbLIZ2.append(c1295580joq.LIZ);
                        sbLIZ2.append(", ");
                        sbLIZ2.append(c1295580joq.LIZIZ);
                        sbLIZ2.append(')');
                        C20441214yg.LJIIIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ2));
                        this.LIZJ.LJJIJL = value2.scale;
                    }
                    return c1295580joq;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(boolean r14) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214833195r.LJIJJLI(boolean):void");
    }

    public final void LJJIIJ(String str) {
        if (this.LJJII && !this.LJJIIZ) {
            if (this.LJJIII && this.LJJIIJ) {
                this.LJJIIZ = true;
                C1295960jpS c1295960jpS = this.LIZJ;
                if (c1295960jpS != null) {
                    c1295960jpS.cancelAnimation();
                    c1295960jpS.setProgress(1.0f);
                }
                long matchSuccessMinDurationMs = LiveQuickCohostPreferenceMatchTimingSettings.INSTANCE.getMatchSuccessMinDurationMs();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tryFinishCelebration source=");
                sbLIZ.append(str);
                sbLIZ.append(" — AND-gate resolved → hold ");
                sbLIZ.append(matchSuccessMinDurationMs);
                sbLIZ.append("ms then fade-out (300ms)");
                C20441214yg.LJIIIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ));
                if (matchSuccessMinDurationMs <= 0) {
                    LJJIFFI();
                    return;
                }
                ARunnableS113S0100000_13 aRunnableS113S0100000_13 = new ARunnableS113S0100000_13(this, 280);
                this.LJJIIJZLJL = aRunnableS113S0100000_13;
                C786410Ut5.LJLIIL(matchSuccessMinDurationMs, this.LJIJJLI, aRunnableS113S0100000_13);
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("tryFinishCelebration source=");
            sbLIZ2.append(str);
            sbLIZ2.append(" — AND-gate not yet resolved (lottieBNaturallyEnded=");
            sbLIZ2.append(this.LJJIII);
            sbLIZ2.append(", partnerStreamLiveReceived=");
            sbLIZ2.append(this.LJJIIJ);
            sbLIZ2.append(") — overlay stays visible");
            C20441214yg.LJIIIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x03d4  */
    @Override // X.InterfaceC214832195q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onEvent(X.AbstractC214838195w r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214833195r.onEvent(X.195w):void");
    }

    public final void LIZJ(int i, int i2) {
        C19ME c19me;
        C1295960jpS c1295960jpS;
        C1295960jpS c1295960jpS2;
        ImageView imageView = this.LIZLLL;
        if (imageView == null) {
            return;
        }
        boolean z = this.LJJII;
        int i3 = R.id.nrt;
        if (!z && ((c1295960jpS = this.LIZIZ) == null || c1295960jpS.getVisibility() != 8 || ((c1295960jpS2 = this.LIZJ) != null && c1295960jpS2.getVisibility() == 8))) {
            i3 = R.id.nrs;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
            ((ViewGroup.MarginLayoutParams) c19me).width = i;
            ((ViewGroup.MarginLayoutParams) c19me).height = i;
            c19me.topToTop = i3;
            c19me.bottomToBottom = i3;
            c19me.startToStart = i3;
            c19me.endToEnd = i3;
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = 0;
            c19me.bottomToTop = -1;
            c19me.verticalBias = 0.5f;
            c19me.horizontalBias = 0.5f;
            C786410Ut5.c6(imageView, c19me);
        }
        C786410Ut5.Lc(imageView, 0.0f);
        C786410Ut5.gd(imageView, -i2);
    }

    public final void LJIIZILJ(String str, LiveCohostMockQuickCohostAvatarNudgeSetting.Configs configs) {
        String strLJZL;
        String customOriginalValue = SettingsManager.INSTANCE.getCustomOriginalValue("live_cohost_mock_quick_cohost_avatar_nudge_setting");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[musicBadgeNudge] ");
        sbLIZ.append(str);
        sbLIZ.append(" | settingKey=live_cohost_mock_quick_cohost_avatar_nudge_setting rawJson=");
        if (customOriginalValue == null || (strLJZL = C13LN.LJZL(256, customOriginalValue)) == null) {
            strLJZL = "null";
        }
        sbLIZ.append(strLJZL);
        sbLIZ.append(" | parsed badgeNudgeEndDp=");
        sbLIZ.append(configs.badgeNudgeEndDp);
        sbLIZ.append(" badgeNudgeBottomDp=");
        sbLIZ.append(configs.badgeNudgeBottomDp);
        sbLIZ.append(" dx=");
        sbLIZ.append(configs.dx);
        sbLIZ.append(" dy=");
        sbLIZ.append(configs.dy);
        sbLIZ.append(" scale=");
        sbLIZ.append(configs.scale);
        sbLIZ.append(" | lastApplied=(");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(',');
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(')');
        C20441214yg.LJIIIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJJI(final C1295960jpS c1295960jpS, final String str) {
        long[] jArr = {100, 500, 1500, 3000};
        int i = 0;
        do {
            final long j = jArr[i];
            C786410Ut5.LJLIIL(j, this.LJIJJLI, new Runnable() { // from class: X.0GpR
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("QuickPairWaitingAnimComponent@a696.schedulePeriodicStateCheck$1$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("QuickPairWaitingAnimComponent@a696.schedulePeriodicStateCheck$1$1");
                }

                public final void LIZ() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(" T+");
                    sbLIZ.append(j);
                    sbLIZ.append("ms state — composition=");
                    sbLIZ.append(c1295960jpS.getComposition() != null);
                    sbLIZ.append(" isAnimating=");
                    sbLIZ.append(c1295960jpS.isAnimating());
                    sbLIZ.append(" progress=");
                    sbLIZ.append(c1295960jpS.getProgress());
                    sbLIZ.append(" isShown=");
                    sbLIZ.append(c1295960jpS.isShown());
                    sbLIZ.append(" visibility=");
                    sbLIZ.append(c1295960jpS.getVisibility());
                    sbLIZ.append(" size=(");
                    sbLIZ.append(c1295960jpS.getWidth());
                    sbLIZ.append('x');
                    sbLIZ.append(c1295960jpS.getHeight());
                    sbLIZ.append(')');
                    C20441214yg.LJIIIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ));
                }
            });
            i++;
        } while (i < 4);
    }

    public final Bitmap LJJIII(int i, int i2) {
        if (i < 1) {
            i = 1;
        }
        if (i2 < 1) {
            i2 = 1;
        }
        Bitmap bitmap = this.LJIJI;
        if (bitmap != null) {
            if (!bitmap.isRecycled() && bitmap.getWidth() == i && bitmap.getHeight() == i2) {
                return bitmap;
            }
            if (this.LJIJJ && !bitmap.isRecycled()) {
                bitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        this.LJIJI = bitmapCreateBitmap;
        this.LJIJJ = true;
        return bitmapCreateBitmap;
    }

    public static int LJIL(int i, int i2, int i3) {
        if (i2 > 0 && i3 < i2) {
            int iLIZIZ = C814420VxA.LIZIZ((i * i3) / i2);
            if (iLIZIZ < 1) {
                return 1;
            }
            return iLIZIZ;
        }
        return i;
    }

    public final void LIZLLL(int i, int i2, C1295960jpS c1295960jpS) {
        C19ME c19me;
        ViewGroup.LayoutParams layoutParams = c1295960jpS.getLayoutParams();
        if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
            ((ViewGroup.MarginLayoutParams) c19me).width = i;
            ((ViewGroup.MarginLayoutParams) c19me).height = i;
            int i3 = C214830195o.LIZ[this.LJJIIZI.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    c19me.topToTop = -1;
                    ((ViewGroup.MarginLayoutParams) c19me).topMargin = 0;
                    c19me.bottomToTop = R.id.pwn;
                    ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = i2;
                    c19me.bottomToBottom = -1;
                } else {
                    throw new C1954807lC();
                }
            } else {
                int iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.aw6);
                c19me.topToTop = 0;
                ((ViewGroup.MarginLayoutParams) c19me).topMargin = iLJIIIZ;
                c19me.bottomToTop = -1;
                ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = 0;
                c19me.bottomToBottom = -1;
            }
            c19me.verticalBias = 0.5f;
            C786410Ut5.W5(c1295960jpS, c19me);
        }
    }

    public final void LJFF(int i, int i2, LiveCohostMockQuickCohostAvatarNudgeSetting.Configs configs) {
        ImageView imageView = this.LJFF;
        if (imageView == null) {
            LJIIZILJ("applyMusicBadgeLayout SKIP — musicBadge=null", configs);
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        String simpleName = null;
        if (layoutParams instanceof C19ME) {
            C19ME c19me = (C19ME) layoutParams;
            boolean z = false;
            int i3 = -1;
            if (c19me != null) {
                ((ViewGroup.MarginLayoutParams) c19me).width = i;
                ((ViewGroup.MarginLayoutParams) c19me).height = i;
                c19me.topToTop = -1;
                c19me.topToBottom = -1;
                c19me.bottomToTop = -1;
                c19me.startToStart = -1;
                c19me.startToEnd = -1;
                c19me.endToStart = -1;
                c19me.endToEnd = R.id.sm_;
                c19me.bottomToBottom = R.id.sm_;
                c19me.setMarginEnd(0);
                ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = 0;
                c19me.verticalBias = 0.5f;
                c19me.horizontalBias = 0.5f;
                C786410Ut5.c6(imageView, c19me);
                if (imageView.getLayoutDirection() != 1) {
                    i3 = 1;
                }
                float fLIZIZ = i3 * C814420VxA.LIZIZ(configs.badgeNudgeEndDp * Resources.getSystem().getDisplayMetrics().density);
                float fLIZIZ2 = C814420VxA.LIZIZ(configs.badgeNudgeBottomDp * Resources.getSystem().getDisplayMetrics().density);
                C786410Ut5.Lc(imageView, fLIZIZ);
                C786410Ut5.gd(imageView, fLIZIZ2);
                this.LJIIJ = configs.badgeNudgeEndDp;
                this.LJIIJJI = configs.badgeNudgeBottomDp;
                imageView.requestLayout();
                int[] iArr = new int[2];
                imageView.getLocationOnScreen(iArr);
                StringBuilder sb = new StringBuilder("applyMusicBadgeLayout APPLIED avatar=");
                sb.append(i2);
                sb.append("px badge=");
                sb.append(i);
                sb.append("px endSign=");
                sb.append(i3);
                sb.append(" translation=(");
                sb.append(fLIZIZ);
                sb.append(',');
                sb.append(fLIZIZ2);
                sb.append(") visibility=");
                sb.append(LJJIIJZLJL(imageView.getVisibility()));
                sb.append(" alpha=");
                sb.append(imageView.getAlpha());
                sb.append(" screenPos=(");
                sb.append(iArr[0]);
                sb.append(',');
                sb.append(iArr[1]);
                sb.append(") size=(");
                sb.append(imageView.getWidth());
                sb.append(',');
                sb.append(imageView.getHeight());
                sb.append(") vtoAlive=");
                sb.append(imageView.getViewTreeObserver().isAlive());
                sb.append(" refreshListener=");
                if (this.LJIIIZ != null) {
                    z = true;
                }
                sb.append(z);
                LJIIZILJ(sb.toString(), configs);
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyMusicBadgeLayout SKIP — layoutParams is not ConstraintLayout.LayoutParams (actual=");
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        if (layoutParams2 != null) {
            simpleName = layoutParams2.getClass().getSimpleName();
        }
        sbLIZ.append(simpleName);
        sbLIZ.append(')');
        LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ), configs);
    }

    public final void LJIJI(C1295960jpS c1295960jpS, String str, boolean z, final String str2, long j, final int i, Function0<Integer> function0) {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        String absolutePath;
        Boolean boolValueOf;
        String absolutePath2;
        try {
            c098200Yq = C1143780fs0.LJII("tiktok_live_interaction_demand_19", str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(" getGeckoFile threw: ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C20441214yg.LJIIL("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ));
        }
        Long lValueOf = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        File file = (File) c098200Yq;
        try {
            c098200Yq2 = C1143780fs0.LIZIZ("tiktok_live_interaction_demand_19", str);
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
        if (thM5exceptionOrNullimpl2 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append(" getAssetPath threw: ");
            sbLIZ2.append(thM5exceptionOrNullimpl2.getMessage());
            C20441214yg.LJIIL("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = "";
        }
        String str3 = (String) c098200Yq2;
        try {
            c098200Yq3 = C1143780fs0.LJFF("tiktok_live_interaction_demand_19", str);
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq3 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        Throwable thM5exceptionOrNullimpl3 = C189200o6.m5exceptionOrNullimpl(c098200Yq3);
        if (thM5exceptionOrNullimpl3 != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str2);
            sbLIZ3.append(" getGeckoCdnPaths threw: ");
            sbLIZ3.append(thM5exceptionOrNullimpl3.getMessage());
            C20441214yg.LJIIL("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ3));
        }
        C13BV c13bv = C13BV.INSTANCE;
        if (C189200o6.m7isFailureimpl(c098200Yq3)) {
            c098200Yq3 = c13bv;
        }
        List list = (List) c098200Yq3;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" PROBE — geckoFile=");
        if (file != null) {
            absolutePath = file.getAbsolutePath();
        } else {
            absolutePath = null;
        }
        sb.append(absolutePath);
        sb.append(" (exists=");
        if (file != null) {
            boolValueOf = Boolean.valueOf(file.exists());
        } else {
            boolValueOf = null;
        }
        sb.append(boolValueOf);
        sb.append(", size=");
        if (file != null) {
            lValueOf = Long.valueOf(file.length());
        }
        sb.append(lValueOf);
        sb.append("), assetPath='");
        sb.append(str3);
        sb.append("', cdnPathCount=");
        sb.append(list.size());
        sb.append(", cdnFirst=");
        sb.append((String) C13LP.LJJJLL(list));
        sb.append(" epoch=");
        sb.append(i);
        C20441214yg.LJIIIZ("QuickPairWaitingAnimComponent", sb.toString());
        final C1296270jpx c1296270jpx = new C1296270jpx(j, function0, i, str2, c1295960jpS, z, str, this);
        final C1296310jq1 c1296310jq1 = new C1296310jq1(j, str2);
        if (file != null && file.exists() && file.length() > 0) {
            C20441214yg.LJIIIZ("QuickPairWaitingAnimComponent", str2.concat(" using DIRECT LottieCompositionFactory.fromZipStream (local file)"));
            try {
                C1292030jj7<C1294720jnS> c1292030jj7LJIILIIL = C1294250jmh.LJIILIIL(null, new ZipInputStream(new C0VSP(file)), null);
                c1292030jj7LJIILIIL.LIZIZ(new InterfaceC1292040jj8() { // from class: X.0jq4
                    @Override // X.InterfaceC1292040jj8
                    public final void onResult(Object obj) {
                        if (obj != null) {
                            c1296270jpx.invoke(obj);
                        } else {
                            c1296310jq1.invoke(new IllegalStateException("null composition"));
                        }
                    }
                });
                c1292030jj7LJIILIIL.LIZ(new C1339380kxU(c1296310jq1, 1));
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("QuickPairWaitingAnimComponent", str2.concat(" LottieCompositionFactory.fromZipStream threw synchronously"), e);
                c1296310jq1.invoke(e);
                return;
            }
        }
        Boolean boolValueOf2 = null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(" gecko local file MISSING — falling back to GeckoResourceLoader (will try CDN download). geckoFile=");
        if (file != null) {
            absolutePath2 = file.getAbsolutePath();
        } else {
            absolutePath2 = null;
        }
        sb2.append(absolutePath2);
        sb2.append(" exists=");
        if (file != null) {
            boolValueOf2 = Boolean.valueOf(file.exists());
        }
        sb2.append(boolValueOf2);
        C20441214yg.LJIIL("QuickPairWaitingAnimComponent", sb2.toString());
        c1295960jpS.removeAllLottieOnCompositionLoadedListener();
        c1295960jpS.addLottieOnCompositionLoadedListener(new InterfaceC1296230jpt() { // from class: X.0jq6
            @Override // X.InterfaceC1296230jpt
            public final /* synthetic */ void LIZ(C1294720jnS c1294720jnS) {
                c1296270jpx.invoke(c1294720jnS);
            }
        });
        c1295960jpS.setFailureListener(new C1339380kxU(c1296310jq1, 2));
        C1143680frq.LJIILL(c1295960jpS, "tiktok_live_interaction_demand_19", str, false, new InterfaceC1143790fs1() { // from class: X.0jq5
            @Override // X.InterfaceC1143790fs1
            public final void onFinish(boolean z2) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(str2);
                sbLIZ4.append(" wrapper loadGeckoLottie.onFinish success=");
                sbLIZ4.append(z2);
                sbLIZ4.append(" (CDN fallback) epoch=");
                sbLIZ4.append(i);
                C20441214yg.LJIIIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ4));
            }
        });
    }
}
