package X;

import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS15S0410000_6;

/* JADX INFO: renamed from: X.0sAh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616650sAh {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(546));

    public static final void LIZIZ(View view) {
        view.animate().alpha(0.8f).setDuration(80L).withEndAction(new ARunnableS106S0100000_6(view, 317)).start();
    }

    public static final boolean LJI(Aweme aweme) {
        boolean z;
        AwemeStatus statusSafety;
        AwemeStatus statusSafety2;
        AwemeStatus statusSafety3;
        if (aweme != null) {
            boolean z2 = false;
            if (aweme.getAwemeType() != 2 && aweme.getAwemeType() != 5 && aweme.getAwemeType() != 18 && !aweme.getIsTikTokStory() && aweme.getAwemeType() != 28 && aweme.getAwemeType() != 29 && aweme.getAwemeType() != 30 && aweme.getAwemeType() != 150 && aweme.getAwemeType() != 24 && aweme.getAwemeType() != 501 && aweme.getAwemeType() != 14 && aweme.getAwemeType() != 15 && aweme.getAwemeType() != 15 && aweme.getAwemeType() != 16 && !aweme.isAd()) {
                z = false;
            } else {
                z = true;
            }
            if (AwemeExtKt.getStatusSafety(aweme) != null) {
                if (z || (((statusSafety = AwemeExtKt.getStatusSafety(aweme)) != null && statusSafety.isDelete()) || (((statusSafety2 = AwemeExtKt.getStatusSafety(aweme)) != null && statusSafety2.isInReviewing()) || ((statusSafety3 = AwemeExtKt.getStatusSafety(aweme)) != null && statusSafety3.isProhibited())))) {
                    z2 = true;
                }
                z = z2;
            }
        } else {
            z = true;
        }
        return !z;
    }

    public static final boolean LJII(Integer num) {
        int iLIZIZ;
        C1389350mG5 c1389350mG5LIZJ = C1389340mG4.LIZJ(null, null);
        if (num != null) {
            iLIZIZ = num.intValue();
        } else {
            iLIZIZ = c1389350mG5LIZJ.LIZIZ();
        }
        if (iLIZIZ > ((Number) LIZ.getValue()).intValue()) {
            return true;
        }
        return false;
    }

    public static final void LIZJ(IFeedPanelPlatformAbility iFeedPanelPlatformAbility, String str) {
        BaseListFragmentPanel baseListFragmentPanelYE;
        String groupId;
        if (iFeedPanelPlatformAbility != null && (baseListFragmentPanelYE = iFeedPanelPlatformAbility.yE()) != null) {
            Aweme awemeLJIIIIZZ = baseListFragmentPanelYE.LJIIIIZZ();
            String strC7 = baseListFragmentPanelYE.C7(true);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJFF("enter_from", strC7);
            c2344009Gk.LJFF("enter_method", "click_button");
            String authorUid = null;
            if (awemeLJIIIIZZ != null) {
                groupId = awemeLJIIIIZZ.getGroupId();
            } else {
                groupId = null;
            }
            c2344009Gk.LJFF("group_id", groupId);
            if (awemeLJIIIIZZ != null) {
                authorUid = AwemeExtKt.getAuthorUid(awemeLJIIIIZZ);
            }
            c2344009Gk.LJFF("author_id", authorUid);
            C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
        }
    }

    public static final void LJ(IViewPagerComponentAbility iViewPagerComponentAbility, boolean z) {
        View viewLLLJIL;
        C0SZ8 c0sz8F = null;
        if (iViewPagerComponentAbility != null) {
            c0sz8F = iViewPagerComponentAbility.F();
        }
        if (z) {
            if (c0sz8F != null) {
                viewLLLJIL = c0sz8F.LLLLZLLIL();
            } else {
                return;
            }
        } else if (c0sz8F == null) {
            return;
        } else {
            viewLLLJIL = c0sz8F.LLLJIL();
        }
        if (viewLLLJIL != null) {
            C786410Ut5.LJLLLLLL(8, viewLLLJIL);
        }
    }

    public static final void LJFF(IViewPagerComponentAbility iViewPagerComponentAbility, boolean z) {
        View viewLLLJIL;
        C0SZ8 c0sz8D = null;
        if (iViewPagerComponentAbility != null) {
            c0sz8D = iViewPagerComponentAbility.D();
        }
        if (z) {
            if (c0sz8D != null) {
                viewLLLJIL = c0sz8D.LLLLZLLIL();
            } else {
                return;
            }
        } else if (c0sz8D == null) {
            return;
        } else {
            viewLLLJIL = c0sz8D.LLLJIL();
        }
        if (viewLLLJIL != null) {
            C786410Ut5.LJLLLLLL(8, viewLLLJIL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0026 A[PHI: r3
      0x0026: PHI (r3v4 float) = (r3v3 float), (r3v5 float) binds: [B:15:0x0044, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIIIZZ(boolean r7, com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility r8) {
        /*
            if (r8 != 0) goto L3
            return
        L3:
            long r5 = r8.getCurrentPosition()
            long r1 = r8.te()
            X.10Tv r0 = X.C19252910Tv.LIZIZ
            X.0sAf r0 = r0.LIZLLL()
            X.0sAQ r0 = r0.LJIJI()
            int r0 = r0.LJJI(r1)
            float r3 = (float) r0
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 * r0
            if (r7 == 0) goto L3c
            float r4 = (float) r5
            float r4 = r4 - r3
            r3 = 0
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 >= 0) goto L27
        L26:
            r4 = r3
        L27:
            float r0 = (float) r1
            float r4 = r4 / r0
            r0 = 100
            float r0 = (float) r0
            float r4 = r4 * r0
            r0 = 1120272384(0x42c60000, float:99.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L35
            r4 = 1120272384(0x42c60000, float:99.0)
        L35:
            r8.dO0(r4)
            r8.LJJIIZ()
            return
        L3c:
            float r4 = (float) r5
            float r4 = r4 + r3
            float r3 = (float) r1
            r0 = 1
            float r0 = (float) r0
            float r3 = r3 - r0
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 <= 0) goto L27
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1616650sAh.LJIIIIZZ(boolean, com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(boolean r3, android.view.View r4, com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility r5, boolean r6) {
        /*
            if (r5 == 0) goto L55
            X.0SZ8 r0 = r5.LJLIL()
        L6:
            r2 = 0
            if (r0 == 0) goto L53
            X.0Mup r0 = r0.x3()
            if (r0 == 0) goto L53
            boolean r1 = r0.Mg()
            r0 = 1
            if (r1 != r0) goto L53
        L16:
            r1 = 0
            if (r0 != 0) goto L42
            if (r3 == 0) goto L42
            X.C786410Ut5.LJLLLLLL(r2, r4)
            android.view.ViewPropertyAnimator r0 = r4.animate()
            if (r0 == 0) goto L41
            android.view.ViewPropertyAnimator r2 = r0.alpha(r1)
            if (r2 == 0) goto L41
            r0 = 100
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r0)
            if (r2 == 0) goto L41
            Y.ARunnableS13S0210000_12 r1 = new Y.ARunnableS13S0210000_12
            r0 = 2
            r1.<init>(r4, r6, r5, r0)
            android.view.ViewPropertyAnimator r0 = r2.withEndAction(r1)
            if (r0 == 0) goto L41
            r0.start()
        L41:
            return
        L42:
            r0 = 8
            X.C786410Ut5.LJLLLLLL(r0, r4)
            LJFF(r5, r6)
            LJ(r5, r6)
            if (r3 != 0) goto L41
            X.C786410Ut5.T4(r4, r1)
            return
        L53:
            r0 = 0
            goto L16
        L55:
            r0 = 0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1616650sAh.LIZLLL(boolean, android.view.View, com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility, boolean):void");
    }

    public static final void LIZ(Context context, View view, ImageView imageView, TuxTextView tuxTextView, boolean z) {
        float f;
        if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLIFFJFJJ()) {
            if (!C426750GoL.LIZLLL(context) ? !z : z) {
                f = -90.0f;
            } else {
                f = 90.0f;
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_chevron_down_double;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.zi, context);
            c419910GdJ.LJ = C1308910kAL.LIZJ(R.attr.zi, context);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(tuxIconDrawableLIZ.LJII, tuxIconDrawableLIZ.LJIIIIZZ, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            tuxIconDrawableLIZ.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            tuxIconDrawableLIZ.draw(canvas);
            Matrix matrix = new Matrix();
            matrix.postRotate(f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
            C0CNO.LIZLLL(0L, new AwS15S0410000_6(imageView, tuxTextView, z, context, new BitmapDrawable(context.getResources(), Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true)), 1));
            return;
        }
        boolean zLIZLLL = C426750GoL.LIZLLL(context);
        float f2 = -45.0f;
        int i = R.raw.icon_arrow_counter_clockwise;
        if (zLIZLLL) {
            if (z) {
                i = R.raw.icon_arrow_clockwise;
                f2 = 45.0f;
            }
        } else if (!z) {
            i = R.raw.icon_arrow_clockwise;
            f2 = 45.0f;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = i;
        c419910GdJ2.LIZIZ = iLIZIZ;
        c419910GdJ2.LIZJ = iLIZIZ;
        c419910GdJ2.LIZLLL = C1308910kAL.LIZJ(R.attr.zi, context);
        c419910GdJ2.LJ = C1308910kAL.LIZJ(R.attr.zi, context);
        C0CNO.LIZLLL(0L, new C427420GpQ(imageView, c419910GdJ2.LIZ(context), iLIZIZ, f2, view));
    }

    public static final void LJIIIZ(Aweme aweme, View view, IViewPagerComponentAbility iViewPagerComponentAbility, Integer num, boolean z) {
        TextView textView;
        Video video;
        float f;
        ViewPropertyAnimator viewPropertyAnimatorScaleX;
        ViewPropertyAnimator viewPropertyAnimatorScaleY;
        ViewPropertyAnimator duration;
        if (LJI(aweme) && LJII(num)) {
            if (z) {
                textView = (TextView) view.findViewById(R.id.tjk);
            } else {
                textView = (TextView) view.findViewById(R.id.hp_);
                if (textView == null) {
                    return;
                }
            }
            if (aweme != null && (video = aweme.getVideo()) != null) {
                int duration2 = video.getDuration();
                C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
                textView.setText(String.valueOf(c19252910Tv.LIZLLL().LJIJI().LJJI(duration2)));
                C786410Ut5.LJLLLLLL(0, view);
                C786410Ut5.T4(view, 0.0f);
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                if (viewPropertyAnimatorAnimate != null) {
                    if (c19252910Tv.LIZLLL().LJIJI().LLIFFJFJJ()) {
                        f = 0.5f;
                    } else {
                        f = 0.3f;
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(f);
                    if (viewPropertyAnimatorAlpha != null && (viewPropertyAnimatorScaleX = viewPropertyAnimatorAlpha.scaleX(1.0f)) != null && (viewPropertyAnimatorScaleY = viewPropertyAnimatorScaleX.scaleY(1.0f)) != null && (duration = viewPropertyAnimatorScaleY.setDuration(100L)) != null) {
                        duration.start();
                    }
                }
                view.setSelected(false);
                return;
            }
            return;
        }
        LIZLLL(false, view, iViewPagerComponentAbility, z);
    }
}
