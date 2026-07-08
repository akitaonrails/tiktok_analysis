package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.Pair;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0SnU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C731980SnU extends C1303280k1G {
    public static String LLILZ;
    public static String LLILZIL;
    public C731990SnV LL;
    public C731990SnV LLILLJJLI;
    public final C01GW LLILLL;

    private final Drawable getReusedBackground() {
        return (Drawable) this.LLILLL.getValue();
    }

    public final void LJFF() {
        String strLIZ;
        String strLIZ2;
        if (((Number) C0BNV.LIZ.getValue()).intValue() <= 0 || !C1788506zT.LIZ(6.8f)) {
            if (isSelected()) {
                Drawable drawable = getDrawable();
                if (drawable != null && !(drawable instanceof C1295950jpR) && drawable.getIntrinsicWidth() > 0) {
                    drawable.getIntrinsicWidth();
                }
                if (!C296090Bj5.LIZ()) {
                    setAnimation("video_repost/tt_feed_repost_cancel_tux_lottie.json");
                    if (this.LLILLJJLI == null) {
                        this.LLILLJJLI = new C731990SnV(this);
                    }
                    removeAnimatorListener(this.LLILLJJLI);
                    addAnimatorListener(this.LLILLJJLI);
                    playAnimation();
                    return;
                }
                if (LLILZIL == null && (strLIZ = C08ET.LIZ(getContext(), "video_repost/tt_feed_repost_cancel_tux_lottie.json")) != null) {
                    Pair<String, String> jsonStringNewName = getJsonStringNewName();
                    LLILZIL = u.LJJIFFI(u.LJJIFFI(strLIZ, "IconColorRepostShadowAlt1.png", jsonStringNewName.getSecond(), false), "IconColorRepostYellowShadowAlt1.png", jsonStringNewName.getFirst(), false);
                }
                C1292030jj7<C1294720jnS> c1292030jj7LJII = C1294250jmh.LJII(LLILZIL, "unRepost");
                c1292030jj7LJII.LIZIZ(new C739000Syo(this, 3));
                c1292030jj7LJII.LIZ(new InterfaceC1292040jj8() { // from class: X.0SnX
                    @Override // X.InterfaceC1292040jj8
                    public final /* bridge */ /* synthetic */ void onResult(Object obj) {
                    }
                });
                return;
            }
            Drawable drawable2 = getDrawable();
            if (drawable2 != null && !(drawable2 instanceof C1295950jpR) && drawable2.getIntrinsicWidth() > 0) {
                drawable2.getIntrinsicWidth();
            }
            if (!C296090Bj5.LIZ()) {
                setAnimation("video_repost/tt_feed_repost_tap_tux_lottie.json");
                if (this.LL == null) {
                    this.LL = new C731990SnV(this);
                }
                removeAnimatorListener(this.LL);
                addAnimatorListener(this.LL);
                playAnimation();
                return;
            }
            if (LLILZ == null && (strLIZ2 = C08ET.LIZ(getContext(), "video_repost/tt_feed_repost_tap_tux_lottie.json")) != null) {
                Pair<String, String> jsonStringNewName2 = getJsonStringNewName();
                LLILZ = u.LJJIFFI(u.LJJIFFI(strLIZ2, "IconColorRepostShadowAlt1.png", jsonStringNewName2.getSecond(), false), "IconColorRepostYellowShadowAlt1.png", jsonStringNewName2.getFirst(), false);
            }
            C1292030jj7<C1294720jnS> c1292030jj7LJII2 = C1294250jmh.LJII(LLILZ, "repost");
            c1292030jj7LJII2.LIZIZ(new C739000Syo(this, 2));
            c1292030jj7LJII2.LIZ(new InterfaceC1292040jj8() { // from class: X.0SnW
                @Override // X.InterfaceC1292040jj8
                public final /* bridge */ /* synthetic */ void onResult(Object obj) {
                }
            });
        }
    }

    private final Pair<String, String> getJsonStringNewName() {
        String str;
        String str2;
        int iLIZIZ = C296090Bj5.LIZIZ();
        if (iLIZIZ == 1) {
            str = "icon_media_repost_active.png";
            str2 = "icon_media_repost.png";
        } else if (iLIZIZ == 2) {
            str = "icon_exp_exp_01_icon_media_repost_active.png";
            str2 = "icon_exp_exp_01_icon_media_repost.png";
        } else if (iLIZIZ != 3) {
            str = "icon_bitmap_repost_yellow_shadow_alt_1.png";
            str2 = "icon_bitmap_repost_shadow_alt_1.png";
        } else {
            str = "icon_exp_exp_02_icon_media_repost_active.png";
            str2 = "icon_exp_exp_02_icon_media_repost.png";
        }
        return new Pair<>(str, str2);
    }

    public final void LJ() {
        setImageDrawable(getReusedBackground());
    }

    @Override // X.C1303280k1G, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // X.C1303280k1G, X.C1295960jpS, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C731980SnU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C731980SnU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLL = C452501pT.LIZIZ(new AwS555S0100000_11(context, 1136));
    }
}
