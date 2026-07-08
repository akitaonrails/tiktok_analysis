package X;

import Y.AAListenerS322S0100000_11;
import Y.ALAdapterS8S0100000_11;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedDefaultAvatarAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0SnQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C731940SnQ extends C1303280k1G {
    public static final String LLIZ = getLikeAnim();
    public static final String LLIZLLLIL;
    public static String LLJ;
    public static String LLJI;
    public C731950SnR LL;
    public C731950SnR LLILLJJLI;
    public C731140Sm8 LLILLL;
    public FeedDefaultAvatarAbility LLILZ;
    public int LLILZIL;
    public C731960SnS LLILZLL;

    public static String getLikeGuideAnim() {
        return "feed_like_guide/like_reminder.json";
    }

    private C731140Sm8 getDiggViewScaleHelper() {
        if (this.LLILLL == null) {
            this.LLILLL = new C731140Sm8();
        }
        return this.LLILLL;
    }

    static {
        getLikeGuideAnim();
        LLIZLLLIL = getDislikeAnim();
        LLJ = null;
        LLJI = null;
    }

    public static String getDislikeAnim() {
        return C284030BBh.LIZ() != 0 ? "tt_feed_like_cancel_tux_lottie.json" : "feed_fill_like/feed_fill_like_cancel_lottie.json";
    }

    public static String getLikeAnim() {
        return (C284030BBh.LIZ() & 1) == 1 ? "tt_feed_like_tap_tux_lottie.json" : (C284030BBh.LIZ() & 2) == 2 ? "tt_feed_like_tap_quick_tux_lottie.json" : "feed_fill_like/feed_fill_like_add_lottie.json";
    }

    public final void LJII() {
        Drawable drawable = getDrawable();
        if (drawable == null || (drawable instanceof C1295950jpR) || drawable.getIntrinsicWidth() <= 0) {
            return;
        }
        this.LLILZIL = drawable.getIntrinsicWidth();
    }

    public final void LJIIL() {
        String strLIZ;
        LJII();
        if (C589300N9k.LIZLLL()) {
            if (LLJI == null && (strLIZ = C08ET.LIZ(getContext(), LLIZLLLIL)) != null) {
                LLJI = u.LJJIFFI(u.LJJIFFI(strLIZ, "ic_like_fill_2_new.png", "icon_like_shadow_alt.png", false), "ic_like_fill_1_new.png", "icon_dislike_shadow_alt.png", false);
            }
            C1292030jj7<C1294720jnS> c1292030jj7LJII = C1294250jmh.LJII(LLJI, "dislike");
            c1292030jj7LJII.LIZIZ(new C739000Syo(this, 4));
            c1292030jj7LJII.LIZ(new C731970SnT());
            return;
        }
        setAnimation(LLIZLLLIL);
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = new C731950SnR(this);
        }
        removeAnimatorListener(this.LLILLJJLI);
        addAnimatorListener(this.LLILLJJLI);
        playAnimation();
    }

    public final void LJIILL() {
        String strLIZ;
        LJII();
        if (C589300N9k.LIZLLL()) {
            if (LLJ == null && (strLIZ = C08ET.LIZ(getContext(), LLIZ)) != null) {
                LLJ = u.LJJIFFI(u.LJJIFFI(strLIZ, "ic_like_fill_2_new.png", "icon_like_shadow_alt.png", false), "ic_like_fill_1_new.png", "icon_dislike_shadow_alt.png", false);
            }
            C1292030jj7<C1294720jnS> c1292030jj7LJII = C1294250jmh.LJII(LLJ, "like");
            c1292030jj7LJII.LIZIZ(new C739000Syo(this, 5));
            c1292030jj7LJII.LIZ(new C731970SnT());
            return;
        }
        setAnimation(LLIZ);
        if (this.LL == null) {
            this.LL = new C731950SnR(this);
        }
        removeAnimatorListener(this.LL);
        addAnimatorListener(this.LL);
        playAnimation();
    }

    public C731940SnQ(Context context) {
        super(context);
    }

    public final void LJ(Boolean bool) {
        int iLJ;
        if (bool.booleanValue()) {
            iLJ = (int) (((this.LLILZIL * 1.0f) / 120.0f) * 168.0f);
        } else {
            iLJ = C731140Sm8.LJ();
        }
        if (iLJ > 0 && getWidth() != iLJ) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = iLJ;
            layoutParams.height = iLJ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams);
        }
    }

    public final void LJFF(Aweme aweme) {
        Drawable drawableLJI;
        setImageAlpha(254);
        getDiggViewScaleHelper().getClass();
        if (C828040We2.LIZIZ()) {
            LruCache<String, Drawable> lruCache = C730700SlQ.LIZ;
            drawableLJI = LJI(getContext(), aweme);
        } else {
            drawableLJI = LJI(getContext(), aweme);
        }
        setImageDrawable(drawableLJI);
    }

    public void LJIIIZ(boolean z) {
        float f;
        String str = LLIZ;
        if ("icon_home_like_new.json".equals(str) || "tt_feed_like_tap_old_tux_lottie.json".equals(str) || "tt_feed_like_tap_old_quick_tux_lottie.json".equals(str)) {
            if (!"tt_feed_like_tap_old_tux_lottie.json".equals(str) && !"tt_feed_like_tap_old_quick_tux_lottie.json".equals(str)) {
                f = 1.25f;
            } else {
                f = 1.5555556f;
            }
            int iLJ = C731140Sm8.LJ();
            if (z) {
                iLJ = (int) (Math.min(this.LLILZIL, iLJ) * f);
            }
            int iLJIIZILJ = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LJIIZILJ(iLJ);
            if (iLJIIZILJ > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.width = iLJIIZILJ;
                layoutParams.height = iLJIIZILJ;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                setLayoutParams(layoutParams);
            }
        }
    }

    public final void LJIILIIL(Aweme aweme) {
        if (C589300N9k.LJ()) {
            return;
        }
        LJII();
        setPivotX(getWidth() / 2.0f);
        setPivotY(getHeight() / 2.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, 1.1f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, 1.1f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, "scaleX", 0.92f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this, "scaleY", 0.92f, 1.0f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        animatorSet2.setDuration(200L);
        animatorSet2.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(animatorSet, animatorSet2);
        animatorSet.addListener(new AAListenerS322S0100000_11(this, 13));
        C731950SnR c731950SnR = this.LLILLJJLI;
        if (c731950SnR == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init disLikeAnimatorListener aweme ");
            sbLIZ.append(aweme);
            C1022620cia.LIZ("DiggAnimationView", C2188811AlT.LIZIZ(sbLIZ));
            this.LLILLJJLI = new C731950SnR(this, aweme);
        } else if (c731950SnR.LLILLJJLI != aweme) {
            c731950SnR.LLILLJJLI = aweme;
        }
        removeAnimatorListener(this.LLILLJJLI);
        animatorSet3.addListener(this.LLILLJJLI);
        animatorSet3.start();
    }

    public final void LJIILLIIL(Aweme aweme) {
        if (C589300N9k.LJ()) {
            return;
        }
        LJII();
        setPivotX(getWidth() / 2.0f);
        float f = -C12ES.LIZJ(5.0f, getContext());
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationY", 0.0f, f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, 1.15f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, 1.15f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet.setDuration(100L);
        animatorSet.setInterpolator(C1619980sG4.LIZLLL());
        float fLIZJ = C12ES.LIZJ(3.0f, getContext());
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this, "translationY", f, fLIZJ);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this, "scaleX", 1.15f, 0.88f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this, "scaleY", 1.15f, 0.88f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(objectAnimatorOfFloat4, objectAnimatorOfFloat5, objectAnimatorOfFloat6);
        animatorSet2.setDuration(200L);
        animatorSet2.setInterpolator(C1619980sG4.LIZLLL());
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this, "translationY", fLIZJ, 0.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this, "scaleX", 0.88f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this, "scaleY", 0.88f, 1.0f);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9);
        animatorSet3.setDuration(100L);
        animatorSet3.setInterpolator(C1619980sG4.LIZLLL());
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playSequentially(animatorSet, animatorSet2, animatorSet3);
        C731950SnR c731950SnR = this.LL;
        if (c731950SnR == null) {
            this.LL = new C731950SnR(this, aweme);
        } else if (c731950SnR.LLILLJJLI != aweme) {
            c731950SnR.LLILLJJLI = aweme;
        }
        removeAnimatorListener(this.LL);
        animatorSet4.addListener(this.LL);
        animatorSet4.start();
    }

    @Override // X.C1303280k1G, X.C1295960jpS, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // X.C1295960jpS
    public void setComposition(C1294720jnS c1294720jnS) {
        super.setComposition(c1294720jnS);
    }

    public C731940SnQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.drawable.Drawable LJI(android.content.Context r7, com.ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
            r1 = 0
            if (r7 == 0) goto Lbc
            android.content.res.Resources r0 = r7.getResources()
            if (r0 == 0) goto Lbc
            android.graphics.drawable.StateListDrawable r3 = new android.graphics.drawable.StateListDrawable
            r3.<init>()
            r0 = 2130971795(0x7f040c93, float:1.7552338E38)
            com.bytedance.tux.drawable.TuxIconDrawable r5 = LJIIIIZZ(r0, r7)
            boolean r0 = X.C589300N9k.LIZLLL()
            r1 = 3
            r2 = 2
            r4 = 1
            if (r0 == 0) goto L31
            boolean r0 = X.C296090Bj5.LIZ()
            if (r0 == 0) goto Lb7
            int r0 = X.C296090Bj5.LIZIZ()
            if (r0 != r4) goto La2
            r0 = 2130774263(0x7f0108f7, float:1.7151696E38)
        L2d:
            com.bytedance.tux.drawable.TuxIconDrawable r5 = LJIIIIZZ(r0, r7)
        L31:
            boolean r0 = X.C589300N9k.LIZLLL()
            if (r0 == 0) goto L9a
            boolean r0 = X.C296090Bj5.LIZ()
            if (r0 == 0) goto L96
            int r0 = X.C296090Bj5.LIZIZ()
            if (r0 != r4) goto L82
            r0 = 2130774264(0x7f0108f8, float:1.7151698E38)
        L46:
            com.bytedance.tux.drawable.TuxIconDrawable r6 = LJIIIIZZ(r0, r7)
        L4a:
            boolean r0 = X.C1017070cZd.LJLLL(r8)
            if (r0 == 0) goto L62
            X.0SrN r0 = X.C734390SrN.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService r0 = X.C734390SrN.LIZ()
            if (r0 == 0) goto L62
            android.graphics.drawable.Drawable r0 = r0.LIZJ(r7, r8)
            if (r0 == 0) goto L62
            r6 = r0
        L62:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_OVER
            r2 = 0
            r5.setColorFilter(r2, r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_OVER
            r6.setColorFilter(r2, r0)
            int[] r1 = new int[r4]
            r0 = -16842913(0xfffffffffefeff5f, float:-1.6947494E38)
            r1[r2] = r0
            r3.addState(r1, r5)
            int[] r1 = new int[r4]
            r0 = 16842913(0x10100a1, float:2.369401E-38)
            r1[r2] = r0
            r3.addState(r1, r6)
            return r3
        L82:
            int r0 = X.C296090Bj5.LIZIZ()
            if (r0 != r2) goto L8c
            r0 = 2130773722(0x7f0106da, float:1.7150599E38)
            goto L46
        L8c:
            int r0 = X.C296090Bj5.LIZIZ()
            if (r0 != r1) goto L96
            r0 = 2130773765(0x7f010705, float:1.7150686E38)
            goto L46
        L96:
            r0 = 2130773234(0x7f0104f2, float:1.7149609E38)
            goto L46
        L9a:
            r0 = 2130971796(0x7f040c94, float:1.755234E38)
            com.bytedance.tux.drawable.TuxIconDrawable r6 = LJIIIIZZ(r0, r7)
            goto L4a
        La2:
            int r0 = X.C296090Bj5.LIZIZ()
            if (r0 != r2) goto Lac
            r0 = 2130773721(0x7f0106d9, float:1.7150597E38)
            goto L2d
        Lac:
            int r0 = X.C296090Bj5.LIZIZ()
            if (r0 != r1) goto Lb7
            r0 = 2130773764(0x7f010704, float:1.7150684E38)
            goto L2d
        Lb7:
            r0 = 2130773237(0x7f0104f5, float:1.7149615E38)
            goto L2d
        Lbc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C731940SnQ.LJI(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme):android.graphics.drawable.Drawable");
    }

    public static TuxIconDrawable LJIIIIZZ(int i, Context context) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        int i2 = C731140Sm8.LJII;
        c419910GdJ.LIZIZ = C487570JAd.LIZ();
        c419910GdJ.LIZJ = C487570JAd.LIZ();
        return c419910GdJ.LIZ(context);
    }

    public final void LJIIJJI(View view, Aweme aweme) {
        Boolean bool = (Boolean) getTag(R.id.v9t);
        if (bool != null && bool.booleanValue()) {
            C730950Slp.LIZ(view);
            return;
        }
        C731960SnS c731960SnS = this.LLILZLL;
        if (c731960SnS != null && c731960SnS.LJ) {
            c731960SnS.LIZJ = true;
            ALAdapterS8S0100000_11 aLAdapterS8S0100000_11 = c731960SnS.LJFF;
            if (aLAdapterS8S0100000_11 != null) {
                c731960SnS.LIZ.removeListener(aLAdapterS8S0100000_11);
            }
            c731960SnS.LIZ.cancel();
            c731960SnS.LJ = false;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setRotation(0.0f);
            LJFF(aweme);
        }
        if (!isSelected()) {
            if (C589300N9k.LIZIZ()) {
                LJIILLIIL(aweme);
                return;
            } else {
                LJIILL();
                return;
            }
        }
        if (C589300N9k.LIZIZ()) {
            LJIILIIL(aweme);
        } else {
            LJIIL();
        }
    }
}
