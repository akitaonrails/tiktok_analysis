package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0H1T, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H1T implements Runnable {
    public final Context LL;
    public final Comment LLILLJJLI;
    public final Aweme LLILLL;
    public final C0MNH LLILZ;
    public final Function1<Bitmap, Unit> LLILZIL;

    public final void LIZ() throws InterruptedException {
        Video video;
        UrlModel cover;
        List<String> urlList;
        String str;
        Video video2;
        UrlModel cover2;
        List<String> urlList2;
        String str2;
        String str3 = "";
        if (this.LLILZ != C0MNH.STORY) {
            if (this.LL == null) {
                return;
            }
            final CountDownLatch countDownLatch = new CountDownLatch(2);
            final LinearLayout linearLayout = new LinearLayout(this.LL, null);
            C786410Ut5.d6(linearLayout, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(240)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(320))));
            linearLayout.setOrientation(1);
            C0H1U.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)), linearLayout);
            C0H90 c0h90 = new C0H90(this.LL, null, 0);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c0h90.LJ(iLIZIZ2, iLIZIZ, iLIZIZ2);
            c0h90.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            c0h90.LJFF(43, 5, 12, null);
            linearLayout.addView(c0h90);
            c0h90.LIZ(this.LLILLJJLI, new AwS585S0100000_6(countDownLatch, 308));
            final ImageView imageView = new ImageView(this.LL, null);
            C786410Ut5.c6(imageView, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(160))));
            linearLayout.addView(imageView);
            Aweme aweme = this.LLILLL;
            if (aweme != null && (video = aweme.getVideo()) != null && (cover = video.getCover()) != null && (urlList = cover.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList)) != null) {
                str3 = str;
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str3);
            c1331670kl3LJIIIZ.LJJIJL(this.LL);
            c1331670kl3LJIIIZ.LIZLLL("load_comment_post_cover");
            c1331670kl3LJIIIZ.LJJIIJ(new AbstractC468201s0() { // from class: X.0GfO
                @Override // X.InterfaceC1331910klR
                public final void LIZ(Bitmap bitmap) {
                    imageView.setImageBitmap(bitmap);
                    Pair<Integer, Integer> pairLIZ = C1346390l8n.LIZ(bitmap);
                    if (pairLIZ == null) {
                        return;
                    }
                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{pairLIZ.getFirst().intValue(), pairLIZ.getSecond().intValue()});
                    gradientDrawable.setCornerRadius(0.0f);
                    linearLayout.setBackground(gradientDrawable);
                    countDownLatch.countDown();
                }

                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await();
            linearLayout.measure(View.MeasureSpec.makeMeasureSpec(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(240)), 1073741824), View.MeasureSpec.makeMeasureSpec(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(320)), Integer.MIN_VALUE));
            linearLayout.layout(0, 0, linearLayout.getMeasuredWidth(), linearLayout.getMeasuredHeight());
            C0CF8.LIZ.getClass();
            this.LLILZIL.invoke(C19724012Fa.LIZ(linearLayout, C0CF8.LIZJ() ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888));
            return;
        }
        if (this.LL != null) {
            final CountDownLatch countDownLatch2 = new CountDownLatch(2);
            final LinearLayout linearLayout2 = new LinearLayout(this.LL, null);
            linearLayout2.setOrientation(1);
            C786410Ut5.d6(linearLayout2, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(240)), -2));
            linearLayout2.setGravity(16);
            C0H1U.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), linearLayout2);
            C0H90 c0h902 = new C0H90(this.LL, null, 0);
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
            c0h902.LJ(iLIZIZ4, iLIZIZ3, iLIZIZ4);
            c0h902.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            c0h902.LJFF(33, 8, 9, 16);
            c0h902.setAvatarVisible(false);
            linearLayout2.addView(c0h902);
            c0h902.LIZ(this.LLILLJJLI, new AwS582S0100000_3(countDownLatch2, 114));
            final ImageView imageView2 = new ImageView(this.LL, null);
            C786410Ut5.c6(imageView2, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(168)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(224))));
            imageView2.setScaleType(ImageView.ScaleType.FIT_START);
            linearLayout2.addView(imageView2);
            C0H9H.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)), imageView2);
            C0H9H.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13)), imageView2);
            Aweme aweme2 = this.LLILLL;
            if (aweme2 != null && (video2 = aweme2.getVideo()) != null && (cover2 = video2.getCover()) != null && (urlList2 = cover2.getUrlList()) != null && (str2 = (String) C13LP.LJJJLL(urlList2)) != null) {
                str3 = str2;
            }
            C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(str3);
            c1331670kl3LJIIIZ2.LJJIJL(this.LL);
            c1331670kl3LJIIIZ2.LIZLLL("load_comment_post_cover");
            c1331670kl3LJIIIZ2.LJJIIJ(new AbstractC468201s0() { // from class: X.0GfN
                @Override // X.InterfaceC1331910klR
                public final void LIZ(Bitmap bitmap) {
                    imageView2.setImageBitmap(bitmap);
                    Pair<Integer, Integer> pairLIZ = C1346390l8n.LIZ(bitmap);
                    if (pairLIZ == null) {
                        return;
                    }
                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{pairLIZ.getFirst().intValue(), pairLIZ.getSecond().intValue()});
                    gradientDrawable.setCornerRadius(0.0f);
                    linearLayout2.setBackground(gradientDrawable);
                    countDownLatch2.countDown();
                }

                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                    countDownLatch2.countDown();
                }
            });
            countDownLatch2.await();
            linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(240)), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(320)), (int) (((((Number) C473380IhM.LIZ(C1388190mED.LIZIZ(this.LL)).getSecond()).intValue() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64))) / ((Number) C473380IhM.LIZ(C1388190mED.LIZIZ(this.LL)).getFirst()).intValue()) * C814420VxA.LIZIZ(C418440Gaw.LIZIZ(240)))), 1073741824));
            linearLayout2.layout(0, 0, linearLayout2.getMeasuredWidth(), linearLayout2.getMeasuredHeight());
            this.LLILZIL.invoke(C19724012Fa.LIZ(linearLayout2, Bitmap.Config.RGB_565));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("GenerateCommentPostSimpleCoverTask@a879.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GenerateCommentPostSimpleCoverTask@a879.run");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0H1T(Context context, Comment comment, Aweme aweme, C0MNH c0mnh, Function1<? super Bitmap, Unit> function1) {
        this.LL = context;
        this.LLILLJJLI = comment;
        this.LLILLL = aweme;
        this.LLILZ = c0mnh;
        this.LLILZIL = function1;
    }
}
