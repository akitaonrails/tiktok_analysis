package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LineBackgroundSpan;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.HolidayModel;
import com.ss.android.ugc.aweme.comment.model.Keyword;
import com.ss.android.ugc.aweme.comment.widgets.CommentLinkProductSpan;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0lK2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1353360lK2 extends C1353650lKV {
    public static final /* synthetic */ int LLLLL = 0;
    public InterfaceC1353430lK9 LLLIZZ;
    public InterfaceC1340320kz0 LLLJ;
    public InterfaceC1353430lK9 LLLJIL;
    public C1347880lBC LLLJL;
    public float LLLL;
    public int LLLLII;
    public int LLLLIIIILLL;
    public float LLLLIIL;
    public int LLLLIILL;
    public TuxIconDrawable LLLLIILLL;
    public AbstractC1353420lK8 LLLLIL;
    public CommentLinkProductSpan LLLLILI;
    public HolidayModel LLLLJ;
    public float LLLLJI;

    public final void setSearchSpanStyle(int i) {
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean hasOverlappingRendering() {
        C01GW c01gw = C294210Bg3.LIZ;
        if (((Number) c01gw.getValue()).intValue() == 2 || ((Number) c01gw.getValue()).intValue() == 3) {
            return false;
        }
        return super.hasOverlappingRendering();
    }

    private final CharSequence getCommentText() {
        return getOriginalText().length() == 0 ? getText() : getOriginalText();
    }

    @Override // android.view.View
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LIZ(e);
            return null;
        }
    }

    public final int getDesiredHeight() {
        Layout layout = getLayout();
        return layout == null ? getHeight() : layout.getLineTop(getLineCount()) + getCompoundPaddingBottom() + getCompoundPaddingStart();
    }

    public final float getLastScrollY() {
        return this.LLLLJI;
    }

    public final int getMentionSpanColor() {
        return this.LLLLIIIILLL;
    }

    public final int getMentionTuxFont() {
        return this.LLLLIILL;
    }

    public final float getPressAlpha() {
        return this.LLLLIIL;
    }

    public final TuxIconDrawable getSearchIconDrawable() {
        return this.LLLLIILLL;
    }

    public final int getSearchSpanColor() {
        return this.LLLLII;
    }

    public final float getSpanSize() {
        return this.LLLL;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CommentLinkProductSpan commentLinkProductSpan;
        AbstractC1353420lK8 abstractC1353420lK8;
        String productSchema;
        TextExtraStruct textExtraStructLIZ;
        String productSchema2;
        TextExtraStruct textExtraStructLIZ2;
        String productSchema3;
        boolean z;
        try {
            super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LIZ(e);
        }
        if (getDesiredHeight() > getHeight()) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 2) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else {
                    float y = this.LLLLJI - motionEvent.getY();
                    if (y > 0.0f) {
                        if ((getDesiredHeight() - getHeight()) - getScrollY() <= 8) {
                            z = true;
                        } else {
                            z = false;
                        }
                        getParent().requestDisallowInterceptTouchEvent(!z);
                    } else if (y < 0.0f) {
                        if (getScrollY() == 0) {
                            getParent().requestDisallowInterceptTouchEvent(false);
                        } else {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    this.LLLLJI = motionEvent.getY();
                }
            } else {
                this.LLLLJI = motionEvent.getY();
            }
        }
        int action2 = motionEvent.getAction();
        String productSchema4 = null;
        if (action2 != 0) {
            if (action2 != 1) {
                if (action2 != 2) {
                    if (action2 != 3) {
                        return false;
                    }
                    AbstractC1353420lK8 abstractC1353420lK82 = this.LLLLIL;
                    if (abstractC1353420lK82 != null) {
                        abstractC1353420lK82.LL = false;
                        this.LLLLIL = null;
                        invalidate();
                    }
                    CommentLinkProductSpan commentLinkProductSpan2 = this.LLLLILI;
                    if (commentLinkProductSpan2 != null) {
                        TextExtraStruct textExtraStructLIZ3 = commentLinkProductSpan2.LIZ();
                        if (textExtraStructLIZ3 != null) {
                            productSchema3 = textExtraStructLIZ3.getProductSchema();
                        } else {
                            productSchema3 = null;
                        }
                        if (!TextUtils.isEmpty(productSchema3)) {
                            CommentLinkProductSpan commentLinkProductSpan3 = this.LLLLILI;
                            if (commentLinkProductSpan3 != null) {
                                commentLinkProductSpan3.LIZLLL(false);
                            }
                            this.LLLLILI = null;
                            invalidate();
                        }
                    }
                    return false;
                }
                AbstractC1353420lK8 abstractC1353420lK83 = this.LLLLIL;
                if (abstractC1353420lK83 != null && abstractC1353420lK83 != LJJLI(motionEvent, AbstractC1353420lK8.class)) {
                    AbstractC1353420lK8 abstractC1353420lK84 = this.LLLLIL;
                    if (abstractC1353420lK84 != null) {
                        abstractC1353420lK84.LL = false;
                    }
                    this.LLLLIL = null;
                    invalidate();
                }
                CommentLinkProductSpan commentLinkProductSpan4 = this.LLLLILI;
                if (commentLinkProductSpan4 != null && commentLinkProductSpan4 != LJJLI(motionEvent, CommentLinkProductSpan.class)) {
                    CommentLinkProductSpan commentLinkProductSpan5 = this.LLLLILI;
                    if (commentLinkProductSpan5 != null && (textExtraStructLIZ2 = commentLinkProductSpan5.LIZ()) != null) {
                        productSchema2 = textExtraStructLIZ2.getProductSchema();
                    } else {
                        productSchema2 = null;
                    }
                    if (!TextUtils.isEmpty(productSchema2)) {
                        CommentLinkProductSpan commentLinkProductSpan6 = this.LLLLILI;
                        if (commentLinkProductSpan6 != null) {
                            commentLinkProductSpan6.LIZLLL(false);
                        }
                        this.LLLLILI = null;
                        invalidate();
                    }
                }
                return false;
            }
            AbstractC1353420lK8 abstractC1353420lK85 = this.LLLLIL;
            if (abstractC1353420lK85 != null && abstractC1353420lK85 == LJJLI(motionEvent, AbstractC1353420lK8.class)) {
                AbstractC1353420lK8 abstractC1353420lK86 = this.LLLLIL;
                if (abstractC1353420lK86 != null) {
                    abstractC1353420lK86.LL = false;
                }
                this.LLLLIL = null;
                invalidate();
                return true;
            }
            CommentLinkProductSpan commentLinkProductSpan7 = this.LLLLILI;
            if (commentLinkProductSpan7 != null && commentLinkProductSpan7 == LJJLI(motionEvent, CommentLinkProductSpan.class)) {
                CommentLinkProductSpan commentLinkProductSpan8 = this.LLLLILI;
                if (commentLinkProductSpan8 != null && (textExtraStructLIZ = commentLinkProductSpan8.LIZ()) != null) {
                    productSchema = textExtraStructLIZ.getProductSchema();
                } else {
                    productSchema = null;
                }
                if (!TextUtils.isEmpty(productSchema)) {
                    CommentLinkProductSpan commentLinkProductSpan9 = this.LLLLILI;
                    if (commentLinkProductSpan9 != null) {
                        commentLinkProductSpan9.LIZLLL(false);
                    }
                    this.LLLLILI = null;
                    invalidate();
                }
            }
            return false;
        }
        Object objLJJLI = LJJLI(motionEvent, AbstractC1353420lK8.class);
        if ((objLJJLI instanceof AbstractC1353420lK8) && (abstractC1353420lK8 = (AbstractC1353420lK8) objLJJLI) != null) {
            abstractC1353420lK8.LL = true;
            this.LLLLIL = abstractC1353420lK8;
            invalidate();
            return true;
        }
        Object objLJJLI2 = LJJLI(motionEvent, CommentLinkProductSpan.class);
        if ((objLJJLI2 instanceof CommentLinkProductSpan) && (commentLinkProductSpan = (CommentLinkProductSpan) objLJJLI2) != null) {
            TextExtraStruct textExtraStructLIZ4 = commentLinkProductSpan.LIZ();
            if (textExtraStructLIZ4 != null) {
                productSchema4 = textExtraStructLIZ4.getProductSchema();
            }
            if (!TextUtils.isEmpty(productSchema4)) {
                commentLinkProductSpan.LIZLLL(true);
                commentLinkProductSpan.LIZJ();
                this.LLLLILI = commentLinkProductSpan;
                invalidate();
                return true;
            }
        }
        if (LJJLI(motionEvent, ClickableSpan.class) != null) {
            return true;
        }
        return false;
    }

    public final void setCommentTuxFont(int i) {
        Field field;
        Field field2;
        float fFloatValue;
        setTuxFont(i);
        if (C1345000l6Y.LIZ(this) && (field = (Field) C1345000l6Y.LIZIZ.getValue()) != null && (field2 = (Field) C1345000l6Y.LIZJ.getValue()) != null) {
            Float f = C1345000l6Y.LIZ.get(Integer.valueOf(i / 10));
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 1.3f;
            }
            int iLIZIZ = C814420VxA.LIZIZ(getTextSize());
            int iLIZIZ2 = C814420VxA.LIZIZ(getTextSize() * fFloatValue);
            try {
                field.setInt(this, iLIZIZ);
                field2.setInt(this, iLIZIZ2);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public final void setHolidayModel(HolidayModel holidayModel) {
        this.LLLLJ = holidayModel;
    }

    public final void setLastScrollY(float f) {
        this.LLLLJI = f;
    }

    public final void setLinkProductSpanClickListener(InterfaceC1340320kz0 interfaceC1340320kz0) {
        this.LLLJ = interfaceC1340320kz0;
    }

    public final void setMentionSpanColor(int i) {
        this.LLLLIIIILLL = i;
    }

    public final void setMentionSpanStyle(int i) {
        if (i != 0) {
            if (i == 1) {
                this.LLLLIILL = 12;
                return;
            }
            return;
        }
        this.LLLLIILL = 11;
    }

    public final void setMentionTuxFont(int i) {
        this.LLLLIILL = i;
    }

    public final void setOnSpanClickListener(InterfaceC1353430lK9 interfaceC1353430lK9) {
        this.LLLIZZ = interfaceC1353430lK9;
    }

    public final void setPressAlpha(float f) {
        this.LLLLIIL = f;
    }

    public final void setSearchIconDrawable(TuxIconDrawable tuxIconDrawable) {
        this.LLLLIILLL = tuxIconDrawable;
    }

    public final void setSearchOnSpanClickListener(InterfaceC1353430lK9 interfaceC1353430lK9) {
        if (!C1350950lG9.LIZIZ.enableShare()) {
            return;
        }
        this.LLLJIL = interfaceC1353430lK9;
    }

    public final void setSearchSpanColor(int i) {
        this.LLLLII = i;
    }

    public final void setSpanSize(float f) {
        this.LLLL = f;
    }

    public final void setTextExtraList(List<? extends TextExtraStruct> list) {
        setText(LJJLIIIJILLIZJL(getText(), list));
    }

    public C1353360lK2(Context context, AttributeSet attributeSet) {
        Object c098200Yq;
        super(context, attributeSet, 0);
        this.LLLLIILL = 12;
        this.LLLL = getTextSize();
        this.LLLLIIIILLL = -1;
        setHighlightColor(0);
        this.LLLLIIL = 0.2f;
        if (C1345000l6Y.LIZ(this)) {
            if (attributeSet != null) {
                try {
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxTextView, 0, 0);
                    try {
                        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxTextView_tux_font, 0);
                        typedArrayObtainStyledAttributes.recycle();
                        c098200Yq = Integer.valueOf(i);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        typedArrayObtainStyledAttributes.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Integer num = (Integer) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
                if (num != null) {
                    setCommentTuxFont(num.intValue());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLI(android.view.MotionEvent r16, java.lang.Class<? extends java.lang.Object> r17) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1353360lK2.LJJLI(android.view.MotionEvent, java.lang.Class):java.lang.Object");
    }

    public final SpannableString LJJLIIIJILLIZJL(CharSequence charSequence, List list) {
        boolean z;
        int start;
        int end;
        final int iIntValue;
        Integer numValueOf;
        int iIntValue2;
        int i;
        boolean z2;
        final Integer numValueOf2;
        final Typeface typeface;
        boolean z3;
        boolean z4;
        int color;
        CharSequence charSequenceLJJIFFI = charSequence;
        SpannableString spannableString = new SpannableString(charSequenceLJJIFFI);
        HolidayModel holidayModel = this.LLLLJ;
        if (holidayModel != null) {
            Boolean bool = holidayModel.caseSensitive;
            Boolean bool2 = Boolean.TRUE;
            if (!Intrinsics.LJFF(bool, bool2)) {
                charSequenceLJJIFFI = charSequenceLJJIFFI.toString().toLowerCase(Locale.ROOT);
            }
            Map mapLIZIZ = C1351750lHR.LIZIZ(charSequenceLJJIFFI, Intrinsics.LJFF(holidayModel.spaceSensitive, bool2));
            List listLIZ = C1351750lHR.LIZ(list, mapLIZIZ);
            if (!Intrinsics.LJFF(holidayModel.spaceSensitive, bool2)) {
                charSequenceLJJIFFI = u.LJJIFFI(charSequenceLJJIFFI.toString(), " ", "", false);
            }
            C443120HZe c443120HZeLIZJ = C1351750lHR.LIZJ(charSequenceLJJIFFI, holidayModel.keywords, listLIZ, mapLIZIZ, Intrinsics.LJFF(holidayModel.caseSensitive, bool2), Intrinsics.LJFF(holidayModel.spaceSensitive, bool2));
            if (c443120HZeLIZJ != null) {
                C1741890vQh.LJIIIIZZ(c443120HZeLIZJ).getClass();
            }
            if (c443120HZeLIZJ != null && getContext() != null) {
                final Typeface typeface2 = null;
                try {
                    Context context = getContext();
                    if (context == null || !C960203pA.LIZIZ(context)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (!z4) {
                        color = Color.parseColor(holidayModel.textColorLight);
                    } else {
                        color = Color.parseColor(holidayModel.textColorDark);
                    }
                    numValueOf2 = Integer.valueOf(color);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    numValueOf2 = null;
                }
                String str = ((Keyword) c443120HZeLIZJ.getThird()).font;
                if (str == null) {
                    typeface = null;
                } else {
                    typeface = (Typeface) ((ConcurrentHashMap) C0O52.LIZ.getValue()).get(str);
                }
                final Float fValueOf = Float.valueOf(C418440Gaw.LJ(16));
                C786410Ut5.p2(spannableString, new MetricAffectingSpan(typeface, fValueOf, numValueOf2) { // from class: X.0Hcd
                    public final Typeface LL;
                    public final Float LLILLJJLI;
                    public final Integer LLILLL;

                    public final void LIZ(TextPaint textPaint) {
                        Typeface typeface3 = this.LL;
                        if (typeface3 != null) {
                            textPaint.setTypeface(typeface3);
                        }
                        Float f = this.LLILLJJLI;
                        if (f != null) {
                            textPaint.setTextSize(f.floatValue());
                        }
                        Integer num = this.LLILLL;
                        if (num != null) {
                            textPaint.setColor(num.intValue());
                        }
                    }

                    @Override // android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        if (textPaint != null) {
                            LIZ(textPaint);
                        }
                    }

                    @Override // android.text.style.MetricAffectingSpan
                    public final void updateMeasureState(TextPaint textPaint) {
                        LIZ(textPaint);
                    }

                    {
                        this.LL = typeface;
                        this.LLILLJJLI = fValueOf;
                        this.LLILLL = numValueOf2;
                    }
                }, ((Number) c443120HZeLIZJ.getFirst()).intValue(), ((Number) c443120HZeLIZJ.getSecond()).intValue(), 33);
                if (C0O52.LIZIZ != null && C123100dR.LIZ(((Keyword) c443120HZeLIZJ.getThird()).content)) {
                    C258660ABs.LIZ.getClass();
                    if (((Number) C258660ABs.LIZIZ.getValue()).intValue() == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        String str2 = ((Keyword) c443120HZeLIZJ.getThird()).font;
                        if (str2 != null) {
                            typeface2 = (Typeface) ((ConcurrentHashMap) C0O52.LIZ.getValue()).get(str2);
                        }
                        final Float fValueOf2 = Float.valueOf(C418440Gaw.LJ(16));
                        final Bitmap bitmap = C0O52.LIZIZ;
                        final int iIntValue3 = ((Number) c443120HZeLIZJ.getFirst()).intValue();
                        final int iIntValue4 = ((Number) c443120HZeLIZJ.getSecond()).intValue();
                        final String string = spannableString.toString();
                        C786410Ut5.p2(spannableString, new LineBackgroundSpan(typeface2, fValueOf2, bitmap, iIntValue3, iIntValue4, this, string) { // from class: X.0GYs
                            public final Typeface LL;
                            public final Float LLILLJJLI;
                            public final Bitmap LLILLL;
                            public final int LLILZ;
                            public final int LLILZIL;
                            public final TextView LLILZLL;
                            public final String LLIZ;
                            public float LLIZLLLIL;

                            {
                                this.LL = typeface2;
                                this.LLILLJJLI = fValueOf2;
                                this.LLILLL = bitmap;
                                this.LLILZ = iIntValue3;
                                this.LLILZIL = iIntValue4;
                                this.LLILZLL = this;
                                this.LLIZ = string;
                            }

                            @Override // android.text.style.LineBackgroundSpan
                            public final void drawBackground(Canvas canvas, Paint paint, int i2, int i3, int i4, int i5, int i6, CharSequence charSequence2, int i7, int i8, int i9) {
                                Bitmap bitmap2;
                                int i10;
                                Layout layout;
                                if (this.LLIZ != null && (bitmap2 = this.LLILLL) != null && i7 < this.LLILZIL && i8 > (i10 = this.LLILZ)) {
                                    if (i10 >= i7 && i10 <= i8 - 1) {
                                        this.LLIZLLLIL = 0.0f;
                                    }
                                    Paint paint2 = new Paint(paint);
                                    Typeface typeface3 = this.LL;
                                    if (typeface3 != null) {
                                        paint2.setTypeface(typeface3);
                                    }
                                    Float f = this.LLILLJJLI;
                                    if (f != null) {
                                        paint2.setTextSize(f.floatValue());
                                    }
                                    TextView textView = this.LLILZLL;
                                    if (textView != null && (layout = textView.getLayout()) != null) {
                                        int i11 = i6 - i4;
                                        float height = i11 / bitmap2.getHeight();
                                        int iMax = Math.max(this.LLILZ, i7);
                                        int iMin = Math.min(this.LLILZIL, i8) - 1;
                                        String strLIZIZ = "";
                                        if (iMax <= iMin) {
                                            for (int i12 = iMax; charSequence2.charAt(i12) == this.LLIZ.charAt(i12); i12++) {
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append(strLIZIZ);
                                                sbLIZ.append(charSequence2.charAt(i12));
                                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                                if (i12 == iMin) {
                                                    break;
                                                }
                                            }
                                        }
                                        if (strLIZIZ.length() == 0) {
                                            return;
                                        }
                                        int length = strLIZIZ.length() + iMax;
                                        int primaryHorizontal = (int) layout.getPrimaryHorizontal(iMax);
                                        float fMeasureText = paint2.measureText(charSequence2, iMax, length) / height;
                                        int i13 = (int) fMeasureText;
                                        if (((int) this.LLIZLLLIL) + Math.min(i13, bitmap2.getWidth()) > bitmap2.getWidth() || Math.min(i13, bitmap2.getWidth()) <= 0) {
                                            return;
                                        }
                                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, (int) this.LLIZLLLIL, 0, Math.min(i13, bitmap2.getWidth()), bitmap2.getHeight());
                                        this.LLIZLLLIL = fMeasureText;
                                        canvas.drawBitmap(Bitmap.createScaledBitmap(bitmapCreateBitmap, (int) paint2.measureText(charSequence2, iMax, length), i11, true), primaryHorizontal, i4, paint2);
                                    }
                                }
                            }
                        }, ((Number) c443120HZeLIZJ.getFirst()).intValue(), ((Number) c443120HZeLIZJ.getSecond()).intValue(), 33);
                    }
                }
            }
        }
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!z && !TextUtils.isEmpty(spannableString.toString())) {
            int length = spannableString.length();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                final TextExtraStruct textExtraStruct = (TextExtraStruct) it2.next();
                if (textExtraStruct.getStart() <= textExtraStruct.getEnd() && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() >= 0) {
                    if (textExtraStruct.getStart() < 0) {
                        start = 0;
                    } else {
                        start = textExtraStruct.getStart();
                    }
                    if (textExtraStruct.getEnd() > length) {
                        end = length;
                    } else {
                        end = textExtraStruct.getEnd();
                    }
                    if (end > start) {
                        int type = textExtraStruct.getType();
                        if (type != 0) {
                            if (type != 6) {
                                if (type != 8) {
                                    if (type != 9) {
                                        switch (type) {
                                            case 65281:
                                                Object customSpan = textExtraStruct.getCustomSpan();
                                                if (customSpan != null) {
                                                    C786410Ut5.p2(spannableString, customSpan, start, end, 33);
                                                }
                                                break;
                                            case 65282:
                                                final InterfaceC1353430lK9 interfaceC1353430lK9 = this.LLLIZZ;
                                                final int color2 = textExtraStruct.getColor();
                                                C786410Ut5.p2(spannableString, new AbstractC1353420lK8(interfaceC1353430lK9, textExtraStruct, color2) { // from class: X.0lK5
                                                    public final InterfaceC1353430lK9 LLILLL;
                                                    public final TextExtraStruct LLILZ;
                                                    public final int LLILZIL;
                                                    public final boolean LLILZLL;

                                                    @Override // android.text.style.ClickableSpan
                                                    public final void onClick(View view) {
                                                        InterfaceC1353430lK9 interfaceC1353430lK92;
                                                        if (!C0OBG.LIZIZ(view) && (interfaceC1353430lK92 = this.LLILLL) != null) {
                                                            interfaceC1353430lK92.LIZ(view, this.LLILZ);
                                                        }
                                                    }

                                                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                                    public final void updateDrawState(TextPaint textPaint) {
                                                        int iLIZ = this.LLILZIL;
                                                        if (iLIZ == 0) {
                                                            iLIZ = textPaint.linkColor;
                                                        }
                                                        if (this.LL) {
                                                            iLIZ = C1353410lK7.LIZ(this.LLIZ.getPressAlpha(), iLIZ);
                                                        }
                                                        textPaint.setColor(iLIZ);
                                                        textPaint.setUnderlineText(false);
                                                        if (this.LLILZLL) {
                                                            C444890HcV c444890HcV = new C444890HcV();
                                                            c444890HcV.LIZ(82);
                                                            textPaint.setTypeface(c444890HcV.getTypeface());
                                                        } else {
                                                            C444890HcV c444890HcV2 = new C444890HcV();
                                                            c444890HcV2.LIZ(81);
                                                            textPaint.setTypeface(c444890HcV2.getTypeface());
                                                        }
                                                    }

                                                    {
                                                        this.LLILLL = interfaceC1353430lK9;
                                                        this.LLILZ = textExtraStruct;
                                                        this.LLILZIL = color2;
                                                        this.LLILZLL = textExtraStruct.isBoldText();
                                                    }
                                                }, start, end, 33);
                                                break;
                                        }
                                    } else {
                                        int i2 = start + 1;
                                        if (i2 > end) {
                                            i2 = end;
                                        }
                                        C426550Go1.LIZIZ(getContext(), spannableString, start, i2);
                                        getContext();
                                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, getContext());
                                        if (numLIZJ != null) {
                                            iIntValue = numLIZJ.intValue();
                                        } else {
                                            iIntValue = -16776961;
                                        }
                                        final C1347880lBC c1347880lBC = this.LLLJL;
                                        AbstractC1353420lK8 abstractC1353420lK8 = new AbstractC1353420lK8(textExtraStruct, iIntValue, c1347880lBC) { // from class: X.0lK3
                                            public final TextExtraStruct LLILLL;
                                            public final float LLILZ = 0.2f;
                                            public final int LLILZIL;
                                            public final InterfaceC1353430lK9 LLILZLL;

                                            @Override // android.text.style.ClickableSpan
                                            public final void onClick(View view) {
                                                InterfaceC1353430lK9 interfaceC1353430lK92;
                                                if (!C0OBG.LIZIZ(view) && this.LLILLL.getType() == 9 && (interfaceC1353430lK92 = this.LLILZLL) != null) {
                                                    interfaceC1353430lK92.LIZ(view, this.LLILLL);
                                                }
                                            }

                                            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                            public final void updateDrawState(TextPaint textPaint) {
                                                int iLIZ = this.LLILZIL;
                                                if (this.LL) {
                                                    iLIZ = C1353410lK7.LIZ(this.LLILZ, iLIZ);
                                                }
                                                textPaint.setColor(iLIZ);
                                                textPaint.setUnderlineText(false);
                                            }

                                            {
                                                this.LLILLL = textExtraStruct;
                                                this.LLILZIL = iIntValue;
                                                this.LLILZLL = c1347880lBC;
                                            }
                                        };
                                        abstractC1353420lK8.LLILLJJLI = true;
                                        C786410Ut5.p2(spannableString, abstractC1353420lK8, start, end, 33);
                                    }
                                } else {
                                    C419910GdJ c419910GdJ = new C419910GdJ();
                                    c419910GdJ.LIZ = R.raw.icon_bag;
                                    c419910GdJ.LIZJ = C0HD5.LIZ(this, 16);
                                    c419910GdJ.LIZIZ = C0HD5.LIZ(this, 16);
                                    if (TextUtils.isEmpty(textExtraStruct.getProductSchema())) {
                                        numValueOf = Integer.valueOf(R.attr.a1h);
                                    } else {
                                        numValueOf = Integer.valueOf(R.attr.ba);
                                    }
                                    c419910GdJ.LJ = numValueOf;
                                    C0GXG c0gxg = new C0GXG(c419910GdJ.LIZ(getContext()));
                                    int iLIZ = C0HD5.LIZ(this, 8);
                                    int iLIZ2 = C0HD5.LIZ(this, 8);
                                    c0gxg.LLILZLL = iLIZ;
                                    c0gxg.LLIZ = iLIZ2;
                                    C786410Ut5.p2(spannableString, c0gxg, start, start + 1, 33);
                                    if (TextUtils.isEmpty(textExtraStruct.getProductSchema())) {
                                        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, getContext());
                                        if (numLIZJ2 != null) {
                                            iIntValue2 = numLIZJ2.intValue();
                                        } else {
                                            iIntValue2 = -16777216;
                                        }
                                    } else {
                                        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ba, getContext());
                                        if (numLIZJ3 != null) {
                                            iIntValue2 = numLIZJ3.intValue();
                                        } else {
                                            iIntValue2 = -16776961;
                                        }
                                    }
                                    CommentLinkProductSpan commentLinkProductSpan = new CommentLinkProductSpan(iIntValue2, textExtraStruct);
                                    if (!TextUtils.isEmpty(textExtraStruct.getProductSchema())) {
                                        commentLinkProductSpan.clickListener = this.LLLJ;
                                    }
                                    commentLinkProductSpan.tf = C19736612Jw.LIZ(C12MF.MEDIUM.getFONT_NAME());
                                    C786410Ut5.p2(spannableString, commentLinkProductSpan, start, end, 18);
                                }
                            } else {
                                int i3 = end + 1;
                                if (i3 > spannableString.length()) {
                                    i3 = end;
                                }
                                if (this.LLLLIILLL != null) {
                                    if (!C0CPF.LIZ() && !((Boolean) C18054075g.LIZ.getValue()).booleanValue()) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    if (z2) {
                                        C786410Ut5.p2(spannableString, new C419890GdH(this.LLLLIILLL, 3), end, i3, 33);
                                    }
                                }
                                C786410Ut5.p2(spannableString, new C1353380lK4(this, this.LLLJIL, textExtraStruct, this.LLLLII), start, i3, 33);
                                if (textExtraStruct.isBoldText()) {
                                    i = 82;
                                } else {
                                    i = 81;
                                }
                                C786410Ut5.p2(spannableString, new C444920HcY(i, true), start, i3, 33);
                            }
                        } else {
                            final InterfaceC1353430lK9 interfaceC1353430lK92 = this.LLLIZZ;
                            final float f = this.LLLLIIL;
                            final int i4 = this.LLLLIIIILLL;
                            AbstractC1353420lK8 abstractC1353420lK82 = new AbstractC1353420lK8(interfaceC1353430lK92, textExtraStruct, f, i4) { // from class: X.0lK6
                                public final InterfaceC1353430lK9 LLILLL;
                                public final TextExtraStruct LLILZ;
                                public final float LLILZIL;
                                public final int LLILZLL;

                                @Override // android.text.style.ClickableSpan
                                public final void onClick(View view) {
                                    InterfaceC1353430lK9 interfaceC1353430lK93;
                                    if (!C0OBG.LIZIZ(view) && (interfaceC1353430lK93 = this.LLILLL) != null) {
                                        interfaceC1353430lK93.LIZ(view, this.LLILZ);
                                    }
                                }

                                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                public final void updateDrawState(TextPaint textPaint) {
                                    int iLIZ3 = this.LLILZLL;
                                    if (this.LL) {
                                        iLIZ3 = C1353410lK7.LIZ(this.LLILZIL, iLIZ3);
                                    }
                                    textPaint.setColor(iLIZ3);
                                    textPaint.setUnderlineText(false);
                                }

                                {
                                    this.LLILLL = interfaceC1353430lK92;
                                    this.LLILZ = textExtraStruct;
                                    this.LLILZIL = f;
                                    this.LLILZLL = i4;
                                }
                            };
                            abstractC1353420lK82.LLILLJJLI = true;
                            C786410Ut5.p2(spannableString, abstractC1353420lK82, start, end, 33);
                            C786410Ut5.p2(spannableString, new C444920HcY(this.LLLLIILL, true), start, end, 33);
                        }
                    }
                }
            }
        }
        return spannableString;
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LIZ(e);
        }
    }

    @Override // com.bytedance.tux.input.TuxTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        Spannable spannable;
        super.setText(charSequence, bufferType);
        CharSequence text = getText();
        if (C1347610lAl.LIZLLL() && (text instanceof Spannable) && (spannable = (Spannable) text) != null) {
            C089E c089e = new C089E(spannable.getSpans(0, spannable.length(), C416690GVn.class));
            while (c089e.hasNext()) {
                spannable.removeSpan(c089e.next());
            }
            for (int length = spannable.length() - 1; 1 < length; length--) {
                if (spannable.charAt(length) == '\n') {
                    int i = length - 1;
                    if (spannable.charAt(i) == 8203 && spannable.charAt(length - 2) == '\n') {
                        final int iLIZ = C0HD5.LIZ(this, 8);
                        C786410Ut5.o2(spannable, new LineHeightSpan(iLIZ) { // from class: X.0GVn
                            public final int LL;

                            {
                                this.LL = iLIZ;
                            }

                            @Override // android.text.style.LineHeightSpan
                            public final void chooseHeight(CharSequence charSequence2, int i2, int i3, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
                                int i6;
                                int i7 = fontMetricsInt.descent;
                                int i8 = fontMetricsInt.ascent;
                                int i9 = i7 - i8;
                                if (i9 <= 0 || (i6 = this.LL - i9) == 0) {
                                    return;
                                }
                                int i10 = i6 / 2;
                                int i11 = i8 - i10;
                                fontMetricsInt.ascent = i11;
                                fontMetricsInt.top = i11;
                                int i12 = i7 + (i6 - i10);
                                fontMetricsInt.descent = i12;
                                fontMetricsInt.bottom = i12;
                            }
                        }, i, length, 33);
                    }
                }
            }
            postInvalidate();
            requestLayout();
        }
    }

    public final void LJJLIIIIJ(CharSequence charSequence, List<? extends TextExtraStruct> list, String str, Comment comment, boolean z, C1353740lKe c1353740lKe) {
        ArrayList arrayList;
        SpannableString spannableStringLJJLIIIJILLIZJL;
        int length;
        if (!z && (list != null || (comment != null && (list = C1342220l24.LIZ(comment, null, null, getContext())) != null))) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((TextExtraStruct) it2.next()).getType() == 6 && this.LLLLIILLL == null) {
                    this.LLLLIILLL = C420350Ge1.LIZ(getContext());
                }
            }
        }
        if (charSequence == null && (comment == null || (charSequence = comment.getText()) == null)) {
            spannableStringLJJLIIIJILLIZJL = null;
        } else if (arrayList == null) {
            spannableStringLJJLIIIJILLIZJL = new SpannableString(charSequence);
        } else {
            spannableStringLJJLIIIJILLIZJL = LJJLIIIJILLIZJL(charSequence, arrayList);
        }
        if (spannableStringLJJLIIIJILLIZJL != null) {
            if (str != null) {
                int length2 = spannableStringLJJLIIIJILLIZJL.length();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableStringLJJLIIIJILLIZJL);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(' ');
                sbLIZ.append(str);
                spannableStringBuilder.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ));
                int length3 = spannableStringBuilder.length();
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, getContext());
                if (numLIZJ != null) {
                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), length2, length3, 18);
                }
                C786410Ut5.q2(spannableStringBuilder, new C444920HcY(71, false), length2, length3, 18);
                spannableStringLJJLIIIJILLIZJL = new SpannableString(spannableStringBuilder);
            }
        } else {
            spannableStringLJJLIIIJILLIZJL = null;
        }
        if (C1347610lAl.LIZLLL() && spannableStringLJJLIIIJILLIZJL != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringLJJLIIIJILLIZJL);
            for (int length4 = spannableStringBuilder2.length() - 1; -1 < length4; length4--) {
                if (spannableStringBuilder2.charAt(length4) == '\n') {
                    spannableStringBuilder2.insert(length4 + 1, (CharSequence) "\u200b\n");
                }
            }
            spannableStringLJJLIIIJILLIZJL = SpannableString.valueOf(spannableStringBuilder2);
        }
        if (C1353700lKa.LIZ()) {
            setEnableCollapsed(true);
            LJJJJLI(spannableStringLJJLIIIJILLIZJL, comment, c1353740lKe);
        } else {
            setEnableCollapsed(false);
            setText(spannableStringLJJLIIIJILLIZJL);
        }
        C1360520lVa c1360520lVa = new C1360520lVa();
        if (!ComplianceServiceProvider.LJIIJJI().LJIIIZ() && arrayList != null) {
            Iterator it3 = arrayList.iterator();
            boolean z2 = false;
            while (it3.hasNext()) {
                if (((TextExtraStruct) it3.next()).getType() == 6) {
                    z2 = true;
                }
            }
            if (z2 && C444960Hcc.LIZIZ()) {
                if (comment != null && C1345700l7g.LIZLLL(comment) == 1 && comment.isAuthorPin()) {
                    CharSequence commentText = getCommentText();
                    if (commentText != null) {
                        c1360520lVa.LIZ.append(commentText.subSequence(0, 1));
                        CharSequence commentText2 = getCommentText();
                        if (commentText2 != null) {
                            length = commentText2.length();
                        } else {
                            length = 1;
                        }
                        c1360520lVa.LIZLLL(commentText.subSequence(1, length));
                    }
                } else {
                    CharSequence commentText3 = getCommentText();
                    if (commentText3 != null) {
                        c1360520lVa.LIZLLL(commentText3);
                    }
                }
                if (C1353700lKa.LIZ()) {
                    LJJJJLI(c1360520lVa.LIZ, null, c1353740lKe);
                } else {
                    setText(c1360520lVa.LIZ);
                }
            }
        }
    }
}
