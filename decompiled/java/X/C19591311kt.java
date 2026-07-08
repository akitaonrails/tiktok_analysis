package X;

import Y.ALAdapterS9S0100000_12;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.media.ThumbnailUtils;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.google.gson.l;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.11kt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19591311kt {
    public static final C19591311kt LIZ = new C19591311kt();

    public static NormalTrackTimeStamp LJ(InteractStickerStruct interactStickerStruct) {
        List list;
        String trackList;
        try {
            Gson gson = C7740030o.LIZ().getGson();
            if (interactStickerStruct != null) {
                trackList = interactStickerStruct.getTrackList();
            } else {
                trackList = null;
            }
            list = (List) GsonProtectorUtils.fromJson(gson, trackList, new TypeToken<List<? extends NormalTrackTimeStamp>>() { // from class: X.11kw
            }.getType());
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("new InteractStickerUtils.kt : e ");
            sbLIZ.append(e);
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            list = null;
        }
        if (C086I.LIZIZ(list) || list == null || list.isEmpty()) {
            return null;
        }
        return (NormalTrackTimeStamp) ListProtector.get(list, 0);
    }

    public static float LJFF(float f) {
        return new BigDecimal(f).setScale(4, 1).floatValue();
    }

    public static final UrlModel LJIIJJI(String str) {
        if (str != null && str.length() != 0) {
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(Collections.singletonList(str));
            return urlModel;
        }
        return null;
    }

    public static C19592211l2 LIZIZ(C19591211ks c19591211ks, InteractStickerStruct interactStickerStruct) {
        C19592311l3 c19592311l3 = c19591211ks.LIZJ;
        int i = c19592311l3.LIZIZ;
        int i2 = c19592311l3.LIZ;
        LIZ.getClass();
        NormalTrackTimeStamp normalTrackTimeStampLJ = LJ(interactStickerStruct);
        if (normalTrackTimeStampLJ != null) {
            float f = i;
            float y = (normalTrackTimeStampLJ.getY() - 0.5f) * f;
            float f2 = i2;
            float x = (normalTrackTimeStampLJ.getX() - 0.5f) * f2;
            Float scale = normalTrackTimeStampLJ.getScale();
            return new C19592211l2(x, y, normalTrackTimeStampLJ.getRotation(), scale.floatValue(), normalTrackTimeStampLJ.getWidth() * f2, normalTrackTimeStampLJ.getHeight() * f);
        }
        return new C19592211l2(0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
    }

    public static InteractStickerStruct LIZLLL(StickerModel stickerModel, boolean z) {
        InteractStickerStruct interactStickerStructLIZJ = LIZJ(stickerModel.getStickerType().getType(), stickerModel.getBaseModel(), z);
        interactStickerStructLIZJ.setNoGlobal(stickerModel.needCompile());
        return interactStickerStructLIZJ;
    }

    public static void LJIIIIZZ(EditText editText, double d) {
        if (editText == null) {
            return;
        }
        if (TextUtils.isEmpty(C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUKFwR0rixQqTHGUOPNDL0niZMIb019xVw=", null)).toString()) && editText.getHint() != null) {
            Paint paint = new Paint();
            paint.setTextSize(editText.getTextSize());
            paint.setTypeface(editText.getTypeface());
            int iMeasureText = (int) ((editText.getLayoutParams().width - paint.measureText(editText.getHint().toString())) / 2);
            if (iMeasureText < 0) {
                editText.setPaddingRelative(0, 0, 0, 0);
                editText.setGravity(8388659);
                return;
            } else {
                editText.setPaddingRelative(iMeasureText, 0, 0, 0);
                editText.setGravity(8388627);
                return;
            }
        }
        editText.setGravity(17);
        editText.setPaddingRelative(C341940Daq.LIZ(d), 0, C341940Daq.LIZ(d), 0);
    }

    public static void LJIIIZ(InteractStickerStruct interactStickerStruct, List list) {
        if (C2401009ay.LIZ(list)) {
            interactStickerStruct.setTrackList("");
            return;
        }
        try {
            interactStickerStruct.setTrackList(GsonProtectorUtils.toJson(C19598511m3.LIZ(), list));
        } catch (l e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static PointF LIZ(PointF pointF, float f, float f2) {
        PointF pointF2 = new PointF();
        if (f != 0.0f && f2 != 0.0f) {
            pointF2.set(LJFF(pointF.x / f), LJFF(pointF.y / f2));
            return pointF2;
        }
        return new PointF(0.0f, 0.0f);
    }

    public static InteractStickerStruct LIZJ(int i, BaseStickerModel baseStickerModel, boolean z) {
        InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
        interactStickerStruct.setType(i);
        LinkedList linkedList = new LinkedList();
        NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
        normalTrackTimeStamp.setRotation(baseStickerModel.getRotation());
        normalTrackTimeStamp.setScale(Float.valueOf(baseStickerModel.getScale()));
        PointF pointFLIZ = LIZ(new PointF(baseStickerModel.getTranslateX(), baseStickerModel.getTranslateY()), baseStickerModel.getMediaWidth(), baseStickerModel.getMediaHeight());
        normalTrackTimeStamp.setX(pointFLIZ.x + 0.5f);
        normalTrackTimeStamp.setY(pointFLIZ.y + 0.5f);
        PointF pointFLIZ2 = LIZ(new PointF(baseStickerModel.getWidth(), baseStickerModel.getHeight()), baseStickerModel.getMediaWidth(), baseStickerModel.getMediaHeight());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getInteractStickerStruct media size: ");
        sbLIZ.append(baseStickerModel.getMediaWidth());
        sbLIZ.append(" x ");
        sbLIZ.append(baseStickerModel.getMediaHeight());
        C0F8J.LIZ("stickertest", C2188811AlT.LIZIZ(sbLIZ));
        normalTrackTimeStamp.setStartTime(baseStickerModel.getStartTime());
        normalTrackTimeStamp.setEndTime(baseStickerModel.getEndTime());
        normalTrackTimeStamp.setWidth(pointFLIZ2.x);
        normalTrackTimeStamp.setHeight(pointFLIZ2.y);
        if (z) {
            normalTrackTimeStamp.setWidth(normalTrackTimeStamp.getWidth() * baseStickerModel.getScale());
            normalTrackTimeStamp.setHeight(normalTrackTimeStamp.getHeight() * baseStickerModel.getScale());
        }
        linkedList.add(normalTrackTimeStamp);
        LJIIIZ(interactStickerStruct, linkedList);
        return interactStickerStruct;
    }

    public static int LJI(Context context, String str, float f) {
        int i = 0;
        if (str.length() == 0) {
            return 0;
        }
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, i);
        tuxTextView.setTextSize(f);
        tuxTextView.setGravity(16);
        return (int) tuxTextView.getPaint().measureText(str);
    }

    public static C099F LJII(final C1322110kVd c1322110kVd, UrlModel urlModel, final float f, final float f2, final float f3, final float f4) {
        final C099F c099fLIZIZ = C090F.LIZIZ();
        C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(urlModel.getUrlList()));
        c1331670kl3LJIIJ.LJJIJL(c1322110kVd.getContext());
        c1331670kl3LJIIJ.LIZLLL("load_image_in_non_ui_thread");
        c1331670kl3LJIIJ.LJJIIJ(new AbstractC468201s0() { // from class: X.0HBK
            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
                int width;
                int height;
                if (bitmap != null) {
                    if (c1322110kVd.getWidth() > 0) {
                        width = c1322110kVd.getWidth();
                    } else {
                        width = c1322110kVd.getLayoutParams().width;
                    }
                    if (c1322110kVd.getHeight() > 0) {
                        height = c1322110kVd.getHeight();
                    } else {
                        height = c1322110kVd.getLayoutParams().height;
                    }
                    if (width > 0 && height > 0) {
                        Bitmap bitmapExtractThumbnail = ThumbnailUtils.extractThumbnail(bitmap, width, height);
                        C1322110kVd c1322110kVd2 = c1322110kVd;
                        C19591311kt c19591311kt = C19591311kt.LIZ;
                        float f5 = f;
                        float f6 = f2;
                        float f7 = f3;
                        float f8 = f4;
                        c19591311kt.getClass();
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapExtractThumbnail.getWidth(), bitmapExtractThumbnail.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Paint paint = new Paint();
                        RectF rectF = new RectF(0.0f, 0.0f, bitmapExtractThumbnail.getWidth(), bitmapExtractThumbnail.getHeight());
                        Path path = new Path();
                        path.moveTo(0.0f, f5);
                        path.quadTo(0.0f, 0.0f, f5, 0.0f);
                        path.lineTo(rectF.right - f6, 0.0f);
                        float f9 = rectF.right;
                        path.quadTo(f9, 0.0f, f9, f6);
                        path.lineTo(rectF.right, rectF.bottom - f7);
                        float f10 = rectF.right;
                        float f11 = rectF.bottom;
                        path.quadTo(f10, f11, f10 - f7, f11);
                        path.lineTo(rectF.left + f8, rectF.bottom);
                        float f12 = rectF.bottom;
                        path.quadTo(0.0f, f12, 0.0f, f12 - f8);
                        path.lineTo(0.0f, f5);
                        paint.setAntiAlias(true);
                        canvas.drawPath(path, paint);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        canvas.drawBitmap(bitmapExtractThumbnail, 0.0f, 0.0f, paint);
                        c1322110kVd2.setImageBitmap(bitmapCreateBitmap);
                        c099fLIZIZ.LJIIZILJ(Boolean.TRUE);
                        return;
                    }
                }
                c099fLIZIZ.LJJJJJ(new Throwable("bitmap is null"));
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
                C05XL<Boolean> c05xl = c099fLIZIZ;
                if (th == null) {
                    th = new Throwable("");
                }
                c05xl.LJJJJJ(th);
            }
        });
        return c099fLIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIJ(C19591311kt c19591311kt, final BaseStickerModel baseStickerModel, C1664680tQA c1664680tQA, long j, Function0 function0, int i) {
        final C1664680tQA c1664680tQA2 = c1664680tQA;
        LinearInterpolator linearInterpolator = null;
        if ((i & 2) != 0) {
            c1664680tQA2 = null;
        }
        if ((i & 8) != 0) {
            j = 200;
        }
        if ((i & 16) != 0) {
            linearInterpolator = new LinearInterpolator();
        }
        if ((i & 32) != 0) {
            function0 = new C19591711kx();
        }
        c19591311kt.getClass();
        if (c1664680tQA2 != null) {
            final float translateX = ((BaseStickerModel) c1664680tQA2.LIZ).getTranslateX() - baseStickerModel.getTranslateX();
            final float translateY = ((BaseStickerModel) c1664680tQA2.LIZ).getTranslateY() - baseStickerModel.getTranslateY();
            final float scale = ((BaseStickerModel) c1664680tQA2.LIZ).getScale() - baseStickerModel.getScale();
            if (translateX == 0.0f && translateY == 0.0f && scale == 0.0f) {
                function0.invoke();
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(j);
            valueAnimatorOfFloat.setInterpolator(linearInterpolator);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.11ku
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Float f;
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                        c1664680tQA2.LIZLLL(new C19591511kv(baseStickerModel, translateX, f.floatValue(), translateY, scale), true);
                    }
                }
            });
            valueAnimatorOfFloat.addListener(new ALAdapterS9S0100000_12(function0, 43));
            valueAnimatorOfFloat.start();
        }
    }
}
