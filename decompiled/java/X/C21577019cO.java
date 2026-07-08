package X;

import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.19cO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21577019cO {
    public final /* synthetic */ C21576919cN LIZ;

    public C21577019cO(C21576919cN c21576919cN) {
        this.LIZ = c21576919cN;
    }

    public final ValueAnimator LIZ(int i) {
        C21576919cN c21576919cN = this.LIZ;
        return c21576919cN.LJI(i, 0, c21576919cN.LLJJJJLIIL, c21576919cN.LLILZLL);
    }

    public final void LIZJ(EnumC21577619cU enumC21577619cU) {
        switch (C21577719cV.LIZ[enumC21577619cU.ordinal()]) {
            case 1:
                C21576919cN c21576919cN = this.LIZ;
                EnumC21577619cU enumC21577619cU2 = c21576919cN.LLLLLLL;
                EnumC21577619cU enumC21577619cU3 = EnumC21577619cU.None;
                if (enumC21577619cU2 != enumC21577619cU3 && c21576919cN.LLILLJJLI == 0) {
                    c21576919cN.LJIILIIL(enumC21577619cU3);
                } else if (c21576919cN.LLILLJJLI != 0) {
                    LIZ(0);
                }
                break;
            case 2:
                C21576919cN c21576919cN2 = this.LIZ;
                if (!c21576919cN2.LLLLLLL.isOpening && c21576919cN2.LJIIJ(c21576919cN2.LLJJLIIIJLLLLLLLZ)) {
                    this.LIZ.LJIILIIL(EnumC21577619cU.PullDownToRefresh);
                } else {
                    this.LIZ.setViceState(EnumC21577619cU.PullDownToRefresh);
                }
                break;
            case 3:
                C21576919cN c21576919cN3 = this.LIZ;
                if (c21576919cN3.LJIIJ(c21576919cN3.LLJL)) {
                    C21576919cN c21576919cN4 = this.LIZ;
                    EnumC21577619cU enumC21577619cU4 = c21576919cN4.LLLLLLL;
                    if (!enumC21577619cU4.isOpening && !enumC21577619cU4.isFinishing && (!c21576919cN4.LLLIIIL || !c21576919cN4.LLJLLL || !c21576919cN4.LLLIIL)) {
                        c21576919cN4.LJIILIIL(EnumC21577619cU.PullUpToLoad);
                    }
                }
                this.LIZ.setViceState(EnumC21577619cU.PullUpToLoad);
                break;
            case 4:
                C21576919cN c21576919cN5 = this.LIZ;
                if (!c21576919cN5.LLLLLLL.isOpening && c21576919cN5.LJIIJ(c21576919cN5.LLJJLIIIJLLLLLLLZ)) {
                    this.LIZ.LJIILIIL(EnumC21577619cU.PullDownCanceled);
                    LIZJ(EnumC21577619cU.None);
                } else {
                    this.LIZ.setViceState(EnumC21577619cU.PullDownCanceled);
                }
                break;
            case 5:
                C21576919cN c21576919cN6 = this.LIZ;
                if (c21576919cN6.LJIIJ(c21576919cN6.LLJL)) {
                    C21576919cN c21576919cN7 = this.LIZ;
                    if (!c21576919cN7.LLLLLLL.isOpening && (!c21576919cN7.LLLIIIL || !c21576919cN7.LLJLLL || !c21576919cN7.LLLIIL)) {
                        c21576919cN7.LJIILIIL(EnumC21577619cU.PullUpCanceled);
                        LIZJ(EnumC21577619cU.None);
                    }
                }
                this.LIZ.setViceState(EnumC21577619cU.PullUpCanceled);
                break;
            case 6:
                C21576919cN c21576919cN8 = this.LIZ;
                if (!c21576919cN8.LLLLLLL.isOpening && c21576919cN8.LJIIJ(c21576919cN8.LLJJLIIIJLLLLLLLZ)) {
                    this.LIZ.LJIILIIL(EnumC21577619cU.ReleaseToRefresh);
                } else {
                    this.LIZ.setViceState(EnumC21577619cU.ReleaseToRefresh);
                }
                break;
            case 7:
                C21576919cN c21576919cN9 = this.LIZ;
                if (c21576919cN9.LJIIJ(c21576919cN9.LLJL)) {
                    C21576919cN c21576919cN10 = this.LIZ;
                    EnumC21577619cU enumC21577619cU5 = c21576919cN10.LLLLLLL;
                    if (!enumC21577619cU5.isOpening && !enumC21577619cU5.isFinishing && (!c21576919cN10.LLLIIIL || !c21576919cN10.LLJLLL || !c21576919cN10.LLLIIL)) {
                        c21576919cN10.LJIILIIL(EnumC21577619cU.ReleaseToLoad);
                    }
                }
                this.LIZ.setViceState(EnumC21577619cU.ReleaseToLoad);
                break;
            case 8:
                C21576919cN c21576919cN11 = this.LIZ;
                if (!c21576919cN11.LLLLLLL.isOpening && c21576919cN11.LJIIJ(c21576919cN11.LLJJLIIIJLLLLLLLZ)) {
                    this.LIZ.LJIILIIL(EnumC21577619cU.ReleaseToTwoLevel);
                } else {
                    this.LIZ.setViceState(EnumC21577619cU.ReleaseToTwoLevel);
                }
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                C21576919cN c21576919cN12 = this.LIZ;
                if (!c21576919cN12.LLLLLLL.isOpening && c21576919cN12.LJIIJ(c21576919cN12.LLJJLIIIJLLLLLLLZ)) {
                    this.LIZ.LJIILIIL(EnumC21577619cU.RefreshReleased);
                } else {
                    this.LIZ.setViceState(EnumC21577619cU.RefreshReleased);
                }
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                C21576919cN c21576919cN13 = this.LIZ;
                if (!c21576919cN13.LLLLLLL.isOpening && c21576919cN13.LJIIJ(c21576919cN13.LLJL)) {
                    this.LIZ.LJIILIIL(EnumC21577619cU.LoadReleased);
                } else {
                    this.LIZ.setViceState(EnumC21577619cU.LoadReleased);
                }
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                this.LIZ.setStateRefreshing(true);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                this.LIZ.setStateLoading(true);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                C21576919cN c21576919cN14 = this.LIZ;
                if (c21576919cN14.LLLLLLL == EnumC21577619cU.Refreshing) {
                    c21576919cN14.LJIILIIL(EnumC21577619cU.RefreshFinish);
                }
                break;
            case 14:
                C21576919cN c21576919cN15 = this.LIZ;
                if (c21576919cN15.LLLLLLL == EnumC21577619cU.Loading) {
                    c21576919cN15.LJIILIIL(EnumC21577619cU.LoadFinish);
                }
                break;
            case 15:
                this.LIZ.LJIILIIL(EnumC21577619cU.TwoLevelReleased);
                break;
            case 16:
                this.LIZ.LJIILIIL(EnumC21577619cU.TwoLevelFinish);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                this.LIZ.LJIILIIL(EnumC21577619cU.TwoLevel);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071 A[PHI: r5
      0x0071: PHI (r5v32 int) = (r5v31 int), (r5v33 int), (r5v34 int) binds: [B:177:0x030c, B:176:0x0309, B:38:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00de A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C21577019cO LIZIZ(int r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21577019cO.LIZIZ(int, boolean):X.19cO");
    }
}
