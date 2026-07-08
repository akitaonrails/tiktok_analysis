package X;

import Y.ARunnableS73S0200000_4;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.SubTemplateInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerCompatModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FFp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C387070FFp extends View {
    public final C388200FJy LL;
    public final C387080FFq LLILLJJLI;
    public C384250F4t LLILLL;
    public final Paint LLILZ;
    public final Paint LLILZIL;
    public final Paint LLILZLL;
    public final RectF LLIZ;
    public boolean LLIZLLLIL;
    public final AwS584S0100000_5 LLJ;

    private final float getCurrentScale() {
        return 1.0f;
    }

    private final float getCornerRadius() {
        return this.LLILLJJLI.LJIIIIZZ;
    }

    private final float getMainCornerRadius() {
        return this.LLILLJJLI.LJ;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C384250F4t c384250F4t = this.LLILLL;
        if (c384250F4t != null) {
            c384250F4t.LIZIZ.remove(this.LLJ);
        }
        this.LLILLL = null;
        this.LLIZLLLIL = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        List<SubTemplateInfo> subTemplates;
        RectF rectFLIZJ;
        TextStickerCompatModel compatModel;
        super.onDraw(canvas);
        C384250F4t c384250F4t = this.LLILLL;
        if (c384250F4t == null) {
            return;
        }
        RectF rectFLIZIZ = c384250F4t.LIZIZ(getCurrentScale(), getWidth(), getHeight());
        if (rectFLIZIZ != null) {
            C0F8J.LIZ("inspiration", "drawMainTemplateBorder");
            if (rectFLIZIZ.width() > 0.0f && rectFLIZIZ.height() > 0.0f && RectF.intersects(rectFLIZIZ, new RectF(0.0f, 0.0f, getWidth(), getHeight()))) {
                this.LLIZ.set(rectFLIZIZ);
                float strokeWidth = this.LLILZ.getStrokeWidth() / 2;
                this.LLIZ.inset(strokeWidth, strokeWidth);
                this.LLIZ.intersect(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth);
                if (this.LLIZ.width() > 0.0f && this.LLIZ.height() > 0.0f) {
                    if (this.LLIZLLLIL) {
                        canvas.drawRoundRect(this.LLIZ, getMainCornerRadius(), getMainCornerRadius(), this.LLILZIL);
                    } else {
                        canvas.drawRoundRect(this.LLIZ, getMainCornerRadius(), getMainCornerRadius(), this.LLILZ);
                    }
                }
            }
        }
        if (this.LLIZLLLIL) {
            TextStickerModel textStickerModel = c384250F4t.LIZJ;
            if (textStickerModel == null || (compatModel = textStickerModel.getCompatModel()) == null || (subTemplates = compatModel.getSubTemplates()) == null) {
                subTemplates = C13BV.INSTANCE;
            }
            int iLIZ = c384250F4t.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("drawSubTemplateBorders, currentSelectedId: ");
            sbLIZ.append(iLIZ);
            sbLIZ.append(" size: ");
            sbLIZ.append(subTemplates.size());
            sbLIZ.append(" subTemplates: ");
            sbLIZ.append(subTemplates);
            C0F8J.LIZ("inspiration-boundingbox", C2188811AlT.LIZIZ(sbLIZ));
            int width = getWidth();
            int height = getHeight();
            float currentScale = getCurrentScale();
            for (SubTemplateInfo subTemplateInfo : subTemplates) {
                Integer num = subTemplateInfo.id;
                if (num != null && num.intValue() == iLIZ && (rectFLIZJ = c384250F4t.LIZJ(currentScale, subTemplateInfo.id.intValue(), width, height)) != null && rectFLIZJ.width() > 0.0f && rectFLIZJ.height() > 0.0f) {
                    this.LLIZ.set(rectFLIZJ);
                    float strokeWidth2 = this.LLILZLL.getStrokeWidth() / 2;
                    this.LLIZ.inset(strokeWidth2, strokeWidth2);
                    if (this.LLIZ.width() > 0.0f && this.LLIZ.height() > 0.0f) {
                        canvas.drawRoundRect(this.LLIZ, getCornerRadius(), getCornerRadius(), this.LLILZLL);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        List<SubTemplateInfo> subTemplates;
        Integer num;
        int iIntValue;
        TextStickerCompatModel compatModel;
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        int iIntValue2 = 0;
        if (!this.LL.LJIL) {
            return false;
        }
        C384250F4t c384250F4t = this.LLILLL;
        if (c384250F4t == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float width = getWidth();
            float height = getHeight();
            float currentScale = getCurrentScale();
            TextStickerModel textStickerModel = c384250F4t.LIZJ;
            if (textStickerModel == null || (compatModel = textStickerModel.getCompatModel()) == null || (subTemplates = compatModel.getSubTemplates()) == null) {
                subTemplates = C13BV.INSTANCE;
            }
            Iterator<SubTemplateInfo> it2 = subTemplates.iterator();
            while (true) {
                if (it2.hasNext()) {
                    SubTemplateInfo next = it2.next();
                    Integer num2 = next.id;
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    RectF rectFLIZJ = c384250F4t.LIZJ(currentScale, iIntValue, (int) width, (int) height);
                    if (rectFLIZJ != null && rectFLIZJ.contains(x, y)) {
                        num = next.id;
                        break;
                    }
                } else {
                    num = null;
                    break;
                }
            }
            if (num != null) {
                if (this.LLIZLLLIL) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onTouch, click on sub bounding box in editing mode, id: ");
                    sbLIZ.append(num);
                    C0F8J.LIZ("inspiration-click", C2188811AlT.LIZIZ(sbLIZ));
                    int iIntValue3 = num.intValue();
                    if (c384250F4t.LIZ() != iIntValue3 && iIntValue3 >= 0) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("selection selectTemplate templateId: ");
                        sbLIZ2.append(iIntValue3);
                        C0F8J.LIZ("inspiration-boundingbox", C2188811AlT.LIZIZ(sbLIZ2));
                        c384250F4t.LIZ();
                        Integer numValueOf = Integer.valueOf(iIntValue3);
                        TextStickerModel textStickerModel2 = c384250F4t.LIZJ;
                        if (textStickerModel2 != null) {
                            TextStickerCompatModel compatModel2 = textStickerModel2.getCompatModel();
                            if (numValueOf != null) {
                                iIntValue2 = numValueOf.intValue();
                            }
                            textStickerModel2.setCompatModel(TextStickerCompatModel.copy$default(compatModel2, false, false, null, null, null, null, null, null, null, false, null, null, null, iIntValue2, null, 0.0f, null, null, null, null, null, 2088959, null));
                        }
                        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS73S0200000_4(c384250F4t, Integer.valueOf(iIntValue3), 49));
                    }
                    invalidate();
                    return true;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onTouch, click on sub bounding box in preview mode, id: ");
                sbLIZ3.append(num);
                C0F8J.LIZ("inspiration-click", C2188811AlT.LIZIZ(sbLIZ3));
                return true;
            }
            RectF rectFLIZIZ = c384250F4t.LIZIZ(currentScale, (int) width, (int) height);
            if (rectFLIZIZ != null && rectFLIZIZ.contains(x, y)) {
                C0F8J.LIZ("inspiration-click", "onTouch, click on main bounding box in editing mode");
                invalidate();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setSelectionManager(C384250F4t c384250F4t) {
        C384250F4t c384250F4t2 = this.LLILLL;
        if (c384250F4t2 != null) {
            c384250F4t2.LIZIZ.remove(this.LLJ);
        }
        this.LLILLL = c384250F4t;
        c384250F4t.LIZIZ.add(this.LLJ);
    }

    public C387070FFp(Context context, C388200FJy c388200FJy) {
        C387080FFq c387080FFq = new C387080FFq(context);
        super(context);
        this.LL = c388200FJy;
        this.LLILLJJLI = c387080FFq;
        setLayerType(1, null);
        Paint paint = new Paint();
        paint.setColor(c387080FFq.LIZ);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(c387080FFq.LIZIZ);
        paint.setAntiAlias(true);
        paint.setPathEffect(new DashPathEffect(c387080FFq.LJFF, 0.0f));
        if (c387080FFq.LJIIIZ) {
            paint.setShadowLayer(c387080FFq.LJIIJJI, 0.0f, c387080FFq.LJIIL, c387080FFq.LJIIJ);
        }
        this.LLILZ = paint;
        Paint paint2 = new Paint();
        paint2.setColor(c387080FFq.LIZJ);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(c387080FFq.LIZLLL);
        paint2.setAntiAlias(true);
        if (c387080FFq.LJIIIZ) {
            paint2.setShadowLayer(c387080FFq.LJIIJJI, 0.0f, c387080FFq.LJIIL, c387080FFq.LJIIJ);
        }
        this.LLILZIL = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(c387080FFq.LJI);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(c387080FFq.LJII);
        paint3.setAntiAlias(true);
        if (c387080FFq.LJIIIZ) {
            paint3.setShadowLayer(c387080FFq.LJIIJJI, 0.0f, c387080FFq.LJIIL, c387080FFq.LJIIJ);
        }
        this.LLILZLL = paint3;
        this.LLIZ = new RectF();
        this.LLJ = new AwS584S0100000_5(this, 1109);
    }
}
