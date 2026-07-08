package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.Pair;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0SnI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C731860SnI extends C1303280k1G {
    public static final int LLIZ;
    public static final int LLIZLLLIL;
    public static final int LLJ;
    public static String LLJI;
    public static String LLJIJIL;
    public C731340SmS LL;
    public int LLILLJJLI;
    public C731870SnJ LLILLL;
    public C731870SnJ LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;

    public C731860SnI(Context context) {
        this(context, null, 6, 0);
    }

    public C731860SnI(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    static {
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
        LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
        LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
    }

    private final int getLayoutWidth() {
        return C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LJJIFFI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(45)));
    }

    private final int getLottieWidth() {
        return C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LJJIFFI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(45)));
    }

    public C731340SmS getFavoriteViewScaleHelper() {
        if (this.LL == null) {
            this.LL = new C731340SmS();
        }
        return this.LL;
    }

    public int getLandscapeDrawableWidth() {
        C695370RPj.LIZ.getClass();
        return C695370RPj.LIZ(null).LIZ() ? LLIZ : LLIZLLLIL;
    }

    private final Pair<String, String> getJsonStringNewName() {
        String str;
        String str2;
        int iLIZIZ = C296090Bj5.LIZIZ();
        if (iLIZIZ == 1) {
            str = "icon_media_favoriate_active.png";
            str2 = "icon_media_favoriate.png";
        } else if (iLIZIZ == 2) {
            str = "icon_exp_exp_01_icon_media_favoriate_active.png";
            str2 = "icon_exp_exp_01_icon_media_favoriate.png";
        } else if (iLIZIZ != 3) {
            str = "icon_color_bookmark_yellow_shadow_alt_1.png";
            str2 = "icon_color_bookmark_shadow_alt_1.png";
        } else {
            str = "icon_exp_exp_02_icon_media_favoriate_active.png";
            str2 = "icon_exp_exp_02_icon_media_favoriate.png";
        }
        return new Pair<>(str, str2);
    }

    public final void LJFF() {
        Drawable drawable = getDrawable();
        if (drawable != null && !(drawable instanceof C1295950jpR) && drawable.getIntrinsicWidth() > 0) {
            this.LLILLJJLI = drawable.getIntrinsicWidth();
        }
        if (C0SXF.LJIL(getContext())) {
            this.LLILLJJLI = getLandscapeDrawableWidth();
        }
    }

    public final void LJI() {
        String strLIZ;
        LJFF();
        if (!C296090Bj5.LIZ()) {
            setAnimation(this.LLILZIL);
            if (this.LLILLL == null) {
                this.LLILLL = new C731870SnJ(this);
            }
            removeAnimatorListener(this.LLILLL);
            addAnimatorListener(this.LLILLL);
            playAnimation();
            return;
        }
        if (LLJI == null && (strLIZ = C08ET.LIZ(getContext(), this.LLILZIL)) != null) {
            Pair<String, String> jsonStringNewName = getJsonStringNewName();
            LLJI = u.LJJIFFI(u.LJJIFFI(strLIZ, "ic_bookmark_2.png", jsonStringNewName.getFirst(), false), "ic_bookmark_1.png", jsonStringNewName.getSecond(), false);
        }
        C1292030jj7<C1294720jnS> c1292030jj7LJII = C1294250jmh.LJII(LLJI, "favoriteAdd");
        c1292030jj7LJII.LIZIZ(new C739000Syo(this, 0));
        c1292030jj7LJII.LIZ(new InterfaceC1292040jj8() { // from class: X.0SnK
            @Override // X.InterfaceC1292040jj8
            public final /* bridge */ /* synthetic */ void onResult(Object obj) {
            }
        });
    }

    public final void LJII() {
        String strLIZ;
        LJFF();
        if (!C296090Bj5.LIZ()) {
            setAnimation(this.LLILZLL);
            if (this.LLILZ == null) {
                this.LLILZ = new C731870SnJ(this);
            }
            removeAnimatorListener(this.LLILZ);
            addAnimatorListener(this.LLILZ);
            playAnimation();
            return;
        }
        if (LLJIJIL == null && (strLIZ = C08ET.LIZ(getContext(), this.LLILZLL)) != null) {
            Pair<String, String> jsonStringNewName = getJsonStringNewName();
            LLJIJIL = u.LJJIFFI(u.LJJIFFI(strLIZ, "ic_bookmark_2.png", jsonStringNewName.getFirst(), false), "ic_bookmark_1.png", jsonStringNewName.getSecond(), false);
        }
        C1292030jj7<C1294720jnS> c1292030jj7LJII = C1294250jmh.LJII(LLJIJIL, "favoriteCancel");
        c1292030jj7LJII.LIZIZ(new C739000Syo(this, 1));
        c1292030jj7LJII.LIZ(new InterfaceC1292040jj8() { // from class: X.0SnL
            @Override // X.InterfaceC1292040jj8
            public final /* bridge */ /* synthetic */ void onResult(Object obj) {
            }
        });
    }

    public final C731340SmS getScaleHelper() {
        return this.LL;
    }

    public final void LJ(boolean z) {
        int layoutWidth;
        if (!C0SXF.LJIL(getContext()) && !C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LJIJ()) {
            return;
        }
        if (z) {
            layoutWidth = (int) ((this.LLILLJJLI / 120.0f) * 168);
        } else {
            layoutWidth = getLayoutWidth();
        }
        if (C0SXF.LJIL(getContext())) {
            if (z) {
                layoutWidth = (int) ((this.LLILLJJLI / 120.0f) * 168);
            } else {
                layoutWidth = getLandscapeDrawableWidth();
            }
        }
        if (z && layoutWidth == 0) {
            if (C0SXF.LJIL(getContext())) {
                layoutWidth = LLJ;
            } else {
                layoutWidth = getLottieWidth();
            }
        }
        int iLJJIFFI = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LJJIFFI(layoutWidth);
        if (iLJJIFFI > 0 && getWidth() != iLJJIFFI) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = iLJJIFFI;
            layoutParams.height = iLJJIFFI;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams);
        }
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

    public final void setScaleHelper(C731340SmS c731340SmS) {
        this.LL = c731340SmS;
    }

    public C731860SnI(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZIL = "feed_fill_favourite/feed_fill_favourite_add_lottie.json";
        this.LLILZLL = "feed_fill_favourite/feed_fill_favourite_cancel_lottie.json";
    }

    public /* synthetic */ C731860SnI(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
