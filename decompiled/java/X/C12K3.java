package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextBgConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextCoverConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextShadowConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextStrokeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12K3, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12K3 extends C21410318qb {
    public InnerEffectTextConfig LLIZ;
    public final Paint LLIZLLLIL;
    public final List<C1634100scq<InnerEffectTextCoverConfig, TextPaint, List<TextPaint>>> LLJ;
    public final List<TextPaint> LLJI;
    public final List<C1644460stY<InnerEffectTextBgConfig, Bitmap, NinePatch, Rect>> LLJIJIL;
    public final C444990Hcf LLJILJIL;
    public final C12KR LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public final C054G LLJJI;
    public final Paint.FontMetrics LLJJIII;

    public final InnerEffectTextConfig getInnerTextConfig() {
        return this.LLIZ;
    }

    public final int getMaxViewWidth() {
        return this.LLJJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIIZZ(Canvas canvas) {
        Layout layout;
        if (canvas != null && (layout = getLayout()) != null) {
            for (C1634100scq c1634100scq : (ArrayList) this.LLJ) {
                Iterator it2 = ((Iterable) c1634100scq.LIZJ).iterator();
                while (it2.hasNext()) {
                    C431870Gwb.LIZ(((InnerEffectTextCoverConfig) c1634100scq.LIZ).getOffsetX(), ((InnerEffectTextCoverConfig) c1634100scq.LIZ).getOffsetY(), canvas, C444990Hcf.LIZ(this.LLJILJIL, String.valueOf(C2204961BRm.LLZIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saov9yDsjZ/V3VE/TkVLuyhLN6DI8+OhRovjHXzNsxIxTquDB", null))), (TextPaint) it2.next(), layout.getWidth(), layout.getAlignment(), layout.getSpacingMultiplier(), layout.getSpacingAdd(), layout.getEllipsizedWidth()));
                }
                StaticLayout staticLayoutLIZ = C444990Hcf.LIZ(this.LLJILJIL, String.valueOf(C2204961BRm.LLZIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saov9yDsjZ/V3VE/TkVLuyhLN6DI8+OhRovjHXzNsxIxTquDB", null))), (TextPaint) c1634100scq.LIZIZ, layout.getWidth(), layout.getAlignment(), layout.getSpacingMultiplier(), layout.getSpacingAdd(), layout.getEllipsizedWidth());
                LJIIJ((TextPaint) c1634100scq.LIZIZ, ((InnerEffectTextCoverConfig) c1634100scq.LIZ).getTextColorStart(), ((InnerEffectTextCoverConfig) c1634100scq.LIZ).getTextColorEnd(), ((InnerEffectTextCoverConfig) c1634100scq.LIZ).getGradientType(), ((InnerEffectTextCoverConfig) c1634100scq.LIZ).getGradientOrientation(), staticLayoutLIZ.getWidth(), staticLayoutLIZ.getHeight());
                C431870Gwb.LIZ(((InnerEffectTextCoverConfig) c1634100scq.LIZ).getOffsetX(), ((InnerEffectTextCoverConfig) c1634100scq.LIZ).getOffsetY(), canvas, staticLayoutLIZ);
            }
        }
    }

    public final void LJIIIZ(Canvas canvas) {
        Layout layout;
        if (canvas != null && (layout = getLayout()) != null) {
            Iterator it2 = ((ArrayList) this.LLJI).iterator();
            while (it2.hasNext()) {
                C431870Gwb.LIZ(0.0f, 0.0f, canvas, C444990Hcf.LIZ(this.LLJILJIL, String.valueOf(C2204961BRm.LLZIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saov9yDsjZ/V3VE/TkVLuyhLN6DI8+OhRovjHXzNsxIxTquDB", null))), (TextPaint) it2.next(), layout.getWidth(), layout.getAlignment(), layout.getSpacingMultiplier(), layout.getSpacingAdd(), layout.getEllipsizedWidth()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Layout layout;
        if (this.LLIZ != null) {
            if (canvas != null) {
                for (C1644460stY c1644460stY : (ArrayList) this.LLJIJIL) {
                    NinePatch ninePatch = (NinePatch) c1644460stY.LIZJ;
                    if (ninePatch != null) {
                        ninePatch.draw(canvas, (Rect) c1644460stY.LIZLLL);
                    } else {
                        canvas.drawBitmap((Bitmap) c1644460stY.LIZIZ, (Rect) null, (Rect) c1644460stY.LIZLLL, this.LLIZLLLIL);
                    }
                }
            }
            getPaint().getFontMetrics(this.LLJJIII);
            if (canvas != null) {
                float paddingLeft = getPaddingLeft();
                float baseline = getBaseline() + this.LLJJIII.top;
                int iSave = canvas.save();
                canvas.translate(paddingLeft, baseline);
                try {
                    LJIIIIZZ(canvas);
                    LJIIIZ(canvas);
                    canvas.restoreToCount(iSave);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    canvas.restoreToCount(iSave);
                    throw th;
                }
            }
        }
        InnerEffectTextConfig innerEffectTextConfig = this.LLIZ;
        if (innerEffectTextConfig != null && innerEffectTextConfig.getGradientType() != C12KA.NONE && (layout = getLayout()) != null) {
            LJIIJ(getPaint(), innerEffectTextConfig.getTextColorStart(), innerEffectTextConfig.getTextColorEnd(), innerEffectTextConfig.getGradientType(), innerEffectTextConfig.getGradientOrientation(), layout.getWidth(), layout.getHeight());
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setInnerTextConfig(InnerEffectTextConfig innerEffectTextConfig) {
        List<InnerEffectTextStrokeConfig> strokeConfigs;
        List<InnerEffectTextCoverConfig> coverConfigs;
        String second;
        if (!Intrinsics.LJFF(this.LLIZ, innerEffectTextConfig)) {
            this.LLIZ = innerEffectTextConfig;
            this.LLJILLL = 1;
            getPaint().setTextSize(C0GTQ.LIZ(28.0f, getContext()));
            getPaint().setTypeface(null);
            getPaint().setStyle(Paint.Style.FILL);
            setTextColor(0);
            setPadding(0, 0, 0, 0);
            C14K9.LJJ(this, 0.0f);
            setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            setLineSpacing(0.0f, 1.0f);
            setLetterSpacing(0.0f);
            setBackground(null);
            setGravity(17);
            setHint(" ");
            setMinWidth(0);
            setMinHeight(0);
            ((ArrayList) this.LLJ).clear();
            ((ArrayList) this.LLJI).clear();
            Iterator it2 = ((ArrayList) this.LLJIJIL).iterator();
            while (it2.hasNext()) {
                C786410Ut5.LJJJJ((Bitmap) ((C1644460stY) it2.next()).LIZIZ);
            }
            ((ArrayList) this.LLJIJIL).clear();
            InnerEffectTextConfig innerEffectTextConfig2 = this.LLIZ;
            if (innerEffectTextConfig2 != null) {
                this.LLJILLL = innerEffectTextConfig2.getMaxLine();
                getPaint().setTextSize(innerEffectTextConfig2.getTextSize());
                try {
                    Pair<String, String> typefacePath = innerEffectTextConfig2.getTypefacePath();
                    if (typefacePath != null) {
                        second = typefacePath.getSecond();
                    } else {
                        second = null;
                    }
                    getPaint().setTypeface(C786410Ut5.x4(second));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C122D c122dLIZIZ = C123O.LIZIZ();
                    if (c122dLIZIZ != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("EffectEditText --- ");
                        sbLIZ.append(Log.getStackTraceString(e));
                        c122dLIZIZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                getPaint().setStyle(innerEffectTextConfig2.getPaintStyle());
                if (innerEffectTextConfig2.getGradientType() == C12KA.NONE) {
                    setTextColor(innerEffectTextConfig2.getTextColorStart());
                }
                setPadding(innerEffectTextConfig2.getPaddingStart(), innerEffectTextConfig2.getPaddingTop(), innerEffectTextConfig2.getPaddingEnd(), innerEffectTextConfig2.getPaddingBottom());
                C14K9.LJJ(this, innerEffectTextConfig2.getLayerWeight());
                InnerEffectTextShadowConfig shadowConfig = innerEffectTextConfig2.getShadowConfig();
                if (shadowConfig != null) {
                    setShadowLayer(shadowConfig.getRadius(), shadowConfig.getOffsetX(), shadowConfig.getOffsetY(), shadowConfig.getColor());
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    setFallbackLineSpacing(false);
                }
                setLineSpacing(innerEffectTextConfig2.getSpacingAdd(), innerEffectTextConfig2.getSpacingMult());
                setLetterSpacing(innerEffectTextConfig2.getSpacingLetter());
                setBackground(null);
                setGravity(innerEffectTextConfig2.getGravity());
                setHint(" ");
                setHintTextColor(innerEffectTextConfig2.getReplaceStringColor());
                setMinWidth(innerEffectTextConfig2.getMinWidth());
                setMinHeight(innerEffectTextConfig2.getMinHeight());
            }
            InnerEffectTextConfig innerEffectTextConfig3 = this.LLIZ;
            if (innerEffectTextConfig3 != null && (coverConfigs = innerEffectTextConfig3.getCoverConfigs()) != null) {
                for (InnerEffectTextCoverConfig innerEffectTextCoverConfig : coverConfigs) {
                    TextPaint textPaint = new TextPaint();
                    textPaint.set(getPaint());
                    textPaint.setStyle(innerEffectTextCoverConfig.getPaintStyle());
                    InnerEffectTextShadowConfig shadowConfig2 = innerEffectTextCoverConfig.getShadowConfig();
                    if (shadowConfig2 != null) {
                        textPaint.setShadowLayer(shadowConfig2.getRadius(), shadowConfig2.getOffsetX(), shadowConfig2.getOffsetY(), shadowConfig2.getColor());
                    }
                    ArrayList arrayList = new ArrayList();
                    for (InnerEffectTextStrokeConfig innerEffectTextStrokeConfig : innerEffectTextCoverConfig.getStrokeConfigs()) {
                        TextPaint textPaint2 = new TextPaint();
                        textPaint2.set(textPaint);
                        textPaint2.setStrokeWidth(innerEffectTextStrokeConfig.getStrokeWidth() * 2);
                        textPaint2.setColor(innerEffectTextStrokeConfig.getStrokeColor());
                        textPaint2.setStrokeJoin(innerEffectTextStrokeConfig.getStrokeJoin());
                        textPaint2.setStyle(Paint.Style.STROKE);
                        arrayList.add(textPaint2);
                    }
                    ((ArrayList) this.LLJ).add(new C1634100scq(innerEffectTextCoverConfig, textPaint, arrayList));
                }
            }
            InnerEffectTextConfig innerEffectTextConfig4 = this.LLIZ;
            if (innerEffectTextConfig4 != null && (strokeConfigs = innerEffectTextConfig4.getStrokeConfigs()) != null) {
                for (InnerEffectTextStrokeConfig innerEffectTextStrokeConfig2 : strokeConfigs) {
                    TextPaint textPaint3 = new TextPaint();
                    textPaint3.set(getPaint());
                    textPaint3.setStrokeWidth(innerEffectTextStrokeConfig2.getStrokeWidth() * 2);
                    textPaint3.setColor(innerEffectTextStrokeConfig2.getStrokeColor());
                    textPaint3.setStrokeJoin(innerEffectTextStrokeConfig2.getStrokeJoin());
                    textPaint3.setStyle(Paint.Style.STROKE);
                    ((ArrayList) this.LLJI).add(textPaint3);
                }
            }
            C23250099c.LIZLLL(this.LLJJI, null, null, new C858950Xmn(this, null), 3);
            requestLayout();
        }
    }

    public final void setMaxViewWidth(int i) {
        if (i > 0) {
            this.LLJJ = i;
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        if (i > 0) {
            super.setMaxWidth(i);
        }
    }

    public final void setTextColor(boolean z) {
        InnerEffectTextConfig innerEffectTextConfig = this.LLIZ;
        if (innerEffectTextConfig != null) {
            if (z) {
                setTextColor(innerEffectTextConfig.getReplaceStringColor());
            } else {
                if (innerEffectTextConfig.getGradientType() != C12KA.NONE) {
                    return;
                }
                setTextColor(innerEffectTextConfig.getTextColorStart());
            }
        }
    }

    public C12K3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLIZLLLIL = new Paint(3);
        this.LLJ = new ArrayList();
        this.LLJI = new ArrayList();
        this.LLJIJIL = new ArrayList();
        this.LLJILJIL = new C444990Hcf();
        this.LLJILJILJ = new C12KR();
        this.LLJILLL = 1;
        this.LLJJ = getMaxWidth();
        this.LLJJI = C19567211h0.LIZ();
        addTextChangedListener(new C19773412Ya(this, 13));
        this.LLJJIII = new Paint.FontMetrics();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ab  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12K3.onMeasure(int, int):void");
    }

    public final void LJIIJ(TextPaint textPaint, int i, int i2, C12KA c12ka, C12KE c12ke, int i3, int i4) {
        int i5 = C12KD.LIZIZ[c12ka.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                textPaint.setColor(i);
                return;
            }
            throw new C1954807lC();
        }
        int i6 = C12KD.LIZ[c12ke.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                textPaint.setShader(this.LLJILJILJ.LIZ(i, i2, i3, 0));
                return;
            }
            throw new C1954807lC();
        }
        textPaint.setShader(this.LLJILJILJ.LIZ(i, i2, 0, i4));
    }
}
