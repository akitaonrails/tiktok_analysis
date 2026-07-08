package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.Gift;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0fPV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126110fPV extends FrameLayout {
    public static final int LLJJIII = (int) C497740JfY.LIZIZ(34.0f);
    public static final int LLJJIJI = (int) C497740JfY.LIZIZ(111.0f);
    public static final int LLJJIJIIJIL = (int) C497740JfY.LIZIZ(21.0f);
    public static final int LLJJIJIL;
    public static final int LLJJJ;
    public final C054G LL;
    public final View LLILLJJLI;
    public final C1324720kZq LLILLL;
    public final C1324720kZq LLILZ;
    public final C1324720kZq LLILZIL;
    public final C1324720kZq LLILZLL;
    public final C1295960jpS LLIZ;
    public final C1295960jpS LLIZLLLIL;
    public final C1295960jpS LLJ;
    public final CardView LLJI;
    public final C16F5 LLJIJIL;
    public final C16F5 LLJILJIL;
    public final C2268791DrB LLJILJILJ;
    public Long LLJILLL;
    public ValueAnimator LLJJ;
    public AnonymousClass0956 LLJJI;

    static {
        int iLIZIZ = (int) C497740JfY.LIZIZ(3.0f);
        LLJJIJIL = iLIZIZ;
        LLJJJ = C497740JfY.LJIIIZ(R.dimen.ayn) - iLIZIZ;
    }

    private final int getVisibleMaskWidth() {
        return LLJJJ - LLJJIII;
    }

    public final void LJFF() {
        CardView cardView = this.LLJI;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(cardView);
        cardView.setX(LIZIZ(cardView) + (getVisibleMaskWidth() * C1136970fh1.LJFF()));
    }

    public final void LJII() {
        C20441214yg.LJIIIZ("SponsoredComboProgressView", "release");
        C500260Jjc.LLFFF(this.LLILZLL);
        C500260Jjc.LJIILIIL(this.LLILLJJLI);
        C500260Jjc.LJIILLIIL(this.LLILLL);
        C500260Jjc.LJIILLIIL(this.LLILZ);
        C500260Jjc.LJIILLIIL(this.LLILZIL);
        LJFF();
        this.LLILLJJLI.getLayoutParams().width = LLJJJ;
        AnonymousClass0956 anonymousClass0956 = this.LLJJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public static int LIZIZ(View view) {
        if (view.getParent() == view.getRootView()) {
            return view.getLeft();
        }
        return LIZIZ((View) view.getParent()) + view.getLeft();
    }

    public final Bitmap LIZ(String str) {
        int iIntValue;
        Paint.Align align;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, getContext());
        int i = LLJJIJI;
        int i2 = LLJJIJIIJIL;
        Paint paint = new Paint(1);
        paint.setTextSize((int) C497740JfY.LIZIZ(18.0f));
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(63);
        paint.setTypeface(c444890HcV.getTypeface());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        paint.setColor(iIntValue);
        if (C497740JfY.LJJ()) {
            align = Paint.Align.RIGHT;
        } else {
            align = Paint.Align.LEFT;
        }
        paint.setTextAlign(align);
        float f = -paint.ascent();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (C497740JfY.LJJ()) {
            canvas.save();
            canvas.scale(-1.0f, 1.0f, 0.0f, 0.0f);
        }
        canvas.drawText(str, 0.0f, f, paint);
        if (C497740JfY.LJJ()) {
            canvas.restore();
        }
        return bitmapCreateBitmap;
    }

    public final void LIZJ(long j) {
        List<String> listLIZ;
        Gift giftFindGiftById = GiftManager.inst().findGiftById(j);
        if (giftFindGiftById != null) {
            C0JBN c0jbnLIZ = C1819620xS4.LIZ();
            ImageModel imageModel = giftFindGiftById.image;
            if (imageModel != null) {
                listLIZ = C842240X2g.LIZ(imageModel);
            } else {
                listLIZ = null;
            }
            C1324610kZf c1324610kZfLIZJ = c0jbnLIZ.LIZJ(listLIZ);
            c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
            c1324610kZfLIZJ.LJJI(this.LLILZLL);
        }
    }

    public final void LIZLLL(ImageModel imageModel) {
        if (imageModel != null) {
            C500260Jjc.LJIILLIIL(this.LLILLL);
            C500260Jjc.LLFFF(this.LLILZIL);
            C1819620xS4.LIZ().LJIIIZ(imageModel).LJJI(this.LLILZIL);
            return;
        }
        C500260Jjc.LJIILLIIL(this.LLILZIL);
    }

    public final void LJ(ImageModel imageModel) {
        if (imageModel != null) {
            C500260Jjc.LLFFF(this.LLILLL);
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLJIIIZ.LJJI(this.LLILLL);
            return;
        }
        C500260Jjc.LJIILLIIL(this.LLILLL);
    }

    public C1126110fPV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C2296808zG.LIZ(C0PEM.LIZJ.plus(new AnonymousClass0204(CoroutineExceptionHandler.LJJLIL, 6)));
        this.LLJILJILJ = new C2268791DrB(0.17f, 0.56f, 0.5f, 1.26f);
        View viewInflate = FrameLayout.inflate(context, R.layout.hmw, this);
        this.LLILLJJLI = viewInflate;
        this.LLILLL = (C1324720kZq) viewInflate.findViewById(R.id.l5i);
        this.LLILZ = (C1324720kZq) viewInflate.findViewById(R.id.l5l);
        this.LLILZIL = (C1324720kZq) viewInflate.findViewById(R.id.l6q);
        this.LLILZLL = (C1324720kZq) viewInflate.findViewById(R.id.l6d);
        C1295960jpS c1295960jpS = (C1295960jpS) viewInflate.findViewById(R.id.l75);
        this.LLIZ = c1295960jpS;
        C1295960jpS c1295960jpS2 = (C1295960jpS) viewInflate.findViewById(R.id.l66);
        this.LLIZLLLIL = c1295960jpS2;
        this.LLJ = (C1295960jpS) viewInflate.findViewById(R.id.l6_);
        this.LLJI = (CardView) viewInflate.findViewById(R.id.l76);
        this.LLJIJIL = (C16F5) viewInflate.findViewById(R.id.z5m);
        this.LLJILJIL = (C16F5) viewInflate.findViewById(R.id.z7j);
        C0KZZ.LIZLLL(c1295960jpS, "ttlive_sponsor_progress_lottie.zip", null, null, null, null, false, true, "tiktok_live_revenue_normal_1");
        C0KZZ.LIZLLL(c1295960jpS2, "ttlive_eoy_combo_lottie.zip", null, null, null, null, false, false, "tiktok_live_revenue_normal_1");
        LJFF();
    }

    public final void LJIIIIZZ(Bitmap bitmap, String str, Function0 function0) {
        C054G c054g = this.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJJI = C23250099c.LIZLLL(c054g, C2107308Nj.LIZ, null, new C751790TeL(this, str, bitmap, function0, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0470 A[PHI: r14
      0x0470: PHI (r14v1 boolean) = (r14v0 boolean), (r14v23 boolean) binds: [B:125:0x046c, B:110:0x03a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0476 A[PHI: r6 r14
      0x0476: PHI (r6v2 long) = (r6v1 long), (r6v4 long) binds: [B:128:0x0472, B:113:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x0476: PHI (r14v2 boolean) = (r14v21 boolean), (r14v22 boolean) binds: [B:128:0x0472, B:113:0x03ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019b A[PHI: r14
      0x019b: PHI (r14v8 boolean) = (r14v7 boolean), (r14v16 boolean) binds: [B:52:0x0197, B:35:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(long r33, java.lang.Integer r35, int r36, int r37, java.lang.String r38, com.bytedance.android.live.gift.GiftGalleryExtra r39, X.C1125860fP6 r40, X.EnumC1126060fPQ r41, java.lang.Long r42, int r43, kotlin.jvm.functions.Function0<kotlin.Unit> r44) {
        /*
            Method dump skipped, instruction units count: 1150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1126110fPV.LJI(long, java.lang.Integer, int, int, java.lang.String, com.bytedance.android.live.gift.GiftGalleryExtra, X.0fP6, X.0fPQ, java.lang.Long, int, kotlin.jvm.functions.Function0):void");
    }
}
